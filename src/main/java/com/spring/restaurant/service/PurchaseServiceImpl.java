package com.spring.restaurant.service;

import com.spring.restaurant.deo.ClientRepository;
import com.spring.restaurant.dto.PurchaseRequest;
import com.spring.restaurant.dto.PurchaseResponse;
import com.spring.restaurant.model.RequestOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
@Service
public class PurchaseServiceImpl implements PurchaseService{

    private ClientRepository clientRepository;

    @Autowired
    public PurchaseServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse addRequestOrder(PurchaseRequest purchases) {

        RequestOrder requestOrder=purchases.getRequestOrder();

        String myCode=getCode();
        requestOrder.setCode(myCode);


        requestOrder.setItems(purchases.getItems());
        purchases.getItems().forEach(item -> item.setRequestOrder(requestOrder));
        requestOrder.setFromAddress(purchases.getFromAddress());
        requestOrder.setToAddress(purchases.getToAddress());

        Set<RequestOrder> requestOrders=new HashSet<>();
        requestOrders.add(requestOrder);
        purchases.getClient().setRequestOrders(requestOrders);
        requestOrder.setClient(purchases.getClient());
        clientRepository.save(purchases.getClient());

        return new PurchaseResponse(purchases.getClient().getName(),myCode);
    }

    private String getCode() {
      return   UUID.randomUUID().toString();
    }
}

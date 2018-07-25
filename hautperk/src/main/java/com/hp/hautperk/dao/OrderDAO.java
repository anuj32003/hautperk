package com.hp.hautperk.dao;

import java.util.List;

import com.hp.hautperk.model.CartInfo;
import com.hp.hautperk.model.OrderDetailInfo;
import com.hp.hautperk.model.OrderInfo;
import com.hp.hautperk.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}
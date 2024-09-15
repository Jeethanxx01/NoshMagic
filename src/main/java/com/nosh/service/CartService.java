package com.nosh.service;

import com.nosh.model.Cart;
import com.nosh.model.CartItem;
import com.nosh.model.User;
import com.nosh.request.AddCartItemRequest;

public interface CartService {

    public CartItem addItemToCart(AddCartItemRequest req, String jwt)throws Exception;

    public CartItem updateCartItemQuantity(Long CartItem,int quantity)throws Exception;

    public Cart removeItemFromCart(Long CartItemId, String jwt)throws Exception;

    public Long calculateCartTotals(Cart cart)throws Exception;

    public Cart findCartById(Long id)throws Exception;

    public Cart findCartByUserId(Long userId)throws Exception;

    public Cart clearCart(Long userid)throws Exception;

}

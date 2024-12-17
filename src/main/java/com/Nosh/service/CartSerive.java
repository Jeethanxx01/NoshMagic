package com.Nosh.service;

import com.Nosh.Exception.CartException;
import com.Nosh.Exception.CartItemException;
import com.Nosh.Exception.FoodException;
import com.Nosh.Exception.UserException;
import com.Nosh.model.Cart;
import com.Nosh.model.CartItem;
import com.Nosh.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}

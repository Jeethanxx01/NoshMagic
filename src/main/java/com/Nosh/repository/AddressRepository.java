package com.Nosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nosh.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

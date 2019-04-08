package com.capgemini.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.beans.Customer;

public interface WalletRepo extends JpaRepository<Customer, String> {
		
}

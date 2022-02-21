package com.homework2.app.dao;

import com.homework2.app.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends JpaRepository <Address, Long>{
}

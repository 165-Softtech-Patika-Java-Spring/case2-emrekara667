package com.homework2.app.dao;

import com.homework2.app.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetDao extends JpaRepository<Street, Long> {
}

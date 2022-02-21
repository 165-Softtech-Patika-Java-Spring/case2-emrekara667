package com.homework2.app.dao;

import com.homework2.app.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodDao extends JpaRepository<Neighborhood, Long> {

}

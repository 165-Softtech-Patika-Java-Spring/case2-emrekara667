package com.homework2.app.dao;

import com.homework2.app.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TownDao extends JpaRepository<Town, Long> {
}

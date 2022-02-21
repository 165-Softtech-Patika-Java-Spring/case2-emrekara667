package com.homework2.app.dao;

import com.homework2.app.entity.Province;
import com.homework2.app.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ref.PhantomReference;
import java.util.List;

public interface TownDao extends JpaRepository<Town, Long> {


}

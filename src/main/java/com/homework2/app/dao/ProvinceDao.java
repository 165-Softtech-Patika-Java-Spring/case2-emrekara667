package com.homework2.app.dao;

import com.homework2.app.entity.Province;
import com.homework2.app.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProvinceDao extends JpaRepository<Province, Long> {

    List<Province> findByPlateCode(Long plateCode);


}

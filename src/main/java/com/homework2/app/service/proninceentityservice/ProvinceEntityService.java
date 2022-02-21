package com.homework2.app.service.proninceentityservice;

import com.homework2.app.dao.ProvinceDao;
import com.homework2.app.entity.Province;
import com.homework2.app.entity.Town;
import com.homework2.app.enums.ErrorMessage;
import com.homework2.app.gen.exceptions.ItemNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.management.OperatingSystemMXBean;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProvinceEntityService {

    private final ProvinceDao provinceDao;

    public Province save(Province province) {
        return provinceDao.save(province);
    }

    public List<Province> getByPlateCode(Long plateCode) {

        return provinceDao.findByPlateCode(plateCode);

    }


    public List<Province> findAll() {
        return provinceDao.findAll();
    }


}

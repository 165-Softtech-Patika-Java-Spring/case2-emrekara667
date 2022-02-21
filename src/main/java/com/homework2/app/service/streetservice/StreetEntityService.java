package com.homework2.app.service.streetservice;

import com.homework2.app.dao.StreetDao;
import com.homework2.app.entity.Street;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StreetEntityService {

    private final StreetDao streetDao;

    public Street save(Street street) {
       return streetDao.save(street);
    }
}

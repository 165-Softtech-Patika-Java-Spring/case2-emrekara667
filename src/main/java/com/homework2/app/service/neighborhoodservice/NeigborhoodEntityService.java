package com.homework2.app.service.neighborhoodservice;

import com.homework2.app.dao.NeighborhoodDao;
import com.homework2.app.entity.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NeigborhoodEntityService {

    private final NeighborhoodDao neighborhoodDao;

    public Neighborhood save(Neighborhood neighborhood) {
        return neighborhoodDao.save(neighborhood);
    }

    public boolean existsById(Long id){
        return neighborhoodDao.existsById(id);
    }
}

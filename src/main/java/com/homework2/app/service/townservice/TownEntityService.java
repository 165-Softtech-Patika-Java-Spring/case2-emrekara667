package com.homework2.app.service.townservice;

import com.homework2.app.dao.TownDao;
import com.homework2.app.entity.Province;
import com.homework2.app.entity.Town;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TownEntityService {

    private final TownDao townDao;

    public Town save(Town town) {
        return townDao.save(town);
    }


}

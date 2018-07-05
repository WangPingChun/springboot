package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author : WangPingChun
 * 2018-07-05
 */
@Service
public class GirlService {
    private final GirlRepository girlRepository;

    @Autowired
    public GirlService(GirlRepository girlRepository) {
        this.girlRepository = girlRepository;
    }

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(20);

        Girl girlB = new Girl();
        girlB.setCupSize("BBB");
        girlB.setAge(21);

        girlA = girlRepository.save(girlA);
        girlB = girlRepository.save(girlB);
    }
}

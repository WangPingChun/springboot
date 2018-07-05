package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : WangPingChun
 * 2018-07-05
 */
@RestController
public class GirlController {
    private final GirlRepository girlRepository;
    private final GirlService girlService;

    @Autowired
    public GirlController(GirlRepository girlRepository, GirlService girlService) {
        this.girlRepository = girlRepository;
        this.girlService = girlService;
    }

    @GetMapping("/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    @GetMapping("/girls/age/{age}")
    public List<Girl> findByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    @PostMapping("/girls")
    public Girl saveGirl(@RequestParam("age") Integer age,
                         @RequestParam("cupSize") String cupSize) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    @GetMapping("/girls/{id}")
    public Girl getGirl(@PathVariable Integer id) {
        return girlRepository.findById(id).get();
    }

    @PutMapping("/girls/{id}")
    public Girl updateGirl(@PathVariable Integer id,
                           @RequestParam("age") Integer age,
                           @RequestParam("cupSize") String cupSize) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    @DeleteMapping("/girls/{id}")
    public void deleteGirl(@PathVariable Integer id) {
        girlRepository.deleteById(id);
    }

    @PostMapping("/girls/two")
    public void insertTwo() {
        girlService.insertTwo();
    }
}

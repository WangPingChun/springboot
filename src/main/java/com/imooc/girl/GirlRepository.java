package com.imooc.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : WangPingChun
 * 2018-07-05
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    /**
     * 根据年龄查询.
     *
     * @param age 年龄
     * @return 查询到的Girl集合
     */
    List<Girl> findByAge(Integer age);
}

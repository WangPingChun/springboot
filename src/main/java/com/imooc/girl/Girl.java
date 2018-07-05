package com.imooc.girl;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author : WangPingChun
 * 2018-07-05
 */
@Getter
@Setter
@Entity
public class Girl implements Serializable {
    private static final long serialVersionUID = -7675720945311567232L;
    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;
    private Integer age;
}

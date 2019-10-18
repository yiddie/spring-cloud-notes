package com.yiddie.cloud.microservices.model.cloud;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private String gender;

    private Integer age;

    private static final long serialVersionUID = 1L;
}
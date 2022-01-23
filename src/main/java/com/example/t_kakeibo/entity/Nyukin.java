package com.example.t_kakeibo.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Nyukin {

    @Id
    private int nyukinId;

    private int nyukingaku;
}

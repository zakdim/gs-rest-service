package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by dmitri on 2020-11-30.
 */
@AllArgsConstructor
@Getter
public class Greeting {

    private final long id;
    private final String content;
}

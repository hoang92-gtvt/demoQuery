package com.example.demo.dto.response;

import lombok.Data;

@Data
public class MessageRespone {
    private String name;

    public MessageRespone() {
    }

    public MessageRespone(String name) {
        this.name = name;
    }
}

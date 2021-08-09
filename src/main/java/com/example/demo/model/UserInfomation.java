package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class UserInfomation {

    @Id
    private Long userId;

    private String fullName;

    private LocalDate dateOfBirth;

    private Boolean gender=false;

    private Double height;

    private Double weight;

    private String hobbies;

    private String description;

    private String facebookLink;

    private Double priceByHour=0.0;
}

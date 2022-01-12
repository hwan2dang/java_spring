package com.example.person.domain;

import com.example.person.models.PersonRequestDto;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Person extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String address;


    // Getter
    public Long getId() {
        return this.id;
    }
    // Getter
    public String getName() {
        return this.name;
    }
    // Getter
    public int getAge() {
        return this.age;
    }
    // Getter
    public String getAddress() {
        return this.address;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
    }

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
    }
}

//java로 쓰여진 person 클래스를 DB가 이해하는 sql 언어로 변환시켜주는 JPA클래스를 상속받은 인터페이스(메소드만 속성으로 가진 클래스)

package com.example.person.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}


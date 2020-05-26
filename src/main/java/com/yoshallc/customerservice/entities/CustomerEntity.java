package com.yoshallc.customerservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "Customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name="sex")
    private String sex;

    public CustomerEntity(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }
}

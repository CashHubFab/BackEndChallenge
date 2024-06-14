package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Shopkeepers")
public class Shopkeeper {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="fullName", length=50, nullable=false)
    private String fullName;

    @Column(name="cnpj", length=50, nullable=false, unique = true)
    private String cnpj;

    @Column(name="email", length=50, nullable=false, unique = true)
    private String email;

    @Column(name="password", length=50, nullable=false)
    private String password;

    @Column(name="balance", nullable = false)
    private Double balance;

    @OneToMany(mappedBy = "payee")
    private List<Transaction> transactionsAsPayee;

}

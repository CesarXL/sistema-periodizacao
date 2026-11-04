package com.system.system.entity;

import com.system.system.entity.enums.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "treino")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_treino")
    private UUID id_treino;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private String cor;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

}

package com.system.system.entity;

import com.system.system.entity.enums.Intensidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "exercicio_note", uniqueConstraints = {
        @UniqueConstraint(
                columnNames = {"id_periodizacao_treino", "id_exercio_treino"}
        )
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExercicioNote {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_note")
    private UUID idNote;

    @Column(columnDefinition = "TEXT")
    private String anotacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Intensidade intensidade;

    @ManyToOne
    @JoinColumn(name = "id_periodizacao_treino", nullable = false)
    private PeriodizacaoTreino periodizacaoTreino;
    @ManyToOne
    @JoinColumn(name = "id_exercicio_treino", nullable = false)
    private ExercicioTreino exercicioTreino;

}

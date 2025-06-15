package dev.java10x.cadastrodeninjas.Missoes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String dificuldade;


    @JsonIgnore
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}

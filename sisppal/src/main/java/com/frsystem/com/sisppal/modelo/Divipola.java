package com.frsystem.com.sisppal.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "SISP_T002_DIVIPOLA")
public class Divipola implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="A002CODIGO", nullable = false, insertable = false)
    Integer idDivipola;

    @Column(name="A002CODDEPTO")
    String codDepto;

    @Column(name="A002NOMDEPTO")
    String nomDepto;

    @Column(name="A002CODMUNCP")
    String codMunicipio;

    @Column(name="A002NOMMUNCP")
    String nomMunicipio;
}

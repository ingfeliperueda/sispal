package com.frsystem.com.sisppal.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "PART_T102_TIPDOC")
public class TipoDoc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="A102CODIGO", nullable = false, insertable = false)
    Integer idTipoDoc;

    /*@OneToOne(mappedBy = "tipoDoc", cascade = CascadeType.ALL)
    Persona persona;*/

    @Column(name="A102TIPODOCMNT")
    String tipoDoc;

    @Column(name="A102DESCTIPDOCMNT")
    String descTipoDoc;

    @Column(name = "A102ESTDREGSTR")
    String estadoReg;

    @Column(name = "A102FECHACREACION")
    Date fechaCrea;

    @Column(name = "A102FECHMODFCCN")
    Date fechaModif;

    @Column(name = "A102USRCREACION")
    String usuCrea;

    @Column(name = "A102USRMODFCCN")
    String usuModif;

}

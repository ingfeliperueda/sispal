package com.frsystem.com.sisppal.repositorio;

import com.frsystem.com.sisppal.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

}

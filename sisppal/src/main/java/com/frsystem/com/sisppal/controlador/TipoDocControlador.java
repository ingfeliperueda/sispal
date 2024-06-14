package com.frsystem.com.sisppal.controlador;

import com.frsystem.com.sisppal.modelo.TipoDoc;
import com.frsystem.com.sisppal.servicio.TipoDoc.TipoDocServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("siaf-app")
@CrossOrigin(value = "http://localhost:4200")
public class TipoDocControlador {

    private static final Logger logger = LoggerFactory.getLogger(TipoDocControlador.class);

    @Autowired
    private TipoDocServicio tipoDocServicio;

    @GetMapping("/tipodoc")
    public List<TipoDoc> obtenerTipoDoc(){
        List<TipoDoc> tipoDocs = this.tipoDocServicio.listarTipoDoc();
        logger.info("Tipos de Documento obtenidos:");
        tipoDocs.forEach((tipoDoc -> logger.info(tipoDoc.toString())));
        return tipoDocs;
    }

    @PostMapping("/tipoDoc")
        public TipoDoc agregarTipoDoc(@RequestBody TipoDoc tipoDoc){
        logger.info("Tipo de Documento a agregar: " + tipoDoc);
        return this.tipoDocServicio.guardarTipoDoc(tipoDoc);
    }
}

package com.frsystem.com.sisppal.servicio.TipoDoc;

import com.frsystem.com.sisppal.modelo.TipoDoc;
import com.frsystem.com.sisppal.repositorio.TipoDocRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocServicio implements ITipoDocServicio {

    @Autowired
    private TipoDocRepositorio tipoDocRepositorio;

    @Override
    public List<TipoDoc> listarTipoDoc() {
        return this.tipoDocRepositorio.findAll();
    }

    @Override
    public TipoDoc guardarTipoDoc(TipoDoc tipoDoc) {
        return this.tipoDocRepositorio.save(tipoDoc);
    }
}

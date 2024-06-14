package com.frsystem.com.sisppal.servicio.TipoDoc;

import com.frsystem.com.sisppal.modelo.TipoDoc;

import java.util.List;

public interface ITipoDocServicio {

    public List<TipoDoc> listarTipoDoc();

    public TipoDoc guardarTipoDoc(TipoDoc tipoDoc);
}

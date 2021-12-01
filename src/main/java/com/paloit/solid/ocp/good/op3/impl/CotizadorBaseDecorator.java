package com.paloit.solid.ocp.good.op3.impl;

import com.paloit.solid.ocp.good.op3.Cotizador;
import com.paloit.solid.ocp.good.op3.CotizarRequest;

public class CotizadorBaseDecorator implements Cotizador {

    private final Cotizador cotizador;

    public CotizadorBaseDecorator(Cotizador cotizador) {
        this.cotizador = cotizador;
    }

    @Override
    public void cotizar(CotizarRequest request) {
        System.out.println("Procesos iniciales aplicables a todos los decoradores");
        this.cotizador.cotizar(request);
        System.out.println("Procesos finales aplicables a todos los decoradores");
    }

}

package com.paloit.solid.ocp.good.op2.impl;

import com.paloit.solid.ocp.good.op2.Cotizador;
import com.paloit.solid.ocp.good.op2.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class CotizadorMotos extends AbstractCotizador implements Cotizador {

    @Override
    List<Proveedor> obtenerProveedores() {
        // TODO: Obtener proveedores filtrado por motos
        System.out.println("Método plantilla -  motos");
        return new ArrayList<>();
    }

}

package com.paloit.solid.ocp.good.op2.impl;

import com.paloit.solid.ocp.good.op2.InfoCotizacion;
import com.paloit.solid.ocp.good.op2.Proveedor;

import java.util.List;

public abstract class AbstractCotizador {

    public void cotizar(InfoCotizacion cotizador) {
        // TODO: Proceso comun a todos los cotizadores
        System.out.println("Logica comun a todos los cotizadores.");
        List<Proveedor> proveedores = obtenerProveedores();
        procesar(proveedores);
    }

    // Método plantilla que se sobreescribe según el tipo de cotización a implementar.
    abstract List<Proveedor> obtenerProveedores();

    void procesar(List<Proveedor> proveedores) {
        // TODO
    }

}

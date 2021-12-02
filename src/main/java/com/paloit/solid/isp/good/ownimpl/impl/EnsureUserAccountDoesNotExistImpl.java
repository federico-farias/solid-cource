package com.paloit.solid.isp.good.ownimpl.impl;

import com.paloit.solid.isp.good.ownimpl.EnsureUserAccountDoesNotExist;

// Refleja que su rol es asegurarse que no existe otra cuenta con el mismo email (Roleinterfaces)
public class EnsureUserAccountDoesNotExistImpl implements EnsureUserAccountDoesNotExist {

    @Override
    public void ensure(String email) {
        // TODO: Lanza excepción si el email ya existe.
    }

}

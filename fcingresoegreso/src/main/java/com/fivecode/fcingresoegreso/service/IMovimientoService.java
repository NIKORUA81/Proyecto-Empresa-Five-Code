package com.fivecode.fcingresoegreso.service;

import com.fivecode.fcingresoegreso.entity.MovimientoDinero;

import java.util.List;

public interface IMovimientoService {

    public MovimientoDinero findById(long id);

    public List<MovimientoDinero> findAll();

    public MovimientoDinero createMovimiento(MovimientoDinero movimiento);

    public MovimientoDinero updateMovimiento(long id, MovimientoDinero movimiento);

    public void deleteMovimiento(long id);
}

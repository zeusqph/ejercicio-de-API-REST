package com.std.ec.service;

import com.std.ec.model.entity.Cliente;
import org.springframework.stereotype.Service;


public interface ICliente {

    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);


}
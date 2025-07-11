package com.std.ec.service.impl;

import com.std.ec.model.dao.ClienteDAO;
import com.std.ec.model.entity.Cliente;
import com.std.ec.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Cliente cliente) {
        clienteDAO.delete(cliente);
    }
}

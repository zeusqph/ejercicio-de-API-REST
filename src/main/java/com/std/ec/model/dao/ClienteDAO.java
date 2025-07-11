package com.std.ec.model.dao;

import com.std.ec.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<Cliente,Integer>{
}

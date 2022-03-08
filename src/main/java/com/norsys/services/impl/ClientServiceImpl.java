package com.norsys.services.impl;

import com.norsys.dao.ClientDao;
import com.norsys.dao.impl.ClientDaoImpl;
import com.norsys.dto.DtoClient;
import com.norsys.models.DoClient;
import com.norsys.services.ClientService;

import java.sql.SQLException;
import java.util.List;

public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao = new ClientDaoImpl();

    @Override
    public int update(DoClient client) throws SQLException {
        return clientDao.update(client);
    }

    @Override
    public List<DoClient> getAll() throws SQLException{
            return clientDao.getAll();
    }
}

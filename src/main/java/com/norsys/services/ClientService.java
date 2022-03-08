package com.norsys.services;

import com.norsys.dto.DtoClient;
import com.norsys.models.DoClient;

import java.sql.SQLException;
import java.util.List;

public interface ClientService {

    int update(DoClient client) throws SQLException;

    List<DoClient> getAll() throws SQLException;
}

package com.norsys.dao;

import com.norsys.models.DoClient;

import java.sql.SQLException;
import java.util.List;

public interface ClientDao {
    int update(DoClient client) throws SQLException;
    List<DoClient> getAll() throws SQLException;
}

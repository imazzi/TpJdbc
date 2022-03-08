package com.norsys.dao;

import com.norsys.models.DoClient;

import java.util.List;

public interface ClientDao {
    DoClient update(DoClient client);
    List<DoClient> getAll();
}

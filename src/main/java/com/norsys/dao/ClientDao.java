package com.norsys.dao;

import com.norsys.beans.DoClient;

import java.util.List;

public interface ClientDao {
    DoClient update(DoClient client);
    List<DoClient> getAll();
}

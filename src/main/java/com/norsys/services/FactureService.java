package com.norsys.services;

import com.norsys.models.DoFacture;

import java.sql.SQLException;
import java.util.List;

public interface FactureService {
    List<DoFacture> getAll() throws SQLException;
    List<DoFacture> getFacturesByIdClient(Integer idClient) throws SQLException;
    DoFacture save(DoFacture facture) throws SQLException;
}

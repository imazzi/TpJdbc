package com.norsys.dao;

import com.norsys.beans.DoFacture;

import java.util.List;

public interface FactureDao {
    List<DoFacture> getAll();
    List<DoFacture> getFacturesByIdClient(Long idClient);
    DoFacture save(DoFacture facture);


}

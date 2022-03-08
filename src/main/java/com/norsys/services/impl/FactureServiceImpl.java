package com.norsys.services.impl;

import com.norsys.dao.FactureDao;
import com.norsys.dao.impl.FactureDaoImpl;
import com.norsys.models.DoFacture;
import com.norsys.services.FactureService;

import java.sql.SQLException;
import java.util.List;

public class FactureServiceImpl implements FactureService {
    private FactureDao factureDao = new FactureDaoImpl();

        @Override
        public List<DoFacture> getAll() throws SQLException {
            return factureDao.getAll();
        }

        @Override
        public List<DoFacture> getFacturesByIdClient(Integer idClient) throws SQLException {
            return factureDao.getFacturesByIdClient(3);
        }

        @Override
        public DoFacture save(DoFacture facture) throws SQLException {
            return factureDao.save(facture);
        }
    }


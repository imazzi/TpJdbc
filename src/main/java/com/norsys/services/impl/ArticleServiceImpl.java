package com.norsys.services.impl;

import com.norsys.dao.ArticleDao;
import com.norsys.dao.impl.ArticleDaoImpl;
import com.norsys.models.DoArticle;
import com.norsys.services.ArticleService;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    private ArticleDao articleDao ;

    public ArticleServiceImpl() {
        this.articleDao = new ArticleDaoImpl();
    }

    @Override
    public DoArticle getById(Integer idArticle) {
        return articleDao.getById(idArticle);
    }

    @Override
    public List<DoArticle> getAll() {
        return articleDao.getAll();
    }

}

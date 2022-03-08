package com.norsys.dao;

import com.norsys.models.DoArticle;

import java.util.List;

public interface ArticleDao {
    DoArticle getById();
    List<DoArticle> getAll();
    List<DoArticle> getClientArticles(Long idClient);
}

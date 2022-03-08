package com.norsys.dao;

import com.norsys.beans.DoArticle;

import java.util.List;

public interface ArticleDao {
    DoArticle getById();
    List<DoArticle> getAll();
    List<DoArticle> getClientArticles(Long idClient);
}

package com.norsys.dao;

import com.norsys.models.DoArticle;

import java.util.List;

public interface ArticleDao {
    DoArticle getById(Integer idArticle);
    List<DoArticle> getAll();
}

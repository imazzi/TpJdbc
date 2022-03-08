package com.norsys.services;

import com.norsys.models.DoArticle;

import java.util.List;

public interface ArticleService {
    DoArticle getById(Integer idArticle);
    List<DoArticle> getAll();
}

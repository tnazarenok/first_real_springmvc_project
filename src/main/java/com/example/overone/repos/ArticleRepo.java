package com.example.overone.repos;

import com.example.overone.models.ArticleModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends CrudRepository<ArticleModel, Long> {
    @Query(value = "select * from articles where id = ?1", nativeQuery = true)
    ArticleModel getById(long id);//equals findById from crud
}

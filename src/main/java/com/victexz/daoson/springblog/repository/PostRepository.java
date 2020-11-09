package com.victexz.daoson.springblog.repository;


import com.victexz.daoson.springblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

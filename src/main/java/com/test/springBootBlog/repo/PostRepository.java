package com.test.springBootBlog.repo;

import com.test.springBootBlog.Models.Post;
import org.springframework.data.repository.CrudRepository;
    public interface PostRepository extends CrudRepository<Post, Long> {
    }



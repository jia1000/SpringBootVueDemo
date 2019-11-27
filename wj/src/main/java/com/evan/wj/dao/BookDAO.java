package com.evan.wj.dao;

import com.evan.wj.pojo.Book;
import com.evan.wj.pojo.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDAO extends JpaRepository<Book,Integer> {

    // findAllByCategory() 之所以能实现，是因为在 Book 类中有如下注解：
    // @ManyToOne
    // @JoinColumn(name="cid")
    // private Category category;
    List<Book> findAllByCategory(Category category);

    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}

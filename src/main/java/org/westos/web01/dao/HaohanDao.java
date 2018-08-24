package org.westos.web01.dao;

import org.westos.web01.bean.News;
import org.westos.web01.bean.Subject;

import java.util.List;

public interface HaohanDao {
    //查询所有新闻
    List<News> listNews();
    //查询所有新闻类别
    List<Subject> listSubjects();
}

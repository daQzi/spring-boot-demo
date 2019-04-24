package com.xkcoding.neo4j.repository;

import com.xkcoding.neo4j.model.Lesson;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * <p>
 * 课程节点Repository
 * </p>
 *
 * @package: com.xkcoding.neo4j.repository
 * @description: 课程节点Repository
 * @author: wangzw
 * @date: Created in 2018-12-24 15:05
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: wangzw
 */
public interface LessonRepository extends Neo4jRepository<Lesson, String> {
}

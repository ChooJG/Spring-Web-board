package com.gdsc.webboard.question;

import com.gdsc.webboard.question.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    Question findBySubject(String subject);                             //제목으로 찾기
    Question findBySubjectAndContent(String subject, String content);   //제목과 내용으로 찾기
    List<Question> findBySubjectLike(String subject);                   //특정 문자열 포함되는 것 찾기
    Page<Question> findAll(Pageable pageable);
    Page<Question> findAll(Specification<Question> spec, Pageable pageable);






}

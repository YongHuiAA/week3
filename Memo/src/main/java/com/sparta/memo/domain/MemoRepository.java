package com.sparta.memo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<com.sparta.memo.domain.Memo, Long> {
    List<com.sparta.memo.domain.Memo> findAllByOrderByModifiedAtDesc();
}
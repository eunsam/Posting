package com.eunsam.Posting.domain.repository;

import com.eunsam.Posting.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}

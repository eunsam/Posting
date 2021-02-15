package com.eunsam.Posting.domain.repository;

import com.eunsam.Posting.domain.entity.BoardEntity;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

@Entity
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}

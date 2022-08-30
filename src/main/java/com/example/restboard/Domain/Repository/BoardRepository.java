package com.example.restboard.Domain.Repository;


import com.example.restboard.Domain.Entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
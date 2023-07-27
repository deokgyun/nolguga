package com.an.nolguga.domain.FreeBoard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FreeBoardRepository extends JpaRepository<FreeBoard, Long> {

    @Query("SELECT p FROM FreeBoard p ORDER BY p.boardNum DESC")
    List<FreeBoard> findAllDesc();

}

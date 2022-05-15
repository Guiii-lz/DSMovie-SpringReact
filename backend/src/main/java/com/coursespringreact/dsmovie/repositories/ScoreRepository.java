package com.coursespringreact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespringreact.dsmovie.entities.Score;
import com.coursespringreact.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
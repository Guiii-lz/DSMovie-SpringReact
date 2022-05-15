package com.coursespringreact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespringreact.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	
}

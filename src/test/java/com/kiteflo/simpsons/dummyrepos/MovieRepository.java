package com.kiteflo.simpsons.dummyrepos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.kiteflo.simpsons.domain.Movie;


public interface MovieRepository extends GraphRepository<Movie>
{
	@Query("start movies=node:__types__(className='Movie') " +
		   "return movies")
	public Page<Movie> findAll(Pageable page);
}

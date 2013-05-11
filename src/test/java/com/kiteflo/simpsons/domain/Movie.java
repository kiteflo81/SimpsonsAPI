package com.kiteflo.simpsons.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.support.index.IndexType;

@NodeEntity
public class Movie
{
	@GraphId
	private Long id;
	
	@Indexed(indexName="INDEX_title",indexType=IndexType.FULLTEXT)
	private String title;
}

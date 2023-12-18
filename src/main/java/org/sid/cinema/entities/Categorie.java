package org.sid.cinema.entities;

import java.util.Collection;


import jakarta.persistence.*;

import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Categorie {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	@Column(length=75)
	private String name;
	
	@OneToMany(mappedBy="categorie")
	private Collection<Film> films;

}

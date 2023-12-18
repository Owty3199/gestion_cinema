package org.sid.cinema.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Film {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(length=75)
	private String titre;
	@Column(length=75)
	private String description;
	@Column(length=75)
	private String realisateur;
	private Date dateSortie;
	private double duree;
	@Column(length=75)
	private String photo;
	
	@OneToMany(mappedBy="film")
	private Collection<Projection> projections;
	@ManyToOne()
	private Categorie categorie;

}

package org.sid.cinema.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Projection {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date dateProjection;
	private double prix;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private Film film;
	
	@OneToMany(mappedBy="projection")
	private Collection<Ticket> tickets;
	@ManyToOne
	private Seance seance;

}

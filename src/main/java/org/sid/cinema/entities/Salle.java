package org.sid.cinema.entities;

import java.util.Collection;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Salle {
	
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    @Column(length=75)
	private String name;
	private int nombrePlace;
	
	@ManyToOne
	private Cinema cinema;
	@OneToMany(mappedBy="salle")
	private Collection<Place> places;
	@OneToMany(mappedBy="salle")
	private Collection<Projection> projections;

}

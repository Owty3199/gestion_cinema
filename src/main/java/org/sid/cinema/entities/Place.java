package org.sid.cinema.entities;

import java.util.Collection;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Place {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int numero;
	private double longitude, latitide, altitude;
	
	@ManyToOne
	private Salle salle;
	
	@OneToMany(mappedBy="place")
	private Collection<Ticket> tickets;

}

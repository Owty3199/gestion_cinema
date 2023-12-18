package org.sid.cinema.entities;



import jakarta.persistence.*;

import lombok.*;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Ticket {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	@Column(length=75)
	private String nomClient;
	private double prix;
	@Column(unique=true)
	private int codePayement;
	private boolean reserve;
	@ManyToOne
	private Place place;
	@ManyToOne
	private Projection projection;
}

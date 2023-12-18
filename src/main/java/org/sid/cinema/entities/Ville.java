package org.sid.cinema.entities;

import java.util.Collection;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Ville {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length=75)
	private String name;
	private double longitude, latitude, altitude;
	@OneToMany(mappedBy="ville")
	private Collection<Cinema> cinemas;

}

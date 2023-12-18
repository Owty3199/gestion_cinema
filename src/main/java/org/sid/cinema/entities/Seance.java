package org.sid.cinema.entities;


import java.util.*;

import jakarta.persistence.*;

import lombok.*;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Seance {
	
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date heureDebut;

}

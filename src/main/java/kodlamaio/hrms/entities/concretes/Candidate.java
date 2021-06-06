package kodlamaio.hrms.entities.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "candidates")
public class Candidate extends User {
	
	
	//@Column(name ="id")
	//private int id;
	
	
	@Column(name ="first_name")
	@NotNull
	@NotBlank
	private String firstName;
	
	
	@Column(name ="last_name")
	@NotNull
	@NotBlank
	private String lastName;
	
	
	@Column(name ="identity_number")
	@NotNull
	@NotBlank
	private String identityNumber;
	
	
	@Column(name ="birth_date")
	@NotNull
	@Past
	private LocalDate birthDate;

	
	
	
}

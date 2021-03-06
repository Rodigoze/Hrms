package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "employees")
public class Employee extends User{
	
	
	
	
	
	@Column (name = "first_name")
	@NotNull
	@NotBlank
	private String firstName;
	
	@Column (name = "last_name")
	@NotNull
	@NotBlank
	private String lastName;
	
	
	
	
	

	

}

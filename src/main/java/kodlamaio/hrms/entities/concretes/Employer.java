package kodlamaio.hrms.entities.concretes;




import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
@Table(name = "employers")
public class Employer extends User{
	
    
	@Column(name = "company_name")
	@NotNull
	@NotBlank
	private String companyName;
	
	@Column(name = "web_address")
	@NotNull
	@NotBlank
	private String webAddress;
	
	@Column(name = "phone_number")
	@NotNull
	@NotBlank
	private String phoneNumber;
	
	
	
	


}

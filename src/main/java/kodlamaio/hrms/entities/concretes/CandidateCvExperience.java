package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidate_cv_experiences")
public class CandidateCvExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JoinColumn(name="candidate_cv_id")
	@ManyToOne
	@NotNull
	private CandidateCv candidateCv;
	
	@JoinColumn(name="job_position_id")
	@ManyToOne
	@NotNull
	private JobPosition jobPosition;
	
	@Column(name="workplace_name")
	private String workplaceName;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="quit_date")
	private LocalDate quitDate;

}

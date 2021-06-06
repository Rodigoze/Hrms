package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidate_cv_languages")
public class CandidateCvLanguage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JoinColumn(name="candidate_cv_id")
	@ManyToOne()
	@NotNull
	private CandidateCv candidateCv;
	
	@JoinColumn(name="language_id")
	@ManyToOne
	@NotNull
	private Language language;
	
	@Column(name="level")
	@Range(min=1 , max=5)
	private int level;

}

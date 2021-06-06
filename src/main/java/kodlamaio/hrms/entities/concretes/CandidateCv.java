package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidate_cvs")
public class CandidateCv {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JoinColumn(name="candidate_id")
	@OneToOne
	private Candidate candidate;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@OneToMany(mappedBy="candidateCv")
	@JsonIgnore()
	private List<CandidateCvEducation> educations;
	
	@OneToMany(mappedBy="candidateCv")
	@JsonIgnore
	private List<CandidateCvExperience> experiences;
	
	@OneToMany(mappedBy="candidateCv")
	@JsonIgnore()
	private List<CandidateCvLanguage> languages;
	
	@OneToMany(mappedBy="candidateCv")
	@JsonIgnore()
	private List<CandidateCvSkill> skills;
	

}

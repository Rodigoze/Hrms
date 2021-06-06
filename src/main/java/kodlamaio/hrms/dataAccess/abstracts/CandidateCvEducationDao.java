package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CandidateCvEducation;

public interface CandidateCvEducationDao extends JpaRepository<CandidateCvEducation,Integer> {
	
	List<CandidateCvEducation> getBySchoolName(String schoolName);

}

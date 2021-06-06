package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateCvEducation;

public interface CandidateCvEducationService {
	
	Result add(CandidateCvEducation candidateCvEducation);
	Result delete(CandidateCvEducation candidateCvEducation);
	DataResult<List<CandidateCvEducation>> getBySchoolName(String schoolName);

}

package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateCvExperience;

public interface CandidateCvExperienceService {
	
	Result add(CandidateCvExperience candidateCvExperience);
	DataResult<List<CandidateCvExperience>> getByWorkplaceName(String workplaceName);

}

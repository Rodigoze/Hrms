package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCvExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateCvExperienceDao;
import kodlamaio.hrms.entities.concretes.CandidateCvExperience;

@Service
public class CandidateCvExperienceManager implements CandidateCvExperienceService {
	
	@Autowired
	private CandidateCvExperienceDao candidateCvExperienceDao;
 
	public CandidateCvExperienceManager(CandidateCvExperienceDao candidateCvExperienceDao) {
		super();
		this.candidateCvExperienceDao = candidateCvExperienceDao;
	}

	@Override
	public Result add(CandidateCvExperience candidateCvExperience) {
		this.candidateCvExperienceDao.save(candidateCvExperience);
		return new SuccessResult("experience added");
	}

	@Override
	public DataResult<List<CandidateCvExperience>> getByWorkplaceName(String workplaceName) {
		
		return new SuccessDataResult<List<CandidateCvExperience>>(this.candidateCvExperienceDao.getByWorkplaceName(workplaceName));
	}



}

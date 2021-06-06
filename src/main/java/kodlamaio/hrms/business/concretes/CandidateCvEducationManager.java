package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCvEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateCvEducationDao;
import kodlamaio.hrms.entities.concretes.CandidateCvEducation;

@Service
public class CandidateCvEducationManager implements CandidateCvEducationService {
	
	private CandidateCvEducationDao candidateCvEducationDao;

	@Autowired
	public CandidateCvEducationManager(CandidateCvEducationDao candidateCvEducationDao) {
		super();
		this.candidateCvEducationDao = candidateCvEducationDao;
	}

	@Override
	public Result add(CandidateCvEducation candidateCvEducation) {
		this.candidateCvEducationDao.save(candidateCvEducation);
		return new SuccessResult("candidateCvEducation added");
	}

	@Override
	public Result delete(CandidateCvEducation candidateCvEducation) {
		this.candidateCvEducationDao.delete(candidateCvEducation);
		return new SuccessResult("candidateCvEducation deleted");
	}

	@Override
	public DataResult<List<CandidateCvEducation>> getBySchoolName(String schoolName) {
	
		return new SuccessDataResult<List<CandidateCvEducation>>(this.candidateCvEducationDao.getBySchoolName(schoolName));
	}

}

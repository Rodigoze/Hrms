package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCvSkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateCvSkillsDao;
import kodlamaio.hrms.entities.concretes.CandidateCvSkill;

@Service
public class CandidateCvSkillManager implements CandidateCvSkillService {
	
	private CandidateCvSkillsDao candidateCvSkillDao;
	

	@Autowired
	public CandidateCvSkillManager(CandidateCvSkillsDao candidateCvSkillDao) {
		super();
		this.candidateCvSkillDao = candidateCvSkillDao;
	}


	@Override
	public Result add(CandidateCvSkill candidateCvSkill) {
		this.candidateCvSkillDao.save(candidateCvSkill);
		return new SuccessResult("skill added");
	}

	
	@Override
	public DataResult<List<CandidateCvSkill>> getByCandidateCv_Id(int candidateCvId) {
		
		return new SuccessDataResult<List<CandidateCvSkill>>(this.candidateCvSkillDao.getByCandidateCv_Id(candidateCvId));
	}

	
}

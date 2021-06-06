package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms.entities.concretes.JobAdvert;
import kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertDto;


@Service
public class JobAdvertManager implements JobAdvertService {
	
	private JobAdvertDao jobAdvertDao;
	
    @Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}
    
    public Result add(JobAdvert jobAdvert) {
    	this.jobAdvertDao.save(jobAdvert);
    	return new SuccessResult("Job advert added");
    }
    
    public Result delete(JobAdvert jobAdvert) {
    	this.jobAdvertDao.delete(jobAdvert);
    	return new SuccessResult("Job advert deleted");
    }


	@Override
	public DataResult<List<EmployerWithJobAdvertDto>> getEmployerWithJobAdvertDetails(String companyName,int maxSalary) {
		return new SuccessDataResult<List<EmployerWithJobAdvertDto>>(this.jobAdvertDao.getEmployerWithJobAdvertDetails(companyName, maxSalary),"Data listelendi.");
	}

}

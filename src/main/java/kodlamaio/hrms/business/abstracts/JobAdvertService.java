package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;
import kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertDto;


public interface JobAdvertService {
	
	Result add(JobAdvert jobAdvert);

	DataResult<List<EmployerWithJobAdvertDto>> getEmployerWithJobAdvertDetails(String companyName,int maxSalary);
	
	

}

package kodlamaio.hrms.business.abstracts;




import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateCv;

public interface CandidateCvService {
	
	Result add(CandidateCv candidateCv);
	Result delete(CandidateCv candidateCv);
	
	DataResult<List<CandidateCv>> getById(int id);
	


}

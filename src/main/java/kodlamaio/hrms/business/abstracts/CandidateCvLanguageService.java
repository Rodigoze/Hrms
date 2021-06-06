package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateCvLanguage;

public interface CandidateCvLanguageService {
	
	Result add(CandidateCvLanguage candidateCvLanguage);
	DataResult<List<CandidateCvLanguage>> getByLanguage_Name(String name);

}

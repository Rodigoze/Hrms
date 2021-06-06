package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCvLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CandidateCvLanguage;

@RestController
@RequestMapping("/api/candidatecvlanguage")
public class CandidateCvLanguagesController {
	
	private CandidateCvLanguageService candidateCvLanguageService;

	@Autowired
	public CandidateCvLanguagesController(CandidateCvLanguageService candidateCvLanguageService) {
		super();
		this.candidateCvLanguageService = candidateCvLanguageService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateCvLanguage candidateCvLanguage){
		return ResponseEntity.ok(this.candidateCvLanguageService.add(candidateCvLanguage));
	}
	
	@GetMapping("/ getByLanguage_Name")
	public DataResult<List<CandidateCvLanguage>> getByLanguage_Name(String name){
		return this.candidateCvLanguageService.getByLanguage_Name(name);
	}

}

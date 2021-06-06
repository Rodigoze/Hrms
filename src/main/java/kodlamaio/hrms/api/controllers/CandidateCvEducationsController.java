package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCvEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CandidateCvEducation;

@RestController
@RequestMapping("/api/candidateCvEducation")
public class CandidateCvEducationsController {
	
	private CandidateCvEducationService candidateCvEduvationService;

	@Autowired
	public CandidateCvEducationsController(CandidateCvEducationService candidateCvEduvationService) {
		super();
		this.candidateCvEduvationService = candidateCvEduvationService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateCvEducation candidateCvEducation){
		return ResponseEntity.ok(this.candidateCvEduvationService.add(candidateCvEducation));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(CandidateCvEducation candidateCvEducation){
		return ResponseEntity.ok(this.candidateCvEduvationService.delete(candidateCvEducation));
	}
	
	@GetMapping("/getBySchoolName")
	public DataResult<List<CandidateCvEducation>> getBySchoolName(@RequestParam String schoolName){
		return this.candidateCvEduvationService.getBySchoolName(schoolName);
	}

}

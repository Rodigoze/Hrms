package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCvExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CandidateCvExperience;

@RestController
@RequestMapping("/api/candidatecvexperience")
public class CandidateCvExperiencesController {
	
	private CandidateCvExperienceService candidateCvExperienceService;

	@Autowired
	public CandidateCvExperiencesController(CandidateCvExperienceService candidateCvExperienceService) {
		super();
		this.candidateCvExperienceService = candidateCvExperienceService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateCvExperience candidateCvExperience){
		return ResponseEntity.ok(this.candidateCvExperienceService.add(candidateCvExperience));
	}
	
	@GetMapping("/getByWorkplaceName")
	public DataResult<List<CandidateCvExperience>> getByWorkplaceName(@RequestParam String workplaceName){
		return this.candidateCvExperienceService.getByWorkplaceName(workplaceName);
	}
	
	

}

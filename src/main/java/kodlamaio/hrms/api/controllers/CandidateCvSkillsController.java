package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCvSkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CandidateCvSkill;

@RestController
@RequestMapping("/api/candidateCvSkills")
public class CandidateCvSkillsController {
	
	private CandidateCvSkillService candidateCvSkillService;

	@Autowired
	public CandidateCvSkillsController(CandidateCvSkillService candidateCvSkillService) {
		super();
		this.candidateCvSkillService = candidateCvSkillService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateCvSkill candidateCvSkill){
		return ResponseEntity.ok(this.candidateCvSkillService.add(candidateCvSkill));
	}
	
	@GetMapping("/getByCandidateCv_Id")
	public DataResult<List<CandidateCvSkill>> getByCandidateCv_Id(int CandidateId){
		return this.candidateCvSkillService.getByCandidateCv_Id(CandidateId);
	}

}

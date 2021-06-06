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

import kodlamaio.hrms.business.abstracts.CandidateCvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CandidateCv;

@RestController
@RequestMapping("/api/candidateCv")
public class CandidateCvsController {
	
	private CandidateCvService candidateCvService;

	@Autowired
	public CandidateCvsController(CandidateCvService candidateCvService) {
		super();
		this.candidateCvService = candidateCvService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateCv candidateCv){
	
		return ResponseEntity.ok(this.candidateCvService.add(candidateCv));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody CandidateCv candidateCv){
		return ResponseEntity.ok(this.candidateCvService.delete(candidateCv));
	}
	
	@GetMapping("/getById")
	public DataResult<List<CandidateCv>> getById(@RequestParam int id){
		return this.candidateCvService.getById(id);
	}
	
	

}

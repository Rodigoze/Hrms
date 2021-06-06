package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvert;
import kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertDto;



public interface JobAdvertDao extends JpaRepository<JobAdvert,Integer> {
	
	List<JobAdvert> getByMinSalary(int minSalary);
	
	@Query("Select new kodlamaio.hrms.entities.dtos.EmployerWithJobAdvertDto(e.companyName,j.maxSalary) From JobAdvert j Join j.employer e")
	List<EmployerWithJobAdvertDto> getEmployerWithJobAdvertDetails(String companyName,int maxSalary);

}

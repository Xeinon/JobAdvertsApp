package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobAdverts")
public class JobAdvertController {

	private JobAdvertService jobAdvertService;
	
	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}

	@PostMapping("/add")
	public Result add(JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}

	@GetMapping("/getActive")
	public DataResult<List<JobAdvert>> getAllActiveJobAdverts() {
		return this.jobAdvertService.getAllActiveJobAdverts();
	}

	@GetMapping("/getAllByDate")
	public DataResult<List<JobAdvert>> getAllByCreationDateAsc() {
		return this.jobAdvertService.getAllByCreationDateAsc();
	}

	@GetMapping("/getActiveByCompanyName")
	public DataResult<List<JobAdvert>> getAllActiveAdvertByEmployer_CompanyName(String companyName) {
		return this.jobAdvertService.getAllActiveAdvertByEmployer_CompanyName(companyName);
	}
	
}

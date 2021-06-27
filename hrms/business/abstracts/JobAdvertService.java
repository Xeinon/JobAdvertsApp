package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {

	Result add(JobAdvert jobAdvert);
	
    DataResult<List<JobAdvert>> getAllActiveJobAdverts();

    DataResult<List<JobAdvert>> getAllByCreationDateAsc();

    DataResult<List<JobAdvert>> getAllActiveAdvertByEmployer_CompanyName(String companyName);
	
}

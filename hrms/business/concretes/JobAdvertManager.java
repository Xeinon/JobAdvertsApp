package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms.entities.concretes.JobAdvert;

public class JobAdvertManager implements JobAdvertService{

	private JobAdvertDao jobAdvertDao;
	
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("Job advert added.");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllActiveJobAdverts() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllActiveJobAdverts(), "All active job adverts listed.");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByCreationDateAsc() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllByCreationDateAsc(), "All active job adverts listed by date.");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllActiveAdvertByEmployer_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllActiveAdvertByEmployer_CompanyName(companyName), "All job adverts of company");
	}

}

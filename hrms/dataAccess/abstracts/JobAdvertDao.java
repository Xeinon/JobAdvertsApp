package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer>{ 

    @Query("From JobAdvert where isActive = true") 
    List<JobAdvert> getAllActiveJobAdverts();

    @Query("From JobAdvert where isActive = true Order By publishedDate asc ")
    List<JobAdvert> getAllByCreationDateAsc();

    @Query("From JobAdvert where isActive = true and employer.companyName=:companyName") 
    List<JobAdvert> getAllActiveAdvertByEmployer_CompanyName(String companyName);

	
}

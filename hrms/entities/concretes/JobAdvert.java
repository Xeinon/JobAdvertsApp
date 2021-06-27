package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_adverts")
public class JobAdvert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "advert_name")
	private String advertName;
	
	@Column(name = "descriptions")
	private String description;
	
	@Column(name = "salary_max")
	private double salaryMax;
	
	@Column(name = "salary_min")
	private double salaryMin;
	
	@Column(name = "job_type")
	private String jobType; //Full-Part time, Remote
	
	@Column(name = "vacansies")
	private int vacancies; //number of vacancies
	
	@Column(name = "post_on")
	private LocalDate postOn;
	
	@Column(name = "post_end")
	private LocalDate postEnd;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name = "city_id", nullable = false)
	private City city;
	
	@ManyToOne()
	@JoinColumn(name = "jobPosition_id", nullable = false)
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name = "emloyer_id", nullable = false)
	private Employee employee;
	
}

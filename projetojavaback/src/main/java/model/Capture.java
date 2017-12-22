package model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Capture {

	@Id
	@GeneratedValue
	private Integer id;
	@OneToOne(mappedBy="project", fetch=FetchType.LAZY)	
	@Cascade(CascadeType.ALL)
	private Project project;
	private PlatformCapture platform;
	@Temporal(TemporalType.DATE)
	private Calendar data_envio;
	@OneToOne(mappedBy="project", fetch=FetchType.LAZY)	
	@Cascade(CascadeType.ALL)
	private Operator operator;
}

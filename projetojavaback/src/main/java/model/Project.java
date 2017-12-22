package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
public class Project {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="operator_project",
	joinColumns=@JoinColumn(name="id_project"),
	inverseJoinColumns=@JoinColumn(name="id_operator"))
	private List<Operator> operators;
	@OneToMany(mappedBy="project", fetch=FetchType.LAZY)	
	@Cascade(CascadeType.ALL)
	private List<FileType> filesTypes;
	@OneToMany(mappedBy="project", fetch=FetchType.LAZY)	
	@Cascade(CascadeType.ALL)
	private List<PlatformCapture> platformCapture;
}

package dao;

import java.util.List;

import model.FileType;
import model.Operator;
import model.Project;

public interface IProject {

	public List<Project> searchByOperator(Operator operator);
	
	public List<Project> searchByFileType(FileType fileType);
	
	public List<Project> searchByName(String name);
}

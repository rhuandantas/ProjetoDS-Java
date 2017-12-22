package dao;

import java.util.Calendar;
import java.util.List;

import model.Capture;
import model.FileType;
import model.Operator;
import model.PlatformCapture;

public interface ICapture {

	public List<Capture> seachByData(Calendar data);
	
	public List<Capture> searchByFileType(FileType fileType);
	
	public List<Capture> searchByPlatformCapture(PlatformCapture platform);
	
	public List<Capture> searchByOperator(Operator operator);
}

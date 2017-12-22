package util;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OCR {

	public String getText() {
		File imageFile = new File("");
		ITesseract instance = new Tesseract();
		String result = null;
		try {
			result = instance.doOCR(imageFile);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}

import java.io.IOException;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

public class Main {
	private static final String[] FILES = new String[] { 
			"C:/Users/rafael/Downloads/vivo-renovacao/doc-03-pag-01.pdf",
			"C:/Users/rafael/Downloads/vivo-renovacao/doc-03-pag-02.pdf",
			"C:/Users/rafael/Downloads/vivo-renovacao/doc-03-pag-03.pdf",
			"C:/Users/rafael/Downloads/vivo-renovacao/doc-03-pag-04.pdf"
	};
	private static final String OUTPUT = "C:/Users/rafael/Downloads/vivo-renovacao/doc-04.pdf";
	
	public static void main(String[] args) throws IOException {
		PDFMergerUtility ut = new PDFMergerUtility();
		
		for (int i = 0; i < Main.FILES.length; i++) {
			ut.addSource(Main.FILES[i]);
		}
		
		ut.setDestinationFileName(Main.OUTPUT);
		ut.mergeDocuments();
		
		System.out.println("foi");
	}
}
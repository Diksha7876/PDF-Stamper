
package texxt;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;



public class PdfStamp {
    public void addWatermarkToPdf(String inputPdf, String outputPdf ,String watermarkImageFile)
    {
        try {
            PdfDocument pdfDocument = new PdfDocument(new PdfReader(inputPdf), new PdfWriter(outputPdf));
            Document document= new Document(pdfDocument);
            
            Image watermark = new Image(ImageDataFactory.create(watermarkImageFile));
            int pageNum=1;
            while(pageNum<=pdfDocument.getNumberOfPages())
            {
                watermark.setFixedPosition(
                    pdfDocument.getDefaultPageSize().getWidth()/2 ,
                    pdfDocument.getDefaultPageSize().getHeight()/2-300
                );
                watermark.setOpacity(0.2F);
                watermark.setPageNumber(pageNum);
                document.add(watermark);
                pageNum++;
            }
            document.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}



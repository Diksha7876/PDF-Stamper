
package texxt;

public class Texxt {

    public static void main(String[] args) {
        //String filepath="C:\\Users\\91830\\Documents\\NetBeansProjects\\Texxt\\";
        PdfStamp pdfStamp= new PdfStamp();
        pdfStamp.addWatermarkToPdf("document.pdf", "output.pdf", "stamp.png");
    }
}


package gt.edu.umg.priciple.solid.model.service;


public class TextHtml implements ITextService {

    public TextHtml() {
    }

    /**
     * @param text texto plano que sera modificado
     * @return texto en formato HTML
     */
    public String printText(String text) {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>"+text+"</h1>\n" +
                "</body>\n" +
                "</html>";
        return html;
    }

}
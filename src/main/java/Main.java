import com.rapiddweller.benerator.main.Benerator;
import com.rapiddweller.commons.log.LoggingInfoPrinter;
import com.rapiddweller.commons.ui.InfoPrinter;

public class Main {
    public static void main(String[] args) throws Exception {
        InfoPrinter printer = new LoggingInfoPrinter("org.databene.CONFIG");
        Benerator.runFile("src/main/resources/benerator.xml", printer);
    }
}

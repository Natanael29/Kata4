package kata4;

import java.io.IOException;
import kata4.view.HistogramDisplay;
import kata4.view.MailListReader;
import kata4.view.MailHistogramBuilder;
import kata4.model.Histogram;
import kata4.model.Mail;
import java.util.List;

public class Kata4 {
    Histogram<String> histogram;
    List<Mail> mailList;

    public static void main(String[] args) {
        Kata4 kata4 = new Kata4();
        kata4.execute();
    }
    
    private void execute() {
        input();
        process();
        output();
    }

    private void input() {
        String fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
    }

    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute(); 
    }
}
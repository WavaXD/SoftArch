/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author Asus
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator{
    public TimeLoggingHealthcareWorker(HealthcareWorker name) {
        super(name);
        System.out.printf("Decorate "+name.getName() + " with TimeLogging.\n");
    }
    public void service(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        System.out.printf(formatter.format(now) + " : ");
        super.service();
    };
}

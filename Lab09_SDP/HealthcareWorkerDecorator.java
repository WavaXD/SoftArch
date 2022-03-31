/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author Asus
 */
public abstract class HealthcareWorkerDecorator extends HealthcareWorker{
    private HealthcareWorker worker = null;

    public HealthcareWorkerDecorator(HealthcareWorker name){
        super(name);
        worker = name;
    }

    @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }
}
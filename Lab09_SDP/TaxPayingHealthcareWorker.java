/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author Asus
 */
public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    public TaxPayingHealthcareWorker(HealthcareWorker name) {
        super(name);
        System.out.printf("Decorate "+name.getName()+" with TaxPaying.\n");
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * 0.1) + super.getPrice();
    }
}

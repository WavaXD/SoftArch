/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author Asus
 */
public abstract class HealthcareWorker implements HealthcareServiceable {
    private String name;
    private double price;

    public HealthcareWorker(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public HealthcareWorker(HealthcareWorker worker) {
        this.name = worker.getName();
        this.price = worker.getPrice();
    }

    public String getName() {
        return name;
    }

    public abstract void service();

    public double getPrice() {
        return this.price;
    }
}

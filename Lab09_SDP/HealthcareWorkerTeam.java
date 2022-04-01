/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author Asus
 */
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members =new HashSet<HealthcareServiceable>();

    public void addMember(HealthcareServiceable name){
        members.add(name);
    }

    public void removeMember(HealthcareServiceable name){
        members.remove(name);
    }
    @Override
    public void service() {
        members.forEach((i) -> i.service());
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (HealthcareServiceable i : members) { 
            price += i.getPrice();
        }
        return price;
    }


}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jatin Sharma
 */
public class AverageSensor implements Sensor{
    private List<Sensor> listOfSensors;
    private List<Integer> listOfAvg;

    public AverageSensor() {
        this.listOfSensors=new ArrayList<>();
        this.listOfAvg=new ArrayList<>();
    }
    
    
    public void addSensor(Sensor toAdd){
        listOfSensors.add(toAdd);
    }
    @Override
    public boolean isOn() {
        boolean isOn=false;
        
        for(Sensor e:listOfSensors){
            if(e.isOn()==true){
                isOn=true;
            }else{
                isOn=false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        for(Sensor e:listOfSensors){
            e.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor e:listOfSensors){
            e.setOff();
        }
    }

    @Override
    public int read() {
        int sum=0;
        if(isOn() && !listOfSensors.isEmpty()){
            for(Sensor e:listOfSensors){
                sum+=e.read();
            }
            int avg=sum/listOfSensors.size();
            listOfAvg.add(avg);
            return avg;
        }else{
            throw new IllegalArgumentException("error in avg sensor");
        }
    }
    
    public List<Integer> readings(){
        return listOfAvg;
    }
}

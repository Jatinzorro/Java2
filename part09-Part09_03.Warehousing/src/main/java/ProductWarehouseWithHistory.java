/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory historyObj=new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity , double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        historyObj.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        double res=0;
        res=(double) super.getBalance()+amount;
        historyObj.add(res);
        super.addToWarehouse(amount);
    }
    
    public double takeFromWarehouse(double amount){
        double res=0;
        res=(double)super.getBalance()-amount;
        historyObj.add(res);
        return super.takeFromWarehouse(amount);
    }
    
    public String history(){
        return this.historyObj.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+historyObj.toString());
        System.out.println("Largest amount of product: "+historyObj.maxValue());
        System.out.println("Smallest amount of product: "+historyObj.minValue());
        System.out.println("Average: "+historyObj.average());
        
    }
    
}

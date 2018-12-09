/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;

/**
 *
 * @author ASUS
 */
public class NewClass implements Runnable{
    private int id;
    
    public NewClass(int id){
        this.id=id;
        System.out.println("wew:"+id+"");
    }
    @Override
    public void run() {
       
        try{
                Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
       System.out.println("wew:"+id+"");
    }
}
    


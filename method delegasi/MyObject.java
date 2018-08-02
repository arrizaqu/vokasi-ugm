/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyObject;

/**
 *
 * @author arrizaqu
 */
public class MyObject {
    
    String username;
    
    public void setUsername(String username){
        this.username = username;
    }

    @Override
    public String toString() {
        return "hallo " + this.username;//super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.setUsername("augs");
        System.out.println("" + obj.toString());
    }
    
}

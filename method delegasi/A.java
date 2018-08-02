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
public class A{
    B b = new B();
    C c = new C();

    public void start() {
        b.start();
    }

    public void stop() {
        b.stop();
    }

    public void go() {
        c.go();
    }

    public void lose() {
        c.lose();
    }
    
    
}

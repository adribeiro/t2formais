/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

/**
 *
 * @author nathan
 */

import trabalho2.view.View;
public class App {

    private View view;
    public static void main(String[] args) {
       new App();
    }
    
    public App() {
        this.view = new View(this);
        this.view.show(true);
    }
}

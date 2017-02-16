/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.testclass;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Herbert.PICHLER
 */
public class SimpleGui {
    
    public void generateGui(){
    //Frame erstellen
    JFrame myBmi = new JFrame("BMI-Rechner");
    //Größe des Frames
    myBmi.setSize(300, 400);
    // Stadardoperation waere verstecken des Fensters
    myBmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myBmi.setLayout(new GridLayout(5,2));
    //Jpanel erstellen
    //JPanel myPanel = new JPanel(new FlowLayout());
    //Label erstellen und hinzufügen
    myBmi.add(new JLabel("Eingabe"));
    //myPanel.add(eingabe);
    //Textfeld erstellen und hinzufügen
    JTextField eingabe = new JTextField("Eingabe", 20);
    myBmi.add(eingabe);
    //myPanel.add(txtArea);
    //Ausgae Label und Feld
    myBmi.add(new JLabel("---------------------------"));
    myBmi.add(new JLabel("---------------------------"));
    myBmi.add(new JLabel("Ausgabe"));
    //myPanel.add(ausgabeL);
    JTextField ausgabe = new JTextField("Ausgabe", 10);
    myBmi.add(ausgabe);
        myBmi.add(new JLabel("---------------------------"));
    myBmi.add(new JLabel("---------------------------"));
    JButton ok = new JButton("Berechne");
    ok.setBackground(Color.red);
    ok.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ausgabe.setText(calc(eingabe.getText()));

        }
    });
    myBmi.add(ok);
    myBmi.pack();
    myBmi.setVisible(true);
    }
    
    private String calc(String txt) {
        int num = 0;
        try{
        num = Integer.parseInt(txt);
        }catch(NumberFormatException e){
            return "Keine Zahl eingegeben";
        }
        catch(NullPointerException e){
            return "nichts EIngegeben";
        }
        num = num*3;
        
        return Integer.toString(num) ;
    }
   
    
    
    
}

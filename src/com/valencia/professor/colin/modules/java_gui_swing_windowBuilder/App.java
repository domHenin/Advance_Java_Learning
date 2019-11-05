package com.valencia.professor.colin.modules.java_gui_swing_windowBuilder;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    public static void main(String[] args) {

//        System.out.println("Hello World");
        JFrame myMainFrame = new App();

//        JFrame newMainFrame = new App();
//        newMainFrame.setContentPane(new App().);

        myMainFrame.setTitle("Tutorials");
        myMainFrame.setSize(400, 300);
        myMainFrame.setLocation(100, 100);
        myMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myMainFrame.setVisible(true);

        JButton myButton = new JButton("Click Here");

        myMainFrame.setLayout(new FlowLayout());
        myMainFrame.add(myButton);

        MyButtonHandler myButtonHandler = new MyButtonHandler();
        myButton.addActionListener(myButtonHandler);


        JButton otherButton = new JButton("Other Button");
        myMainFrame.add(otherButton);

        otherButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("I hear the other button");
                        System.out.println(e);
                    }
                }
        );
    }

    static class MyButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("I hear the button!");
            System.out.println(e);
        }
    }
}
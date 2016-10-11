package project;

import java.util.HashMap;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roducke
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      ST<Date, String> st = new ST<String, Integer>();
       
      st.put("hola", 1);
      st.put("hola", 12);
      st.put("hola", 23);
      st.put("hola1", 13);
      st.put("hola1", 14);
      
        System.out.println(st.get("hola"));
    }
}
    


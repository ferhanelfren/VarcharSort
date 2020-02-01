/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import static javax.management.Query.lt;

/**
 *
 * @author GOD
 */
public class CHAR {
    
    
        Scanner myObj = new Scanner(System.in);

    
     //    Scanner s=new Scanner(System.in);
         
         String A;
    
 
             
   
    void letters() {
        
        
            System.out.println("Enter String:");
            
            String str=myObj.nextLine();
            
    
        
              
        
     //   String text="ferhanelfrenmmmmmmmmm";
        
                                                                  
                                                                  
        List<String>list=Arrays.asList(str.split(""));
        
        Set<String> uniqeWords= new HashSet<>(list);
        
        
        for (String word : uniqeWords) {
           // String word;
            
            System.out.println(word +": "+ Collections.frequency (list,  word));
                    
            
        }
        
    }
    
    void Display(){
        
      letters();
             
        
    }
    
    
   }
    
    
    
    
    
    




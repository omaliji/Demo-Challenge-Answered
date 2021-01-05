package com.sample.test.demo.tests;

import java.util.List;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import com.sample.test.demo.TestBase;

public class TestDemo extends TestBase {

    @Test
    public void validTest() {
     /*This Dropdown is for selecting your pizza*/	
     driver.findElement(By.id( "pizza1Pizza")).click();
     /*This Dropdown is for selecting your first toppings*/
     driver.findElement(By.xpath( "//div[@id='pizza1']//select[@class='toppings1']")).click();
     /*This Dropdown is for selecting your second toppings*/
     driver.findElement(By.xpath( "//div[@id='pizza1']//select[@class='toppings2']")).click();
     /*This Field is for entering the the quantity of your pizza*/
     driver.findElement(By.id( "pizza1Qty")).sendKeys("2");
     /*This Field is for entering the the cost of your pizza*/
     driver.findElement(By.id( "pizza1Cost")).sendKeys("200");
     /*This RadioBtn is for cash payments*/
     driver.findElement(By.id( "cashpayment")).click();
     /*This RadioBtn is for card payments*/
     driver.findElement(By.id( "ccpayment")).click();
     /*This Field is for entering valid email address*/
     driver.findElement(By.id( "email")).sendKeys("muhmaaliji11@gmail.com");
     /*This Field is for entering valid name*/
     driver.findElement(By.id(  "name")).sendKeys("Muh");
     /*This Field is for entering valid phone number*/
     driver.findElement(By.id( "phone")).sendKeys("5723684512");
     /*This Field is for placing your order*/
     driver.findElement(By.id(  "placeOrder")).click();
     /*This Field is for resetting your order*/
     driver.findElement(By.id(  "reset")).click();
     
  
     
    }
    
    @Test
    public void invalidTest() {
     driver.findElement(By.id( "pizza1Pizza")).click();
     driver.findElement(By.xpath( "//div[@id='pizza1']//select[@class='toppings1']")).click();
     driver.findElement(By.xpath( "//div[@id='pizza1']//select[@class='toppings2']")).click();
     driver.findElement(By.id( "pizza1Qty")).sendKeys("4");
     driver.findElement(By.id( "pizza1Cost")).sendKeys("100");
     driver.findElement(By.id( "cashpayment")).click();
     driver.findElement(By.id( "email")).sendKeys("asd");
     driver.findElement(By.id(  "name")).sendKeys("r");
     driver.findElement(By.id( "phone")).sendKeys("01");
     driver.findElement(By.id(  "placeOrder")).click();
     driver.findElement(By.id(  "reset")).click();

     
     
   }
    
    
    
    
    

}

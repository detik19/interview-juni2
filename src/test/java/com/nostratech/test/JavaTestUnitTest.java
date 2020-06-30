package com.nostratech.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.nostratech.test")
public class JavaTestUnitTest 
{
	
    @Test
    public void test1()
    {
    	JavaTest test1= new JavaTest();
    	test1.isPalindrome("aka");
		assertEquals(true, test1.isPalindrome("radar"));
    }
   
    @Test
    public void test2()
    {
    	JavaTest test= new JavaTest();
		assertEquals(true, test.isPalindrome("madam"));
    }
    
    
    @Test
    public void test3()
    {
    	JavaTest test= new JavaTest();
		assertEquals(false, test.isPalindrome("testing"));
    }
    
    @Test
    public void test4()
    {
    	JavaTest test= new JavaTest();
		assertEquals(true, test.isPalindrome("redivider"));
    }
    
    @Test
    public void test5()
    {
    	JavaTest test= new JavaTest();
		assertEquals(true, test.isPalindrome("rotator"));
    }
    
    @Test
    public void test6()
    {
    	JavaTest test= new JavaTest();
		assertEquals(false, test.isPalindrome("human"));
    }
    
    @Test
    public void test7()
    {
    	JavaTest test= new JavaTest();
		assertEquals(false, test.isPalindrome("college"));
    }
}

package com.niit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestCaseQuery
{
	
	QueryParser1 queryParser;

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//queryParser = new QueryParser1();
		@SuppressWarnings("unused")
		QueryParameter queryParameter = queryParser.splitQuery("select empid , ename from emp.csv where eid=100");
		
		String baseQuery = queryParameter.getBaseQuery();
		
		//System.out.println(baseQuery);
		System.out.println(queryParameter.getField());
		System.out.println(queryParameter.getFilePath());
	}
	
	@Before
	public void init()
	{
		queryParser= new QueryParser1();
		
		
	}
	
	/*@SuppressWarnings("unused")
public void queryValidation()
	{
		QueryParameter queryParameter = queryParser.splitQuery("select *");
		
	}
	
	
@SuppressWarnings("deprecation")
public void QueryWithWhere()
{
	QueryParameter queryParameter = queryParser.splitQuery("select * from emp.csv where eid=100");
	String filepath= queryParameter.getFilePath();
	Assert.assertEquals("emp.csv", filepath);
}*/
}

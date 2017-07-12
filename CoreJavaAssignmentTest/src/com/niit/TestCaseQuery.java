package com.niit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCaseQuery
{
	
	QueryParser1 queryParser;

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	public void init()
	{
		queryParser= new QueryParser1();
		
	}
	
	@SuppressWarnings("unused")
	public void QueryValidation()
	{
		QueryParameter queryParameter = queryParser.splitQuery("select *");
	}
	
	
@SuppressWarnings("deprecation")
public void QueryWithWhere()
{
	QueryParameter queryParameter = queryParser.splitQuery("select * from emp.csv where eid=100");
	String filepath= queryParameter.getFilePath();
	Assert.assertEquals("emp.csv", filepath);
}
}

package com.niit;

import java.util.List;

public class QueryParameter 
{
	
	private String baseQuery, filePath;
	
	private List<CriteriaQuery>  restrictions;

	public String getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public List<CriteriaQuery> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(List<CriteriaQuery> restrictions) {
		this.restrictions = restrictions;
	}
	
	
	

}

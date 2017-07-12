package com.niit;

import java.util.List;

public class QueryParameter 
{
	
	private String baseQuery;
	
	private String filePath;
	private String field;
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	private String where;
	private String groupBy;
	private String orderBy;
	
	//private List<CriteriaQuery>  restrictions;

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public String getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

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

	/*public List<CriteriaQuery> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(List<CriteriaQuery> restrictions) {
		this.restrictions = restrictions;
	}
*/	
	
	

}

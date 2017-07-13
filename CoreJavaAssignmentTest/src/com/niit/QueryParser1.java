package com.niit;

public class QueryParser1
{
	QueryParameter queryParameter = new QueryParameter();
	CriteriaQuery criteriaQuery = new CriteriaQuery();
	public QueryParameter splitQuery(String inputQuery)
	{
		if(inputQuery.contains("select"))
		{
			String[] baseQuery = inputQuery.split("select");
			if(inputQuery.contains("from"))
			{
				
				String columns[] = baseQuery[1].split("from");
				queryParameter.setField(columns[1].trim());
				
				String querycondition[]=columns[1].split("where");
				queryParameter.setField(querycondition[0].trim());
				if(inputQuery.contains("where"))
				{
					String wherecondition []= querycondition[1].split("group by" );
					queryParameter.setWhere(wherecondition[0].trim());
					
					
					if(inputQuery.contains("group by"))
					{
						String groupcondition[] = wherecondition[1].split("order by");
						queryParameter.setGroupBy(groupcondition[0].trim());
								
					}
				}
				
			}
			//System.out.print(queryParameter.getBaseQuery().s);
		}
		return queryParameter;
	}
	

	public CriteriaQuery getAllfields()
	{
		String allcols= queryParameter.getWhere();
		String []columnName= allcols.split("\\s*[>=|<=|!=|=|>|<]");
		int startIndex=allcols.indexOf(columnName[0])+columnName[0].length();
		int endIndex=allcols.indexOf(columnName[1]);
		String operator=allcols.substring(startIndex,endIndex).trim();
		criteriaQuery.setPropertyName(columnName[0].trim());
		criteriaQuery.setConditionString(operator);
		criteriaQuery.setPropertyValue(columnName[1].trim());
		return criteriaQuery;
		
	}
}

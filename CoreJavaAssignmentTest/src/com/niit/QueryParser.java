package com.niit;

public class QueryParser 
{
	
	String mainquery, filepath, wherecondition;
	
	CriteriaQuery criteriaQuery = new CriteriaQuery();
	public QueryParameter splitQuery(String inputqry)
	{
		
		QueryParameter queryParameter = new QueryParameter();
		if(isValidQueryString(inputqry))
				{
			
				if(inputqry.contains("where"))
				{
					/*String[] mainquery=inputqry.split("where");
					filepath = mainquery[0].split("from")[1].trim();
					System.out.println(mainquery[0]);
					System.out.println(filepath);
					System.out.println(mainquery[1]);
					*/
					
				queryParameter.setBaseQuery(inputqry.split("where")[0]);
				queryParameter.setFilePath(queryParameter.getBaseQuery().split("from")[1]);
				
				this.comparsionEvaluationProcessing(queryParameter.getBaseQuery().split("where")[0]);			
				System.out.println(queryParameter.getBaseQuery());
				//System.out.println(queryParameter.getBaseQuery().split("from")[1]);
				System.out.println(queryParameter.getFilePath());
				
				System.out.println(criteriaQuery.getPropertyName());
				System.out.println(criteriaQuery.getPropertyValue());
				System.out.println(criteriaQuery.getConditionString());
				}
				
				
				}
		
	return queryParameter;
	}
	
	
	public CriteriaQuery comparsionEvaluationProcessing(String comparsionquery)
	{
		
		String operatorssymbol[]={">","<",">=","<=","=","!="};
		
		for(String operator : operatorssymbol)
		{
			if(comparsionquery.contains(operator))
			{
				
				criteriaQuery.setPropertyName(comparsionquery.split(operator)[0].trim());
				criteriaQuery.setPropertyValue(comparsionquery.split(operator)[1].trim());
				criteriaQuery.setConditionString(operator);
				
				break;
				
			}
		}
		return criteriaQuery;
	}


	private boolean isValidQueryString(String qrystring) 
	{
		System.out.println("i am in valid query string fun");
		if(qrystring.contains("select") && qrystring.contains("from") || (qrystring.contains("where") ||qrystring.contains("")))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

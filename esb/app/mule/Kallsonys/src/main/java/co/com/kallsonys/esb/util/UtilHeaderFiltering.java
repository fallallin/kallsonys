package co.com.kallsonys.esb.util;

import java.lang.reflect.Method;
import java.util.List;

public class UtilHeaderFiltering {
	public static void applyFilter(UtilHeaderFilter filter, Object obj) {
	    try {
	    	 // Try to locate a list at the top-level of the response
	        List filterableList = null;
	        for(Method getter : obj.getClass().getMethods()) {
	        	System.out.println(getter.getName());
	            if(List.class.isAssignableFrom(getter.getReturnType()) &&
	                    getter.getParameterCount() == 0) {
	                filterableList = 
	                    (List)getter.invoke(obj, (Object[])null);
	            }
	        }
	    } catch(Exception e) {
	        // TODO: Log
	    }
	}
}

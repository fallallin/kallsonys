package co.com.kallsonys.esb.util;

import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.databinding.DataReader;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.MessageContentsList;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.service.Service;
import org.apache.cxf.service.model.ServiceModelUtil;

public class UtilHeaderFilterInterceptor extends AbstractSoapInterceptor {
	private String code;
	private String message;

	private static final QName RESULTS_FILTER_XML_TYPE =
	        new QName("{http://www.kallsonys.com.co/cim/message/payment/v1}headerRq", "UtilHeaderFilter");
	
	public UtilHeaderFilterInterceptor() {
        super(Phase.PRE_MARSHAL);
        System.out.println("************** Holas Constructor ****************");
    }

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		System.out.println("************** Holas **************** " + message);
		SoapMessage inboundMessage = (SoapMessage) message.getExchange().getInMessage();
		System.out.println("************** Holas **************** " + inboundMessage.toString());
		List<Header> headers = inboundMessage.getHeaders();
		if (headers != null) {
			// Prepare a header marshaller for CXF's binding type
	        Service service =
	            ServiceModelUtil.getService(message.getExchange());
	        DataReader<Node> dataReader =
	            service.getDataBinding().createReader(Node.class);
	 
	        // Find the raw response payload
	        Object payload = null;
	        MessageContentsList messageContentsList =
	            MessageContentsList.getContentsList(message);
	        if(messageContentsList != null && 
	                messageContentsList.size() > 0) {
	            payload = messageContentsList.get(0);
	        }
	        
	        System.out.println("Alguna idea " + payload.toString());
	        System.out.println(getCode() + " - "+ getMessage());
	        
	        if(payload != null) {
	        	// Apply each filter instance to the response payload
	            for(Header header : headers) {
	            	System.out.println("Parce !!! " + header.getName());
	                if(header.getName().equals(RESULTS_FILTER_XML_TYPE)) {
//	                	UtilHeaderFilter resultsFilter =
//	                        (UtilHeaderFilter)dataReader.read(
//	                            RESULTS_FILTER_XML_TYPE,
//	                            (Node)header.getObject(), UtilHeaderFilter.class);
//	                	UtilHeaderFiltering.applyFilter(resultsFilter, payload);
	                }
	            }
	        }
	        
		}
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

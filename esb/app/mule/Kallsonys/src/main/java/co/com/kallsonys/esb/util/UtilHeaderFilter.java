package co.com.kallsonys.esb.util;

public class UtilHeaderFilter {
	private String code;
	private String message;
	
	public UtilHeaderFilter () {
		super();
	}
	
	public UtilHeaderFilter (String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMemessage() {
		return message;
	}
	public void setMemessage(String memessage) {
		this.message = memessage;
	}
	
	
}

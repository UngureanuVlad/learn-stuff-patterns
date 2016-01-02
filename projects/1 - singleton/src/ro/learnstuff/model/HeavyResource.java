package ro.learnstuff.model;

public class HeavyResource {

	private String resourcePart = "Heavy resource processing!";

	public String getResourcePart() {
		return resourcePart;
	}

	public void setResourcePart(String resourcePart) {
		this.resourcePart = resourcePart;
	}
	
	public void heavyOperation(){
		System.out.println(this.resourcePart);
	}

}

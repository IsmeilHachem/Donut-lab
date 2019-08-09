package co.grandcircus.donutlab.entity;

public class Donuts {
	
	private Long id;
	private String ref;
	private String name;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRef() {
		return ref;
	}
	
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Donuts [id=" + id + ", ref=" + ref + ", name=" + name + "]";
	}
	
	

}

package co.grandcircus.donutlab.entity;

import java.util.List;

public class Details {
	
	private String name;
	private Integer calories;
	private List<String> extras;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCalories() {
		return calories;
	}
	
	public void setCalories(Integer calorie) {
		this.calories = calorie;
	}
	
	public List<String> getExtras() {
		return extras;
	}
	
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	
	@Override
	public String toString() {
		return "Details [name=" + name + ", calories=" + calories + ", extras=" + extras + "]";
	}
	
	

}

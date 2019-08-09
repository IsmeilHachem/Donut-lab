package co.grandcircus.donutlab.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DonutResponse {
	
	@JsonProperty("results")
	private List<Donuts> donut;

	public List<Donuts> getDonut() {
		return donut;
	}

	public void setDonut(List<Donuts> donut) {
		this.donut = donut;
	}

	@Override
	public String toString() {
		return "DonutResponse [donut=" + donut + "]";
	}
	
	

}

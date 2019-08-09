package co.grandcircus.donutlab.service;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.donutlab.entity.Details;
import co.grandcircus.donutlab.entity.DonutResponse;
import co.grandcircus.donutlab.entity.Donuts;

@Component
public class APIService {
	
private RestTemplate restTemplate = new RestTemplate();
	
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Donuts> getNutty(){
		
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		
		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);
		
		return response.getDonut();
	}
	
	public Details getInfo(Long id) {
		
		String url ="https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		
		Details response = restTemplate.getForObject(url, Details.class);

		return response;

	}

}

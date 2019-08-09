package co.grandcircus.donutlab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.donutlab.entity.Details;
import co.grandcircus.donutlab.entity.Donuts;
import co.grandcircus.donutlab.service.APIService;

@Controller
public class DonutController {
	
	@Autowired
	private APIService apiService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		
		List<Donuts> donut = apiService.getNutty();
		mv.addObject("list", donut);
		return mv;
	}
	
	@RequestMapping("/details")
	public ModelAndView details(@RequestParam(value="id", required=false) Long id) {
		ModelAndView mv = new ModelAndView("details");
		
		Details detail = apiService.getInfo(id);
		mv.addObject("detail", detail);
		return mv;
		
	}
	
//	@GetMapping("/details/{id}")
//	public Donuts getDonut(@PathVariable("id") Long id) {
//		return dao.findById(id).
//	}
	

}

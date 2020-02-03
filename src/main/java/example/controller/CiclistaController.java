package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ciclistas")
public class CiclistaController {
	
	public static final String CICLISTAS_VIEW="ciclistas";
	
	@GetMapping("/listaCiclistas")
	public String vista() {
		return CICLISTAS_VIEW;
				
	}
	
	@RequestMapping(value="/listaCiclistas2",method=RequestMethod.GET)
	public ModelAndView ciclistaMAV() {
		ModelAndView mav=new ModelAndView(CICLISTAS_VIEW);
		return mav.addObject("ciclista");
	}
	
	

}

package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import example.entity.Ciclista;
import example.model.CiclistaModel;
import example.service.CiclistaService;


@Controller
@RequestMapping("/ciclistas")
public class CiclistaController {
	
	public static final String CICLISTAS_VIEW="ciclistas";
	// private static final String CREATE_VIEW="create";
	
	@Autowired
	@Qualifier("ciclistaServiceImpl")
	private CiclistaService ciclistaService;
	
	@GetMapping("/listaCiclistas")
	public ModelAndView listaCiclistas() {
		ModelAndView mav=new ModelAndView(CICLISTAS_VIEW);
		mav.addObject("ciclista",new Ciclista());
		mav.addObject("ciclistas",ciclistaService.getListciclista());
		return mav;
	}
	
	
	@PostMapping("/add")
	public String addCiclista(@ModelAttribute("ciclista") CiclistaModel ciclistaModel) {
		ciclistaService.addCiclista(ciclistaModel);
		return "redirect:/ciclistas/listaCiclistas";
	}
	
	@GetMapping("/create")
	public ModelAndView createCiclista() {
		ModelAndView mav=new ModelAndView("CreateCiclistas");
		mav.addObject("ciclista",new Ciclista());
		return mav;
	}
	
	@RequestMapping(value="/ciclistas/delete/{id}")
	public String deleteCiclista(@PathVariable("id") int id) {
	    ciclistaService.removeCiclista(id);
	    return "redirect:/ciclistas/listaCiclistas";
	}
	
	

}

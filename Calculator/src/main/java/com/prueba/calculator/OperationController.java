package com.prueba.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.corp.calculator.TracerImpl;

@Controller
public class OperationController extends TracerImpl{
	
	//inicializo el model
	OperationModel modelBean = new OperationModel();
	
	@Autowired
	private OperationServices operationServices;
	
	/**
	 * map del html para la interface de la calculadora
	 * @param model
	 * @return
	 */
	@RequestMapping("/calculator")
    private String getCalculatorPage(Model model){
        model.addAttribute("operationModel",modelBean);
        return "calculator";
	}
	
	/**
	 * servicio para suma
	 * @param form
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    private String add(@ModelAttribute("operationModel")  OperationModel modelBean, Model model ){
        model.addAttribute("result", operationServices.add(modelBean));
        return "calculator";
    }
	
	/**
	 * servicio para resta
	 * @param form
	 * @param model
	 * @return
	 */
    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    private String subtract(@ModelAttribute("operationBean")  OperationModel modelBean, Model model ){
        model.addAttribute("result", operationServices.subtr(modelBean));
        return "calculator";
    }
	

}

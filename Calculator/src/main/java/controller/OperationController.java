package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.corp.calculator.TracerImpl;
import model.OperationModel;

@Controller
public class OperationController extends TracerImpl{
	
	//inicializo el model
	OperationModel modelBean = new OperationModel();
	
	@Autowired
	private OperationController operationController;
	
	/**
	 * map del xml para la interface de la calculadora
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
    private String getCalculatorPage(Model model){
        model.addAttribute("operationBean",modelBean);
        return "calculator";
	}

}

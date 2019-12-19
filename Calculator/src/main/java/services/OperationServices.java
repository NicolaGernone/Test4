package services;

import org.springframework.stereotype.Service;
import io.corp.calculator.TracerImpl;
import model.OperationModel;

@Service
public class OperationServices extends TracerImpl {
	
	//declaro las variables de suma y resta
	private double sum = 0.00;
	private double rest = 0.00;
	
	/**
	 * servicio que devuelve la suma de dos valores
	 * @param model
	 * @return
	 */
	public double add(OperationModel model){
        try {
        	trace("La primera variable introducida es: " + model.getA());
        	trace("La segunda variable introducida es: " + model.getB());
        	sum = model.getA() + model.getB();
        	trace("La suma de los valores es: " + sum);
			return sum;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			trace(e);
			trace("Se han itroducido valores incorrectos");
			return sum;
		}
    }

}

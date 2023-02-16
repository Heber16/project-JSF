/**
 * 
 */
package com.buenmaestro.project.services;

import java.util.ArrayList;
import java.util.List;

import com.buenmaestro.project.entity.Empleado;

/**
 * @author heber
 * Clase que permite realizar la lógica de negocio para empleados
 */
public class EmpleadoService {
	
	/**
	 * @author heber
	 * Metodo que permite consultar la lista de empleados de empresas de TI 
	 */
	public List<Empleado> consultarEmpleados(){
	
		
		//Generar la lista de empleados a consultar
		List<Empleado> empleados=new ArrayList<Empleado>(); 
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoAMD = new Empleado();
		Empleado empleadoStarLink = new Empleado();
		
		
		empleadoIBM.setNombre("Victor");
		empleadoIBM.setPrimerApellido("Ramirez");
		empleadoIBM.setSegundoApellido("Gonzales");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("Altamira");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Hernandez");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		
		empleadoNetflix.setNombre("Juan Carlos");
		empleadoNetflix.setPrimerApellido("Lopez");
		empleadoNetflix.setSegundoApellido("Hernandez");
		empleadoNetflix.setPuesto("Architect");
		empleadoNetflix.setEstatus(true);
		
		empleadoAmazon.setNombre("Domingo");
		empleadoAmazon.setPrimerApellido("Lopez");
		empleadoAmazon.setSegundoApellido("Hernandez");
		empleadoAmazon.setPuesto("Architect");
		empleadoAmazon.setEstatus(true);
		
		empleadoHP.setNombre("Manuel");
		empleadoHP.setPrimerApellido("Lopez");
		empleadoHP.setSegundoApellido("Hernandez");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setEstatus(true);
		
		empleadoOracle.setNombre("Mauricio");
		empleadoOracle.setPrimerApellido("Lopez");
		empleadoOracle.setSegundoApellido("Hernandez");
		empleadoOracle.setPuesto("Architect");
		empleadoOracle.setEstatus(true);
		
		empleadoAMD.setNombre("Jazmin");
		empleadoAMD.setPrimerApellido("Lopez");
		empleadoAMD.setSegundoApellido("Hernandez");
		empleadoAMD.setPuesto("Architect");
		empleadoAMD.setEstatus(true);
		
		empleadoStarLink.setNombre("Maribel");
		empleadoStarLink.setPrimerApellido("Lopez");
		empleadoStarLink.setSegundoApellido("Hernandez");
		empleadoStarLink.setPuesto("Architect");
		empleadoStarLink.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoAMD);
		empleados.add(empleadoStarLink);
		
		
		return empleados;
	}

}

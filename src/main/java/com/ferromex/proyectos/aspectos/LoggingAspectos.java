package com.ferromex.proyectos.aspectos;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;


public class LoggingAspectos {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspectos.class);
	

		//advice before
		public void antesDeInvocar(JoinPoint joinPoint) {
			logger.info("- - - INICIO Ejutando . . . " + joinPoint.getSignature().getName());
			logger.info("- - - Con ARGUMENTOS: " + Arrays.asList(joinPoint.getArgs()));
		}
		
		//advice after
		public void despuesDeInvocar() {		
			
			logger.info("- - - FIN de ejecuion - - -");		
		}

		
/*		public Object alrededor(ProceedingJoinPoint joinPoint) throws Throwable {
			Object resultado;
			
			System.out.println("(AROUND-ANTES) ");
			
			//AQUI SE INVOCA EL POINTCUT (METODO EN EL QUE INYECTAMOS CODIGO)
			resultado = joinPoint.proceed();		
			
			System.out.println("(AROUND-DESPUES) ");
			
			return resultado;
		}
*/
	}

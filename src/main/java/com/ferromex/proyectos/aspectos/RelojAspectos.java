package com.ferromex.proyectos.aspectos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

public class RelojAspectos {
	private static final Logger logger = LoggerFactory.getLogger(RelojAspectos.class);

	public Object tomaTiempo(ProceedingJoinPoint joinPoint) throws Throwable {

		Object resultado = null;

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss_SSS");
		Calendar tiempoInicial = Calendar.getInstance();
		logger.info("- - - INICIO Obteniendo tiempo ejecucion para: " + joinPoint.getSignature().getName());
		logger.info("- - - tiempo inicial: " + dateFormat.format(tiempoInicial.getTime()));

		resultado = joinPoint.proceed();

		Calendar tiempoActual = Calendar.getInstance();
		logger.info("- - - tiempo final: "+ dateFormat.format(tiempoActual.getTime()));

		long tiempoTotal = tiempoActual.getTimeInMillis() - tiempoInicial.getTimeInMillis();
		logger.info("- - - FIN TIEMPO EMPLEADO (mili segundos): " + tiempoTotal);

		return resultado;
	}
}

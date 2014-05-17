/**********************************************************************************************************
 * Validacion de contratos
 ***********************************************************************************************************/

/**
 * Funcion que habilita el radio group tipo contrato si habilitan un documento de tipo contrato
 **/
function cambiarEstadoRdnBtnTipoContrato(){
	var objTipoDocumento = document.getElementById("tipoDocumento");
	var strSelectedValue = objTipoDocumento.options[objTipoDocumento.selectedIndex].value;
	var strSelectedText = objTipoDocumento.options[objTipoDocumento.selectedIndex].text;
	var objTipoContrato1 = document.getElementById("tipoObra1");
	var objTipoContrato2 = document.getElementById("tipoObra2");
	if(strSelectedText=="Contrato"){
		//alert("Activar tipo contrato");
		objTipoContrato1.disabled = false;
		objTipoContrato2.disabled = false;
		objTipoContrato2.checked = "checked";
	}else{
		//alert("Desactivar tipo contrato");
		objTipoContrato1.disabled = true;
		objTipoContrato2.disabled = true;
		objTipoContrato1.checked = "";
		objTipoContrato2.checked = "";
	}
	return "";
}


function cambiarElementosRequeridos(nombreForm){
	var formulario = document.getElementById(nombreForm);
	formElements = formulario.elements;
	for (var i = formElements.length - 1; i > -1; --i){
		formElements[i].required="";
	 }	
}


function cancelarNuevoContacto(nombreForm){
	cambiarElementosRequeridos(nombreForm)
	window.location="proveedores.htm";
}


function verDetalleContacto(strUrl) {
	Modal.open({
		ajaxContent : strUrl,
		width : '55%',
		height : '40%',
		hideClose : true,
		closeAfter : 120
	});
}

/**********************************************************************************************************
 * Validacion de proyectos
 ***********************************************************************************************************/
function verDetalleProyecto(strUrl) {
	Modal.open({
		ajaxContent : strUrl,
		width : '55%',
		height : '90%',
		hideClose : true,
		closeAfter : 120
	});
}
function habilitarEntregaSAI(){
	var objSolicitudInversionYes = document.getElementById("Y");
	var objSolicitudInversionNo = document.getElementById("N");
	var objFechaEntregaSAI = document.getElementById("fechaEntregaSAI");
	objFechaEntregaSAI.disabled = false;
	objFechaEntregaSAI.required="required";
	return null;
}
function deshabilitarEntregaSAI(){
	var objSolicitudInversionYes = document.getElementById("Y");
	var objSolicitudInversionNo = document.getElementById("N");
	var objFechaEntregaSAI = document.getElementById("fechaEntregaSAI");
	objFechaEntregaSAI.disabled = true;
	objFechaEntregaSAI.required="";
	return null;
}
function calcularFinProyectoEstimado(){
	var objDiasDuracionProyecto = document.getElementById("duracionProy");
	var intDiasDuracionProyecto
	if(validarNumero(objDiasDuracionProyecto.value)){
		intDiasDuracionProyecto = parseInt(objDiasDuracionProyecto.value);
	}else{
		alert("La duracion de proyecto debe ser numero");
	}
	var objFechaInicioReal = document.getElementById("inicioReal");
	strFecha = objFechaInicioReal.value;
	if(validarFechaFormato(strFecha)){
		var fechaInicialArray = strFecha.split("/");
		var dia  = parseInt(fechaInicialArray[0]);  
		var mes = parseInt(fechaInicialArray[1]);  
		var anio = parseInt(fechaInicialArray[2]); 
		var dteFechaInicial = new Date(anio,mes,dia);
		//Se agrega la duracion del proyecto
		dteFechaInicial.setDate(dteFechaInicial.getDate()+intDiasDuracionProyecto);
		document.getElementById("finEstimado").value = formateoFecha(dteFechaInicial);
	}else{
		alert("El formato de la fecha es incorrecto, por favor verifiquelo");
	}
	return null;
}

/**********************************************************************************************************
 * Validacion de proveedores
 ***********************************************************************************************************/
function verDetalleProveedor(strUrl) {
	Modal.open({
		ajaxContent : strUrl,
		width : '50%',
		height : '40%',
		hideClose : true,
		closeAfter : 120
	});
}


/**********************************************************************************************************
 * Validacion de concursos
 ***********************************************************************************************************/
function cancelarActualizacionConcursos(){
	window.location="proyectos.htm";
}

/**********************************************************************************************************
 * Validacion de tipos de datos
 ***********************************************************************************************************/
function validarFechaFormato(strFecha){
	var dateformat = /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/;  
	if(strFecha.match(dateformat)){
		return true;
	}else{
		return false;
	}
}
function validarNumero(strNumero){  
   var numbers = /^[0-9]+$/;  
   if(strNumero.match(numbers)){      
	   return true;  
   }else  {  
	   return false;  
   }  
}

/**
 * Formateo de fechas
 * objDate = Objeto de tipo new Date()
 * */
function formateoFecha(objDate) {
	return objDate.getDate()  + "/" + objDate.getMonth() + "/" + objDate.getFullYear();
}

/*
 * formElements = nuevoDocumentoForm.elements; for (var i = formElements.length -
 * 1; i > -1; --i){ if(formElements[i].id == "tipoObra1" || formElements[i].id ==
 * "tipoObra2"){ } }
 */


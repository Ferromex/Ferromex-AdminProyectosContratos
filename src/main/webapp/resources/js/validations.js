

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
		width : '60%',
		height : '40%',
		hideClose : true,
		closeAfter : 10
	});
}






/*
 * formElements = nuevoDocumentoForm.elements; for (var i = formElements.length -
 * 1; i > -1; --i){ if(formElements[i].id == "tipoObra1" || formElements[i].id ==
 * "tipoObra2"){ } }
 */


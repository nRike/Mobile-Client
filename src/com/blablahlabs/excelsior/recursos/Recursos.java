package com.blablahlabs.excelsior.recursos;



public class Recursos {

	public static final String APP = "EXCELSIOR";
	
	public static final String URL_GENERAL = "http://www.excelsior.com.mx/iPad/jsonGET.txt";
	
	public static final String URL_NOTA_DETALLE_INTRO = "http://excelsior.com.mx/iPad/?mode=single&notaid=";
	public static final String URL_NOTA_DETALLE_OUTTRO = "&json=1";
	
	public static final String URL_IMAGEN_NOTA_INTRO = "http://www.excelsior.com.mx/Media/640x129_";
	public static final String URL_IMAGEN_NOTA_LISTA_INTRO = "http://www.excelsior.com.mx/Media/195x312_";
	public static final String URL_IMAGEN_NOTA_OUTTRO = ".jpg";
	

	public static final String URL_GALERIA_FOTOS = "http://excelsior.com.mx/iPad/?mode=getGallery&galleryID=";
	
	public static final String URL_FOTO = "http://www.excelsior.com.mx/Media/";
	
	public static final String URL_FOTO_OPINION = "http://www.excelsior.com.mx/Media/opinion/";
	
	public static final String URL_VIDEOS = "http://148.240.229.64/Video/";
	
	public static final String ERROR_NOTA = "Al parecer no tienes conexi�n a internet. Int�ntalo m�s tarde.";

	public static final String COMPARTIR_HOME = "Yo estoy informado con Excelsior para Android t.co/iw7OGI6";
	
	public static final String TITULO_COMPARTIR = "Compartir en";
	
	public static final String COMPARTIR_NOTA = "Yo estoy informado con Excelsior para Android t.co/iw7OGI6";

	public static final String TITULO_PROGRESSDIALOG = "Actualizando";
	
	public static final String MENSAJE_PROGRESSDIALOG = "Actualizando contenido";
	
	public static enum Seccion {
	    ULTIMA_HORA, NACIONAL, GLOBAL, DINERO, 
	    COMUNIDAD, ADRENALINA, FUNCION, OPINION 
	}
	
	public static enum ListaNota {
	    SECCION, OPINION 
	}
	
	
}

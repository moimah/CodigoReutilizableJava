	    /**
		 * Metodo escribe en fichero de texto, 		
		 * el contenido de un String
		 * Devuelve true si se ha escrito correctamente
		 * @param path
		 * @return exito
		 */   
	    
	    private boolean escribirContenidoFichero(String path) {
	    	
	    	boolean exito = false;
	    	
	    	String modificado = model.getSp_contenidoText(); //Fuente
	    	File fich = new File(path);
	    	
	    	try {
				FileWriter fw = new FileWriter(fich);
				fw.write(modificado);
				fw.close();
				exito = true; 				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	    	

	    	return exito; 
	    	
	    }
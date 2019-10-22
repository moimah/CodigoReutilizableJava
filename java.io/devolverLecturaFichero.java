		/**
		 * Metodo que permite leer fichero de texto y
		 * almacenar su contenido en un String
		 * Recibe un String con la ruta del fichero
		 * Devuelve String con contenido del fichero
		 * @param path
		 * @return lectura
		 */
	    
	    
	    private String devolverLecturaFichero(String path) {
	    	
	    	String lectura = ""; //Variable de retorno
	    	
	    	File fich = new File(path); //Objeto file de la ruta
	    	try {
	    		//Streams
				FileReader fr = new FileReader(fich); 
				BufferedReader br = new BufferedReader(fr);
				
				String linea  = br.readLine();	//Almaceamos primera linea		
				//Almacenamos contenido en lectura incluimos salto de linea para concevar formato
				lectura = lectura + linea + "\n"; 
				while(linea!=null) { //Mientras haya contenido					
					linea = br.readLine();
					if(linea!=null) { //Si hay linea
					lectura = lectura + linea + "\n"; //Almacenamos
					}					
					
					//model.setSp_contenidoText(lectura);
				}
				//Cerrar Streams
				fr.close();
				br.close();
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	    	
	    	return lectura;
	    	
	    }
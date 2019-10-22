	   /**
	   * Metodo para borrar una carpeta recursivamente
	   * Recibe por parametro path de File a eliminar
	   * Realiza borado recursivo en caso de que tenga más carpetas
	   * @param fileDel 		
	   * @return exito
	   */
	    private boolean borrarFileRecursivamente(String path) {
	    	
	    	boolean exito = false;
	    	
	    	File fileDel = new File(path);
	    	
	    	System.out.println("La ruta a borrar es " + path);
	        if(fileDel.isDirectory()){         
	           
	        	// Si no tiene contenido borrar
	            if(fileDel.list().length == 0) { 
	            	 fileDel.delete();	
	            	 exito = true;
	            }  else{     // Si tiene contenido borrado recursivo                      	
	           
	               
	               for (String temp : fileDel.list()) { 
	                   File fileDelete = new File(fileDel, temp); 
	                   //Borardo recursivo llamando al propio metodo
	                   borrarFileRecursivamente(fileDelete.getPath());
	                   exito = true;
	               }

	               //Comprobar de nuevo el directorio, si esta vacio eliminar
	               
	               if(fileDel.list().length==0)
	                   fileDel.delete();
	               	exito = true;
	              
	            }

	        }else{  //Si es archivo borrar	           
	           
	            fileDel.delete(); 
	            exito = true;
	        }
	        
	        return exito;
	    }
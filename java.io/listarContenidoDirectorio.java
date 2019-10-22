	/**
	 * Metodo que permite listar contenido de un directorio
	 * Recibe un String con la ruta del fichero
	 * Devuelve true si el fichero tiene contenido
	 * @param path
	 * @return exito
	 */

	private Boolean listarContenidoCarpeta(String path) {

		Boolean exito = false; // Variable de return
		
		model.getNombres().clear();

		File directorio = new File(path); // Obj File a partir del path

		// Almacenamos en un String array los ficheros que hay dentro de la ruta
		String[] ficheros = directorio.list();

		if (ficheros != null) { // Si hay ficheros
			for (int i = 0; i < ficheros.length; i++) {				
				System.out.println(ficheros[i]);
			}

			exito = true;
		}

		return exito;

	}
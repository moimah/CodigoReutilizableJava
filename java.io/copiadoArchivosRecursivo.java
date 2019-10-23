	   /**
	 * Metodo que realiza el copiado recursivo de ficheros y diectorios
	 * Recibe un parametro File de origen y otro File de destino
	 * Verifica que no exista el directorio o fichero
	 * Realizad el copiado o copiado recursivo según el caso
	 * Devuelve true si se ha copiado y false si no se ha podido
	 * @param d1
	 * @param d2
	 * @return fichero
	 */

	private boolean copiadoRecursivo(File d1, File d2) {

		boolean exito = false;

		// Parte del copiado recursivo de directorio
		if (d1.isDirectory()) { // Si el origen es un directorio
			// Recorremos recursivamente el directorio
			if (!d2.exists()) { // Y no existe
				d2.mkdir(); // Crear
				System.out.println("Creando directorio " + d2.toString());
				String[] ficheros = d1.list(); // Lista de ficheros que contiene el directorio
				for (int x = 0; x < ficheros.length; x++) { // Bucle de copiado recursivo llamando al propio metodo
					copiadoRecursivo(new File(d1, ficheros[x]), new File(d2, ficheros[x]));
				}
				exito = true;
			}
		} else {

			if (d1.exists() && !d2.exists()) { // Si existe el fichero y no existe en el origen

				try {
					// Streams de E/S

					InputStream in = new FileInputStream(d1);
					OutputStream out = new FileOutputStream(d2);

					byte[] buf = new byte[1024];
					int len;

					while ((len = in.read(buf)) > 0) {
						out.write(buf, 0, len);
					}

					in.close();
					out.close();
					exito = true;

				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}

		return exito;
	}
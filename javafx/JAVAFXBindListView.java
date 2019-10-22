		/**
	   * Binds para listView basado en MVC
	   */
	
	//View
	
	
	
	//Model
	private ListProperty<String>  nombres = new SimpleListProperty<String>(FXCollections.observableArrayList());
	private StringProperty seleccionado = new SimpleStringProperty();
	
			**Incluir JavaFX getters and setters**
	
	//Controller
	view.getLv_Listado().itemsProperty().bind(model.nombresProperty());
	model.seleccionadoProperty().bind(view.getLv_Listado().getSelectionModel().selectedItemProperty());
	
		
	
	
		//Controller methods operacioes
		
		model.getNombres().add("registro_1"); // Añadir ficheros
		String seleccionado = model.seleccionadoProperty().get(); // Recoge el elemento seleccionado
		nombres.remove(seleccionado.get()); //Borrar el elemento seleccionado
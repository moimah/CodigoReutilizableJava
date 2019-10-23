	  /**
	 * Bloque de codigo con los Alert más comunes
	 * Information, Warning, Error, Confirmation, Exception Alert
	 */		
					
//Information

Alert alert = new Alert(AlertType.INFORMATION);
alert.setTitle("Information Dialog");
alert.setHeaderText("Look, an Information Dialog");
alert.setContentText("I have a great message for you!");

alert.showAndWait();

//Warning

Alert alert = new Alert(AlertType.WARNING);
alert.setTitle("Warning Dialog");
alert.setHeaderText("Look, a Warning Dialog");
alert.setContentText("Careful with the next step!");

alert.showAndWait();

//ERROR

	Alert alert = new Alert(AlertType.ERROR);
	alert.setTitle("Error Dialog");
	alert.setHeaderText("Look, an Error Dialog");
	alert.setContentText("Ooops, there was an error!");

	alert.showAndWait();
	
	
//CONFIRM

	Alert alert = new Alert(AlertType.CONFIRMATION);
	alert.setTitle("Confirmation Dialog");
	alert.setHeaderText("Look, a Confirmation Dialog");
	alert.setContentText("Are you ok with this?");

	Optional<ButtonType> result = alert.showAndWait();
	if (result.get() == ButtonType.OK){
		// ... user chose OK
	} else {
		// ... user chose CANCEL or closed the dialog
	}

//EXCEPTION

	Alert alert = new Alert(AlertType.ERROR);
	alert.setTitle("Exception Dialog");
	alert.setHeaderText("Look, an Exception Dialog");
	alert.setContentText("Could not find file blabla.txt!");

	Exception ex = new FileNotFoundException("Could not find file blabla.txt");

	// Create expandable Exception.
	StringWriter sw = new StringWriter();
	PrintWriter pw = new PrintWriter(sw);
	ex.printStackTrace(pw);
	String exceptionText = sw.toString();

	Label label = new Label("The exception stacktrace was:");

	TextArea textArea = new TextArea(exceptionText);
	textArea.setEditable(false);
	textArea.setWrapText(true);

	textArea.setMaxWidth(Double.MAX_VALUE);
	textArea.setMaxHeight(Double.MAX_VALUE);
	GridPane.setVgrow(textArea, Priority.ALWAYS);
	GridPane.setHgrow(textArea, Priority.ALWAYS);

	GridPane expContent = new GridPane();
	expContent.setMaxWidth(Double.MAX_VALUE);
	expContent.add(label, 0, 0);
	expContent.add(textArea, 0, 1);

	// Set expandable Exception into the dialog pane.
	alert.getDialogPane().setExpandableContent(expContent);

	alert.showAndWait();
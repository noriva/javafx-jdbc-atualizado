package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemVendedorAction() {
		
		System.out.println("vendedor funcionado");
		
	}
	
	@FXML
	public void onMenuItemDepartamentoAction() {
		
		System.out.println("departamentp funcionado");
		
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		
		System.out.println("about funcionado");
		
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

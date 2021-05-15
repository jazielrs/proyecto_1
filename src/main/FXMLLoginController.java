/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Cristopher.za
 */
public class FXMLLoginController implements Initializable {

    @FXML
    private AnchorPane fondo;
    @FXML
    private AnchorPane fondoB;
    @FXML
    private TextField fieldUserName;
    @FXML
    private TextField fieldPass;
    @FXML
    private Button Login;
    @FXML
    private Button Cancel;
    @FXML
    private ImageView imageView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jaziel Rojas
 */
public class FXMLMENUController implements Initializable {

    @FXML
    private Button btnHome;
    @FXML
    private Button btnExit;
    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;
    @FXML
    private Button btnCheckParenthesis;
    @FXML
    private Button btnConverter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void home(MouseEvent event) {//Regresa al pane general
       this.bp.setCenter(ap);
    }
    
     @FXML
    private void checkParenthesis(MouseEvent event) {
        this.loadPage("FXMLPage1");
    }

    @FXML
    private void converter(MouseEvent event) {
        this.loadPage("FXMLPage2");
    }
    
    @FXML
    private void exit(MouseEvent event) {//Sale del Scene completamente == (System.exit(0))
       Stage stage = (Stage) this.btnExit.getScene().getWindow();//Convierte el boton en stage y lo cierra
       stage.close();
    }
        
    private void loadPage(String page){//Realiza una carga de una pagina generica
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(page+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLMENUController.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.bp.setCenter(root);//Realiza la asignacion de la nueva pagina al menu principal
        
    }

}

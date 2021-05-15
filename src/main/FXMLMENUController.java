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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
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

    private Button btnExit;
    @FXML
    private BorderPane bp;
    @FXML
    private MenuItem addCarrer;
    @FXML
    private MenuItem modifyCarrer;
    @FXML
    private MenuItem eraseCarrer;
    @FXML
    private MenuItem showCarrer;
    @FXML
    private MenuItem addStudent;
    @FXML
    private MenuItem modifyStudent;
    @FXML
    private MenuItem eraseStudent;
    @FXML
    private MenuItem showStudent;
    @FXML
    private MenuItem addCourse;
    @FXML
    private MenuItem eraseCourse;
    @FXML
    private MenuItem showCourse;
    @FXML
    private MenuItem sheduleShow;
    @FXML
    private MenuItem makeEnrollment;
    @FXML
    private MenuItem removeCourse;
    @FXML
    private MenuItem reportEnrollment;
    @FXML
    private MenuItem deEnrollmentReport;
    @FXML
    private MenuItem modifyCourse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
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

    @FXML
    private void addCarrer(ActionEvent event) {
        loadPage("FXMLAddCareer");
    }

    @FXML
    private void modifyCarrer(ActionEvent event) {
        loadPage("FXMLModifyCareer");
    }

    @FXML
    private void eraseCarrer(ActionEvent event) {
        loadPage("FXMLEraseCareer");
    }

    @FXML
    private void showCarrer(ActionEvent event) {
        loadPage("FXMLShowCareer");
    }

    @FXML
    private void addStudent(ActionEvent event) {
        loadPage("FXMLAddStudents");
    }

    @FXML
    private void modifyStudent(ActionEvent event) {
        loadPage("FXMLModifyStudents");
    }

    @FXML
    private void eraseStudent(ActionEvent event) {
        loadPage("FXMLEraseStudents");
    }

    @FXML
    private void showStudent(ActionEvent event) {
        loadPage("FXMLShowStudents");
    }

    @FXML
    private void addCourse(ActionEvent event) {
        loadPage("FXMLAddCourse");
    }


    @FXML
    private void eraseCourse(ActionEvent event) {
        loadPage("FXMLEraseCourses");
    }

    @FXML
    private void showCourse(ActionEvent event) {
        loadPage("FXMLShowCourses");
    }

    @FXML
    private void sheduleShow(ActionEvent event) {
        loadPage("FXMLShowSchedule");
    }

    @FXML
    private void makeEnrollment(ActionEvent event) {
        loadPage("FXMLEnrollmentOptions");
    }

    @FXML
    private void removeCourse(ActionEvent event) {
        loadPage("FXMLEraseCourses");
    }

    @FXML
    private void reportEnrollment(ActionEvent event) {
        loadPage("FXMLEnrollmentReport");
    }

    @FXML
    private void deEnrollmentReport(ActionEvent event) {
        loadPage("FXMLDeenrollmentReport");
    }

    @FXML
    private void modifyCourse(ActionEvent event) {
        loadPage("FXMLModifyCourses");
    }

}

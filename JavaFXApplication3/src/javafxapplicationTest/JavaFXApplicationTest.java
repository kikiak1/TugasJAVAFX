/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationTest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class JavaFXApplicationTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button rgs = new Button("Register");
        Label fn = new Label("First Name ");
        Label ln = new Label("Last Name ");
        Label em = new Label("E-Mail Address ");
        Label ct = new Label("Contact No ");
        Label pass = new Label("Password ");
        Label cpass = new Label("Confirm Password ");
        
        TextField tf_fn = new TextField();
        TextField tf_ln = new TextField();
        TextField tf_em = new TextField();
        TextField tf_ct = new TextField();
        TextField tf_pass = new TextField();
        TextField tf_cpass = new TextField();
        
        tf_fn.setPrefWidth(200);
        tf_ln.setPrefWidth(200);
        tf_em.setPrefWidth(200);
        tf_ct.setPrefWidth(200);
        tf_pass.setPrefWidth(200);
        tf_cpass.setPrefWidth(200);
        
        HBox hbox_fn = new HBox();
        HBox hbox_ln = new HBox();
        HBox hbox_em = new HBox();
        HBox hbox_ct = new HBox();
        HBox hbox_pass = new HBox();
        HBox hbox_cpass = new HBox();

        VBox vbox_FieldHolder = new VBox();
        
        hbox_fn.getChildren().addAll(fn, tf_fn);
        hbox_fn.setSpacing(50);
        hbox_ln.getChildren().addAll(ln, tf_ln);
        hbox_ln.setSpacing(51);
        hbox_em.getChildren().addAll(em, tf_em);
        hbox_em.setSpacing(29);
        hbox_ct.getChildren().addAll(ct, tf_ct);
        hbox_ct.setSpacing(49);
        hbox_pass.getChildren().addAll(pass, tf_pass);
        hbox_pass.setSpacing(59);

        hbox_cpass.getChildren().addAll(cpass, tf_cpass);
        hbox_cpass.setSpacing(14);
        vbox_FieldHolder.getChildren().addAll(hbox_fn, hbox_ln, hbox_em,
        hbox_ct, hbox_pass, hbox_cpass);
        vbox_FieldHolder.setSpacing(10);
        vbox_FieldHolder.setLayoutX(50);
        vbox_FieldHolder.setLayoutY(50);
        Group group = new Group();
        TilePane tp_panell = new TilePane();

        tp_panell.getChildren().addAll(rgs);
        rgs.setStyle("-fx-background-color: #89CFF0; ");

        tp_panell.setLayoutX(175);
        tp_panell.setLayoutY(275);

        group.getChildren().addAll(vbox_FieldHolder, tp_panell);

        Scene scene = new Scene(group, 400, 325);
        scene.setFill(Color.WHITE);

        
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

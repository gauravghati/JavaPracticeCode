package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    public void onButtonClicked(ActionEvent e){
        if(e.getSource().equals(helloButton)) {
            System.out.println("Hello, " + nameField.getText());
        }else if(e.getSource().equals(byeButton)){
            System.out.println("Bye, "+nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            ourLabel.setText("We did it.");
                        }
                    });
                }catch(InterruptedException event){
                    //we will do nothing
                }
            }
        };

        new Thread(task).start();

        if(ourCheckBox.isSelected()){
            nameField.clear();
            byeButton.setDisable(true);
            helloButton.setDisable(true);
        }
    }

    public void handleChange(){
        System.out.println("The CheckBox is : "+(ourCheckBox.isSelected()? "checked" : "not Checked"));
    }

    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean displayButton = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(displayButton);
        byeButton.setDisable(displayButton);
    }
}

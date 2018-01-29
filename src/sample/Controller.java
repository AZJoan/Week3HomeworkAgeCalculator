package sample;
//load and greet user with a "Hello"
//prompt with an entry field asking them their name
//then 'Confirm' button is clicked-prompt for their age
//Clicking the 'Confirm' button again should move to ask current year
//click 'Confirm' button final time-show age in 1 year, 5 yrs, 10 yrs
//button at the bottom of the application in the final view resets the application

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Controller {
    @FXML
    private Button confirmButton;

    @FXML
    private Button resetButton;

    @FXML
    private Text oneText;

    @FXML
    private Text fiveText;

    @FXML
    private Text tenText;

    @FXML
    private Text helloText;

    @FXML
    private TextField userInput;

    @FXML
    private Text resultText;

    public int clickcounter = 0;
    public String saveName = "";
    public String saveAge = "";
    public String saveYear = "";

    public void clickedConfirm(ActionEvent actionEvent) {
        clickcounter++;
        //System.out.println("counter " + clickcounter);

        if (clickcounter == 1) {
            saveName = userInput.getText();
            userInput.setText("Age");
        } else if(clickcounter == 2) {
            saveAge = userInput.getText();
            userInput.setText("Current Year");
        } else if(clickcounter == 3) {
            saveYear = userInput.getText();
            userInput.setText(" ");

        int iAge = Integer.parseInt(saveAge);
        int iYear = Integer.parseInt(saveYear);

        int oneAge = iAge + 1;
        int fiveAge = iAge + 5;
        int tenAge = iAge + 10;

        int oneYr = iYear + 1;
        int fiveYr = iYear + 5;
        int tenYr = iYear + 10;

        resultText.setText(saveName + "! Here are your results!");
        resultText.setUnderline(true);
        oneText.setText("Your age in year " + oneYr + " will be  " + oneAge + " old.");
        fiveText.setText("Your age in year " + fiveYr + " will be " + fiveAge + " old.");
        tenText.setText("Your age in year " + tenYr + " will be  " + tenAge + " old.");
    }  // end if
        } // end confirm button

    public void clickedReset(ActionEvent actionEvent){
           userInput.setText("Name");
           helloText.setText("Please enter your information and click Confirm");
            resultText.setText("");
            oneText.setText("Age in one year:");
            fiveText.setText("Age in five years:");
            tenText.setText("Age in ten years:");
            clickcounter = 0;

    }

}
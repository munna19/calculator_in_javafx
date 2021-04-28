package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import java.lang.Math;
//import static java.lang.Math.sqrt;
/*
     #####     #####     #####
     @author: Abdul Al Mamun (Munna)
     #####     #####     #####
*/

public class Controller implements Initializable {

    Boolean start = true;
    String operator = "";
    double num1 = 0;

    @FXML
    private Label show_result_id;

    @FXML
    void All_clear_button_Action(ActionEvent event) {
        show_result_id.setText("");
        start=true;
    }

    @FXML
    void Calculation_result_Button_Action(ActionEvent event) {
        double num2 = Double.parseDouble(show_result_id.getText());

        if(operator.equals("+")){
            show_result_id.setText(""+(num1+num2));
        }

        else if(operator.equals("-")){
            show_result_id.setText(""+(num1-num2));
        }

        else if(operator.equals("X")){
            show_result_id.setText(""+(num1*num2));
        }

        else if(operator.equals("/")){
            if(num2==0) show_result_id.setText("Invalid Input!!");
            show_result_id.setText(""+(num1/num2));

        }

        start = true;
    }


    @FXML
    void Clear_Button_Action(ActionEvent event) {
        String oldText = show_result_id.getText();
        if(!oldText.equals("")){
            String subText = oldText.substring(0 , oldText.length()-1 );
            show_result_id.setText(subText);
        }
    }

    @FXML
    void Dot_Button_Action(ActionEvent event) {
        String oldText = show_result_id.getText();

        if(oldText.contains(".")) return;

        show_result_id.setText(oldText+".");
        start = false;
    }

    @FXML
    void Numeric_value_button_Action(ActionEvent eventNumeric) {
        if(start == true){
            show_result_id.setText("");
            start = false;
        }


        String oldText = show_result_id.getText();
        String newText = ((Button)eventNumeric.getSource()).getText();
        String number = oldText + newText;
        show_result_id.setText(number);
    }

    @FXML
    void Operator_button_Action(ActionEvent eventOperator) {
        num1 = Double.parseDouble(show_result_id.getText());

        //if((double p = Double.parseDouble(show_result_id.getText())) == 0 ) return;
        //if(show_result_id.getText()==null) return;

        operator = ((Button)eventOperator.getSource()).getText();

        show_result_id.setText("");

    }

    @FXML
    void Percentage_button_Action(ActionEvent event) {
        double num2 = Double.parseDouble(show_result_id.getText());
        double percentage = (num1 * (num2 / 100));

        if(operator.equals("X")){
            show_result_id.setText(""+ percentage);
        }
        if(operator.equals("+")){
            show_result_id.setText(""+(num1+num2));
        }

        else if(operator.equals("-")){
            show_result_id.setText(""+(num1-num2));
        }

        /*else if(operator.equals("X")){
            show_result_id.setText(""+(num1*num2));
        } */

        else if(operator.equals("/")){
            if(num2==0) show_result_id.setText("Invalid Input!!");
            show_result_id.setText(""+(num1/num2));

        }

        start = true;
    }

    @FXML
    void Root_button_Action(ActionEvent event) {
        num1 = Double.parseDouble(show_result_id.getText());
        double r = Math.sqrt(num1);
        //System.out.println(r);
        show_result_id.setText(""+r);
        start = true;
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

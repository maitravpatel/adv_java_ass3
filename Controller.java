package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller<inputText> implements Initializable {

    @FXML
    private AnchorPane input;

    @FXML
    private Button calculate;

    @FXML
    private TextField userDisplay;

    @FXML
    private Label A;

    @FXML
    private Button a;

    @FXML
    private Label B;

    @FXML
    private Button b;

    @FXML
    private Label C;

    @FXML
    private Button c;

    @FXML
    private Label D;

    @FXML
    private Button d;

    @FXML
    private Label E;

    @FXML
    private Button e;

    @FXML
    private Label F;

    @FXML
    private Button f;

    @FXML
    private Label J;

    @FXML
    private Button j;

    @FXML
    private Label K;

    @FXML
    private Button k;

    @FXML
    private Label L;

    @FXML
    private Button l;

    @FXML
    private Label M;

    @FXML
    private Button m;

    @FXML
    private Label N;

    @FXML
    private Button n;

    @FXML
    private Label O;

    @FXML
    private Button o;

    @FXML
    private Label G;

    @FXML
    private Button g;

    @FXML
    private Label H;

    @FXML
    private Button h;

    @FXML
    private Label I;

    @FXML
    private Button i;

    @FXML
    private Label P;

    @FXML
    private Button p;

    @FXML
    private Label Q;

    @FXML
    private Button q;

    @FXML
    private Button r;

    @FXML
    private Label R;

    @FXML
    private Button s;

    @FXML
    private Button t;

    @FXML
    private Button u;

    @FXML
    private Button v;

    @FXML
    private Button w;

    @FXML
    private Button x;

    @FXML
    private Button y;

    @FXML
    private Button z;

    @FXML
    private Label S;

    @FXML
    private Label T;

    @FXML
    private Label U;

    @FXML
    private Label V;

    @FXML
    private Label W;

    @FXML
    private Label X;

    @FXML
    private Label Y;

    @FXML
    private Label Z;

    @FXML
    private Label point;

    @FXML
    private Label history;

    @FXML
    private Button restart;

    @FXML
    private Label error;

    String inputText = "", disHis = "";
    int checkUpperWord = 1;
    boolean checkVowel = false, checkFilledWord = false, checkLowerWord =true;
    int totalScore = 0;

    ArrayList<String> History = new ArrayList<>();


    int[] TreasureBox1 = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
    int[] TreasureBox2 = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};



    @FXML
    private void alphabetButton(ActionEvent event) {

        if(checkUpperWord<=8)
        {
            if(event.getSource() == a){
                checkUpperWord++;
                inputText += a.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == b){
                checkUpperWord++;
                inputText += b.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == c){
                checkUpperWord++;
                inputText += c.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == d){
                checkUpperWord++;
                inputText += d.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == e){
                checkUpperWord++;
                inputText += e.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == f){
                checkUpperWord++;
                inputText += f.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == g){
                checkUpperWord++;
                inputText += g.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == h){
                checkUpperWord++;
                inputText += h.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == i){
                checkUpperWord++;
                inputText += i.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == j){
                checkUpperWord++;
                inputText += j.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == k){
                checkUpperWord++;
                inputText += k.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == l){
                checkUpperWord++;
                inputText += l.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == m){
                checkUpperWord++;
                inputText += m.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == n){
                checkUpperWord++;
                inputText += n.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == o){
                checkUpperWord++;
                inputText += o.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == p){
                checkUpperWord++;
                inputText += p.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == q) {
                checkUpperWord++;
                inputText += q.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == r){
                checkUpperWord++;
                inputText += r.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == s){
                checkUpperWord++;
                inputText += s.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == t){
                checkUpperWord++;
                inputText += t.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == u){
                checkUpperWord++;
                inputText += u.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == v){
                checkUpperWord++;
                inputText += v.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == w){
                checkUpperWord++;
                inputText += w.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == x){
                checkUpperWord++;
                inputText += x.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == y){
                checkUpperWord++;
                inputText += y.getText().charAt(0);
                userDisplay.setText(inputText);
            }
            else if(event.getSource() == z) {
                checkUpperWord++;
                inputText += z.getText().charAt(0);
                userDisplay.setText(inputText);
            }

        }
        else {
            error.setText("Sorry, Max 8 chars only!");
        }
    }

    @FXML
    void calculateButton(ActionEvent event) {

        checkFilledWord = true;
        checkVowel= false;
        checkLowerWord = true;


        //System.out.println(userDisplay.getText());
        Model model;
        if(inputText == ""){
            model = new Model(userDisplay.getText());

            for (int i =0; i<userDisplay.getText().length(); i++)
            {
                if (userDisplay.getText().charAt(i) == 'A' || userDisplay.getText().charAt(i) == 'E' || userDisplay.getText().charAt(i) == 'I' || userDisplay.getText().charAt(i) == 'O' || userDisplay.getText().charAt(i) == 'U' || userDisplay.getText().charAt(i) == 'Y'){
                    checkVowel = true;
                }
            }

            if(!checkVowel){
                error.setText("Vowels please !! ");
            }

            if(userDisplay.getText().isEmpty()){
                error.setText("Something is fishy!!!");
                checkFilledWord = false;
            }
            if(userDisplay.getText().length() < 2){
                error.setText("enter some more words, this is too small");
                checkLowerWord = false;
            }

        }
        else {
            model = new Model(inputText);

            for (int i =0; i<inputText.length(); i++)
            {
                if (inputText.charAt(i) == 'A' || inputText.charAt(i) == 'E' || inputText.charAt(i) == 'I' || inputText.charAt(i) == 'O' || inputText.charAt(i) == 'U' || inputText.charAt(i) == 'Y'){
                    checkVowel = true;
                }
            }

            if(!checkVowel){
                error.setText("Vowels please !! ");
            }

            if(inputText.isEmpty()){
                error.setText("Something is fishy!!!");
                checkFilledWord = false;
            }
            if(inputText.length() < 2){
                error.setText("enter some more words, this is too small");
                checkLowerWord = false;
            }
        }


        try
        {
            model.validateInput();
        }
        catch (Exception e){
            error.setText(e.getMessage());
        }


        if(checkFilledWord  && checkVowel && checkLowerWord){

            History.add(inputText);
            disHis += inputText + ", ";
            userDisplay.setText("");

            for (int i = 0; i< inputText.length(); i++){
                if (inputText.charAt(i) == 'A'){
                    TreasureBox1[0]--;
                    A.setText(String.valueOf(TreasureBox1[0]));
                    totalScore += 1;
                    if(TreasureBox1[0] <=0)
                        a.setDisable(true);
                }
                if(inputText.charAt(i) == 'B'){
                    TreasureBox1[1]--;
                    B.setText(String.valueOf(TreasureBox1[1]));
                    totalScore += 3;
                    if(TreasureBox1[1] <=0)
                        b.setDisable(true);
                }
                if(inputText.charAt(i) == 'C'){
                    TreasureBox1[2]--;
                    C.setText(String.valueOf(TreasureBox1[2]));
                    totalScore += 3;
                    if(TreasureBox1[2] <=0)
                        c.setDisable(true);
                }
                if(inputText.charAt(i) == 'D'){
                    TreasureBox1[3]--;
                    D.setText(String.valueOf(TreasureBox1[3]));
                    totalScore += 2;
                    if(TreasureBox1[3] <=0)
                        d.setDisable(true);
                }
                if(inputText.charAt(i) == 'E'){
                    TreasureBox1[4]--;
                    E.setText(String.valueOf(TreasureBox1[4]));
                    totalScore += 1;
                    if(TreasureBox1[4] <=0)
                        e.setDisable(true);
                }
                if(inputText.charAt(i) == 'F'){
                    TreasureBox1[5]--;
                    F.setText(String.valueOf(TreasureBox1[5]));
                    totalScore += 4;
                    if(TreasureBox1[5] <=0)
                        f.setDisable(true);
                }
                if(inputText.charAt(i) == 'G'){
                    TreasureBox1[6]--;
                    G.setText(String.valueOf(TreasureBox1[6]));
                    totalScore += 2;
                    if(TreasureBox1[6] <=0)
                        g.setDisable(true);
                }
                if(inputText.charAt(i) == 'H'){
                    TreasureBox1[7]--;
                    H.setText(String.valueOf(TreasureBox1[7]));
                    totalScore += 4;
                    if(TreasureBox1[7] <=0)
                        h.setDisable(true);
                }
                if(inputText.charAt(i) == 'I'){
                    TreasureBox1[8]--;
                    I.setText(String.valueOf(TreasureBox1[8]));
                    totalScore += 1;
                    if(TreasureBox1[8] <=0) {
                        this.i.setDisable(true);
                    }
                }
                if(inputText.charAt(i) == 'J'){
                    TreasureBox1[9]--;
                    J.setText(String.valueOf(TreasureBox1[9]));
                    totalScore += 8;
                    if(TreasureBox1[9] <=0)
                        j.setDisable(true);
                }
                if(inputText.charAt(i) == 'K'){
                    TreasureBox1[10]--;
                    K.setText(String.valueOf(TreasureBox1[10]));
                    totalScore += 5;
                    if(TreasureBox1[10] <=0)
                        k.setDisable(true);
                }
                if(inputText.charAt(i) == 'L'){
                    TreasureBox1[11]--;
                    L.setText(String.valueOf(TreasureBox1[11]));
                    totalScore += 1;
                    if(TreasureBox1[11] <=0)
                        l.setDisable(true);
                }
                if(inputText.charAt(i) == 'M'){
                    TreasureBox1[12]--;
                    M.setText(String.valueOf(TreasureBox1[12]));
                    totalScore += 3;
                    if(TreasureBox1[12] <=0)
                        m.setDisable(true);
                }
                if(inputText.charAt(i) == 'N'){
                    TreasureBox1[13]--;
                    N.setText(String.valueOf(TreasureBox1[13]));
                    totalScore += 1;
                    if(TreasureBox1[13] <=0)
                        n.setDisable(true);
                }
                if(inputText.charAt(i) == 'O'){
                    TreasureBox1[14]--;
                    O.setText(String.valueOf(TreasureBox1[14]));
                    totalScore += 1;
                    if(TreasureBox1[14] <=0)
                        o.setDisable(true);
                }
                if(inputText.charAt(i) == 'P'){
                    TreasureBox1[15]--;
                    P.setText(String.valueOf(TreasureBox1[15]));
                    totalScore += 3;
                    if(TreasureBox1[15] <=0)
                        p.setDisable(true);
                }
                if(inputText.charAt(i) == 'Q'){
                    TreasureBox1[16]--;
                    Q.setText(String.valueOf(TreasureBox1[16]));
                    totalScore += 10;
                    if(TreasureBox1[16] <=0)
                        q.setDisable(true);
                }
                if(inputText.charAt(i) == 'R'){
                    TreasureBox1[17]--;
                    R.setText(String.valueOf(TreasureBox1[17]));
                    totalScore += 1;
                    if(TreasureBox1[17] <=0)
                        r.setDisable(true);
                }
                if(inputText.charAt(i) == 'S'){
                    TreasureBox1[18]--;
                    S.setText(String.valueOf(TreasureBox1[18]));
                    totalScore += 1;
                    if(TreasureBox1[18] <=0)
                        s.setDisable(true);
                }
                if(inputText.charAt(i) == 'T'){
                    TreasureBox1[19]--;
                    T.setText(String.valueOf(TreasureBox1[19]));
                    totalScore += 1;
                    if(TreasureBox1[19] <=0)
                        t.setDisable(true);
                }
                if(inputText.charAt(i) == 'U'){
                    TreasureBox1[20]--;
                    U.setText(String.valueOf(TreasureBox1[20]));
                    totalScore += 1;
                    if(TreasureBox1[20] <=0)
                        u.setDisable(true);
                }
                if(inputText.charAt(i) == 'V'){
                    TreasureBox1[21]--;
                    V.setText(String.valueOf(TreasureBox1[21]));
                    totalScore += 4;
                    if(TreasureBox1[21] <=0)
                        v.setDisable(true);
                }
                if(inputText.charAt(i) == 'W'){
                    TreasureBox1[22]--;
                    W.setText(String.valueOf(TreasureBox1[22]));
                    totalScore += 4;
                    if(TreasureBox1[22] <=0)
                        w.setDisable(true);
                }
                if(inputText.charAt(i) == 'X'){
                    TreasureBox1[23]--;
                    X.setText(String.valueOf(TreasureBox1[23]));
                    totalScore += 8;
                    if(TreasureBox1[23] <=0)
                        x.setDisable(true);
                }
                if(inputText.charAt(i) == 'Y'){
                    TreasureBox1[24]--;
                    Y.setText(String.valueOf(TreasureBox1[24]));
                    totalScore += 4;
                    if(TreasureBox1[24] <=0)
                        y.setDisable(true);
                }
                if(inputText.charAt(i) == 'Z'){

                    TreasureBox1[25]--;
                    Z.setText(String.valueOf(TreasureBox1[25]));
                    totalScore += 10;
                    if(TreasureBox1[25] <=0)
                        z.setDisable(true);
                }
            }

            point.setText(String.valueOf(totalScore));
            inputText = "";
            checkUpperWord = 1 ;
            history.setText(disHis);
            error.setText("");

        }

    }


    @FXML
    private void restartButtonPressed(ActionEvent event) {
        for(int i = 0; i< TreasureBox1.length; i++){
            TreasureBox1[i] = TreasureBox2[i];
        }

            a.setDisable(false);
            b.setDisable(false);
            c.setDisable(false);
            d.setDisable(false);
            e.setDisable(false);
            f.setDisable(false);
            g.setDisable(false);
            h.setDisable(false);
            i.setDisable(false);
            j.setDisable(false);
            k.setDisable(false);
            l.setDisable(false);
            m.setDisable(false);
            n.setDisable(false);
            o.setDisable(false);
            p.setDisable(false);
            q.setDisable(false);
            r.setDisable(false);
            s.setDisable(false);
            t.setDisable(false);
            u.setDisable(false);
            v.setDisable(false);
            w.setDisable(false);
            x.setDisable(false);
            y.setDisable(false);
            z.setDisable(false);

        inputText = "";
        disHis = "";
        point.setText("");
        checkUpperWord = 1;
        checkVowel = false;
        checkFilledWord = true;
        checkLowerWord = true;
        totalScore = 0;
        history.setText("");
        error.setText("");
    }




    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO

        A.setText("9");
        B.setText("2");
        C.setText("2");
        D.setText("4");
        E.setText("12");
        F.setText("2");
        G.setText("3");
        H.setText("2");
        I.setText("8");
        J.setText("1");
        K.setText("1");
        L.setText("4");
        M.setText("2");
        N.setText("6");
        O.setText("8");
        P.setText("2");
        Q.setText("1");
        R.setText("6");
        S.setText("4");
        T.setText("6");
        U.setText("4");
        V.setText("2");
        W.setText("2");
        X.setText("1");
        Y.setText("2");
        Z.setText("1");

    }
}

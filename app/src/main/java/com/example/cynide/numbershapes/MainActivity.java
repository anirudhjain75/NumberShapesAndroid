package com.example.cynide.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public boolean checkTriangle(int number) {
        int i = 0, sum = 0;
        while (number >= i){
            sum = sum + i;
            if(number == sum) {
                return true;
            }
            i++;
        }
        return false;
    }

    public void makeToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void numberShape(View view) {
        EditText numberEntered = (EditText) findViewById(R.id.numberEntered);
        if(numberEntered.getText().toString().isEmpty()){
            makeToast("Enter a number");
        } else {
            int number = Integer.parseInt(numberEntered.getText().toString());
            int temp = (int) Math.sqrt(number);
            if (Math.pow(temp, 2) == number && checkTriangle(number)){
                makeToast("It is both triangular and square");
            } else if (Math.pow(temp, 2) == number){
                makeToast("It is a square number");
            } else if(checkTriangle(number)){
                makeToast("It is a triangular number");
            } else {
                makeToast("It is neither triangular nor square");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

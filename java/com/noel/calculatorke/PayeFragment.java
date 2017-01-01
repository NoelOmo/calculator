package com.noel.calculatorke;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class PayeFragment extends Fragment {

    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnClear;
    private Button btnFifteenPercent;
    private TextView grossSalary, taxBracket;


    public PayeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_paye, container, false);

        grossSalary = (TextView) view.findViewById(R.id.grossSalary);
        taxBracket = (TextView) view.findViewById(R.id.tax_bracket);

        btnFifteenPercent = (Button) view.findViewById(R.id.btn_15_percent);

        btnZero = (Button) view.findViewById(R.id.btn_number_zero);
        btnOne = (Button) view.findViewById(R.id.btn_number_one);
        btnTwo = (Button) view.findViewById(R.id.btn_number_two);
        btnThree = (Button) view.findViewById(R.id.btn_number_three);
        btnFour = (Button) view.findViewById(R.id.btn_number_four);
        btnFive = (Button) view.findViewById(R.id.btn_number_five);
        btnSix = (Button) view.findViewById(R.id.btn_number_six);
        btnSeven = (Button) view.findViewById(R.id.btn_number_seven);
        btnEight = (Button) view.findViewById(R.id.btn_number_eight);
        btnNine = (Button) view.findViewById(R.id.btn_number_nine);
        btnClear = (Button) view.findViewById(R.id.btn_clear);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "0");
                }else{
                    grossSalary.setText(grossSalary.getText() + "0");
                    updatePercentage();
                }
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "1");
                }else{
                    grossSalary.setText(grossSalary.getText() + "1");
                    updatePercentage();
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "2");
                }else{
                    grossSalary.setText(grossSalary.getText() + "2");
                    updatePercentage();
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "3");
                }else{
                    grossSalary.setText(grossSalary.getText() + "3");
                    updatePercentage();
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "4");
                }else{
                    grossSalary.setText(grossSalary.getText() + "4");
                    updatePercentage();
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "5");
                }else{
                    grossSalary.setText(grossSalary.getText() + "5");
                    updatePercentage();
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "6");
                }else{
                    grossSalary.setText(grossSalary.getText() + "6");
                    updatePercentage();
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "7");
                }else{
                    grossSalary.setText(grossSalary.getText() + "7");
                    updatePercentage();
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "8");
                }else{
                    grossSalary.setText(grossSalary.getText() + "8");
                    updatePercentage();
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grossSalary.getText().equals("0")) {
                    grossSalary.setText("");
                    grossSalary.setText(grossSalary.getText() + "9");
                }else{
                    grossSalary.setText(grossSalary.getText() + "9");
                    updatePercentage();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText("0");
            }
        });
        return view;
    }

    public void updatePercentage(){
        if (Integer.valueOf(String.valueOf(grossSalary.getText())) >= 1 && Integer.valueOf(String.valueOf(grossSalary.getText())) <= 10164 ){
            btnFifteenPercent.setBackgroundColor(getResources().getColor(android.R.color.white));
            btnFifteenPercent.setTextColor(getResources().getColor(android.R.color.black));
            taxBracket.setText("1 - 10,164");
        }else if (Integer.valueOf(String.valueOf(grossSalary.getText())) >= 10165 && Integer.valueOf(String.valueOf(grossSalary.getText())) <= 19740 ){
            btnFifteenPercent.setBackgroundColor(getResources().getColor(android.R.color.white));
            btnFifteenPercent.setTextColor(getResources().getColor(android.R.color.black));
            taxBracket.setText("10,165 - 19,740");
        }else if (Integer.valueOf(String.valueOf(grossSalary.getText())) >= 19741 && Integer.valueOf(String.valueOf(grossSalary.getText())) <= 29316 ){
            btnFifteenPercent.setBackgroundColor(getResources().getColor(android.R.color.white));
            btnFifteenPercent.setTextColor(getResources().getColor(android.R.color.black));
            taxBracket.setText("19,741 - 29,316");
        }else if (Integer.valueOf(String.valueOf(grossSalary.getText())) >= 29317 && Integer.valueOf(String.valueOf(grossSalary.getText())) <= 38892 ){
            btnFifteenPercent.setBackgroundColor(getResources().getColor(android.R.color.white));
            btnFifteenPercent.setTextColor(getResources().getColor(android.R.color.black));
            taxBracket.setText("29,317 - 38,892");
        }else if (Integer.valueOf(String.valueOf(grossSalary.getText())) >= 38893){
            btnFifteenPercent.setBackgroundColor(getResources().getColor(android.R.color.white));
            btnFifteenPercent.setTextColor(getResources().getColor(android.R.color.black));
            taxBracket.setText("Over 38,893");
        }
    }

}

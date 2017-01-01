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

    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
    private TextView grossSalary;


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

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "0");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossSalary.setText(grossSalary.getText() + "9");
            }
        });
        return view;
    }

}

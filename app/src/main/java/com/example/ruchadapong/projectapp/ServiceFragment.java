package com.example.ruchadapong.projectapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ServiceFragment extends Fragment {

    Button  numZero,numOne,numTwo,numThree,numFour,numFive,numSix,numSeven,numEigth,numNine;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        numZero = getView().findViewById(R.id.numZero);
        numOne = getView().findViewById(R.id.numOne);
        numTwo = getView().findViewById(R.id.numTwo);
        numThree = getView().findViewById(R.id.numThree);
        numFour = getView().findViewById(R.id.numFour);
        numFive = getView().findViewById(R.id.numFive);
        numSix = getView().findViewById(R.id.numSix);
        numSeven = getView().findViewById(R.id.numSeven);
        numEigth = getView().findViewById(R.id.numEigth);
        numNine = getView().findViewById(R.id.numNine);

        numZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Zero = database.getReference("Number");
                Zero.setValue(0);
            }
        });


        numOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference One = database.getReference("Number");
                One.setValue(1);
            }
        });

        numTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Two = database.getReference("Number");
                Two.setValue(2);
            }
        });

        numThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Three = database.getReference("Number");
                Three.setValue(3);
            }
        });

        numFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Four = database.getReference("Number");
                Four.setValue(4);
            }
        });

        numFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Five = database.getReference("Number");
                Five.setValue(5);
            }
        });

        numSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Six = database.getReference("Number");
                Six.setValue(6);
            }
        });

        numSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Seven = database.getReference("Number");
                Seven.setValue(7);
            }
        });

        numEigth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Eight = database.getReference("Number");
                Eight.setValue(8);
            }
        });

        numNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference Nine = database.getReference("Number");
                Nine.setValue(9);
            }
        });


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service,container,false);
        return view;
    }


}//1



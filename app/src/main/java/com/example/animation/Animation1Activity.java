package com.example.animation;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;

public class Animation1Activity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private ConstraintSet applyConstraintSet = new ConstraintSet();
    private ConstraintSet resetConstraintSet = new ConstraintSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation1);
        constraintLayout = findViewById(R.id.main);
        resetConstraintSet.clone(constraintLayout);
        applyConstraintSet.clone(constraintLayout);
    }

    public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        applyConstraintSet.setMargin(R.id.button1,ConstraintSet.START,8);
        applyConstraintSet.applyTo(constraintLayout);
    }

   /* public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        applyConstraintSet.centerHorizontally(R.id.button1, R.id.main);
        applyConstraintSet.centerHorizontally(R.id.button2, R.id.main);
        applyConstraintSet.centerHorizontally(R.id.button3, R.id.main);
        applyConstraintSet.applyTo(constraintLayout);
    }*/


    /*public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);

        applyConstraintSet.setMargin(R.id.button1,ConstraintSet.START,0);
        applyConstraintSet.setMargin(R.id.button1,ConstraintSet.END,0);
        applyConstraintSet.setMargin(R.id.button2,ConstraintSet.START,0);
        applyConstraintSet.setMargin(R.id.button2,ConstraintSet.END,0);
        applyConstraintSet.setMargin(R.id.button3,ConstraintSet.START,0);
        applyConstraintSet.setMargin(R.id.button3,ConstraintSet.END,0);


        applyConstraintSet.centerHorizontally(R.id.button1, R.id.main);
        applyConstraintSet.centerHorizontally(R.id.button2, R.id.main);
        applyConstraintSet.centerHorizontally(R.id.button3, R.id.main);
        applyConstraintSet.applyTo(constraintLayout);
    }*/

    /*public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);

        applyConstraintSet.setMargin(R.id.button3,ConstraintSet.START,0);
        applyConstraintSet.setMargin(R.id.button3,ConstraintSet.END,0);
        applyConstraintSet.setMargin(R.id.button3,ConstraintSet.TOP,0);
        applyConstraintSet.setMargin(R.id.button3,ConstraintSet.BOTTOM,0);

        applyConstraintSet.centerHorizontally(R.id.button3, R.id.main);
        applyConstraintSet.centerVertically(R.id.button3, R.id.main);

        applyConstraintSet.applyTo(constraintLayout);
    }*/

   /* public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);

        applyConstraintSet.constrainWidth(R.id.button1,600);
        applyConstraintSet.constrainWidth(R.id.button2,600);
        applyConstraintSet.constrainWidth(R.id.button3,600);

//        applyConstraintSet.constrainHeight(R.id.button1,100);
//        applyConstraintSet.constrainHeight(R.id.button2,100);
//        applyConstraintSet.constrainHeight(R.id.button3,100);

        applyConstraintSet.applyTo(constraintLayout);

    }*/


    /*public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);

        applyConstraintSet.setVisibility(R.id.button2,ConstraintSet.GONE);
        applyConstraintSet.setVisibility(R.id.button3,ConstraintSet.GONE);
        applyConstraintSet.clear(R.id.button1);
        applyConstraintSet.connect(R.id.button1,ConstraintSet.LEFT,R.id.main,ConstraintSet.LEFT,0);
        applyConstraintSet.connect(R.id.button1,ConstraintSet.RIGHT,R.id.main,ConstraintSet.RIGHT,0);
        applyConstraintSet.connect(R.id.button1,ConstraintSet.TOP,R.id.main,ConstraintSet.TOP,0);
        applyConstraintSet.connect(R.id.button1,ConstraintSet.BOTTOM,R.id.main,ConstraintSet.BOTTOM,0);
        applyConstraintSet.applyTo(constraintLayout);
    }*/

    /*public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);

        applyConstraintSet.clear(R.id.button1);
        applyConstraintSet.clear(R.id.button2);
        applyConstraintSet.clear(R.id.button3);

        // button 1 left and top align to parent
        applyConstraintSet.connect(R.id.button1, ConstraintSet.LEFT, R.id.main, ConstraintSet.LEFT, 0);

        // button 3 right and top align to parent
        applyConstraintSet.connect(R.id.button3, ConstraintSet.RIGHT, R.id.main, ConstraintSet.RIGHT, 0);

        // bi-direction or Chaining between button 1 and button 2
        applyConstraintSet.connect(R.id.button2, ConstraintSet.LEFT, R.id.button1, ConstraintSet.RIGHT, 0);
        applyConstraintSet.connect(R.id.button1, ConstraintSet.RIGHT, R.id.button2, ConstraintSet.LEFT, 0);

        // bi-direction or Chaining between button 2 and button 3
        applyConstraintSet.connect(R.id.button2, ConstraintSet.RIGHT, R.id.button3, ConstraintSet.LEFT, 0);
        applyConstraintSet.connect(R.id.button3, ConstraintSet.LEFT, R.id.button2, ConstraintSet.RIGHT, 0);

        applyConstraintSet.createHorizontalChain(R.id.button1,ConstraintSet.RIGHT,
                R.id.button3,ConstraintSet.RIGHT,
                new int[]{R.id.button1, R.id.button3},null,ConstraintWidget.CHAIN_SPREAD);


        applyConstraintSet.constrainWidth(R.id.button1,ConstraintSet.WRAP_CONTENT);
        applyConstraintSet.constrainWidth(R.id.button2,ConstraintSet.WRAP_CONTENT);
        applyConstraintSet.constrainWidth(R.id.button3,ConstraintSet.WRAP_CONTENT);

        applyConstraintSet.constrainHeight(R.id.button1,ConstraintSet.WRAP_CONTENT);
        applyConstraintSet.constrainHeight(R.id.button2,ConstraintSet.WRAP_CONTENT);
        applyConstraintSet.constrainHeight(R.id.button3,ConstraintSet.WRAP_CONTENT);

        applyConstraintSet.applyTo(constraintLayout);
    }*/

    public void onResetClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        resetConstraintSet.applyTo(constraintLayout);
    }



}

package com.example.animation;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;

public class Animation2Activity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private ConstraintSet constraintSet1 = new ConstraintSet();
    private ConstraintSet constraintSet2 = new ConstraintSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2_first);
        constraintLayout = findViewById(R.id.main);
        constraintSet1.clone(constraintLayout);
        constraintSet2.clone(this, R.layout.activity_animation2_second);
    }

    public void onApplyClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        constraintSet2.applyTo(constraintLayout);
    }

    public void onResetClick(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        constraintSet1.applyTo(constraintLayout);
    }



}

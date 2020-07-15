package com.example.animation;


import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

public class Animation4Activity extends AppCompatActivity {

    private boolean firsAnim = false;
    private boolean secondAnim = false;
    private ConstraintLayout mainWrapper;
    private ConstraintLayout bottomWrapper1;
    private ConstraintLayout bottomWrapper2;
    private ConstraintSet applyConstraintSetMain = new ConstraintSet();
    private ConstraintSet resetConstraintSetMain = new ConstraintSet();
    private ConstraintSet applyConstraintSetBW1 = new ConstraintSet();
    private ConstraintSet resetConstraintSetBW1 = new ConstraintSet();
    private ConstraintSet applyConstraintSetBW2 = new ConstraintSet();
    private ConstraintSet resetConstraintSetBW2 = new ConstraintSet();
    private int height;
    private int width;

    public static int dpToPx(float dp, Context context) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation4);

        mainWrapper = findViewById(R.id.mainFood);
        bottomWrapper1 = findViewById(R.id.bottomWrapper1);
        bottomWrapper2 = findViewById(R.id.bottomWrapper2);

        resetConstraintSetMain.clone(mainWrapper);
        applyConstraintSetMain.clone(mainWrapper);

        resetConstraintSetBW1.clone(bottomWrapper1);
        applyConstraintSetBW1.clone(bottomWrapper1);

        resetConstraintSetBW2.clone(bottomWrapper2);
        applyConstraintSetBW2.clone(bottomWrapper2);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;
    }

    public void onApplyClick(View view) {
        if (firsAnim) {
            firstToggle(dpToPx(100, this));
        } else {
            firstToggle(dpToPx(300, this));
        }


    }

    private void firstToggle(int margin) {
        firsAnim = !firsAnim;
        TransitionManager.beginDelayedTransition(mainWrapper);
        applyConstraintSetBW1.connect(R.id.bottomWrapper1, ConstraintSet.TOP, R.id.mainFood, ConstraintSet.TOP, margin);
        applyConstraintSetBW1.connect(R.id.bottomWrapper1, ConstraintSet.BOTTOM, R.id.mainFood, ConstraintSet.BOTTOM, 0);
        applyConstraintSetBW1.connect(R.id.bottomWrapper1, ConstraintSet.LEFT, R.id.mainFood, ConstraintSet.LEFT, 0);
        applyConstraintSetBW1.connect(R.id.bottomWrapper1, ConstraintSet.RIGHT, R.id.mainFood, ConstraintSet.RIGHT, 0);
        applyConstraintSetBW1.applyTo(mainWrapper);
    }

    public void onApplyClick2(View view) {
        if (secondAnim) {
            secondAnimation(dpToPx(100, this));
        } else {
            if (firsAnim) {
                firstToggle(dpToPx(100, this));
            }else{
                secondAnimation(dpToPx(300, this));
            }

        }

    }

    private void secondAnimation(int margin) {
        secondAnim = !secondAnim;
        TransitionManager.beginDelayedTransition(bottomWrapper1);
        applyConstraintSetBW2.connect(R.id.bottomWrapper2, ConstraintSet.TOP, R.id.bottomWrapper1, ConstraintSet.TOP, margin);
        applyConstraintSetBW2.connect(R.id.bottomWrapper2, ConstraintSet.BOTTOM, R.id.bottomWrapper1, ConstraintSet.BOTTOM, 0);
        applyConstraintSetBW2.connect(R.id.bottomWrapper2, ConstraintSet.LEFT, R.id.bottomWrapper1, ConstraintSet.LEFT, 0);
        applyConstraintSetBW2.connect(R.id.bottomWrapper2, ConstraintSet.RIGHT, R.id.bottomWrapper1, ConstraintSet.RIGHT, 0);
        applyConstraintSetBW2.applyTo(bottomWrapper1);
    }
}

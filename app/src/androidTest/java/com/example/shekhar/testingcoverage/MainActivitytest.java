package com.example.shekhar.testingcoverage;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Shekhar on 02-10-2017.
 */
import static org.junit.Assert.*;
import static com.example.shekhar.testingcoverage.MainActivity.*;
@RunWith(AndroidJUnit4.class)
public class MainActivitytest {

    public MainActivity mainActivity;

    @Rule
    public ActivityTestRule<MainActivity> mainActRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void startActivity(){
        mainActivity = mainActRule.getActivity();
    }

    @Test
    public void calfareworksUI(){
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                testcalfarewithKmandMin("0","0","50.0");
                testcalfarewithKmandMin("10", "0", "110.0");
                testcalfarewithKmandMin("0", "30", "65.0");
                testcalfarewithKmandMin("10", "30", "125.0");

            }
        });
    }

    void testcalfarewithKmandMin(String km, String min, String expResult){
        ((EditText) mainActivity.findViewById(R.id.etkm)).setText(km);
        ((EditText) mainActivity.findViewById(R.id.etmin)).setText(min);
        ((Button) mainActivity.findViewById(R.id.btnfare)).performClick();
        String result = ((TextView) mainActivity.findViewById(R.id.tvresult)).getText().toString();

        assertEquals(expResult, result);
    }

}

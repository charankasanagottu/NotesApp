package com.example.ecofarm;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import com.example.ecofarm.databinding.ActivityProfileBinding;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DashboarduserActivityTest {

    @Rule
    ActivityTestRule<DashboarduserActivity> dashboarduserActivityActivityTestRule = new ActivityTestRule<>(DashboarduserActivity.class);

    private ProfileActivityTest profileActivityTest = new ProfileActivityTest();
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void userpagetest(){
        if(ViewMatchers.withId(R.id.prfileBtn).matches(isClickable())){
            Espresso.onView(withId(R.id.prfileBtn)).perform(click());
            profileActivityTest.testbuttonsProfile();
        }

    }



    @After
    public void tearDown() throws Exception {
    }
}
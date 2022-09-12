package com.example.ecofarm;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.pressBack;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import android.text.style.EasyEditSpan;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class ProfileActivityTest {

    @Rule
    public ActivityTestRule<ProfileActivity> profileActivityActivityTestRule  = new ActivityTestRule<>(ProfileActivity.class);


    private String name = "charan";
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public  void testUserInfo(){
        Espresso.onView(withId(R.id.LoginBtn)).perform(click());
        Espresso.onView(withId(R.id.loginBtn)).perform(click());
        Espresso.onView(withId(R.id.prfileBtn)).perform(click());

    }


    @Test
    public void testbuttonsProfile(){
        Espresso.onView(withId(R.id.Account)).perform(typeText(name));
        Espresso.onView(withId(R.id.DisplayBtn)).perform(click());
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.tvAcchangedtext)).check(matches(withText(name)));
        Espresso.onView(withId(R.id.backBtn)).perform(click());
        boolean val  = ViewMatchers.withId(R.id.DispAccdetailsLl).matches(isChecked());
        if(val){
            Espresso.onView(withId(R.id.Account)).perform(typeText(name));
        }
        else{
            ViewActions.pressBack();
        }
    }


    @After
    public void tearDown() throws Exception {
    }
}
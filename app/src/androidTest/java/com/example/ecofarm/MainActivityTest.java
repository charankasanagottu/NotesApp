package com.example.ecofarm;



import static android.os.Trace.isEnabled;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.matcher.ViewMatchers;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityTestRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);
    private  String name = "charan";

    ProfileActivityTest  profile = new ProfileActivityTest();
    @Test
    public void allpagescheck(){
        Espresso.onView(withId(R.id.try_freeBtn)).perform(click());
//        Espresso.onView(withId(R.id.loginBtn)).perform(click());
        if(ViewMatchers.withId(R.id.prfileBtn).matches(isEnabled())) {
            profile.testbuttonsProfile();
            Espresso.pressBackUnconditionally();
        }
        Espresso.onView(withId(R.id.Account)).perform(typeText(name));
        Espresso.onView(withId(R.id.DisplayBtn)).check(matches(withText(name)));
        checkprofile();

    }

    @Test
    public void demo(){
        Espresso.onView(withId(R.id.LoginBtn)).perform(click());
        Espresso.onView(withId(R.id.loginemailEt)).perform(typeText("kasanagottucharan@gmail.com"));
        Espresso.onView(withId(R.id.loginpasswordEt)).perform(typeText("Charan@2000"));
    }

    @Test
//    Check profile path
    public void checkprofile(){
        Espresso.onView(withId(R.id.try_freeBtn)).perform(click());
//        Espresso.onView(withId(R.id.loginBtn)).perform(click());
        Espresso.onView(withId(R.id.prfileBtn)).perform(click());
    }


}


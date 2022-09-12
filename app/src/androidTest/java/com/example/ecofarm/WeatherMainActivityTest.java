package com.example.ecofarm;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.EspressoException;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class WeatherMainActivityTest {

    @Rule
    public ActivityTestRule<WeatherMainActivity> weatherMainActivityActivityTestRule = new ActivityTestRule<>(WeatherMainActivity.class);



    @Test
    public void checkAllButtonsWeather(){
        Espresso.onView(withId(R.id.etCity)).perform(typeText("siddipet"));
        Espresso.onView(withId(R.id.btnGet)).perform(click());
        if(ViewMatchers.withId(R.id.tvResult).matches(isDisplayed()))
        {
            Espresso.pressBackUnconditionally();
        }
        else{
            Espresso.closeSoftKeyboard();
        }
    }

    @Before
    public void setUp() throws Exception {
    }
}
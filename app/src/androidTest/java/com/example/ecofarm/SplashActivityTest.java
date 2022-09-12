package com.example.ecofarm;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SplashActivityTest {

    @Rule
    public ActivityScenarioRule<SplashActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(SplashActivity.class);

    @Test
    public void splashActivityTest7() {
        ViewInteraction linearLayout = onView(
                allOf(withParent(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class)),
                        isDisplayed()));
        linearLayout.check(matches(isDisplayed()));

        ViewInteraction linearLayout2 = onView(
                allOf(withParent(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class)),
                        isDisplayed()));
        linearLayout2.check(matches(isDisplayed()));

        ViewInteraction linearLayout3 = onView(
                allOf(withId(androidx.appcompat.R.id.action_bar_root),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        linearLayout3.check(matches(isDisplayed()));

        ViewInteraction linearLayout4 = onView(
                allOf(withId(androidx.appcompat.R.id.action_bar_root),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        linearLayout4.check(matches(isDisplayed()));

        ViewInteraction button = onView(
                allOf(withId(R.id.LoginBtn), withText("LOGIN"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

        ViewInteraction view = onView(
                allOf(withId(android.R.id.statusBarBackground),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class)),
                        isDisplayed()));
        view.check(matches(isDisplayed()));

        ViewInteraction view2 = onView(
                allOf(withId(android.R.id.navigationBarBackground),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class)),
                        isDisplayed()));
        view2.check(matches(isDisplayed()));

        ViewInteraction frameLayout = onView(
                allOf(withId(android.R.id.content),
                        withParent(allOf(withId(androidx.appcompat.R.id.action_bar_root),
                                withParent(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class)))),
                        isDisplayed()));
        frameLayout.check(matches(isDisplayed()));

        ViewInteraction frameLayout2 = onView(
                allOf(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class), isDisplayed()));
        frameLayout2.check(matches(isDisplayed()));
    }
}

package com.example.ecofarm;


import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginActivity_Notes {

    @Rule
    public ActivityScenarioRule<SplashActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(SplashActivity.class);

    @Test
    public void loginActivity_Notes() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.LoginBtn), withText("Login"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.loginemailEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.emailTil),
                                        0),
                                1)));
        appCompatEditText.perform(scrollTo(), longClick());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.loginemailEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.emailTil),
                                        0),
                                0)));
        appCompatEditText2.perform(scrollTo(), replaceText("charan@gmail.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.loginpasswordEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.passwordTil),
                                        0),
                                0)));
        appCompatEditText3.perform(scrollTo(), replaceText("Charan@2000"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.loginBtn), withText("Login"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton2.perform(scrollTo(), click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.searchBtn),
                        childAtPosition(
                                allOf(withId(R.id.llweather),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("siddipet"), closeSoftKeyboard());

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.searchWeather),
                        childAtPosition(
                                allOf(withId(R.id.llweather),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                1),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.etCity),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("siddipet"), closeSoftKeyboard());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btnGet), withText("Get"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                4),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withId(R.id.backBtn),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatImageButton2.perform(click());

        pressBack();

        DataInteraction appCompatTextView = onData(anything())
                .inAdapterView(allOf(withClassName(is("android.widget.ListView")),
                        childAtPosition(
                                withClassName(is("android.widget.LinearLayout")),
                                0)))
                .atPosition(0);
        appCompatTextView.perform(click());


        ViewInteraction editText = onView(
                allOf(withId(R.id.Notes), withText("Ok I Want To Try "),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        editText.check(matches(withText("Ok I Want To Try")));

        ViewInteraction linearLayout = onView(
                allOf(withId(R.id.DispAccdetailsLl),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        linearLayout.check(matches(isDisplayed()));

        ViewInteraction linearLayout2 = onView(
                allOf(withId(R.id.DispAccdetailsLl),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        linearLayout2.check(matches(isDisplayed()));

        ViewInteraction button = onView(
                allOf(withId(R.id.SaveBtn), withText("SAVE NOTE"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

        ViewInteraction button2 = onView(
                allOf(withId(R.id.SaveBtn), withText("SAVE NOTE"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}

package com.example.ecofarm;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

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
public class Register_Profile {

    @Rule
    public ActivityScenarioRule<SplashActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(SplashActivity.class);

    @Test
    public void register_Profile() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.LoginBtn), withText("Login"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.noAccountTv), withText("New user? Sign up "),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.nameEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nameTil),
                                        0),
                                0)));
        appCompatEditText.perform(scrollTo(), replaceText("Charan"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.pincodeEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.pincodeTil),
                                        0),
                                0)));
        appCompatEditText2.perform(scrollTo(), replaceText("502103"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.emailEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.emailTil),
                                        0),
                                0)));
        appCompatEditText3.perform(scrollTo(), replaceText("kasanagottucharan@gmail.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.passwordEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.passwordTil),
                                        0),
                                0)));
        appCompatEditText4.perform(scrollTo(), replaceText("Charan@2000"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.emailEt), withText("kasanagottucharan@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.emailTil),
                                        0),
                                0)));
        appCompatEditText5.perform(scrollTo(), replaceText("charan@gmail.com"));

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.emailEt), withText("charan@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.emailTil),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText6.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.confirmpasswordEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.confirmpasswordTil),
                                        0),
                                0)));
        appCompatEditText7.perform(scrollTo(), replaceText("Charan@2000"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.registerBtn), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                5)));
        appCompatButton2.perform(scrollTo(), click());




        ViewInteraction appCompatImageButton2 = onView(
                allOf(withId(R.id.prfileBtn),
                        childAtPosition(
                                allOf(withId(R.id.toolbarRL),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageButton2.perform(click());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.Account),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.detailsLl),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText11.perform(replaceText("Yes This Is My Account"), closeSoftKeyboard());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.Phone),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.detailsLl),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText12.perform(replaceText("9441786897"), closeSoftKeyboard());

        ViewInteraction appCompatEditText13 = onView(
                allOf(withId(R.id.Badge),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.details2Ll),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText13.perform(replaceText("Golden"), closeSoftKeyboard());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.DisplayBtn), withText("Display"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton3.perform(click());
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

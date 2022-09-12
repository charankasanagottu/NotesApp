package com.example.ecofarm;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
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
public class TotalActivtity {

    @Rule
    public ActivityScenarioRule<SplashActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(SplashActivity.class);

    @Test
    public void totalActivtity() {
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
                                0)));
        appCompatEditText.perform(scrollTo(), replaceText("Charan@2000"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.loginpasswordEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.passwordTil),
                                        0),
                                0)));
        appCompatEditText2.perform(scrollTo(), replaceText(" "), closeSoftKeyboard());



        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.loginemailEt), withText("Charan@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.emailTil),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText4.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.loginpasswordEt), withText(" "),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.passwordTil),
                                        0),
                                0)));
        appCompatEditText5.perform(scrollTo(), replaceText("Charan@2000"));

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.loginpasswordEt), withText("Charan@2000"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.passwordTil),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText6.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.loginBtn), withText("Login"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton2.perform(scrollTo(), click());

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

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.etCity),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("Delhi"), closeSoftKeyboard());

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

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.Notes),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText8.perform(replaceText("Hi There , Charan This Side "), closeSoftKeyboard());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.SaveBtn), withText("Save Note"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.logoutBtn),
                        childAtPosition(
                                allOf(withId(R.id.toolbarRL),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatImageView.perform(click());

        pressBack();

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.LoginBtn), withText("Login"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.forgotTv), withText("forgot password?"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        appCompatTextView.perform(scrollTo(), click());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.forgotpassword),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText9.perform(replaceText("charan@gmail.com"), closeSoftKeyboard());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.passwordrecoverbutton), withText("Click Here To Recover"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton6.perform(click());



        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.loginemailEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.emailTil),
                                        0),
                                0)));
        appCompatEditText10.perform(scrollTo(), replaceText("charan@gmail.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.loginpasswordEt),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.passwordTil),
                                        0),
                                0)));
        appCompatEditText11.perform(scrollTo(), replaceText("Charan@2000"), closeSoftKeyboard());



        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.loginBtn), withText("Login"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton7.perform(scrollTo(), click());

        ViewInteraction appCompatImageButton3 = onView(
                allOf(withId(R.id.prfileBtn),
                        childAtPosition(
                                allOf(withId(R.id.toolbarRL),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageButton3.perform(click());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.Account),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.detailsLl),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText12.perform(replaceText("charan Kumar"), closeSoftKeyboard());

        ViewInteraction appCompatEditText13 = onView(
                allOf(withId(R.id.Phone),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.detailsLl),
                                        1),
                                1),
                        isDisplayed()));
        appCompatEditText13.perform(replaceText("6303296498"), closeSoftKeyboard());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.DisplayBtn), withText("Display"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatImageButton4 = onView(
                allOf(withId(R.id.backBtn),
                        childAtPosition(
                                allOf(withId(R.id.toolbarRL),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatImageButton4.perform(click());

        pressBack();

        ViewInteraction appCompatImageView2 = onView(
                allOf(withId(R.id.logoutBtn),
                        childAtPosition(
                                allOf(withId(R.id.toolbarRL),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatImageView2.perform(click());

        pressBack();
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

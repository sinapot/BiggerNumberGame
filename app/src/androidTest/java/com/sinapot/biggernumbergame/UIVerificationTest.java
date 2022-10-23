package com.sinapot.biggernumbergame;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.PositionAssertions.isCompletelyLeftOf;
import static androidx.test.espresso.assertion.PositionAssertions.isCompletelyRightOf;
import static androidx.test.espresso.assertion.PositionAssertions.isRightOf;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class UIVerificationTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void checkUIComponents1(){
        onView(withId(R.id.textView4))
                .check(matches(isDisplayed()))
                .check(matches(withText("Number Guessing Game")));
    }
    @Test
    public void checkUIComponents2(){
        onView(withId(R.id.textView3))
                .check(matches(isDisplayed()))
                .check(matches(withText("Press the button which contains the larger number!")));
    }
    @Test
    public void btnLeftTest(){
        onView(withId(R.id.btnLeft))
                .check(matches(isDisplayed()))
                .check(isCompletelyLeftOf(withId(R.id.btnRight)));
    }
    @Test
    public void btnRightTest(){
        onView(withId(R.id.btnRight))
                .check(matches(isDisplayed()))
                .check(isCompletelyRightOf(withId(R.id.btnLeft)));
    }
}



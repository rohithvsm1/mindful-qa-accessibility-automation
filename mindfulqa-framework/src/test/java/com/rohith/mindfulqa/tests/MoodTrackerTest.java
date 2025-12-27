package com.rohith.mindfulqa.tests;

import com.rohith.mindfulqa.base.BaseTest;
import com.rohith.mindfulqa.pages.MoodTrackerPage;
import org.testng.annotations.Test;

public class MoodTrackerTest extends BaseTest {

    @Test
    public void moodTrackerEndToEndFlow() {

        // Navigate
        page.navigate("https://dailypalai.com/tools/health-fitness-tools/mood-tracker");

        // Pause for Playwright Inspector (locator discovery)
        page.pause();

        // Page Object
        MoodTrackerPage moodPage = new MoodTrackerPage(page);

        // Actions (generic for now)
        moodPage.selectMoodByIndex(0);
        moodPage.selectIntensityByIndex(0);
        moodPage.enterNote("Feeling calm and focused");
        moodPage.save();
    }
}

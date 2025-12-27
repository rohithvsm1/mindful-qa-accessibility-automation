package com.rohith.mindfulqa.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class MoodTrackerPage {

    private final Locator buttons;
    private final Locator noteField;
    private final Locator saveButton;

    public MoodTrackerPage(Page page) {

        // Generic buttons (will refine after Inspector)
        this.buttons = page.getByRole(AriaRole.BUTTON);

        // Text area
        this.noteField = page.locator("textarea");

        // Save button by accessible name
        this.saveButton = page.getByRole(
                AriaRole.BUTTON,
                new Page.GetByRoleOptions().setName("Save")
        );
    }

    public void selectMoodByIndex(int index) {
        buttons.nth(index).click();
    }

    public void selectIntensityByIndex(int index) {
        buttons.nth(index).click();
    }

    public void enterNote(String note) {
        noteField.fill(note);
    }

    public void save() {
        saveButton.click();
    }
}

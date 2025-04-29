package com.antonio.exercise.page_objects;

import com.antonio.exercise.data.Urls;

public class Navigate {

    private Common common;

    public Navigate(Common common) {
        this.common = common;
    }

    public void navigateToAutomationExercise() {
        this.common.navigateTo(Urls.AUTOMATION_EXERCISE);
    }
}

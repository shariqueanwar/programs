package com.fb.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target\\rerun.txt",glue="com\\\\fb\\\\stepdef")

public class ReRunRunner {

}


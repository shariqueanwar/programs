package com.fb.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Orange.feature",glue = "com\\fb\\stepdef",tags="@orange ",monochrome = true,
plugin={"pretty","html:target\\cucu.html","json:target\\cucum.json","junit:target\\cucumb.xml","rerun:target\\rerun.txt"} )//@reg or @smoke
public class TestRunner {

}

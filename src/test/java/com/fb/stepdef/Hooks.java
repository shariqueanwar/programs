package com.fb.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void test() {
		System.out.println("Browser Launch");//before scenario
	}
	@After
	public void test1() {
		System.out.println("Failed scenario screenshot");//After scenaroi
	}
}

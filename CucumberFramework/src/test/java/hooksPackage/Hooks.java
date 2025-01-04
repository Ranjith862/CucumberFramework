package hooksPackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() {
		System.out.println("This will run before all scenarios");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after all scenarios");
	}

	@Before("@First")
	public void beforefistScenario() {
		System.out.println("This will run before first scenario");
	}

	@After("@First")
	public void afterfirstScenario() {
		System.out.println("This will run after first scenarios");
	}

	@Before("@Second")
	public void beforesecondScenario() {
		System.out.println("This will run before second scenario");
	}

	@After("@Second")
	public void aftersecondScenario() {
		System.out.println("This will run after second scenarios");
	}

	@Before("@Third")
	public void beforethirdScenario() {
		System.out.println("This will run before third scenario");
	}

	@After("@Third")
	public void afterthirdScenario() {
		System.out.println("This will run after third scenarios");
	}
}

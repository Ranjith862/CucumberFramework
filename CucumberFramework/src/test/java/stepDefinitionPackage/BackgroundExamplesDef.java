package stepDefinitionPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExamplesDef {
	@Given("the studend must finished UG in any strem")
	public void the_studend_must_finished_ug_in_any_strem() {
		System.out.println("the studend must finished UG in any strem");
	}

	@Given("the student applied for MBA")
	public void the_student_applied_for_mba() {
		System.out.println("the student applied for MBA");
	}

	@When("the student has more than 60% in their UG")
	public void the_student_has_more_than_60_in_their_ug() {
		System.out.println("the student has more than 60% in their UG");
	}

	@Then("the student will get the MBA Sheet")
	public void the_student_will_get_the_mba_sheet() {
		System.out.println("the student will get the MBA Sheet");
	}

}

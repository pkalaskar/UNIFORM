package TEST_RUNNER;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(features="FEATURE",glue={"PRODUCT"},tags={"@SmokeTest,@Verify"})
public class TestAdmin extends AbstractTestNGCucumberTests{

	

}

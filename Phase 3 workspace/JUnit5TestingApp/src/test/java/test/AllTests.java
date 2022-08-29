package test;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

//@RunWith(Suite.class)			jUnit 4.x 
//@SuiteClasses({})

@Suite
@SelectPackages("com.test")		// provide all test case package names. 
@SuiteDisplayName(value = "My All jUnit5 test files")
public class AllTests {

}

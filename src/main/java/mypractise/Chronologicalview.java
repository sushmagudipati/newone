package mypractise;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Chronologicalview {
	@Test
	public void c_test(){
		Assert.fail();
	}
	@Test
	public void d_test(){
		Assert.assertTrue(true);
	}
	@Test
	public void e_test(){
		throw new SkipException("Skipping b_test...");
	}

}

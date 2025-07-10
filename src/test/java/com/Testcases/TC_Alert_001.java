package com.Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.baseclass;

public class TC_Alert_001 extends baseclass {

	@Test
	public void Alert() throws InterruptedException {

		al.Alert();

		assertEquals(al.Heading().getText(), "App/Alert Dialogs");

	}

}

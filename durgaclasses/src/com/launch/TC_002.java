package com.launch;

import java.io.IOException;

public class TC_002 extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		init();
		launch("firefoxbrowser");
		navigateUrl("BestBuyUrl");
	}

}

package com.qa.opencart.Constants;


import java.util.Arrays;
import java.util.List;

public class AppConstants {

	public static final String CONFI_PROD_FILE_PAHT = "./src/test/resources/Config/Env.properties";
	public static final String CONFI_DEV_FILE_PAHT = "./src/test/resources/Config/dev.properties";
	public static final String CONFI_QA_FILE_PAHT = "./src/test/resources/Config/qa.properties";
	public static final String CONFIG_STAGE_FILE_PAHT = "./src/test/resources/Config/stage.properties";
	public static final String CONFIG_UAT_FILE_PAHT = "./src/test/resources/Config/Uat.properties";
	
	
	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final String LOGIN_PAGE_FRACTION_URL = "route=account/login";
	public static final String Account_PAGE_TITLE = "My Account";
	public static final String Account_PAGE_FRACTION_URL= "route=account/account";
	
	
	public static final List<String> PAGE_HEADERS_LIST = Arrays.asList("My Account","My Orders","My Affiliate Account","Newsletter");


}

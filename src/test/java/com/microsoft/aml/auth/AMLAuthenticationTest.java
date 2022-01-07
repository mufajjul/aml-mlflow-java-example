package com.microsoft.aml.auth;

import org.junit.Test;
import org.nd4j.linalg.io.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AMLAuthenticationTest {

	private static final Logger log = LoggerFactory.getLogger(AMLAuthenticationTest.class);

	@Test
//	@SetEnvironmentVariable(key = "REGION", value = "EastUS")
//	@SetEnvironmentVariable(key = "TENANT_ID", value = "72f988bf-86f1-41af-91ab-2d7cd011db47")
//	@SetEnvironmentVariable(key = "SUB_ID", value = "0d27f570-c739-4d79-b6fd-2f04ad265ab2")
//	@SetEnvironmentVariable(key = "RESOURCE_GROUP", value = "mlstudio")
//	@SetEnvironmentVariable(key = "WORKSPACE_NAME", value = "aml-cust-demo")
//	@SetEnvironmentVariable(key = "AZUREMLFLOW_SP_CLIENT_SECRET", value = "1GHuuQL9mnurmGZIb_oftwgMk6tqv2U0O.")
	public void testAMLAuthentication() throws Exception {

		AMLAuthentication amlAuth = AMLAuthentication.getInstnce();
		String token = amlAuth.getAccessTokenFromUserCredentials();

		// log.info(token);

		Assert.notNull(token);

	}

}

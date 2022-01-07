package com.microsoft.ml.mlflow;

import org.junit.Before;
import org.junit.Test;
import org.mlflow.tracking.MlflowClient;
import org.nd4j.linalg.io.Assert;

import com.microsoft.aml.auth.AMLAuthentication;

public class MLFlowRunnerTest {

	AMLAuthentication amlAuth;

	@Before 
	public void getAuthentication() {
		amlAuth = AMLAuthentication.getInstnce();
	}

	@Test
	public void testMLFlowRunner() throws Exception {

		MLFLowRunner mlFLowRunner = new MLFLowRunner(amlAuth);

		MlflowClient mlflowClient = mlFLowRunner.getMlflowAuthClient();

		Assert.notNull(mlflowClient);

	}

}

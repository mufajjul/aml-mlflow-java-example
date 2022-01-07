package com.microsoft.ml.experiment;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.microsoft.aml.auth.AMLAuthentication;
import com.microsoft.ml.mlflow.MLFLowRunner;

public class MlFlowExperimentTest {

	
	private static final Logger log = LoggerFactory.getLogger(MlFlowExperimentTest.class);

	
	@Test
	public void testInputDataset() throws Exception {

		
		String experimentName = "aml-mlflow-javaexp";
		
		AMLAuthentication amlAuth = AMLAuthentication.getInstnce();
		
		MLFLowRunner mlFLowRunner = new MLFLowRunner(amlAuth);
		
		MlFlowExperiment mlflowExperiment = new MlFlowExperiment(mlFLowRunner,experimentName);
		
		DataSetIterator itr = mlflowExperiment.generateDataset();
		
		DataSet dt[] = mlflowExperiment.prepDataset(itr);
		
		mlflowExperiment.trainDLModel(mlflowExperiment.initilizeDLmodel(), dt);
		
		

	}

}

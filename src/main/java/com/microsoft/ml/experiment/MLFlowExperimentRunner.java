package com.microsoft.ml.experiment;

import com.microsoft.aml.auth.AMLAuthentication;
import com.microsoft.ml.mlflow.MLFLowRunner;

public class MLFlowExperimentRunner {
	
	
	public static void main(String args[]) throws Exception {
				
		
		String experimentName = "aml-mlflow-java-example";
		
		AMLAuthentication amlAuth = AMLAuthentication.getInstnce();
		
		MLFLowRunner mlFLowRunner = new MLFLowRunner(amlAuth);
		
		MlFlowExperiment mlflowExperiment = new MlFlowExperiment(mlFLowRunner,experimentName);
		
		mlflowExperiment.trainDLModel(mlflowExperiment.initilizeDLmodel(), mlflowExperiment.prepDataset(mlflowExperiment.generateDataset()));
		
	}

}

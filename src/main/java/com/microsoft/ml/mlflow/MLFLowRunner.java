package com.microsoft.ml.mlflow;

import org.mlflow.tracking.MlflowClient;
import org.mlflow.tracking.creds.BasicMlflowHostCreds;
import org.mlflow.tracking.creds.MlflowHostCredsProvider;

import com.microsoft.aml.auth.AMLAuthentication;


public class MLFLowRunner {

	private AMLAuthentication amlAuth;
	
	public MLFLowRunner (AMLAuthentication amlAuth) {
		
		this.amlAuth = amlAuth;
		
	}
	
	public MlflowClient getMlflowAuthClient() throws Exception {
		
		
		MlflowHostCredsProvider credsProvider = new BasicMlflowHostCreds(amlAuth.getTRACKING_URI(), amlAuth.getAccessTokenFromUserCredentials());
        MlflowClient client = new MlflowClient(credsProvider);
        
        return client;
                
	}

}

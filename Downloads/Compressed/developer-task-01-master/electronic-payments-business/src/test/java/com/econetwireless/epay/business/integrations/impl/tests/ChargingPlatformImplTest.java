package com.econetwireless.epay.business.integrations.impl.tests;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.econetwireless.epay.business.integrations.impl.ChargingPlatformImpl;
import com.econetwireless.in.soap.service.IntelligentNetworkService;

public class ChargingPlatformImplTest {

	private ChargingPlatformImpl chargingPlatformImpl;
	
	@Mock
	IntelligentNetworkService intelligentNetworkService;
	
	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
		this.chargingPlatformImpl=new ChargingPlatformImpl(intelligentNetworkService);
		
	}

}

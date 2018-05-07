package com.econetwireless.epay.business.integrations.impl.tests;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.econetwireless.epay.business.integrations.impl.ChargingPlatformImpl;
import com.econetwireless.in.soap.service.IntelligentNetworkService;

/**
 * Evans K F Chikuni 07/05/2018
 */
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

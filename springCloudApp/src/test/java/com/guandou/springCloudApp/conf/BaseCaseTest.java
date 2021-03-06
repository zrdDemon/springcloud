package com.guandou.springCloudApp.conf;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import com.guandou.springcloudapp.main.Application;

//

/**
 * Created by guandou1 on 2017/4/5.
 */
@SpringBootTest(classes = { Application.class })
@WebAppConfiguration
@TestExecutionListeners(inheritListeners = false, listeners = { DependencyInjectionTestExecutionListener.class,
                                                                DirtiesContextTestExecutionListener.class })
@ImportResource(locations = {"/application.properties1"})
public class BaseCaseTest extends AbstractTestNGSpringContextTests {

}

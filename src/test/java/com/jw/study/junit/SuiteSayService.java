package com.jw.study.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 测试套件
 * @author Admin
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({SayServiceTest.class,SayServiceTest1.class})
public class SuiteSayService {
	
}

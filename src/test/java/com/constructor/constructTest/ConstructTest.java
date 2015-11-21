package com.constructor.constructTest;

import org.junit.Test;

import com.constructor.construct.Construct1;
import com.constructor.construct.Inheri;
import com.constructor.construct.InterF;

public class ConstructTest {

	@Test
	public void ConsTest(){
		Construct1 c = new Construct1();
		c.dance();
		c.sing();
		Construct1 c1 = new Construct1("initized", "construc");
		c1.aDance();
		c1.bSing();
	Inheri i1 = new Inheri("tets", "testy");
	i1.combo();
	nativ();
	InterF i2 = new InterF();
	i2.com1();
	i2.com2();
	}
	public void nativ(){
		System.out.println("native world");
	}
}

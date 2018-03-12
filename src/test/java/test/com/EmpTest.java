package test.com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.feb28.Add1;
import com.feb28.Emp1;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml"})
public class EmpTest {

	@Autowired
	Emp1 emp;
	
	@Test
	public void empTest(){
		System.out.println(emp);
		
		System.out.println(emp.getAddress());
		
		Assert.assertTrue(emp.getAddress() instanceof Add1);
		
		Assert.assertNotNull(emp.getAddress());
		
		
	}
	
	@Test
	public void addTest(){
		Assert.assertEquals(5, emp.add(2, 3));
	}
}

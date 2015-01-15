package junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.login.service.LoginService;
import com.my.user.model.UserModel;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextHierarchy({
	@ContextConfiguration(name = "parent", locations = "classpath:applicationContext.xml"),  
    @ContextConfiguration(name = "child", locations = "classpath:applicationContext-mvc.xml") 
})
public class Junit_my {

	@Autowired
	private LoginService loginService; 
	
	@Test
	public void user(){
		System.out.println(loginService);
		UserModel userAccount = loginService.findByUsername("mazel");
		System.out.println(userAccount.getPassword());
	}
}

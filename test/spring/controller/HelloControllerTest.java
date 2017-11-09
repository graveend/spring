package spring.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import org.springframework.web.servlet.ModelAndView;
import junit.framework.TestCase;
import spring.controller.HelloController;

public class HelloControllerTest extends TestCase{
	
	public void testHandleRequestView() throws ServletException, IOException
	{
		HelloController controller = new HelloController();
		ModelAndView mv = controller.handleRequest(null, null);
		assertEquals("home.jsp", mv.getViewName());
	}
	
}

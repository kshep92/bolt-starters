package app;

import app.controllers.ApplicationController;
import com.boltframework.test.TestApplicationServer;
import com.boltframework.utils.httpclient.HttpRequest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A simple test class
 */
public class MyAppTest {

  @SuppressWarnings("WeakerAccess")
  static TestApplicationServer server = new TestApplicationServer(new ApplicationController());

  @Test
  public void index() {
    server.createRequest(HttpRequest.get("/")).then(res -> {
      int status = res.getStatus();
      assertEquals(200, status);
      assertTrue(res.getBody().contains("Hello, John and Welcome to Bolt!"));
      System.out.println(res.getBody());
    });
  }
}

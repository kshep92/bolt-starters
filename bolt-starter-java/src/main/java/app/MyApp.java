package app;

import app.controllers.ApplicationController;
import com.boltframework.Bolt;
import com.boltframework.web.WebService;
import com.boltframework.web.routing.ControllerCollection;

public class MyApp extends WebService {

  @Override
  public void addControllers(ControllerCollection controllers) {
    controllers.register(ApplicationController.class);
  }

  public static void main(String[] args) {
    Bolt.createService(MyApp.class).start();
  }
}

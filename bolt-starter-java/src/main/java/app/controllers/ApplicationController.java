package app.controllers;

import com.boltframework.web.mvc.Controller;
import com.boltframework.web.routing.annotations.Get;
import com.boltframework.web.routing.annotations.RequestMapping;


/**
 * A Controller
 */
@RequestMapping
public class ApplicationController extends Controller {

  @Get
  public void index() {
    context().put("name", "John").getResponse().renderHtml("index");
  }

}

package controllers;

import play.data.FormFactory;
import play.mvc.*;

import views.html.index;
import views.html.Home.*;


public class HomeController extends Controller {

    public Result index() {
        return ok(index.render("Hello world"));
    }

    public Result welcome(String name, String lastName){
        return ok(welcome.render(name, lastName));
    }

    public Result login(){
        return ok(login1.render());
    }


}

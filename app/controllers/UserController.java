package controllers;

import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;






import javax.inject.Inject;
import java.util.List;


import views.html.User.*;

public class UserController extends Controller {

    @Inject
    FormFactory formFactory;



    public Result index(){

        List<User> users = User.find.all();

        return ok(index.render(users));
    }

    public Result createUser(){

        Form<User> userForm = formFactory.form(User.class);
        return ok(create.render(userForm));

    }

    public Result save(){

        Form<User> userForm= formFactory.form(User.class).bindFromRequest();
        User user = userForm.get();
        user.save();
        return redirect(routes.UserController.index());

    }

    public Result edit(String id){

        User user = User.find.byId(id);
        Form<User> userForm = formFactory.form(User.class).fill(user);
        return ok(edit.render(userForm));
    }

    public Result update(){
        return TODO;
    }

    public Result destroy(Integer id){
        return TODO;
    }

    public Result show(Integer id){
        return TODO;
    }


}

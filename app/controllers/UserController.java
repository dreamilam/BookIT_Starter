package controllers;

import models.Event;
import models.EventManager;
import models.User;
import models.Customer;
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

        Form<Customer> customerForm = formFactory.form(Customer.class);
        return ok(createCustomer.render(customerForm));

    }

    public Result createEventManager(){
        Form<EventManager> eventManagerForm = formFactory.form(EventManager.class);
        return ok(createEventManager.render(eventManagerForm));
    }

    public Result saveCustomer(){

        Form<Customer> customerForm= formFactory.form(Customer.class).bindFromRequest();
        Customer customer = customerForm.get();

        customer.save();
        return redirect(routes.UserController.index());

    }

    public Result saveEventManager(){

        Form<EventManager> eventManagerForm= formFactory.form(EventManager.class).bindFromRequest();
        EventManager eventManager = eventManagerForm.get();

        eventManager.save();
        return redirect(routes.UserController.index());

    }

    public Result showProfile(){
        return TODO;

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

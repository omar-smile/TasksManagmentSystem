package model.services;

import model.views.UserLoginRVOImpl;

import model.views.UserLoginRVORowImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jan 19 23:21:55 PST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TasksAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public TasksAMImpl() {
    }

    /**
     * Container's getter for Tasks1.
     * @return Tasks1
     */
    public ViewObjectImpl getTasks1() {
        return (ViewObjectImpl) findViewObject("Tasks1");
    }

    /**
     * Container's getter for Users1.
     * @return Users1
     */
    public ViewObjectImpl getUsers1() {
        return (ViewObjectImpl) findViewObject("Users1");
    }

    /**
     * Container's getter for Tasks2.
     * @return Tasks2
     */
    public ViewObjectImpl getTasks2() {
        return (ViewObjectImpl) findViewObject("Tasks2");
    }

    /**
     * Container's getter for Tasks3.
     * @return Tasks3
     */
    public ViewObjectImpl getTasks3() {
        return (ViewObjectImpl) findViewObject("Tasks3");
    }

    /**
     * Container's getter for UserTypes1.
     * @return UserTypes1
     */
    public ViewObjectImpl getUserTypes1() {
        return (ViewObjectImpl) findViewObject("UserTypes1");
    }

    /**
     * Container's getter for UserLoginR1.
     * @return UserLoginR1
     */
    public UserLoginRVOImpl getUserLoginR1() {
        return (UserLoginRVOImpl) findViewObject("UserLoginR1");
    }

    /**
     * Container's getter for UsersTasksAssignedToFkVL1.
     * @return UsersTasksAssignedToFkVL1
     */
    public ViewLinkImpl getUsersTasksAssignedToFkVL1() {
        return (ViewLinkImpl) findViewLink("UsersTasksAssignedToFkVL1");
    }

    /**
     * Container's getter for UsersTasksAssignedByFkVL1.
     * @return UsersTasksAssignedByFkVL1
     */
    public ViewLinkImpl getUsersTasksAssignedByFkVL1() {
        return (ViewLinkImpl) findViewLink("UsersTasksAssignedByFkVL1");
    }
    
    
    public Integer findUser(String username, String password, String type) {
        System.out.println("### findUser ###");
        UserLoginRVOImpl vo = getUserLoginR1();
        vo.setusername(username);
        vo.setpassword(password);
        vo.settype(type);
        vo.executeQuery();
        System.out.println(vo.getQuery());

        
        if(vo.hasNext()){
            UserLoginRVORowImpl user = (UserLoginRVORowImpl) vo.next();
            System.out.println("###" + user + "###");
            return user.getUserId();
        }
        
        return null;
    }


    /**
     * Container's getter for UserTasksStatusCountR1.
     * @return UserTasksStatusCountR1
     */
    public ViewObjectImpl getUserTasksStatusCountR1() {
        return (ViewObjectImpl) findViewObject("UserTasksStatusCountR1");
    }
}


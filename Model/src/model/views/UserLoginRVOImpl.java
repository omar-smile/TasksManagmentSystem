package model.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jan 19 23:20:53 PST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserLoginRVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public UserLoginRVOImpl() {
    }

    /**
     * Returns the bind variable value for username.
     * @return bind variable value for username
     */
    public String getusername() {
        return (String) getNamedWhereClauseParam("username");
    }

    /**
     * Sets <code>value</code> for bind variable username.
     * @param value value to bind as username
     */
    public void setusername(String value) {
        setNamedWhereClauseParam("username", value);
    }

    /**
     * Returns the bind variable value for password.
     * @return bind variable value for password
     */
    public String getpassword() {
        return (String) getNamedWhereClauseParam("password");
    }

    /**
     * Sets <code>value</code> for bind variable password.
     * @param value value to bind as password
     */
    public void setpassword(String value) {
        setNamedWhereClauseParam("password", value);
    }

    /**
     * Returns the bind variable value for type.
     * @return bind variable value for type
     */
    public String gettype() {
        return (String) getNamedWhereClauseParam("type");
    }

    /**
     * Sets <code>value</code> for bind variable type.
     * @param value value to bind as type
     */
    public void settype(String value) {
        setNamedWhereClauseParam("type", value);
    }
}


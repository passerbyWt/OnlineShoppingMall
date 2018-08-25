package action;

import com.opensymphony.xwork2.ActionSupport;
import service.UserService;

public class RegisteredAction extends ActionSupport {
    private UserService userService;
    private String userName;
    private String passWord;
    private String passWord_2;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord_2() {
        return passWord_2;
    }

    public void setPassWord_2(String passWord_2) {
        this.passWord_2 = passWord_2;
    }

    public RegisteredAction() {

    }

    public String execute()
    {
        this.result=userService.registered(this.userName,this.passWord,this.passWord_2);
        return SUCCESS;
    }







}

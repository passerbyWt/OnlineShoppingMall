package action;

import com.opensymphony.xwork2.ActionSupport;
import service.UserService;

public class LoginAction extends ActionSupport{
    private UserService userService;
    private String userName;
    private String passWord;
    private String result;

    public LoginAction() {
    }

    public String getResult() {
        return result;

    }

    public void setResult(String result) {
        this.result = result;
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

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute()
    {
        this.result=userService.login(this.userName,this.passWord);

        return SUCCESS;
    }




}

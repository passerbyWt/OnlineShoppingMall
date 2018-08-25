package entity;

public class User {
    private int id;
    private String UserName;
    private String PassWord;
    public int getId() {
        return id;
    }

    public User() {
    }

    public User(int id, String userName, String passWord) {
        this.id = id;
        UserName = userName;
        PassWord = passWord;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }



}

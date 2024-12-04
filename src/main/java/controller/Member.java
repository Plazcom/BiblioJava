package controller;

public class Member {
    private int idmember;
    private String lastname;
    private String firstname;
    private String email;
    private String password;
    private String phone;
    private String status;
    private int credit;
    private boolean is_admin;

    public Member(int idmember, String lastname, String firstname, String email, String password, String phone, String status, int credit, boolean is_admin) {
        this.idmember = idmember;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.status = status;
        this.credit = credit;
        this.is_admin = is_admin;
    }
    public Member(String lastname, String firstname, String email, String password, String phone, String status, int credit, boolean is_admin) {
        this.idmember = 0;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.status = status;
        this.credit = credit;
        this.is_admin = is_admin;
    }
    public int getIdmember() {
        return idmember;
    }
    public void setIdmember(int idmember) {
        this.idmember = idmember;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public boolean isIs_admin() {
        return is_admin;
    }
    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

}
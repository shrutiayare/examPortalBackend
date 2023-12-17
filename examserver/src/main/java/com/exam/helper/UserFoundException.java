package com.exam.helper;

public class UserFoundException  extends  Exception{

    public UserFoundException() {
        super("User already exist !! try with another one");
    }

    public UserFoundException(String msg)
    {
        super(msg);
    }
}

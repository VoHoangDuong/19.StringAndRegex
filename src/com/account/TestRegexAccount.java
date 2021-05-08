package com.account;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String account;
        do {
            System.out.println("Nhập vào tên tài khoản hợp lệ:");
            account = scanner.next();
        }while (checkInputAccount(account) == false);
        System.out.println("Tên tài khoản có thể sử dụng");
    }

    public static boolean checkInputAccount(String account){
        String regex = "^[_a-z0-9]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(account);
        return matcher.find();
    }
}

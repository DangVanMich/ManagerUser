/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.IUserRepository;
import Repository.UserRepository;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManageUser extends Menu<String>{
    
    private IUserRepository repository = new UserRepository();
    public ManageUser(String title, String[] s){
        super(title, s);
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                repository.createUser();
                break;
            case 2:
                repository.login();
                break;
            case 3:
                System.exit(0);
        }
    }
    
}
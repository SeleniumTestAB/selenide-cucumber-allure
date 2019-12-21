package com.demo.cucumber.project.pages;

import com.demo.cucumber.project.modals.AddUserModal;
import com.demo.cucumber.project.pages.generic.elements.GenericAddButton;


public class UsersListViewPage {
    private final GenericAddButton addNewUserButton = new GenericAddButton("Add User");

    public AddUserModal clickOnAddNewUserButton() {
        return addNewUserButton.addItem(new AddUserModal());
    }

}

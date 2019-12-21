package com.demo.cucumber.project.modals;


import com.demo.cucumber.project.pages.generic.elements.GenericDropdownList;

public class AddUserModal {
    private final GenericDropdownList essRoleSelect = new GenericDropdownList("essrole_inputfileddiv");
    private final GenericDropdownList supervisorRoleSelect = new GenericDropdownList("supervisorrole_inputfileddiv");
    private final GenericDropdownList adminRoleSelect = new GenericDropdownList("adminrole_inputfileddiv");
    private final GenericDropdownList statusSelect = new GenericDropdownList("status_inputfileddiv");
}

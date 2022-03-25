package com.goldmann.fleetaplication;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicationController {


    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/hr")
    public String hr() {
        return "/hr/index";
    }

    @GetMapping("/helpdesk")
    public String helpdesk() {
        return "/helpdesk/index";
    }

    @GetMapping("/fleet")
    public String fleet() {
        return "/fleet/index";
    }

    @GetMapping("/accounts")
    public String accounts() {
        return "/accounts/index";
    }

    @GetMapping("/payroll")
    public String payroll() {
        return "/payroll/index";
    }

    @GetMapping("/parameters")
    public String parameters() {
        return "/parameters/index";
    }

    @GetMapping("/reports")
    public String reports() {
        return "/reports/index";
    }

    @GetMapping("/security")
    public String security() {
        return "/security/index";
    }
}

package com.DilumBMK.ToolManagementSystem.controller;

import com.DilumBMK.ToolManagementSystem.service.ToolsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tools")
public class ToolsController {

    private final ToolsService toolsService;

    public ToolsController(ToolsService toolsService) {
        this.toolsService = toolsService;
    }
}

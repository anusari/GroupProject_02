package com.DilumBMK.ToolManagementSystem.service;

import com.DilumBMK.ToolManagementSystem.repo.ToolsRepo;
import org.springframework.stereotype.Service;

@Service
public class ToolsService {

    private final ToolsRepo toolsRepo;

    public ToolsService(ToolsRepo toolsRepo) {
        this.toolsRepo = toolsRepo;
    }
}

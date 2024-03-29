package com.stareast.web.controller.tool;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stareast.framework.web.base.BaseController;

/**
 * build 表单构建
 *
 * @author stareast
 */
@Controller
@RequestMapping("/tool/build")
public class BuildController extends BaseController {
    private String prefix = "tool/build";

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build() {
        return prefix + "/build";
    }
}

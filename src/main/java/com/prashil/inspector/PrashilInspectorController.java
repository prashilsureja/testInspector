package com.prashil.inspector;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prashil on 10/11/16.
 */

@RestController
@RequestMapping("/inspector")
public class PrashilInspectorController {
    @RequestMapping("v1/inspect")
    void mask() {
        System.out.println("Inspected Data");
    }
}

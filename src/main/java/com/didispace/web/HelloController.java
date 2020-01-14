package com.didispace.web;

import com.didispace.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqi
 * @date 2019-09-25 17:03
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public UserVo index(){
        UserVo userVo = new UserVo();
        userVo.setId(999999999999999999L);
        userVo.setName("name");
        return userVo;
    }
}

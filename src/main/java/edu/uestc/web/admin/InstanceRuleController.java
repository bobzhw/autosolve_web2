package edu.uestc.web.admin;

import com.google.common.base.Strings;
import edu.uestc.po.InstanceRule;
import edu.uestc.po.User;
import edu.uestc.service.InstanceRuleService;
import edu.uestc.service.QuestionService;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
* @description 实例化规则查询
* @author cyq7on
* @create 2020/3/12
**/
@Controller
@RequestMapping("admin/instance")
public class InstanceRuleController {

    @Autowired
    private InstanceRuleService ruleService;

    @GetMapping("/query")
    public String query(HttpSession session, Model model , @RequestParam(required = true) String keyword) {
        User user = (User) session.getAttribute("user");
        if (user != null) {
            if (Strings.isNullOrEmpty(keyword)) {
                return "admin/rule";
            }
            List<InstanceRule> instanceRuleList = ruleService.query(keyword);
            System.out.println(instanceRuleList);
            model.addAttribute("instanceRuleList", instanceRuleList);
            return "admin/queryRuleResult";
        }
        return "admin/login";
    }

}

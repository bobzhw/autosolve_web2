package edu.uestc.service;

import edu.uestc.po.InstanceRule;
import edu.uestc.po.User;

import java.util.List;


public interface InstanceRuleService {

    List<InstanceRule> query(String keyword);

}

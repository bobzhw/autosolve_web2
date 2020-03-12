package edu.uestc.service;

import edu.uestc.dao.InstanceRuleRepository;
import edu.uestc.dao.UserRepository;
import edu.uestc.po.InstanceRule;
import edu.uestc.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zw on 2019/12/14.
 */
@Service
public class InstanceRuleServiceImpl implements InstanceRuleService {

    @Autowired
    private InstanceRuleRepository ruleRepository;

    @Override
    public List<InstanceRule> query(String keyword) {
        return ruleRepository.query(keyword);
    }
}

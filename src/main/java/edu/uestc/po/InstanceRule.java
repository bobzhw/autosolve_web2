package edu.uestc.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @description 实例化规则
* @author cyq7on
* @create 2020/3/12
**/
@Entity
@Table(name = "instance_rule")
public class InstanceRule {
    @Id
    private int ruleId;
    private String ruleName;
    private String ruleContent;
    //0-集合，1-函数，2-三角函数，3-向量，4-数列，5-复数，6-平面几何，7-解析几何
    private int type;

    public int getRuleId() {
        return ruleId;
    }

    public void setRuleId(int ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleContent() {
        return ruleContent;
    }

    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public InstanceRule() {
    }

    public InstanceRule(int ruleId, String ruleName, String ruleContent, int type) {
        this.ruleId = ruleId;
        this.ruleName = ruleName;
        this.ruleContent = ruleContent;
        this.type = type;
    }

    @Override
    public String toString() {
        return "InstanceRule{" +
                "ruleId=" + ruleId +
                ", ruleName='" + ruleName + '\'' +
                ", ruleContent='" + ruleContent + '\'' +
                ", type=" + type +
                '}';
    }
}

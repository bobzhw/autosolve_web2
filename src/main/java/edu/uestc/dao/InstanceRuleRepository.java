package edu.uestc.dao;
import edu.uestc.po.InstanceRule;
import edu.uestc.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.validation.constraints.Max;
import java.util.List;


/**
* @description
* @author cyq7on
* @create 2020/3/12
**/
public interface InstanceRuleRepository extends JpaRepository<InstanceRule,Long> {
    @Query(value="SELECT * FROM instance_rule where rule_content LIKE %?1%",nativeQuery = true)
    List<InstanceRule> query(@Param("keyword")String keyword);
}

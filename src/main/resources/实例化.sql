use autosolve_test;
SELECT * FROM autosolve_test.instance_rule where type = 7;
delete FROM autosolve_test.instance_rule where rule_name='定理名字' or rule_content = '定理内容' or rule_content='';
update instance_rule set type=7 where rule_id>567 ;
SET SQL_SAFE_UPDATES = 0;
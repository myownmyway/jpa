create table `company`
(
    company_id   bigint(11) primary key comment '公司id',
    company_name varchar(255) comment '公司名称'
) engine = InnoDB
  charset = utf8 comment '公司表';
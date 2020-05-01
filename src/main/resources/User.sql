create table `user`
(
    id         bigint(11) auto_increment primary key comment '自增主键',
    username   varchar(255) comment '用户名',
    password   varchar(255) comment '用户密码',
    company_id bigint(11) comment '公司id'
) engine = InnoDB
  charset = utf8 comment ='用户表';
create table if not exists ds0.t_order1
(
    id
    int
    unsigned
    auto_increment
    primary
    key,
    order_id
    int
    not
    null,
    name
    varchar
(
    20
) default '' null,
    createtime datetime default CURRENT_TIMESTAMP not null
    )
    comment '表1';

create table if not exists ds0.t_order2
(
    id
    int
    unsigned
    auto_increment
    primary
    key,
    order_id
    int
    not
    null,
    name
    varchar
(
    20
) default '' null,
    createtime datetime default CURRENT_TIMESTAMP not null
    )
    comment '表2';


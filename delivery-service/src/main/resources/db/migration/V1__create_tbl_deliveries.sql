CREATE TABLE tbl_deliveries
(
    delivery_id     BIGINT(20) NOT NULL AUTO_INCREMENT,
    order_number    BIGINT(20) NOT NULL,
    delivery_person VARCHAR(100) NULL,
    delivery_status VARCHAR(20) NOT NULL,
    delivery_date   DATE NULL,
    PRIMARY KEY (delivery_id)
);

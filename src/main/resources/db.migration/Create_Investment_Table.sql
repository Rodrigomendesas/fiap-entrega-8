CREATE TABLE investment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    investment_type VARCHAR(255) NOT NULL,
    amount DOUBLE NOT NULL,
    date DATE
    );
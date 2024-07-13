SET search_path TO rl_api_payments;

CREATE TABLE payment_methods (
    id_payment_method SERIAL PRIMARY KEY,
    entity VARCHAR(255) NOT NULL
);

SET search_path TO rl_api_payments;

CREATE TABLE installments (
    id_installment SERIAL PRIMARY KEY,
    quantity INTEGER NOT NULL,
    interest VARCHAR(255) NOT NULL,
    id_payment_method INTEGER NOT NULL,
    CONSTRAINT fk_payment_method FOREIGN KEY (id_payment_method) REFERENCES payment_methods(id_payment_method)
);
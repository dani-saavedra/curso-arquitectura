CREATE TABLE transaccion (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     cuenta_origen VARCHAR(20) NOT NULL,
     cuenta_destino VARCHAR(20) NOT NULL,
     monto DECIMAL(15,2) NOT NULL,
     fecha DATETIME NOT NULL
);

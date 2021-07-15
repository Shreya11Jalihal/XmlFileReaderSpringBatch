DROP TABLE IF EXISTS Vehicle;

CREATE TABLE Vehicle (
VIN INT(6),
brand VARCHAR(10) NOT NULL,
country VARCHAR(15),
contractName VARCHAR(20),
processingTime DATE
);
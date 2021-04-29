USE insoftar_formulario;
CREATE TABLE usuario (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
primer_nombre VARCHAR (30) NOT NULL,
segundo_nombre VARCHAR (30) NOT NULL,
primer_apellido VARCHAR (30) NOT NULL,
segundo_apellido VARCHAR (30) NOT NULL,
cedula BIGINT(10) NOT NULL UNIQUE,
correo VARCHAR(50) NOT NULL UNIQUE,
telefono BIGINT(10) NOT NULL UNIQUE
);
create database if not exists EVENTOS;
use EVENTOS;

/*CREATE TABLE */

CREATE TABLE IF NOT EXISTS estados_evento (
    codigo_estado INT PRIMARY KEY NOT NULL,
    descripcion_estado VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS eventos (
    codigo_evento INT PRIMARY KEY NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    descripcion_corta VARCHAR(255) NOT NULL,
    descripcion_extensa VARCHAR(255),
    fecha DATETIME NOT NULL,
    imagen VARCHAR(255),
    codigo_estado INT NOT NULL,
    FOREIGN KEY (codigo_estado) REFERENCES estados_evento (codigo_estado)
);

CREATE TABLE IF NOT EXISTS personas (
    codigo_persona INT PRIMARY KEY NOT NULL,
    documento VARCHAR(20) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    email VARCHAR(255) NOT NULL,
    es_interesado TINYINT(1) NOT NULL,
    fecha_alta TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS restricciones_alimentarias (
    codigo_restriccion INT PRIMARY KEY NOT NULL,
    descripcion_restriccion VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS inscriptos (
	codigo_persona INT  NOT NULL,
    codigo_evento INT NOT NULL,
    tiene_transporte TINYINT(1) NOT NULL,
    codigo_restriccion INT NOT NULL,
    PRIMARY KEY (`codigo_evento`,`codigo_persona`),
    FOREIGN KEY (codigo_evento) REFERENCES eventos(codigo_evento),
    FOREIGN KEY (codigo_persona) REFERENCES personas(codigo_persona),
    FOREIGN KEY (codigo_restriccion) REFERENCES restricciones_alimentarias(codigo_restriccion)
);



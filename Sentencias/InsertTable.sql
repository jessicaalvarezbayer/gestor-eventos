INSERT INTO estados_evento (codigo_estado, descripcion_estado)
VALUES 
    (1, 'Borrador'),
    (2, 'Confirmado'),
    (3, 'Cancelado');

    
INSERT INTO eventos (codigo_evento, titulo, descripcion_corta, descripcion_extensa, fecha, imagen, codigo_estado)
VALUES
    (1, 'Vení a conocer el CRRE', 'Acompañamos en una nueva jornada a beneficio', 'Llena tu corazón en el mes de mayo con caballos!!! Vuelven las visitas!! No te la podés perder!!! ¡¡Anotate a esta visita increíble que venimos preparando para vos!!', '2023-05-11 11:30:00','URL', 2),
    (2, 'Rifa a beneficio', 'Tenemos una hermosa novedad para contarles y es que… TENEMOS RIFA A BENEFICIO','','2023-05-30 12:30:00','',1),
    (3, 'Vení a la próxima charla', 'Charla de concientización sobre TAS', '', '2023-05-11 11:30:00','URL', 2);


INSERT INTO restricciones_alimentarias (codigo_restriccion, descripcion_restriccion)
VALUES
    (1, 'Veganismo'),
    (2, 'Diabetes');

INSERT INTO personas (codigo_persona, documento,nombre,apellido,fecha_nacimiento,email,es_interesado,fecha_alta,fecha_actualizacion)
VALUES 
    (1, '32434333', 'Manuel', 'Alvarez','1986-09-15', 'mAlvarez@gmail.com',0,NOW(),NOW()),
    (2, '12445343', 'Maria', 'Recchini','1987-04-01', 'mRecchini@gmail.com',0,NOW(),NOW()),
    (3, '27598332', 'Alejandro', 'Ruiz','1977-10-01', 'aRuiz@gmail.com',0,NOW(),NOW());
   
    
INSERT INTO inscriptos (tiene_transporte, codigo_persona,codigo_restriccion,codigo_evento)
VALUES 
    (1, 1, 2,1),
    (1, 2, 1,1);
    
    

  
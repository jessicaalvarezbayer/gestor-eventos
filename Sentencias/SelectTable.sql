SELECT
    EV.codigo_evento AS 'Id evento',
    EV.titulo AS 'Título',
    EE.descripcion_estado AS 'Estado evento',
    PE.documento AS 'Documento Inscripto',
    PE.apellido AS 'Apellido Inscripto',
    RES.descripcion_restriccion AS 'Restricción alimentaria',
    INS.tiene_transporte AS 'Tiene transporte propio'
FROM 
    estados_evento EE,
    eventos EV,
    personas PE,
    restricciones_alimentarias RES,
    inscriptos INS
WHERE 
    EV.codigo_estado = EE.codigo_estado 
    AND RES.codigo_restriccion = INS.codigo_restriccion
    AND PE.codigo_persona = INS.codigo_persona
    AND INS.codigo_evento = EV.codigo_evento;

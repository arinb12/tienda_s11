/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author arian
 */
public interface ReporteService {
    
    public ResponseEntity<Resource>
            generaReporte(String reporte, Map<String, Object> parametros, String tipo) throws IOException;//obtiene los parametros del reporte y viene el tipo de reporte que vamos a descargar en la aplicacion (csv, pdf, excel o ver nada mas)
    
}

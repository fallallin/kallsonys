/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servientrega.negocio;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.http.HTTPException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

/**
 * Clase abstracta con las operaciones principales utilizadas en el CRUD
 * de los servicios REST.
 * 
 * @author GeneradorCRUD
 */
/**
 * Clase abstracta con las operaciones principales utilizadas en el CRUD
 * de los servicios REST. 
 * @author GeneradorCRUD
 *
 * @param <E> La entidad sobre la cual se realizan las operaciones CRUD o operaciones de negocio
 * @param <D> El DAO asociado a la entidad E que se utiliza para transmitir su información por medio de http
 */
public abstract class NegocioAbstracto<E,D> {
   /**
    * Devuelve el logger del servicio que extiende est� clase. 
    * 
    * @return  Logger
    */
   protected abstract Logger getLogger();
   
   /**
    * Devuelve una nueva instancia del DAO D
    * 
    * @return Una instancia sin valores asignados del Dao D
    */
   protected abstract D instanciarDTO();
   
   protected abstract E instanciarEntidad();
   
    /**
     * Copia el valor que contienen los atributos del objeto fuente 
     * a los atributos del objeto destino cuyos nombres sean exactamente iguales.
     * Los atributos que no coinciden se omiten (Se dejan tal cual como estaban 
     * en el objeto destino).
     * 
     * @param destino objeto al que se le van a setear los valores de sus atributos
     * @param fuente objeto del que se copian los valores de los atributos
     */
    protected void copiarPropiedades(Object destino, Object fuente) {
        
        try {
            BeanUtils.copyProperties(destino, fuente);
        } catch (IllegalAccessException | InvocationTargetException ex) {
            getLogger().error(ex);
            throw new HTTPException(500);
        } 
    }
    
    /**
     * Imprime en el log el llamado al servicio que se pasa como par�metro, 
     * imprimiendo cada uno de los par�metros que recibe.
     * 
     * @param className Nombre de la clase que contiene al servicio
     * @param nombreServicio Nombre del servicio
     * @param parameters Par�metros que recibe el servicio.
     */
    protected void logService(String className, String nombreServicio, Object... parameters){
        getLogger().debug(className+"."+nombreServicio+" --> Inicio");
        for(int i =0; i<parameters.length; i++){
            getLogger().debug(className+"."+nombreServicio+" --> parametro +"+i+": "+parameters[i]);
        }
    }
    
    /**
     * Convierte una lista de la entidad E a una lista de DAOs D correspondientes
     * a la entidad E.
     * 
     * @param entidades Lista de entidades a ser transformada
     * @return  Una lista con los DAOs correspondientes a las entidades que se pasaron como parámetro
     */
    protected List<D> convertirListaEntidadesADto(List<E> entidades){
        List<D> listaDAO = new ArrayList<>();
        for(E entidad : entidades) {       
            listaDAO.add(convertirEntidadADto(entidad));
        }
        
        return listaDAO;
    }
    
    protected List<E> convertirListaDtoAEntidades(List<D> dtos){
        List<E> listaEntidades = new ArrayList<>();
        for(D dto : dtos) {       
            listaEntidades.add(convertirDtoAEntidad(dto));
        }
        
        return listaEntidades;
    }
    
    /**
     * Convierte la entidad E que se pasa como parámetro a su correspondiente DAO D.
     * 
     * @param entidad Entidad a ser trasnformada
     * @return Un DAO D con la información de la entidad que se pasó como parámetro
     */
    protected D convertirEntidadADto(E entidad){
        D dao = instanciarDTO();
        copiarPropiedades(dao, entidad);  
        
        return dao;
    }
    
    /**
     * Convierte la entidad E que se pasa como parámetro a su correspondiente DAO D.
     * 
     * @param entidad Entidad a ser trasnformada
     * @return Un DAO D con la información de la entidad que se pasó como parámetro
     */
    protected E convertirDtoAEntidad(D dto){
        E entidad = instanciarEntidad();
        copiarPropiedades(entidad, dto);  
        
        return entidad;
    }
    
    
}

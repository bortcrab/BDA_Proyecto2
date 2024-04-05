/*
 * IRegistroLicenciaBO.java
 */
package negocio;

import dtos.LicenciaDTO;
import dtos.TarifaLicenciaDTO;
import dtos.PersonaDTO;
import entidades.LicenciaEntidad;
import entidades.PersonaEntidad;
import excepciones.NegocioException;
import java.util.List;

/**
 * Interfaz que define métodos para aplicar las reglas de negocio y llevar a cabo
 * el registro de una licencia.
 * @author Diego Valenzuela Parra - 00000247700
 * @author Juventino López García - 00000248547
 */
public interface IRegistroLicenciaBO {
    
    /**
     * Método para buscar a una persona dada una CURP.
     * @param curp CURP de la persona a buscar.
     * @return Persona encontrada.
     * @throws NegocioException si no se encuentra ninguna persona.
     */
    public PersonaDTO buscarPersonaCurp(String curp) throws NegocioException;
    
    /**
     * Método para validar que la persona solicitante cumple con los requisitos
     * para tramitar una licencia.
     * @param persona Persona solicitante.
     * @throws NegocioException si la persona no cumple con los requisitos.
     */
    public void validarRequisitos(PersonaDTO persona) throws NegocioException;
    
    /**
     * Método para calcular si una persona es menor de edad.
     * @param persona Persona de la cual se quiere calcular la edad.
     * @return Verdadero si la persona es menor de edad, false si es mayor.
     */
    public boolean menorDeEdad(PersonaDTO persona);
    
    /**
     * Método para obtener las tarifas de licencia que hay disponibles.
     * @return Una lista con las tarifas encontradas.
     */
    public List<TarifaLicenciaDTO> buscarTarifasLicencia();
    
    /**
     * Método para agregar una licencia a la base de datos.
     * @param curp CURP de la persona solicitante.
     * @param licenciaDTO Licencia que se agregará.
     * @throws NegocioException si no se encontró alguna persona con la CURP proporcionada.
     */
    public void agregarLicencia(String curp, LicenciaDTO licenciaDTO) throws NegocioException;
    
    /**
     * Método para convertir de PersonaDTO a PersonaEntidad.
     * @param personaDTO Persona a convertir.
     * @return PersonaEntidad ya convertida.
     */
    public PersonaEntidad convertirPersonaDTO_Entidad(PersonaDTO personaDTO);
    
    /**
     * Método para convertir una licencia de DTO a entidad.
     * @param licenciaDTO LicenciaDTO a convertir.
     * @return LicenciaEntidad ya convertida.
     */
    public LicenciaEntidad convertirLicenciaDTO_Entidad(LicenciaDTO licenciaDTO);
}

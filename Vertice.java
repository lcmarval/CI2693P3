/**
 * Vertice.java
 * Autores: 
 * @author Pablo González. Carnet: 13-10575
 * @author Luis Marval. Carnet: 12-10620
 */

import java.util.*;

public class Vertice
{
  private String id;
  private int peso;
  private String material;
  private Vertice contrario;
  private LinkedList<Vertice> predecesores;
  private LinkedList<Vertice> sucesores;

/** 
 * Vertice:
 * Crea un vertice con identificador y altura
 * Parametros de entrada: 
 * @param id: tipo String, identificador del vertice
 * @param peso: tipo int, peso del cubo
 * @param material: tipo int, nuemro del material de la cara
 * Parametros de salida:
 * @throws vertice: objeto tipo Vertice
*/ 
  public Vertice(String id, int peso, int material) {
    this.id = id;
    this.peso = peso;
    this.material = material;
    contrario = null;
    predecesores = new LinkedList<Vertice>();
    sucesores = new LinkedList<Vertice>();
  }


/** 
 * getId:
 * Devuelve el id del vertice
 * Parametros de entrada: 
 * @param vertice: tipo Vertice
 * Parametros de salida:
 * @throws id: tipo String, lado de la cara del cubo
*/ 
  public String getId() {
  	return id;
  }

/** 
 * getSucesores:
 * Devuelve la lista de sucesores del vertice
 * Parametros de entrada: 
 * @param vertice: tipo Vertice
 * Parametros de salida:
 * @throws sucesores: tipo Lista de vertices, sucesores del vertice.
*/ 
  public LinkedList<Vertice> getSucesores() {
    return sucesores;
  }

/** 
 * getPredecesores:
 * Devuelve la lista de predecesores del vertice
 * Parametros de entrada: 
 * @param vertice: tipo Vertice
 * Parametros de salida:
 * @throws predecesores: tipo Lista de vertices, predecesores del vertice.
*/ 
  public LinkedList<Vertice> getPredecesores() {
    return predecesores;
  }

/** 
 * getContra:
 * Devuelve el vertice de la cara contraria al vertice actual
 * Parametros de entrada: 
 * @param vertice: tipo Vertice
 * Parametros de salida:
 * @throws contrario: tipo Vertice, vertice de cara contraria al vertice actual
*/ 
  public Vertice getContra() {
    return contrario;
  }

/** 
 * setContra:
 * Modifica el vertice que representa la cara contraria al vertice actual
 * Parametros de entrada: 
 * @param vertice: tipo Vertice
 * @param contrario: tipo Vertice
 * Parametros de salida:
 * @throws void
*/ 
  public void setContra(Vertice contrario) {
    this.contrario= contrario
  }

/**
* toString:
* Devuelve una representacion del vertice v como una cadena de caracteres
* Parametros de entrada:
* @param vertice: objeto tipo Vertice
* Parametros de salida:
* @throws : tipo String, representacion del vertice como una cadena de caracteres
*/
  public String toString() { 
  	return id + " " + String.valueOf(peso);
  }
}
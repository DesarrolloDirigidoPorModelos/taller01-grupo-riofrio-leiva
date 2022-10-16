/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problematica;

/**
 *
 * @author Milton_Leiva
 */
class Medidor {
    
  
  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Medidor Attributes
  private int id_medidor;
  private String marca;
  private String direccion;
  private double costo;

  //Medidor Associations
  private Cliente cliente;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Medidor(int aId_medidor, String aMarca, String aDireccion, double aCosto, Cliente aCliente)
  {
    id_medidor = aId_medidor;
    marca = aMarca;
    direccion = aDireccion;
    costo = aCosto;
    boolean didAddCliente = setCliente(aCliente);
    if (!didAddCliente)
    {
      throw new RuntimeException("Unable to create medidor due to cliente. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId_medidor(int aId_medidor)
  {
    boolean wasSet = false;
    id_medidor = aId_medidor;
    wasSet = true;
    return wasSet;
  }

  public boolean setMarca(String aMarca)
  {
    boolean wasSet = false;
    marca = aMarca;
    wasSet = true;
    return wasSet;
  }

  public boolean setDireccion(String aDireccion)
  {
    boolean wasSet = false;
    direccion = aDireccion;
    wasSet = true;
    return wasSet;
  }

  public boolean setCosto(double aCosto)
  {
    boolean wasSet = false;
    costo = aCosto;
    wasSet = true;
    return wasSet;
  }

  public int getId_medidor()
  {
    return id_medidor;
  }

  public String getMarca()
  {
    return marca;
  }

  public String getDireccion()
  {
    return direccion;
  }

  public double getCosto()
  {
    return costo;
  }
  /* Code from template association_GetOne */
  public Cliente getCliente()
  {
    return cliente;
  }
  /* Code from template association_SetOneToMany */
  public boolean setCliente(Cliente aCliente)
  {
    boolean wasSet = false;
    if (aCliente == null)
    {
      return wasSet;
    }

    Cliente existingCliente = cliente;
    cliente = aCliente;
    if (existingCliente != null && !existingCliente.equals(aCliente))
    {
      existingCliente.removeMedidor(this);
    }
    cliente.addMedidor(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Cliente placeholderCliente = cliente;
    this.cliente = null;
    if(placeholderCliente != null)
    {
      placeholderCliente.removeMedidor(this);
    }
  }


  @Override
  public String toString()
  {
    return   "["+
            "id_medidor" + ":" + getId_medidor()+ "," +
            "marca" + ":" + getMarca()+ "," +
            "direccion" + ":" + getDireccion()+ "," +
            "costo" + ":" + getCosto()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "cliente = "+(getCliente()!=null?Integer.toHexString(System.identityHashCode(getCliente())):"null");
  }
    
    
    
}

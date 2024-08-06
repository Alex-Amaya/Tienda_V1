package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Especificar que es una capa de datos
@Entity // Esta clase esta enlazada a una tabla en la base de datos
@Table(name = "categoria") // Especificar cual entidad

public class Categoria {

  private static final long serialVersionUID = 1L; // autoincremento en Java MySQL(AUTO_INCREMENT)

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idcategoria")

  private Long idcategoria;
  private String descripcion;
  private String rutaimagen;
  private boolean activo;

  @ManyToOne
  @JoinColumn(name = "id_categoria", updatable=false)
  Categoria categoria;

  public Categoria() {
  }

  public Categoria(String categoria, boolean activo) {
    this.descripcion = categoria;
    this.activo = activo;
  }

    public Long getIdCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setRutaImagen(String cargaImagen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

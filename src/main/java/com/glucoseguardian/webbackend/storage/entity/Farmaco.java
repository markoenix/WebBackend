package com.glucoseguardian.webbackend.storage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

/**
 * Questa classe rappresenta l'entità Farmaco.
 */
@Entity
public class Farmaco {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private long id;

  @Column(length = 50, nullable = false)
  private String nomeFarmaco;
  private String principioAttivo;
  private String confezione;


  public Farmaco() {
  }

  /**
   * Costruttore di default della classe Farmaco.
   */
  public Farmaco(String nomeFarmaco, String principioAttivo, String confezione) {
    this.nomeFarmaco = nomeFarmaco;
    this.principioAttivo = principioAttivo;
    this.confezione = confezione;

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Farmaco farmaco = (Farmaco) o;
    return id == farmaco.id && Objects.equals(nomeFarmaco, farmaco.nomeFarmaco)
        && Objects.equals(principioAttivo, farmaco.principioAttivo)
        && Objects.equals(confezione, farmaco.confezione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeFarmaco, principioAttivo, confezione);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNomeFarmaco() {
    return nomeFarmaco;
  }

  public void setNomeFarmaco(String nomeFarmaco) {
    this.nomeFarmaco = nomeFarmaco;
  }

  public String getPrincipioAttivo() {
    return principioAttivo;
  }

  public void setPrincipioAttivo(String principioAttivo) {
    this.principioAttivo = principioAttivo;
  }

  public String getConfezione() {
    return confezione;
  }

  public void setConfezione(String confezione) {
    this.confezione = confezione;
  }

  @Override
  public String toString() {
    return "Farmaco{"
        + "id=" + id
        + ", nomeFarmaco='" + nomeFarmaco + '\''
        + ", principioAttivo='" + principioAttivo + '\''
        + ", confezione='" + confezione + '\''
        + '}';
  }


}

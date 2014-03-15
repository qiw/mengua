package com.simnect.mengua.entities.base;


public abstract class MenguaEntity {
  public abstract Long retrievePKId();

  public abstract void syncCreatedAt();

  public abstract void syncUpdatedAt();

}

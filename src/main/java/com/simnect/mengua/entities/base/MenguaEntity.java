package com.simnect.mengua.entities.base;


public abstract class MenguaEntity {
  // TODO: remove
  public abstract Long retrievePKId();

  public abstract void syncCreatedAt();

  public abstract void syncUpdatedAt();

}

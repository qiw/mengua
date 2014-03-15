package com.simnect.mengua.rest.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MenguaErrorBean {
  private String errMsg;

  // TODO: err code
  public MenguaErrorBean() {
  }

  public MenguaErrorBean(String msg) {
    this.setErrMsg(msg);
  }

  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }
}

package model;

//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2013-12-05 by the VDM++ to JAVA Code Generator
// (v9.0.2 - Thu 14-Mar-2013 12:36:47 +0900)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "C:\\Users\\Ana Gomes\\Documents\\git\\mfes-amazonas\\ficheiros em rtf\\Arrow.rtf".

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.Record;
import jp.vdmtools.VDM.Sentinel;
import jp.vdmtools.VDM.EvaluatePP;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class Arrow extends Piece {


// ***** VDMTOOLS START Name=ArrowSentinel KEEP=NO
  class ArrowSentinel extends PieceSentinel {

    public final int Arrow = 5;

    public final int nr_functions = 6;


    public ArrowSentinel () throws CGException {}


    public ArrowSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=ArrowSentinel
;

// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new ArrowSentinel(this);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=vdm_init_Arrow KEEP=NO
  private void vdm_init_Arrow () {}
// ***** VDMTOOLS END Name=vdm_init_Arrow


// ***** VDMTOOLS START Name=Arrow KEEP=NO
  public Arrow () throws CGException {
    vdm_init_Arrow();
  }
// ***** VDMTOOLS END Name=Arrow


// ***** VDMTOOLS START Name=Arrow#2|Number|Number KEEP=NO
  public Arrow (final Number x, final Number y) throws CGException {
    super(x, y);
    vdm_init_Arrow();
  }
// ***** VDMTOOLS END Name=Arrow#2|Number|Number

}
;

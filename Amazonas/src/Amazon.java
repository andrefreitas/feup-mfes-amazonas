//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2013-11-29 by the VDM++ to JAVA Code Generator
// (v9.0.2 - Thu 14-Mar-2013 12:36:47 +0900)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "C:\\Users\\Ana Gomes\\Desktop\\ficheiros em rtf\\Amazon.rtf".

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.Record;
import jp.vdmtools.VDM.Sentinel;
import jp.vdmtools.VDM.EvaluatePP;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class Amazon extends Piece {

// ***** VDMTOOLS START Name=color KEEP=NO
  private volatile Object color = null;
// ***** VDMTOOLS END Name=color


// ***** VDMTOOLS START Name=AmazonSentinel KEEP=NO
  class AmazonSentinel extends PieceSentinel {

    public final int Amazon = 5;

    public final int GetColor = 6;

    public final int nr_functions = 7;


    public AmazonSentinel () throws CGException {}


    public AmazonSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=AmazonSentinel
;

// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new AmazonSentinel(this);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=vdm_init_Amazon KEEP=NO
  private void vdm_init_Amazon () {}
// ***** VDMTOOLS END Name=vdm_init_Amazon


// ***** VDMTOOLS START Name=Amazon KEEP=NO
  public Amazon () throws CGException {
    vdm_init_Amazon();
  }
// ***** VDMTOOLS END Name=Amazon


// ***** VDMTOOLS START Name=Amazon#3|Number|Number|Object KEEP=NO
  public Amazon (final Number x, final Number y, final Object c) throws CGException {
    super(x, y);
    vdm_init_Amazon();
    color = UTIL.clone(c);
  }
// ***** VDMTOOLS END Name=Amazon#3|Number|Number|Object


// ***** VDMTOOLS START Name=GetColor KEEP=NO
  public Object GetColor () throws CGException {
    sentinel.entering(((AmazonSentinel)sentinel).GetColor);
    try {
      return color;
    }
    finally {
      sentinel.leaving(((AmazonSentinel)sentinel).GetColor);
    }
  }
// ***** VDMTOOLS END Name=GetColor

}
;

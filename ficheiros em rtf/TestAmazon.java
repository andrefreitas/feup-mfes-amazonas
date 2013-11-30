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

// This file was genereted from "C:\\Users\\Ana Gomes\\Desktop\\ficheiros em rtf\\TestAmazon.rtf".

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.Sentinel;
import jp.vdmtools.VDM.EvaluatePP;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class TestAmazon implements EvaluatePP {

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=TestAmazonSentinel KEEP=NO
  class TestAmazonSentinel extends Sentinel {

    public final int AssertTrue = 0;

    public final int TestAmazonMethods = 1;

    public final int nr_functions = 2;


    public TestAmazonSentinel () throws CGException {}


    public TestAmazonSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=TestAmazonSentinel
;

// ***** VDMTOOLS START Name=evaluatePP#1|int KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException {
    return Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=evaluatePP#1|int


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new TestAmazonSentinel(this);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=vdm_init_TestAmazon KEEP=NO
  private void vdm_init_TestAmazon () {
    try {
      setSentinel();
    }
    catch (Exception e) {
      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_TestAmazon


// ***** VDMTOOLS START Name=TestAmazon KEEP=NO
  public TestAmazon () throws CGException {
    vdm_init_TestAmazon();
  }
// ***** VDMTOOLS END Name=TestAmazon


// ***** VDMTOOLS START Name=AssertTrue#1|Boolean KEEP=NO
  public void AssertTrue (final Boolean a) throws CGException {
    sentinel.entering(((TestAmazonSentinel)sentinel).AssertTrue);
    try {
      if (!this.pre_AssertTrue(a).booleanValue()) 
        UTIL.RunTime("Precondition failure in AssertTrue");
      return;
    }
    finally {
      sentinel.leaving(((TestAmazonSentinel)sentinel).AssertTrue);
    }
  }
// ***** VDMTOOLS END Name=AssertTrue#1|Boolean


// ***** VDMTOOLS START Name=pre_AssertTrue#1|Boolean KEEP=NO
  public Boolean pre_AssertTrue (final Boolean a) throws CGException {
    return a;
  }
// ***** VDMTOOLS END Name=pre_AssertTrue#1|Boolean


// ***** VDMTOOLS START Name=TestAmazonMethods KEEP=NO
  public void TestAmazonMethods () throws CGException {
    sentinel.entering(((TestAmazonSentinel)sentinel).TestAmazonMethods);
    try {
      Amazon a1 = new Amazon(new Integer(2), new Integer(3), new quotes.White());
      Amazon a2 = new Amazon(new Integer(5), new Integer(8), new quotes.Black());
      AssertTrue(Boolean.valueOf(a1.GetX().intValue() == 2));
      AssertTrue(Boolean.valueOf(a1.GetY().intValue() == 3));
      a1.SetX(new Integer(5));
      AssertTrue(Boolean.valueOf(a1.GetX().intValue() == 5));
      a1.SetY(new Integer(9));
      AssertTrue(Boolean.valueOf(a1.GetY().intValue() == 9));
      AssertTrue(Boolean.valueOf(a2.GetX().intValue() == 5));
      AssertTrue(Boolean.valueOf(a2.GetY().intValue() == 8));
      a2.SetX(new Integer(4));
      AssertTrue(Boolean.valueOf(a2.GetX().intValue() == 4));
      a2.SetY(new Integer(9));
      AssertTrue(Boolean.valueOf(a2.GetY().intValue() == 9));
      AssertTrue(Boolean.valueOf(UTIL.equals(a1.GetColor(), new quotes.White())));
      AssertTrue(Boolean.valueOf(UTIL.equals(a2.GetColor(), new quotes.Black())));
    }
    finally {
      sentinel.leaving(((TestAmazonSentinel)sentinel).TestAmazonMethods);
    }
  }
// ***** VDMTOOLS END Name=TestAmazonMethods

}
;
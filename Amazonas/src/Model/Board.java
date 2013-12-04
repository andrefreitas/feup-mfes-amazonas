package model;

//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2013-12-04 by the VDM++ to JAVA Code Generator
// (v9.0.2 - Thu 14-Mar-2013 12:36:47 +0900)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "C:\\Users\\Ana Gomes\\Documents\\git\\mfes-amazonas\\ficheiros em rtf\\Board.rtf".

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.Record;
import jp.vdmtools.VDM.Sentinel;
import jp.vdmtools.VDM.EvaluatePP;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class Board implements EvaluatePP {

// ***** VDMTOOLS START Name=positions KEEP=NO
  private volatile Map positions = new HashMap();
// ***** VDMTOOLS END Name=positions

// ***** VDMTOOLS START Name=arrows KEEP=NO
  private volatile List arrows = null;
// ***** VDMTOOLS END Name=arrows

// ***** VDMTOOLS START Name=turn KEEP=NO
  private volatile Object turn = null;
// ***** VDMTOOLS END Name=turn

// ***** VDMTOOLS START Name=setarrow KEEP=NO
  private volatile Boolean setarrow = null;
// ***** VDMTOOLS END Name=setarrow

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=BoardSentinel KEEP=NO
  class BoardSentinel extends Sentinel {

    public final int move = 0;

    public final int Board = 1;

    public final int canMove = 2;

    public final int getTurn = 3;

    public final int gameOver = 4;

    public final int setArrow = 5;

    public final int pathIsFree = 6;

    public final int switchTurn = 7;

    public final int countAmazons = 8;

    public final int getPositions = 9;

    public final int setPositions = 10;

    public final int countBlackAmazons = 11;

    public final int countWhiteAmazons = 12;

    public final int nr_functions = 13;


    public BoardSentinel () throws CGException {}


    public BoardSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=BoardSentinel
;

// ***** VDMTOOLS START Name=evaluatePP#1|int KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException {
    return Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=evaluatePP#1|int


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new BoardSentinel(this);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=vdm_init_Board KEEP=NO
  private void vdm_init_Board () {
    try {
      setSentinel();
      arrows = new ArrayList();
      turn = new quotes.White();
      setarrow = Boolean.FALSE;
    }
    catch (Exception e) {
      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_Board


// ***** VDMTOOLS START Name=inv_Board KEEP=NO
  public Boolean inv_Board () {
    Set res_s_5 = new HashSet();
    {
      Set e1_set_9 = new HashSet(positions.values());
      Piece a = null;
      Set tmpSet_15 = new HashSet(e1_set_9);
      for (Iterator enm_14 = tmpSet_15.iterator(); enm_14.hasNext(); ) {
        Piece elem_13 = (Piece)enm_14.next();
        /* a */
        a = elem_13;
        if (a instanceof Amazon) {
          res_s_5.add(a);
        }
      }
    }
    return Boolean.valueOf(res_s_5.size() <= 8);
  }
// ***** VDMTOOLS END Name=inv_Board


// ***** VDMTOOLS START Name=Board KEEP=NO
  public Board () throws CGException {
    try {
      vdm_init_Board();
      {
        Amazon w1 = new Amazon(new Integer(0), new Integer(3), new quotes.White());
        Amazon w2 = new Amazon(new Integer(3), new Integer(0), new quotes.White());
        Amazon w3 = new Amazon(new Integer(9), new Integer(3), new quotes.White());
        Amazon w4 = new Amazon(new Integer(6), new Integer(0), new quotes.White());
        Amazon b1 = new Amazon(new Integer(0), new Integer(6), new quotes.Black());
        Amazon b2 = new Amazon(new Integer(3), new Integer(9), new quotes.Black());
        Amazon b3 = new Amazon(new Integer(6), new Integer(9), new quotes.Black());
        Amazon b4 = new Amazon(new Integer(9), new Integer(6), new quotes.Black());
        Map rhs_25 = new HashMap();
        rhs_25.put(new Piece.Position(new Integer(0), new Integer(3)), w1);
        rhs_25.put(new Piece.Position(new Integer(0), new Integer(3)), w1);
        rhs_25.put(new Piece.Position(new Integer(3), new Integer(0)), w2);
        rhs_25.put(new Piece.Position(new Integer(9), new Integer(3)), w3);
        rhs_25.put(new Piece.Position(new Integer(6), new Integer(0)), w4);
        rhs_25.put(new Piece.Position(new Integer(0), new Integer(6)), b1);
        rhs_25.put(new Piece.Position(new Integer(3), new Integer(9)), b2);
        rhs_25.put(new Piece.Position(new Integer(6), new Integer(9)), b3);
        rhs_25.put(new Piece.Position(new Integer(9), new Integer(6)), b4);
        positions = (Map)UTIL.clone(rhs_25);
      }
      setSentinel();
    }
    catch (Throwable e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=Board


// ***** VDMTOOLS START Name=getTurn KEEP=NO
  public Object getTurn () throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).getTurn);
    try {
      return turn;
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).getTurn);
    }
  }
// ***** VDMTOOLS END Name=getTurn


// ***** VDMTOOLS START Name=getPositions KEEP=NO
  public Map getPositions () throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).getPositions);
    try {
      return positions;
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).getPositions);
    }
  }
// ***** VDMTOOLS END Name=getPositions


// ***** VDMTOOLS START Name=setPositions#1|Map KEEP=NO
  public void setPositions (final Map new_positions) throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).setPositions);
    try {
      positions = (Map)UTIL.clone(new_positions);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).setPositions);
    }
  }
// ***** VDMTOOLS END Name=setPositions#1|Map


// ***** VDMTOOLS START Name=switchTurn KEEP=NO
  public Object switchTurn () throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).switchTurn);
    try {
      if (UTIL.equals(turn, new quotes.White())) {
        turn = new quotes.Black();
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
      }
      else {
        turn = new quotes.White();
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
      }
      return turn;
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).switchTurn);
    }
  }
// ***** VDMTOOLS END Name=switchTurn


// ***** VDMTOOLS START Name=gameOver KEEP=NO
  public Boolean gameOver () throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).gameOver);
    try {
      Set amazons = new HashSet();
      Set white_amazons = new HashSet();
      Set black_amazons = new HashSet();
      Set res_s_2 = new HashSet();
      {
        Set e1_set_6 = new HashSet(positions.values());
        Piece a = null;
        Set tmpSet_12 = new HashSet(e1_set_6);
        for (Iterator enm_11 = tmpSet_12.iterator(); enm_11.hasNext(); ) {
          Piece elem_10 = (Piece)enm_11.next();
          /* a */
          a = elem_10;
          if (a instanceof Amazon) {
            res_s_2.add(a);
          }
        }
      }
      Set rhs_13 = res_s_2;
      if (!(((Object)rhs_13) instanceof Set)) 
        UTIL.RunTime("Incompatible type");
      amazons = (Set)UTIL.clone(rhs_13);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
      Set res_s_15 = new HashSet();
      {
        Amazon a = null;
        Set tmpSet_24 = new HashSet(amazons);
        for (Iterator enm_23 = tmpSet_24.iterator(); enm_23.hasNext(); ) {
          Amazon elem_22 = (Amazon)enm_23.next();
          /* a */
          a = elem_22;
          if (UTIL.equals(a.GetColor(), new quotes.White())) {
            res_s_15.add(a);
          }
        }
      }
      white_amazons = (Set)UTIL.clone(res_s_15);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
      Set res_s_26 = new HashSet();
      {
        Amazon a = null;
        Set tmpSet_35 = new HashSet(amazons);
        for (Iterator enm_34 = tmpSet_35.iterator(); enm_34.hasNext(); ) {
          Amazon elem_33 = (Amazon)enm_34.next();
          /* a */
          a = elem_33;
          if (UTIL.equals(a.GetColor(), new quotes.Black())) {
            res_s_26.add(a);
          }
        }
      }
      black_amazons = (Set)UTIL.clone(res_s_26);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
      Boolean cond_36 = null;
      if (!(cond_36 = Boolean.valueOf(UTIL.equals(canMove(white_amazons), Boolean.FALSE))).booleanValue()) 
        cond_36 = Boolean.valueOf(UTIL.equals(canMove(black_amazons), Boolean.FALSE));
      if (cond_36.booleanValue()) 
        return Boolean.TRUE;
      else 
        return Boolean.FALSE;
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).gameOver);
    }
  }
// ***** VDMTOOLS END Name=gameOver


// ***** VDMTOOLS START Name=canMove#1|Set KEEP=NO
  public Boolean canMove (final Set amazons) throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).canMove);
    try {
      Set canMovePieces = new HashSet();
      Set res_s_2 = new HashSet();
      {
        Amazon a = null;
        Set tmpSet_159 = new HashSet(amazons);
        for (Iterator enm_158 = tmpSet_159.iterator(); enm_158.hasNext(); ) {
          Amazon elem_157 = (Amazon)enm_158.next();
          /* a */
          a = elem_157;
          Boolean pred_5 = null;
          Boolean var1_6 = null;
          Boolean var1_7 = null;
          Boolean var1_8 = null;
          Boolean var1_9 = null;
          Boolean var1_10 = null;
          Boolean var1_11 = null;
          Boolean var1_12 = null;
          if ((var1_12 = Boolean.valueOf((a.GetX().intValue() + 1) < 10)).booleanValue()) 
            var1_12 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(new Integer(a.GetX().intValue() + 1), a.GetY())));
          if (!(var1_11 = var1_12).booleanValue()) {
            Boolean var2_26 = null;
            if ((var2_26 = Boolean.valueOf((a.GetY().intValue() + 1) < 10)).booleanValue()) 
              var2_26 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(a.GetX(), new Integer(a.GetY().intValue() + 1))));
            var1_11 = var2_26;
          }
          if (!(var1_10 = var1_11).booleanValue()) {
            Boolean var2_40 = null;
            Boolean var1_41 = null;
            if ((var1_41 = Boolean.valueOf((a.GetX().intValue() + 1) < 10)).booleanValue()) 
              var1_41 = Boolean.valueOf((a.GetY().intValue() + 1) < 10);
            if ((var2_40 = var1_41).booleanValue()) 
              var2_40 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(new Integer(a.GetX().intValue() + 1), new Integer(a.GetY().intValue() + 1))));
            var1_10 = var2_40;
          }
          if (!(var1_9 = var1_10).booleanValue()) {
            Boolean var2_62 = null;
            if ((var2_62 = Boolean.valueOf((a.GetX().intValue() - 1) > 0)).booleanValue()) 
              var2_62 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(new Integer(a.GetX().intValue() - 1), a.GetY())));
            var1_9 = var2_62;
          }
          if (!(var1_8 = var1_9).booleanValue()) {
            Boolean var2_76 = null;
            if ((var2_76 = Boolean.valueOf((a.GetY().intValue() - 1) > 0)).booleanValue()) 
              var2_76 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(a.GetX(), new Integer(a.GetY().intValue() - 1))));
            var1_8 = var2_76;
          }
          if (!(var1_7 = var1_8).booleanValue()) {
            Boolean var2_90 = null;
            Boolean var1_91 = null;
            if ((var1_91 = Boolean.valueOf((a.GetX().intValue() - 1) > 0)).booleanValue()) 
              var1_91 = Boolean.valueOf((a.GetY().intValue() - 1) > 0);
            if ((var2_90 = var1_91).booleanValue()) 
              var2_90 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(new Integer(a.GetX().intValue() - 1), new Integer(a.GetY().intValue() - 1))));
            var1_7 = var2_90;
          }
          if (!(var1_6 = var1_7).booleanValue()) {
            Boolean var2_112 = null;
            Boolean var1_113 = null;
            if ((var1_113 = Boolean.valueOf((a.GetX().intValue() - 1) > 0)).booleanValue()) 
              var1_113 = Boolean.valueOf((a.GetY().intValue() + 1) < 10);
            if ((var2_112 = var1_113).booleanValue()) 
              var2_112 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(new Integer(a.GetX().intValue() - 1), new Integer(a.GetY().intValue() + 1))));
            var1_6 = var2_112;
          }
          if (!(pred_5 = var1_6).booleanValue()) {
            Boolean var2_134 = null;
            Boolean var1_135 = null;
            if ((var1_135 = Boolean.valueOf((a.GetX().intValue() + 1) < 10)).booleanValue()) 
              var1_135 = Boolean.valueOf((a.GetY().intValue() - 1) > 0);
            if ((var2_134 = var1_135).booleanValue()) 
              var2_134 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(new Integer(a.GetX().intValue() + 1), new Integer(a.GetY().intValue() - 1))));
            pred_5 = var2_134;
          }
          if (pred_5.booleanValue()) {
            res_s_2.add(a);
          }
        }
      }
      canMovePieces = res_s_2;
      if (canMovePieces.size() > 0) 
        return Boolean.TRUE;
      else 
        return Boolean.FALSE;
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).canMove);
    }
  }
// ***** VDMTOOLS END Name=canMove#1|Set


// ***** VDMTOOLS START Name=setArrow#4|Number|Number|Number|Number KEEP=NO
  public Boolean setArrow (final Number amazon_x, final Number amazon_y, final Number x, final Number y) throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).setArrow);
    try {
      if (!this.pre_setArrow(amazon_x, amazon_y, x, y).booleanValue()) 
        UTIL.RunTime("Precondition failure in setArrow");
      {
        Amazon amazon = (Amazon)(Object)positions.get(new Piece.Position(amazon_x, amazon_y));
        Arrow arrow = new Arrow(x, y);
        if (!UTIL.equals(amazon.GetColor(), turn)) 
          return Boolean.FALSE;
        positions.put(new Piece.Position(x, y), arrow);
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
        setarrow = Boolean.FALSE;
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
        turn = UTIL.clone(switchTurn());
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
        return Boolean.TRUE;
      }
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).setArrow);
    }
  }
// ***** VDMTOOLS END Name=setArrow#4|Number|Number|Number|Number


// ***** VDMTOOLS START Name=pre_setArrow#4|Number|Number|Number|Number KEEP=NO
  public Boolean pre_setArrow (final Number amazon_x, final Number amazon_y, final Number x, final Number y) throws CGException {
    Boolean varRes_5 = null;
    Boolean var1_6 = null;
    Boolean var1_7 = null;
    if ((var1_7 = Boolean.valueOf(positions.containsKey(new Piece.Position(amazon_x, amazon_y)))).booleanValue()) 
      var1_7 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(x, y)));
    if ((var1_6 = var1_7).booleanValue()) 
      var1_6 = moveIsValid(new Integer(Math.abs((amazon_x.intValue() - x.intValue()))), new Integer(Math.abs((amazon_y.intValue() - y.intValue()))));
    if ((varRes_5 = var1_6).booleanValue()) 
      varRes_5 = pathIsFree(amazon_x, amazon_y, x, y);
    return varRes_5;
  }
// ***** VDMTOOLS END Name=pre_setArrow#4|Number|Number|Number|Number


// ***** VDMTOOLS START Name=move#4|Number|Number|Number|Number KEEP=NO
  public Boolean move (final Number x, final Number y, final Number new_x, final Number new_y) throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).move);
    try {
      if (!this.pre_move(x, y, new_x, new_y).booleanValue()) 
        UTIL.RunTime("Precondition failure in move");
      {
        Amazon amazon = (Amazon)(Object)positions.get(new Piece.Position(x, y));
        if (!UTIL.equals(amazon.GetColor(), turn)) 
          return Boolean.FALSE;
        amazon.SetX(new_x);
        amazon.SetY(new_y);
        Map rhs_17 = new HashMap();
        Set var1_18 = new HashSet();
        var1_18.add(new Piece.Position(x, y));
        {
          Map tmpMap_23 = new HashMap();
          Set domM_24 = new HashSet(positions.keySet());
          Set tmpSet_27 = new HashSet(domM_24);
          for (Iterator enm_26 = tmpSet_27.iterator(); enm_26.hasNext(); ) {
            Object elm_25 = (Object)enm_26.next();
            if (!UTIL.Contains(var1_18, elm_25)) 
              tmpMap_23.put(elm_25, positions.get(elm_25));
          }
          rhs_17 = tmpMap_23;
        }
        positions = (Map)UTIL.clone(rhs_17);
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
        positions.put(new Piece.Position(new_x, new_y), amazon);
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
        setarrow = Boolean.TRUE;
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
        return Boolean.TRUE;
      }
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).move);
    }
  }
// ***** VDMTOOLS END Name=move#4|Number|Number|Number|Number


// ***** VDMTOOLS START Name=pre_move#4|Number|Number|Number|Number KEEP=NO
  public Boolean pre_move (final Number x, final Number y, final Number new_x, final Number new_y) throws CGException {
    Boolean varRes_5 = null;
    Boolean var1_6 = null;
    Boolean var1_7 = null;
    Boolean var1_8 = null;
    Boolean var1_9 = null;
    Boolean var1_10 = null;
    Boolean var1_11 = null;
    if ((var1_11 = Boolean.valueOf(positions.containsKey(new Piece.Position(x, y)))).booleanValue()) 
      var1_11 = Boolean.valueOf(!UTIL.Contains(new HashSet(positions.keySet()), new Piece.Position(new_x, new_y)));
    if ((var1_10 = var1_11).booleanValue()) 
      var1_10 = Boolean.valueOf((Piece)positions.get(new Piece.Position(x, y)) instanceof Amazon);
    if ((var1_9 = var1_10).booleanValue()) 
      var1_9 = moveIsValid(new Integer(Math.abs((x.intValue() - new_x.intValue()))), new Integer(Math.abs((y.intValue() - new_y.intValue()))));
    if ((var1_8 = var1_9).booleanValue()) 
      var1_8 = pathIsFree(x, y, new_x, new_y);
    if ((var1_7 = var1_8).booleanValue()) 
      var1_7 = Boolean.valueOf(countBlackAmazons().intValue() == 4);
    if ((var1_6 = var1_7).booleanValue()) 
      var1_6 = Boolean.valueOf(countWhiteAmazons().intValue() == 4);
    if ((varRes_5 = var1_6).booleanValue()) 
      varRes_5 = Boolean.valueOf(countAmazons().intValue() == 8);
    return varRes_5;
  }
// ***** VDMTOOLS END Name=pre_move#4|Number|Number|Number|Number


// ***** VDMTOOLS START Name=countAmazons KEEP=NO
  public Number countAmazons () throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).countAmazons);
    try {
      Set amazons = new HashSet();
      Set res_s_2 = new HashSet();
      {
        Set e1_set_6 = new HashSet(positions.values());
        Piece a = null;
        Set tmpSet_12 = new HashSet(e1_set_6);
        for (Iterator enm_11 = tmpSet_12.iterator(); enm_11.hasNext(); ) {
          Piece elem_10 = (Piece)enm_11.next();
          /* a */
          a = elem_10;
          if (a instanceof Amazon) {
            res_s_2.add(a);
          }
        }
      }
      Set rhs_13 = res_s_2;
      if (!(((Object)rhs_13) instanceof Set)) 
        UTIL.RunTime("Incompatible type");
      amazons = (Set)UTIL.clone(rhs_13);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
      return new Integer(amazons.size());
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).countAmazons);
    }
  }
// ***** VDMTOOLS END Name=countAmazons


// ***** VDMTOOLS START Name=countBlackAmazons KEEP=NO
  public Number countBlackAmazons () throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).countBlackAmazons);
    try {
      Set amazons = new HashSet();
      Set black_amazons = new HashSet();
      Set res_s_2 = new HashSet();
      {
        Set e1_set_6 = new HashSet(positions.values());
        Piece a = null;
        Set tmpSet_12 = new HashSet(e1_set_6);
        for (Iterator enm_11 = tmpSet_12.iterator(); enm_11.hasNext(); ) {
          Piece elem_10 = (Piece)enm_11.next();
          /* a */
          a = elem_10;
          if (a instanceof Amazon) {
            res_s_2.add(a);
          }
        }
      }
      Set rhs_13 = res_s_2;
      if (!(((Object)rhs_13) instanceof Set)) 
        UTIL.RunTime("Incompatible type");
      amazons = (Set)UTIL.clone(rhs_13);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
      Set res_s_15 = new HashSet();
      {
        Amazon a = null;
        Set tmpSet_24 = new HashSet(amazons);
        for (Iterator enm_23 = tmpSet_24.iterator(); enm_23.hasNext(); ) {
          Amazon elem_22 = (Amazon)enm_23.next();
          /* a */
          a = elem_22;
          if (UTIL.equals(a.GetColor(), new quotes.Black())) {
            res_s_15.add(a);
          }
        }
      }
      black_amazons = (Set)UTIL.clone(res_s_15);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
      return new Integer(black_amazons.size());
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).countBlackAmazons);
    }
  }
// ***** VDMTOOLS END Name=countBlackAmazons


// ***** VDMTOOLS START Name=countWhiteAmazons KEEP=NO
  public Number countWhiteAmazons () throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).countWhiteAmazons);
    try {
      Set amazons = new HashSet();
      Set white_amazons = new HashSet();
      Set res_s_2 = new HashSet();
      {
        Set e1_set_6 = new HashSet(positions.values());
        Piece a = null;
        Set tmpSet_12 = new HashSet(e1_set_6);
        for (Iterator enm_11 = tmpSet_12.iterator(); enm_11.hasNext(); ) {
          Piece elem_10 = (Piece)enm_11.next();
          /* a */
          a = elem_10;
          if (a instanceof Amazon) {
            res_s_2.add(a);
          }
        }
      }
      Set rhs_13 = res_s_2;
      if (!(((Object)rhs_13) instanceof Set)) 
        UTIL.RunTime("Incompatible type");
      amazons = (Set)UTIL.clone(rhs_13);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
      Set res_s_15 = new HashSet();
      {
        Amazon a = null;
        Set tmpSet_24 = new HashSet(amazons);
        for (Iterator enm_23 = tmpSet_24.iterator(); enm_23.hasNext(); ) {
          Amazon elem_22 = (Amazon)enm_23.next();
          /* a */
          a = elem_22;
          if (UTIL.equals(a.GetColor(), new quotes.White())) {
            res_s_15.add(a);
          }
        }
      }
      white_amazons = (Set)UTIL.clone(res_s_15);
      if (!this.inv_Board().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Board");
      return new Integer(white_amazons.size());
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).countWhiteAmazons);
    }
  }
// ***** VDMTOOLS END Name=countWhiteAmazons


// ***** VDMTOOLS START Name=pathIsFree#4|Number|Number|Number|Number KEEP=NO
  public Boolean pathIsFree (final Number x, final Number y, final Number new_x, final Number new_y) throws CGException {
    sentinel.entering(((BoardSentinel)sentinel).pathIsFree);
    try {
      Number deltaX = new Integer(Math.abs((new_x.intValue() - x.intValue())));
      Number deltaY = new Integer(Math.abs((new_y.intValue() - y.intValue())));
      Set pathPieces = new HashSet();
      Boolean cond_11 = null;
      if ((cond_11 = Boolean.valueOf(deltaX.intValue() == 0)).booleanValue()) 
        cond_11 = Boolean.valueOf(deltaY.intValue() > 0);
      if (cond_11.booleanValue()) {
        Set res_s_111 = new HashSet();
        {
          Set e1_set_115 = new HashSet(positions.keySet());
          Piece.Position a = null;
          Set tmpSet_137 = new HashSet(e1_set_115);
          for (Iterator enm_136 = tmpSet_137.iterator(); enm_136.hasNext(); ) {
            Piece.Position elem_135 = (Piece.Position)enm_136.next();
            /* a */
            a = elem_135;
            Boolean pred_116 = null;
            Set var2_120 = new HashSet();
            Set var1_121 = new HashSet();
            var1_121 = new HashSet();
            int lbi_125 = y.intValue();
            int ubi_126 = new_y.intValue();
            for (int count_124 = lbi_125; count_124 <= ubi_126; count_124++) 
              var1_121.add(new Integer(count_124));
            Set var2_127 = new HashSet();
            var2_127.add(y);
            var2_127.add(new_y);
            var2_120 = new HashSet(var1_121);
            var2_120.removeAll(var2_127);
            if ((pred_116 = Boolean.valueOf(UTIL.Contains(var2_120, (a.y)))).booleanValue()) 
              pred_116 = Boolean.valueOf((a.x).intValue() == x.intValue());
            if (pred_116.booleanValue()) {
              res_s_111.add(a);
            }
          }
        }
        pathPieces = (Set)UTIL.clone(res_s_111);
        if (!this.inv_Board().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Board");
      }
      else {
        Boolean cond_18 = null;
        if ((cond_18 = Boolean.valueOf(deltaY.intValue() == 0)).booleanValue()) 
          cond_18 = Boolean.valueOf(deltaX.intValue() > 0);
        if (cond_18.booleanValue()) {
          Set res_s_83 = new HashSet();
          {
            Set e1_set_87 = new HashSet(positions.keySet());
            Piece.Position a = null;
            Set tmpSet_109 = new HashSet(e1_set_87);
            for (Iterator enm_108 = tmpSet_109.iterator(); enm_108.hasNext(); ) {
              Piece.Position elem_107 = (Piece.Position)enm_108.next();
              /* a */
              a = elem_107;
              Boolean pred_88 = null;
              Set var2_92 = new HashSet();
              Set var1_93 = new HashSet();
              var1_93 = new HashSet();
              int lbi_97 = x.intValue();
              int ubi_98 = new_x.intValue();
              for (int count_96 = lbi_97; count_96 <= ubi_98; count_96++) 
                var1_93.add(new Integer(count_96));
              Set var2_99 = new HashSet();
              var2_99.add(x);
              var2_99.add(new_x);
              var2_92 = new HashSet(var1_93);
              var2_92.removeAll(var2_99);
              if ((pred_88 = Boolean.valueOf(UTIL.Contains(var2_92, (a.x)))).booleanValue()) 
                pred_88 = Boolean.valueOf((a.y).intValue() == y.intValue());
              if (pred_88.booleanValue()) {
                res_s_83.add(a);
              }
            }
          }
          pathPieces = (Set)UTIL.clone(res_s_83);
          if (!this.inv_Board().booleanValue()) 
            UTIL.RunTime("Instance invariant failure in Board");
        }
        else {
          Boolean cond_25 = null;
          if ((cond_25 = Boolean.valueOf(deltaX.intValue() == deltaY.intValue())).booleanValue()) 
            cond_25 = Boolean.valueOf(deltaX.intValue() > 0);
          if (cond_25.booleanValue()) {
            Set res_s_34 = new HashSet();
            {
              Set e1_set_38 = new HashSet(positions.keySet());
              Piece.Position a = null;
              Set tmpSet_81 = new HashSet(e1_set_38);
              for (Iterator enm_80 = tmpSet_81.iterator(); enm_80.hasNext(); ) {
                Piece.Position elem_79 = (Piece.Position)enm_80.next();
                /* a */
                a = elem_79;
                Boolean pred_39 = null;
                Boolean var1_40 = null;
                Set var2_44 = new HashSet();
                Set var1_45 = new HashSet();
                var1_45 = new HashSet();
                int lbi_49 = x.intValue();
                int ubi_50 = new_x.intValue();
                for (int count_48 = lbi_49; count_48 <= ubi_50; count_48++) 
                  var1_45.add(new Integer(count_48));
                Set var2_51 = new HashSet();
                var2_51.add(x);
                var2_51.add(new_x);
                var2_44 = new HashSet(var1_45);
                var2_44.removeAll(var2_51);
                if ((var1_40 = Boolean.valueOf(UTIL.Contains(var2_44, (a.x)))).booleanValue()) {
                  Set var2_57 = new HashSet();
                  Set var1_58 = new HashSet();
                  var1_58 = new HashSet();
                  int lbi_62 = y.intValue();
                  int ubi_63 = new_y.intValue();
                  for (int count_61 = lbi_62; count_61 <= ubi_63; count_61++) 
                    var1_58.add(new Integer(count_61));
                  Set var2_64 = new HashSet();
                  var2_64.add(y);
                  var2_64.add(new_y);
                  var2_57 = new HashSet(var1_58);
                  var2_57.removeAll(var2_64);
                  var1_40 = Boolean.valueOf(UTIL.Contains(var2_57, (a.y)));
                }
                if ((pred_39 = var1_40).booleanValue()) 
                  pred_39 = Boolean.valueOf(Math.abs(((a.x).intValue() - x.intValue())) == Math.abs(((a.y).intValue() - y.intValue())));
                if (pred_39.booleanValue()) {
                  res_s_34.add(a);
                }
              }
            }
            pathPieces = (Set)UTIL.clone(res_s_34);
            if (!this.inv_Board().booleanValue()) 
              UTIL.RunTime("Instance invariant failure in Board");
          }
          else 
            return Boolean.FALSE;
        }
      }
      return Boolean.valueOf(pathPieces.size() == 0);
    }
    finally {
      sentinel.leaving(((BoardSentinel)sentinel).pathIsFree);
    }
  }
// ***** VDMTOOLS END Name=pathIsFree#4|Number|Number|Number|Number


// ***** VDMTOOLS START Name=moveIsValid#2|Number|Number KEEP=NO
  public Boolean moveIsValid (final Number deltaX, final Number deltaY) throws CGException {
    Boolean varRes_3 = null;
    Boolean var1_4 = null;
    Boolean var1_5 = null;
    if ((var1_5 = Boolean.valueOf(deltaX.intValue() == 0)).booleanValue()) 
      var1_5 = Boolean.valueOf(deltaY.intValue() > 0);
    if (!(var1_4 = var1_5).booleanValue()) {
      Boolean var2_12 = null;
      if ((var2_12 = Boolean.valueOf(deltaX.intValue() > 0)).booleanValue()) 
        var2_12 = Boolean.valueOf(deltaY.intValue() == 0);
      var1_4 = var2_12;
    }
    if (!(varRes_3 = var1_4).booleanValue()) {
      Boolean var2_19 = null;
      if ((var2_19 = Boolean.valueOf(deltaX.intValue() == deltaY.intValue())).booleanValue()) 
        var2_19 = Boolean.valueOf(deltaX.intValue() > 0);
      varRes_3 = var2_19;
    }
    return varRes_3;
  }
// ***** VDMTOOLS END Name=moveIsValid#2|Number|Number

}
;

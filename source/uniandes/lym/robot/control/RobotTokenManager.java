/* RobotTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

/** Token Manager. */
@SuppressWarnings ("unused")
public class RobotTokenManager implements RobotConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fc3fff0bfffc0L) != 0L)
         {
            jjmatchedKind = 58;
            return 2;
         }
         if ((active0 & 0x3c0001400000L) != 0L)
         {
            jjmatchedKind = 58;
            return 5;
         }
         return -1;
      case 1:
         if ((active0 & 0x10010400L) != 0L)
            return 2;
         if ((active0 & 0x1400000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 1;
            return 4;
         }
         if ((active0 & 0x3fffffe0befbc0L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 1;
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0x30000000a80L) != 0L)
            return 2;
         if ((active0 & 0x1400000L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 2;
            return 6;
         }
         if ((active0 & 0x3ffcffe0bef140L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 2;
            return 2;
         }
         return -1;
      case 3:
         if ((active0 & 0x320000203a9100L) != 0L)
            return 2;
         if ((active0 & 0x1400000L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 3;
            return 2;
         }
         if ((active0 & 0x7000800000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0xdfc8fc0046040L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0xc000280004040L) != 0L)
            return 2;
         if ((active0 & 0x7000800000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x1fc8d40042000L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 4;
            }
            return 2;
         }
         if ((active0 & 0x1400000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x10c0040042000L) != 0L)
            return 2;
         if ((active0 & 0x7000800000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0xf08d00000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 5;
            return 2;
         }
         if ((active0 & 0x1400000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0xe00900000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 6;
            return 2;
         }
         if ((active0 & 0x100000000000L) != 0L)
            return 2;
         if ((active0 & 0x7000800000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x1400000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x100000000L) != 0L)
            return 2;
         if ((active0 & 0x7000800000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0xe00000000000L) != 0L)
         {
            if (jjmatchedPos != 7)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 7;
            }
            return 2;
         }
         if ((active0 & 0x1400000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x600000000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 8;
            return 2;
         }
         if ((active0 & 0x800000000000L) != 0L)
            return 2;
         if ((active0 & 0x6000000000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 58;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x1000000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 9;
            return 2;
         }
         if ((active0 & 0x200000000000L) != 0L)
            return 2;
         return -1;
      case 10:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 58;
            jjmatchedPos = 10;
            return 2;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 25);
      case 41:
         return jjStopAtPos(0, 26);
      case 44:
         return jjStopAtPos(0, 59);
      case 58:
         return jjStopAtPos(0, 27);
      case 59:
         return jjStopAtPos(0, 60);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x400900008000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x807200000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x20080060000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10000000000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x400204000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8010000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x20001000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x3c0001400000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x6010000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x380L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x40800040L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x9000000080000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20000000000000L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x10407500208000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000c0041000L);
      case 70:
      case 102:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(1, 28, 2);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x800200000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000140L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 79:
      case 111:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0xc010021420a00L);
      case 80:
      case 112:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x6000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000900080L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x3c0000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x100400208100L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x80041000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x800200080000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2400100000000L);
      case 77:
      case 109:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 41, 2);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x7000800000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x820006000L);
      case 80:
      case 112:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 2);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000100000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x30000000000000L);
      case 84:
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 2);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 2);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x1400000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 90:
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa4_0(active0, 0x7000800000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000800000000L);
      case 69:
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x8041400000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000040L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 75:
      case 107:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 2);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 2);
         break;
      case 76:
      case 108:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 49, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x400100000000L);
      case 78:
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 2);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 80:
      case 112:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 2);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x8c0200000000L);
      case 84:
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 2);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 52, 2);
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 53, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0xc000000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x80002000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa5_0(active0, 0x1400000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x40040000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000L);
      case 72:
      case 104:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 50, 2);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 51, 2);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      case 78:
      case 110:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x400002000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x4c0100000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x3000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 83:
      case 115:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000L);
      case 84:
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 6, 2);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 2);
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000800000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x40c100000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000000L);
      case 82:
      case 114:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 2);
         break;
      case 83:
      case 115:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 42, 2);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 43, 2);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 48, 2);
         break;
      case 84:
      case 116:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 2);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(6, 34);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(6, 39);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x400100000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 83:
      case 115:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 44, 2);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(7, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(7, 36);
         break;
      case 67:
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000000L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000000L);
      case 82:
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(7, 22);
         return jjMoveStringLiteralDfa8_0(active0, 0x800000000000L);
      case 83:
      case 115:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(7, 23);
         else if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 7;
         }
         return jjMoveStringLiteralDfa8_0(active0, 0x400000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 63:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(8, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(8, 38);
         break;
      case 69:
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(8, 24);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 47, 2);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa9_0(active0, 0x400000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x200000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x400000000000L);
      case 83:
      case 115:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 45, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 82:
      case 114:
         return jjMoveStringLiteralDfa11_0(active0, 0x400000000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(11, 46, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 9;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  { jjCheckNAdd(0); }
                  break;
               case 4:
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(2); }
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(2); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(2); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAdd(2); }
                  }
                  if ((0x200000002000L & l) != 0L)
                     { jjAddStates(0, 1); }
                  break;
               case 4:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAdd(2); }
                  }
                  if ((0x40000000400000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  if ((0x40000000400000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                  }
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAdd(2); }
                  }
                  if ((0x2000000020L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                  }
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAdd(2); }
                  }
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  { jjCheckNAdd(2); }
                  break;
               case 3:
                  if ((0x200000002000L & l) != 0L)
                     { jjAddStates(0, 1); }
                  break;
               case 7:
                  if ((0x40000000400000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 9 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, "\50", 
"\51", "\72", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, "\54", "\73", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   5, 8, 
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public RobotTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public RobotTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 9; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1c7fffffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[9];
    private final int[] jjstateSet = new int[2 * 9];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}

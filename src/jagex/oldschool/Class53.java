package jagex.oldschool;

import jagex.oldschool.asset.AbstractPackage;
import jagex.oldschool.io.SocketStream;
import jagex.oldschool.ui.InterfaceComponent;

public class Class53 {

  public static SocketStream aSocketStream1;
  public static InterfaceComponent[] aWidgetArray1;

  public static void method337(final int int_0, final AbstractPackage indexdatabase_0,
      final String string_0,
      final String string_1, final int int_1, final boolean bool_0) {
    final int int_2 = indexdatabase_0.getFile(string_0);
    final int int_3 = indexdatabase_0.getChild(int_2, string_1);
    Class72.anInt168 = 1;
    Class72.anIndexDataBase4 = indexdatabase_0;
    Enum3.anInt339 = int_2;
    RuntimeException_Sub1.anInt527 = int_3;
    Class72.anInt170 = int_1;
    Class36.aBool8 = bool_0;
    Class72.anInt169 = int_0;
  }

}

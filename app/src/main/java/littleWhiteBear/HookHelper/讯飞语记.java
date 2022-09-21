package littleWhiteBear.HookHelper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.*;

public class 讯飞语记 {
  public static void HookVIP(XC_LoadPackage.LoadPackageParam lpparam) {

    XposedHelpers.findAndHookMethod(
        "pj2",
        lpparam.classLoader,
        "getLevel",
        new XC_MethodHook() {

          protected void afterHookedMethod(MethodHookParam param) throws Throwable {

            param.setResult(2);
          }
        });
  }
}

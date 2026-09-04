package vd;

import android.content.Context;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: XiaomiNotchSizeUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f140880a = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f140881b = 512;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f140882c = 1024;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int[] a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.dw, new Class[]{Context.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        int[] iArr = {0, 0};
        try {
            int identifier = context.getResources().getIdentifier("notch_width", "dimen", "android");
            if (identifier > 0) {
                iArr[0] = context.getResources().getDimensionPixelSize(identifier);
            }
            int identifier2 = context.getResources().getIdentifier("notch_height", "dimen", "android");
            if (identifier2 > 0) {
                iArr[1] = context.getResources().getDimensionPixelSize(identifier2);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    private static String b(String str) throws Throwable {
        BufferedReader bufferedReader;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.gw, new Class[]{String.class}, String.class);
        ?? r10 = patchProxyResultProxy.isSupported;
        if (r10 != 0) {
            return (String) patchProxyResultProxy.result;
        }
        String string = null;
        string = null;
        string = null;
        ?? r11 = 0;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()));
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        }
                        string = sb2.toString();
                        bufferedReader.close();
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return string;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Exception e12) {
                e = e12;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                if (r11 != 0) {
                    try {
                        r11.close();
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
            return string;
        } catch (Throwable th3) {
            th = th3;
            r11 = r10;
        }
    }

    public static boolean c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.cw, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return "1".equals(b("ro.miui.notch"));
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void d(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.ew, new Class[]{Window.class}, Void.TYPE).isSupported || window == null) {
            return;
        }
        try {
            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(window, Integer.valueOf(bb.c.b.zv));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void e(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.fw, new Class[]{Window.class}, Void.TYPE).isSupported || window == null) {
            return;
        }
        try {
            Window.class.getMethod("clearExtraFlags", Integer.TYPE).invoke(window, Integer.valueOf(bb.c.b.zv));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}

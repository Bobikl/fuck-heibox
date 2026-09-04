package pe;

import com.igexin.assist.sdk.AssistPushConsts;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleTransform.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Locale a(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.G, new Class[]{Integer.TYPE}, Locale.class);
        if (patchProxyResultProxy.isSupported) {
            return (Locale) patchProxyResultProxy.result;
        }
        switch (i10) {
            case 1:
                return Locale.TRADITIONAL_CHINESE;
            case 2:
                return Locale.ENGLISH;
            case 3:
                return Locale.KOREA;
            case 4:
                return Locale.GERMANY;
            case 5:
                return Locale.FRANCE;
            case 6:
                return Locale.JAPAN;
            case 7:
                return new Locale("vi");
            case 8:
                return new Locale("es", "ES");
            case 9:
                return new Locale("pt", AssistPushConsts.MSG_VALUE_PAYLOAD);
            case 10:
                return new Locale("ar", "AE");
            default:
                return Locale.CHINESE;
        }
    }
}

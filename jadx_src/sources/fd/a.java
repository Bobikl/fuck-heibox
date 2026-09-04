package fd;

import android.content.Context;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.core.content.res.i;
import bb.c;
import com.max.hbresource.color.ColorThemeType;
import com.max.hbresource.color.ColorUsage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import gd.b;
import java.util.HashMap;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: ColorThemeTransformer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f118835a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final HashMap<ColorThemeType, gd.a> f118836b = new HashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: fd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ColorThemeTransformer.kt */
    public final /* synthetic */ class C1072a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118837a;

        static {
            int[] iArr = new int[ColorThemeType.valuesCustom().length];
            try {
                iArr[ColorThemeType.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f118837a = iArr;
        }
    }

    private a() {
    }

    private final gd.a a(ColorThemeType colorThemeType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{colorThemeType}, this, changeQuickRedirect, false, c.k.f33538f1, new Class[]{ColorThemeType.class}, gd.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (gd.a) patchProxyResultProxy.result;
        }
        HashMap<ColorThemeType, gd.a> map = f118836b;
        gd.a aVar = map.get(colorThemeType);
        if (aVar != null) {
            return aVar;
        }
        gd.a bVar = C1072a.f118837a[colorThemeType.ordinal()] == 1 ? new b() : new gd.c();
        map.put(colorThemeType, bVar);
        return bVar;
    }

    @m
    public static final int b(@d Context context, @d ColorThemeType type, @d ColorUsage usage, @n int i10) {
        Object[] objArr = {context, type, usage, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.f33515e1, new Class[]{Context.class, ColorThemeType.class, ColorUsage.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        f0.p(type, "type");
        f0.p(usage, "usage");
        return f118835a.a(type).a(usage, i.e(context.getResources(), i10, null));
    }

    @m
    public static final int c(@d ColorThemeType type, @l int i10) {
        Object[] objArr = {type, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.f33468c1, new Class[]{ColorThemeType.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(type, "type");
        return f118835a.a(type).a(ColorUsage.Other, i10);
    }

    @m
    public static final int d(@d ColorThemeType type, @d ColorUsage usage, @l int i10) {
        Object[] objArr = {type, usage, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.f33492d1, new Class[]{ColorThemeType.class, ColorUsage.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(type, "type");
        f0.p(usage, "usage");
        return f118835a.a(type).a(usage, i10);
    }

    @m
    public static final int e(@l int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.f33445b1, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : f118835a.a(ColorThemeType.Dark).a(ColorUsage.Other, i10);
    }
}

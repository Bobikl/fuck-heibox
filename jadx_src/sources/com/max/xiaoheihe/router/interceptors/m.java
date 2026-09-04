package com.max.xiaoheihe.router.interceptors;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PathInterceptorUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class m {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static final synchronized Bundle a(com.sankuai.waimai.router.core.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 48139, new Class[]{com.sankuai.waimai.router.core.i.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = (Bundle) iVar.e(Bundle.class, com.sankuai.waimai.router.components.a.f96452b, null);
        if (bundle == null) {
            bundle = new Bundle();
            iVar.s(com.sankuai.waimai.router.components.a.f96452b, bundle);
        }
        return bundle;
    }

    public static final boolean b(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.d String name, boolean z10) {
        Object[] objArr = {iVar, name, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48142, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(iVar, "<this>");
        f0.p(name, "name");
        Bundle bundleE = e(iVar);
        return bundleE != null ? bundleE.getBoolean(name, z10) : z10;
    }

    public static final int c(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.d String name, int i10) {
        Object[] objArr = {iVar, name, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48143, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(iVar, "<this>");
        f0.p(name, "name");
        Bundle bundleE = e(iVar);
        return bundleE != null ? bundleE.getInt(name, i10) : i10;
    }

    public static final long d(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.d String name, long j10) {
        Object[] objArr = {iVar, name, new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48147, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        f0.p(iVar, "<this>");
        f0.p(name, "name");
        Bundle bundleE = e(iVar);
        return bundleE != null ? bundleE.getLong(name, j10) : j10;
    }

    private static final synchronized Bundle e(com.sankuai.waimai.router.core.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, 48140, new Class[]{com.sankuai.waimai.router.core.i.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        return (Bundle) iVar.e(Bundle.class, com.sankuai.waimai.router.components.a.f96452b, null);
    }

    @dl.e
    public static final Serializable f(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.d String name) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, name}, null, changeQuickRedirect, true, 48146, new Class[]{com.sankuai.waimai.router.core.i.class, String.class}, Serializable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Serializable) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        f0.p(name, "name");
        Bundle bundleE = e(iVar);
        if (bundleE != null) {
            return bundleE.getSerializable(name);
        }
        return null;
    }

    @dl.e
    public static final String g(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.d String name) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, name}, null, changeQuickRedirect, true, 48141, new Class[]{com.sankuai.waimai.router.core.i.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        f0.p(name, "name");
        Bundle bundleE = e(iVar);
        if (bundleE != null) {
            return bundleE.getString(name);
        }
        return null;
    }

    @dl.e
    public static final String h(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.d String name, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, name, new Integer(i10)}, null, changeQuickRedirect, true, 48144, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        f0.p(name, "name");
        String strG = g(iVar, name);
        if (strG != null) {
            return strG;
        }
        int iC = c(iVar, name, i10);
        return iC == Integer.MIN_VALUE ? null : String.valueOf(iC);
    }

    public static /* synthetic */ String i(com.sankuai.waimai.router.core.i iVar, String str, int i10, int i11, Object obj) {
        Object[] objArr = {iVar, str, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 48145, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, cls, cls, Object.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MIN_VALUE;
        }
        return h(iVar, str, i10);
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i j(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, bundle}, null, changeQuickRedirect, true, 48160, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, Bundle.class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putBundle(str, bundle);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i k(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e Serializable serializable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, serializable}, null, changeQuickRedirect, true, 48148, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, Serializable.class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putSerializable(str, serializable);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i l(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, str2}, null, changeQuickRedirect, true, 48149, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, String.class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putString(str, str2);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i m(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, bArr}, null, changeQuickRedirect, true, 48151, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, byte[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putByteArray(str, bArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i n(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e char[] cArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, cArr}, null, changeQuickRedirect, true, 48153, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, char[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putCharArray(str, cArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i o(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e double[] dArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, dArr}, null, changeQuickRedirect, true, 48157, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, double[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putDoubleArray(str, dArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i p(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e float[] fArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, fArr}, null, changeQuickRedirect, true, 48156, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, float[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putFloatArray(str, fArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i q(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e int[] iArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, iArr}, null, changeQuickRedirect, true, 48154, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, int[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putIntArray(str, iArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i r(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e long[] jArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, jArr}, null, changeQuickRedirect, true, 48155, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, long[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putLongArray(str, jArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i s(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e CharSequence[] charSequenceArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, charSequenceArr}, null, changeQuickRedirect, true, 48159, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, CharSequence[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putCharSequenceArray(str, charSequenceArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i t(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, strArr}, null, changeQuickRedirect, true, 48158, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, String[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putStringArray(str, strArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i u(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e short[] sArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, sArr}, null, changeQuickRedirect, true, 48152, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, short[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putShortArray(str, sArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i v(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e String str, @dl.e boolean[] zArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, str, zArr}, null, changeQuickRedirect, true, 48150, new Class[]{com.sankuai.waimai.router.core.i.class, String.class, boolean[].class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        a(iVar).putBooleanArray(str, zArr);
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i w(@dl.d com.sankuai.waimai.router.core.i iVar, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, bundle}, null, changeQuickRedirect, true, 48161, new Class[]{com.sankuai.waimai.router.core.i.class, Bundle.class}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        if (bundle != null) {
            a(iVar).putAll(bundle);
        }
        return iVar;
    }

    @dl.d
    public static final com.sankuai.waimai.router.core.i x(@dl.d com.sankuai.waimai.router.core.i iVar, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar, new Integer(i10)}, null, changeQuickRedirect, true, 48162, new Class[]{com.sankuai.waimai.router.core.i.class, Integer.TYPE}, com.sankuai.waimai.router.core.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result;
        }
        f0.p(iVar, "<this>");
        iVar.s(com.sankuai.waimai.router.components.a.f96456f, Integer.valueOf(i10));
        return iVar;
    }
}

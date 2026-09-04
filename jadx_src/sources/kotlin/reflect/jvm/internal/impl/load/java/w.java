package kotlin.reflect.jvm.internal.impl.load.java;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: propertiesConventionUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w {
    @dl.d
    public static final List<kotlin.reflect.jvm.internal.impl.name.f> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        String strB = name.b();
        f0.o(strB, "name.asString()");
        if (s.c(strB)) {
            return CollectionsKt__CollectionsKt.M(b(name));
        }
        return s.d(strB) ? f(name) : c.f126008a.b(name);
    }

    @dl.e
    public static final kotlin.reflect.jvm.internal.impl.name.f b(@dl.d kotlin.reflect.jvm.internal.impl.name.f methodName) {
        f0.p(methodName, "methodName");
        kotlin.reflect.jvm.internal.impl.name.f fVarE = e(methodName, "get", false, null, 12, null);
        return fVarE == null ? e(methodName, ak.f104422ae, false, null, 8, null) : fVarE;
    }

    @dl.e
    public static final kotlin.reflect.jvm.internal.impl.name.f c(@dl.d kotlin.reflect.jvm.internal.impl.name.f methodName, boolean z10) {
        f0.p(methodName, "methodName");
        return e(methodName, "set", false, z10 ? ak.f104422ae : null, 4, null);
    }

    private static final kotlin.reflect.jvm.internal.impl.name.f d(kotlin.reflect.jvm.internal.impl.name.f fVar, String str, boolean z10, String str2) {
        if (fVar.g()) {
            return null;
        }
        String strD = fVar.d();
        f0.o(strD, "methodName.identifier");
        boolean z11 = false;
        if (!kotlin.text.u.v2(strD, str, false, 2, null) || strD.length() == str.length()) {
            return null;
        }
        char cCharAt = strD.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        if (str2 != null) {
            return kotlin.reflect.jvm.internal.impl.name.f.f(str2 + StringsKt__StringsKt.d4(strD, str));
        }
        if (!z10) {
            return fVar;
        }
        String strC = ti.a.c(StringsKt__StringsKt.d4(strD, str), true);
        if (kotlin.reflect.jvm.internal.impl.name.f.h(strC)) {
            return kotlin.reflect.jvm.internal.impl.name.f.f(strC);
        }
        return null;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f e(kotlin.reflect.jvm.internal.impl.name.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    @dl.d
    public static final List<kotlin.reflect.jvm.internal.impl.name.f> f(@dl.d kotlin.reflect.jvm.internal.impl.name.f methodName) {
        f0.p(methodName, "methodName");
        return CollectionsKt__CollectionsKt.N(c(methodName, false), c(methodName, true));
    }
}

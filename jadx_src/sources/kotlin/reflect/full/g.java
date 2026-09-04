package kotlin.reflect.full;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.r;
import kotlin.u0;
import xh.h;

/* JADX INFO: compiled from: KTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "KTypes")
public final class g {
    @u0(version = "1.1")
    public static final boolean a(@dl.d r rVar, @dl.d r other) {
        f0.p(rVar, "<this>");
        f0.p(other, "other");
        return TypeUtilsKt.p(((KTypeImpl) rVar).j(), ((KTypeImpl) other).j());
    }

    @u0(version = "1.1")
    public static final boolean b(@dl.d r rVar, @dl.d r other) {
        f0.p(rVar, "<this>");
        f0.p(other, "other");
        return a(other, rVar);
    }

    @u0(version = "1.1")
    @dl.d
    public static final r c(@dl.d r rVar, boolean z10) {
        f0.p(rVar, "<this>");
        return ((KTypeImpl) rVar).k(z10);
    }
}

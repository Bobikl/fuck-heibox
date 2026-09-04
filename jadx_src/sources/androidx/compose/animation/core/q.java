package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000\u001a&\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000\u001a\u001d\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r*\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r*\u00028\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u000e*\u00020\r*\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", com.alipay.sdk.m.x.c.f39529d, "Landroidx/compose/animation/core/l;", ak.av, "v2", "Landroidx/compose/animation/core/m;", "b", com.huawei.hms.feature.dynamic.b.f60699u, "Landroidx/compose/animation/core/n;", ak.aF, "v4", "Landroidx/compose/animation/core/o;", "d", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.f23244d5, "g", "(Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "e", "source", "Lkotlin/b2;", "f", "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)V", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class q {
    @dl.d
    public static final l a(float f10) {
        return new l(f10);
    }

    @dl.d
    public static final m b(float f10, float f11) {
        return new m(f10, f11);
    }

    @dl.d
    public static final n c(float f10, float f11, float f12) {
        return new n(f10, f11, f12);
    }

    @dl.d
    public static final o d(float f10, float f11, float f12, float f13) {
        return new o(f10, f11, f12, f13);
    }

    @dl.d
    public static final <T extends p> T e(@dl.d T t10) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        T t11 = (T) g(t10);
        int i10 = t11.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            t11.e(i11, t10.a(i11));
        }
        return t11;
    }

    public static final <T extends p> void f(@dl.d T t10, @dl.d T source) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        kotlin.jvm.internal.f0.p(source, "source");
        int i10 = t10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            t10.e(i11, source.a(i11));
        }
    }

    @dl.d
    public static final <T extends p> T g(@dl.d T t10) {
        kotlin.jvm.internal.f0.p(t10, "<this>");
        T t11 = (T) t10.c();
        kotlin.jvm.internal.f0.n(t11, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t11;
    }
}

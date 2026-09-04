package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0005¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/h1;", "", "Landroidx/compose/foundation/shape/e;", "b", "Landroidx/compose/foundation/shape/e;", "()Landroidx/compose/foundation/shape/e;", "ExtraSmall", ak.aF, "e", "Small", "d", "Medium", "Large", "f", ak.av, "ExtraLarge", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h1 f11898a = new h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.shape.e ExtraSmall;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.shape.e Small;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.shape.e Medium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.shape.e Large;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final androidx.compose.foundation.shape.e ExtraLarge;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11904g = 0;

    static {
        t0.r0 r0Var = t0.r0.f140286a;
        ExtraSmall = r0Var.c();
        Small = r0Var.k();
        Medium = r0Var.i();
        Large = r0Var.f();
        ExtraLarge = r0Var.a();
    }

    private h1() {
    }

    @dl.d
    public final androidx.compose.foundation.shape.e a() {
        return ExtraLarge;
    }

    @dl.d
    public final androidx.compose.foundation.shape.e b() {
        return ExtraSmall;
    }

    @dl.d
    public final androidx.compose.foundation.shape.e c() {
        return Large;
    }

    @dl.d
    public final androidx.compose.foundation.shape.e d() {
        return Medium;
    }

    @dl.d
    public final androidx.compose.foundation.shape.e e() {
        return Small;
    }
}

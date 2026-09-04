package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.i1, reason: from toString */
/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/i1;", "", "Landroidx/compose/foundation/shape/e;", "extraSmall", "small", "medium", "large", "extraLarge", ak.av, "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/foundation/shape/e;", "d", "()Landroidx/compose/foundation/shape/e;", "b", "g", ak.aF, "f", "e", "<init>", "(Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;Landroidx/compose/foundation/shape/e;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class Shapes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.foundation.shape.e extraSmall;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.foundation.shape.e small;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.foundation.shape.e medium;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.foundation.shape.e large;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.foundation.shape.e extraLarge;

    public Shapes() {
        this(null, null, null, null, null, 31, null);
    }

    public Shapes(@dl.d androidx.compose.foundation.shape.e extraSmall, @dl.d androidx.compose.foundation.shape.e small, @dl.d androidx.compose.foundation.shape.e medium, @dl.d androidx.compose.foundation.shape.e large, @dl.d androidx.compose.foundation.shape.e extraLarge) {
        kotlin.jvm.internal.f0.p(extraSmall, "extraSmall");
        kotlin.jvm.internal.f0.p(small, "small");
        kotlin.jvm.internal.f0.p(medium, "medium");
        kotlin.jvm.internal.f0.p(large, "large");
        kotlin.jvm.internal.f0.p(extraLarge, "extraLarge");
        this.extraSmall = extraSmall;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.extraLarge = extraLarge;
    }

    public /* synthetic */ Shapes(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? h1.f11898a.b() : eVar, (i10 & 2) != 0 ? h1.f11898a.e() : eVar2, (i10 & 4) != 0 ? h1.f11898a.d() : eVar3, (i10 & 8) != 0 ? h1.f11898a.c() : eVar4, (i10 & 16) != 0 ? h1.f11898a.a() : eVar5);
    }

    public static /* synthetic */ Shapes b(Shapes shapes, androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = shapes.extraSmall;
        }
        if ((i10 & 2) != 0) {
            eVar2 = shapes.small;
        }
        androidx.compose.foundation.shape.e eVar6 = eVar2;
        if ((i10 & 4) != 0) {
            eVar3 = shapes.medium;
        }
        androidx.compose.foundation.shape.e eVar7 = eVar3;
        if ((i10 & 8) != 0) {
            eVar4 = shapes.large;
        }
        androidx.compose.foundation.shape.e eVar8 = eVar4;
        if ((i10 & 16) != 0) {
            eVar5 = shapes.extraLarge;
        }
        return shapes.a(eVar, eVar6, eVar7, eVar8, eVar5);
    }

    @dl.d
    public final Shapes a(@dl.d androidx.compose.foundation.shape.e extraSmall, @dl.d androidx.compose.foundation.shape.e small, @dl.d androidx.compose.foundation.shape.e medium, @dl.d androidx.compose.foundation.shape.e large, @dl.d androidx.compose.foundation.shape.e extraLarge) {
        kotlin.jvm.internal.f0.p(extraSmall, "extraSmall");
        kotlin.jvm.internal.f0.p(small, "small");
        kotlin.jvm.internal.f0.p(medium, "medium");
        kotlin.jvm.internal.f0.p(large, "large");
        kotlin.jvm.internal.f0.p(extraLarge, "extraLarge");
        return new Shapes(extraSmall, small, medium, large, extraLarge);
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.foundation.shape.e getExtraLarge() {
        return this.extraLarge;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final androidx.compose.foundation.shape.e getExtraSmall() {
        return this.extraSmall;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final androidx.compose.foundation.shape.e getLarge() {
        return this.large;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) other;
        return kotlin.jvm.internal.f0.g(this.extraSmall, shapes.extraSmall) && kotlin.jvm.internal.f0.g(this.small, shapes.small) && kotlin.jvm.internal.f0.g(this.medium, shapes.medium) && kotlin.jvm.internal.f0.g(this.large, shapes.large) && kotlin.jvm.internal.f0.g(this.extraLarge, shapes.extraLarge);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final androidx.compose.foundation.shape.e getMedium() {
        return this.medium;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.foundation.shape.e getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (((((((this.extraSmall.hashCode() * 31) + this.small.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.large.hashCode()) * 31) + this.extraLarge.hashCode();
    }

    @dl.d
    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + ')';
    }
}

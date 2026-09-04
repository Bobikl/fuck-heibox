package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/a;", "Landroidx/compose/foundation/layout/h1;", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", ak.av, "d", ak.aF, "hashCode", "", "other", "", "equals", "", "toString", "Landroidx/compose/foundation/layout/h1;", "first", p7.a.f135567e, "<init>", "(Landroidx/compose/foundation/layout/h1;Landroidx/compose/foundation/layout/h1;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class a implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 first;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 second;

    public a(@dl.d h1 first, @dl.d h1 second) {
        kotlin.jvm.internal.f0.p(first, "first");
        kotlin.jvm.internal.f0.p(second, "second");
        this.first = first;
        this.second = second;
    }

    @Override // androidx.compose.foundation.layout.h1
    public int a(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return this.first.a(density) + this.second.a(density);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int b(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return this.first.b(density, layoutDirection) + this.second.b(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int c(@dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(density, "density");
        return this.first.c(density) + this.second.c(density);
    }

    @Override // androidx.compose.foundation.layout.h1
    public int d(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return this.first.d(density, layoutDirection) + this.second.d(density, layoutDirection);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return kotlin.jvm.internal.f0.g(aVar.first, this.first) && kotlin.jvm.internal.f0.g(aVar.second, this.second);
    }

    public int hashCode() {
        return this.first.hashCode() + (this.second.hashCode() * 31);
    }

    @dl.d
    public String toString() {
        return '(' + this.first + " + " + this.second + ')';
    }
}

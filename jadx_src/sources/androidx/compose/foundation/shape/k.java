package androidx.compose.foundation.shape;

import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.q;

/* JADX INFO: compiled from: GenericShape.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BM\u0012A\u0010\u0017\u001a=\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\u0002\b\u0016ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/shape/k;", "Landroidx/compose/ui/graphics/g2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Landroidx/compose/ui/graphics/f1;", ak.av, "(JLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;)Landroidx/compose/ui/graphics/f1;", "", "other", "", "equals", "", "hashCode", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/l1;", "Lkotlin/m0;", "name", "Lkotlin/b2;", "Lkotlin/t;", "builder", "<init>", "(Lyh/q;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class k implements g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7556b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final q<l1, b1.m, LayoutDirection, b2> f7557a;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@dl.d q<? super l1, ? super b1.m, ? super LayoutDirection, b2> builder) {
        f0.p(builder, "builder");
        this.f7557a = builder;
    }

    @Override // androidx.compose.ui.graphics.g2
    @dl.d
    public f1 a(long size, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
        f0.p(layoutDirection, "layoutDirection");
        f0.p(density, "density");
        l1 l1VarA = androidx.compose.ui.graphics.o.a();
        this.f7557a.invoke(l1VarA, b1.m.c(size), layoutDirection);
        l1VarA.close();
        return new f1.a(l1VarA);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        k kVar = other instanceof k ? (k) other : null;
        return f0.g(kVar != null ? kVar.f7557a : null, this.f7557a);
    }

    public int hashCode() {
        return this.f7557a.hashCode();
    }
}

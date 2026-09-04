package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.f0;
import androidx.compose.ui.layout.d1;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LazyGridItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0006\u001a\u00020\u0004*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/grid/a;", "Landroidx/compose/ui/layout/d1;", "Landroidx/compose/ui/platform/y0;", "Ls1/e;", "", "parentData", androidx.exifinterface.media.a.X4, "other", "", "equals", "", "hashCode", "Landroidx/compose/animation/core/f0;", "Ls1/n;", "e", "Landroidx/compose/animation/core/f0;", "f", "()Landroidx/compose/animation/core/f0;", "animationSpec", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/animation/core/f0;Lyh/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class a extends y0 implements d1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f0<s1.n> animationSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d f0<s1.n> animationSpec, @dl.d yh.l<? super x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.animationSpec = animationSpec;
    }

    @Override // androidx.compose.ui.layout.d1
    @dl.d
    public Object V(@dl.d s1.e eVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        return this.animationSpec;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof a) {
            return !kotlin.jvm.internal.f0.g(this.animationSpec, ((a) other).animationSpec);
        }
        return false;
    }

    @dl.d
    public final f0<s1.n> f() {
        return this.animationSpec;
    }

    public int hashCode() {
        return this.animationSpec.hashCode();
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}

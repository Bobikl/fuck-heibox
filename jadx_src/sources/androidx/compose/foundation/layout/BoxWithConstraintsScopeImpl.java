package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.m, reason: from toString */
/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001a\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\nø\u0001\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0097\u0001J\r\u0010\t\u001a\u00020\u0005*\u00020\u0005H\u0097\u0001J\u0019\u0010\u000b\u001a\u00020\nHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R#\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001d\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010 \u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\"\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u001d\u0010$\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010\u001d\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/m;", "Landroidx/compose/foundation/layout/l;", "Landroidx/compose/foundation/layout/k;", "Ls1/e;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/n;", "Landroidx/compose/ui/c;", "alignment", "b", "f", "Ls1/b;", "i", "()J", "density", "constraints", "j", "(Ls1/e;J)Landroidx/compose/foundation/layout/m;", "", "toString", "", "hashCode", "", "other", "", "equals", "J", "e", "Ls1/h;", "d", "()F", "minWidth", ak.av, "maxWidth", "g", "minHeight", ak.aF, "maxHeight", "<init>", "(Ls1/e;JLkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BoxWithConstraintsScopeImpl implements l, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @dl.d
    private final s1.e density;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ BoxScopeInstance f6358c;

    private BoxWithConstraintsScopeImpl(s1.e eVar, long j10) {
        this.density = eVar;
        this.constraints = j10;
        this.f6358c = BoxScopeInstance.f5954a;
    }

    public /* synthetic */ BoxWithConstraintsScopeImpl(s1.e eVar, long j10, kotlin.jvm.internal.u uVar) {
        this(eVar, j10);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    private final s1.e getDensity() {
        return this.density;
    }

    public static /* synthetic */ BoxWithConstraintsScopeImpl k(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, s1.e eVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = boxWithConstraintsScopeImpl.density;
        }
        if ((i10 & 2) != 0) {
            j10 = boxWithConstraintsScopeImpl.getConstraints();
        }
        return boxWithConstraintsScopeImpl.j(eVar, j10);
    }

    @Override // androidx.compose.foundation.layout.l
    public float a() {
        return s1.b.j(getConstraints()) ? this.density.E(s1.b.p(getConstraints())) : s1.h.f139219c.c();
    }

    @Override // androidx.compose.foundation.layout.k
    @j2
    @dl.d
    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d androidx.compose.ui.c alignment) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return this.f6358c.b(nVar, alignment);
    }

    @Override // androidx.compose.foundation.layout.l
    public float c() {
        return s1.b.i(getConstraints()) ? this.density.E(s1.b.o(getConstraints())) : s1.h.f139219c.c();
    }

    @Override // androidx.compose.foundation.layout.l
    public float d() {
        return this.density.E(s1.b.r(getConstraints()));
    }

    @Override // androidx.compose.foundation.layout.l
    /* JADX INFO: renamed from: e, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) other;
        return kotlin.jvm.internal.f0.g(this.density, boxWithConstraintsScopeImpl.density) && s1.b.g(getConstraints(), boxWithConstraintsScopeImpl.getConstraints());
    }

    @Override // androidx.compose.foundation.layout.k
    @j2
    @dl.d
    public androidx.compose.ui.n f(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return this.f6358c.f(nVar);
    }

    @Override // androidx.compose.foundation.layout.l
    public float g() {
        return this.density.E(s1.b.q(getConstraints()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + s1.b.t(getConstraints());
    }

    public final long i() {
        return getConstraints();
    }

    @dl.d
    public final BoxWithConstraintsScopeImpl j(@dl.d s1.e density, long constraints) {
        kotlin.jvm.internal.f0.p(density, "density");
        return new BoxWithConstraintsScopeImpl(density, constraints, null);
    }

    @dl.d
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) s1.b.w(getConstraints())) + ')';
    }
}

package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.w;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import s1.n;
import s1.o;
import s1.p;
import s1.r;
import s1.s;

/* JADX INFO: compiled from: Popup.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/window/a;", "Landroidx/compose/ui/window/g;", "Ls1/p;", "anchorBounds", "Ls1/r;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Ls1/n;", ak.av, "(Ls1/p;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "Landroidx/compose/ui/c;", "Landroidx/compose/ui/c;", "b", "()Landroidx/compose/ui/c;", "alignment", "J", ak.aF, "()J", w.c.R, "<init>", "(Landroidx/compose/ui/c;JLkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.c alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    private a(androidx.compose.ui.c cVar, long j10) {
        this.alignment = cVar;
        this.offset = j10;
    }

    public /* synthetic */ a(androidx.compose.ui.c cVar, long j10, u uVar) {
        this(cVar, j10);
    }

    @Override // androidx.compose.ui.window.g
    public long a(@dl.d p anchorBounds, long windowSize, @dl.d LayoutDirection layoutDirection, long popupContentSize) {
        f0.p(anchorBounds, "anchorBounds");
        f0.p(layoutDirection, "layoutDirection");
        long jA = o.a(0, 0);
        androidx.compose.ui.c cVar = this.alignment;
        r.a aVar = r.f139246b;
        long jA2 = cVar.a(aVar.a(), s.a(anchorBounds.G(), anchorBounds.r()), layoutDirection);
        long jA3 = this.alignment.a(aVar.a(), s.a(r.m(popupContentSize), r.j(popupContentSize)), layoutDirection);
        long jA4 = o.a(anchorBounds.t(), anchorBounds.getF139243b());
        long jA5 = o.a(n.m(jA) + n.m(jA4), n.o(jA) + n.o(jA4));
        long jA6 = o.a(n.m(jA5) + n.m(jA2), n.o(jA5) + n.o(jA2));
        long jA7 = o.a(n.m(jA3), n.o(jA3));
        long jA8 = o.a(n.m(jA6) - n.m(jA7), n.o(jA6) - n.o(jA7));
        long jA9 = o.a(n.m(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), n.o(this.offset));
        return o.a(n.m(jA8) + n.m(jA9), n.o(jA8) + n.o(jA9));
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }
}

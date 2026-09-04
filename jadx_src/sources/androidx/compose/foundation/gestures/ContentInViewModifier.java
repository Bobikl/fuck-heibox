package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.h2;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.layout.x0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ContentInViewModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\bI\u0010JJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0082@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u001d\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J#\u0010 \u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001fH\u0096@ø\u0001\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00102R/\u0010>\u001a\u0004\u0018\u00010\u000b2\b\u00107\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006K"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/f;", "Landroidx/compose/ui/layout/a1;", "Landroidx/compose/ui/layout/x0;", "Landroidx/compose/ui/layout/q;", "coordinates", "Ls1/r;", "oldSize", "Lkotlin/b2;", ak.aB, "(Landroidx/compose/ui/layout/q;J)V", "Lb1/i;", "childBounds", "containerSize", "o", "(Lb1/i;J)Lb1/i;", "source", "destination", ak.aG, "(Lb1/i;Lb1/i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "leadingEdge", "trailingEdge", "parentSize", "y", UiKitSpanObj.TYPE_SIZE, "L", "(J)V", "p", "localRect", ak.av, "Lkotlin/Function0;", ak.aF, "(Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "b", "Lkotlinx/coroutines/q0;", "scope", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/p;", "d", "Landroidx/compose/foundation/gestures/p;", "scrollableState", "", "e", "Z", "reverseDirection", "f", "Landroidx/compose/ui/layout/q;", "focusedChild", "g", "i", "focusedChildBeingAnimated", "<set-?>", "j", "Landroidx/compose/runtime/a1;", "q", "()Lb1/i;", ak.aD, "(Lb1/i;)V", "focusTargetBounds", "Lkotlinx/coroutines/d2;", "k", "Lkotlinx/coroutines/d2;", "focusAnimationJob", "Landroidx/compose/ui/n;", "l", "Landroidx/compose/ui/n;", "r", "()Landroidx/compose/ui/n;", "modifier", "<init>", "(Lkotlinx/coroutines/q0;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/p;Z)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class ContentInViewModifier implements androidx.compose.foundation.relocation.f, a1, x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Orientation orientation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p scrollableState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q focusedChild;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q coordinates;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private s1.r f5117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q focusedChildBeingAnimated;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 focusTargetBounds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private d2 focusAnimationJob;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.n modifier;

    /* JADX INFO: compiled from: ContentInViewModifier.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5122a;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            f5122a = iArr;
        }
    }

    public ContentInViewModifier(@dl.d q0 scope, @dl.d Orientation orientation, @dl.d p scrollableState, boolean z10) {
        f0.p(scope, "scope");
        f0.p(orientation, "orientation");
        f0.p(scrollableState, "scrollableState");
        this.scope = scope;
        this.orientation = orientation;
        this.scrollableState = scrollableState;
        this.reverseDirection = z10;
        this.focusTargetBounds = h2.g(null, null, 2, null);
        this.modifier = BringIntoViewResponderKt.c(FocusedBoundsKt.c(this, new yh.l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier$modifier$1
            {
                super(1);
            }

            public final void a(@dl.e androidx.compose.ui.layout.q qVar) {
                this.f5123b.focusedChild = qVar;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                a(qVar);
                return b2.f124493a;
            }
        }), this);
    }

    private final b1.i o(b1.i childBounds, long containerSize) {
        long jF = s1.s.f(containerSize);
        int i10 = a.f5122a[this.orientation.ordinal()];
        if (i10 == 1) {
            return childBounds.R(0.0f, -y(childBounds.getF30372b(), childBounds.j(), b1.m.m(jF)));
        }
        if (i10 == 2) {
            return childBounds.R(-y(childBounds.t(), childBounds.x(), b1.m.t(jF)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b1.i q() {
        return (b1.i) this.focusTargetBounds.getValue();
    }

    private final void s(androidx.compose.ui.layout.q coordinates, long oldSize) {
        androidx.compose.ui.layout.q qVar;
        b1.i iVarQ;
        boolean z10 = true;
        if (this.orientation != Orientation.Horizontal ? s1.r.j(coordinates.a()) >= s1.r.j(oldSize) : s1.r.m(coordinates.a()) >= s1.r.m(oldSize)) {
            z10 = false;
        }
        if (z10 && (qVar = this.focusedChild) != null) {
            if (!qVar.p()) {
                qVar = null;
            }
            if (qVar == null) {
                return;
            }
            b1.i iVarX = coordinates.x(qVar, false);
            if (qVar == this.focusedChildBeingAnimated) {
                iVarQ = q();
                if (iVarQ == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                iVarQ = iVarX;
            }
            if (b1.j.c(b1.f.f30364b.e(), s1.s.f(oldSize)).Q(iVarQ)) {
                b1.i iVarO = o(iVarQ, coordinates.a());
                if (f0.g(iVarO, iVarQ)) {
                    return;
                }
                this.focusedChildBeingAnimated = qVar;
                z(iVarO);
                kotlinx.coroutines.k.f(this.scope, p2.f130297c, null, new ContentInViewModifier$onSizeChanged$1(this, iVarX, iVarO, null), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(b1.i iVar, b1.i iVar2, kotlin.coroutines.c<? super b2> cVar) {
        float f30372b;
        float f30372b2;
        int i10 = a.f5122a[this.orientation.ordinal()];
        if (i10 == 1) {
            f30372b = iVar2.getF30372b();
            f30372b2 = iVar.getF30372b();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f30372b = iVar2.t();
            f30372b2 = iVar.t();
        }
        float f10 = f30372b - f30372b2;
        if (this.reverseDirection) {
            f10 = -f10;
        }
        Object objB = ScrollExtensionsKt.b(this.scrollableState, f10, null, cVar, 2, null);
        return objB == kotlin.coroutines.intrinsics.b.h() ? objB : b2.f124493a;
    }

    private final float y(float leadingEdge, float trailingEdge, float parentSize) {
        if ((leadingEdge >= 0.0f && trailingEdge <= parentSize) || (leadingEdge < 0.0f && trailingEdge > parentSize)) {
            return 0.0f;
        }
        float f10 = trailingEdge - parentSize;
        return Math.abs(leadingEdge) < Math.abs(f10) ? leadingEdge : f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(b1.i iVar) {
        this.focusTargetBounds.setValue(iVar);
    }

    @Override // androidx.compose.ui.layout.a1
    public void L(long size) {
        androidx.compose.ui.layout.q qVar = this.coordinates;
        s1.r rVar = this.f5117h;
        if (rVar != null && !s1.r.h(rVar.getF139248a(), size)) {
            if (qVar != null && qVar.p()) {
                s(qVar, rVar.getF139248a());
            }
        }
        this.f5117h = s1.r.b(size);
    }

    @Override // androidx.compose.foundation.relocation.f
    @dl.d
    public b1.i a(@dl.d b1.i localRect) {
        f0.p(localRect, "localRect");
        s1.r rVar = this.f5117h;
        if (rVar != null) {
            return o(localRect, rVar.getF139248a());
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.foundation.relocation.f
    @dl.e
    public Object c(@dl.d yh.a<b1.i> aVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objU;
        b1.i iVarInvoke = aVar.invoke();
        return (iVarInvoke != null && (objU = u(iVarInvoke, a(iVarInvoke), cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objU : b2.f124493a;
    }

    @Override // androidx.compose.ui.layout.x0
    public void p(@dl.d androidx.compose.ui.layout.q coordinates) {
        f0.p(coordinates, "coordinates");
        this.coordinates = coordinates;
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final androidx.compose.ui.n getModifier() {
        return this.modifier;
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

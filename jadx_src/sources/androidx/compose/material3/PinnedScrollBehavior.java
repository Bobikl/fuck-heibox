package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0003\u0010\u001c\"\u0004\b\u001a\u0010\u001dR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0015\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/material3/PinnedScrollBehavior;", "Landroidx/compose/material3/d2;", "Landroidx/compose/material3/TopAppBarState;", ak.av, "Landroidx/compose/material3/TopAppBarState;", "getState", "()Landroidx/compose/material3/TopAppBarState;", "state", "", ak.aF, "Z", "b", "()Z", "isPinned", "Landroidx/compose/animation/core/h;", "", "d", "Landroidx/compose/animation/core/h;", "()Landroidx/compose/animation/core/h;", "snapAnimationSpec", "Landroidx/compose/animation/core/x;", "e", "Landroidx/compose/animation/core/x;", "()Landroidx/compose/animation/core/x;", "flingAnimationSpec", "Landroidx/compose/ui/input/nestedscroll/b;", "f", "Landroidx/compose/ui/input/nestedscroll/b;", "()Landroidx/compose/ui/input/nestedscroll/b;", "(Landroidx/compose/ui/input/nestedscroll/b;)V", "nestedScrollConnection", "Lkotlin/Function0;", "canScroll", "Lyh/a;", "()Lyh/a;", "<init>", "(Landroidx/compose/material3/TopAppBarState;Lyh/a;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class PinnedScrollBehavior implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TopAppBarState state;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<Boolean> f10297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isPinned;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final androidx.compose.animation.core.h<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final androidx.compose.animation.core.x<Float> flingAnimationSpec;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.input.nestedscroll.b nestedScrollConnection;

    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"androidx/compose/material3/PinnedScrollBehavior$a", "Landroidx/compose/ui/input/nestedscroll/b;", "Lb1/f;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/c;", "source", ak.aF, "(JJI)J", "material3_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.ui.input.nestedscroll.b {
        a() {
        }

        @Override // androidx.compose.ui.input.nestedscroll.b
        public /* synthetic */ Object a(long j10, long j11, kotlin.coroutines.c cVar) {
            return androidx.compose.ui.input.nestedscroll.a.a(this, j10, j11, cVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.b
        public long c(long consumed, long available, int source) {
            if (!PinnedScrollBehavior.this.e().invoke().booleanValue()) {
                return b1.f.f30364b.e();
            }
            if (!(b1.f.r(consumed) == 0.0f) || b1.f.r(available) <= 0.0f) {
                TopAppBarState state = PinnedScrollBehavior.this.getState();
                state.g(state.c() + b1.f.r(consumed));
            } else {
                PinnedScrollBehavior.this.getState().g(0.0f);
            }
            return b1.f.f30364b.e();
        }

        @Override // androidx.compose.ui.input.nestedscroll.b
        public /* synthetic */ Object d(long j10, kotlin.coroutines.c cVar) {
            return androidx.compose.ui.input.nestedscroll.a.c(this, j10, cVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.b
        public /* synthetic */ long e(long j10, int i10) {
            return androidx.compose.ui.input.nestedscroll.a.d(this, j10, i10);
        }
    }

    public PinnedScrollBehavior(@dl.d TopAppBarState state, @dl.d yh.a<Boolean> canScroll) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(canScroll, "canScroll");
        this.state = state;
        this.f10297b = canScroll;
        this.isPinned = true;
        this.nestedScrollConnection = new a();
    }

    public /* synthetic */ PinnedScrollBehavior(TopAppBarState topAppBarState, yh.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(topAppBarState, (i10 & 2) != 0 ? new yh.a<Boolean>() { // from class: androidx.compose.material3.PinnedScrollBehavior.1
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : aVar);
    }

    @Override // androidx.compose.material3.d2
    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public androidx.compose.ui.input.nestedscroll.b getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.d2
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    @Override // androidx.compose.material3.d2
    @dl.e
    public androidx.compose.animation.core.h<Float> c() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.d2
    @dl.e
    public androidx.compose.animation.core.x<Float> d() {
        return this.flingAnimationSpec;
    }

    @dl.d
    public final yh.a<Boolean> e() {
        return this.f10297b;
    }

    public void f(@dl.d androidx.compose.ui.input.nestedscroll.b bVar) {
        kotlin.jvm.internal.f0.p(bVar, "<set-?>");
        this.nestedScrollConnection = bVar;
    }

    @Override // androidx.compose.material3.d2
    @dl.d
    public TopAppBarState getState() {
        return this.state;
    }
}

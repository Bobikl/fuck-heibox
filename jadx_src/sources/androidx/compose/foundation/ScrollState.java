package androidx.compose.foundation;

import androidx.compose.animation.core.z0;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.saveable.SaverKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u00107\u001a\u00020\u0010¢\u0006\u0004\b8\u0010\u001dJD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J+\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010/\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010\u001dR\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/p;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/m;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", ak.aF, "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "delta", ak.av, "", "value", "Landroidx/compose/animation/core/h;", "animationSpec", RXScreenCaptureService.KEY_HEIGHT, "(ILandroidx/compose/animation/core/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", "n", "(ILkotlin/coroutines/c;)Ljava/lang/Object;", "<set-?>", "Landroidx/compose/runtime/a1;", "m", "()I", "p", "(I)V", "Landroidx/compose/foundation/interaction/g;", "b", "Landroidx/compose/foundation/interaction/g;", "k", "()Landroidx/compose/foundation/interaction/g;", "internalInteractionSource", "Landroidx/compose/runtime/a1;", "_maxValueState", "d", "F", "accumulator", "e", "Landroidx/compose/foundation/gestures/p;", "scrollableState", "newMax", "l", "o", "maxValue", "Landroidx/compose/foundation/interaction/e;", "j", "()Landroidx/compose/foundation/interaction/e;", "interactionSource", "", "()Z", "isScrollInProgress", "initial", "<init>", "f", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class ScrollState implements androidx.compose.foundation.gestures.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<ScrollState, ?> f5063g = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, ScrollState, Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d ScrollState it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return Integer.valueOf(it.m());
        }
    }, new yh.l<Integer, ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        @dl.e
        public final ScrollState a(int i10) {
            return new ScrollState(i10);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ ScrollState invoke(Integer num) {
            return a(num.intValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.interaction.g internalInteractionSource = androidx.compose.foundation.interaction.f.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private a1<Integer> _maxValueState = e2.j(Integer.MAX_VALUE, e2.w());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.gestures.p scrollableState = ScrollableStateKt.a(new yh.l<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @dl.d
        public final Float a(float f10) {
            float fM = this.f5071b.m() + f10 + this.f5071b.accumulator;
            float fH = fi.u.H(fM, 0.0f, this.f5071b.l());
            boolean z10 = !(fM == fH);
            float fM2 = fH - this.f5071b.m();
            int iL0 = di.d.L0(fM2);
            ScrollState scrollState = this.f5071b;
            scrollState.p(scrollState.m() + iL0);
            this.f5071b.accumulator = fM2 - iL0;
            if (z10) {
                f10 = fM2;
            }
            return Float.valueOf(f10);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    });

    /* JADX INFO: renamed from: androidx.compose.foundation.ScrollState$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Scroll.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/ScrollState$a;", "", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/foundation/ScrollState;", "Saver", "Landroidx/compose/runtime/saveable/e;", ak.av, "()Landroidx/compose/runtime/saveable/e;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.runtime.saveable.e<ScrollState, ?> a() {
            return ScrollState.f5063g;
        }
    }

    public ScrollState(int i10) {
        this.value = e2.j(Integer.valueOf(i10), e2.w());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object i(ScrollState scrollState, int i10, androidx.compose.animation.core.h hVar, kotlin.coroutines.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            hVar = new z0(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.h(i10, hVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(int i10) {
        this.value.setValue(Integer.valueOf(i10));
    }

    @Override // androidx.compose.foundation.gestures.p
    public float a(float delta) {
        return this.scrollableState.a(delta);
    }

    @Override // androidx.compose.foundation.gestures.p
    public boolean b() {
        return this.scrollableState.b();
    }

    @Override // androidx.compose.foundation.gestures.p
    @dl.e
    public Object c(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super androidx.compose.foundation.gestures.m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = this.scrollableState.c(mutatePriority, pVar, cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    @dl.e
    public final Object h(int i10, @dl.d androidx.compose.animation.core.h<Float> hVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objA = ScrollExtensionsKt.a(this, i10 - m(), hVar, cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.d
    public final androidx.compose.foundation.interaction.e j() {
        return this.internalInteractionSource;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final androidx.compose.foundation.interaction.g getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int l() {
        return this._maxValueState.getValue().intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m() {
        return ((Number) this.value.getValue()).intValue();
    }

    @dl.e
    public final Object n(int i10, @dl.d kotlin.coroutines.c<? super Float> cVar) {
        return ScrollExtensionsKt.c(this, i10 - m(), cVar);
    }

    public final void o(int i10) {
        this._maxValueState.setValue(Integer.valueOf(i10));
        if (m() > i10) {
            p(i10);
        }
    }
}

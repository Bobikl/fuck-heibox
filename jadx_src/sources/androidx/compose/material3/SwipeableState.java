package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.saveable.SaverKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@j2
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0011\u0018\u0000 u*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001{BD\u0012\u0006\u0010x\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012#\b\u0002\u0010d\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\ba\u0012\b\bb\u0012\u0004\b\b(c\u0012\u0004\u0012\u00020+0`¢\u0006\u0004\by\u0010zJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R+\u0010*\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u00101\u001a\u00020+2\u0006\u0010#\u001a\u00020+8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010%R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010%R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010%R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010%RC\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010%\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u000fR&\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\f0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010@R\"\u0010G\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001c\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FRO\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030K2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030K8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010%\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR+\u0010S\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010%\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR/\u0010Z\u001a\u0004\u0018\u00010T2\b\u0010#\u001a\u0004\u0018\u00010T8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010%\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010_\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\\\u001a\u0004\b]\u0010^R5\u0010d\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\ba\u0012\b\bb\u0012\u0004\b\b(c\u0012\u0004\u0012\u00020+0`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bU\u0010fR\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00030g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030g8F¢\u0006\u0006\u001a\u0004\bk\u0010iR\u001a\u0010\u0013\u001a\u00028\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\bn\u0010o\u001a\u0004\bm\u0010'R \u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000p8@X\u0081\u0004¢\u0006\f\u0012\u0004\bs\u0010o\u001a\u0004\bq\u0010rR\u001a\u0010w\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\bv\u0010o\u001a\u0004\bu\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006|"}, d2 = {"Landroidx/compose/material3/SwipeableState;", androidx.exifinterface.media.a.f23244d5, "", "", "target", "Lkotlin/b2;", "Q", "(FLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/h;", "spec", "i", "(FLandroidx/compose/animation/core/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "newAnchors", "l", "(Ljava/util/Map;)V", "oldAnchors", "H", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "targetValue", "R", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "anim", "j", "(Ljava/lang/Object;Landroidx/compose/animation/core/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", "velocity", "G", "delta", "F", "(F)F", ak.av, "Landroidx/compose/animation/core/h;", "n", "()Landroidx/compose/animation/core/h;", "animationSpec", "<set-?>", ak.aF, "Landroidx/compose/runtime/a1;", "p", "()Ljava/lang/Object;", "K", "(Ljava/lang/Object;)V", "currentValue", "", "d", androidx.exifinterface.media.a.S4, "()Z", "J", "(Z)V", "isAnimationRunning", "Landroidx/compose/runtime/a1;", "e", "offsetState", "f", "overflowState", "g", "absoluteOffset", RXScreenCaptureService.KEY_HEIGHT, "animationTarget", "m", "()Ljava/util/Map;", "I", "anchors", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/e;", "latestNonEmptyAnchorsFlow", "k", ak.aG, "()F", "M", "(F)V", "minBound", "t", "L", "maxBound", "Lkotlin/Function2;", "C", "()Lyh/p;", "O", "(Lyh/p;)V", "thresholds", "D", "P", "velocityThreshold", "Landroidx/compose/material3/d1;", "o", ak.aD, "()Landroidx/compose/material3/d1;", "N", "(Landroidx/compose/material3/d1;)V", "resistance", "Landroidx/compose/foundation/gestures/f;", "Landroidx/compose/foundation/gestures/f;", ak.aB, "()Landroidx/compose/foundation/gestures/f;", "draggableState", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "newValue", "confirmStateChange", "Lyh/l;", "()Lyh/l;", "Landroidx/compose/runtime/m2;", "v", "()Landroidx/compose/runtime/m2;", androidx.constraintlayout.core.motion.utils.w.c.R, RXScreenCaptureService.KEY_WIDTH, "overflow", androidx.exifinterface.media.a.W4, "getTargetValue$material3_release$annotations", "()V", "Landroidx/compose/material3/r1;", "x", "()Landroidx/compose/material3/r1;", "getProgress$material3_release$annotations", "progress", "q", "getDirection$material3_release$annotations", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/h;Lyh/l;)V", "Companion", "material3_release"}, k = 1, mv = {1, 7, 1})
public class SwipeableState<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.animation.core.h<Float> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<T, Boolean> f11061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 currentValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 isAnimationRunning;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1<Float> offsetState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1<Float> overflowState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1<Float> absoluteOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1<Float> animationTarget;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 anchors;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<Map<Float, T>> latestNonEmptyAnchorsFlow;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float minBound;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float maxBound;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 thresholds;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 velocityThreshold;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 resistance;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.gestures.f draggableState;

    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJD\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/SwipeableState$Companion;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/h;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/material3/SwipeableState;", ak.av, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final <T> androidx.compose.runtime.saveable.e<SwipeableState<T>, T> a(@dl.d final androidx.compose.animation.core.h<Float> animationSpec, @dl.d final yh.l<? super T, Boolean> confirmStateChange) {
            kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
            kotlin.jvm.internal.f0.p(confirmStateChange, "confirmStateChange");
            return SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, SwipeableState<T>, T>() { // from class: androidx.compose.material3.SwipeableState$Companion$Saver$1
                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final T invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d SwipeableState<T> it) {
                    kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
                    kotlin.jvm.internal.f0.p(it, "it");
                    return it.p();
                }
            }, new yh.l<T, SwipeableState<T>>() { // from class: androidx.compose.material3.SwipeableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SwipeableState<T> invoke(@dl.d T it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return new SwipeableState<>(it, animationSpec, confirmStateChange);
                }
            });
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "", "anchors", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements kotlinx.coroutines.flow.f<Map<Float, ? extends T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SwipeableState<T> f11080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f11081c;

        a(SwipeableState<T> swipeableState, float f10) {
            this.f11080b = swipeableState;
            this.f11081c = f10;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@dl.d Map<Float, ? extends T> map, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
            Float f10 = SwipeableKt.f(map, this.f11080b.p());
            kotlin.jvm.internal.f0.m(f10);
            float fFloatValue = f10.floatValue();
            T t10 = map.get(kotlin.coroutines.jvm.internal.a.e(SwipeableKt.d(this.f11080b.v().getValue().floatValue(), fFloatValue, map.keySet(), this.f11080b.C(), this.f11081c, this.f11080b.D())));
            if (t10 != null && this.f11080b.o().invoke(t10).booleanValue()) {
                Object objK = SwipeableState.k(this.f11080b, t10, null, cVar, 2, null);
                return objK == kotlin.coroutines.intrinsics.b.h() ? objK : kotlin.b2.f124493a;
            }
            SwipeableState<T> swipeableState = this.f11080b;
            Object objI = swipeableState.i(fFloatValue, swipeableState.n(), cVar);
            return objI == kotlin.coroutines.intrinsics.b.h() ? objI : kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t10, @dl.d androidx.compose.animation.core.h<Float> animationSpec, @dl.d yh.l<? super T, Boolean> confirmStateChange) {
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.f11061b = confirmStateChange;
        this.currentValue = h2.g(t10, null, 2, null);
        this.isAnimationRunning = h2.g(Boolean.FALSE, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.offsetState = h2.g(fValueOf, null, 2, null);
        this.overflowState = h2.g(fValueOf, null, 2, null);
        this.absoluteOffset = h2.g(fValueOf, null, 2, null);
        this.animationTarget = h2.g(null, null, 2, null);
        this.anchors = h2.g(kotlin.collections.s0.z(), null, 2, null);
        final kotlinx.coroutines.flow.e eVarV = androidx.compose.runtime.e2.v(new yh.a<Map<Float, ? extends T>>(this) { // from class: androidx.compose.material3.SwipeableState$latestNonEmptyAnchorsFlow$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SwipeableState<T> f11098b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f11098b = this;
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<Float, T> invoke() {
                return this.f11098b.m();
            }
        });
        this.latestNonEmptyAnchorsFlow = kotlinx.coroutines.flow.g.T1(new kotlinx.coroutines.flow.e<Map<Float, ? extends T>>() { // from class: androidx.compose.material3.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f11116b;

                /* JADX INFO: renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f11117b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f11118c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f11119d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f11120e;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f11117b = obj;
                        this.f11118c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.f11116b = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f11118c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f11118c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f11117b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f11118c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj2);
                        kotlinx.coroutines.flow.f fVar = this.f11116b;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.f11118c = 1;
                            if (fVar.emit(obj, anonymousClass1) == objH) {
                                return objH;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj2);
                    }
                    return kotlin.b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVarV.a(new AnonymousClass2(fVar), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = h2.g(new yh.p<Float, Float, Float>() { // from class: androidx.compose.material3.SwipeableState$thresholds$2
            @dl.d
            public final Float a(float f10, float f11) {
                return Float.valueOf(0.0f);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
                return a(f10.floatValue(), f11.floatValue());
            }
        }, null, 2, null);
        this.velocityThreshold = h2.g(fValueOf, null, 2, null);
        this.resistance = h2.g(null, null, 2, null);
        this.draggableState = DraggableKt.a(new yh.l<Float, kotlin.b2>(this) { // from class: androidx.compose.material3.SwipeableState$draggableState$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SwipeableState<T> f11097b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f11097b = this;
            }

            public final void a(float f10) {
                float fFloatValue = ((Number) ((SwipeableState) this.f11097b).absoluteOffset.getValue()).floatValue() + f10;
                float fH = fi.u.H(fFloatValue, this.f11097b.getMinBound(), this.f11097b.getMaxBound());
                float f11 = fFloatValue - fH;
                ResistanceConfig resistanceConfigZ = this.f11097b.z();
                ((SwipeableState) this.f11097b).offsetState.setValue(Float.valueOf(fH + (resistanceConfigZ != null ? resistanceConfigZ.a(f11) : 0.0f)));
                ((SwipeableState) this.f11097b).overflowState.setValue(Float.valueOf(f11));
                ((SwipeableState) this.f11097b).absoluteOffset.setValue(Float.valueOf(fFloatValue));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Float f10) {
                a(f10.floatValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    public /* synthetic */ SwipeableState(Object obj, androidx.compose.animation.core.h hVar, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(obj, (i10 & 2) != 0 ? s1.f12114a.a() : hVar, (i10 & 4) != 0 ? new yh.l<T, Boolean>() { // from class: androidx.compose.material3.SwipeableState.1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }
        } : lVar);
    }

    @w
    public static /* synthetic */ void B() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z10) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(T t10) {
        this.currentValue.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q(float f10, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objA = androidx.compose.foundation.gestures.e.a(this.draggableState, null, new SwipeableState$snapInternalToOffset$2(f10, this, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(float f10, androidx.compose.animation.core.h<Float> hVar, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objA = androidx.compose.foundation.gestures.e.a(this.draggableState, null, new SwipeableState$animateInternalToOffset$2(this, f10, hVar, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object k(SwipeableState swipeableState, Object obj, androidx.compose.animation.core.h hVar, kotlin.coroutines.c cVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i10 & 2) != 0) {
            hVar = swipeableState.animationSpec;
        }
        return swipeableState.j(obj, hVar, cVar);
    }

    @w
    public static /* synthetic */ void r() {
    }

    @w
    public static /* synthetic */ void y() {
    }

    public final T A() {
        float fD;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            fD = value.floatValue();
        } else {
            float fFloatValue = v().getValue().floatValue();
            Float f10 = SwipeableKt.f(m(), p());
            fD = SwipeableKt.d(fFloatValue, f10 != null ? f10.floatValue() : v().getValue().floatValue(), m().keySet(), C(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t10 = m().get(Float.valueOf(fD));
        return t10 == null ? p() : t10;
    }

    @dl.d
    public final yh.p<Float, Float, Float> C() {
        return (yh.p) this.thresholds.getValue();
    }

    public final float D() {
        return ((Number) this.velocityThreshold.getValue()).floatValue();
    }

    public final boolean E() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final float F(float delta) {
        float fH = fi.u.H(this.absoluteOffset.getValue().floatValue() + delta, this.minBound, this.maxBound) - this.absoluteOffset.getValue().floatValue();
        if (Math.abs(fH) > 0.0f) {
            this.draggableState.a(fH);
        }
        return fH;
    }

    @dl.e
    public final Object G(float f10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objA = this.latestNonEmptyAnchorsFlow.a(new a(this, f10), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x020d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x020e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.material3.SwipeableState] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.material3.SwipeableState] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.material3.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.compose.material3.SwipeableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.material3.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.material3.SwipeableState] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.material3.SwipeableState, androidx.compose.material3.SwipeableState<T>, java.lang.Object] */
    @dl.e
    public final Object H(@dl.d Map<Float, ? extends T> map, @dl.d Map<Float, ? extends T> map2, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        float fFloatValue;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        if (cVar instanceof SwipeableState$processNewAnchors$1) {
            swipeableState$processNewAnchors$1 = (SwipeableState$processNewAnchors$1) cVar;
            int i10 = swipeableState$processNewAnchors$1.f11104g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                swipeableState$processNewAnchors$1.f11104g = i10 - Integer.MIN_VALUE;
            } else {
                swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, cVar);
            }
        } else {
            swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, cVar);
        }
        Object obj = swipeableState$processNewAnchors$1.f11102e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = swipeableState$processNewAnchors$1.f11104g;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            if (map.isEmpty()) {
                Float fE4 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                kotlin.jvm.internal.f0.m(fE4);
                this.minBound = fE4.floatValue();
                Float fM3 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                kotlin.jvm.internal.f0.m(fM3);
                this.maxBound = fM3.floatValue();
                Float f10 = SwipeableKt.f(map2, p());
                if (f10 == null) {
                    throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                }
                float fFloatValue2 = f10.floatValue();
                swipeableState$processNewAnchors$1.f11104g = 1;
                if (Q(fFloatValue2, swipeableState$processNewAnchors$1) == objH) {
                    return objH;
                }
                return kotlin.b2.f124493a;
            }
            if (!kotlin.jvm.internal.f0.g(map2, map)) {
                this.minBound = Float.NEGATIVE_INFINITY;
                this.maxBound = Float.POSITIVE_INFINITY;
                Float value = this.animationTarget.getValue();
                Object next = null;
                if (value != null) {
                    Float f11 = SwipeableKt.f(map2, map.get(value));
                    if (f11 != null) {
                        fFloatValue = f11.floatValue();
                    } else {
                        Iterator<T> it = map2.keySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                float fAbs = Math.abs(((Number) next).floatValue() - value.floatValue());
                                do {
                                    Object next2 = it.next();
                                    float fAbs2 = Math.abs(((Number) next2).floatValue() - value.floatValue());
                                    if (Float.compare(fAbs, fAbs2) > 0) {
                                        next = next2;
                                        fAbs = fAbs2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        kotlin.jvm.internal.f0.m(next);
                        fFloatValue = ((Number) next).floatValue();
                    }
                } else {
                    Object objP = map.get(v().getValue());
                    if (kotlin.jvm.internal.f0.g(objP, p())) {
                        objP = p();
                    }
                    Float f12 = SwipeableKt.f(map2, objP);
                    if (f12 != null) {
                        fFloatValue = f12.floatValue();
                    } else {
                        Iterator<T> it2 = map2.keySet().iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                float fAbs3 = Math.abs(((Number) next).floatValue() - v().getValue().floatValue());
                                do {
                                    Object next3 = it2.next();
                                    float fAbs4 = Math.abs(((Number) next3).floatValue() - v().getValue().floatValue());
                                    if (Float.compare(fAbs3, fAbs4) > 0) {
                                        next = next3;
                                        fAbs3 = fAbs4;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        kotlin.jvm.internal.f0.m(next);
                        fFloatValue = ((Number) next).floatValue();
                    }
                }
                try {
                    androidx.compose.animation.core.h<Float> hVar = this.animationSpec;
                    swipeableState$processNewAnchors$1.f11099b = this;
                    swipeableState$processNewAnchors$1.f11100c = map2;
                    swipeableState$processNewAnchors$1.f11101d = fFloatValue;
                    swipeableState$processNewAnchors$1.f11104g = 2;
                    if (i(fFloatValue, hVar, swipeableState$processNewAnchors$1) == objH) {
                        return objH;
                    }
                    r12 = this;
                    r12.K(kotlin.collections.s0.K(map2, kotlin.coroutines.jvm.internal.a.e(fFloatValue)));
                    Float fE5 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                    kotlin.jvm.internal.f0.m(fE5);
                    r12.minBound = fE5.floatValue();
                    Float fM4 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                    kotlin.jvm.internal.f0.m(fM4);
                    r12.maxBound = fM4.floatValue();
                } catch (CancellationException unused) {
                    r11 = this;
                    swipeableState$processNewAnchors$1.f11099b = r11;
                    swipeableState$processNewAnchors$1.f11100c = map2;
                    swipeableState$processNewAnchors$1.f11101d = fFloatValue;
                    swipeableState$processNewAnchors$1.f11104g = 3;
                    if (r11.Q(fFloatValue, swipeableState$processNewAnchors$1) == objH) {
                        return objH;
                    }
                    r13 = r11;
                    r13.K(kotlin.collections.s0.K(map2, kotlin.coroutines.jvm.internal.a.e(fFloatValue)));
                    Float fE6 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                    kotlin.jvm.internal.f0.m(fE6);
                    r13.minBound = fE6.floatValue();
                    Float fM5 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                    kotlin.jvm.internal.f0.m(fM5);
                    r13.maxBound = fM5.floatValue();
                } catch (Throwable th2) {
                    th = th2;
                    r10 = this;
                    r10.K(kotlin.collections.s0.K(map2, kotlin.coroutines.jvm.internal.a.e(fFloatValue)));
                    Float fE7 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                    kotlin.jvm.internal.f0.m(fE7);
                    r10.minBound = fE7.floatValue();
                    Float fM6 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                    kotlin.jvm.internal.f0.m(fM6);
                    r10.maxBound = fM6.floatValue();
                    throw th;
                }
            }
        } else {
            if (i11 == 1) {
                kotlin.t0.n(obj);
                return kotlin.b2.f124493a;
            }
            if (i11 == 2) {
                fFloatValue = swipeableState$processNewAnchors$1.f11101d;
                map2 = (Map) swipeableState$processNewAnchors$1.f11100c;
                r11 = (SwipeableState) swipeableState$processNewAnchors$1.f11099b;
                try {
                    try {
                        kotlin.t0.n(obj);
                        r12 = r11;
                        r12.K(kotlin.collections.s0.K(map2, kotlin.coroutines.jvm.internal.a.e(fFloatValue)));
                        Float fE8 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                        kotlin.jvm.internal.f0.m(fE8);
                        r12.minBound = fE8.floatValue();
                        Float fM7 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                        kotlin.jvm.internal.f0.m(fM7);
                        r12.maxBound = fM7.floatValue();
                    } catch (CancellationException unused2) {
                        swipeableState$processNewAnchors$1.f11099b = r11;
                        swipeableState$processNewAnchors$1.f11100c = map2;
                        swipeableState$processNewAnchors$1.f11101d = fFloatValue;
                        swipeableState$processNewAnchors$1.f11104g = 3;
                        if (r11.Q(fFloatValue, swipeableState$processNewAnchors$1) == objH) {
                            return objH;
                        }
                        r13 = r11;
                        r13.K(kotlin.collections.s0.K(map2, kotlin.coroutines.jvm.internal.a.e(fFloatValue)));
                        Float fE9 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                        kotlin.jvm.internal.f0.m(fE9);
                        r13.minBound = fE9.floatValue();
                        Float fM8 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                        kotlin.jvm.internal.f0.m(fM8);
                        r13.maxBound = fM8.floatValue();
                        return kotlin.b2.f124493a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r10 = r11;
                    r10.K(kotlin.collections.s0.K(map2, kotlin.coroutines.jvm.internal.a.e(fFloatValue)));
                    Float fE10 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                    kotlin.jvm.internal.f0.m(fE10);
                    r10.minBound = fE10.floatValue();
                    Float fM9 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                    kotlin.jvm.internal.f0.m(fM9);
                    r10.maxBound = fM9.floatValue();
                    throw th;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fFloatValue = swipeableState$processNewAnchors$1.f11101d;
                map2 = (Map) swipeableState$processNewAnchors$1.f11100c;
                r10 = (SwipeableState) swipeableState$processNewAnchors$1.f11099b;
                try {
                    kotlin.t0.n(obj);
                    r13 = r10;
                    r13.K(kotlin.collections.s0.K(map2, kotlin.coroutines.jvm.internal.a.e(fFloatValue)));
                    Float fE11 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                    kotlin.jvm.internal.f0.m(fE11);
                    r13.minBound = fE11.floatValue();
                    Float fM10 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                    kotlin.jvm.internal.f0.m(fM10);
                    r13.maxBound = fM10.floatValue();
                } catch (Throwable th4) {
                    th = th4;
                    r10.K(kotlin.collections.s0.K(map2, kotlin.coroutines.jvm.internal.a.e(fFloatValue)));
                    Float fE12 = CollectionsKt___CollectionsKt.e4(map2.keySet());
                    kotlin.jvm.internal.f0.m(fE12);
                    r10.minBound = fE12.floatValue();
                    Float fM11 = CollectionsKt___CollectionsKt.M3(map2.keySet());
                    kotlin.jvm.internal.f0.m(fM11);
                    r10.maxBound = fM11.floatValue();
                    throw th;
                }
            }
        }
        return kotlin.b2.f124493a;
    }

    public final void I(@dl.d Map<Float, ? extends T> map) {
        kotlin.jvm.internal.f0.p(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final void L(float f10) {
        this.maxBound = f10;
    }

    public final void M(float f10) {
        this.minBound = f10;
    }

    public final void N(@dl.e ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    public final void O(@dl.d yh.p<? super Float, ? super Float, Float> pVar) {
        kotlin.jvm.internal.f0.p(pVar, "<set-?>");
        this.thresholds.setValue(pVar);
    }

    public final void P(float f10) {
        this.velocityThreshold.setValue(Float.valueOf(f10));
    }

    @w
    @dl.e
    public final Object R(T t10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objA = this.latestNonEmptyAnchorsFlow.a(new SwipeableState$snapTo$2(t10, this), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
    }

    @w
    @dl.e
    public final Object j(T t10, @dl.d androidx.compose.animation.core.h<Float> hVar, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objA = this.latestNonEmptyAnchorsFlow.a(new SwipeableState$animateTo$2(t10, this, hVar), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
    }

    public final void l(@dl.d Map<Float, ? extends T> newAnchors) {
        kotlin.jvm.internal.f0.p(newAnchors, "newAnchors");
        if (m().isEmpty()) {
            Float f10 = SwipeableKt.f(newAnchors, p());
            if (f10 == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.offsetState.setValue(f10);
            this.absoluteOffset.setValue(f10);
        }
    }

    @dl.d
    public final Map<Float, T> m() {
        return (Map) this.anchors.getValue();
    }

    @dl.d
    public final androidx.compose.animation.core.h<Float> n() {
        return this.animationSpec;
    }

    @dl.d
    public final yh.l<T, Boolean> o() {
        return this.f11061b;
    }

    public final T p() {
        return this.currentValue.getValue();
    }

    public final float q() {
        Float f10 = SwipeableKt.f(m(), p());
        if (f10 == null) {
            return 0.0f;
        }
        return Math.signum(v().getValue().floatValue() - f10.floatValue());
    }

    @dl.d
    /* JADX INFO: renamed from: s, reason: from getter */
    public final androidx.compose.foundation.gestures.f getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    @dl.d
    public final m2<Float> v() {
        return this.offsetState;
    }

    @dl.d
    public final m2<Float> w() {
        return this.overflowState;
    }

    @dl.d
    public final SwipeProgress<T> x() {
        Object objP;
        Object objK;
        float fFloatValue;
        List listE = SwipeableKt.e(v().getValue().floatValue(), m().keySet());
        int size = listE.size();
        if (size == 0) {
            T tP = p();
            objP = p();
            objK = tP;
            fFloatValue = 1.0f;
        } else if (size != 1) {
            Pair pairA = q() > 0.0f ? kotlin.c1.a(listE.get(0), listE.get(1)) : kotlin.c1.a(listE.get(1), listE.get(0));
            float fFloatValue2 = ((Number) pairA.a()).floatValue();
            float fFloatValue3 = ((Number) pairA.b()).floatValue();
            objK = kotlin.collections.s0.K(m(), Float.valueOf(fFloatValue2));
            objP = kotlin.collections.s0.K(m(), Float.valueOf(fFloatValue3));
            fFloatValue = (v().getValue().floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        } else {
            Object objK2 = kotlin.collections.s0.K(m(), listE.get(0));
            objP = kotlin.collections.s0.K(m(), listE.get(0));
            fFloatValue = 1.0f;
            objK = objK2;
        }
        return new SwipeProgress<>(objK, objP, fFloatValue);
    }

    @dl.e
    public final ResistanceConfig z() {
        return (ResistanceConfig) this.resistance.getValue();
    }
}

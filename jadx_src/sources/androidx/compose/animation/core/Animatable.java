package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010a\u001a\u00028\u0000\u0012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u00106\u001a\u000201¢\u0006\u0004\bb\u0010cB1\b\u0017\u0012\u0006\u0010a\u001a\u00028\u0000\u0012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bb\u0010dJ\u001b\u0010\u0007\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJb\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u000b\u001a\u00028\u00002%\u0010\u000f\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0002J%\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0018\u0010\u0019Jj\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u001a\u001a\u00028\u00002\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u000b\u001a\u00028\u00002'\b\u0002\u0010\u000f\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ^\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2'\b\u0002\u0010\u000f\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R+\u0010E\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR+\u0010\u001a\u001a\u00028\u00002\u0006\u0010>\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010@\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\u0010>\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010/\u001a\u0004\bK\u0010GR(\u0010\u0017\u001a\u0004\u0018\u00018\u00002\b\u0010>\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\bL\u0010GR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010VR\u0014\u0010X\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0016\u0010Y\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010VR\u0016\u0010Z\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010VR\u0011\u0010\u0006\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b[\u0010GR\u0011\u0010^\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010`\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b_\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, d2 = {"Landroidx/compose/animation/core/Animatable;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "", "", "value", "l", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/p;", "Landroidx/compose/animation/core/d;", "animation", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/b2;", "Lkotlin/t;", "block", "Landroidx/compose/animation/core/f;", "y", "(Landroidx/compose/animation/core/d;Ljava/lang/Object;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "m", "lowerBound", "upperBound", "D", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/h;", "animationSpec", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;Landroidx/compose/animation/core/h;Ljava/lang/Object;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/x;", "f", "(Ljava/lang/Object;Landroidx/compose/animation/core/x;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "B", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "C", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/m2;", "j", "Landroidx/compose/animation/core/f1;", ak.av, "Landroidx/compose/animation/core/f1;", ak.aB, "()Landroidx/compose/animation/core/f1;", "typeConverter", "b", "Ljava/lang/Object;", "visibilityThreshold", "", ak.aF, "Ljava/lang/String;", "p", "()Ljava/lang/String;", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Landroidx/compose/animation/core/j;", "d", "Landroidx/compose/animation/core/j;", "o", "()Landroidx/compose/animation/core/j;", "internalState", "", "<set-?>", "e", "Landroidx/compose/runtime/a1;", "x", "()Z", ak.aD, "(Z)V", "isRunning", "r", "()Ljava/lang/Object;", androidx.exifinterface.media.a.W4, "(Ljava/lang/Object;)V", "g", "q", "t", "Landroidx/compose/animation/core/MutatorMutex;", "i", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/z0;", "Landroidx/compose/animation/core/z0;", "n", "()Landroidx/compose/animation/core/z0;", "defaultSpringSpec", "Landroidx/compose/animation/core/p;", "negativeInfinityBounds", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", ak.aG, RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/animation/core/p;", "velocityVector", "v", "velocity", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/f1;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/f1;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class Animatable<T, V extends p> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f4099o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final T visibilityThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AnimationState<T, V> internalState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 isRunning;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 targetValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private T lowerBound;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private T upperBound;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z0<T> defaultSpringSpec;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V negativeInfinityBounds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V positiveInfinityBounds;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private V lowerBoundVector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private V upperBoundVector;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @kotlin.s0(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object obj, f1 typeConverter, Object obj2) {
        this(obj, typeConverter, obj2, "Animatable");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
    }

    public /* synthetic */ Animatable(Object obj, f1 f1Var, Object obj2, int i10, kotlin.jvm.internal.u uVar) {
        this(obj, f1Var, (i10 & 4) != 0 ? null : obj2);
    }

    public Animatable(T t10, @dl.d f1<T, V> typeConverter, @dl.e T t11, @dl.d String label) {
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        kotlin.jvm.internal.f0.p(label, "label");
        this.typeConverter = typeConverter;
        this.visibilityThreshold = t11;
        this.label = label;
        this.internalState = new AnimationState<>(typeConverter, t10, null, 0L, 0L, false, 60, null);
        this.isRunning = h2.g(Boolean.FALSE, null, 2, null);
        this.targetValue = h2.g(t10, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new z0<>(0.0f, 0.0f, t11, 3, null);
        V v10 = (V) l(t10, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = v10;
        V v11 = (V) l(t10, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = v11;
        this.lowerBoundVector = v10;
        this.upperBoundVector = v11;
    }

    public /* synthetic */ Animatable(Object obj, f1 f1Var, Object obj2, String str, int i10, kotlin.jvm.internal.u uVar) {
        this(obj, f1Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(T t10) {
        this.targetValue.setValue(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void E(Animatable animatable, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i10 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.D(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object g(Animatable animatable, Object obj, x xVar, yh.l lVar, kotlin.coroutines.c cVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        return animatable.f(obj, xVar, lVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object i(Animatable animatable, Object obj, h hVar, Object obj2, yh.l lVar, kotlin.coroutines.c cVar, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            hVar = animatable.defaultSpringSpec;
        }
        h hVar2 = hVar;
        if ((i10 & 4) != 0) {
            obj2 = animatable.v();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return animatable.h(obj, hVar2, obj4, lVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T k(T value) {
        if (kotlin.jvm.internal.f0.g(this.lowerBoundVector, this.negativeInfinityBounds) && kotlin.jvm.internal.f0.g(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vInvoke = this.typeConverter.a().invoke(value);
        int i10 = vInvoke.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            if (vInvoke.a(i11) < this.lowerBoundVector.a(i11) || vInvoke.a(i11) > this.upperBoundVector.a(i11)) {
                vInvoke.e(i11, fi.u.H(vInvoke.a(i11), this.lowerBoundVector.a(i11), this.upperBoundVector.a(i11)));
                z10 = true;
            }
        }
        return z10 ? this.typeConverter.b().invoke(vInvoke) : value;
    }

    private final V l(T t10, float f10) {
        V vInvoke = this.typeConverter.a().invoke(t10);
        int i10 = vInvoke.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            vInvoke.e(i11, f10);
        }
        return vInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        AnimationState<T, V> jVar = this.internalState;
        jVar.i().d();
        jVar.m(Long.MIN_VALUE);
        z(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(d<T, V> dVar, T t10, yh.l<? super Animatable<T, V>, b2> lVar, kotlin.coroutines.c<? super AnimationResult<T, V>> cVar) {
        return MutatorMutex.e(this.mutatorMutex, null, new Animatable$runAnimation$2(this, t10, dVar, this.internalState.getLastFrameTimeNanos(), lVar, null), cVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    @dl.e
    public final Object B(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objE = MutatorMutex.e(this.mutatorMutex, null, new Animatable$snapTo$2(this, t10, null), cVar, 1, null);
        return objE == kotlin.coroutines.intrinsics.b.h() ? objE : b2.f124493a;
    }

    @dl.e
    public final Object C(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objE = MutatorMutex.e(this.mutatorMutex, null, new Animatable$stop$2(this, null), cVar, 1, null);
        return objE == kotlin.coroutines.intrinsics.b.h() ? objE : b2.f124493a;
    }

    public final void D(@dl.e T lowerBound, @dl.e T upperBound) {
        V vInvoke;
        V vInvoke2;
        if (lowerBound == null || (vInvoke = this.typeConverter.a().invoke(lowerBound)) == null) {
            vInvoke = this.negativeInfinityBounds;
        }
        if (upperBound == null || (vInvoke2 = this.typeConverter.a().invoke(upperBound)) == null) {
            vInvoke2 = this.positiveInfinityBounds;
        }
        int i10 = vInvoke.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            if (!(vInvoke.a(i11) <= vInvoke2.a(i11))) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i11).toString());
            }
        }
        this.lowerBoundVector = vInvoke;
        this.upperBoundVector = vInvoke2;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (x()) {
            return;
        }
        T tK = k(u());
        if (kotlin.jvm.internal.f0.g(tK, u())) {
            return;
        }
        this.internalState.q(tK);
    }

    @dl.e
    public final Object f(T t10, @dl.d x<T> xVar, @dl.e yh.l<? super Animatable<T, V>, b2> lVar, @dl.d kotlin.coroutines.c<? super AnimationResult<T, V>> cVar) {
        return y(new w((x) xVar, (f1) this.typeConverter, (Object) u(), (p) this.typeConverter.a().invoke(t10)), t10, lVar, cVar);
    }

    @dl.e
    public final Object h(T t10, @dl.d h<T> hVar, T t11, @dl.e yh.l<? super Animatable<T, V>, b2> lVar, @dl.d kotlin.coroutines.c<? super AnimationResult<T, V>> cVar) {
        return y(AnimationKt.c(hVar, this.typeConverter, u(), t10, t11), t11, lVar, cVar);
    }

    @dl.d
    public final m2<T> j() {
        return this.internalState;
    }

    @dl.d
    public final z0<T> n() {
        return this.defaultSpringSpec;
    }

    @dl.d
    public final AnimationState<T, V> o() {
        return this.internalState;
    }

    @dl.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @dl.e
    public final T q() {
        return this.lowerBound;
    }

    public final T r() {
        return this.targetValue.getValue();
    }

    @dl.d
    public final f1<T, V> s() {
        return this.typeConverter;
    }

    @dl.e
    public final T t() {
        return this.upperBound;
    }

    public final T u() {
        return this.internalState.getValue();
    }

    public final T v() {
        return (T) this.typeConverter.b().invoke(w());
    }

    @dl.d
    public final V w() {
        return (V) this.internalState.i();
    }

    public final boolean x() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }
}

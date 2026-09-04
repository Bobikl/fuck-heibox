package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010 \u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0016\u0010!\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/compose/animation/core/s1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/m1;", "value", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/animation/core/p;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "d", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/b0;", ak.av, "Ljava/util/Map;", "keyframes", "b", "I", "g", "()I", "durationMillis", ak.aF, "f", "delayMillis", "Landroidx/compose/animation/core/p;", "valueVector", "velocityVector", "<init>", "(Ljava/util/Map;II)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class s1<V extends p> implements m1<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4508f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Integer, Pair<V, b0>> keyframes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX WARN: Multi-variable type inference failed */
    public s1(@dl.d Map<Integer, ? extends Pair<? extends V, ? extends b0>> keyframes, int i10, int i11) {
        kotlin.jvm.internal.f0.p(keyframes, "keyframes");
        this.keyframes = keyframes;
        this.durationMillis = i10;
        this.delayMillis = i11;
    }

    public /* synthetic */ s1(Map map, int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(map, i10, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void h(V value) {
        if (this.valueVector == null) {
            this.valueVector = (V) q.g(value);
            this.velocityVector = (V) q.g(value);
        }
    }

    @Override // androidx.compose.animation.core.o1, androidx.compose.animation.core.i1
    public /* synthetic */ boolean a() {
        return n1.a(this);
    }

    @Override // androidx.compose.animation.core.m1, androidx.compose.animation.core.i1
    public /* synthetic */ long b(p pVar, p pVar2, p pVar3) {
        return l1.a(this, pVar, pVar2, pVar3);
    }

    @Override // androidx.compose.animation.core.i1
    public /* synthetic */ p c(p pVar, p pVar2, p pVar3) {
        return h1.a(this, pVar, pVar2, pVar3);
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V d(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        long jC = j1.c(this, playTimeNanos / 1000000);
        if (jC <= 0) {
            return initialVelocity;
        }
        p pVarF = j1.f(this, jC - 1, initialValue, targetValue, initialVelocity);
        p pVarF2 = j1.f(this, jC, initialValue, targetValue, initialVelocity);
        h(initialValue);
        int i10 = 0;
        int i11 = pVarF.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        while (true) {
            V v10 = null;
            if (i10 >= i11) {
                break;
            }
            V v11 = this.velocityVector;
            if (v11 == null) {
                kotlin.jvm.internal.f0.S("velocityVector");
            } else {
                v10 = v11;
            }
            v10.e(i10, (pVarF.a(i10) - pVarF2.a(i10)) * 1000.0f);
            i10++;
        }
        V v12 = this.velocityVector;
        if (v12 != null) {
            return v12;
        }
        kotlin.jvm.internal.f0.S("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V e(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        int iC = (int) j1.c(this, playTimeNanos / 1000000);
        if (this.keyframes.containsKey(Integer.valueOf(iC))) {
            return (V) ((Pair) kotlin.collections.s0.K(this.keyframes, Integer.valueOf(iC))).e();
        }
        if (iC >= getDurationMillis()) {
            return targetValue;
        }
        if (iC <= 0) {
            return initialValue;
        }
        int durationMillis = getDurationMillis();
        b0 b0VarC = d0.c();
        int i10 = 0;
        V vE = initialValue;
        int i11 = 0;
        for (Map.Entry<Integer, Pair<V, b0>> entry : this.keyframes.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<V, b0> value = entry.getValue();
            if (iC > iIntValue && iIntValue >= i11) {
                vE = value.e();
                b0VarC = value.f();
                i11 = iIntValue;
            } else if (iC < iIntValue && iIntValue <= durationMillis) {
                targetValue = value.e();
                durationMillis = iIntValue;
            }
        }
        float fA = b0VarC.a((iC - i11) / (durationMillis - i11));
        h(initialValue);
        int i12 = vE.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        while (true) {
            V v10 = null;
            if (i10 >= i12) {
                break;
            }
            V v11 = this.valueVector;
            if (v11 == null) {
                kotlin.jvm.internal.f0.S("valueVector");
            } else {
                v10 = v11;
            }
            v10.e(i10, VectorConvertersKt.k(vE.a(i10), targetValue.a(i10), fA));
            i10++;
        }
        V v12 = this.valueVector;
        if (v12 != null) {
            return v12;
        }
        kotlin.jvm.internal.f0.S("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.m1
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.m1
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }
}

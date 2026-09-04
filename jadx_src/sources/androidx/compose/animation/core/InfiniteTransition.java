package androidx.compose.animation.core;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fR,\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u00000\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR+\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001a¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "", "playTimeNanos", "Lkotlin/b2;", "i", "Landroidx/compose/animation/core/InfiniteTransition$a;", "animation", "e", "(Landroidx/compose/animation/core/InfiniteTransition$a;)V", "j", "k", "(Landroidx/compose/runtime/p;I)V", "Landroidx/compose/runtime/collection/e;", ak.av, "Landroidx/compose/runtime/collection/e;", "f", "()Landroidx/compose/runtime/collection/e;", "animations", "", "<set-?>", "b", "Landroidx/compose/runtime/a1;", "g", "()Z", "l", "(Z)V", "refreshChildNeeded", ak.aF, "J", "startTimeNanos", "d", RXScreenCaptureService.KEY_HEIGHT, "m", "isRunning", "<init>", "()V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class InfiniteTransition {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4159e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<a<?, ?>> animations = new androidx.compose.runtime.collection.e<>(new a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 refreshChildNeeded = h2.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long startTimeNanos = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 isRunning = h2.g(Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: InfiniteTransition.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\bA\u0010BJ+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tR\"\u0010\u0005\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R+\u0010*\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R.\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\b\u0017\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010;\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010@\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010<\u001a\u0004\b2\u0010=\"\u0004\b>\u0010?¨\u0006C"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/m2;", "initialValue", "targetValue", "Landroidx/compose/animation/core/h;", "animationSpec", "Lkotlin/b2;", androidx.exifinterface.media.a.W4, "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/h;)V", "", "playTimeNanos", "p", ak.aD, "q", "b", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", ak.aG, "(Ljava/lang/Object;)V", ak.aF, "j", "x", "Landroidx/compose/animation/core/f1;", "d", "Landroidx/compose/animation/core/f1;", "l", "()Landroidx/compose/animation/core/f1;", "typeConverter", "e", "Landroidx/compose/animation/core/h;", "()Landroidx/compose/animation/core/h;", ak.aB, "(Landroidx/compose/animation/core/h;)V", "<set-?>", "f", "Landroidx/compose/runtime/a1;", "getValue", "y", "value", "Landroidx/compose/animation/core/c1;", "Landroidx/compose/animation/core/c1;", "()Landroidx/compose/animation/core/c1;", "r", "(Landroidx/compose/animation/core/c1;)V", "animation", "", RXScreenCaptureService.KEY_HEIGHT, "Z", "m", "()Z", "t", "(Z)V", "isFinished", "i", RXScreenCaptureService.KEY_WIDTH, "startOnTheNextFrame", "J", "()J", "v", "(J)V", "playTimeNanosOffset", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/f1;Landroidx/compose/animation/core/h;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    public final class a<T, V extends p> implements m2<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T initialValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private T targetValue;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final f1<T, V> typeConverter;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private h<T> animationSpec;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.a1 value;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private c1<T, V> animation;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean startOnTheNextFrame;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long playTimeNanosOffset;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ InfiniteTransition f4173k;

        public a(InfiniteTransition infiniteTransition, T t10, @dl.d T t11, @dl.d f1<T, V> typeConverter, h<T> animationSpec) {
            kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
            kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
            this.f4173k = infiniteTransition;
            this.initialValue = t10;
            this.targetValue = t11;
            this.typeConverter = typeConverter;
            this.animationSpec = animationSpec;
            this.value = h2.g(t10, null, 2, null);
            this.animation = new c1<>(this.animationSpec, typeConverter, this.initialValue, this.targetValue, (p) null, 16, (kotlin.jvm.internal.u) null);
        }

        public final void A(T initialValue, T targetValue, @dl.d h<T> animationSpec) {
            kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new c1<>(animationSpec, this.typeConverter, initialValue, targetValue, (p) null, 16, (kotlin.jvm.internal.u) null);
            this.f4173k.l(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        @dl.d
        public final c1<T, V> c() {
            return this.animation;
        }

        @dl.d
        public final h<T> e() {
            return this.animationSpec;
        }

        public final T g() {
            return this.initialValue;
        }

        @Override // androidx.compose.runtime.m2
        public T getValue() {
            return this.value.getValue();
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final long getPlayTimeNanosOffset() {
            return this.playTimeNanosOffset;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getStartOnTheNextFrame() {
            return this.startOnTheNextFrame;
        }

        public final T j() {
            return this.targetValue;
        }

        @dl.d
        public final f1<T, V> l() {
            return this.typeConverter;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void p(long j10) {
            this.f4173k.l(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j10;
            }
            long j11 = j10 - this.playTimeNanosOffset;
            y(this.animation.e(j11));
            this.isFinished = this.animation.b(j11);
        }

        public final void q() {
            this.startOnTheNextFrame = true;
        }

        public final void r(@dl.d c1<T, V> c1Var) {
            kotlin.jvm.internal.f0.p(c1Var, "<set-?>");
            this.animation = c1Var;
        }

        public final void s(@dl.d h<T> hVar) {
            kotlin.jvm.internal.f0.p(hVar, "<set-?>");
            this.animationSpec = hVar;
        }

        public final void t(boolean z10) {
            this.isFinished = z10;
        }

        public final void u(T t10) {
            this.initialValue = t10;
        }

        public final void v(long j10) {
            this.playTimeNanosOffset = j10;
        }

        public final void w(boolean z10) {
            this.startOnTheNextFrame = z10;
        }

        public final void x(T t10) {
            this.targetValue = t10;
        }

        public void y(T t10) {
            this.value.setValue(t10);
        }

        public final void z() {
            y(this.animation.f());
            this.startOnTheNextFrame = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean g() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j10) {
        boolean z10;
        androidx.compose.runtime.collection.e<a<?, ?>> eVar = this.animations;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            a<?, ?>[] aVarArrG = eVar.G();
            z10 = true;
            int i11 = 0;
            do {
                a<?, ?> aVar = aVarArrG[i11];
                if (!aVar.getIsFinished()) {
                    aVar.p(j10);
                }
                if (!aVar.getIsFinished()) {
                    z10 = false;
                }
                i11++;
            } while (i11 < i10);
        } else {
            z10 = true;
        }
        m(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z10) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    public final void e(@dl.d a<?, ?> animation) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        this.animations.b(animation);
        l(true);
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<a<?, ?>> f() {
        return this.animations;
    }

    public final void j(@dl.d a<?, ?> animation) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        this.animations.c0(animation);
    }

    @androidx.compose.runtime.h
    public final void k(@dl.e androidx.compose.runtime.p pVar, final int i10) {
        androidx.compose.runtime.p pVarF = pVar.F(-318043801);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-318043801, i10, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:140)");
        }
        if (h() || g()) {
            EffectsKt.h(this, new InfiniteTransition$run$1(this, null), pVarF, 72);
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                this.f4184b.k(pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}

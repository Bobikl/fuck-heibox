package androidx.compose.animation.core;

import androidx.compose.runtime.m2;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", i = {0}, l = {bb.c.b.f30533b5}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
public final class AnimateAsStateKt$animateValueAsState$3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f4143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.channels.k<T> f4144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Animatable<T, V> f4145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ m2<h<T>> f4146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ m2<yh.l<T, b2>> f4147h;

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnimateAsState.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {}, l = {bb.c.b.f30741k5}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f4149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Animatable<T, V> f4150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m2<h<T>> f4151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m2<yh.l<T, b2>> f4152f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(T t10, Animatable<T, V> animatable, m2<? extends h<T>> m2Var, m2<? extends yh.l<? super T, b2>> m2Var2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f4149c = t10;
            this.f4150d = animatable;
            this.f4151e = m2Var;
            this.f4152f = m2Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f4149c, this.f4150d, this.f4151e, this.f4152f, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f4148b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                if (!kotlin.jvm.internal.f0.g(this.f4149c, this.f4150d.r())) {
                    Animatable<T, V> animatable = this.f4150d;
                    T t10 = this.f4149c;
                    h hVarV = AnimateAsStateKt.v(this.f4151e);
                    this.f4148b = 1;
                    if (Animatable.i(animatable, t10, hVarV, null, null, this, 12, null) == objH) {
                        return objH;
                    }
                }
                return b2.f124493a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            yh.l lVarU = AnimateAsStateKt.u(this.f4152f);
            if (lVarU != null) {
                lVarU.invoke(this.f4150d.u());
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimateAsStateKt$animateValueAsState$3(kotlinx.coroutines.channels.k<T> kVar, Animatable<T, V> animatable, m2<? extends h<T>> m2Var, m2<? extends yh.l<? super T, b2>> m2Var2, kotlin.coroutines.c<? super AnimateAsStateKt$animateValueAsState$3> cVar) {
        super(2, cVar);
        this.f4144e = kVar;
        this.f4145f = animatable;
        this.f4146g = m2Var;
        this.f4147h = m2Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.f4144e, this.f4145f, this.f4146g, this.f4147h, cVar);
        animateAsStateKt$animateValueAsState$3.f4143d = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:12:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0043
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f4142c
            r3 = 1
            if (r2 == 0) goto L24
            if (r2 != r3) goto L1c
            java.lang.Object r2 = r0.f4141b
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.f4143d
            kotlinx.coroutines.q0 r4 = (kotlinx.coroutines.q0) r4
            kotlin.t0.n(r18)
            r6 = r18
            r5 = r0
            goto L44
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            kotlin.t0.n(r18)
            java.lang.Object r2 = r0.f4143d
            kotlinx.coroutines.q0 r2 = (kotlinx.coroutines.q0) r2
            kotlinx.coroutines.channels.k<T> r4 = r0.f4144e
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L37:
            r5.f4143d = r4
            r5.f4141b = r2
            r5.f4142c = r3
            java.lang.Object r6 = r2.b(r5)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r2.next()
            kotlinx.coroutines.channels.k<T> r7 = r5.f4144e
            java.lang.Object r7 = r7.E()
            java.lang.Object r7 = kotlinx.coroutines.channels.n.h(r7)
            if (r7 != 0) goto L5e
            r9 = r6
            goto L5f
        L5e:
            r9 = r7
        L5f:
            r6 = 0
            r14 = 0
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r15 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable<T, V> r10 = r5.f4145f
            androidx.compose.runtime.m2<androidx.compose.animation.core.h<T>> r11 = r5.f4146g
            androidx.compose.runtime.m2<yh.l<T, kotlin.b2>> r12 = r5.f4147h
            r13 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r7 = r4
            r8 = r6
            r9 = r14
            r10 = r15
            kotlinx.coroutines.i.e(r7, r8, r9, r10, r11, r12)
            goto L37
        L78:
            kotlin.b2 r1 = kotlin.b2.f124493a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

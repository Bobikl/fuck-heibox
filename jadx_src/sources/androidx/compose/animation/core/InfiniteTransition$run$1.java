package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {147, 169}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class InfiniteTransition$run$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f4176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ InfiniteTransition f4177e;

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: InfiniteTransition.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements yh.p<Float, kotlin.coroutines.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ float f4183c;

        AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @dl.e
        public final Object a(float f10, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(Float.valueOf(f10), cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
            anonymousClass3.f4183c = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(Float f10, kotlin.coroutines.c<? super Boolean> cVar) {
            return a(f10.floatValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f4182b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            return kotlin.coroutines.jvm.internal.a.a(this.f4183c > 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1(InfiniteTransition infiniteTransition, kotlin.coroutines.c<? super InfiniteTransition$run$1> cVar) {
        super(2, cVar);
        this.f4177e = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.f4177e, cVar);
        infiniteTransition$run$1.f4176d = obj;
        return infiniteTransition$run$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((InfiniteTransition$run$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007b -> B:12:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x0055
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r8.f4175c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r8.f4174b
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r8.f4176d
            kotlinx.coroutines.q0 r4 = (kotlinx.coroutines.q0) r4
            kotlin.t0.n(r9)
            r9 = r4
            goto L41
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r1 = r8.f4174b
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r4 = r8.f4176d
            kotlinx.coroutines.q0 r4 = (kotlinx.coroutines.q0) r4
            kotlin.t0.n(r9)
            r9 = r4
            r4 = r8
            goto L56
        L31:
            kotlin.t0.n(r9)
            java.lang.Object r9 = r8.f4176d
            kotlinx.coroutines.q0 r9 = (kotlinx.coroutines.q0) r9
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f124888b = r4
        L41:
            r4 = r8
        L42:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            androidx.compose.animation.core.InfiniteTransition r6 = r4.f4177e
            r5.<init>()
            r4.f4176d = r9
            r4.f4174b = r1
            r4.f4175c = r3
            java.lang.Object r5 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.c(r5, r4)
            if (r5 != r0) goto L56
            return r0
        L56:
            float r5 = r1.f124888b
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L5f
            r5 = r3
            goto L60
        L5f:
            r5 = 0
        L60:
            if (r5 == 0) goto L42
            androidx.compose.animation.core.InfiniteTransition$run$1$2 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$2
            r5.<init>()
            kotlinx.coroutines.flow.e r5 = androidx.compose.runtime.e2.v(r5)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r6 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r7 = 0
            r6.<init>(r7)
            r4.f4176d = r9
            r4.f4174b = r1
            r4.f4175c = r2
            java.lang.Object r5 = kotlinx.coroutines.flow.g.u0(r5, r6, r4)
            if (r5 != r0) goto L42
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

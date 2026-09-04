package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f129442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.r f129443c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {117, 119}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f129445c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f129450h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f129451i;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129444b = obj;
            this.f129445c |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(e eVar, yh.r rVar) {
        this.f129442b = eVar;
        this.f129443c = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:31:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0098 -> B:27:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public java.lang.Object a(@dl.d kotlinx.coroutines.flow.f<? super T> r13, @dl.d kotlin.coroutines.c<? super kotlin.b2> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.f129445c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129445c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f129444b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f129445c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            long r5 = r0.f129450h
            java.lang.Object r13 = r0.f129449g
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r2 = r0.f129448f
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.f) r2
            java.lang.Object r7 = r0.f129447e
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.t0.n(r14)
            goto L9b
        L3a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L42:
            int r13 = r0.f129451i
            long r5 = r0.f129450h
            java.lang.Object r2 = r0.f129448f
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.f) r2
            java.lang.Object r7 = r0.f129447e
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.t0.n(r14)
            goto L75
        L52:
            kotlin.t0.n(r14)
            r5 = 0
            r14 = r12
        L58:
            r2 = 0
            kotlinx.coroutines.flow.e r7 = r14.f129442b
            r0.f129447e = r14
            r0.f129448f = r13
            r8 = 0
            r0.f129449g = r8
            r0.f129450h = r5
            r0.f129451i = r2
            r0.f129445c = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.g.v(r7, r13, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r10 = r2
            r2 = r13
            r13 = r10
            r11 = r7
            r7 = r14
            r14 = r11
        L75:
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            if (r14 == 0) goto La9
            yh.r r13 = r7.f129443c
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.a.g(r5)
            r0.f129447e = r7
            r0.f129448f = r2
            r0.f129449g = r14
            r0.f129450h = r5
            r0.f129445c = r3
            r9 = 6
            kotlin.jvm.internal.c0.e(r9)
            java.lang.Object r13 = r13.U0(r2, r14, r8, r0)
            r8 = 7
            kotlin.jvm.internal.c0.e(r8)
            if (r13 != r1) goto L98
            return r1
        L98:
            r10 = r14
            r14 = r13
            r13 = r10
        L9b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto La8
            r13 = 1
            long r5 = r5 + r13
            r13 = r4
            goto La9
        La8:
            throw r13
        La9:
            r14 = r7
            if (r13 != 0) goto Laf
            kotlin.b2 r13 = kotlin.b2.f124493a
            return r13
        Laf:
            r13 = r2
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }
}

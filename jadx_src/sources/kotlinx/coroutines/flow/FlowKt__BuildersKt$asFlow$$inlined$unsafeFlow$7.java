package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 implements e<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f129252b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d13", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f129254c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f129258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f129259h;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f129253b = obj;
            this.f129254c |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.this.a(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(int[] iArr) {
        this.f129252b = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public java.lang.Object a(@dl.d kotlinx.coroutines.flow.f<? super java.lang.Integer> r8, @dl.d kotlin.coroutines.c<? super kotlin.b2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.AnonymousClass1) r0
            int r1 = r0.f129254c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129254c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f129253b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f129254c
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f129259h
            int r2 = r0.f129258g
            java.lang.Object r4 = r0.f129257f
            int[] r4 = (int[]) r4
            java.lang.Object r5 = r0.f129256e
            kotlinx.coroutines.flow.f r5 = (kotlinx.coroutines.flow.f) r5
            kotlin.t0.n(r9)
            r9 = r5
            goto L62
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.t0.n(r9)
            int[] r9 = r7.f129252b
            r2 = 0
            int r4 = r9.length
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L49:
            if (r2 >= r8) goto L64
            r5 = r4[r2]
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.f(r5)
            r0.f129256e = r9
            r0.f129257f = r4
            r0.f129258g = r2
            r0.f129259h = r8
            r0.f129254c = r3
            java.lang.Object r5 = r9.emit(r5, r0)
            if (r5 != r1) goto L62
            return r1
        L62:
            int r2 = r2 + r3
            goto L49
        L64:
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.a(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }
}

package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n267#2,4:1101\n237#2,7:1105\n248#2,3:1113\n251#2,2:1117\n272#2,2:1119\n254#2,6:1121\n274#2:1127\n1826#3:1112\n1688#3:1116\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n*L\n494#1:1101,4\n494#1:1105,7\n494#1:1113,3\n494#1:1117,2\n494#1:1119,2\n494#1:1121,6\n494#1:1127\n494#1:1112\n494#1:1116\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "androidx.collection.ScatterSet$SetWrapper$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {bb.c.b.B6}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class ScatterSet$SetWrapper$iterator$1<E> extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super E>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f3531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f3532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f3536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f3537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f3538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private /* synthetic */ Object f3539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ ScatterSet<E> f3540l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScatterSet$SetWrapper$iterator$1(ScatterSet<E> scatterSet, kotlin.coroutines.c<? super ScatterSet$SetWrapper$iterator$1> cVar) {
        super(2, cVar);
        this.f3540l = scatterSet;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super E> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ScatterSet$SetWrapper$iterator$1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ScatterSet$SetWrapper$iterator$1 scatterSet$SetWrapper$iterator$1 = new ScatterSet$SetWrapper$iterator$1(this.f3540l, cVar);
        scatterSet$SetWrapper$iterator$1.f3539k = obj;
        return scatterSet$SetWrapper$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:28:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009a -> B:24:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f3538j
            r3 = 8
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            int r2 = r0.f3536h
            int r6 = r0.f3535g
            long r7 = r0.f3537i
            int r9 = r0.f3534f
            int r10 = r0.f3533e
            java.lang.Object r11 = r0.f3532d
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f3531c
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.f3539k
            kotlin.sequences.o r13 = (kotlin.sequences.o) r13
            kotlin.t0.n(r22)
            r14 = r13
            r13 = r12
            r12 = r0
            goto L9f
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.t0.n(r22)
            java.lang.Object r2 = r0.f3539k
            kotlin.sequences.o r2 = (kotlin.sequences.o) r2
            androidx.collection.ScatterSet<E> r6 = r0.f3540l
            java.lang.Object[] r7 = r6.f3527b
            long[] r6 = r6.f3526a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lb3
            r10 = r0
            r9 = r4
        L4a:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto Lae
            int r13 = r9 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r4
            r19 = r11
            r12 = r6
            r11 = r10
            r6 = r13
            r13 = r7
            r10 = r8
            r7 = r19
        L6c:
            if (r2 >= r6) goto La7
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L79
            r15 = r5
            goto L7a
        L79:
            r15 = r4
        L7a:
            if (r15 == 0) goto La4
            int r15 = r9 << 3
            int r15 = r15 + r2
            r15 = r13[r15]
            r11.f3539k = r14
            r11.f3531c = r13
            r11.f3532d = r12
            r11.f3533e = r10
            r11.f3534f = r9
            r11.f3537i = r7
            r11.f3535g = r6
            r11.f3536h = r2
            r11.f3538j = r5
            java.lang.Object r15 = r14.a(r15, r11)
            if (r15 != r1) goto L9a
            return r1
        L9a:
            r19 = r12
            r12 = r11
            r11 = r19
        L9f:
            r19 = r12
            r12 = r11
            r11 = r19
        La4:
            long r7 = r7 >> r3
            int r2 = r2 + r5
            goto L6c
        La7:
            if (r6 != r3) goto Lb3
            r8 = r10
            r10 = r11
            r6 = r12
            r7 = r13
            r2 = r14
        Lae:
            if (r9 == r8) goto Lb3
            int r9 = r9 + 1
            goto L4a
        Lb3:
            kotlin.b2 r1 = kotlin.b2.f124493a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet$SetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

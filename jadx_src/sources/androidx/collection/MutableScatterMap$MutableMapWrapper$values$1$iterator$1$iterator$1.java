package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n*L\n1510#1:1851,6\n1510#1:1858,3\n1510#1:1862,9\n1510#1:1857\n1510#1:1861\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {bb.c.b.dq}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super Integer>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f3458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f3463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f3464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private /* synthetic */ Object f3465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ MutableScatterMap<K, V> f3466k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, kotlin.coroutines.c<? super MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1> cVar) {
        super(2, cVar);
        this.f3466k = mutableScatterMap;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super Integer> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(this.f3466k, cVar);
        mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1.f3465j = obj;
        return mutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:28:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:24:0x009c). Please report as a decompilation issue!!! */
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
            int r2 = r0.f3464i
            r3 = 8
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2a
            int r2 = r0.f3462g
            int r6 = r0.f3461f
            long r7 = r0.f3463h
            int r9 = r0.f3460e
            int r10 = r0.f3459d
            java.lang.Object r11 = r0.f3458c
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f3465j
            kotlin.sequences.o r12 = (kotlin.sequences.o) r12
            kotlin.t0.n(r22)
            r13 = r12
            r12 = r11
            r11 = r0
            goto L9c
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            kotlin.t0.n(r22)
            java.lang.Object r2 = r0.f3465j
            kotlin.sequences.o r2 = (kotlin.sequences.o) r2
            androidx.collection.MutableScatterMap<K, V> r6 = r0.f3466k
            long[] r6 = r6.f3487a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto Lb0
            r9 = r0
            r8 = r4
        L44:
            r10 = r6[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto Lab
            int r12 = r8 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r12
            r12 = r6
            r6 = r18
            r19 = r10
            r11 = r7
            r10 = r9
            r9 = r8
            r7 = r19
        L69:
            if (r2 >= r6) goto La4
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L76
            r14 = r5
            goto L77
        L76:
            r14 = r4
        L77:
            if (r14 == 0) goto La1
            int r14 = r9 << 3
            int r14 = r14 + r2
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.a.f(r14)
            r10.f3465j = r13
            r10.f3458c = r12
            r10.f3459d = r11
            r10.f3460e = r9
            r10.f3463h = r7
            r10.f3461f = r6
            r10.f3462g = r2
            r10.f3464i = r5
            java.lang.Object r14 = r13.a(r14, r10)
            if (r14 != r1) goto L97
            return r1
        L97:
            r18 = r11
            r11 = r10
            r10 = r18
        L9c:
            r18 = r11
            r11 = r10
            r10 = r18
        La1:
            long r7 = r7 >> r3
            int r2 = r2 + r5
            goto L69
        La4:
            if (r6 != r3) goto Lb0
            r8 = r9
            r9 = r10
            r7 = r11
            r6 = r12
            r2 = r13
        Lab:
            if (r8 == r7) goto Lb0
            int r8 = r8 + 1
            goto L44
        Lb0:
            kotlin.b2 r1 = kotlin.b2.f124493a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

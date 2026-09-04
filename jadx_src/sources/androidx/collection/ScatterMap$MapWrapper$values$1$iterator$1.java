package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n418#2,3:1851\n363#2,6:1854\n373#2,3:1861\n376#2,2:1865\n422#2,2:1867\n379#2,6:1869\n424#2:1875\n1826#3:1860\n1688#3:1864\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n*L\n743#1:1851,3\n743#1:1854,6\n743#1:1861,3\n743#1:1865,2\n743#1:1867,2\n743#1:1869,6\n743#1:1875\n743#1:1860\n743#1:1864\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {bb.c.b.f30885qb}, m = "invokeSuspend", n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class ScatterMap$MapWrapper$values$1$iterator$1<V> extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super V>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f3516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f3517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f3521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f3522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f3523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private /* synthetic */ Object f3524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ ScatterMap<K, V> f3525l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScatterMap$MapWrapper$values$1$iterator$1(ScatterMap<K, V> scatterMap, kotlin.coroutines.c<? super ScatterMap$MapWrapper$values$1$iterator$1> cVar) {
        super(2, cVar);
        this.f3525l = scatterMap;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super V> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ScatterMap$MapWrapper$values$1$iterator$1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$1 = new ScatterMap$MapWrapper$values$1$iterator$1(this.f3525l, cVar);
        scatterMap$MapWrapper$values$1$iterator$1.f3524k = obj;
        return scatterMap$MapWrapper$values$1$iterator$1;
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
            int r2 = r0.f3523j
            r3 = 8
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            int r2 = r0.f3521h
            int r6 = r0.f3520g
            long r7 = r0.f3522i
            int r9 = r0.f3519f
            int r10 = r0.f3518e
            java.lang.Object r11 = r0.f3517d
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f3516c
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.f3524k
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
            java.lang.Object r2 = r0.f3524k
            kotlin.sequences.o r2 = (kotlin.sequences.o) r2
            androidx.collection.ScatterMap<K, V> r6 = r0.f3525l
            java.lang.Object[] r7 = r6.f3489c
            long[] r6 = r6.f3487a
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
            r11.f3524k = r14
            r11.f3516c = r13
            r11.f3517d = r12
            r11.f3518e = r10
            r11.f3519f = r9
            r11.f3522i = r7
            r11.f3520g = r6
            r11.f3521h = r2
            r11.f3523j = r5
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

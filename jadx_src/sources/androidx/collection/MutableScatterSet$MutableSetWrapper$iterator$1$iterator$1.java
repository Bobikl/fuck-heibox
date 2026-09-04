package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n237#2,7:1101\n248#2,3:1109\n251#2,9:1113\n1826#3:1108\n1688#3:1112\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n*L\n1057#1:1101,7\n1057#1:1109,3\n1057#1:1113,9\n1057#1:1108\n1057#1:1112\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1060}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super E>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f3472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f3473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f3474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f3477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f3478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f3479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f3480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private /* synthetic */ Object f3481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ MutableScatterSet<E> f3482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MutableScatterSet$MutableSetWrapper$iterator$1 f3483n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet<E> mutableScatterSet, MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1, kotlin.coroutines.c<? super MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1> cVar) {
        super(2, cVar);
        this.f3482m = mutableScatterSet;
        this.f3483n = mutableScatterSet$MutableSetWrapper$iterator$1;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super E> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this.f3482m, this.f3483n, cVar);
        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.f3481l = obj;
        return mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005c -> B:28:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005e -> B:14:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ae -> B:24:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

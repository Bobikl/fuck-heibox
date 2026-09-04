package androidx.collection;

import java.util.Map;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n*L\n699#1:1851,6\n699#1:1858,3\n699#1:1862,9\n699#1:1857\n699#1:1861\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {701}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class ScatterMap$MapWrapper$entries$1$iterator$1<K, V> extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super Map.Entry<? extends K, ? extends V>>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f3494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f3495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f3499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f3500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f3501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private /* synthetic */ Object f3502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ ScatterMap<K, V> f3503l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScatterMap$MapWrapper$entries$1$iterator$1(ScatterMap<K, V> scatterMap, kotlin.coroutines.c<? super ScatterMap$MapWrapper$entries$1$iterator$1> cVar) {
        super(2, cVar);
        this.f3503l = scatterMap;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super Map.Entry<? extends K, ? extends V>> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ScatterMap$MapWrapper$entries$1$iterator$1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1 = new ScatterMap$MapWrapper$entries$1$iterator$1(this.f3503l, cVar);
        scatterMap$MapWrapper$entries$1$iterator$1.f3502k = obj;
        return scatterMap$MapWrapper$entries$1$iterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:14:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a5 -> B:24:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b0 -> B:25:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c1 -> B:32:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package androidx.collection;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, zh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Iterator<? extends Map.Entry<K, V>> f3426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3427c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableScatterMap<K, V> f3428d;

    /* JADX INFO: renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterMap.kt */
    @kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n*L\n1326#1:1851,6\n1326#1:1858,3\n1326#1:1862,9\n1326#1:1857\n1326#1:1861\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {bb.c.b.Cm}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super Map.Entry<K, V>>, kotlin.coroutines.c<? super kotlin.b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f3429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3435i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long f3436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f3438l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ MutableScatterMap<K, V> f3439m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 f3440n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableScatterMap<K, V> mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f3439m = mutableScatterMap;
            this.f3440n = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d kotlin.sequences.o<? super Map.Entry<K, V>> oVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            return ((AnonymousClass1) create(oVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3439m, this.f3440n, cVar);
            anonymousClass1.f3438l = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005f  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0076). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b9 -> B:24:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c4 -> B:26:0x00c5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d9 -> B:31:0x00da). Please report as a decompilation issue!!! */
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
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.f3428d = mutableScatterMap;
        this.f3426b = kotlin.sequences.q.a(new AnonymousClass1(mutableScatterMap, this, null));
    }

    public final int a() {
        return this.f3427c;
    }

    @dl.d
    public final Iterator<Map.Entry<K, V>> b() {
        return this.f3426b;
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.f3426b.next();
    }

    public final void d(int i10) {
        this.f3427c = i10;
    }

    public final void e(@dl.d Iterator<? extends Map.Entry<K, V>> it) {
        kotlin.jvm.internal.f0.p(it, "<set-?>");
        this.f3426b = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3426b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f3427c;
        if (i10 != -1) {
            this.f3428d.o0(i10);
            this.f3427c = -1;
        }
    }
}

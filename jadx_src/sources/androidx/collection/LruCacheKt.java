package androidx.collection;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: compiled from: LruCache.kt */
    @kotlin.jvm.internal.t0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$4\n*L\n1#1,355:1\n*E\n"})
    public static final class a<K, V> extends z0<K, V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ yh.p<K, V, Integer> f3417j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ yh.l<K, V> f3418k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ yh.r<Boolean, K, V, V, kotlin.b2> f3419l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, yh.p<? super K, ? super V, Integer> pVar, yh.l<? super K, ? extends V> lVar, yh.r<? super Boolean, ? super K, ? super V, ? super V, kotlin.b2> rVar) {
            super(i10);
            this.f3417j = pVar;
            this.f3418k = lVar;
            this.f3419l = rVar;
        }

        @Override // androidx.collection.z0
        @dl.e
        protected V a(@dl.d K key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return this.f3418k.invoke(key);
        }

        @Override // androidx.collection.z0
        protected void c(boolean z10, @dl.d K key, @dl.d V oldValue, @dl.e V v10) {
            kotlin.jvm.internal.f0.p(key, "key");
            kotlin.jvm.internal.f0.p(oldValue, "oldValue");
            this.f3419l.U0(Boolean.valueOf(z10), key, oldValue, v10);
        }

        @Override // androidx.collection.z0
        protected int p(@dl.d K key, @dl.d V value) {
            kotlin.jvm.internal.f0.p(key, "key");
            kotlin.jvm.internal.f0.p(value, "value");
            return this.f3417j.invoke(key, value).intValue();
        }
    }

    @dl.d
    public static final <K, V> z0<K, V> a(int i10, @dl.d yh.p<? super K, ? super V, Integer> sizeOf, @dl.d yh.l<? super K, ? extends V> create, @dl.d yh.r<? super Boolean, ? super K, ? super V, ? super V, kotlin.b2> onEntryRemoved) {
        kotlin.jvm.internal.f0.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.f0.p(create, "create");
        kotlin.jvm.internal.f0.p(onEntryRemoved, "onEntryRemoved");
        return new a(i10, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ z0 b(int i10, yh.p sizeOf, yh.l create, yh.r onEntryRemoved, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            sizeOf = new yh.p<Object, Object, Integer>() { // from class: androidx.collection.LruCacheKt$lruCache$1
                @Override // yh.p
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(@dl.d Object obj2, @dl.d Object obj3) {
                    kotlin.jvm.internal.f0.p(obj2, "<anonymous parameter 0>");
                    kotlin.jvm.internal.f0.p(obj3, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            create = new yh.l<Object, Object>() { // from class: androidx.collection.LruCacheKt$lruCache$2
                @Override // yh.l
                @dl.e
                public final Object invoke(@dl.d Object it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            onEntryRemoved = new yh.r<Boolean, Object, Object, Object, kotlin.b2>() { // from class: androidx.collection.LruCacheKt$lruCache$3
                @Override // yh.r
                public /* bridge */ /* synthetic */ kotlin.b2 U0(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    a(bool.booleanValue(), obj2, obj3, obj4);
                    return kotlin.b2.f124493a;
                }

                public final void a(boolean z10, @dl.d Object obj2, @dl.d Object obj3, @dl.e Object obj4) {
                    kotlin.jvm.internal.f0.p(obj2, "<anonymous parameter 1>");
                    kotlin.jvm.internal.f0.p(obj3, "<anonymous parameter 2>");
                }
            };
        }
        kotlin.jvm.internal.f0.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.f0.p(create, "create");
        kotlin.jvm.internal.f0.p(onEntryRemoved, "onEntryRemoved");
        return new a(i10, sizeOf, create, onEntryRemoved);
    }
}

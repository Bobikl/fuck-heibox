package androidx.core.util;

import android.util.LruCache;
import kotlin.b2;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: compiled from: LruCache.kt */
    @t0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"})
    public static final class a<K, V> extends LruCache<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.p<K, V, Integer> f21225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<K, V> f21226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.r<Boolean, K, V, V, b2> f21227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, yh.p<? super K, ? super V, Integer> pVar, yh.l<? super K, ? extends V> lVar, yh.r<? super Boolean, ? super K, ? super V, ? super V, b2> rVar) {
            super(i10);
            this.f21225a = pVar;
            this.f21226b = lVar;
            this.f21227c = rVar;
        }

        @Override // android.util.LruCache
        @dl.e
        protected V create(@dl.d K key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return this.f21226b.invoke(key);
        }

        @Override // android.util.LruCache
        protected void entryRemoved(boolean z10, @dl.d K key, @dl.d V oldValue, @dl.e V v10) {
            kotlin.jvm.internal.f0.p(key, "key");
            kotlin.jvm.internal.f0.p(oldValue, "oldValue");
            this.f21227c.U0(Boolean.valueOf(z10), key, oldValue, v10);
        }

        @Override // android.util.LruCache
        protected int sizeOf(@dl.d K key, @dl.d V value) {
            kotlin.jvm.internal.f0.p(key, "key");
            kotlin.jvm.internal.f0.p(value, "value");
            return this.f21225a.invoke(key, value).intValue();
        }
    }

    @dl.d
    public static final <K, V> LruCache<K, V> a(int i10, @dl.d yh.p<? super K, ? super V, Integer> sizeOf, @dl.d yh.l<? super K, ? extends V> create, @dl.d yh.r<? super Boolean, ? super K, ? super V, ? super V, b2> onEntryRemoved) {
        kotlin.jvm.internal.f0.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.f0.p(create, "create");
        kotlin.jvm.internal.f0.p(onEntryRemoved, "onEntryRemoved");
        return new a(i10, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache b(int i10, yh.p sizeOf, yh.l create, yh.r onEntryRemoved, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            sizeOf = new yh.p<Object, Object, Integer>() { // from class: androidx.core.util.LruCacheKt$lruCache$1
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
            create = new yh.l<Object, Object>() { // from class: androidx.core.util.LruCacheKt$lruCache$2
                @Override // yh.l
                @dl.e
                public final Object invoke(@dl.d Object it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            onEntryRemoved = new yh.r<Boolean, Object, Object, Object, b2>() { // from class: androidx.core.util.LruCacheKt$lruCache$3
                @Override // yh.r
                public /* bridge */ /* synthetic */ b2 U0(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    a(bool.booleanValue(), obj2, obj3, obj4);
                    return b2.f124493a;
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

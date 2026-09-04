package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.e0;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.h1;
import com.google.common.util.concurrent.j0;
import com.google.common.util.concurrent.p0;
import com.google.common.util.concurrent.v1;
import com.google.common.util.concurrent.y0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final int A = 63;
    static final int B = 16;
    static final Logger C = Logger.getLogger(LocalCache.class.getName());
    static final s<Object, Object> D = new a();
    static final Queue<?> E = new b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f56823x = 1073741824;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f56824y = 65536;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f56825z = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f56826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f56827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Segment<K, V>[] f56828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f56829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Equivalence<Object> f56830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Equivalence<Object> f56831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Strength f56832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Strength f56833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f56834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final com.google.common.cache.q<K, V> f56835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f56836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final long f56837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final long f56838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Queue<RemovalNotification<K, V>> f56839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final com.google.common.cache.m<K, V> f56840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final e0 f56841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final EntryFactory f56842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final com.google.common.cache.a.b f56843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @CheckForNull
    final CacheLoader<? super K, V> f56844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @CheckForNull
    @u9.f
    Set<K> f56845u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @CheckForNull
    @u9.f
    Collection<V> f56846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @CheckForNull
    @u9.f
    Set<Map.Entry<K, V>> f56847w;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
  (r0v0 com.google.common.cache.LocalCache$EntryFactory) from 0x0058: FILLED_NEW_ARRAY 
  (r0v0 com.google.common.cache.LocalCache$EntryFactory)
  (r1v1 com.google.common.cache.LocalCache$EntryFactory)
  (r3v1 com.google.common.cache.LocalCache$EntryFactory)
  (r5v1 com.google.common.cache.LocalCache$EntryFactory)
  (r7v1 com.google.common.cache.LocalCache$EntryFactory)
  (r9v1 com.google.common.cache.LocalCache$EntryFactory)
  (r11v1 com.google.common.cache.LocalCache$EntryFactory)
  (r13v1 com.google.common.cache.LocalCache$EntryFactory)
 A[WRAPPED] elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new o(k10, i10, lVar);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new m(k10, i10, lVar);
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyWriteEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new q(k10, i10, lVar);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, lVarCopyEntry);
                copyWriteEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new n(k10, i10, lVar);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new w(segment.f56871i, k10, i10, lVar);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new u(segment.f56871i, k10, i10, lVar);
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyWriteEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new y(segment.f56871i, k10, i10, lVar);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, lVarCopyEntry);
                copyWriteEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new v(segment.f56871i, k10, i10, lVar);
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = {new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new o(k10, i10, lVar);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new m(k10, i10, lVar);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyWriteEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new q(k10, i10, lVar);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, lVarCopyEntry);
                copyWriteEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new n(k10, i10, lVar);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new w(segment.f56871i, k10, i10, lVar);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new u(segment.f56871i, k10, i10, lVar);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyWriteEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new y(segment.f56871i, k10, i10, lVar);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
                com.google.common.cache.l<K, V> lVarCopyEntry = super.copyEntry(segment, lVar, lVar2);
                copyAccessEntry(lVar, lVarCopyEntry);
                copyWriteEntry(lVar, lVarCopyEntry);
                return lVarCopyEntry;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
                return new v(segment.f56871i, k10, i10, lVar);
            }
        }};

        static {
        }

        private EntryFactory(String str, int i10) {
            super(str, i10);
        }

        /* synthetic */ EntryFactory(String str, int i10, a aVar) {
            this(str, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        static EntryFactory getFactory(Strength strength, boolean z10, boolean z11) {
            return factories[((strength == Strength.WEAK ? (char) 4 : (char) 0) | (z10 ? 1 : 0) ? 1 : 0) | (z11 ? 2 : 0)];
        }

        public static EntryFactory valueOf(String str) {
            return (EntryFactory) Enum.valueOf(EntryFactory.class, str);
        }

        public static EntryFactory[] values() {
            return (EntryFactory[]) $VALUES.clone();
        }

        <K, V> void copyAccessEntry(com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
            lVar2.setAccessTime(lVar.getAccessTime());
            LocalCache.c(lVar.getPreviousInAccessQueue(), lVar2);
            LocalCache.c(lVar2, lVar.getNextInAccessQueue());
            LocalCache.I(lVar);
        }

        <K, V> com.google.common.cache.l<K, V> copyEntry(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
            return newEntry(segment, lVar.getKey(), lVar.getHash(), lVar2);
        }

        <K, V> void copyWriteEntry(com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
            lVar2.setWriteTime(lVar.getWriteTime());
            LocalCache.d(lVar.getPreviousInWriteQueue(), lVar2);
            LocalCache.d(lVar2, lVar.getNextInWriteQueue());
            LocalCache.J(lVar);
        }

        abstract <K, V> com.google.common.cache.l<K, V> newEntry(Segment<K, V> segment, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar);
    }

    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements com.google.common.cache.i<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @CheckForNull
        transient com.google.common.cache.i<K, V> f56848o;

        LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void J0(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f56848o = (com.google.common.cache.i<K, V>) N0().b(this.f56862m);
        }

        private Object L0() {
            return this.f56848o;
        }

        @Override // com.google.common.cache.i
        public void C0(K k10) {
            this.f56848o.C0(k10);
        }

        @Override // com.google.common.cache.i, com.google.common.base.n
        public final V apply(K k10) {
            return this.f56848o.apply(k10);
        }

        @Override // com.google.common.cache.i
        public V get(K k10) throws ExecutionException {
            return this.f56848o.get(k10);
        }

        @Override // com.google.common.cache.i
        public V l0(K k10) {
            return this.f56848o.l0(k10);
        }

        @Override // com.google.common.cache.i
        public ImmutableMap<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f56848o.r0(iterable);
        }
    }

    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements com.google.common.cache.i<K, V> {
        private static final long serialVersionUID = 1;

        LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new LocalCache(cacheBuilder, (CacheLoader) com.google.common.base.w.E(cacheLoader)), null);
        }

        @Override // com.google.common.cache.i
        public void C0(K k10) {
            this.f56849b.T(k10);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        Object a() {
            return new LoadingSerializationProxy(this.f56849b);
        }

        @Override // com.google.common.cache.i, com.google.common.base.n
        public final V apply(K k10) {
            return l0(k10);
        }

        @Override // com.google.common.cache.i
        public V get(K k10) throws ExecutionException {
            return this.f56849b.x(k10);
        }

        @Override // com.google.common.cache.i
        public V l0(K k10) {
            try {
                return get(k10);
            } catch (ExecutionException e10) {
                throw new UncheckedExecutionException(e10.getCause());
            }
        }

        @Override // com.google.common.cache.i
        public ImmutableMap<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f56849b.p(iterable);
        }
    }

    public static class LocalManualCache<K, V> implements com.google.common.cache.c<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final LocalCache<K, V> f56849b;

        public class a extends CacheLoader<Object, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f56850b;

            a(LocalManualCache localManualCache, Callable callable) {
                this.f56850b = callable;
            }

            @Override // com.google.common.cache.CacheLoader
            public V d(Object obj) throws Exception {
                return (V) this.f56850b.call();
            }
        }

        LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
            this.f56849b = localCache;
        }

        /* synthetic */ LocalManualCache(LocalCache localCache, a aVar) {
            this(localCache);
        }

        @Override // com.google.common.cache.c
        @CheckForNull
        public V L(Object obj) {
            return this.f56849b.v(obj);
        }

        @Override // com.google.common.cache.c
        public void N(Iterable<?> iterable) {
            this.f56849b.z(iterable);
        }

        @Override // com.google.common.cache.c
        public ImmutableMap<K, V> X(Iterable<?> iterable) {
            return this.f56849b.r(iterable);
        }

        Object a() {
            return new ManualSerializationProxy(this.f56849b);
        }

        @Override // com.google.common.cache.c
        public ConcurrentMap<K, V> e() {
            return this.f56849b;
        }

        @Override // com.google.common.cache.c
        public com.google.common.cache.e k0() {
            com.google.common.cache.a.C0445a c0445a = new com.google.common.cache.a.C0445a();
            c0445a.g(this.f56849b.f56843s);
            for (Segment<K, V> segment : this.f56849b.f56828d) {
                c0445a.g(segment.f56877o);
            }
            return c0445a.f();
        }

        @Override // com.google.common.cache.c
        public void put(K k10, V v10) {
            this.f56849b.put(k10, v10);
        }

        @Override // com.google.common.cache.c
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f56849b.putAll(map);
        }

        @Override // com.google.common.cache.c
        public long size() {
            return this.f56849b.D();
        }

        @Override // com.google.common.cache.c
        public void u0(Object obj) {
            com.google.common.base.w.E(obj);
            this.f56849b.remove(obj);
        }

        @Override // com.google.common.cache.c
        public void w() {
            this.f56849b.clear();
        }

        @Override // com.google.common.cache.c
        public void x() {
            this.f56849b.b();
        }

        @Override // com.google.common.cache.c
        public V y(K k10, Callable<? extends V> callable) throws ExecutionException {
            com.google.common.base.w.E(callable);
            return this.f56849b.n(k10, new a(this, callable));
        }
    }

    public static class ManualSerializationProxy<K, V> extends com.google.common.cache.g<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Strength f56851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Strength f56852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Equivalence<Object> f56853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Equivalence<Object> f56854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f56855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f56856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final long f56857h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final com.google.common.cache.q<K, V> f56858i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final int f56859j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final com.google.common.cache.m<? super K, ? super V> f56860k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @CheckForNull
        final e0 f56861l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final CacheLoader<? super K, V> f56862m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @CheckForNull
        transient com.google.common.cache.c<K, V> f56863n;

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j10, long j11, long j12, com.google.common.cache.q<K, V> qVar, int i10, com.google.common.cache.m<? super K, ? super V> mVar, e0 e0Var, CacheLoader<? super K, V> cacheLoader) {
            this.f56851b = strength;
            this.f56852c = strength2;
            this.f56853d = equivalence;
            this.f56854e = equivalence2;
            this.f56855f = j10;
            this.f56856g = j11;
            this.f56857h = j12;
            this.f56858i = qVar;
            this.f56859j = i10;
            this.f56860k = mVar;
            this.f56861l = (e0Var == e0.b() || e0Var == CacheBuilder.f56797x) ? null : e0Var;
            this.f56862m = cacheLoader;
        }

        ManualSerializationProxy(LocalCache<K, V> localCache) {
            this(localCache.f56832h, localCache.f56833i, localCache.f56830f, localCache.f56831g, localCache.f56837m, localCache.f56836l, localCache.f56834j, localCache.f56835k, localCache.f56829e, localCache.f56840p, localCache.f56841q, localCache.f56844t);
        }

        private void J0(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f56863n = (com.google.common.cache.c<K, V>) N0().a();
        }

        private Object L0() {
            return this.f56863n;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.g, com.google.common.collect.y0
        public com.google.common.cache.c<K, V> H0() {
            return this.f56863n;
        }

        CacheBuilder<K, V> N0() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.D().H(this.f56851b).I(this.f56852c).z(this.f56853d).L(this.f56854e).e(this.f56859j).G(this.f56860k);
            cacheBuilder.f56800a = false;
            long j10 = this.f56855f;
            if (j10 > 0) {
                cacheBuilder.g(j10, TimeUnit.NANOSECONDS);
            }
            long j11 = this.f56856g;
            if (j11 > 0) {
                cacheBuilder.f(j11, TimeUnit.NANOSECONDS);
            }
            com.google.common.cache.q qVar = this.f56858i;
            if (qVar != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.O(qVar);
                long j12 = this.f56857h;
                if (j12 != -1) {
                    cacheBuilder.C(j12);
                }
            } else {
                long j13 = this.f56857h;
                if (j13 != -1) {
                    cacheBuilder.B(j13);
                }
            }
            e0 e0Var = this.f56861l;
            if (e0Var != null) {
                cacheBuilder.K(e0Var);
            }
            return cacheBuilder;
        }
    }

    public enum NullEntry implements com.google.common.cache.l<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.l
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.l
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.l
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.l
        public s<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.l
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.l
        public void setAccessTime(long j10) {
        }

        @Override // com.google.common.cache.l
        public void setNextInAccessQueue(com.google.common.cache.l<Object, Object> lVar) {
        }

        @Override // com.google.common.cache.l
        public void setNextInWriteQueue(com.google.common.cache.l<Object, Object> lVar) {
        }

        @Override // com.google.common.cache.l
        public void setPreviousInAccessQueue(com.google.common.cache.l<Object, Object> lVar) {
        }

        @Override // com.google.common.cache.l
        public void setPreviousInWriteQueue(com.google.common.cache.l<Object, Object> lVar) {
        }

        @Override // com.google.common.cache.l
        public void setValueReference(s<Object, Object> sVar) {
        }

        @Override // com.google.common.cache.l
        public void setWriteTime(long j10) {
        }
    }

    public static class Segment<K, V> extends ReentrantLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        final LocalCache<K, V> f56864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile int f56865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @t9.a("this")
        long f56866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f56868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        volatile AtomicReferenceArray<com.google.common.cache.l<K, V>> f56869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final long f56870h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @CheckForNull
        final ReferenceQueue<K> f56871i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @CheckForNull
        final ReferenceQueue<V> f56872j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final Queue<com.google.common.cache.l<K, V>> f56873k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicInteger f56874l = new AtomicInteger();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @t9.a("this")
        final Queue<com.google.common.cache.l<K, V>> f56875m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @t9.a("this")
        final Queue<com.google.common.cache.l<K, V>> f56876n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final com.google.common.cache.a.b f56877o;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f56878b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f56879c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k f56880d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ p0 f56881e;

            a(Object obj, int i10, k kVar, p0 p0Var) {
                this.f56878b = obj;
                this.f56879c = i10;
                this.f56880d = kVar;
                this.f56881e = p0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Segment.this.r(this.f56878b, this.f56879c, this.f56880d, this.f56881e);
                } catch (Throwable th2) {
                    LocalCache.C.log(Level.WARNING, "Exception thrown during refresh", th2);
                    this.f56880d.l(th2);
                }
            }
        }

        Segment(LocalCache<K, V> localCache, int i10, long j10, com.google.common.cache.a.b bVar) {
            this.f56864b = localCache;
            this.f56870h = j10;
            this.f56877o = (com.google.common.cache.a.b) com.google.common.base.w.E(bVar);
            x(D(i10));
            this.f56871i = localCache.b0() ? new ReferenceQueue<>() : null;
            this.f56872j = localCache.c0() ? new ReferenceQueue<>() : null;
            this.f56873k = localCache.a0() ? new ConcurrentLinkedQueue<>() : LocalCache.h();
            this.f56875m = localCache.e0() ? new c0<>() : LocalCache.h();
            this.f56876n = localCache.a0() ? new e<>() : LocalCache.h();
        }

        V A(K k10, int i10, k<K, V> kVar, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return r(k10, i10, kVar, kVar.j(k10, cacheLoader));
        }

        V B(K k10, int i10, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            k<K, V> kVar;
            boolean z10;
            s<K, V> sVar;
            V vA;
            lock();
            try {
                long jA = this.f56864b.f56841q.a();
                G(jA);
                int i11 = this.f56865c - 1;
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                com.google.common.cache.l<K, V> lVarC = lVar;
                while (true) {
                    kVar = null;
                    if (lVarC == null) {
                        z10 = true;
                        sVar = null;
                        break;
                    }
                    K key = lVarC.getKey();
                    if (lVarC.getHash() == i10 && key != null && this.f56864b.f56830f.d(k10, key)) {
                        s<K, V> valueReference = lVarC.getValueReference();
                        if (valueReference.a()) {
                            z10 = false;
                        } else {
                            V v10 = valueReference.get();
                            if (v10 == null) {
                                l(key, i10, v10, valueReference.b(), RemovalCause.COLLECTED);
                            } else {
                                if (!this.f56864b.A(lVarC, jA)) {
                                    K(lVarC, jA);
                                    this.f56877o.a(1);
                                    unlock();
                                    F();
                                    return v10;
                                }
                                l(key, i10, v10, valueReference.b(), RemovalCause.EXPIRED);
                            }
                            this.f56875m.remove(lVarC);
                            this.f56876n.remove(lVarC);
                            this.f56865c = i11;
                            z10 = true;
                        }
                        sVar = valueReference;
                        break;
                    }
                    lVarC = lVarC.getNext();
                }
                if (z10) {
                    kVar = new k<>();
                    if (lVarC == null) {
                        lVarC = C(k10, i10, lVar);
                        lVarC.setValueReference(kVar);
                        atomicReferenceArray.set(length, lVarC);
                    } else {
                        lVarC.setValueReference(kVar);
                    }
                }
                unlock();
                F();
                if (!z10) {
                    return e0(lVarC, k10, sVar);
                }
                try {
                    synchronized (lVarC) {
                        vA = A(k10, i10, kVar, cacheLoader);
                    }
                    this.f56877o.d(1);
                    return vA;
                } catch (Throwable th2) {
                    this.f56877o.d(1);
                    throw th2;
                }
            } catch (Throwable th3) {
                unlock();
                F();
                throw th3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @t9.a("this")
        com.google.common.cache.l<K, V> C(K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            return this.f56864b.f56842r.newEntry(this, com.google.common.base.w.E(k10), i10, lVar);
        }

        AtomicReferenceArray<com.google.common.cache.l<K, V>> D(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        void E() {
            if ((this.f56874l.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        void F() {
            Y();
        }

        @t9.a("this")
        void G(long j10) {
            X(j10);
        }

        @CheckForNull
        V H(K k10, int i10, V v10, boolean z10) {
            int i11;
            lock();
            try {
                long jA = this.f56864b.f56841q.a();
                G(jA);
                if (this.f56865c + 1 > this.f56868f) {
                    n();
                }
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f56864b.f56830f.d(k10, key)) {
                        s<K, V> valueReference = next.getValueReference();
                        V v11 = valueReference.get();
                        if (v11 != null) {
                            if (z10) {
                                K(next, jA);
                            } else {
                                this.f56867e++;
                                l(k10, i10, v11, valueReference.b(), RemovalCause.REPLACED);
                                a0(next, k10, v10, jA);
                                m(next);
                            }
                            return v11;
                        }
                        this.f56867e++;
                        if (valueReference.isActive()) {
                            l(k10, i10, v11, valueReference.b(), RemovalCause.COLLECTED);
                            a0(next, k10, v10, jA);
                            i11 = this.f56865c;
                        } else {
                            a0(next, k10, v10, jA);
                            i11 = this.f56865c + 1;
                        }
                        this.f56865c = i11;
                        m(next);
                        return null;
                    }
                }
                this.f56867e++;
                com.google.common.cache.l<K, V> lVarC = C(k10, i10, lVar);
                a0(lVarC, k10, v10, jA);
                atomicReferenceArray.set(length, lVarC);
                this.f56865c++;
                m(lVarC);
                return null;
            } finally {
                unlock();
                F();
            }
        }

        boolean I(com.google.common.cache.l<K, V> lVar, int i10) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                com.google.common.cache.l<K, V> lVar2 = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar2; next != null; next = next.getNext()) {
                    if (next == lVar) {
                        this.f56867e++;
                        com.google.common.cache.l<K, V> lVarU = U(lVar2, next, next.getKey(), i10, next.getValueReference().get(), next.getValueReference(), RemovalCause.COLLECTED);
                        int i11 = this.f56865c - 1;
                        atomicReferenceArray.set(length, lVarU);
                        this.f56865c = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                F();
            }
        }

        boolean J(K k10, int i10, s<K, V> sVar) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f56864b.f56830f.d(k10, key)) {
                        if (next.getValueReference() != sVar) {
                            return false;
                        }
                        this.f56867e++;
                        com.google.common.cache.l<K, V> lVarU = U(lVar, next, key, i10, sVar.get(), sVar, RemovalCause.COLLECTED);
                        int i11 = this.f56865c - 1;
                        atomicReferenceArray.set(length, lVarU);
                        this.f56865c = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    F();
                }
            }
        }

        @t9.a("this")
        void K(com.google.common.cache.l<K, V> lVar, long j10) {
            if (this.f56864b.N()) {
                lVar.setAccessTime(j10);
            }
            this.f56876n.add(lVar);
        }

        void L(com.google.common.cache.l<K, V> lVar, long j10) {
            if (this.f56864b.N()) {
                lVar.setAccessTime(j10);
            }
            this.f56873k.add(lVar);
        }

        @t9.a("this")
        void M(com.google.common.cache.l<K, V> lVar, int i10, long j10) {
            i();
            this.f56866d += (long) i10;
            if (this.f56864b.N()) {
                lVar.setAccessTime(j10);
            }
            if (this.f56864b.P()) {
                lVar.setWriteTime(j10);
            }
            this.f56876n.add(lVar);
            this.f56875m.add(lVar);
        }

        @CheckForNull
        V N(K k10, int i10, CacheLoader<? super K, V> cacheLoader, boolean z10) {
            k<K, V> kVarY = y(k10, i10, z10);
            if (kVarY == null) {
                return null;
            }
            p0<V> p0VarZ = z(k10, i10, kVarY, cacheLoader);
            if (p0VarZ.isDone()) {
                try {
                    return (V) v1.f(p0VarZ);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        @CheckForNull
        V O(Object obj, int i10) {
            RemovalCause removalCause;
            lock();
            try {
                G(this.f56864b.f56841q.a());
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f56864b.f56830f.d(obj, key)) {
                        s<K, V> valueReference = next.getValueReference();
                        V v10 = valueReference.get();
                        if (v10 == null) {
                            if (!valueReference.isActive()) {
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            removalCause = RemovalCause.EXPLICIT;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.f56867e++;
                        com.google.common.cache.l<K, V> lVarU = U(lVar, next, key, i10, v10, valueReference, removalCause2);
                        int i11 = this.f56865c - 1;
                        atomicReferenceArray.set(length, lVarU);
                        this.f56865c = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
                F();
            }
        }

        boolean P(Object obj, int i10, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                G(this.f56864b.f56841q.a());
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f56864b.f56830f.d(obj, key)) {
                        s<K, V> valueReference = next.getValueReference();
                        V v10 = valueReference.get();
                        if (!this.f56864b.f56831g.d(obj2, v10)) {
                            if (v10 != null || !valueReference.isActive()) {
                                break;
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            removalCause = RemovalCause.EXPLICIT;
                        }
                        this.f56867e++;
                        com.google.common.cache.l<K, V> lVarU = U(lVar, next, key, i10, v10, valueReference, removalCause);
                        int i11 = this.f56865c - 1;
                        atomicReferenceArray.set(length, lVarU);
                        this.f56865c = i11;
                        return removalCause == RemovalCause.EXPLICIT;
                    }
                }
                return false;
            } finally {
                unlock();
                F();
            }
        }

        @t9.a("this")
        void Q(com.google.common.cache.l<K, V> lVar) {
            l(lVar.getKey(), lVar.getHash(), lVar.getValueReference().get(), lVar.getValueReference().b(), RemovalCause.COLLECTED);
            this.f56875m.remove(lVar);
            this.f56876n.remove(lVar);
        }

        @t9.a("this")
        @o9.d
        boolean R(com.google.common.cache.l<K, V> lVar, int i10, RemovalCause removalCause) {
            AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
            int length = (atomicReferenceArray.length() - 1) & i10;
            com.google.common.cache.l<K, V> lVar2 = atomicReferenceArray.get(length);
            for (com.google.common.cache.l<K, V> next = lVar2; next != null; next = next.getNext()) {
                if (next == lVar) {
                    this.f56867e++;
                    com.google.common.cache.l<K, V> lVarU = U(lVar2, next, next.getKey(), i10, next.getValueReference().get(), next.getValueReference(), removalCause);
                    int i11 = this.f56865c - 1;
                    atomicReferenceArray.set(length, lVarU);
                    this.f56865c = i11;
                    return true;
                }
            }
            return false;
        }

        @CheckForNull
        @t9.a("this")
        com.google.common.cache.l<K, V> S(com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
            int i10 = this.f56865c;
            com.google.common.cache.l<K, V> next = lVar2.getNext();
            while (lVar != lVar2) {
                com.google.common.cache.l<K, V> lVarG = g(lVar, next);
                if (lVarG != null) {
                    next = lVarG;
                } else {
                    Q(lVar);
                    i10--;
                }
                lVar = lVar.getNext();
            }
            this.f56865c = i10;
            return next;
        }

        boolean T(K k10, int i10, k<K, V> kVar) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f56864b.f56830f.d(k10, key)) {
                        if (next.getValueReference() != kVar) {
                            break;
                        }
                        if (kVar.isActive()) {
                            next.setValueReference(kVar.i());
                        } else {
                            atomicReferenceArray.set(length, S(lVar, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                F();
            }
        }

        @CheckForNull
        @t9.a("this")
        com.google.common.cache.l<K, V> U(com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2, @CheckForNull K k10, int i10, V v10, s<K, V> sVar, RemovalCause removalCause) {
            l(k10, i10, v10, sVar.b(), removalCause);
            this.f56875m.remove(lVar2);
            this.f56876n.remove(lVar2);
            if (!sVar.a()) {
                return S(lVar, lVar2);
            }
            sVar.d(null);
            return lVar;
        }

        @CheckForNull
        V V(K k10, int i10, V v10) {
            lock();
            try {
                long jA = this.f56864b.f56841q.a();
                G(jA);
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i10 && key != null) {
                        if (this.f56864b.f56830f.d(k10, key)) {
                            s<K, V> valueReference = next.getValueReference();
                            V v11 = valueReference.get();
                            if (v11 != null) {
                                this.f56867e++;
                                l(k10, i10, v11, valueReference.b(), RemovalCause.REPLACED);
                                a0(next, k10, v10, jA);
                                m(next);
                                return v11;
                            }
                            if (!valueReference.isActive()) {
                                break;
                            }
                            this.f56867e++;
                            com.google.common.cache.l<K, V> lVarU = U(lVar, next, key, i10, v11, valueReference, RemovalCause.COLLECTED);
                            int i11 = this.f56865c - 1;
                            atomicReferenceArray.set(length, lVarU);
                            this.f56865c = i11;
                            break;
                        }
                    }
                }
                return null;
            } finally {
                unlock();
                F();
            }
        }

        boolean W(K k10, int i10, V v10, V v11) {
            lock();
            try {
                long jA = this.f56864b.f56841q.a();
                G(jA);
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i10 && key != null) {
                        if (this.f56864b.f56830f.d(k10, key)) {
                            s<K, V> valueReference = next.getValueReference();
                            V v12 = valueReference.get();
                            if (v12 != null) {
                                if (!this.f56864b.f56831g.d(v10, v12)) {
                                    K(next, jA);
                                    break;
                                }
                                this.f56867e++;
                                l(k10, i10, v12, valueReference.b(), RemovalCause.REPLACED);
                                a0(next, k10, v11, jA);
                                m(next);
                                return true;
                            }
                            if (!valueReference.isActive()) {
                                break;
                            }
                            this.f56867e++;
                            com.google.common.cache.l<K, V> lVarU = U(lVar, next, key, i10, v12, valueReference, RemovalCause.COLLECTED);
                            int i11 = this.f56865c - 1;
                            atomicReferenceArray.set(length, lVarU);
                            this.f56865c = i11;
                            break;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
                F();
            }
        }

        void X(long j10) {
            if (tryLock()) {
                try {
                    j();
                    o(j10);
                    this.f56874l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void Y() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f56864b.K();
        }

        V Z(com.google.common.cache.l<K, V> lVar, K k10, int i10, V v10, long j10, CacheLoader<? super K, V> cacheLoader) {
            V vN;
            return (!this.f56864b.U() || j10 - lVar.getWriteTime() <= this.f56864b.f56838n || lVar.getValueReference().a() || (vN = N(k10, i10, cacheLoader, true)) == null) ? v10 : vN;
        }

        void a() {
            X(this.f56864b.f56841q.a());
            Y();
        }

        @t9.a("this")
        void a0(com.google.common.cache.l<K, V> lVar, K k10, V v10, long j10) {
            s<K, V> valueReference = lVar.getValueReference();
            int iWeigh = this.f56864b.f56835k.weigh(k10, v10);
            com.google.common.base.w.h0(iWeigh >= 0, "Weights must be non-negative");
            lVar.setValueReference(this.f56864b.f56833i.referenceValue(this, lVar, v10, iWeigh));
            M(lVar, iWeigh, j10);
            valueReference.d(v10);
        }

        void b() {
            while (this.f56871i.poll() != null) {
            }
        }

        boolean b0(K k10, int i10, k<K, V> kVar, V v10) {
            lock();
            try {
                long jA = this.f56864b.f56841q.a();
                G(jA);
                int i11 = this.f56865c + 1;
                if (i11 > this.f56868f) {
                    n();
                    i11 = this.f56865c + 1;
                }
                int i12 = i11;
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.l<K, V> next = lVar; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f56864b.f56830f.d(k10, key)) {
                        s<K, V> valueReference = next.getValueReference();
                        V v11 = valueReference.get();
                        if (kVar != valueReference && (v11 != null || valueReference == LocalCache.D)) {
                            l(k10, i10, v10, 0, RemovalCause.REPLACED);
                            return false;
                        }
                        this.f56867e++;
                        if (kVar.isActive()) {
                            l(k10, i10, v11, kVar.b(), v11 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i12--;
                        }
                        a0(next, k10, v10, jA);
                        this.f56865c = i12;
                        m(next);
                        return true;
                    }
                }
                this.f56867e++;
                com.google.common.cache.l<K, V> lVarC = C(k10, i10, lVar);
                a0(lVarC, k10, v10, jA);
                atomicReferenceArray.set(length, lVarC);
                this.f56865c = i12;
                m(lVarC);
                return true;
            } finally {
                unlock();
                F();
            }
        }

        void c() {
            if (this.f56864b.b0()) {
                b();
            }
            if (this.f56864b.c0()) {
                d();
            }
        }

        void c0() {
            if (tryLock()) {
                try {
                    j();
                } finally {
                    unlock();
                }
            }
        }

        void clear() {
            if (this.f56865c != 0) {
                lock();
                try {
                    G(this.f56864b.f56841q.a());
                    AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        for (com.google.common.cache.l<K, V> next = atomicReferenceArray.get(i10); next != null; next = next.getNext()) {
                            if (next.getValueReference().isActive()) {
                                K key = next.getKey();
                                V v10 = next.getValueReference().get();
                                l(key, next.getHash(), v10, next.getValueReference().b(), (key == null || v10 == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT);
                            }
                        }
                    }
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        atomicReferenceArray.set(i11, null);
                    }
                    c();
                    this.f56875m.clear();
                    this.f56876n.clear();
                    this.f56874l.set(0);
                    this.f56867e++;
                    this.f56865c = 0;
                } finally {
                    unlock();
                    F();
                }
            }
        }

        void d() {
            while (this.f56872j.poll() != null) {
            }
        }

        void d0(long j10) {
            if (tryLock()) {
                try {
                    o(j10);
                } finally {
                    unlock();
                }
            }
        }

        boolean e(Object obj, int i10) {
            try {
                if (this.f56865c == 0) {
                    return false;
                }
                com.google.common.cache.l<K, V> lVarU = u(obj, i10, this.f56864b.f56841q.a());
                if (lVarU == null) {
                    return false;
                }
                return lVarU.getValueReference().get() != null;
            } finally {
                E();
            }
        }

        V e0(com.google.common.cache.l<K, V> lVar, K k10, s<K, V> sVar) throws ExecutionException {
            if (!sVar.a()) {
                throw new AssertionError();
            }
            com.google.common.base.w.x0(!Thread.holdsLock(lVar), "Recursive load of: %s", k10);
            try {
                V vE = sVar.e();
                if (vE != null) {
                    L(lVar, this.f56864b.f56841q.a());
                    this.f56877o.d(1);
                    return vE;
                }
                String strValueOf = String.valueOf(k10);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
                sb2.append("CacheLoader returned null for key ");
                sb2.append(strValueOf);
                sb2.append(".");
                throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
            } catch (Throwable th2) {
                this.f56877o.d(1);
                throw th2;
            }
        }

        @o9.d
        boolean f(Object obj) {
            try {
                if (this.f56865c != 0) {
                    long jA = this.f56864b.f56841q.a();
                    AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                    int length = atomicReferenceArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        for (com.google.common.cache.l<K, V> next = atomicReferenceArray.get(i10); next != null; next = next.getNext()) {
                            V v10 = v(next, jA);
                            if (v10 != null && this.f56864b.f56831g.d(obj, v10)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                E();
            }
        }

        @t9.a("this")
        com.google.common.cache.l<K, V> g(com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
            if (lVar.getKey() == null) {
                return null;
            }
            s<K, V> valueReference = lVar.getValueReference();
            V v10 = valueReference.get();
            if (v10 == null && valueReference.isActive()) {
                return null;
            }
            com.google.common.cache.l<K, V> lVarCopyEntry = this.f56864b.f56842r.copyEntry(this, lVar, lVar2);
            lVarCopyEntry.setValueReference(valueReference.f(this.f56872j, v10, lVarCopyEntry));
            return lVarCopyEntry;
        }

        @t9.a("this")
        void h() {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = this.f56871i.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f56864b.L((com.google.common.cache.l) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        @t9.a("this")
        void i() {
            while (true) {
                com.google.common.cache.l<K, V> lVarPoll = this.f56873k.poll();
                if (lVarPoll == null) {
                    return;
                }
                if (this.f56876n.contains(lVarPoll)) {
                    this.f56876n.add(lVarPoll);
                }
            }
        }

        @t9.a("this")
        void j() {
            if (this.f56864b.b0()) {
                h();
            }
            if (this.f56864b.c0()) {
                k();
            }
        }

        @t9.a("this")
        void k() {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = this.f56872j.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f56864b.M((s) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        @t9.a("this")
        void l(@CheckForNull K k10, int i10, @CheckForNull V v10, int i11, RemovalCause removalCause) {
            this.f56866d -= (long) i11;
            if (removalCause.wasEvicted()) {
                this.f56877o.b();
            }
            if (this.f56864b.f56839o != LocalCache.E) {
                this.f56864b.f56839o.offer(RemovalNotification.a(k10, v10, removalCause));
            }
        }

        @t9.a("this")
        void m(com.google.common.cache.l<K, V> lVar) {
            if (this.f56864b.i()) {
                i();
                if (lVar.getValueReference().b() > this.f56870h && !R(lVar, lVar.getHash(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f56866d > this.f56870h) {
                    com.google.common.cache.l<K, V> lVarW = w();
                    if (!R(lVarW, lVarW.getHash(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @t9.a("this")
        void n() {
            AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f56865c;
            AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArrayD = D(length << 1);
            this.f56868f = (atomicReferenceArrayD.length() * 3) / 4;
            int length2 = atomicReferenceArrayD.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                com.google.common.cache.l<K, V> next = atomicReferenceArray.get(i11);
                if (next != null) {
                    com.google.common.cache.l<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayD.set(hash, next);
                    } else {
                        com.google.common.cache.l<K, V> lVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                lVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayD.set(hash, lVar);
                        while (next != lVar) {
                            int hash3 = next.getHash() & length2;
                            com.google.common.cache.l<K, V> lVarG = g(next, atomicReferenceArrayD.get(hash3));
                            if (lVarG != null) {
                                atomicReferenceArrayD.set(hash3, lVarG);
                            } else {
                                Q(next);
                                i10--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f56869g = atomicReferenceArrayD;
            this.f56865c = i10;
        }

        @t9.a("this")
        void o(long j10) {
            com.google.common.cache.l<K, V> lVarPeek;
            com.google.common.cache.l<K, V> lVarPeek2;
            i();
            do {
                lVarPeek = this.f56875m.peek();
                if (lVarPeek == null || !this.f56864b.A(lVarPeek, j10)) {
                    do {
                        lVarPeek2 = this.f56876n.peek();
                        if (lVarPeek2 == null || !this.f56864b.A(lVarPeek2, j10)) {
                            return;
                        }
                    } while (R(lVarPeek2, lVarPeek2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (R(lVarPeek, lVarPeek.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        @CheckForNull
        V p(Object obj, int i10) {
            try {
                if (this.f56865c != 0) {
                    long jA = this.f56864b.f56841q.a();
                    com.google.common.cache.l<K, V> lVarU = u(obj, i10, jA);
                    if (lVarU == null) {
                        return null;
                    }
                    V v10 = lVarU.getValueReference().get();
                    if (v10 != null) {
                        L(lVarU, jA);
                        return Z(lVarU, lVarU.getKey(), i10, v10, jA, this.f56864b.f56844t);
                    }
                    c0();
                }
                return null;
            } finally {
                E();
            }
        }

        V q(K k10, int i10, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            com.google.common.cache.l<K, V> lVarS;
            com.google.common.base.w.E(k10);
            com.google.common.base.w.E(cacheLoader);
            try {
                try {
                    if (this.f56865c != 0 && (lVarS = s(k10, i10)) != null) {
                        long jA = this.f56864b.f56841q.a();
                        V v10 = v(lVarS, jA);
                        if (v10 != null) {
                            L(lVarS, jA);
                            this.f56877o.a(1);
                            V vZ = Z(lVarS, k10, i10, v10, jA, cacheLoader);
                            E();
                            return vZ;
                        }
                        s<K, V> valueReference = lVarS.getValueReference();
                        if (valueReference.a()) {
                            V vE0 = e0(lVarS, k10, valueReference);
                            E();
                            return vE0;
                        }
                    }
                    V vB = B(k10, i10, cacheLoader);
                    E();
                    return vB;
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    if (cause instanceof Error) {
                        throw new ExecutionError((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw e10;
                }
            } catch (Throwable th2) {
                E();
                throw th2;
            }
        }

        V r(K k10, int i10, k<K, V> kVar, p0<V> p0Var) throws Throwable {
            V v10;
            try {
                v10 = (V) v1.f(p0Var);
                try {
                    if (v10 != null) {
                        this.f56877o.c(kVar.g());
                        b0(k10, i10, kVar, v10);
                        return v10;
                    }
                    String strValueOf = String.valueOf(k10);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
                    sb2.append("CacheLoader returned null for key ");
                    sb2.append(strValueOf);
                    sb2.append(".");
                    throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
                } catch (Throwable th2) {
                    th = th2;
                    if (v10 == null) {
                        this.f56877o.e(kVar.g());
                        T(k10, i10, kVar);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v10 = null;
            }
        }

        @CheckForNull
        com.google.common.cache.l<K, V> s(Object obj, int i10) {
            for (com.google.common.cache.l<K, V> lVarT = t(i10); lVarT != null; lVarT = lVarT.getNext()) {
                if (lVarT.getHash() == i10) {
                    K key = lVarT.getKey();
                    if (key == null) {
                        c0();
                    } else if (this.f56864b.f56830f.d(obj, key)) {
                        return lVarT;
                    }
                }
            }
            return null;
        }

        com.google.common.cache.l<K, V> t(int i10) {
            AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
            return atomicReferenceArray.get(i10 & (atomicReferenceArray.length() - 1));
        }

        @CheckForNull
        com.google.common.cache.l<K, V> u(Object obj, int i10, long j10) {
            com.google.common.cache.l<K, V> lVarS = s(obj, i10);
            if (lVarS == null) {
                return null;
            }
            if (!this.f56864b.A(lVarS, j10)) {
                return lVarS;
            }
            d0(j10);
            return null;
        }

        V v(com.google.common.cache.l<K, V> lVar, long j10) {
            if (lVar.getKey() == null) {
                c0();
                return null;
            }
            V v10 = lVar.getValueReference().get();
            if (v10 == null) {
                c0();
                return null;
            }
            if (!this.f56864b.A(lVar, j10)) {
                return v10;
            }
            d0(j10);
            return null;
        }

        @t9.a("this")
        com.google.common.cache.l<K, V> w() {
            for (com.google.common.cache.l<K, V> lVar : this.f56876n) {
                if (lVar.getValueReference().b() > 0) {
                    return lVar;
                }
            }
            throw new AssertionError();
        }

        void x(AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray) {
            this.f56868f = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f56864b.g()) {
                int i10 = this.f56868f;
                if (i10 == this.f56870h) {
                    this.f56868f = i10 + 1;
                }
            }
            this.f56869g = atomicReferenceArray;
        }

        @CheckForNull
        k<K, V> y(K k10, int i10, boolean z10) {
            lock();
            try {
                long jA = this.f56864b.f56841q.a();
                G(jA);
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56869g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                com.google.common.cache.l<K, V> lVar = (com.google.common.cache.l) atomicReferenceArray.get(length);
                for (com.google.common.cache.l next = lVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f56864b.f56830f.d(k10, key)) {
                        s<K, V> valueReference = next.getValueReference();
                        if (!valueReference.a() && (!z10 || jA - next.getWriteTime() >= this.f56864b.f56838n)) {
                            this.f56867e++;
                            k<K, V> kVar = new k<>(valueReference);
                            next.setValueReference(kVar);
                            return kVar;
                        }
                        return null;
                    }
                }
                this.f56867e++;
                k<K, V> kVar2 = new k<>();
                com.google.common.cache.l<K, V> lVarC = C(k10, i10, lVar);
                lVarC.setValueReference(kVar2);
                atomicReferenceArray.set(length, lVarC);
                return kVar2;
            } finally {
                unlock();
                F();
            }
        }

        p0<V> z(K k10, int i10, k<K, V> kVar, CacheLoader<? super K, V> cacheLoader) {
            p0<V> p0VarJ = kVar.j(k10, cacheLoader);
            p0VarJ.V(new a(k10, i10, kVar, p0VarJ), y0.c());
            return p0VarJ;
        }
    }

    public enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.c();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> s<K, V> referenceValue(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, V v10, int i10) {
                return i10 == 1 ? new p(v10) : new a0(v10, i10);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.g();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> s<K, V> referenceValue(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, V v10, int i10) {
                return i10 == 1 ? new l(segment.f56872j, v10, lVar) : new z(segment.f56872j, v10, lVar, i10);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.g();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> s<K, V> referenceValue(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, V v10, int i10) {
                return i10 == 1 ? new x(segment.f56872j, v10, lVar) : new b0(segment.f56872j, v10, lVar, i10);
            }
        };

        /* synthetic */ Strength(a aVar) {
            this();
        }

        abstract Equivalence<Object> defaultEquivalence();

        abstract <K, V> s<K, V> referenceValue(Segment<K, V> segment, com.google.common.cache.l<K, V> lVar, V v10, int i10);
    }

    public class a implements s<Object, Object> {
        a() {
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean a() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.s
        public int b() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.s
        public com.google.common.cache.l<Object, Object> c() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.s
        public void d(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.s
        public Object e() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.s
        public s<Object, Object> f(ReferenceQueue<Object> referenceQueue, @CheckForNull Object obj, com.google.common.cache.l<Object, Object> lVar) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.s
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean isActive() {
            return false;
        }
    }

    public static final class a0<K, V> extends p<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f56883c;

        a0(V v10, int i10) {
            super(v10);
            this.f56883c = i10;
        }

        @Override // com.google.common.cache.LocalCache.p, com.google.common.cache.LocalCache.s
        public int b() {
            return this.f56883c;
        }
    }

    public class b extends AbstractQueue<Object> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.D().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    public static final class b0<K, V> extends x<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f56884c;

        b0(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar, int i10) {
            super(referenceQueue, v10, lVar);
            this.f56884c = i10;
        }

        @Override // com.google.common.cache.LocalCache.x, com.google.common.cache.LocalCache.s
        public int b() {
            return this.f56884c;
        }

        @Override // com.google.common.cache.LocalCache.x, com.google.common.cache.LocalCache.s
        public s<K, V> f(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar) {
            return new b0(referenceQueue, v10, lVar, this.f56884c);
        }
    }

    public abstract class c<T> extends AbstractSet<T> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return LocalCache.X(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.X(this).toArray(eArr);
        }
    }

    public static final class c0<K, V> extends AbstractQueue<com.google.common.cache.l<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.cache.l<K, V> f56886b = new a(this);

        public class a extends d<K, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @u9.g
            com.google.common.cache.l<K, V> f56887b = this;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @u9.g
            com.google.common.cache.l<K, V> f56888c = this;

            a(c0 c0Var) {
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public com.google.common.cache.l<K, V> getNextInWriteQueue() {
                return this.f56887b;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public com.google.common.cache.l<K, V> getPreviousInWriteQueue() {
                return this.f56888c;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public void setNextInWriteQueue(com.google.common.cache.l<K, V> lVar) {
                this.f56887b = lVar;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public void setPreviousInWriteQueue(com.google.common.cache.l<K, V> lVar) {
                this.f56888c = lVar;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public void setWriteTime(long j10) {
            }
        }

        public class b extends com.google.common.collect.g<com.google.common.cache.l<K, V>> {
            b(com.google.common.cache.l lVar) {
                super(lVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.l<K, V> a(com.google.common.cache.l<K, V> lVar) {
                com.google.common.cache.l<K, V> nextInWriteQueue = lVar.getNextInWriteQueue();
                if (nextInWriteQueue == c0.this.f56886b) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        c0() {
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.l<K, V> lVar) {
            LocalCache.d(lVar.getPreviousInWriteQueue(), lVar.getNextInWriteQueue());
            LocalCache.d(this.f56886b.getPreviousInWriteQueue(), lVar);
            LocalCache.d(lVar, this.f56886b);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.l<K, V> peek() {
            com.google.common.cache.l<K, V> nextInWriteQueue = this.f56886b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f56886b) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.l<K, V> nextInWriteQueue = this.f56886b.getNextInWriteQueue();
            while (true) {
                com.google.common.cache.l<K, V> lVar = this.f56886b;
                if (nextInWriteQueue == lVar) {
                    lVar.setNextInWriteQueue(lVar);
                    com.google.common.cache.l<K, V> lVar2 = this.f56886b;
                    lVar2.setPreviousInWriteQueue(lVar2);
                    return;
                } else {
                    com.google.common.cache.l<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.J(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.l) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.l<K, V> poll() {
            com.google.common.cache.l<K, V> nextInWriteQueue = this.f56886b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f56886b) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f56886b.getNextInWriteQueue() == this.f56886b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.l<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.l lVar = (com.google.common.cache.l) obj;
            com.google.common.cache.l<K, V> previousInWriteQueue = lVar.getPreviousInWriteQueue();
            com.google.common.cache.l<K, V> nextInWriteQueue = lVar.getNextInWriteQueue();
            LocalCache.d(previousInWriteQueue, nextInWriteQueue);
            LocalCache.J(lVar);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (com.google.common.cache.l<K, V> nextInWriteQueue = this.f56886b.getNextInWriteQueue(); nextInWriteQueue != this.f56886b; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i10++;
            }
            return i10;
        }
    }

    public static abstract class d<K, V> implements com.google.common.cache.l<K, V> {
        d() {
        }

        @Override // com.google.common.cache.l
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public s<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public void setAccessTime(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public void setNextInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public void setNextInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public void setPreviousInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public void setPreviousInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public void setValueReference(s<K, V> sVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public void setWriteTime(long j10) {
            throw new UnsupportedOperationException();
        }
    }

    public final class d0 implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f56890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        V f56891c;

        d0(K k10, V v10) {
            this.f56890b = k10;
            this.f56891c = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f56890b.equals(entry.getKey()) && this.f56891c.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f56890b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f56891c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f56890b.hashCode() ^ this.f56891c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) LocalCache.this.put(this.f56890b, v10);
            this.f56891c = v10;
            return v11;
        }

        public String toString() {
            String strValueOf = String.valueOf(getKey());
            String strValueOf2 = String.valueOf(getValue());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(strValueOf2);
            return sb2.toString();
        }
    }

    public static final class e<K, V> extends AbstractQueue<com.google.common.cache.l<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.cache.l<K, V> f56893b = new a(this);

        public class a extends d<K, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @u9.g
            com.google.common.cache.l<K, V> f56894b = this;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @u9.g
            com.google.common.cache.l<K, V> f56895c = this;

            a(e eVar) {
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public com.google.common.cache.l<K, V> getNextInAccessQueue() {
                return this.f56894b;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public com.google.common.cache.l<K, V> getPreviousInAccessQueue() {
                return this.f56895c;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public void setAccessTime(long j10) {
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public void setNextInAccessQueue(com.google.common.cache.l<K, V> lVar) {
                this.f56894b = lVar;
            }

            @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
            public void setPreviousInAccessQueue(com.google.common.cache.l<K, V> lVar) {
                this.f56895c = lVar;
            }
        }

        public class b extends com.google.common.collect.g<com.google.common.cache.l<K, V>> {
            b(com.google.common.cache.l lVar) {
                super(lVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.l<K, V> a(com.google.common.cache.l<K, V> lVar) {
                com.google.common.cache.l<K, V> nextInAccessQueue = lVar.getNextInAccessQueue();
                if (nextInAccessQueue == e.this.f56893b) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        e() {
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.l<K, V> lVar) {
            LocalCache.c(lVar.getPreviousInAccessQueue(), lVar.getNextInAccessQueue());
            LocalCache.c(this.f56893b.getPreviousInAccessQueue(), lVar);
            LocalCache.c(lVar, this.f56893b);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.l<K, V> peek() {
            com.google.common.cache.l<K, V> nextInAccessQueue = this.f56893b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f56893b) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.l<K, V> nextInAccessQueue = this.f56893b.getNextInAccessQueue();
            while (true) {
                com.google.common.cache.l<K, V> lVar = this.f56893b;
                if (nextInAccessQueue == lVar) {
                    lVar.setNextInAccessQueue(lVar);
                    com.google.common.cache.l<K, V> lVar2 = this.f56893b;
                    lVar2.setPreviousInAccessQueue(lVar2);
                    return;
                } else {
                    com.google.common.cache.l<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.I(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.l) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.l<K, V> poll() {
            com.google.common.cache.l<K, V> nextInAccessQueue = this.f56893b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f56893b) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f56893b.getNextInAccessQueue() == this.f56893b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.l<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.l lVar = (com.google.common.cache.l) obj;
            com.google.common.cache.l<K, V> previousInAccessQueue = lVar.getPreviousInAccessQueue();
            com.google.common.cache.l<K, V> nextInAccessQueue = lVar.getNextInAccessQueue();
            LocalCache.c(previousInAccessQueue, nextInAccessQueue);
            LocalCache.I(lVar);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (com.google.common.cache.l<K, V> nextInAccessQueue = this.f56893b.getNextInAccessQueue(); nextInAccessQueue != this.f56893b; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i10++;
            }
            return i10;
        }
    }

    public final class f extends LocalCache<K, V>.h<Map.Entry<K, V>> {
        f(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.h, java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    public final class g extends LocalCache<K, V>.c<Map.Entry<K, V>> {
        g() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.f56831g.d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    public abstract class h<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f56898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f56899c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        Segment<K, V> f56900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        AtomicReferenceArray<com.google.common.cache.l<K, V>> f56901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        com.google.common.cache.l<K, V> f56902f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        LocalCache<K, V>.d0 f56903g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        LocalCache<K, V>.d0 f56904h;

        h() {
            this.f56898b = LocalCache.this.f56828d.length - 1;
            a();
        }

        final void a() {
            this.f56903g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i10 = this.f56898b;
                if (i10 < 0) {
                    return;
                }
                Segment<K, V>[] segmentArr = LocalCache.this.f56828d;
                this.f56898b = i10 - 1;
                Segment<K, V> segment = segmentArr[i10];
                this.f56900d = segment;
                if (segment.f56865c != 0) {
                    AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56900d.f56869g;
                    this.f56901e = atomicReferenceArray;
                    this.f56899c = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(com.google.common.cache.l<K, V> lVar) {
            boolean z10;
            try {
                long jA = LocalCache.this.f56841q.a();
                K key = lVar.getKey();
                Object objW = LocalCache.this.w(lVar, jA);
                if (objW != null) {
                    this.f56903g = new d0(key, objW);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return z10;
            } finally {
                this.f56900d.E();
            }
        }

        LocalCache<K, V>.d0 c() {
            LocalCache<K, V>.d0 d0Var = this.f56903g;
            if (d0Var == null) {
                throw new NoSuchElementException();
            }
            this.f56904h = d0Var;
            a();
            return this.f56904h;
        }

        boolean d() {
            com.google.common.cache.l<K, V> lVar = this.f56902f;
            if (lVar == null) {
                return false;
            }
            while (true) {
                this.f56902f = lVar.getNext();
                com.google.common.cache.l<K, V> lVar2 = this.f56902f;
                if (lVar2 == null) {
                    return false;
                }
                if (b(lVar2)) {
                    return true;
                }
                lVar = this.f56902f;
            }
        }

        boolean e() {
            while (true) {
                int i10 = this.f56899c;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = this.f56901e;
                this.f56899c = i10 - 1;
                com.google.common.cache.l<K, V> lVar = atomicReferenceArray.get(i10);
                this.f56902f = lVar;
                if (lVar != null && (b(lVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56903g != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.w.g0(this.f56904h != null);
            LocalCache.this.remove(this.f56904h.getKey());
            this.f56904h = null;
        }
    }

    public final class i extends LocalCache<K, V>.h<K> {
        i(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.h, java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    public final class j extends LocalCache<K, V>.c<K> {
        j() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new i(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    public static class k<K, V> implements s<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile s<K, V> f56907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h1<V> f56908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.a0 f56909d;

        public class a implements com.google.common.base.n<V, V> {
            a() {
            }

            @Override // com.google.common.base.n
            public V apply(V v10) {
                k.this.k(v10);
                return v10;
            }
        }

        public k() {
            this(LocalCache.Y());
        }

        public k(s<K, V> sVar) {
            this.f56908c = h1.F();
            this.f56909d = com.google.common.base.a0.e();
            this.f56907b = sVar;
        }

        private p0<V> h(Throwable th2) {
            return j0.l(th2);
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean a() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.s
        public int b() {
            return this.f56907b.b();
        }

        @Override // com.google.common.cache.LocalCache.s
        public com.google.common.cache.l<K, V> c() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.s
        public void d(@CheckForNull V v10) {
            if (v10 != null) {
                k(v10);
            } else {
                this.f56907b = LocalCache.Y();
            }
        }

        @Override // com.google.common.cache.LocalCache.s
        public V e() throws ExecutionException {
            return (V) v1.f(this.f56908c);
        }

        @Override // com.google.common.cache.LocalCache.s
        public s<K, V> f(ReferenceQueue<V> referenceQueue, @CheckForNull V v10, com.google.common.cache.l<K, V> lVar) {
            return this;
        }

        public long g() {
            return this.f56909d.g(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.s
        public V get() {
            return this.f56907b.get();
        }

        public s<K, V> i() {
            return this.f56907b;
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean isActive() {
            return this.f56907b.isActive();
        }

        public p0<V> j(K k10, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f56909d.k();
                V v10 = this.f56907b.get();
                if (v10 == null) {
                    V vD = cacheLoader.d(k10);
                    return k(vD) ? this.f56908c : j0.m(vD);
                }
                p0<V> p0VarF = cacheLoader.f(k10, v10);
                return p0VarF == null ? j0.m(null) : j0.x(p0VarF, new a(), y0.c());
            } catch (Throwable th2) {
                p0<V> p0VarH = l(th2) ? this.f56908c : h(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return p0VarH;
            }
        }

        public boolean k(@CheckForNull V v10) {
            return this.f56908c.B(v10);
        }

        public boolean l(Throwable th2) {
            return this.f56908c.C(th2);
        }
    }

    public static class l<K, V> extends SoftReference<V> implements s<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.cache.l<K, V> f56911b;

        l(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar) {
            super(v10, referenceQueue);
            this.f56911b = lVar;
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean a() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.s
        public int b() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.s
        public com.google.common.cache.l<K, V> c() {
            return this.f56911b;
        }

        @Override // com.google.common.cache.LocalCache.s
        public void d(V v10) {
        }

        @Override // com.google.common.cache.LocalCache.s
        public V e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.s
        public s<K, V> f(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar) {
            return new l(referenceQueue, v10, lVar);
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean isActive() {
            return true;
        }
    }

    public static final class m<K, V> extends o<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f56912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56913g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56914h;

        m(K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            super(k10, i10, lVar);
            this.f56912f = Long.MAX_VALUE;
            this.f56913g = LocalCache.H();
            this.f56914h = LocalCache.H();
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public long getAccessTime() {
            return this.f56912f;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInAccessQueue() {
            return this.f56913g;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInAccessQueue() {
            return this.f56914h;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setAccessTime(long j10) {
            this.f56912f = j10;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setNextInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56913g = lVar;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setPreviousInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56914h = lVar;
        }
    }

    public static final class n<K, V> extends o<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f56915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56917h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile long f56918i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56919j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56920k;

        n(K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            super(k10, i10, lVar);
            this.f56915f = Long.MAX_VALUE;
            this.f56916g = LocalCache.H();
            this.f56917h = LocalCache.H();
            this.f56918i = Long.MAX_VALUE;
            this.f56919j = LocalCache.H();
            this.f56920k = LocalCache.H();
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public long getAccessTime() {
            return this.f56915f;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInAccessQueue() {
            return this.f56916g;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInWriteQueue() {
            return this.f56919j;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInAccessQueue() {
            return this.f56917h;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInWriteQueue() {
            return this.f56920k;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public long getWriteTime() {
            return this.f56918i;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setAccessTime(long j10) {
            this.f56915f = j10;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setNextInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56916g = lVar;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setNextInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56919j = lVar;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setPreviousInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56917h = lVar;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setPreviousInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56920k = lVar;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setWriteTime(long j10) {
            this.f56918i = j10;
        }
    }

    public static class o<K, V> extends d<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f56921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f56922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        final com.google.common.cache.l<K, V> f56923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile s<K, V> f56924e = LocalCache.Y();

        o(K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            this.f56921b = k10;
            this.f56922c = i10;
            this.f56923d = lVar;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public int getHash() {
            return this.f56922c;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public K getKey() {
            return this.f56921b;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNext() {
            return this.f56923d;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public s<K, V> getValueReference() {
            return this.f56924e;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setValueReference(s<K, V> sVar) {
            this.f56924e = sVar;
        }
    }

    public static class p<K, V> implements s<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final V f56925b;

        p(V v10) {
            this.f56925b = v10;
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean a() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.s
        public int b() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.s
        public com.google.common.cache.l<K, V> c() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.s
        public void d(V v10) {
        }

        @Override // com.google.common.cache.LocalCache.s
        public V e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.s
        public s<K, V> f(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.s
        public V get() {
            return this.f56925b;
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean isActive() {
            return true;
        }
    }

    public static final class q<K, V> extends o<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f56926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56928h;

        q(K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            super(k10, i10, lVar);
            this.f56926f = Long.MAX_VALUE;
            this.f56927g = LocalCache.H();
            this.f56928h = LocalCache.H();
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInWriteQueue() {
            return this.f56927g;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInWriteQueue() {
            return this.f56928h;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public long getWriteTime() {
            return this.f56926f;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setNextInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56927g = lVar;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setPreviousInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56928h = lVar;
        }

        @Override // com.google.common.cache.LocalCache.d, com.google.common.cache.l
        public void setWriteTime(long j10) {
            this.f56926f = j10;
        }
    }

    public final class r extends LocalCache<K, V>.h<V> {
        r(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.h, java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    public interface s<K, V> {
        boolean a();

        int b();

        @CheckForNull
        com.google.common.cache.l<K, V> c();

        void d(@CheckForNull V v10);

        V e() throws ExecutionException;

        s<K, V> f(ReferenceQueue<V> referenceQueue, @CheckForNull V v10, com.google.common.cache.l<K, V> lVar);

        @CheckForNull
        V get();

        boolean isActive();
    }

    public final class t extends AbstractCollection<V> {
        t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new r(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.X(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.X(this).toArray(eArr);
        }
    }

    public static final class u<K, V> extends w<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f56930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56932g;

        u(ReferenceQueue<K> referenceQueue, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            super(referenceQueue, k10, i10, lVar);
            this.f56930e = Long.MAX_VALUE;
            this.f56931f = LocalCache.H();
            this.f56932g = LocalCache.H();
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public long getAccessTime() {
            return this.f56930e;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInAccessQueue() {
            return this.f56931f;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInAccessQueue() {
            return this.f56932g;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setAccessTime(long j10) {
            this.f56930e = j10;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setNextInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56931f = lVar;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setPreviousInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56932g = lVar;
        }
    }

    public static final class v<K, V> extends w<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f56933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56935g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile long f56936h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56937i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56938j;

        v(ReferenceQueue<K> referenceQueue, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            super(referenceQueue, k10, i10, lVar);
            this.f56933e = Long.MAX_VALUE;
            this.f56934f = LocalCache.H();
            this.f56935g = LocalCache.H();
            this.f56936h = Long.MAX_VALUE;
            this.f56937i = LocalCache.H();
            this.f56938j = LocalCache.H();
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public long getAccessTime() {
            return this.f56933e;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInAccessQueue() {
            return this.f56934f;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInWriteQueue() {
            return this.f56937i;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInAccessQueue() {
            return this.f56935g;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInWriteQueue() {
            return this.f56938j;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public long getWriteTime() {
            return this.f56936h;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setAccessTime(long j10) {
            this.f56933e = j10;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setNextInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56934f = lVar;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setNextInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56937i = lVar;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setPreviousInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56935g = lVar;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setPreviousInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56938j = lVar;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setWriteTime(long j10) {
            this.f56936h = j10;
        }
    }

    public static class w<K, V> extends WeakReference<K> implements com.google.common.cache.l<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f56939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        final com.google.common.cache.l<K, V> f56940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile s<K, V> f56941d;

        w(ReferenceQueue<K> referenceQueue, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            super(k10, referenceQueue);
            this.f56941d = LocalCache.Y();
            this.f56939b = i10;
            this.f56940c = lVar;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public int getHash() {
            return this.f56939b;
        }

        @Override // com.google.common.cache.l
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNext() {
            return this.f56940c;
        }

        public com.google.common.cache.l<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.l<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.l<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.l<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public s<K, V> getValueReference() {
            return this.f56941d;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j10) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(com.google.common.cache.l<K, V> lVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.l
        public void setValueReference(s<K, V> sVar) {
            this.f56941d = sVar;
        }

        public void setWriteTime(long j10) {
            throw new UnsupportedOperationException();
        }
    }

    public static class x<K, V> extends WeakReference<V> implements s<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.cache.l<K, V> f56942b;

        x(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar) {
            super(v10, referenceQueue);
            this.f56942b = lVar;
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean a() {
            return false;
        }

        public int b() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.s
        public com.google.common.cache.l<K, V> c() {
            return this.f56942b;
        }

        @Override // com.google.common.cache.LocalCache.s
        public void d(V v10) {
        }

        @Override // com.google.common.cache.LocalCache.s
        public V e() {
            return get();
        }

        public s<K, V> f(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar) {
            return new x(referenceQueue, v10, lVar);
        }

        @Override // com.google.common.cache.LocalCache.s
        public boolean isActive() {
            return true;
        }
    }

    public static final class y<K, V> extends w<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f56943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56944f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @u9.g
        com.google.common.cache.l<K, V> f56945g;

        y(ReferenceQueue<K> referenceQueue, K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
            super(referenceQueue, k10, i10, lVar);
            this.f56943e = Long.MAX_VALUE;
            this.f56944f = LocalCache.H();
            this.f56945g = LocalCache.H();
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getNextInWriteQueue() {
            return this.f56944f;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public com.google.common.cache.l<K, V> getPreviousInWriteQueue() {
            return this.f56945g;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public long getWriteTime() {
            return this.f56943e;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setNextInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56944f = lVar;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setPreviousInWriteQueue(com.google.common.cache.l<K, V> lVar) {
            this.f56945g = lVar;
        }

        @Override // com.google.common.cache.LocalCache.w, com.google.common.cache.l
        public void setWriteTime(long j10) {
            this.f56943e = j10;
        }
    }

    public static final class z<K, V> extends l<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f56946c;

        z(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar, int i10) {
            super(referenceQueue, v10, lVar);
            this.f56946c = i10;
        }

        @Override // com.google.common.cache.LocalCache.l, com.google.common.cache.LocalCache.s
        public int b() {
            return this.f56946c;
        }

        @Override // com.google.common.cache.LocalCache.l, com.google.common.cache.LocalCache.s
        public s<K, V> f(ReferenceQueue<V> referenceQueue, V v10, com.google.common.cache.l<K, V> lVar) {
            return new z(referenceQueue, v10, lVar, this.f56946c);
        }
    }

    LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, @CheckForNull CacheLoader<? super K, V> cacheLoader) {
        this.f56829e = Math.min(cacheBuilder.j(), 65536);
        Strength strengthO = cacheBuilder.o();
        this.f56832h = strengthO;
        this.f56833i = cacheBuilder.v();
        this.f56830f = cacheBuilder.n();
        this.f56831g = cacheBuilder.u();
        long jP = cacheBuilder.p();
        this.f56834j = jP;
        this.f56835k = (com.google.common.cache.q<K, V>) cacheBuilder.w();
        this.f56836l = cacheBuilder.k();
        this.f56837m = cacheBuilder.l();
        this.f56838n = cacheBuilder.q();
        CacheBuilder.NullListener nullListener = (com.google.common.cache.m<K, V>) cacheBuilder.r();
        this.f56840p = nullListener;
        this.f56839o = nullListener == CacheBuilder.NullListener.INSTANCE ? h() : new ConcurrentLinkedQueue<>();
        this.f56841q = cacheBuilder.t(O());
        this.f56842r = EntryFactory.getFactory(strengthO, Z(), d0());
        this.f56843s = cacheBuilder.s().get();
        this.f56844t = cacheLoader;
        int iMin = Math.min(cacheBuilder.m(), 1073741824);
        if (i() && !g()) {
            iMin = (int) Math.min(iMin, jP);
        }
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f56829e && (!i() || i13 * 20 <= this.f56834j)) {
            i12++;
            i13 <<= 1;
        }
        this.f56827c = 32 - i12;
        this.f56826b = i13 - 1;
        this.f56828d = F(i13);
        int i14 = iMin / i13;
        while (i11 < (i14 * i13 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        if (i()) {
            long j10 = this.f56834j;
            long j11 = i13;
            long j12 = (j10 / j11) + 1;
            long j13 = j10 % j11;
            while (true) {
                Segment<K, V>[] segmentArr = this.f56828d;
                if (i10 >= segmentArr.length) {
                    return;
                }
                if (i10 == j13) {
                    j12--;
                }
                segmentArr[i10] = f(i11, j12, cacheBuilder.s().get());
                i10++;
            }
        } else {
            while (true) {
                Segment<K, V>[] segmentArr2 = this.f56828d;
                if (i10 >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i10] = f(i11, -1L, cacheBuilder.s().get());
                i10++;
            }
        }
    }

    static <K, V> com.google.common.cache.l<K, V> H() {
        return NullEntry.INSTANCE;
    }

    static <K, V> void I(com.google.common.cache.l<K, V> lVar) {
        com.google.common.cache.l<K, V> lVarH = H();
        lVar.setNextInAccessQueue(lVarH);
        lVar.setPreviousInAccessQueue(lVarH);
    }

    static <K, V> void J(com.google.common.cache.l<K, V> lVar) {
        com.google.common.cache.l<K, V> lVarH = H();
        lVar.setNextInWriteQueue(lVarH);
        lVar.setPreviousInWriteQueue(lVarH);
    }

    static int V(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> X(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V> s<K, V> Y() {
        return (s<K, V>) D;
    }

    static <K, V> void c(com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
        lVar.setNextInAccessQueue(lVar2);
        lVar2.setPreviousInAccessQueue(lVar);
    }

    static <K, V> void d(com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
        lVar.setNextInWriteQueue(lVar2);
        lVar2.setPreviousInWriteQueue(lVar);
    }

    static <E> Queue<E> h() {
        return (Queue<E>) E;
    }

    boolean A(com.google.common.cache.l<K, V> lVar, long j10) {
        com.google.common.base.w.E(lVar);
        if (!k() || j10 - lVar.getAccessTime() < this.f56836l) {
            return l() && j10 - lVar.getWriteTime() >= this.f56837m;
        }
        return true;
    }

    @o9.d
    boolean B(com.google.common.cache.l<K, V> lVar, long j10) {
        return W(lVar.getHash()).v(lVar, j10) != null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    @CheckForNull
    Map<K, V> C(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws Throwable {
        com.google.common.base.w.E(cacheLoader);
        com.google.common.base.w.E(set);
        com.google.common.base.a0 a0VarC = com.google.common.base.a0.c();
        boolean z10 = true;
        boolean z11 = false;
        try {
            try {
                try {
                    try {
                        try {
                            Map<? super K, V> mapE = cacheLoader.e(set);
                            if (mapE == null) {
                                this.f56843s.e(a0VarC.g(TimeUnit.NANOSECONDS));
                                String strValueOf = String.valueOf(cacheLoader);
                                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31);
                                sb2.append(strValueOf);
                                sb2.append(" returned null map from loadAll");
                                throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
                            }
                            a0VarC.l();
                            for (Map.Entry<K, V> entry : mapE.entrySet()) {
                                K key = entry.getKey();
                                V value = entry.getValue();
                                if (key == null || value == null) {
                                    z11 = true;
                                } else {
                                    put(key, value);
                                }
                            }
                            if (!z11) {
                                this.f56843s.c(a0VarC.g(TimeUnit.NANOSECONDS));
                                return mapE;
                            }
                            this.f56843s.e(a0VarC.g(TimeUnit.NANOSECONDS));
                            String strValueOf2 = String.valueOf(cacheLoader);
                            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 42);
                            sb3.append(strValueOf2);
                            sb3.append(" returned null keys or values from loadAll");
                            throw new CacheLoader.InvalidCacheLoadException(sb3.toString());
                        } catch (RuntimeException e10) {
                            throw new UncheckedExecutionException(e10);
                        }
                    } catch (InterruptedException e11) {
                        Thread.currentThread().interrupt();
                        throw new ExecutionException(e11);
                    }
                } catch (Error e12) {
                    throw new ExecutionError(e12);
                }
            } catch (CacheLoader.UnsupportedLoadingOperationException e13) {
                try {
                    throw e13;
                } catch (Throwable th2) {
                    th = th2;
                    if (!z10) {
                        this.f56843s.e(a0VarC.g(TimeUnit.NANOSECONDS));
                    }
                    throw th;
                }
            } catch (Exception e14) {
                throw new ExecutionException(e14);
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
            if (!z10) {
                this.f56843s.e(a0VarC.g(TimeUnit.NANOSECONDS));
            }
            throw th;
        }
    }

    long D() {
        long jMax = 0;
        for (Segment<K, V> segment : this.f56828d) {
            jMax += (long) Math.max(0, segment.f56865c);
        }
        return jMax;
    }

    @o9.d
    com.google.common.cache.l<K, V> E(K k10, int i10, @CheckForNull com.google.common.cache.l<K, V> lVar) {
        Segment<K, V> segmentW = W(i10);
        segmentW.lock();
        try {
            return segmentW.C(k10, i10, lVar);
        } finally {
            segmentW.unlock();
        }
    }

    final Segment<K, V>[] F(int i10) {
        return new Segment[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @o9.d
    s<K, V> G(com.google.common.cache.l<K, V> lVar, V v10, int i10) {
        return this.f56833i.referenceValue(W(lVar.getHash()), lVar, com.google.common.base.w.E(v10), i10);
    }

    void K() {
        while (true) {
            RemovalNotification<K, V> removalNotificationPoll = this.f56839o.poll();
            if (removalNotificationPoll == null) {
                return;
            }
            try {
                this.f56840p.onRemoval(removalNotificationPoll);
            } catch (Throwable th2) {
                C.log(Level.WARNING, "Exception thrown by removal listener", th2);
            }
        }
    }

    void L(com.google.common.cache.l<K, V> lVar) {
        int hash = lVar.getHash();
        W(hash).I(lVar, hash);
    }

    void M(s<K, V> sVar) {
        com.google.common.cache.l<K, V> lVarC = sVar.c();
        int hash = lVarC.getHash();
        W(hash).J(lVarC.getKey(), hash, sVar);
    }

    boolean N() {
        return k();
    }

    boolean O() {
        return P() || N();
    }

    boolean P() {
        return l() || U();
    }

    void T(K k10) {
        int iY = y(com.google.common.base.w.E(k10));
        W(iY).N(k10, iY, this.f56844t, false);
    }

    boolean U() {
        return this.f56838n > 0;
    }

    Segment<K, V> W(int i10) {
        return this.f56828d[(i10 >>> this.f56827c) & this.f56826b];
    }

    boolean Z() {
        return a0() || N();
    }

    boolean a0() {
        return k() || i();
    }

    public void b() {
        for (Segment<K, V> segment : this.f56828d) {
            segment.a();
        }
    }

    boolean b0() {
        return this.f56832h != Strength.STRONG;
    }

    boolean c0() {
        return this.f56833i != Strength.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V> segment : this.f56828d) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        int iY = y(obj);
        return W(iY).e(obj, iY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        long jA = this.f56841q.a();
        Segment<K, V>[] segmentArr = this.f56828d;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            long j11 = 0;
            int length = segmentArr.length;
            for (?? r12 = z10; r12 < length; r12++) {
                Segment<K, V> segment = segmentArr[r12];
                int i11 = segment.f56865c;
                AtomicReferenceArray<com.google.common.cache.l<K, V>> atomicReferenceArray = segment.f56869g;
                for (?? r15 = z10; r15 < atomicReferenceArray.length(); r15++) {
                    com.google.common.cache.l<K, V> next = atomicReferenceArray.get(r15);
                    while (next != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V v10 = segment.v(next, jA);
                        long j12 = jA;
                        if (v10 != null && this.f56831g.d(obj, v10)) {
                            return true;
                        }
                        next = next.getNext();
                        segmentArr = segmentArr2;
                        jA = j12;
                    }
                }
                j11 += (long) segment.f56867e;
                jA = jA;
                z10 = false;
            }
            long j13 = jA;
            Segment<K, V>[] segmentArr3 = segmentArr;
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
            segmentArr = segmentArr3;
            jA = j13;
            z10 = false;
        }
        return z10;
    }

    boolean d0() {
        return e0() || P();
    }

    @o9.d
    com.google.common.cache.l<K, V> e(com.google.common.cache.l<K, V> lVar, com.google.common.cache.l<K, V> lVar2) {
        return W(lVar.getHash()).g(lVar, lVar2);
    }

    boolean e0() {
        return l();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @o9.c
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f56847w;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f56847w = gVar;
        return gVar;
    }

    Segment<K, V> f(int i10, long j10, com.google.common.cache.a.b bVar) {
        return new Segment<>(this, i10, j10, bVar);
    }

    boolean g() {
        return this.f56835k != CacheBuilder.OneWeigher.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iY = y(obj);
        return W(iY).p(obj, iY);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V getOrDefault(@CheckForNull Object obj, @CheckForNull V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    boolean i() {
        return this.f56834j >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.f56828d;
        long j10 = 0;
        for (int i10 = 0; i10 < segmentArr.length; i10++) {
            if (segmentArr[i10].f56865c != 0) {
                return false;
            }
            j10 += (long) segmentArr[i10].f56867e;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < segmentArr.length; i11++) {
            if (segmentArr[i11].f56865c != 0) {
                return false;
            }
            j10 -= (long) segmentArr[i11].f56867e;
        }
        return j10 == 0;
    }

    boolean j() {
        return l() || k();
    }

    boolean k() {
        return this.f56836l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f56845u;
        if (set != null) {
            return set;
        }
        j jVar = new j();
        this.f56845u = jVar;
        return jVar;
    }

    boolean l() {
        return this.f56837m > 0;
    }

    V n(K k10, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int iY = y(com.google.common.base.w.E(k10));
        return W(iY).q(k10, iY, cacheLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    ImmutableMap<K, V> p(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapC0 = Maps.c0();
        LinkedHashSet linkedHashSetA = Sets.A();
        int i10 = 0;
        int i11 = 0;
        for (K k10 : iterable) {
            Object obj = get(k10);
            if (!linkedHashMapC0.containsKey(k10)) {
                linkedHashMapC0.put(k10, obj);
                if (obj == null) {
                    i11++;
                    linkedHashSetA.add(k10);
                } else {
                    i10++;
                }
            }
        }
        try {
            if (!linkedHashSetA.isEmpty()) {
                try {
                    Map mapC = C(Collections.unmodifiableSet(linkedHashSetA), this.f56844t);
                    for (Object obj2 : linkedHashSetA) {
                        Object obj3 = mapC.get(obj2);
                        if (obj3 == null) {
                            String strValueOf = String.valueOf(obj2);
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37);
                            sb2.append("loadAll failed to return a value for ");
                            sb2.append(strValueOf);
                            throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
                        }
                        linkedHashMapC0.put(obj2, obj3);
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : linkedHashSetA) {
                        i11--;
                        linkedHashMapC0.put(obj4, n(obj4, this.f56844t));
                    }
                }
            }
            ImmutableMap<K, V> immutableMapG = ImmutableMap.g(linkedHashMapC0);
            this.f56843s.a(i10);
            this.f56843s.d(i11);
            return immutableMapG;
        } catch (Throwable th2) {
            this.f56843s.a(i10);
            this.f56843s.d(i11);
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v10);
        int iY = y(k10);
        return W(iY).H(k10, iY, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v10);
        int iY = y(k10);
        return W(iY).H(k10, iY, v10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    ImmutableMap<K, V> r(Iterable<?> iterable) {
        ImmutableMap.b bVarB = ImmutableMap.b();
        int i10 = 0;
        int i11 = 0;
        for (Object obj : iterable) {
            V v10 = get(obj);
            if (v10 == null) {
                i11++;
            } else {
                bVarB.i(obj, v10);
                i10++;
            }
        }
        this.f56843s.a(i10);
        this.f56843s.d(i11);
        return bVarB.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iY = y(obj);
        return W(iY).O(obj, iY);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iY = y(obj);
        return W(iY).P(obj, iY, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v10);
        int iY = y(k10);
        return W(iY).V(k10, iY, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, @CheckForNull V v10, V v11) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v11);
        if (v10 == null) {
            return false;
        }
        int iY = y(k10);
        return W(iY).W(k10, iY, v10, v11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.x(D());
    }

    com.google.common.cache.l<K, V> u(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iY = y(obj);
        return W(iY).s(obj, iY);
    }

    @CheckForNull
    public V v(Object obj) {
        int iY = y(com.google.common.base.w.E(obj));
        V vP = W(iY).p(obj, iY);
        if (vP == null) {
            this.f56843s.d(1);
        } else {
            this.f56843s.a(1);
        }
        return vP;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f56846v;
        if (collection != null) {
            return collection;
        }
        t tVar = new t();
        this.f56846v = tVar;
        return tVar;
    }

    @CheckForNull
    V w(com.google.common.cache.l<K, V> lVar, long j10) {
        V v10;
        if (lVar.getKey() == null || (v10 = lVar.getValueReference().get()) == null || A(lVar, j10)) {
            return null;
        }
        return v10;
    }

    V x(K k10) throws ExecutionException {
        return n(k10, this.f56844t);
    }

    int y(@CheckForNull Object obj) {
        return V(this.f56830f.f(obj));
    }

    void z(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }
}

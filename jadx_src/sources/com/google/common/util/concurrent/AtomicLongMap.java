package com.google.common.util.concurrent;

import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public final class AtomicLongMap<K> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<K, AtomicLong> f59202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private transient Map<K, Long> f59203c;

    public class a implements com.google.common.base.n<AtomicLong, Long> {
        a(AtomicLongMap atomicLongMap) {
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(AtomicLong atomicLong) {
            return Long.valueOf(atomicLong.get());
        }
    }

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.f59202b = (ConcurrentHashMap) com.google.common.base.w.E(concurrentHashMap);
    }

    public static <K> AtomicLongMap<K> d() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    public static <K> AtomicLongMap<K> e(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> atomicLongMapD = d();
        atomicLongMapD.o(map);
        return atomicLongMapD;
    }

    private Map<K, Long> f() {
        return Collections.unmodifiableMap(Maps.B0(this.f59202b, new a(this)));
    }

    @s9.a
    public long a(K k10, long j10) {
        AtomicLong atomicLongPutIfAbsent;
        long j11;
        long j12;
        do {
            atomicLongPutIfAbsent = this.f59202b.get(k10);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f59202b.putIfAbsent(k10, new AtomicLong(j10))) == null) {
                return j10;
            }
            do {
                j11 = atomicLongPutIfAbsent.get();
                if (j11 != 0) {
                    j12 = j11 + j10;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j11, j12));
            return j12;
        } while (!this.f59202b.replace(k10, atomicLongPutIfAbsent, new AtomicLong(j10)));
        return j10;
    }

    public Map<K, Long> b() {
        Map<K, Long> map = this.f59203c;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapF = f();
        this.f59203c = mapF;
        return mapF;
    }

    public boolean c(Object obj) {
        return this.f59202b.containsKey(obj);
    }

    public void clear() {
        this.f59202b.clear();
    }

    @s9.a
    public long g(K k10) {
        return a(k10, -1L);
    }

    public long h(K k10) {
        AtomicLong atomicLong = this.f59202b.get(k10);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @s9.a
    public long i(K k10, long j10) {
        AtomicLong atomicLongPutIfAbsent;
        long j11;
        do {
            atomicLongPutIfAbsent = this.f59202b.get(k10);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f59202b.putIfAbsent(k10, new AtomicLong(j10))) == null) {
                return 0L;
            }
            do {
                j11 = atomicLongPutIfAbsent.get();
                if (j11 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j11, j11 + j10));
            return j11;
        } while (!this.f59202b.replace(k10, atomicLongPutIfAbsent, new AtomicLong(j10)));
        return 0L;
    }

    @s9.a
    public long j(K k10) {
        return i(k10, -1L);
    }

    @s9.a
    public long k(K k10) {
        return i(k10, 1L);
    }

    @s9.a
    public long l(K k10) {
        return a(k10, 1L);
    }

    public boolean m() {
        return this.f59202b.isEmpty();
    }

    @s9.a
    public long n(K k10, long j10) {
        AtomicLong atomicLongPutIfAbsent;
        long j11;
        do {
            atomicLongPutIfAbsent = this.f59202b.get(k10);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f59202b.putIfAbsent(k10, new AtomicLong(j10))) == null) {
                return 0L;
            }
            do {
                j11 = atomicLongPutIfAbsent.get();
                if (j11 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j11, j10));
            return j11;
        } while (!this.f59202b.replace(k10, atomicLongPutIfAbsent, new AtomicLong(j10)));
        return 0L;
    }

    public void o(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            n(entry.getKey(), entry.getValue().longValue());
        }
    }

    long p(K k10, long j10) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.f59202b.get(k10);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.f59202b.putIfAbsent(k10, new AtomicLong(j10))) == null) {
                return 0L;
            }
            long j11 = atomicLongPutIfAbsent.get();
            if (j11 != 0) {
                return j11;
            }
        } while (!this.f59202b.replace(k10, atomicLongPutIfAbsent, new AtomicLong(j10)));
        return 0L;
    }

    @s9.a
    public long q(K k10) {
        long j10;
        AtomicLong atomicLong = this.f59202b.get(k10);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j10 = atomicLong.get();
            if (j10 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j10, 0L));
        this.f59202b.remove(k10, atomicLong);
        return j10;
    }

    boolean r(K k10, long j10) {
        AtomicLong atomicLong = this.f59202b.get(k10);
        if (atomicLong == null) {
            return false;
        }
        long j11 = atomicLong.get();
        if (j11 != j10) {
            return false;
        }
        if (j11 != 0 && !atomicLong.compareAndSet(j11, 0L)) {
            return false;
        }
        this.f59202b.remove(k10, atomicLong);
        return true;
    }

    public void s() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.f59202b.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    @o9.a
    @s9.a
    public boolean t(K k10) {
        return r(k10, 0L);
    }

    public String toString() {
        return this.f59202b.toString();
    }

    boolean u(K k10, long j10, long j11) {
        if (j10 == 0) {
            return p(k10, j11) == 0;
        }
        AtomicLong atomicLong = this.f59202b.get(k10);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j10, j11);
    }

    public int v() {
        return this.f59202b.size();
    }

    public long w() {
        Iterator<AtomicLong> it = this.f59202b.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += it.next().get();
        }
        return j10;
    }
}

package com.google.common.hash;

import com.google.common.base.c0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
@h
public final class LongAddables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0<r> f58484a;

    public static final class PureJavaLongAddable extends AtomicLong implements r {
        private PureJavaLongAddable() {
        }

        /* synthetic */ PureJavaLongAddable(a aVar) {
            this();
        }

        @Override // com.google.common.hash.r
        public void a() {
            getAndIncrement();
        }

        @Override // com.google.common.hash.r
        public void add(long j10) {
            getAndAdd(j10);
        }

        @Override // com.google.common.hash.r
        public long sum() {
            return get();
        }
    }

    public class a implements c0<r> {
        a() {
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r get() {
            return new LongAdder();
        }
    }

    public class b implements c0<r> {
        b() {
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        c0<r> bVar;
        try {
            new LongAdder();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f58484a = bVar;
    }

    LongAddables() {
    }

    public static r a() {
        return f58484a.get();
    }
}

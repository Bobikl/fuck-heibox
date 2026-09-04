package com.google.common.cache;

import com.google.common.base.c0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b(emulated = true)
public final class LongAddables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0<j> f56947a;

    public static final class PureJavaLongAddable extends AtomicLong implements j {
        private PureJavaLongAddable() {
        }

        /* synthetic */ PureJavaLongAddable(a aVar) {
            this();
        }

        @Override // com.google.common.cache.j
        public void a() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.j
        public void add(long j10) {
            getAndAdd(j10);
        }

        @Override // com.google.common.cache.j
        public long sum() {
            return get();
        }
    }

    public class a implements c0<j> {
        a() {
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j get() {
            return new LongAdder();
        }
    }

    public class b implements c0<j> {
        b() {
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        c0<j> bVar;
        try {
            new LongAdder();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f56947a = bVar;
    }

    LongAddables() {
    }

    public static j a() {
        return f56947a.get();
    }
}

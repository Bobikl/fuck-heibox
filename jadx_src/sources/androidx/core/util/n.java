package androidx.core.util;

import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: compiled from: Pools.java */
    public interface a<T> {
        @p0
        T a();

        boolean b(@n0 T t10);
    }

    /* JADX INFO: compiled from: Pools.java */
    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f21291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21292b;

        public b(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f21291a = new Object[i10];
        }

        private boolean c(@n0 T t10) {
            for (int i10 = 0; i10 < this.f21292b; i10++) {
                if (this.f21291a[i10] == t10) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.n.a
        public T a() {
            int i10 = this.f21292b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            Object[] objArr = this.f21291a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f21292b = i10 - 1;
            return t10;
        }

        @Override // androidx.core.util.n.a
        public boolean b(@n0 T t10) {
            if (c(t10)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i10 = this.f21292b;
            Object[] objArr = this.f21291a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f21292b = i10 + 1;
            return true;
        }
    }

    /* JADX INFO: compiled from: Pools.java */
    public static class c<T> extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f21293c;

        public c(int i10) {
            super(i10);
            this.f21293c = new Object();
        }

        @Override // androidx.core.util.n.b, androidx.core.util.n.a
        public T a() {
            T t10;
            synchronized (this.f21293c) {
                t10 = (T) super.a();
            }
            return t10;
        }

        @Override // androidx.core.util.n.b, androidx.core.util.n.a
        public boolean b(@n0 T t10) {
            boolean zB;
            synchronized (this.f21293c) {
                zB = super.b(t10);
            }
            return zB;
        }
    }

    private n() {
    }
}

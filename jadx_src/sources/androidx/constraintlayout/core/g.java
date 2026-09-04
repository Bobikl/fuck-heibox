package androidx.constraintlayout.core;

/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f17362a = false;

    /* JADX INFO: compiled from: Pools.java */
    public interface a<T> {
        T a();

        boolean b(T t10);

        void c(T[] tArr, int i10);
    }

    /* JADX INFO: compiled from: Pools.java */
    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f17363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17364b;

        b(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f17363a = new Object[i10];
        }

        private boolean d(T t10) {
            for (int i10 = 0; i10 < this.f17364b; i10++) {
                if (this.f17363a[i10] == t10) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.g.a
        public T a() {
            int i10 = this.f17364b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            Object[] objArr = this.f17363a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f17364b = i10 - 1;
            return t10;
        }

        @Override // androidx.constraintlayout.core.g.a
        public boolean b(T t10) {
            int i10 = this.f17364b;
            Object[] objArr = this.f17363a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f17364b = i10 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.g.a
        public void c(T[] tArr, int i10) {
            if (i10 > tArr.length) {
                i10 = tArr.length;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                T t10 = tArr[i11];
                int i12 = this.f17364b;
                Object[] objArr = this.f17363a;
                if (i12 < objArr.length) {
                    objArr[i12] = t10;
                    this.f17364b = i12 + 1;
                }
            }
        }
    }

    private g() {
    }
}

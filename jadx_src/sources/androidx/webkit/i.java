package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: TracingConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28339d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28340e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f28341f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f28342g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f28343h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f28344i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f28345j = 32;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f28346k = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f28347l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f28348m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f28350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28351c;

    /* JADX INFO: compiled from: TracingConfig.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f28352a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f28353b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28354c = 1;

        @n0
        public a a(@n0 Collection<String> collection) {
            this.f28353b.addAll(collection);
            return this;
        }

        @n0
        public a b(@n0 int... iArr) {
            for (int i10 : iArr) {
                this.f28352a = i10 | this.f28352a;
            }
            return this;
        }

        @n0
        public a c(@n0 String... strArr) {
            this.f28353b.addAll(Arrays.asList(strArr));
            return this;
        }

        @n0
        public i d() {
            return new i(this.f28352a, this.f28353b, this.f28354c);
        }

        @n0
        public a e(int i10) {
            this.f28354c = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: TracingConfig.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    /* JADX INFO: compiled from: TracingConfig.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public i(int i10, @n0 List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f28350b = arrayList;
        this.f28349a = i10;
        arrayList.addAll(list);
        this.f28351c = i11;
    }

    @n0
    public List<String> a() {
        return this.f28350b;
    }

    public int b() {
        return this.f28349a;
    }

    public int c() {
        return this.f28351c;
    }
}

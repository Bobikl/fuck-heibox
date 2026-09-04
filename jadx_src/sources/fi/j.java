package fi;

import kotlin.collections.k0;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class j implements Iterable<Integer>, zh.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f118869e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118872d;

    /* JADX INFO: compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final j a(int i10, int i11, int i12) {
            return new j(i10, i11, i12);
        }
    }

    public j(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f118870b = i10;
        this.f118871c = sh.n.c(i10, i11, i12);
        this.f118872d = i12;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (this.f118870b != jVar.f118870b || this.f118871c != jVar.f118871c || this.f118872d != jVar.f118872d) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h() {
        return this.f118870b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f118870b * 31) + this.f118871c) * 31) + this.f118872d;
    }

    public final int i() {
        return this.f118871c;
    }

    public boolean isEmpty() {
        if (this.f118872d > 0) {
            if (this.f118870b > this.f118871c) {
                return true;
            }
        } else if (this.f118870b < this.f118871c) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f118872d;
    }

    @Override // java.lang.Iterable
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public k0 iterator() {
        return new k(this.f118870b, this.f118871c, this.f118872d);
    }

    @dl.d
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f118872d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f118870b);
            sb2.append("..");
            sb2.append(this.f118871c);
            sb2.append(" step ");
            i10 = this.f118872d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f118870b);
            sb2.append(" downTo ");
            sb2.append(this.f118871c);
            sb2.append(" step ");
            i10 = -this.f118872d;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}

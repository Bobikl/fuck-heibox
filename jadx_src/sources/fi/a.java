package fi;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a implements Iterable<Character>, zh.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final C1073a f118849e = new C1073a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f118850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f118851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118852d;

    /* JADX INFO: renamed from: fi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Progressions.kt */
    public static final class C1073a {
        private C1073a() {
        }

        public /* synthetic */ C1073a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final a a(char c10, char c11, int i10) {
            return new a(c10, c11, i10);
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f118850b = c10;
        this.f118851c = (char) sh.n.c(c10, c11, i10);
        this.f118852d = i10;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f118850b != aVar.f118850b || this.f118851c != aVar.f118851c || this.f118852d != aVar.f118852d) {
                }
            }
            return true;
        }
        return false;
    }

    public final char h() {
        return this.f118850b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f118850b * 31) + this.f118851c) * 31) + this.f118852d;
    }

    public final char i() {
        return this.f118851c;
    }

    public boolean isEmpty() {
        if (this.f118852d > 0) {
            if (f0.t(this.f118850b, this.f118851c) > 0) {
                return true;
            }
        } else if (f0.t(this.f118850b, this.f118851c) < 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f118852d;
    }

    @Override // java.lang.Iterable
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public kotlin.collections.q iterator() {
        return new b(this.f118850b, this.f118851c, this.f118852d);
    }

    @dl.d
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f118852d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f118850b);
            sb2.append("..");
            sb2.append(this.f118851c);
            sb2.append(" step ");
            i10 = this.f118852d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f118850b);
            sb2.append(" downTo ");
            sb2.append(this.f118851c);
            sb2.append(" step ");
            i10 = -this.f118852d;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}

package fi;

import java.util.Iterator;
import kotlin.e2;
import kotlin.n1;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136928s)
@e2(markerClass = {kotlin.s.class})
public class v implements Iterable<n1>, zh.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f118893e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118896d;

    /* JADX INFO: compiled from: UIntRange.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final v a(int i10, int i11, int i12) {
            return new v(i10, i11, i12, null);
        }
    }

    private v(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f118894b = i10;
        this.f118895c = sh.q.d(i10, i11, i12);
        this.f118896d = i12;
    }

    public /* synthetic */ v(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(i10, i11, i12);
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof v) {
            if (!isEmpty() || !((v) obj).isEmpty()) {
                v vVar = (v) obj;
                if (this.f118894b != vVar.f118894b || this.f118895c != vVar.f118895c || this.f118896d != vVar.f118896d) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h() {
        return this.f118894b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f118894b * 31) + this.f118895c) * 31) + this.f118896d;
    }

    public final int i() {
        return this.f118895c;
    }

    public boolean isEmpty() {
        if (this.f118896d > 0) {
            if (Integer.compare(this.f118894b ^ Integer.MIN_VALUE, this.f118895c ^ Integer.MIN_VALUE) > 0) {
                return true;
            }
        } else if (Integer.compare(this.f118894b ^ Integer.MIN_VALUE, this.f118895c ^ Integer.MIN_VALUE) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @dl.d
    public final Iterator<n1> iterator() {
        return new w(this.f118894b, this.f118895c, this.f118896d, null);
    }

    public final int j() {
        return this.f118896d;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f118896d > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) n1.l0(this.f118894b));
            sb2.append("..");
            sb2.append((Object) n1.l0(this.f118895c));
            sb2.append(" step ");
            i10 = this.f118896d;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) n1.l0(this.f118894b));
            sb2.append(" downTo ");
            sb2.append((Object) n1.l0(this.f118895c));
            sb2.append(" step ");
            i10 = -this.f118896d;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}

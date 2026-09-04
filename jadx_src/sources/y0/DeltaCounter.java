package y0;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: y0.b, reason: from toString */
/* JADX INFO: compiled from: MutableCounter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly0/b;", "", "", "that", "Lkotlin/b2;", "e", ak.av, "count", "b", "", "toString", "hashCode", "other", "", "equals", "I", "d", "()I", "f", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DeltaCounter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    private int count;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public DeltaCounter(int i10) {
        this.count = i10;
    }

    public /* synthetic */ DeltaCounter(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public static /* synthetic */ DeltaCounter c(DeltaCounter deltaCounter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = deltaCounter.count;
        }
        return deltaCounter.b(i10);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @dl.d
    public final DeltaCounter b(int count) {
        return new DeltaCounter(count);
    }

    public final int d() {
        return this.count;
    }

    public final void e(int i10) {
        this.count += i10;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeltaCounter) && this.count == ((DeltaCounter) other).count;
    }

    public final void f(int i10) {
        this.count = i10;
    }

    public int hashCode() {
        return this.count;
    }

    @dl.d
    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }
}

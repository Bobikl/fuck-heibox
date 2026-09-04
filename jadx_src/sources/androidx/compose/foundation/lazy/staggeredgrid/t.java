package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@j2
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/t;", "", "Ls1/e;", "", "availableSize", "spacing", "", ak.av, "b", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface t {

    /* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u001d\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/t$a;", "Landroidx/compose/foundation/lazy/staggeredgrid/t;", "Ls1/e;", "", "availableSize", "spacing", "", ak.av, "hashCode", "", "other", "", "equals", "Ls1/h;", "F", "minSize", "<init>", "(FLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f7399b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float minSize;

        private a(float f10) {
            this.minSize = f10;
            if (!(s1.h.f(f10, s1.h.g((float) 0)) > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public /* synthetic */ a(float f10, u uVar) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.t
        @dl.d
        public List<Integer> a(@dl.d s1.e eVar, int i10, int i11) {
            f0.p(eVar, "<this>");
            return c.b(i10, Math.max((i10 + i11) / (eVar.e1(this.minSize) + i11), 1), i11);
        }

        public boolean equals(@dl.e Object other) {
            return (other instanceof a) && s1.h.l(this.minSize, ((a) other).minSize);
        }

        public int hashCode() {
            return s1.h.n(this.minSize);
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/t$b;", "Landroidx/compose/foundation/lazy/staggeredgrid/t;", "Ls1/e;", "", "availableSize", "spacing", "", ak.av, "hashCode", "", "other", "", "equals", "I", "count", "<init>", "(I)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f7401b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int count;

        public b(int i10) {
            this.count = i10;
            if (!(i10 > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.t
        @dl.d
        public List<Integer> a(@dl.d s1.e eVar, int i10, int i11) {
            f0.p(eVar, "<this>");
            return c.b(i10, this.count, i11);
        }

        public boolean equals(@dl.e Object other) {
            return (other instanceof b) && this.count == ((b) other).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    @dl.d
    List<Integer> a(@dl.d s1.e eVar, int i10, int i11);
}

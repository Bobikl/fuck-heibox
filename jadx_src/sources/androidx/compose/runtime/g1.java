package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/g1;", "", "", "value", "Lkotlin/b2;", ak.av, "", "b", ak.aF, "d", "e", "f", "", "Ljava/util/List;", "list", "<init>", "(Ljava/util/List;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Integer> list;

    /* JADX WARN: Multi-variable type inference failed */
    public g1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public g1(@dl.d List<Integer> list) {
        kotlin.jvm.internal.f0.p(list, "list");
        this.list = list;
    }

    public /* synthetic */ g1(List list, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }

    public final void a(int i10) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() == i10) {
                return;
            }
            List<Integer> list = this.list;
            if (list.get(list.size() - 1).intValue() == i10) {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.list.get(i11).intValue();
            if (i10 <= iIntValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(iIntValue));
            size = i11;
        }
        this.list.set(size, Integer.valueOf(i10));
    }

    public final boolean b() {
        return this.list.isEmpty();
    }

    public final boolean c() {
        return !this.list.isEmpty();
    }

    public final int d() {
        return ((Number) CollectionsKt___CollectionsKt.w2(this.list)).intValue();
    }

    public final int e() {
        int iIntValue;
        if (!(this.list.size() > 0)) {
            ComposerKt.A("Set is empty".toString());
            throw new KotlinNothingValueException();
        }
        int iIntValue2 = this.list.get(0).intValue();
        while ((!this.list.isEmpty()) && this.list.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.list;
            list.set(0, (Integer) CollectionsKt___CollectionsKt.k3(list));
            List<Integer> list2 = this.list;
            list2.remove(list2.size() - 1);
            int size = this.list.size();
            int size2 = this.list.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = this.list.get(i10).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = this.list.get(i12).intValue();
                if (i11 < size && (iIntValue = this.list.get(i11).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    this.list.set(i10, Integer.valueOf(iIntValue));
                    this.list.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    this.list.set(i10, Integer.valueOf(iIntValue4));
                    this.list.set(i12, Integer.valueOf(iIntValue3));
                    i10 = i12;
                }
            }
        }
        return iIntValue2;
    }

    public final void f() {
        int size = this.list.size();
        int i10 = size / 2;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int i13 = i12 * 2;
            boolean z10 = true;
            if (!(this.list.get(i11).intValue() >= this.list.get(i13 + (-1)).intValue())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (i13 < size && this.list.get(i11).intValue() < this.list.get(i13).intValue()) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("Check failed.".toString());
            }
            i11 = i12;
        }
    }
}

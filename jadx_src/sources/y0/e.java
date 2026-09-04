package y0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: ListImplementation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00022\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\r2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Ly0/e;", "", "", UCropPlusActivity.ARG_INDEX, UiKitSpanObj.TYPE_SIZE, "Lkotlin/b2;", ak.av, "(II)V", "b", "fromIndex", "toIndex", ak.aF, "(III)V", "", "e", "(Ljava/util/Collection;)I", "other", "", "d", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f141523a = new e();

    private e() {
    }

    @m
    public static final void a(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
    }

    @m
    public static final void b(int index, int size) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
    }

    @m
    public static final void c(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0 || toIndex > size) {
            throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size);
        }
        if (fromIndex <= toIndex) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + fromIndex + " > toIndex: " + toIndex);
    }

    @m
    public static final boolean d(@dl.d Collection<?> c10, @dl.d Collection<?> other) {
        f0.p(c10, "c");
        f0.p(other, "other");
        if (c10.size() != other.size()) {
            return false;
        }
        Iterator<?> it = other.iterator();
        Iterator<?> it2 = c10.iterator();
        while (it2.hasNext()) {
            if (!f0.g(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @m
    public static final int e(@dl.d Collection<?> c10) {
        f0.p(c10, "c");
        Iterator<?> it = c10.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}

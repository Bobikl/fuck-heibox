package androidx.room;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: QueryInterceptorProgram.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/room/g1;", "Lj3/i;", "", "bindIndex", "", "value", "Lkotlin/b2;", "b", UCropPlusActivity.ARG_INDEX, "r0", "", "d0", "", "F0", "", "X", "", "l0", "R1", "close", "", "Ljava/util/List;", ak.av, "()Ljava/util/List;", "bindArgsCache", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class g1 implements j3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Object> bindArgsCache = new ArrayList();

    private final void b(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        if (i11 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i11) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i11) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i11, obj);
    }

    @Override // j3.i
    public void F0(int i10, double d10) {
        b(i10, Double.valueOf(d10));
    }

    @Override // j3.i
    public void R1() {
        this.bindArgsCache.clear();
    }

    @Override // j3.i
    public void X(int i10, @dl.d String value) {
        kotlin.jvm.internal.f0.p(value, "value");
        b(i10, value);
    }

    @dl.d
    public final List<Object> a() {
        return this.bindArgsCache;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // j3.i
    public void d0(int i10, long j10) {
        b(i10, Long.valueOf(j10));
    }

    @Override // j3.i
    public void l0(int i10, @dl.d byte[] value) {
        kotlin.jvm.internal.f0.p(value, "value");
        b(i10, value);
    }

    @Override // j3.i
    public void r0(int i10) {
        b(i10, null);
    }
}

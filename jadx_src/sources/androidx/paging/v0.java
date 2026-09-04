package androidx.paging;

import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: RecordingCallback.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0001R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/paging/v0;", "Landroidx/paging/PagedList$c;", "", CommonNetImpl.POSITION, "count", "Lkotlin/b2;", ak.av, "b", ak.aF, "other", "d", "", "Ljava/util/List;", "list", "<init>", "()V", "e", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class v0 extends PagedList.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f26658b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26659c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f26660d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> list = new ArrayList();

    @Override // androidx.paging.PagedList.c
    public void a(int i10, int i11) {
        this.list.add(0);
        this.list.add(Integer.valueOf(i10));
        this.list.add(Integer.valueOf(i11));
    }

    @Override // androidx.paging.PagedList.c
    public void b(int i10, int i11) {
        this.list.add(1);
        this.list.add(Integer.valueOf(i10));
        this.list.add(Integer.valueOf(i11));
    }

    @Override // androidx.paging.PagedList.c
    public void c(int i10, int i11) {
        this.list.add(2);
        this.list.add(Integer.valueOf(i10));
        this.list.add(Integer.valueOf(i11));
    }

    public final void d(@dl.d PagedList.c other) {
        kotlin.jvm.internal.f0.p(other, "other");
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.list.size()), 3);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if (iJ < 0 ? iH >= i10 : iH <= i10) {
            while (true) {
                int iIntValue = this.list.get(iH).intValue();
                if (iIntValue == 0) {
                    other.a(this.list.get(iH + 1).intValue(), this.list.get(iH + 2).intValue());
                } else if (iIntValue == 1) {
                    other.b(this.list.get(iH + 1).intValue(), this.list.get(iH + 2).intValue());
                } else {
                    if (iIntValue != 2) {
                        throw new IllegalStateException("Unexpected recording value");
                    }
                    other.c(this.list.get(iH + 1).intValue(), this.list.get(iH + 2).intValue());
                }
                if (iH == i10) {
                    break;
                } else {
                    iH += iJ;
                }
            }
        }
        this.list.clear();
    }
}

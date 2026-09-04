package fc;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GridHorEqualSpaceItemDecoration.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f118826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f118827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f118828f;

    public a(int i10, int i11, int i12, int i13, boolean z10) {
        this.f118824b = i10;
        this.f118825c = i11;
        this.f118826d = i12;
        this.f118827e = i13;
        this.f118828f = z10;
    }

    public /* synthetic */ a(int i10, int i11, int i12, int i13, boolean z10, int i14, u uVar) {
        this(i10, i11, i12, i13, (i14 & 16) != 0 ? false : z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@d Rect outRect, @d View view, @d RecyclerView parent, @d RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, bb.c.f.km, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(outRect, "outRect");
        f0.p(view, "view");
        f0.p(parent, "parent");
        f0.p(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i10 = this.f118824b;
        if (childAdapterPosition < i10) {
            outRect.top = 0;
        } else {
            outRect.top = this.f118827e;
        }
        if (i10 <= 1) {
            int i11 = this.f118825c;
            int i12 = this.f118826d;
            outRect.left = (i11 - (i12 * i10)) / 2;
            outRect.right = (i11 - (i12 * i10)) / 2;
            return;
        }
        int i13 = childAdapterPosition % i10;
        int iU = fi.u.u(this.f118828f ? (this.f118825c - (this.f118826d * i10)) / (i10 + 1) : (this.f118825c - (this.f118826d * i10)) / (i10 - 1), 0);
        if (this.f118828f) {
            int i14 = this.f118824b;
            outRect.left = iU - ((i13 * iU) / i14);
            outRect.right = ((i13 + 1) * iU) / i14;
        } else {
            int i15 = this.f118824b;
            outRect.left = (i13 * iU) / i15;
            outRect.right = iU - (((i13 + 1) * iU) / i15);
        }
    }
}

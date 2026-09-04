package le;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: GridSpacingItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f131401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f131403d;

    public a(int i10, int i11, boolean z10) {
        this.f131401b = i10;
        this.f131402c = i11;
        this.f131403d = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@n0 Rect rect, @n0 View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, bb.c.l.Sl, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f131401b;
        int i11 = childAdapterPosition % i10;
        if (this.f131403d) {
            int i12 = this.f131402c;
            rect.left = i12 - ((i11 * i12) / i10);
            rect.right = ((i11 + 1) * i12) / i10;
        } else {
            int i13 = this.f131402c;
            rect.left = (i11 * i13) / i10;
            rect.right = i13 - (((i11 + 1) * i13) / i10);
        }
        if (childAdapterPosition < i10) {
            rect.top = this.f131402c;
        }
        rect.bottom = this.f131402c;
    }
}

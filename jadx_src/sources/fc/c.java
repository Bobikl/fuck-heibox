package fc;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: HorGridSpacingItemDecoration.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f118832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f118834d;

    public c(int i10, int i11, boolean z10) {
        this.f118832b = i10;
        this.f118833c = i11;
        this.f118834d = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@n0 Rect rect, @n0 View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, bb.c.f.mm, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f118832b;
        int i11 = childAdapterPosition % i10;
        if (this.f118834d) {
            int i12 = this.f118833c;
            rect.top = i12 - ((i11 * i12) / i10);
            rect.bottom = ((i11 + 1) * i12) / i10;
        } else {
            int i13 = this.f118833c;
            rect.top = (i11 * i13) / i10;
            rect.bottom = i13 - (((i11 + 1) * i13) / i10);
        }
        if (childAdapterPosition < i10) {
            rect.left = 0;
        } else {
            rect.left = this.f118833c;
        }
    }
}

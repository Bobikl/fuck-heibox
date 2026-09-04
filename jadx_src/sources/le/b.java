package le;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: HorizontalItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f131404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131405c;

    public b(int i10, int i11) {
        this.f131404b = i10;
        this.f131405c = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@n0 Rect rect, @n0 View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, bb.c.l.Tl, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f131404b;
        int i11 = childAdapterPosition % i10;
        if (childAdapterPosition == 0) {
            int i12 = this.f131405c;
            rect.left = i12 - ((i11 * i12) / i10);
        } else {
            rect.left = (this.f131405c * i11) / i10;
        }
        int i13 = this.f131405c;
        rect.right = i13 - (((i11 + 1) * i13) / i10);
        if (childAdapterPosition < i10) {
            rect.top = i13;
        }
        rect.bottom = i13;
    }
}

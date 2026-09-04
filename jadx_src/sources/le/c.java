package le;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ViewPage2ItemDecoration.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f131406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131407c;

    public c(int i10, int i11) {
        this.f131406b = i10;
        this.f131407c = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, @n0 View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, bb.c.l.Ul, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f131406b;
        int i11 = childAdapterPosition % i10;
        int i12 = this.f131407c;
        rect.left = i12 - ((i11 * i12) / i10);
        rect.right = ((i11 + 1) * i12) / i10;
    }
}

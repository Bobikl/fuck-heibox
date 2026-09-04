package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.core.view.j1;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: FragmentViewHolder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends RecyclerView.ViewHolder {
    private a(@n0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @n0
    static a a(@n0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(j1.D());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    @n0
    FrameLayout b() {
        return (FrameLayout) this.itemView;
    }
}

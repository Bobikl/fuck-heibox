package androidx.recyclerview.widget;

import androidx.annotation.n0;

/* JADX INFO: loaded from: classes6.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {

    @n0
    private final RecyclerView.Adapter mAdapter;

    public AdapterListUpdateCallback(@n0 RecyclerView.Adapter adapter) {
        this.mAdapter = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i10, int i11, Object obj) {
        this.mAdapter.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        this.mAdapter.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        this.mAdapter.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        this.mAdapter.notifyItemRangeRemoved(i10, i11);
    }
}

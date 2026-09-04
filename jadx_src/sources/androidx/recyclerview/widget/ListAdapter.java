package androidx.recyclerview.widget;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    final AsyncListDiffer<T> mDiffer;
    private final AsyncListDiffer.ListListener<T> mListener;

    protected ListAdapter(@n0 AsyncDifferConfig<T> asyncDifferConfig) {
        AsyncListDiffer.ListListener<T> listListener = new AsyncListDiffer.ListListener<T>() { // from class: androidx.recyclerview.widget.ListAdapter.1
            @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
            public void onCurrentListChanged(@n0 List<T> list, @n0 List<T> list2) {
                ListAdapter.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = listListener;
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.mDiffer = asyncListDiffer;
        asyncListDiffer.addListListener(listListener);
    }

    protected ListAdapter(@n0 DiffUtil.ItemCallback<T> itemCallback) {
        AsyncListDiffer.ListListener<T> listListener = new AsyncListDiffer.ListListener<T>() { // from class: androidx.recyclerview.widget.ListAdapter.1
            @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
            public void onCurrentListChanged(@n0 List<T> list, @n0 List<T> list2) {
                ListAdapter.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = listListener;
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), new AsyncDifferConfig.Builder(itemCallback).build());
        this.mDiffer = asyncListDiffer;
        asyncListDiffer.addListListener(listListener);
    }

    @n0
    public List<T> getCurrentList() {
        return this.mDiffer.getCurrentList();
    }

    protected T getItem(int i10) {
        return this.mDiffer.getCurrentList().get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDiffer.getCurrentList().size();
    }

    public void onCurrentListChanged(@n0 List<T> list, @n0 List<T> list2) {
    }

    public void submitList(@p0 List<T> list) {
        this.mDiffer.submitList(list);
    }

    public void submitList(@p0 List<T> list, @p0 Runnable runnable) {
        this.mDiffer.submitList(list, runnable);
    }
}

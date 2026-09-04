package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.util.o;

/* JADX INFO: loaded from: classes6.dex */
public class NestedAdapterWrapper {
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
    private RecyclerView.AdapterDataObserver mAdapterObserver = new RecyclerView.AdapterDataObserver() { // from class: androidx.recyclerview.widget.NestedAdapterWrapper.1
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCachedItemCount = nestedAdapterWrapper.adapter.getItemCount();
            NestedAdapterWrapper nestedAdapterWrapper2 = NestedAdapterWrapper.this;
            nestedAdapterWrapper2.mCallback.onChanged(nestedAdapterWrapper2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCallback.onItemRangeChanged(nestedAdapterWrapper, i10, i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11, @p0 Object obj) {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCallback.onItemRangeChanged(nestedAdapterWrapper, i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCachedItemCount += i11;
            nestedAdapterWrapper.mCallback.onItemRangeInserted(nestedAdapterWrapper, i10, i11);
            NestedAdapterWrapper nestedAdapterWrapper2 = NestedAdapterWrapper.this;
            if (nestedAdapterWrapper2.mCachedItemCount <= 0 || nestedAdapterWrapper2.adapter.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            NestedAdapterWrapper nestedAdapterWrapper3 = NestedAdapterWrapper.this;
            nestedAdapterWrapper3.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i10, int i11, int i12) {
            o.b(i12 == 1, "moving more than 1 item is not supported in RecyclerView");
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCallback.onItemRangeMoved(nestedAdapterWrapper, i10, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCachedItemCount -= i11;
            nestedAdapterWrapper.mCallback.onItemRangeRemoved(nestedAdapterWrapper, i10, i11);
            NestedAdapterWrapper nestedAdapterWrapper2 = NestedAdapterWrapper.this;
            if (nestedAdapterWrapper2.mCachedItemCount >= 1 || nestedAdapterWrapper2.adapter.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            NestedAdapterWrapper nestedAdapterWrapper3 = NestedAdapterWrapper.this;
            nestedAdapterWrapper3.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            NestedAdapterWrapper nestedAdapterWrapper = NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper);
        }
    };
    int mCachedItemCount;
    final Callback mCallback;

    @n0
    private final StableIdStorage.StableIdLookup mStableIdLookup;

    @n0
    private final ViewTypeStorage.ViewTypeLookup mViewTypeLookup;

    public interface Callback {
        void onChanged(@n0 NestedAdapterWrapper nestedAdapterWrapper);

        void onItemRangeChanged(@n0 NestedAdapterWrapper nestedAdapterWrapper, int i10, int i11);

        void onItemRangeChanged(@n0 NestedAdapterWrapper nestedAdapterWrapper, int i10, int i11, @p0 Object obj);

        void onItemRangeInserted(@n0 NestedAdapterWrapper nestedAdapterWrapper, int i10, int i11);

        void onItemRangeMoved(@n0 NestedAdapterWrapper nestedAdapterWrapper, int i10, int i11);

        void onItemRangeRemoved(@n0 NestedAdapterWrapper nestedAdapterWrapper, int i10, int i11);

        void onStateRestorationPolicyChanged(NestedAdapterWrapper nestedAdapterWrapper);
    }

    NestedAdapterWrapper(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter, Callback callback, ViewTypeStorage viewTypeStorage, StableIdStorage.StableIdLookup stableIdLookup) {
        this.adapter = adapter;
        this.mCallback = callback;
        this.mViewTypeLookup = viewTypeStorage.createViewTypeWrapper(this);
        this.mStableIdLookup = stableIdLookup;
        this.mCachedItemCount = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.mAdapterObserver);
    }

    void dispose() {
        this.adapter.unregisterAdapterDataObserver(this.mAdapterObserver);
        this.mViewTypeLookup.dispose();
    }

    int getCachedItemCount() {
        return this.mCachedItemCount;
    }

    public long getItemId(int i10) {
        return this.mStableIdLookup.localToGlobal(this.adapter.getItemId(i10));
    }

    int getItemViewType(int i10) {
        return this.mViewTypeLookup.localToGlobal(this.adapter.getItemViewType(i10));
    }

    void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        this.adapter.bindViewHolder(viewHolder, i10);
    }

    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.adapter.onCreateViewHolder(viewGroup, this.mViewTypeLookup.globalToLocal(i10));
    }
}

package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.n0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    static final String TAG = "ConcatAdapter";
    private final ConcatAdapterController mController;

    public static final class Config {

        @n0
        public static final Config DEFAULT = new Config(true, StableIdMode.NO_STABLE_IDS);
        public final boolean isolateViewTypes;

        @n0
        public final StableIdMode stableIdMode;

        public static final class Builder {
            private boolean mIsolateViewTypes;
            private StableIdMode mStableIdMode;

            public Builder() {
                Config config = Config.DEFAULT;
                this.mIsolateViewTypes = config.isolateViewTypes;
                this.mStableIdMode = config.stableIdMode;
            }

            @n0
            public Config build() {
                return new Config(this.mIsolateViewTypes, this.mStableIdMode);
            }

            @n0
            public Builder setIsolateViewTypes(boolean z10) {
                this.mIsolateViewTypes = z10;
                return this;
            }

            @n0
            public Builder setStableIdMode(@n0 StableIdMode stableIdMode) {
                this.mStableIdMode = stableIdMode;
                return this;
            }
        }

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        Config(boolean z10, @n0 StableIdMode stableIdMode) {
            this.isolateViewTypes = z10;
            this.stableIdMode = stableIdMode;
        }
    }

    public ConcatAdapter(@n0 Config config, @n0 List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> list) {
        this.mController = new ConcatAdapterController(this, config);
        Iterator<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> it = list.iterator();
        while (it.hasNext()) {
            addAdapter(it.next());
        }
        super.setHasStableIds(this.mController.hasStableIds());
    }

    @SafeVarargs
    public ConcatAdapter(@n0 Config config, @n0 RecyclerView.Adapter<? extends RecyclerView.ViewHolder>... adapterArr) {
        this(config, (List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>>) Arrays.asList(adapterArr));
    }

    public ConcatAdapter(@n0 List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> list) {
        this(Config.DEFAULT, list);
    }

    @SafeVarargs
    public ConcatAdapter(@n0 RecyclerView.Adapter<? extends RecyclerView.ViewHolder>... adapterArr) {
        this(Config.DEFAULT, adapterArr);
    }

    public boolean addAdapter(int i10, @n0 RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        return this.mController.addAdapter(i10, adapter);
    }

    public boolean addAdapter(@n0 RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        return this.mController.addAdapter(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int findRelativeAdapterPositionIn(@n0 RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter, @n0 RecyclerView.ViewHolder viewHolder, int i10) {
        return this.mController.getLocalAdapterPosition(adapter, viewHolder, i10);
    }

    @n0
    public List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> getAdapters() {
        return Collections.unmodifiableList(this.mController.getCopyOfAdapters());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mController.getTotalCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return this.mController.getItemId(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.mController.getItemViewType(i10);
    }

    void internalSetStateRestorationPolicy(@n0 RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        this.mController.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        this.mController.onBindViewHolder(viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    public RecyclerView.ViewHolder onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        return this.mController.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@n0 RecyclerView recyclerView) {
        this.mController.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@n0 RecyclerView.ViewHolder viewHolder) {
        return this.mController.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@n0 RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@n0 RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@n0 RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewRecycled(viewHolder);
    }

    public boolean removeAdapter(@n0 RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        return this.mController.removeAdapter(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(@n0 RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}

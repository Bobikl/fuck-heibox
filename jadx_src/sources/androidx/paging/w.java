package androidx.paging;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: LoadStateAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u001f\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R*\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/paging/w;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", CommonNetImpl.POSITION, "Lkotlin/b2;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "getItemCount", "Landroidx/paging/v;", "loadState", "q", "(Landroid/view/ViewGroup;Landroidx/paging/v;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "p", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/paging/v;)V", "o", "", "m", "b", "Landroidx/paging/v;", "n", "()Landroidx/paging/v;", "r", "(Landroidx/paging/v;)V", "<init>", "()V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public abstract class w<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private v loadState = new v.NotLoading(false);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return m(this.loadState) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int position) {
        return o(this.loadState);
    }

    public boolean m(@dl.d v loadState) {
        kotlin.jvm.internal.f0.p(loadState, "loadState");
        return (loadState instanceof v.Loading) || (loadState instanceof v.Error);
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final v getLoadState() {
        return this.loadState;
    }

    public int o(@dl.d v loadState) {
        kotlin.jvm.internal.f0.p(loadState, "loadState");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@dl.d VH holder, int position) {
        kotlin.jvm.internal.f0.p(holder, "holder");
        p(holder, this.loadState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    public final VH onCreateViewHolder(@dl.d ViewGroup parent, int viewType) {
        kotlin.jvm.internal.f0.p(parent, "parent");
        return (VH) q(parent, this.loadState);
    }

    public abstract void p(@dl.d VH holder, @dl.d v loadState);

    @dl.d
    public abstract VH q(@dl.d ViewGroup parent, @dl.d v loadState);

    public final void r(@dl.d v loadState) {
        kotlin.jvm.internal.f0.p(loadState, "loadState");
        if (!kotlin.jvm.internal.f0.g(this.loadState, loadState)) {
            boolean zM = m(this.loadState);
            boolean zM2 = m(loadState);
            if (zM && !zM2) {
                notifyItemRemoved(0);
            } else if (zM2 && !zM) {
                notifyItemInserted(0);
            } else if (zM && zM2) {
                notifyItemChanged(0);
            }
            this.loadState = loadState;
        }
    }
}

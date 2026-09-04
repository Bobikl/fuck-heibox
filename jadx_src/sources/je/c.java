package je;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BaseAnimationAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RecyclerView.Adapter<RecyclerView.ViewHolder> f124329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f124330c = 250;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Interpolator f124331d = new LinearInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f124332e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f124333f = true;

    public c(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        this.f124329b = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Sh, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f124329b.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Uh, new Class[]{Integer.TYPE}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f124329b.getItemId(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Th, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f124329b.getItemViewType(i10);
    }

    public abstract Animator[] m(View view);

    public RecyclerView.Adapter<RecyclerView.ViewHolder> n() {
        return this.f124329b;
    }

    public void o(int i10) {
        this.f124330c = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.l.Mh, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f124329b.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Qh, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f124329b.onBindViewHolder(viewHolder, i10);
        int adapterPosition = viewHolder.getAdapterPosition();
        if (this.f124333f && adapterPosition <= this.f124332e) {
            e.a(viewHolder.itemView);
            return;
        }
        for (Animator animator : m(viewHolder.itemView)) {
            animator.setDuration(this.f124330c).start();
            animator.setInterpolator(this.f124331d);
        }
        this.f124332e = adapterPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Jh, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : this.f124329b.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.l.Nh, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f124329b.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.l.Oh, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        this.f124329b.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.l.Ph, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        this.f124329b.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.l.Rh, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f124329b.onViewRecycled(viewHolder);
        super.onViewRecycled(viewHolder);
    }

    public void p(boolean z10) {
        this.f124333f = z10;
    }

    public void q(Interpolator interpolator) {
        this.f124331d = interpolator;
    }

    public void r(int i10) {
        this.f124332e = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        if (PatchProxy.proxy(new Object[]{adapterDataObserver}, this, changeQuickRedirect, false, bb.c.l.Kh, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE).isSupported) {
            return;
        }
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f124329b.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        if (PatchProxy.proxy(new Object[]{adapterDataObserver}, this, changeQuickRedirect, false, bb.c.l.Lh, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE).isSupported) {
            return;
        }
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f124329b.unregisterAdapterDataObserver(adapterDataObserver);
    }
}

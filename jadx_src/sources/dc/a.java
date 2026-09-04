package dc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a<T> extends RecyclerView.Adapter<b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private List<T> f108179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f108180c;

    public a(@d List<T> dataList, @i0 int i10) {
        f0.p(dataList, "dataList");
        this.f108179b = dataList;
        this.f108180c = i10;
    }

    public abstract void bindViewHolder(@d b bVar, T t10, int i10);

    @d
    public final List<T> getDataList() {
        return this.f108179b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.fm, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f108179b.size();
    }

    public final int getLayoutID() {
        return this.f108180c;
    }

    public final void loadMore(@d List<? extends T> data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, c.f.gm, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        int size = data.size();
        int size2 = this.f108179b.size();
        this.f108179b.addAll(data);
        notifyItemRangeChanged(size2, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, c.f.im, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((b) viewHolder, i10);
    }

    public void onBindViewHolder(@d b holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, c.f.em, new Class[]{b.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        bindViewHolder(holder, this.f108179b.get(i10), i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, c.f.hm, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @d
    public b onCreateViewHolder(@d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, c.f.dm, new Class[]{ViewGroup.class, Integer.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f108180c, parent, false);
        f0.m(viewInflate);
        return new b(viewInflate);
    }

    public final void setDataList(@d List<T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.f.cm, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f108179b = list;
    }
}

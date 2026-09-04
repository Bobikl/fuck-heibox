package com.max.mediaselector.lib.adapter;

import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.adapter.holder.i;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: PicturePreviewAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends RecyclerView.Adapter<com.max.mediaselector.lib.adapter.holder.b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<LocalMedia> f74826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.max.mediaselector.lib.adapter.holder.b.d f74827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashMap<Integer, com.max.mediaselector.lib.adapter.holder.b> f74828d = new LinkedHashMap<>();

    public d(List<LocalMedia> list, com.max.mediaselector.lib.adapter.holder.b.d dVar) {
        this.f74826b = list;
        this.f74827c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Nf, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<LocalMedia> list = this.f74826b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Mf, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (f.i(this.f74826b.get(i10).A())) {
            return 2;
        }
        return f.e(this.f74826b.get(i10).A()) ? 3 : 1;
    }

    public void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Rf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<Integer> it = this.f74828d.keySet().iterator();
        while (it.hasNext()) {
            com.max.mediaselector.lib.adapter.holder.b bVar = this.f74828d.get(it.next());
            if (bVar instanceof i) {
                ((i) bVar).o();
            } else if (bVar instanceof com.max.mediaselector.lib.adapter.holder.f) {
                ((com.max.mediaselector.lib.adapter.holder.f) bVar).C();
            }
        }
    }

    public com.max.mediaselector.lib.adapter.holder.b n(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Jf, new Class[]{Integer.TYPE}, com.max.mediaselector.lib.adapter.holder.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.mediaselector.lib.adapter.holder.b) patchProxyResultProxy.result : this.f74828d.get(Integer.valueOf(i10));
    }

    public void o(@n0 com.max.mediaselector.lib.adapter.holder.b bVar, int i10) {
        if (PatchProxy.proxy(new Object[]{bVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Lf, new Class[]{com.max.mediaselector.lib.adapter.holder.b.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        bVar.i(this.f74827c);
        LocalMedia localMedia = this.f74826b.get(i10);
        this.f74828d.put(Integer.valueOf(i10), bVar);
        bVar.a(localMedia, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Uf, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        o((com.max.mediaselector.lib.adapter.holder.b) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Vf, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : p(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(@n0 RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.l.Tf, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        q((com.max.mediaselector.lib.adapter.holder.b) viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(@n0 RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.l.Sf, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        r((com.max.mediaselector.lib.adapter.holder.b) viewHolder);
    }

    @n0
    public com.max.mediaselector.lib.adapter.holder.b p(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Kf, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.mediaselector.lib.adapter.holder.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.adapter.holder.b) patchProxyResultProxy.result;
        }
        if (i10 == 2) {
            int iA = com.max.mediaselector.lib.config.d.a(viewGroup.getContext(), 8);
            if (iA == 0) {
                iA = R.layout.ps_preview_video;
            }
            return com.max.mediaselector.lib.adapter.holder.b.b(viewGroup, i10, iA);
        }
        if (i10 == 3) {
            int iA2 = com.max.mediaselector.lib.config.d.a(viewGroup.getContext(), 10);
            if (iA2 == 0) {
                iA2 = R.layout.ps_preview_audio;
            }
            return com.max.mediaselector.lib.adapter.holder.b.b(viewGroup, i10, iA2);
        }
        int iA3 = com.max.mediaselector.lib.config.d.a(viewGroup.getContext(), 7);
        if (iA3 == 0) {
            iA3 = R.layout.ps_preview_image;
        }
        return com.max.mediaselector.lib.adapter.holder.b.b(viewGroup, i10, iA3);
    }

    public void q(@n0 com.max.mediaselector.lib.adapter.holder.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.l.Of, new Class[]{com.max.mediaselector.lib.adapter.holder.b.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewAttachedToWindow(bVar);
        bVar.g();
    }

    public void r(@n0 com.max.mediaselector.lib.adapter.holder.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.l.Pf, new Class[]{com.max.mediaselector.lib.adapter.holder.b.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewDetachedFromWindow(bVar);
        bVar.h();
    }

    public void s(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Qf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.lib.adapter.holder.b bVarN = n(i10);
        if (bVarN instanceof i) {
            i iVar = (i) bVarN;
            if (iVar.f74910k.getVisibility() == 8) {
                iVar.f74910k.setVisibility(0);
            }
        }
    }
}

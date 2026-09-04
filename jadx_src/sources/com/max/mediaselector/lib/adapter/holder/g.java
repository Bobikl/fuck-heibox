package com.max.mediaselector.lib.adapter.holder;

import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PreviewGalleryAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends RecyclerView.Adapter<e> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<LocalMedia> f74897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f74898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f74899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f74900e;

    /* JADX INFO: compiled from: PreviewGalleryAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f74901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74902c;

        a(e eVar, LocalMedia localMedia) {
            this.f74901b = eVar;
            this.f74902c = localMedia;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34438sh, new Class[]{View.class}, Void.TYPE).isSupported || g.this.f74899d == null) {
                return;
            }
            g.this.f74899d.a(this.f74901b.getAbsoluteAdapterPosition(), this.f74902c, view);
        }
    }

    /* JADX INFO: compiled from: PreviewGalleryAdapter.java */
    public class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f74904b;

        b(e eVar) {
            this.f74904b = eVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34460th, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (g.this.f74900e != null) {
                g.this.f74900e.a(this.f74904b, this.f74904b.getAbsoluteAdapterPosition(), view);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: PreviewGalleryAdapter.java */
    public interface c {
        void a(int i10, LocalMedia localMedia, View view);
    }

    /* JADX INFO: compiled from: PreviewGalleryAdapter.java */
    public interface d {
        void a(RecyclerView.ViewHolder viewHolder, int i10, View view);
    }

    /* JADX INFO: compiled from: PreviewGalleryAdapter.java */
    public static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f74906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f74907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ImageView f74908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        View f74909e;

        public e(View view) {
            super(view);
            this.f74906b = (ImageView) view.findViewById(R.id.ivImage);
            this.f74907c = (ImageView) view.findViewById(R.id.ivPlay);
            this.f74908d = (ImageView) view.findViewById(R.id.ivEditor);
            this.f74909e = view.findViewById(R.id.viewBorder);
            SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
            if (s.c(selectMainStyleC.p())) {
                this.f74908d.setImageResource(selectMainStyleC.p());
            }
            if (s.c(selectMainStyleC.v())) {
                this.f74909e.setBackgroundResource(selectMainStyleC.v());
            }
            int iW = selectMainStyleC.w();
            if (s.b(iW)) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(iW, iW));
            }
        }
    }

    public g(boolean z10, List<LocalMedia> list) {
        this.f74898c = z10;
        this.f74897b = new ArrayList(list);
        for (int i10 = 0; i10 < this.f74897b.size(); i10++) {
            LocalMedia localMedia = this.f74897b.get(i10);
            localMedia.A0(false);
            localMedia.c0(false);
        }
    }

    private int q(LocalMedia localMedia) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34325nh, new Class[]{LocalMedia.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        for (int i10 = 0; i10 < this.f74897b.size(); i10++) {
            LocalMedia localMedia2 = this.f74897b.get(i10);
            if (TextUtils.equals(localMedia2.E(), localMedia.E()) || localMedia2.z() == localMedia.z()) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34371ph, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f74897b.size();
    }

    public void o(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34233jh, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        int iS = s();
        if (iS != -1) {
            this.f74897b.get(iS).c0(false);
            notifyItemChanged(iS);
        }
        if (!this.f74898c || !this.f74897b.contains(localMedia)) {
            localMedia.c0(true);
            this.f74897b.add(localMedia);
            notifyItemChanged(this.f74897b.size() - 1);
        } else {
            int iQ = q(localMedia);
            LocalMedia localMedia2 = this.f74897b.get(iQ);
            localMedia2.A0(false);
            localMedia2.c0(true);
            notifyItemChanged(iQ);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34394qh, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        u((e) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34416rh, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : v(viewGroup, i10);
    }

    public void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34210ih, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74897b.clear();
    }

    public List<LocalMedia> r() {
        return this.f74897b;
    }

    public int s() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34302mh, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        for (int i10 = 0; i10 < this.f74897b.size(); i10++) {
            if (this.f74897b.get(i10).M()) {
                return i10;
            }
        }
        return -1;
    }

    public void t(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34279lh, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        int iS = s();
        if (iS != -1) {
            this.f74897b.get(iS).c0(false);
            notifyItemChanged(iS);
        }
        int iQ = q(localMedia);
        if (iQ != -1) {
            this.f74897b.get(iQ).c0(true);
            notifyItemChanged(iQ);
        }
    }

    public void u(@n0 e eVar, int i10) {
        if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34348oh, new Class[]{e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        LocalMedia localMedia = this.f74897b.get(i10);
        ColorFilter colorFilterG = s.g(eVar.itemView.getContext(), localMedia.T() ? R.color.ps_color_half_white : R.color.ps_color_transparent);
        if (localMedia.M() && localMedia.T()) {
            eVar.f74909e.setVisibility(0);
        } else {
            eVar.f74909e.setVisibility(localMedia.M() ? 0 : 8);
        }
        String strE = localMedia.E();
        if (!localMedia.P() || TextUtils.isEmpty(localMedia.u())) {
            eVar.f74908d.setVisibility(8);
        } else {
            strE = localMedia.u();
            eVar.f74908d.setVisibility(0);
        }
        eVar.f74906b.setColorFilter(colorFilterG);
        me.d dVar = PictureSelectionConfig.W3;
        if (dVar != null) {
            dVar.f(eVar.itemView.getContext(), strE, eVar.f74906b);
        }
        eVar.f74907c.setVisibility(com.max.mediaselector.lib.config.f.i(localMedia.A()) ? 0 : 8);
        eVar.itemView.setOnClickListener(new a(eVar, localMedia));
        eVar.itemView.setOnLongClickListener(new b(eVar));
    }

    @n0
    public e v(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34188hh, new Class[]{ViewGroup.class, Integer.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        int iA = com.max.mediaselector.lib.config.d.a(viewGroup.getContext(), 9);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (iA == 0) {
            iA = R.layout.ps_preview_gallery_item;
        }
        return new e(layoutInflaterFrom.inflate(iA, viewGroup, false));
    }

    public void w(LocalMedia localMedia) {
        int iQ;
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34256kh, new Class[]{LocalMedia.class}, Void.TYPE).isSupported || (iQ = q(localMedia)) == -1) {
            return;
        }
        if (this.f74898c) {
            this.f74897b.get(iQ).A0(true);
            notifyItemChanged(iQ);
        } else {
            this.f74897b.remove(iQ);
            notifyItemRemoved(iQ);
        }
    }

    public void x(c cVar) {
        this.f74899d = cVar;
    }

    public void y(d dVar) {
        this.f74900e = dVar;
    }
}

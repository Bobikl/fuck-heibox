package com.max.mediaselector.lib.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: PictureImageGridAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends RecyclerView.Adapter<com.max.mediaselector.lib.adapter.holder.c> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f74816g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f74817h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f74818i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f74819j = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f74820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<LocalMedia> f74821c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PictureSelectionConfig f74822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f74823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0600b f74824f;

    /* JADX INFO: compiled from: PictureImageGridAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.If, new Class[]{View.class}, Void.TYPE).isSupported || b.this.f74824f == null) {
                return;
            }
            b.this.f74824f.b();
        }
    }

    /* JADX INFO: renamed from: com.max.mediaselector.lib.adapter.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PictureImageGridAdapter.java */
    public interface InterfaceC0600b {
        void a();

        void b();

        void c(View view, int i10, LocalMedia localMedia);

        void d(View view, int i10);

        int e(View view, int i10, LocalMedia localMedia);
    }

    public b(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f74822d = pictureSelectionConfig;
        this.f74823e = context;
    }

    private int o(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Df, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (i10 == 1) {
            return R.layout.ps_item_grid_camera;
        }
        if (i10 == 3) {
            int iA = com.max.mediaselector.lib.config.d.a(this.f74823e, 4);
            return iA != 0 ? iA : R.layout.ps_item_grid_video;
        }
        if (i10 != 4) {
            int iA2 = com.max.mediaselector.lib.config.d.a(this.f74823e, 3);
            return iA2 != 0 ? iA2 : R.layout.ps_item_grid_image;
        }
        int iA3 = com.max.mediaselector.lib.config.d.a(this.f74823e, 5);
        return iA3 != 0 ? iA3 : R.layout.ps_item_grid_audio;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ff, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return this.f74820b ? this.f74821c.size() + 1 : this.f74821c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.Bf, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.f74820b;
        if (z10 && i10 == 0) {
            return 1;
        }
        if (z10) {
            i10--;
        }
        String strA = this.f74821c.get(i10).A();
        if (f.i(strA)) {
            return 3;
        }
        return f.e(strA) ? 4 : 2;
    }

    public ArrayList<LocalMedia> n() {
        return this.f74821c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@dl.d RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Gf, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        s((com.max.mediaselector.lib.adapter.holder.c) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Hf, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : t(viewGroup, i10);
    }

    public boolean p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Af, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f74821c.size() == 0;
    }

    public boolean q() {
        return this.f74820b;
    }

    public void r(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34568yf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        notifyItemChanged(i10);
    }

    public void s(@dl.d com.max.mediaselector.lib.adapter.holder.c cVar, int i10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Ef, new Class[]{com.max.mediaselector.lib.adapter.holder.c.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (getItemViewType(i10) == 1) {
            cVar.itemView.setOnClickListener(new a());
            return;
        }
        if (this.f74820b) {
            i10--;
        }
        cVar.g(this.f74821c.get(i10), i10);
        cVar.n(this.f74824f);
        InterfaceC0600b interfaceC0600b = this.f74824f;
        if (interfaceC0600b != null) {
            interfaceC0600b.a();
        }
    }

    @n0
    public com.max.mediaselector.lib.adapter.holder.c t(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Cf, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.mediaselector.lib.adapter.holder.c.class);
        return patchProxyResultProxy.isSupported ? (com.max.mediaselector.lib.adapter.holder.c) patchProxyResultProxy.result : com.max.mediaselector.lib.adapter.holder.c.i(viewGroup, i10, o(i10), this.f74822d);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void u(ArrayList<LocalMedia> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.l.f34590zf, new Class[]{ArrayList.class}, Void.TYPE).isSupported || arrayList == null) {
            return;
        }
        this.f74821c = arrayList;
        notifyDataSetChanged();
    }

    public void v(boolean z10) {
        this.f74820b = z10;
    }

    public void w(InterfaceC0600b interfaceC0600b) {
        this.f74824f = interfaceC0600b;
    }
}

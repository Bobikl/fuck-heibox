package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.utils.PictureCacheManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: UploadImgShowerRecyclerViewAdaper.java */
/* JADX INFO: loaded from: classes10.dex */
public class x extends RecyclerView.Adapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f80731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f80732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LayoutInflater f80733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f80734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f80735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f80736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l0.g f80737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f80738i;

    /* JADX INFO: compiled from: UploadImgShowerRecyclerViewAdaper.java */
    public interface a {
        void i0();

        void m3(int i10);
    }

    /* JADX INFO: compiled from: UploadImgShowerRecyclerViewAdaper.java */
    public class b extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f80739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f80740c;

        public b(View view) {
            super(view);
            this.f80739b = (ImageView) view.findViewById(R.id.iv_img);
            this.f80740c = (ImageView) view.findViewById(R.id.iv_del);
            this.f80739b.setOnClickListener(this);
            this.f80740c.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27494, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (x.this.f80738i && getPosition() == x.this.getItemCount() - 1) {
                if (x.this.f80736g != null) {
                    x.this.f80736g.i0();
                }
            } else if (view.getId() == R.id.iv_del) {
                x.this.f80736g.m3(getPosition());
                if (x.this.f80737h != null) {
                    x.this.f80737h.a();
                }
            }
        }
    }

    public x(Context context) {
        this.f80734e = 0;
        this.f80735f = 1;
        this.f80738i = false;
        this.f80732c = context;
        this.f80733d = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public x(Context context, boolean z10) {
        this(context);
        this.f80738i = z10;
    }

    private void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27488, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PictureCacheManager.f75668a.c();
    }

    public static boolean q(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 27493, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (String str2 : com.max.mediaselector.e.f74752e) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void u(ImageView imageView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{imageView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 27492, new Class[]{ImageView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (imageView == null || imageView.getParent() == null || ((RelativeLayout) imageView.getParent()).findViewById(R.id.iv_video) == null) {
            Log.d("cqtest", "null");
        } else {
            ((RelativeLayout) imageView.getParent()).findViewById(R.id.iv_video).setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27491, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (this.f80738i) {
            ArrayList<String> arrayList = this.f80731b;
            if (arrayList == null) {
                return 1;
            }
            return 1 + arrayList.size();
        }
        ArrayList<String> arrayList2 = this.f80731b;
        if (arrayList2 == null) {
            return 0;
        }
        return arrayList2.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        ArrayList<String> arrayList;
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 27490, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        b bVar = (b) viewHolder;
        if (this.f80738i && ((arrayList = this.f80731b) == null || arrayList.size() <= 0 || i10 >= this.f80731b.size())) {
            u(bVar.f80739b, false);
            bVar.f80739b.setImageResource(R.drawable.bbs_add_80x80);
            bVar.f80740c.setVisibility(8);
            return;
        }
        bVar.f80739b.setImageResource(R.drawable.upload_img_loading);
        if (com.max.hbutils.utils.n.q(this.f80731b.get(i10)) > 0) {
            bVar.f80739b.setImageResource(com.max.hbutils.utils.n.q(this.f80731b.get(i10)));
        } else {
            boolean zQ = q(com.max.mediaselector.e.a(this.f80731b.get(i10)));
            u(bVar.f80739b, zQ);
            if (zQ) {
                com.max.mediaselector.utils.c.u().r(this.f80731b.get(i10), bVar.f80739b, ViewUtils.f(this.f80732c, 80.0f), ViewUtils.f(this.f80732c, 80.0f));
            } else {
                com.max.mediaselector.utils.c.u().q(this.f80731b.get(i10), bVar.f80739b, ViewUtils.f(this.f80732c, 80.0f), ViewUtils.f(this.f80732c, 80.0f));
            }
        }
        bVar.f80740c.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 27489, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : new b(this.f80733d.inflate(R.layout.grid_view_item_upload_img, viewGroup, false));
    }

    public void r(ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 27487, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        if (arrayList != null) {
            this.f80731b = arrayList;
            notifyDataSetChanged();
            l0.g gVar = this.f80737h;
            if (gVar != null) {
                gVar.a();
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            p();
        }
    }

    public void s(a aVar) {
        this.f80736g = aVar;
    }

    public void t(l0.g gVar) {
        this.f80737h = gVar;
    }
}

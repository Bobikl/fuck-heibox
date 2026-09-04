package com.max.mediaselector.lib.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.max.mediaselector.lib.style.AlbumWindowStyle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PictureAlbumAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends RecyclerView.Adapter<b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<LocalMediaFolder> f74806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private oe.a f74807c;

    /* JADX INFO: renamed from: com.max.mediaselector.lib.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PictureAlbumAdapter.java */
    public class ViewOnClickListenerC0599a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f74808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalMediaFolder f74809c;

        ViewOnClickListenerC0599a(int i10, LocalMediaFolder localMediaFolder) {
            this.f74808b = i10;
            this.f74809c = localMediaFolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34546xf, new Class[]{View.class}, Void.TYPE).isSupported || a.this.f74807c == null) {
                return;
            }
            a.this.f74807c.a(this.f74808b, this.f74809c);
        }
    }

    /* JADX INFO: compiled from: PictureAlbumAdapter.java */
    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f74811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        TextView f74812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        TextView f74813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        TextView f74814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        View f74815f;

        public b(View view) {
            super(view);
            this.f74811b = (ImageView) view.findViewById(R.id.first_image);
            this.f74812c = (TextView) view.findViewById(R.id.tv_folder_name);
            this.f74813d = (TextView) view.findViewById(R.id.tv_select_tag);
            this.f74814e = (TextView) view.findViewById(R.id.tv_folder_img_count);
            this.f74815f = view.findViewById(R.id.divider);
            AlbumWindowStyle albumWindowStyleA = PictureSelectionConfig.f75017b4.a();
            int iA = albumWindowStyleA.a();
            if (iA != 0) {
                view.setBackgroundResource(iA);
            }
            int iB = albumWindowStyleA.b();
            if (iB != 0) {
                this.f74813d.setBackgroundResource(iB);
            }
            int iC = albumWindowStyleA.c();
            if (iC != 0) {
                this.f74812c.setTextColor(iC);
            }
            int iD = albumWindowStyleA.d();
            if (iD > 0) {
                this.f74812c.setTextSize(iD);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34480uf, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f74806b.size();
    }

    public void n(List<LocalMediaFolder> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.f34392qf, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f74806b = new ArrayList(list);
    }

    public List<LocalMediaFolder> o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34414rf, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<LocalMediaFolder> list = this.f74806b;
        return list != null ? list : new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"NotifyDataSetChanged"})
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34502vf, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        p((b) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34524wf, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : q(viewGroup, i10);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void p(b bVar, int i10) {
        if (PatchProxy.proxy(new Object[]{bVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34458tf, new Class[]{b.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        LocalMediaFolder localMediaFolder = this.f74806b.get(i10);
        String strH = localMediaFolder.h();
        int iJ = localMediaFolder.j();
        String strD = localMediaFolder.d();
        bVar.f74813d.setVisibility(localMediaFolder.n() ? 0 : 4);
        if (localMediaFolder.k() > 9) {
            bVar.f74813d.setText("9+");
        } else {
            bVar.f74813d.setText(String.valueOf(localMediaFolder.k()));
        }
        LocalMediaFolder localMediaFolderF = qe.a.f();
        bVar.itemView.setSelected(localMediaFolderF != null && localMediaFolder.a() == localMediaFolderF.a());
        if (f.e(localMediaFolder.f())) {
            bVar.f74811b.setImageResource(R.drawable.ps_audio_placeholder);
        } else {
            me.d dVar = PictureSelectionConfig.W3;
            if (dVar != null) {
                dVar.e(bVar.itemView.getContext(), strD, bVar.f74811b);
            }
        }
        bVar.itemView.getContext();
        bVar.f74812c.setText(strH);
        bVar.f74814e.setText(String.format(Locale.CHINA, "  (%1$d)", Integer.valueOf(iJ)));
        bVar.itemView.setOnClickListener(new ViewOnClickListenerC0599a(i10, localMediaFolder));
        if (i10 < this.f74806b.size()) {
            bVar.f74815f.setVisibility(0);
        } else {
            bVar.f74815f.setVisibility(8);
        }
    }

    public b q(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34436sf, new Class[]{ViewGroup.class, Integer.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int iA = com.max.mediaselector.lib.config.d.a(viewGroup.getContext(), 6);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (iA == 0) {
            iA = R.layout.ps_album_folder_item;
        }
        return new b(layoutInflaterFrom.inflate(iA, viewGroup, false));
    }

    public void r(oe.a aVar) {
        this.f74807c = aVar;
    }
}

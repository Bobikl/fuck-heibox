package com.max.mediaselector.lib.adapter.holder;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.s;
import com.max.mediaselector.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BaseRecyclerMediaHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f74846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f74847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f74848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f74849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PictureSelectionConfig f74850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f74851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f74852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ColorFilter f74853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorFilter f74854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorFilter f74855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.max.mediaselector.lib.adapter.b.InterfaceC0600b f74856l;

    /* JADX INFO: compiled from: BaseRecyclerMediaHolder.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34370pg, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f74848d.performClick();
        }
    }

    /* JADX INFO: compiled from: BaseRecyclerMediaHolder.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f74859c;

        b(LocalMedia localMedia, int i10) {
            this.f74858b = localMedia;
            this.f74859c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34393qg, new Class[]{View.class}, Void.TYPE).isSupported || this.f74858b.U() || c.this.f74856l == null || c.this.f74856l.e(c.this.f74847c, this.f74859c, this.f74858b) == -1) {
                return;
            }
            c cVar = c.this;
            c.d(cVar, c.b(cVar, this.f74858b));
        }
    }

    /* JADX INFO: renamed from: com.max.mediaselector.lib.adapter.holder.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseRecyclerMediaHolder.java */
    public class ViewOnLongClickListenerC0602c implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f74861b;

        ViewOnLongClickListenerC0602c(int i10) {
            this.f74861b = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34415rg, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (c.this.f74856l != null) {
                c.this.f74856l.d(view, this.f74861b);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: BaseRecyclerMediaHolder.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f74864c;

        d(LocalMedia localMedia, int i10) {
            this.f74863b = localMedia;
            this.f74864c = i10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0062  */
        /* JADX WARN: Code duplicated, block: B:24:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007b  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectionConfig pictureSelectionConfig;
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34437sg, new Class[]{View.class}, Void.TYPE).isSupported || this.f74863b.U() || c.this.f74856l == null) {
                return;
            }
            if ((!com.max.mediaselector.lib.config.f.h(this.f74863b.A()) || !c.this.f74850f.H) && !c.this.f74850f.f75033d) {
                if (com.max.mediaselector.lib.config.f.i(this.f74863b.A())) {
                    PictureSelectionConfig pictureSelectionConfig2 = c.this.f74850f;
                    if (!pictureSelectionConfig2.I && pictureSelectionConfig2.f75040k != 1) {
                        if (com.max.mediaselector.lib.config.f.e(this.f74863b.A())) {
                            pictureSelectionConfig = c.this.f74850f;
                            if (!pictureSelectionConfig.J && pictureSelectionConfig.f75040k != 1) {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                } else if (com.max.mediaselector.lib.config.f.e(this.f74863b.A())) {
                    pictureSelectionConfig = c.this.f74850f;
                    if (!pictureSelectionConfig.J) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                c.this.f74856l.c(c.this.f74847c, this.f74864c, this.f74863b);
            } else {
                c.this.f74848d.performClick();
            }
        }
    }

    public c(@n0 View view) {
        super(view);
    }

    public c(@n0 View view, PictureSelectionConfig pictureSelectionConfig) {
        int i10;
        super(view);
        this.f74850f = pictureSelectionConfig;
        Context context = view.getContext();
        this.f74849e = context;
        this.f74853i = s.g(context, R.color.ps_color_20);
        this.f74854j = s.g(this.f74849e, R.color.ps_color_80);
        this.f74855k = s.g(this.f74849e, R.color.ps_color_half_white);
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        this.f74851g = selectMainStyleC.n0();
        this.f74846b = (ImageView) view.findViewById(R.id.ivPicture);
        this.f74847c = (TextView) view.findViewById(R.id.tvCheck);
        this.f74848d = view.findViewById(R.id.btnCheck);
        boolean z10 = true;
        if (pictureSelectionConfig.f75040k == 1 && pictureSelectionConfig.f75033d) {
            this.f74847c.setVisibility(8);
            this.f74848d.setVisibility(8);
        } else {
            this.f74847c.setVisibility(0);
            this.f74848d.setVisibility(0);
        }
        if (pictureSelectionConfig.f75033d || ((i10 = pictureSelectionConfig.f75040k) != 1 && i10 != 2)) {
            z10 = false;
        }
        this.f74852h = z10;
        int iB = selectMainStyleC.B();
        if (s.b(iB)) {
            this.f74847c.setTextSize(iB);
        }
        int iA = selectMainStyleC.A();
        if (s.c(iA)) {
            this.f74847c.setTextColor(iA);
        }
        int iP = selectMainStyleC.P();
        if (s.c(iP)) {
            this.f74847c.setBackgroundResource(iP);
        }
        int[] iArrZ = selectMainStyleC.z();
        if (s.a(iArrZ)) {
            if (this.f74847c.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f74847c.getLayoutParams()).removeRule(21);
                for (int i11 : iArrZ) {
                    ((RelativeLayout.LayoutParams) this.f74847c.getLayoutParams()).addRule(i11);
                }
            }
            if (this.f74848d.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f74848d.getLayoutParams()).removeRule(21);
                for (int i12 : iArrZ) {
                    ((RelativeLayout.LayoutParams) this.f74848d.getLayoutParams()).addRule(i12);
                }
            }
            int iY = selectMainStyleC.y();
            if (s.b(iY)) {
                ViewGroup.LayoutParams layoutParams = this.f74848d.getLayoutParams();
                layoutParams.width = iY;
                layoutParams.height = iY;
            }
        }
    }

    static /* synthetic */ boolean b(c cVar, LocalMedia localMedia) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, localMedia}, null, changeQuickRedirect, true, bb.c.l.f34324ng, new Class[]{c.class, LocalMedia.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : cVar.j(localMedia);
    }

    static /* synthetic */ void d(c cVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34347og, new Class[]{c.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.m(z10);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    private void h(LocalMedia localMedia) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34232jg, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        if (qe.a.g() <= 0 || qe.a.i().contains(localMedia)) {
            z10 = false;
        } else {
            PictureSelectionConfig pictureSelectionConfig = this.f74850f;
            int i10 = Integer.MAX_VALUE;
            if (pictureSelectionConfig.P) {
                if (pictureSelectionConfig.f75040k == 1) {
                    z10 = false;
                } else {
                    z10 = false;
                }
            } else if (com.max.mediaselector.lib.config.f.i(qe.a.j())) {
                PictureSelectionConfig pictureSelectionConfig2 = this.f74850f;
                if (pictureSelectionConfig2.f75040k != 1) {
                    int i11 = pictureSelectionConfig2.f75043n;
                    i10 = i11 > 0 ? i11 : pictureSelectionConfig2.f75041l;
                }
                if (qe.a.g() == i10 || com.max.mediaselector.lib.config.f.h(localMedia.A())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                PictureSelectionConfig pictureSelectionConfig3 = this.f74850f;
                if (qe.a.g() == (pictureSelectionConfig3.f75040k != 1 ? pictureSelectionConfig3.f75041l : Integer.MAX_VALUE) || com.max.mediaselector.lib.config.f.i(localMedia.A())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (!z10) {
            localMedia.D0(false);
        } else {
            this.f74846b.setColorFilter(this.f74855k);
            localMedia.D0(true);
        }
    }

    public static c i(ViewGroup viewGroup, int i10, int i11, PictureSelectionConfig pictureSelectionConfig) {
        Object[] objArr = {viewGroup, new Integer(i10), new Integer(i11), pictureSelectionConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34164gg, new Class[]{ViewGroup.class, cls, cls, PictureSelectionConfig.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        if (i10 == 1) {
            return new com.max.mediaselector.lib.adapter.holder.d(viewInflate);
        }
        if (i10 != 3) {
            return i10 != 4 ? new e(viewInflate, pictureSelectionConfig) : new com.max.mediaselector.lib.adapter.holder.a(viewInflate, pictureSelectionConfig);
        }
        return new j(viewInflate, pictureSelectionConfig);
    }

    private boolean j(LocalMedia localMedia) {
        LocalMedia localMediaF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34278lg, new Class[]{LocalMedia.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zContains = qe.a.i().contains(localMedia);
        if (zContains && (localMediaF = localMedia.f()) != null && localMediaF.P()) {
            localMedia.p0(localMediaF.u());
            localMedia.o0(true ^ TextUtils.isEmpty(localMediaF.u()));
            localMedia.y0(localMediaF.P());
        }
        return zContains;
    }

    private void l(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34301mg, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f74847c.setText("");
        for (int i10 = 0; i10 < qe.a.g(); i10++) {
            LocalMedia localMedia2 = qe.a.i().get(i10);
            if (TextUtils.equals(localMedia2.E(), localMedia.E()) || localMedia2.z() == localMedia.z()) {
                localMedia.G0(localMedia2.B());
                localMedia2.N0(localMedia.F());
                this.f74847c.setText(u.l(Integer.valueOf(localMedia.B())));
            }
        }
    }

    private void m(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34255kg, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f74847c.isSelected() != z10) {
            this.f74847c.setSelected(z10);
        }
        if (this.f74850f.f75033d) {
            this.f74846b.setColorFilter(this.f74853i);
        } else {
            this.f74846b.setColorFilter(z10 ? this.f74854j : this.f74853i);
        }
    }

    public void g(LocalMedia localMedia, int i10) {
        if (PatchProxy.proxy(new Object[]{localMedia, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34187hg, new Class[]{LocalMedia.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        localMedia.f75199l = getAbsoluteAdapterPosition();
        m(j(localMedia));
        if (this.f74851g) {
            l(localMedia);
        }
        if (this.f74852h && this.f74850f.f75060y1) {
            h(localMedia);
        }
        String strE = localMedia.E();
        if (localMedia.P()) {
            strE = localMedia.u();
        }
        k(strE);
        this.f74847c.setOnClickListener(new a());
        this.f74848d.setOnClickListener(new b(localMedia, i10));
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC0602c(i10));
        this.itemView.setOnClickListener(new d(localMedia, i10));
    }

    public void k(String str) {
        me.d dVar;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34209ig, new Class[]{String.class}, Void.TYPE).isSupported || (dVar = PictureSelectionConfig.W3) == null) {
            return;
        }
        dVar.f(this.f74846b.getContext(), str, this.f74846b);
    }

    public void n(com.max.mediaselector.lib.adapter.b.InterfaceC0600b interfaceC0600b) {
        this.f74856l = interfaceC0600b;
    }
}

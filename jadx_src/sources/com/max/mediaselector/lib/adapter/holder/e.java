package com.max.mediaselector.lib.adapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.l;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ImageViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ImageView f74866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextView f74867n;

    public e(View view, PictureSelectionConfig pictureSelectionConfig) {
        super(view, pictureSelectionConfig);
        this.f74867n = (TextView) view.findViewById(R.id.tv_media_tag);
        ImageView imageView = (ImageView) view.findViewById(R.id.ivEditor);
        this.f74866m = imageView;
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        int iP = selectMainStyleC.p();
        if (s.c(iP)) {
            imageView.setImageResource(iP);
        }
        int[] iArrO = selectMainStyleC.o();
        if (s.a(iArrO) && (imageView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).removeRule(12);
            for (int i10 : iArrO) {
                ((RelativeLayout.LayoutParams) this.f74866m.getLayoutParams()).addRule(i10);
            }
        }
        int[] iArrD = selectMainStyleC.D();
        if (s.a(iArrD) && (this.f74867n.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) this.f74867n.getLayoutParams()).removeRule(21);
            ((RelativeLayout.LayoutParams) this.f74867n.getLayoutParams()).removeRule(12);
            for (int i11 : iArrD) {
                ((RelativeLayout.LayoutParams) this.f74867n.getLayoutParams()).addRule(i11);
            }
        }
        int iC = selectMainStyleC.C();
        if (s.c(iC)) {
            this.f74867n.setBackgroundResource(iC);
        }
        int iF = selectMainStyleC.F();
        if (s.b(iF)) {
            this.f74867n.setTextSize(iF);
        }
        int iE = selectMainStyleC.E();
        if (s.c(iE)) {
            this.f74867n.setTextColor(iE);
        }
    }

    @Override // com.max.mediaselector.lib.adapter.holder.c
    public void g(LocalMedia localMedia, int i10) {
        if (PatchProxy.proxy(new Object[]{localMedia, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34459tg, new Class[]{LocalMedia.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.g(localMedia, i10);
        if (localMedia.P() && localMedia.O()) {
            this.f74866m.setVisibility(0);
        } else {
            this.f74866m.setVisibility(8);
        }
        this.f74867n.setVisibility(0);
        if (com.max.mediaselector.lib.config.f.f(localMedia.A())) {
            this.f74867n.setText(this.f74849e.getString(R.string.ps_gif_tag));
            return;
        }
        if (com.max.mediaselector.lib.config.f.j(localMedia.A())) {
            this.f74867n.setText(this.f74849e.getString(R.string.ps_webp_tag));
        } else if (l.r(localMedia.getWidth(), localMedia.getHeight())) {
            this.f74867n.setText(this.f74849e.getString(R.string.ps_long_chart));
        } else {
            this.f74867n.setVisibility(8);
        }
    }
}

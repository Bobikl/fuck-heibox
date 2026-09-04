package com.max.mediaselector.lib.adapter.holder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: AudioViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TextView f74829m;

    public a(@n0 View view, PictureSelectionConfig pictureSelectionConfig) {
        super(view, pictureSelectionConfig);
        TextView textView = (TextView) view.findViewById(R.id.tv_duration);
        this.f74829m = textView;
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        int iJ = selectMainStyleC.j();
        if (s.c(iJ)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(iJ, 0, 0, 0);
        }
        int iN = selectMainStyleC.n();
        if (s.b(iN)) {
            textView.setTextSize(iN);
        }
        int iL = selectMainStyleC.l();
        if (s.c(iL)) {
            textView.setTextColor(iL);
        }
        int iH = selectMainStyleC.h();
        if (s.c(iH)) {
            textView.setBackgroundResource(iH);
        }
        int[] iArrK = selectMainStyleC.k();
        if (s.a(iArrK) && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) textView.getLayoutParams()).removeRule(12);
            for (int i10 : iArrK) {
                ((RelativeLayout.LayoutParams) this.f74829m.getLayoutParams()).addRule(i10);
            }
        }
    }

    @Override // com.max.mediaselector.lib.adapter.holder.c
    public void g(LocalMedia localMedia, int i10) {
        if (PatchProxy.proxy(new Object[]{localMedia, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Wf, new Class[]{LocalMedia.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.g(localMedia, i10);
        this.f74829m.setText(com.max.mediaselector.lib.utils.g.c(localMedia.w()));
    }

    @Override // com.max.mediaselector.lib.adapter.holder.c
    public void k(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.Xf, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f74846b.setImageResource(R.drawable.ps_audio_placeholder);
    }
}

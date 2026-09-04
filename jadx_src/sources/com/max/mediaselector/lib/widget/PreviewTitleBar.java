package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import bb.c;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.style.TitleBarStyle;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class PreviewTitleBar extends TitleBar {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PreviewTitleBar(Context context) {
        super(context);
    }

    public PreviewTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewTitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.max.mediaselector.lib.widget.TitleBar
    public void setTitleBarStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35130xa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.setTitleBarStyle();
        TitleBarStyle titleBarStyleD = PictureSelectionConfig.f75017b4.d();
        if (s.c(titleBarStyleD.b())) {
            setBackgroundColor(titleBarStyleD.b());
        } else if (s.b(titleBarStyleD.f())) {
            setBackgroundColor(titleBarStyleD.f());
        }
        if (s.c(titleBarStyleD.u())) {
            this.f75592c.setImageResource(titleBarStyleD.u());
        } else if (s.c(titleBarStyleD.c())) {
            this.f75592c.setImageResource(titleBarStyleD.c());
        }
        this.f75591b.setOnClickListener(null);
        this.f75598i.setOnClickListener(null);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f75591b.getLayoutParams();
        layoutParams.removeRule(17);
        layoutParams.addRule(14);
        this.f75591b.setBackgroundResource(R.drawable.ps_ic_trans_1px);
        this.f75596g.setVisibility(8);
        this.f75593d.setVisibility(8);
        this.f75598i.setVisibility(8);
    }
}

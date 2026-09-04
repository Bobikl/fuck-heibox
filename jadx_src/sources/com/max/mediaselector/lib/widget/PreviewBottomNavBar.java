package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import bb.c;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.style.BottomNavBarStyle;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class PreviewBottomNavBar extends BottomNavBar {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PreviewBottomNavBar(Context context) {
        super(context);
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.max.mediaselector.lib.widget.BottomNavBar
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35042ta, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75569b.setVisibility(8);
    }

    public void e(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.f35064ua, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75570c.setVisibility((PictureSelectionConfig.f75022g4 == null || z10) ? 8 : 0);
    }

    public TextView getEditor() {
        return this.f75570c;
    }

    @Override // com.max.mediaselector.lib.widget.BottomNavBar, android.view.View.OnClickListener
    public void onClick(View view) {
        BottomNavBar.a aVar;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.m.f35108wa, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onClick(view);
        if (view.getId() != R.id.ps_tv_editor || (aVar = this.f75572e) == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.max.mediaselector.lib.widget.BottomNavBar
    public void setBottomNavBarStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35086va, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.setBottomNavBarStyle();
        BottomNavBarStyle bottomNavBarStyleB = PictureSelectionConfig.f75017b4.b();
        if (s.c(bottomNavBarStyleB.n())) {
            setBackgroundColor(bottomNavBarStyleB.n());
        } else if (s.b(bottomNavBarStyleB.d())) {
            setBackgroundColor(bottomNavBarStyleB.d());
        }
    }
}

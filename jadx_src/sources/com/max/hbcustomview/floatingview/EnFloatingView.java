package com.max.hbcustomview.floatingview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.v;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class EnFloatingView extends FloatingMagnetView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageView f69094n;

    public EnFloatingView(@n0 Context context) {
        super(context, null);
        View.inflate(context, R.layout.layout_floating_view, this);
        this.f69094n = (ImageView) findViewById(R.id.icon);
    }

    public void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32407lj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69094n.clearColorFilter();
    }

    public void setColorFilter(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32384kj, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69094n.setColorFilter(i10);
    }

    public void setIconImage(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32361jj, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69094n.setImageResource(i10);
    }
}

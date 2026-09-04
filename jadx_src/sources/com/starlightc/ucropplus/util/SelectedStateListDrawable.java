package com.starlightc.ucropplus.util;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes4.dex */
public class SelectedStateListDrawable extends StateListDrawable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mSelectionColor;

    public SelectedStateListDrawable(Drawable drawable, int i10) {
        this.mSelectionColor = i10;
        addState(new int[]{R.attr.state_selected}, drawable);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iArr}, this, changeQuickRedirect, false, 50977, new Class[]{int[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 16842913) {
                z10 = true;
            }
        }
        if (z10) {
            super.setColorFilter(this.mSelectionColor, PorterDuff.Mode.SRC_ATOP);
        } else {
            super.clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}

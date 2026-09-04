package com.max.hbcustomview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class CustomInsetsFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f68399b;

    public CustomInsetsFrameLayout(Context context) {
        super(context);
        this.f68399b = new int[4];
    }

    public CustomInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68399b = new int[4];
    }

    public CustomInsetsFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68399b = new int[4];
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, bb.c.f.K3, new Class[]{Rect.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int[] iArr = this.f68399b;
        iArr[0] = rect.left;
        iArr[1] = rect.top;
        iArr[2] = rect.right;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        return super.fitSystemWindows(rect);
    }

    public final int[] getInsets() {
        return this.f68399b;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{windowInsets}, this, changeQuickRedirect, false, bb.c.f.L3, new Class[]{WindowInsets.class}, WindowInsets.class);
        if (patchProxyResultProxy.isSupported) {
            return (WindowInsets) patchProxyResultProxy.result;
        }
        this.f68399b[0] = windowInsets.getSystemWindowInsetLeft();
        this.f68399b[1] = windowInsets.getSystemWindowInsetTop();
        this.f68399b[2] = windowInsets.getSystemWindowInsetRight();
        return super.onApplyWindowInsets(windowInsets.replaceSystemWindowInsets(0, 0, 0, windowInsets.getSystemWindowInsetBottom()));
    }
}

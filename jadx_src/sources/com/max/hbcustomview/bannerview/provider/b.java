package com.max.hbcustomview.bannerview.provider;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: RoundViewOutlineProvider.java */
/* JADX INFO: loaded from: classes10.dex */
@TargetApi(21)
public class b extends ViewOutlineProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f69034a;

    public b(float f10) {
        this.f69034a = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        if (PatchProxy.proxy(new Object[]{view, outline}, this, changeQuickRedirect, false, bb.c.f.f32542rh, new Class[]{View.class, Outline.class}, Void.TYPE).isSupported) {
            return;
        }
        outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f69034a);
    }
}

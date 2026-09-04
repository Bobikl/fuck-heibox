package com.max.hbcommon.base.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: OneTimeValidExposureWatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f66799a = 4500;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final boolean a(@dl.e View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 2010, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (view == null) {
            return false;
        }
        return view.isAttachedToWindow() && view.getVisibility() == 0 && view.getMeasuredHeight() * view.getMeasuredWidth() > 0;
    }
}

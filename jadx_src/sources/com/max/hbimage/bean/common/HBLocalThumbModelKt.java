package com.max.hbimage.bean.common;

import androidx.annotation.w0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;

/* JADX INFO: compiled from: HBLocalThumbModel.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HBLocalThumbModelKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    @w0(29)
    public static final HBLocalThumbModel toHBLocalThumbModel(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.g.F6, new Class[]{String.class}, HBLocalThumbModel.class);
        return patchProxyResultProxy.isSupported ? (HBLocalThumbModel) patchProxyResultProxy.result : new HBLocalThumbModel(str);
    }
}

package com.heybox.imageviewer.core;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OverlayCustomizer.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface c {

    /* JADX INFO: compiled from: OverlayCustomizer.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.e
        public static View a(@dl.d c cVar, @dl.d ViewGroup parent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, parent}, null, changeQuickRedirect, true, 160, new Class[]{c.class, ViewGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            f0.p(parent, "parent");
            return null;
        }
    }

    @dl.e
    View h(@dl.d ViewGroup viewGroup);
}

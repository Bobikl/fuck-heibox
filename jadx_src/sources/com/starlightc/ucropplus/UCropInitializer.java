package com.starlightc.ucropplus;

import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.z;

/* JADX INFO: loaded from: classes4.dex */
public class UCropInitializer {
    public static ChangeQuickRedirect changeQuickRedirect;

    public UCropInitializer setOkHttpClient(@n0 z zVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, 49902, new Class[]{z.class}, UCropInitializer.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropInitializer) patchProxyResultProxy.result;
        }
        OkHttpClientStore.INSTANCE.setClient(zVar);
        return this;
    }
}

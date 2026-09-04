package com.starlightc.ucropplus;

import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.z;

/* JADX INFO: loaded from: classes4.dex */
public class OkHttpClientStore {
    public static final OkHttpClientStore INSTANCE = new OkHttpClientStore();
    public static ChangeQuickRedirect changeQuickRedirect;
    private z client;

    private OkHttpClientStore() {
    }

    @n0
    public z getClient() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49749, new Class[0], z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        if (this.client == null) {
            this.client = new z();
        }
        return this.client;
    }

    void setClient(@n0 z zVar) {
        this.client = zVar;
    }
}

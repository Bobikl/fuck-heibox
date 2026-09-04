package com.tencent.thumbplayer.tcmedia.api.proxy;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPPlayerProxy {
    void pushEvent(int i10);

    void setIsActive(boolean z10);

    void setProxyServiceType(int i10);

    void setTPPlayerProxyListener(ITPPlayerProxyListener iTPPlayerProxyListener);
}

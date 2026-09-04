package com.bun.miitmdid.interfaces;

/* JADX INFO: loaded from: classes6.dex */
public interface IIdProvider extends IdSupplier {
    void doStart();

    void doStartInThreadPool(IIdentifierListener iIdentifierListener);

    void doStartSync(IIdentifierListener iIdentifierListener);

    boolean isSync();

    void setGetIdFlag(boolean z10, boolean z11, boolean z12);

    void shutDown();
}

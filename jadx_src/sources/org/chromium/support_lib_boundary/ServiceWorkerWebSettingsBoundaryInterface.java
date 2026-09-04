package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes5.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    void setAllowContentAccess(boolean z10);

    void setAllowFileAccess(boolean z10);

    void setBlockNetworkLoads(boolean z10);

    void setCacheMode(int i10);
}

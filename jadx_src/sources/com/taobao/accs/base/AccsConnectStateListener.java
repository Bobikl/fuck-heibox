package com.taobao.accs.base;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface AccsConnectStateListener {
    @Keep
    void onConnected(TaoBaseService.ConnectInfo connectInfo);

    @Keep
    void onDisconnected(TaoBaseService.ConnectInfo connectInfo);
}

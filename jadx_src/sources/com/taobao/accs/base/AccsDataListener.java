package com.taobao.accs.base;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public interface AccsDataListener {
    @Keep
    void onAntiBrush(boolean z10, TaoBaseService.ExtraInfo extraInfo);

    @Keep
    void onBind(String str, int i10, TaoBaseService.ExtraInfo extraInfo);

    @Keep
    void onConnected(TaoBaseService.ConnectInfo connectInfo);

    @Keep
    void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo);

    @Keep
    void onDisconnected(TaoBaseService.ConnectInfo connectInfo);

    @Keep
    void onResponse(String str, String str2, int i10, byte[] bArr, TaoBaseService.ExtraInfo extraInfo);

    @Keep
    void onSendData(String str, String str2, int i10, TaoBaseService.ExtraInfo extraInfo);

    @Keep
    void onUnbind(String str, int i10, TaoBaseService.ExtraInfo extraInfo);
}

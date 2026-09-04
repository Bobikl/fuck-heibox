package com.tencent.qimei.sdk;

import android.content.Context;
import com.tencent.qimei.log.IObservableLog;
import com.tencent.qimei.sdk.debug.IDebugger;
import com.tencent.qimei.strategy.terminal.ITerminalStrategy;

/* JADX INFO: loaded from: classes4.dex */
public interface IQimeiSDK {
    IQimeiSDK addUserId(String str, String str2);

    String getBeaconTicket();

    IDebugger getDebugger();

    Qimei getQimei();

    void getQimei(IAsyncQimeiListener iAsyncQimeiListener);

    String getSdkVersion();

    ITerminalStrategy getStrategy();

    String getToken();

    boolean init(Context context);

    boolean isQimeiValid(String str, String str2);

    IQimeiSDK setAppVersion(String str);

    IQimeiSDK setChannelID(String str);

    IQimeiSDK setLogAble(boolean z10);

    IQimeiSDK setLogObserver(IObservableLog iObservableLog);

    IQimeiSDK setSdkName(String str);
}

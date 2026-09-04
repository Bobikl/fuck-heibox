package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.net64.Net64Service;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface HttpDnsService extends Net64Service {
    void clearSdnsGlobalParams();

    String getIpByHostAsync(String str);

    HTTPDNSResult getIpsByHostAsync(String str, Map<String, String> map, String str2);

    String[] getIpsByHostAsync(String str);

    String getSessionId();

    void setAuthCurrentTime(long j10);

    void setCachedIPEnabled(boolean z10);

    void setCachedIPEnabled(boolean z10, boolean z11);

    void setDegradationFilter(DegradationFilter degradationFilter);

    void setExpiredIPEnabled(boolean z10);

    void setHTTPSRequestEnabled(boolean z10);

    void setIPProbeList(List<IPProbeItem> list);

    void setLogEnabled(boolean z10);

    void setLogger(ILogger iLogger);

    void setPreResolveAfterNetworkChanged(boolean z10);

    void setPreResolveHosts(ArrayList<String> arrayList);

    void setRegion(String str);

    void setSdnsGlobalParams(Map<String, String> map);

    void setTimeoutInterval(int i10);
}

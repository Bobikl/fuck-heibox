package anet.channel;

import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface RequestCb {
    void onDataReceive(ByteArray byteArray, boolean z10);

    void onFinish(int i10, String str, RequestStatistic requestStatistic);

    void onResponseCode(int i10, Map<String, List<String>> map);
}

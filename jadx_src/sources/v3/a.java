package v3;

import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public interface a {
    void a(int i10, int i11, ByteArray byteArray);

    void b(DefaultFinishEvent defaultFinishEvent);

    void onResponseCode(int i10, Map<String, List<String>> map);
}

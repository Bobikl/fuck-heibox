package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectResp implements IMessageEntity {

    @Packed
    public List<Integer> protocolVersion = Arrays.asList(1, 2);

    @Packed
    public String sessionId;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("protocol version:");
        Iterator<Integer> it = this.protocolVersion.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(',');
        }
        return sb2.toString();
    }
}

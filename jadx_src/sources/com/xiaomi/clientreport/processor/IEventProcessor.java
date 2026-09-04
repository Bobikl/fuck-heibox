package com.xiaomi.clientreport.processor;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public interface IEventProcessor extends c, d {
    String bytesToString(byte[] bArr);

    void setEventMap(HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> map);

    byte[] stringToBytes(String str);
}

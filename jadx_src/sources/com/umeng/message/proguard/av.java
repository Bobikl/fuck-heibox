package com.umeng.message.proguard;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class av {
    public static String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }
}

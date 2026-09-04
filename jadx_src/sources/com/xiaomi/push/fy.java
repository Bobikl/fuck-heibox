package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;

/* JADX INFO: loaded from: classes4.dex */
public enum fy {
    COMMAND_REGISTER("register"),
    COMMAND_UNREGISTER(MiPushClient.COMMAND_UNREGISTER),
    COMMAND_SET_ALIAS(MiPushClient.COMMAND_SET_ALIAS),
    COMMAND_UNSET_ALIAS(MiPushClient.COMMAND_UNSET_ALIAS),
    COMMAND_SET_ACCOUNT(MiPushClient.COMMAND_SET_ACCOUNT),
    COMMAND_UNSET_ACCOUNT(MiPushClient.COMMAND_UNSET_ACCOUNT),
    COMMAND_SUBSCRIBE_TOPIC(MiPushClient.COMMAND_SUBSCRIBE_TOPIC),
    COMMAND_UNSUBSCRIBE_TOPIC(MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC),
    COMMAND_SET_ACCEPT_TIME(MiPushClient.COMMAND_SET_ACCEPT_TIME),
    COMMAND_CHK_VDEVID("check-vdeviceid");


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final String f447a;

    fy(String str) {
        this.f447a = str;
    }

    public static int a(String str) {
        int iA = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (fy fyVar : values()) {
            if (fyVar.f447a.equals(str)) {
                iA = fn.a(fyVar);
            }
        }
        return iA;
    }
}

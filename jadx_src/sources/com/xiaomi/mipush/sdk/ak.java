package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.bk;

/* JADX INFO: loaded from: classes4.dex */
public class ak {
    public static AbstractPushManager a(Context context, e eVar) {
        return b(context, eVar);
    }

    private static AbstractPushManager b(Context context, e eVar) {
        l.a aVarM137a = l.m137a(eVar);
        if (aVarM137a == null || TextUtils.isEmpty(aVarM137a.f106793a) || TextUtils.isEmpty(aVarM137a.f106794b)) {
            return null;
        }
        return (AbstractPushManager) bk.a(aVarM137a.f106793a, aVarM137a.f106794b, context);
    }
}

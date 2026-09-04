package com.alipay.face.api;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class ZIMFacadeBuilder {
    private static ZIMFacade s_instance;

    public static synchronized ZIMFacade create(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("context Can't be null");
            }
            if (s_instance == null) {
                s_instance = new ZIMFacade(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return s_instance;
    }
}

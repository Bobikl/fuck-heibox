package com.alipay.mobile.android.verify.sdk.b;

import android.text.TextUtils;
import com.alipay.mobile.android.verify.logger.g;
import com.squareup.otto.Subscribe;

/* JADX INFO: compiled from: LoggerPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements j4.c {
    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c) || TextUtils.isEmpty(aVar.f124236a)) {
            com.alipay.mobile.android.verify.logger.f.k("LoggerPlugin").a("null or empty action", new Object[0]);
            return;
        }
        if ("enableLogger".equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("LoggerPlugin").a("handle enable logger event", new Object[0]);
            com.alipay.mobile.android.verify.logger.f.b();
            com.alipay.mobile.android.verify.logger.f.a(new com.alipay.mobile.android.verify.logger.a(g.k().f("ZMSDK").a()));
            j4.a aVarA = j4.a.a(aVar);
            aVarA.f124237b = j4.a.b();
            com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
        }
    }
}

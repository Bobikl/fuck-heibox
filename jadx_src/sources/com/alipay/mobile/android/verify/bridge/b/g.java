package com.alipay.mobile.android.verify.bridge.b;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.squareup.otto.Subscribe;

/* JADX INFO: compiled from: TitleBarPlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements j4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f39350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f39351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f39352d;

    public g(TextView textView, TextView textView2, View view) {
        this.f39350b = textView;
        this.f39351c = textView2;
        this.f39352d = view;
    }

    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("TitleBarPlugin").d("null or empty action", new Object[0]);
            return;
        }
        j4.a aVarA = j4.a.a(aVar);
        aVarA.f124237b = j4.a.b();
        if (j4.b.f124241c.equalsIgnoreCase(aVar.f124238c)) {
            JSONObject jSONObject = aVar.f124237b;
            if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("title"))) {
                return;
            }
            this.f39351c.setText(aVar.f124237b.getString("title"));
            return;
        }
        if (j4.b.f124245g.equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("TitleBarPlugin").a("handle hide back button event", new Object[0]);
            this.f39350b.setVisibility(8);
            this.f39352d.setVisibility(8);
            com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
            return;
        }
        if ("showBackButton".equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("TitleBarPlugin").a("handle show back button event", new Object[0]);
            this.f39350b.setVisibility(0);
            this.f39352d.setVisibility(0);
            com.alipay.mobile.android.verify.bridge.b.a().post(aVarA);
        }
    }
}

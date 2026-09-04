package com.bytedance.sdk.open.douyin.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity;
import k7.b;
import n7.e;
import p7.d;
import q7.a;

/* JADX INFO: loaded from: classes6.dex */
public class DouYinWebAuthorizeActivity extends BaseWebAuthorizeActivity {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f42260w = "open.douyin.com";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f42261x = "api.snssdk.com";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f42262y = "/platform/oauth/connect/";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final String f42263z = "douyinapi.DouYinEntryActivity";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a f42264v;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public void A(Authorization.Request request, b bVar) {
        if (bVar != null && this.f42240e != null) {
            if (bVar.extras == null) {
                bVar.extras = new Bundle();
            }
            bVar.extras.putString(BaseWebAuthorizeActivity.f42235t, this.f42240e.getUrl());
        }
        B(f42263z, request, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public void C() {
        RelativeLayout relativeLayout = this.f42244i;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(Color.parseColor("#161823"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String j(int i10) {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String k() {
        return f42262y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String l() {
        return f42261x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String m() {
        return f42260w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String o() {
        return "https";
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f42264v = d.a(this);
        super.onCreate(bundle);
        e.c(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public boolean p(Intent intent, j7.a aVar) {
        return this.f42264v.m(intent, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public boolean v() {
        return true;
    }
}

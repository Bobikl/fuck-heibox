package com.umeng.socialize.weixin.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.handler.UMWXHandler;
import com.umeng.socialize.utils.SLog;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WXCallbackActivity extends Activity implements IWXAPIEventHandler {
    private final String TAG = "WXCallbackActivity";
    protected UMWXHandler mWxHandler = null;

    protected void handleIntent(Intent intent) {
        this.mWxHandler.getWXApi().handleIntent(intent, this);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SLog.I("WXCallbackActivity onCreate");
        UMShareAPI uMShareAPI = UMShareAPI.get(getApplicationContext());
        SHARE_MEDIA share_media = SHARE_MEDIA.WEIXIN;
        this.mWxHandler = (UMWXHandler) uMShareAPI.getHandler(share_media);
        SLog.I("WXCallbackActivity mWxHandler：" + this.mWxHandler);
        this.mWxHandler.onCreate(getApplicationContext(), PlatformConfig.getPlatform(share_media));
        handleIntent(getIntent());
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        SLog.I("WXCallbackActivity onNewIntent");
        setIntent(intent);
        UMShareAPI uMShareAPI = UMShareAPI.get(getApplicationContext());
        SHARE_MEDIA share_media = SHARE_MEDIA.WEIXIN;
        UMWXHandler uMWXHandler = (UMWXHandler) uMShareAPI.getHandler(share_media);
        this.mWxHandler = uMWXHandler;
        uMWXHandler.onCreate(getApplicationContext(), PlatformConfig.getPlatform(share_media));
        handleIntent(intent);
    }

    public void onReq(BaseReq baseReq) {
        UMWXHandler uMWXHandler = this.mWxHandler;
        if (uMWXHandler != null) {
            uMWXHandler.getWXEventHandler().onReq(baseReq);
        }
        finish();
    }

    public void onResp(BaseResp baseResp) {
        SLog.I("WXCallbackActivity 分发回调");
        UMWXHandler uMWXHandler = this.mWxHandler;
        if (uMWXHandler != null && baseResp != null) {
            try {
                uMWXHandler.getWXEventHandler().onResp(baseResp);
            } catch (Exception e10) {
                SLog.error(e10);
            }
        }
        finish();
    }
}

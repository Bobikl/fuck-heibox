package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public class ShareResultActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (intent == null) {
                finish();
                return;
            }
            if (intent.getIntExtra("start_flag", -1) != 1002) {
                finish();
                return;
            }
            String action = intent.getAction();
            if ("com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY".equals(action)) {
                intent.setClassName(this, "com.sina.weibo.sdk.share.ShareTransActivity");
            } else if ("com.sina.weibo.sdk.action.ACTION_SDK_REQ_STORY".equals(action)) {
                intent.setClassName(this, "com.sina.weibo.sdk.share.ShareStoryActivity");
            }
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}

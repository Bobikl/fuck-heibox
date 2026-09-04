package com.tencent.tauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class AuthActivity extends Activity {
    public static final String ACTION_SHARE_PRIZE = "sharePrize";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f102123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, ActionHandler> f102124b = new HashMap();

    /* JADX INFO: compiled from: ProGuard */
    public interface ActionHandler {
        void handleAction(Activity activity, Bundle bundle);
    }

    private void a() {
        this.f102124b.put("action_common_channel", new ActionHandler() { // from class: com.tencent.tauth.AuthActivity.1
            @Override // com.tencent.tauth.AuthActivity.ActionHandler
            public void handleAction(Activity activity, Bundle bundle) {
                SLog.i("openSDK_LOG.AuthActivity", "-->handleActionUri--common channel. ");
                Intent intent = new Intent(activity, (Class<?>) AssistActivity.class);
                intent.putExtras(bundle);
                intent.putExtra(Constants.KEY_REQUEST_CODE, 10114);
                intent.setFlags(603979776);
                AuthActivity.this.startActivity(intent);
                AuthActivity.this.finish();
            }
        });
    }

    private void a(Uri uri) {
        SLog.i("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri != null && uri.toString() != null) {
            String string = "";
            if (!uri.toString().equals("")) {
                String string2 = uri.toString();
                Bundle bundleA = m.a(string2.substring(string2.indexOf("#") + 1));
                if (bundleA == null) {
                    SLog.w("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
                    finish();
                    return;
                }
                String string3 = bundleA.getString("action");
                SLog.i("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string3);
                if (string3 == null) {
                    finish();
                    return;
                }
                if (string3.equals("shareToQQ") || string3.equals("shareToQzone") || string3.equals("sendToMyComputer") || string3.equals("shareToTroopBar")) {
                    if (string3.equals("shareToQzone") && k.a((Context) this, "com.tencent.mobileqq") != null && k.c(this, "5.2.0") < 0) {
                        int i10 = f102123a + 1;
                        f102123a = i10;
                        if (i10 == 2) {
                            f102123a = 0;
                            finish();
                            return;
                        }
                    }
                    SLog.i("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
                    Intent intent = new Intent(this, (Class<?>) AssistActivity.class);
                    intent.putExtras(bundleA);
                    intent.setFlags(603979776);
                    startActivity(intent);
                    finish();
                    return;
                }
                if (string3.equals("addToQQFavorites")) {
                    Intent intent2 = getIntent();
                    intent2.putExtras(bundleA);
                    intent2.putExtra(Constants.KEY_ACTION, "action_share");
                    IUiListener listnerWithAction = UIListenerManager.getInstance().getListnerWithAction(string3);
                    if (listnerWithAction != null) {
                        UIListenerManager.getInstance().handleDataToListener(intent2, listnerWithAction);
                    }
                    finish();
                    return;
                }
                if (string3.equals(ACTION_SHARE_PRIZE)) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                    try {
                        string = m.d(bundleA.getString("response")).getString("activityid");
                    } catch (Exception e10) {
                        SLog.e("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e10);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        launchIntentForPackage.putExtra(ACTION_SHARE_PRIZE, true);
                        Bundle bundle = new Bundle();
                        bundle.putString("activityid", string);
                        launchIntentForPackage.putExtras(bundle);
                    }
                    startActivity(launchIntentForPackage);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetAvatar")) {
                    boolean booleanExtra = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent3 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent3.putExtra(Constants.KEY_REQUEST_CODE, 10108);
                    intent3.putExtra(Constants.KEY_STAY, booleanExtra);
                    intent3.putExtras(bundleA);
                    intent3.setFlags(603979776);
                    startActivity(intent3);
                    finish();
                    return;
                }
                if ("sdkSetDynamicAvatar".equals(string3)) {
                    boolean booleanExtra2 = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent4 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent4.putExtra(Constants.KEY_REQUEST_CODE, 10110);
                    intent4.putExtra(Constants.KEY_STAY, booleanExtra2);
                    intent4.putExtras(bundleA);
                    intent4.setFlags(603979776);
                    startActivity(intent4);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetEmotion")) {
                    boolean booleanExtra3 = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent5 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent5.putExtra(Constants.KEY_REQUEST_CODE, 10109);
                    intent5.putExtra(Constants.KEY_STAY, booleanExtra3);
                    intent5.putExtras(bundleA);
                    intent5.setFlags(603979776);
                    startActivity(intent5);
                    finish();
                    return;
                }
                if (string3.equals("bindGroup")) {
                    SLog.i("openSDK_LOG.AuthActivity", "-->handleActionUri--bind group callback.");
                    boolean booleanExtra4 = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent6 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent6.putExtra(Constants.KEY_REQUEST_CODE, 10112);
                    intent6.putExtra(Constants.KEY_STAY, booleanExtra4);
                    intent6.putExtras(bundleA);
                    intent6.setFlags(603979776);
                    startActivity(intent6);
                    finish();
                    return;
                }
                if (string3.equals("joinGroup")) {
                    SLog.i("openSDK_LOG.AuthActivity", "-->handleActionUri--join group callback. ");
                    boolean booleanExtra5 = getIntent().getBooleanExtra(Constants.KEY_STAY, false);
                    Intent intent7 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent7.putExtra(Constants.KEY_REQUEST_CODE, 10111);
                    intent7.putExtra(Constants.KEY_STAY, booleanExtra5);
                    intent7.putExtras(bundleA);
                    intent7.setFlags(603979776);
                    startActivity(intent7);
                    finish();
                    return;
                }
                if (!"guildOpen".equals(string3)) {
                    ActionHandler actionHandler = this.f102124b.get(string3);
                    if (actionHandler != null) {
                        actionHandler.handleAction(this, bundleA);
                        return;
                    } else {
                        finish();
                        return;
                    }
                }
                Intent intent8 = new Intent(this, (Class<?>) AssistActivity.class);
                intent8.putExtras(bundleA);
                intent8.putExtra(Constants.KEY_REQUEST_CODE, 10113);
                intent8.setFlags(603979776);
                startActivity(intent8);
                finish();
                return;
            }
        }
        SLog.w("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.AuthActivity", "activity finish exception: ", e10);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            SLog.w("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        Uri data = null;
        try {
            data = getIntent().getData();
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.AuthActivity", "onCreate exception: ", e10);
        }
        SLog.v("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + data);
        a();
        try {
            a(data);
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.AuthActivity", "onCreate exception: ", e11);
            finish();
        }
    }
}

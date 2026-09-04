package com.tencent.connect.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.open.b.e;
import com.tencent.open.b.h;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class AssistActivity extends Activity {
    public static final String EXTRA_INTENT = "openSDK_LOG.AssistActivity.ExtraIntent";
    public static final String KEY_EXTRA_PENDING_INTENT = "key_extra_pending_intent";
    public static final String KEY_REQUEST_ORIENTATION = "key_request_orientation";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f99417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private QQStayReceiver f99418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f99419f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f99416c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f99414a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Handler f99415b = new Handler() { // from class: com.tencent.connect.common.AssistActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0 && !AssistActivity.this.isFinishing()) {
                SLog.w("openSDK_LOG.AssistActivity", "-->finish by timeout");
                AssistActivity.this.finish();
            }
        }
    };

    /* JADX INFO: compiled from: ProGuard */
    public class QQStayReceiver extends BroadcastReceiver {
        private QQStayReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str = "#";
            Intent intent2 = new Intent();
            intent2.putExtra(Constants.KEY_ACTION, "action_share");
            try {
                Uri uri = (Uri) intent.getParcelableExtra("uriData");
                String string = uri.toString();
                if (!string.contains("#")) {
                    str = "?";
                }
                for (String str2 : string.substring(string.indexOf(str) + 1).split("&")) {
                    String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    intent2.putExtra(strArrSplit[0], strArrSplit[1]);
                }
                intent2.setData(uri);
            } catch (Exception e10) {
                SLog.i("openSDK_LOG.AssistActivity", "QQStayReceiver parse uri error : " + e10.getMessage());
                intent2.putExtra("result", "error");
                intent2.putExtra("response", "parse error.");
            }
            AssistActivity.this.setResult(-1, intent2);
        }
    }

    private void a(Intent intent, boolean z10) {
        if (intent == null) {
            SLog.d("openSDK_LOG.AssistActivity", "reportStartActivitySuccess, but intent is null.");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra(Constants.KEY_PASS_REPORT_VIA_PARAM);
        if (bundleExtra != null) {
            m.a(bundleExtra, z10 ? "0" : "1");
            h.a().a(bundleExtra, this.f99417d, intent.getBooleanExtra(Constants.KEY_PASS_REPORT_VIA_TIMELY, false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    private void a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        IUiListener listnerWithAction;
        String string = bundle.getString("viaShareType");
        String string2 = bundle.getString("callbackAction");
        String string3 = bundle.getString("url");
        String string4 = bundle.getString("openId");
        String string5 = bundle.getString("appId");
        String str4 = "";
        if (!"shareToQQ".equals(string2)) {
            if ("shareToQzone".equals(string2)) {
                str2 = Constants.VIA_SHARE_TO_QZONE;
                str3 = "11";
            } else {
                str = "";
            }
            if (m.a(this, string3)) {
                e.a().a(string4, string5, str4, str, "3", "0", string, "0", "2", "0");
            } else {
                listnerWithAction = UIListenerManager.getInstance().getListnerWithAction(string2);
                if (listnerWithAction != null) {
                    listnerWithAction.onError(new UiError(-6, Constants.MSG_OPEN_BROWSER_ERROR, null));
                }
                e.a().a(string4, string5, str4, str, "3", "1", string, "0", "2", "0");
                finish();
            }
            getIntent().removeExtra("shareH5");
        }
        str2 = Constants.VIA_SHARE_TO_QQ;
        str3 = "10";
        str = str3;
        str4 = str2;
        if (m.a(this, string3)) {
            listnerWithAction = UIListenerManager.getInstance().getListnerWithAction(string2);
            if (listnerWithAction != null) {
                listnerWithAction.onError(new UiError(-6, Constants.MSG_OPEN_BROWSER_ERROR, null));
            }
            e.a().a(string4, string5, str4, str, "3", "1", string, "0", "2", "0");
            finish();
        } else {
            e.a().a(string4, string5, str4, str, "3", "0", string, "0", "2", "0");
        }
        getIntent().removeExtra("shareH5");
    }

    public static Intent getAssistActivityIntent(Context context) {
        return new Intent(context, (Class<?>) AssistActivity.class);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--onActivityResult--requestCode: ");
        sb2.append(i10);
        sb2.append(" | resultCode: ");
        sb2.append(i11);
        sb2.append("data = null ? ");
        sb2.append(intent == null);
        SLog.i("openSDK_LOG.AssistActivity", sb2.toString());
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0) {
            return;
        }
        if (intent != null) {
            intent.putExtra(Constants.KEY_ACTION, "action_login");
        }
        setResultData(i10, intent);
        if (this.f99419f) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tencent.connect.common.AssistActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    SLog.i("openSDK_LOG.AssistActivity", "onActivityResult finish delay");
                    AssistActivity.this.finish();
                }
            }, 200L);
        } else {
            SLog.i("openSDK_LOG.AssistActivity", "onActivityResult finish immediate");
            finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x017a  */
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        getWindow().addFlags(67108864);
        boolean z10 = true;
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.f99419f = getIntent().getBooleanExtra(Constants.KEY_RESTORE_LANDSCAPE, false);
        SLog.i("openSDK_LOG.AssistActivity", "--onCreate-- mRestoreLandscape=" + this.f99419f);
        if (getIntent() == null) {
            SLog.e("openSDK_LOG.AssistActivity", "-->onCreate--getIntent() returns null");
            finish();
        }
        Intent intent = (Intent) getIntent().getParcelableExtra(EXTRA_INTENT);
        int intExtra = intent == null ? 0 : intent.getIntExtra(Constants.KEY_REQUEST_CODE, 0);
        this.f99417d = intent == null ? "" : intent.getStringExtra("appid");
        Bundle bundleExtra = getIntent().getBundleExtra("h5_share_data");
        if (bundle != null) {
            this.f99416c = bundle.getBoolean("RESTART_FLAG");
            this.f99414a = bundle.getBoolean("RESUME_FLAG", false);
        }
        if (this.f99416c) {
            SLog.d("openSDK_LOG.AssistActivity", "is restart");
            return;
        }
        if (bundleExtra != null) {
            SLog.w("openSDK_LOG.AssistActivity", "--onCreate--h5 bundle not null, will open browser");
            a(bundleExtra);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(KEY_EXTRA_PENDING_INTENT);
        if (intent == null || pendingIntent == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("--onCreate--activityIntent or pendingIntent is null. activityIntent is null? ");
            sb2.append(intent == null);
            sb2.append(", pendingIntent is null? ");
            sb2.append(pendingIntent == null);
            SLog.e("openSDK_LOG.AssistActivity", sb2.toString());
            finish();
            return;
        }
        SLog.i("openSDK_LOG.AssistActivity", "--onCreate--activityIntent not null, will start activity, reqcode = " + intExtra);
        try {
            IntentFilter intentFilter = new IntentFilter(Constants.SHARE_QQ_AND_STAY + intent.getData().getQueryParameter("share_id"));
            if (this.f99418e == null) {
                this.f99418e = new QQStayReceiver();
            }
            registerReceiver(this.f99418e, intentFilter);
        } catch (Exception e10) {
            SLog.i("openSDK_LOG.AssistActivity", "registerReceiver exception : " + e10.getMessage());
        }
        try {
            try {
                IntentSender intentSender = pendingIntent.getIntentSender();
                if (intent.getBooleanExtra(Constants.FOR_RESULT, true)) {
                    startIntentSenderForResult(intentSender, intExtra, null, 0, 0, 0);
                } else {
                    startIntentSender(intentSender, null, 0, 0, 0);
                }
                a(intent, true);
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
                if (z10) {
                    SLog.e("openSDK_LOG.AssistActivity", "--onCreate--startActException");
                    finish();
                }
                throw th;
            }
        } catch (ActivityNotFoundException e11) {
            SLog.e("openSDK_LOG.AssistActivity", "--onCreate--startActivity exception, ActivityNotFoundException : " + e11);
            IUiListener listnerWithRequestCode = UIListenerManager.getInstance().getListnerWithRequestCode(intExtra);
            if (listnerWithRequestCode != null) {
                listnerWithRequestCode.onError(new UiError(-20, Constants.MSG_PARAM_VERSION_TOO_LOW, ""));
            }
            a(intent, false);
        } catch (Exception e12) {
            try {
                SLog.e("openSDK_LOG.AssistActivity", "--onCreate--startActivity exception: " + e12.getMessage());
                SLog.e("openSDK_LOG.AssistActivity", "--onCreate--startActException");
                finish();
            } catch (Throwable th3) {
                th = th3;
                if (z10) {
                    SLog.e("openSDK_LOG.AssistActivity", "--onCreate--startActException");
                    finish();
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onDestroy");
        super.onDestroy();
        QQStayReceiver qQStayReceiver = this.f99418e;
        if (qQStayReceiver != null) {
            unregisterReceiver(qQStayReceiver);
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        SLog.i("openSDK_LOG.AssistActivity", "--onNewIntent");
        super.onNewIntent(intent);
        int intExtra = intent.getIntExtra(Constants.KEY_REQUEST_CODE, -1);
        SLog.i("openSDK_LOG.AssistActivity", "--onNewIntent callbackRequestCode= " + intExtra);
        if (intExtra == 10108) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_avatar");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10109) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_set_emotion");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10110) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_dynamic_avatar");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10111) {
            intent.putExtra(Constants.KEY_ACTION, "joinGroup");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10112) {
            intent.putExtra(Constants.KEY_ACTION, "bindGroup");
            if (intent.getBooleanExtra(Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10113) {
            intent.putExtra(Constants.KEY_ACTION, intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            SLog.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        if (intExtra != 10114) {
            intent.putExtra(Constants.KEY_ACTION, "action_share");
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            SLog.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        intent.putExtra(Constants.KEY_ACTION, intent.getStringExtra("action"));
        setResult(-1, intent);
        if (isFinishing()) {
            return;
        }
        SLog.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
        finish();
    }

    @Override // android.app.Activity
    protected void onPause() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onPause");
        this.f99415b.removeMessages(0);
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onResume");
        super.onResume();
        Intent intent = getIntent();
        if (intent.getBooleanExtra("is_login", false)) {
            return;
        }
        if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.f99416c && !isFinishing()) {
            finish();
        }
        if (!this.f99414a) {
            this.f99414a = true;
        } else {
            this.f99415b.sendMessage(this.f99415b.obtainMessage(0));
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        SLog.i("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f99414a);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onStart");
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onStop");
        super.onStop();
        if (Tencent.disableResetOrientation) {
            return;
        }
        try {
            int intExtra = getIntent().getIntExtra(KEY_REQUEST_ORIENTATION, -1);
            SLog.i("openSDK_LOG.AssistActivity", "getRequestedOrientation= " + intExtra);
            if (intExtra != -1) {
                setRequestedOrientation(intExtra);
            }
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.AssistActivity", "reset requestedOrientation catch exception", th2);
        }
    }

    public void setResultData(int i10, Intent intent) {
        if (intent == null) {
            SLog.w("openSDK_LOG.AssistActivity", "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i10 == 11101) {
                e.a().a("", this.f99417d, "2", "1", "7", "2");
                return;
            }
            return;
        }
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_RESPONSE);
            SLog.d("openSDK_LOG.AssistActivity", "--setResultDataForLogin-- ");
            if (TextUtils.isEmpty(stringExtra)) {
                SLog.w("openSDK_LOG.AssistActivity", "--setResultData--response is empty, setResult ACTIVITY_OK");
                setResult(-1, intent);
            } else {
                JSONObject jSONObject = new JSONObject(stringExtra);
                String strOptString = jSONObject.optString("openid");
                String strOptString2 = jSONObject.optString("access_token");
                String strOptString3 = jSONObject.optString("proxy_code");
                long jOptLong = jSONObject.optLong("proxy_expires_in");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    SLog.i("openSDK_LOG.AssistActivity", "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                    setResult(-1, intent);
                    e.a().a(strOptString, this.f99417d, "2", "1", "7", "0");
                } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                    SLog.w("openSDK_LOG.AssistActivity", "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                    setResult(0, intent);
                    e.a().a("", this.f99417d, "2", "1", "7", "1");
                } else {
                    SLog.i("openSDK_LOG.AssistActivity", "--setResultData--proxy_code and proxy_expires_in are valid");
                    setResult(-1, intent);
                }
            }
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.AssistActivity", "--setResultData--parse response failed");
            e10.printStackTrace();
        }
    }
}

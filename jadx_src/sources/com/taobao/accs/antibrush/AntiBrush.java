package com.taobao.accs.antibrush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.g;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class AntiBrush {
    private static final String ANTI_ATTACK_ACTION = "mtopsdk.mtop.antiattack.checkcode.validate.activity_action";
    private static final String ANTI_ATTACK_RESULT_ACTION = "mtopsdk.extra.antiattack.result.notify.action";
    public static final int STATUS_BRUSH = 419;
    private static final String TAG = "AntiBrush";
    private static String mHost = null;
    private static volatile boolean mIsInCheckCodeActivity = false;
    private static ScheduledFuture<?> mTimeoutTask;
    private BroadcastReceiver mAntiAttackReceiver = null;
    private Context mContext;

    /* JADX INFO: compiled from: Taobao */
    public static class AntiReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                try {
                    String stringExtra = intent.getStringExtra("Result");
                    ALog.e(AntiBrush.TAG, "anti onReceive result: " + stringExtra, new Object[0]);
                    AntiBrush.onResult(GlobalClientInfo.getContext(), stringExtra.equalsIgnoreCase("success"));
                } catch (Exception e10) {
                    ALog.e(AntiBrush.TAG, "anti onReceive", e10, new Object[0]);
                    AntiBrush.onResult(GlobalClientInfo.getContext(), false);
                }
            } catch (Throwable th2) {
                AntiBrush.onResult(GlobalClientInfo.getContext(), false);
                throw th2;
            }
        }
    }

    public AntiBrush(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void handleantiBrush(String str) {
        if (mIsInCheckCodeActivity) {
            ALog.e(TAG, "handleantiBrush return", "mIsInCheckCodeActivity", Boolean.valueOf(mIsInCheckCodeActivity));
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(ANTI_ATTACK_ACTION);
            intent.setPackage(this.mContext.getPackageName());
            intent.setFlags(268435456);
            intent.putExtra("Location", str);
            ALog.e(TAG, "handleAntiBrush:", new Object[0]);
            this.mContext.startActivity(intent);
            mIsInCheckCodeActivity = true;
            if (this.mAntiAttackReceiver == null) {
                this.mAntiAttackReceiver = new AntiReceiver();
            }
            this.mContext.registerReceiver(this.mAntiAttackReceiver, new IntentFilter(ANTI_ATTACK_RESULT_ACTION));
        } catch (Throwable th2) {
            ALog.e(TAG, "handleantiBrush", th2, new Object[0]);
        }
    }

    public static void onResult(Context context, boolean z10) {
        mIsInCheckCodeActivity = false;
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", 104);
        intent.putExtra(Constants.KEY_ANTI_BRUSH_RET, z10);
        g.a().b(context, intent);
        ScheduledFuture<?> scheduledFuture = mTimeoutTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            mTimeoutTask = null;
        }
        String str = mHost;
        if (str != null) {
            UtilityImpl.b(context, b.a(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public boolean checkAntiBrush(URL url, Map<Integer, String> map) {
        boolean z10 = true;
        if (map != null) {
            try {
                if (UtilityImpl.a()) {
                    String str = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_STATUS.ordinal()));
                    if ((TextUtils.isEmpty(str) ? 0 : Integer.valueOf(str).intValue()) == 419) {
                        String str2 = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_LOCATION.ordinal()));
                        if (TextUtils.isEmpty(str2)) {
                            z10 = false;
                        } else {
                            ALog.e(TAG, "start anti bursh location:" + str2, new Object[0]);
                            handleantiBrush(str2);
                            ScheduledFuture<?> scheduledFuture = mTimeoutTask;
                            String host = null;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(true);
                                mTimeoutTask = null;
                            }
                            mTimeoutTask = ThreadPoolExecutorFactory.schedule(new a(this), 60000L, TimeUnit.MILLISECONDS);
                            if (url != null) {
                                host = url.getHost();
                            }
                            mHost = host;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
                ALog.e(TAG, "checkAntiBrush error", th, new Object[0]);
                return z10;
            }
        } else {
            z10 = false;
        }
        try {
            if (!TextUtils.isEmpty(GlobalClientInfo.f98173c) && TextUtils.isEmpty(b.a(mHost))) {
                ALog.e(TAG, "cookie invalid, clear", new Object[0]);
                UtilityImpl.n(this.mContext);
            }
        } catch (Throwable th3) {
            th = th3;
            ALog.e(TAG, "checkAntiBrush error", th, new Object[0]);
        }
        return z10;
    }
}

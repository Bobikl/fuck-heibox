package com.heytap.mcssdk.manage;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.mcssdk.utils.f;
import com.heytap.mcssdk.utils.h;
import com.pushsdk.R;

/* JADX INFO: compiled from: NotificatonChannelManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f59932a = "Heytap PUSH";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f59933b = "System Default Channel";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f59934c = 3;

    /* JADX INFO: renamed from: com.heytap.mcssdk.manage.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NotificatonChannelManager.java */
    public class RunnableC0495a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f59935b;

        RunnableC0495a(Context context) {
            this.f59935b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.b().k()) {
                return;
            }
            String string = this.f59935b.getString(R.string.system_default_channel);
            if (TextUtils.isEmpty(string)) {
                string = a.f59933b;
            }
            f.b().o(a.this.b(this.f59935b, a.f59932a, string, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(26)
    public boolean b(Context context, String str, String str2, int i10) {
        NotificationManager notificationManager;
        if (context == null || (notificationManager = (NotificationManager) context.getSystemService("notification")) == null) {
            return false;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, i10));
        return true;
    }

    public void c(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        h.a(new RunnableC0495a(context));
    }
}

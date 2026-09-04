package com.heytap.mcssdk.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.constant.ConfigConstant;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.NotificationSortMessage;
import com.heytap.msp.push.notification.ISortListener;
import com.heytap.msp.push.notification.PushNotification;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x9.c;
import x9.d;

/* JADX INFO: compiled from: PushNotificationSortManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f59940d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f59942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f59943g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f59937a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<NotificationSortMessage> f59938b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f59941e = new ArrayList();

    /* JADX INFO: compiled from: PushNotificationSortManager.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f59944a = new b();

        private a() {
        }
    }

    private void a(ISortListener iSortListener, boolean z10, PushNotification.Builder builder) {
        if (iSortListener != null) {
            iSortListener.buildCompleted(z10, builder, this.f59941e);
        }
    }

    private DataMessage b(Context context, NotificationSortMessage notificationSortMessage) {
        DataMessage dataMessage = new DataMessage(context.getPackageName(), notificationSortMessage.getMessageId());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d.b.f141169a, "false");
            String statisticData = notificationSortMessage.getStatisticData();
            if (!TextUtils.isEmpty(statisticData)) {
                jSONObject.put(d.b.f141170b, statisticData);
            }
            dataMessage.setStatisticsExtra(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return dataMessage;
    }

    private boolean c(NotificationManager notificationManager, Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        boolean zO = true;
        if (this.f59942f + this.f59943g < this.f59937a) {
            if (notificationSortMessage.getAutoDelete() == -1) {
                notificationSortMessage.setGroup(d.a.f141167b + context.getPackageName());
            } else {
                notificationSortMessage.setGroup(d.a.f141168c + context.getPackageName());
            }
        } else if (notificationSortMessage.getAutoDelete() == -1) {
            notificationSortMessage.setGroup(d.a.f141167b + context.getPackageName());
            int i10 = this.f59937a - this.f59943g;
            if (i10 > 0) {
                e(context, notificationManager, i10 - 1);
            } else {
                Notification notificationA = com.heytap.mcssdk.notification.a.a(context, notificationSortMessage.getGroup(), builder);
                if (notificationA != null) {
                    notificationManager.notify(4096, notificationA);
                }
            }
        } else {
            zO = o(context, notificationManager, notificationSortMessage);
        }
        if (zO) {
            g(builder, notificationSortMessage);
        } else {
            z9.a.b(context, c.a.f141164u1, b(context, notificationSortMessage));
        }
        return zO;
    }

    private void d(NotificationManager notificationManager, Context context) {
        m(com.heytap.mcssdk.notification.a.b(notificationManager, context.getPackageName()));
    }

    private void e(Context context, NotificationManager notificationManager, int i10) {
        p(this.f59938b, i10);
        r(context, notificationManager, this.f59938b);
    }

    private void f(Context context, NotificationManager notificationManager, JSONArray jSONArray, List<NotificationSortMessage> list, List<DataMessage> list2) {
        for (NotificationSortMessage notificationSortMessage : list) {
            if (notificationSortMessage.isMcs()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_NOTIFY_ID, notificationSortMessage.getNotifyId());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            } else {
                list2.add(b(context, notificationSortMessage));
                this.f59941e.add(notificationSortMessage.getMessageId());
            }
            notificationManager.cancel(notificationSortMessage.getNotifyId());
        }
    }

    private void g(PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, notificationSortMessage.getAutoDelete());
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, notificationSortMessage.getImportantLevel());
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
        bundle.putLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, System.currentTimeMillis());
        bundle.putBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, false);
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA, notificationSortMessage.getStatisticData());
        builder.addExtras(bundle);
        builder.setGroup(notificationSortMessage.getGroup());
    }

    private boolean h(PushNotification.Builder builder, int i10, int i11, String str, String str2) {
        Context contextN = com.heytap.mcssdk.d.P().N();
        if (builder == null || contextN == null) {
            return false;
        }
        NotificationManager notificationManagerC = com.heytap.mcssdk.notification.a.c(contextN);
        NotificationSortMessage notificationSortMessage = new NotificationSortMessage(str, i11, i10, false, System.currentTimeMillis(), str2);
        if (!n(contextN, notificationManagerC, notificationSortMessage, builder)) {
            return true;
        }
        d(notificationManagerC, contextN);
        return c(notificationManagerC, contextN, builder, notificationSortMessage);
    }

    public static b i() {
        return a.f59944a;
    }

    private void j(int i10) {
        if (i10 == -1) {
            this.f59943g++;
        } else if (i10 == 1) {
            this.f59942f++;
        }
    }

    private void k(int i10) {
        if (i10 == 7) {
            this.f59939c++;
        } else if (i10 == 5) {
            this.f59940d++;
        }
    }

    private void l(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getAutoDelete() != 1) {
            return;
        }
        if (this.f59938b.size() != 0) {
            for (int size = this.f59938b.size() - 1; size >= 0; size--) {
                NotificationSortMessage notificationSortMessage2 = this.f59938b.get(size);
                if (notificationSortMessage.getImportantLevel() >= notificationSortMessage2.getImportantLevel() && notificationSortMessage.getPostTime() >= notificationSortMessage2.getPostTime()) {
                    this.f59938b.add(size + 1, notificationSortMessage2);
                    return;
                }
            }
        }
        this.f59938b.add(0, notificationSortMessage);
    }

    private void m(StatusBarNotification[] statusBarNotificationArr) {
        q();
        if (statusBarNotificationArr == null || statusBarNotificationArr.length == 0) {
            return;
        }
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            Bundle bundle = statusBarNotification.getNotification().extras;
            boolean z10 = bundle.getBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, true);
            long j10 = bundle.getLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, statusBarNotification.getPostTime());
            String string = bundle.getString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, "");
            int i10 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, 1);
            int i11 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, 7);
            NotificationSortMessage notificationSortMessage = new NotificationSortMessage(string, i11, i10, z10, j10, statusBarNotification.getId(), bundle.getString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA));
            j(i10);
            k(i11);
            l(notificationSortMessage);
        }
    }

    private boolean o(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage) {
        int i10 = this.f59943g;
        int i11 = this.f59937a;
        boolean z10 = false;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - i10;
        if (notificationSortMessage.getImportantLevel() == 7 || (notificationSortMessage.getImportantLevel() != 5 ? this.f59939c + this.f59940d < i12 : this.f59939c < i12)) {
            z10 = true;
        }
        if (z10) {
            e(context, notificationManager, i12 - 1);
        }
        return z10;
    }

    private int p(List<NotificationSortMessage> list, int i10) {
        int size = list == null ? 0 : list.size();
        if (i10 <= 0 || size == 0) {
            return i10;
        }
        if (size < i10) {
            int i11 = i10 - size;
            list.clear();
            return i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            list.remove((size - 1) - i12);
        }
        return 0;
    }

    private void q() {
        this.f59942f = 0;
        this.f59943g = 0;
        this.f59939c = 0;
        this.f59940d = 0;
        this.f59938b.clear();
        this.f59941e.clear();
    }

    private void r(Context context, NotificationManager notificationManager, List<NotificationSortMessage> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        f(context, notificationManager, jSONArray, list, arrayList);
        if (jSONArray.length() != 0) {
            try {
                jSONObject.put(d.b.f141171c, jSONArray);
                HeytapPushManager.cancelNotification(jSONObject);
            } catch (JSONException unused) {
            }
        }
        if (arrayList.size() != 0) {
            HashMap map = new HashMap();
            map.put(c.a.f141165v1, arrayList);
            StatisticUtils.statisticEvent(context, map);
        }
    }

    public boolean n(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage, PushNotification.Builder builder) {
        int i10;
        if (notificationSortMessage.getAutoDelete() == 0 || (i10 = Build.VERSION.SDK_INT) < 24 || i10 >= 30) {
            return false;
        }
        if (!com.heytap.mcssdk.notification.a.d(notificationManager, context.getPackageName(), 4096)) {
            return true;
        }
        notificationSortMessage.setGroup(d.a.f141167b + context.getPackageName());
        g(builder, notificationSortMessage);
        return false;
    }

    public void s(PushNotification.Builder builder, ISortListener iSortListener) {
        if (builder == null) {
            return;
        }
        a(iSortListener, h(builder, builder.getAutoDelete(), builder.getImportantLevel(), builder.getMessageId(), builder.getStatisticData()), builder);
    }
}

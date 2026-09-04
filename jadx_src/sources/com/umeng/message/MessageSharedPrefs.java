package com.umeng.message;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hbutils.utils.w;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.aq;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.h;
import com.umeng.message.proguard.x;
import com.umeng.socialize.a.a;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class MessageSharedPrefs {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile MessageSharedPrefs f105560d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f105561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aq f105562b = new aq("push");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f105563c = null;

    private MessageSharedPrefs(Context context) {
        this.f105561a = context.getApplicationContext();
    }

    public static MessageSharedPrefs getInstance(Context context) {
        if (f105560d == null) {
            synchronized (MessageSharedPrefs.class) {
                if (f105560d == null) {
                    f105560d = new MessageSharedPrefs(context);
                }
            }
        }
        return f105560d;
    }

    private void setMessageAppKey(String str) {
        if (f.b(this.f105561a)) {
            if (TextUtils.isEmpty(str)) {
                UPLog.e("Prefs", "appkey is empty!");
            } else {
                this.f105562b.a("appkey", str);
            }
        }
    }

    private void setMessageAppSecret(String str) {
        if (f.b(this.f105561a)) {
            if (TextUtils.isEmpty(str)) {
                UPLog.e("Prefs", "message secret is empty!");
            } else {
                this.f105562b.a("message_secret", str);
            }
        }
    }

    private void setMessageChannel(String str) {
        if (f.b(this.f105561a)) {
            this.f105562b.a("channel", str);
        }
    }

    public final String a(int i10, String str) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            cursorQuery = this.f105561a.getContentResolver().query(h.a(this.f105561a), new String[]{"alias"}, "type=? and exclusive=?", new String[]{str, String.valueOf(i10)}, "time desc");
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToFirst();
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("alias"));
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                UPLog.e("Prefs", th2);
                            }
                            return string;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        UPLog.e("Prefs", e);
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                UPLog.e("Prefs", th3);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = cursorQuery;
                }
                th = th4;
                cursor = cursorQuery;
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th5) {
                        UPLog.e("Prefs", th5);
                    }
                }
                throw th;
            }
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable th6) {
                    UPLog.e("Prefs", th6);
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void a(int i10) {
        this.f105562b.a("tag_remain", i10);
    }

    public final void a(String str, long j10) {
        this.f105562b.a(str + ak.aT, j10);
        this.f105562b.a(str + "ts", System.currentTimeMillis());
    }

    public final void a(String str, String str2, int i10, long j10) {
        Cursor cursorQuery = null;
        try {
            Application applicationA = x.a();
            try {
                this.f105561a.getContentResolver().delete(h.a(this.f105561a), "type=?", new String[]{str2});
            } catch (Exception e10) {
                UPLog.e("Prefs", e10);
            }
            String[] strArr = {str, str2, String.valueOf(i10)};
            cursorQuery = applicationA.getContentResolver().query(h.a(applicationA), null, "alias=? and type=? and exclusive=?", strArr, "time desc");
            ContentValues contentValues = new ContentValues();
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put(RemoteMessageConst.TTL, Long.valueOf(j10));
            contentValues.put("type", str2);
            contentValues.put("alias", str);
            contentValues.put("exclusive", Integer.valueOf(i10));
            if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                this.f105561a.getContentResolver().insert(h.a(applicationA), contentValues);
            } else {
                this.f105561a.getContentResolver().update(h.a(applicationA), contentValues, "alias=? and type=? and exclusive=?", strArr);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (cursorQuery != null) {
            try {
                cursorQuery.close();
            } catch (Throwable th2) {
                UPLog.e("Prefs", th2);
            }
        }
    }

    public final void a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        Set<String> setB = this.f105562b.b("tags", new HashSet());
        setB.addAll(Arrays.asList(strArr));
        this.f105562b.a("tags", setB);
    }

    public final boolean a() {
        Throwable th2;
        long jB;
        try {
            jB = this.f105562b.b(d.f104709p, 0L);
            if (jB > 0) {
                try {
                    UPLog.d("Prefs", "today first start:", new SimpleDateFormat(w.f73604k, Locale.getDefault()).format(new Date(jB)));
                } catch (Throwable th3) {
                    th2 = th3;
                    UPLog.e("Prefs", th2);
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            jB = 0;
        }
        return f.a(jB);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public final boolean a(int i10, String str, String str2) throws Throwable {
        Throwable th2;
        Cursor cursor;
        try {
            try {
                String[] strArr = {str2, str, String.valueOf(i10)};
                UPLog.i("Prefs", "type", str2, "alias", str, "exclusive", Integer.valueOf(i10));
                Cursor cursorQuery = this.f105561a.getContentResolver().query(h.a(this.f105561a), null, "type=? and alias=? and exclusive=?", strArr, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            UPLog.e("Prefs", th3);
                        }
                    }
                    return false;
                }
                try {
                    int count = cursorQuery.getCount();
                    UPLog.i("Prefs", "count", Integer.valueOf(count));
                    if (count <= 0) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th4) {
                            UPLog.e("Prefs", th4);
                        }
                        return false;
                    }
                    cursorQuery.moveToFirst();
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("type"));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("alias"));
                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex(RemoteMessageConst.TTL));
                    boolean z10 = Math.abs(System.currentTimeMillis() - cursorQuery.getLong(cursorQuery.getColumnIndex("time"))) < 1000 * j10;
                    UPLog.i("Prefs", "type", string, "alias", string2, "alive", Boolean.valueOf(z10), RemoteMessageConst.TTL, Long.valueOf(j10));
                    if (z10 && TextUtils.equals(string, str2) && TextUtils.equals(str, string2)) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th5) {
                            UPLog.e("Prefs", th5);
                        }
                        return true;
                    }
                    cursorQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    cursor = cursorQuery;
                    try {
                        UPLog.e("Prefs", e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th6) {
                        th2 = th6;
                        if (cursor != null) {
                            throw th2;
                        }
                        try {
                            cursor.close();
                            throw th2;
                        } catch (Throwable th7) {
                            UPLog.e("Prefs", th7);
                            throw th2;
                        }
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
                return false;
            } catch (Throwable th9) {
                UPLog.e("Prefs", th9);
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th10) {
            th2 = th10;
            cursor = null;
        }
    }

    public final boolean a(String str) {
        long jB = this.f105562b.b(str + ak.aT, 0L);
        if (jB <= 0) {
            return true;
        }
        aq aqVar = this.f105562b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("ts");
        return Math.abs(System.currentTimeMillis() - aqVar.b(sb2.toString(), 0L)) / 1000 >= jB;
    }

    public final int b() {
        return this.f105562b.b("notification_number", 1);
    }

    public final void b(String str) {
        this.f105562b.a(str + ak.aT);
        this.f105562b.a(str + "ts");
    }

    public final String c() {
        return this.f105562b.b("appkey", "");
    }

    public final void c(String str) {
        this.f105562b.a("last_click_msg_id", str);
    }

    public final int d() {
        return this.f105562b.b("tag_remain", 64);
    }

    public final String e() {
        String strB = this.f105562b.b("service_class", "");
        if (!TextUtils.isEmpty(strB)) {
            try {
                Class.forName(strB);
                return strB;
            } catch (Throwable unused) {
                UPLog.e("Prefs", "custom service not exist:", strB, "if has removed. pls invoke PushAgent.setPushIntentServiceClass(null)");
            }
        }
        return "";
    }

    public final String f() {
        return this.f105562b.b("last_click_msg_id", "");
    }

    public final int g() {
        return this.f105562b.b("mute_duration", 60);
    }

    public final int h() {
        return this.f105562b.b("notification_vibrate", 0);
    }

    public final int i() {
        return this.f105562b.b("notification_light", 0);
    }

    public final int j() {
        return this.f105562b.b("notification_sound", 0);
    }

    public final String k() {
        return this.f105562b.b(RemoteMessageConst.DEVICE_TOKEN, "");
    }

    public final boolean l() {
        return this.f105562b.b("l_u_e", false);
    }

    public final long m() {
        return this.f105562b.b(a.f106071d, 0L);
    }

    public final int n() {
        return this.f105562b.b("re_pop_cfg", 0);
    }

    public final int o() {
        Calendar calendar = Calendar.getInstance();
        String str = String.format(Locale.getDefault(), "%d.%d.", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(6)));
        String strB = this.f105562b.b("re_pop_times", "");
        if (strB.startsWith(str)) {
            try {
                return Integer.parseInt(strB.replace(str, ""));
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}

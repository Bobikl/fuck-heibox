package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.max.hbutils.utils.w;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.ae;
import com.umeng.message.proguard.ag;
import com.umeng.message.proguard.ai;
import com.umeng.message.proguard.aq;
import com.umeng.message.proguard.b;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.h;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class InAppMessageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f105583a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f105584d = 1800000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f105585e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static InAppMessageManager f105586f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f105587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f105588c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aq f105590h = new aq("in_app");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private UInAppHandler f105589g = new UmengInAppClickHandler();

    private InAppMessageManager(Context context) {
        this.f105587b = context.getApplicationContext();
    }

    static /* synthetic */ ae a(InAppMessageManager inAppMessageManager, String str) {
        Cursor cursorQuery = inAppMessageManager.f105587b.getContentResolver().query(h.e(inAppMessageManager.f105587b), null, "MsgId=?", new String[]{str}, null);
        ae aeVar = cursorQuery != null ? cursorQuery.moveToFirst() : false ? new ae(cursorQuery) : null;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return aeVar;
    }

    public static boolean b(UInAppMessage uInAppMessage) {
        try {
            return System.currentTimeMillis() < new SimpleDateFormat(w.f73604k, Locale.CHINA).parse(uInAppMessage.expire_time).getTime();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private int d(String str) {
        return Integer.parseInt(a(str, "0"));
    }

    public static InAppMessageManager getInstance(Context context) {
        if (f105586f == null) {
            synchronized (InAppMessageManager.class) {
                if (f105586f == null) {
                    f105586f = new InAppMessageManager(context);
                }
            }
        }
        return f105586f;
    }

    public final String a() {
        return a("KEY_LAST_SPLASH_ID", "");
    }

    public final String a(String str) {
        return a("KEY_LAST_CARD_ID_".concat(String.valueOf(str)), "");
    }

    public final String a(String str, String str2) {
        return this.f105590h.b(str, str2);
    }

    public final void a(UInAppMessage uInAppMessage) {
        if (uInAppMessage == null) {
            b("KEY_LAST_SPLASH_ID", "");
        } else if (uInAppMessage.getRaw() != null) {
            b("KEY_LAST_SPLASH_ID", uInAppMessage.getRaw().toString());
        }
    }

    public final void a(UInAppMessage uInAppMessage, String str) {
        if (uInAppMessage == null) {
            b("KEY_LAST_CARD_ID_".concat(String.valueOf(str)), "");
        } else if (uInAppMessage.getRaw() != null) {
            b("KEY_LAST_CARD_ID_".concat(String.valueOf(str)), uInAppMessage.getRaw().toString());
        }
    }

    public final void a(final File file) {
        b.c(new Runnable() { // from class: com.umeng.message.inapp.InAppMessageManager.3
            @Override // java.lang.Runnable
            public final void run() {
                File file2 = file;
                if (file2 != null && file2.exists() && file.canWrite() && file.isDirectory()) {
                    for (File file3 : file.listFiles()) {
                        if (!file3.isDirectory()) {
                            file3.delete();
                        }
                    }
                    file.delete();
                }
            }
        });
    }

    public final void a(String str, int i10) {
        if (i10 == 0) {
            b(str, "0");
        }
        if (i10 == 1) {
            b(str, String.valueOf(d(str) + 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b A[DONT_GENERATE, PHI: r1
  0x003b: PHI (r1v3 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0039, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    public final ArrayList<ae> b() {
        ArrayList<ae> arrayList = new ArrayList<>();
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f105587b.getContentResolver().query(h.e(this.f105587b), null, null, null, null);
            for (boolean zMoveToFirst = cursorQuery != null ? cursorQuery.moveToFirst() : false; zMoveToFirst; zMoveToFirst = cursorQuery.moveToNext()) {
                arrayList.add(new ae(cursorQuery));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        String strConcat = "KEY_LAST_SHOW_CARD_TS_".concat(String.valueOf(str));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        b(strConcat, sb2.toString());
    }

    public final void b(final String str, final String str2) {
        b.c(new Runnable() { // from class: com.umeng.message.inapp.InAppMessageManager.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    InAppMessageManager.this.f105590h.a(str, str2);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
    }

    public final long c(String str) {
        return Long.parseLong(a("KEY_LAST_SHOW_CARD_TS_".concat(String.valueOf(str)), "0"));
    }

    public final boolean c(UInAppMessage uInAppMessage) {
        return uInAppMessage.show_times == 0 || d(uInAppMessage.msg_id) < uInAppMessage.show_times;
    }

    public UInAppHandler getInAppHandler() {
        return this.f105589g;
    }

    public void setInAppHandler(UInAppHandler uInAppHandler) {
        this.f105589g = uInAppHandler;
    }

    public void setInAppMsgDebugMode(boolean z10) {
        f105583a = z10;
    }

    public void setMainActivityPath(String str) {
        this.f105588c = str;
    }

    public void setPlainTextSize(int i10, int i11, int i12) {
        if (i10 <= 0 || i11 <= 0 || i12 <= 0) {
            UMLog.mutlInfo("InAppMessageManager", 0, "纯文本字体大小不能小于0");
            return;
        }
        b("KEY_PLAIN_TEXT_SIZE", i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + i12);
    }

    public void showCardMessage(Activity activity, String str, IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        if (f.b()) {
            UPLog.d("InAppMessageManager", "showCardMessage failed, silent mode!");
            return;
        }
        ag agVar = new ag(activity, str, iUmengInAppMsgCloseCallback);
        if (TextUtils.isEmpty(agVar.f105689c.trim())) {
            UMLog.mutlInfo(ag.f105687a, 0, "插屏消息的标签不能为空");
            return;
        }
        if (!agVar.a(agVar.f105689c)) {
            UMLog.mutlInfo(ag.f105687a, 0, "插屏消息的最大标签数为 10");
            return;
        }
        if (f105583a) {
            ai.a(agVar.f105688b).a(agVar.f105689c, agVar);
        } else if (System.currentTimeMillis() - Long.parseLong(getInstance(agVar.f105688b).a("KEY_CARD_TS_".concat(String.valueOf(agVar.f105689c)), "0")) > f105584d) {
            ai.a(agVar.f105688b).a(agVar.f105689c, agVar);
        } else {
            agVar.b((UInAppMessage) null);
        }
    }
}

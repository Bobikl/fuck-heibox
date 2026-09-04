package com.umeng.commonsdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class UMConfigureImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f105048a = "delayed_transmission_flag_new";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f105052e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ScheduledExecutorService f105053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f105054g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CopyOnWriteArrayList<onMessageSendListener> f105049b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f105050c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f105051d = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f105055h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Runnable f105056i = new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (UMConfigureImpl.f105050c == 0 || UMConfigureImpl.f105055h >= 10) {
                    if (!UMConfigureImpl.f105051d) {
                        boolean unused = UMConfigureImpl.f105051d = true;
                        UMConfigureImpl.b(UMConfigureImpl.f105054g);
                    }
                    if (UMConfigureImpl.f105053f != null) {
                        UMConfigureImpl.f105053f.shutdown();
                        ScheduledExecutorService unused2 = UMConfigureImpl.f105053f = null;
                    }
                }
                UMConfigureImpl.f();
            } catch (Exception unused3) {
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void b(Context context) {
        try {
            UMEnvelopeBuild.setTransmissionSendFlag(true);
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f105049b;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                Iterator<onMessageSendListener> it = f105049b.iterator();
                while (it.hasNext()) {
                    it.next().onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f105048a, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(f105048a, true);
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f105048a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(f105048a, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ int f() {
        int i10 = f105055h;
        f105055h = i10 + 1;
        return i10;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        f105054g = context;
        try {
            if (f105050c < 1 || d(context)) {
                UMEnvelopeBuild.setTransmissionSendFlag(true);
            } else {
                UMEnvelopeBuild.setTransmissionSendFlag(false);
                c(context);
                if (f105053f == null) {
                    ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                    f105053f = scheduledExecutorServiceNewScheduledThreadPool;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(f105056i, 0L, 100L, TimeUnit.MILLISECONDS);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerInterruptFlag() {
        try {
            f105050c++;
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerMessageSendListener(onMessageSendListener onmessagesendlistener) {
        CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList;
        try {
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList2 = f105049b;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.add(onmessagesendlistener);
            }
            if (UMEnvelopeBuild.getTransmissionSendFlag() && (copyOnWriteArrayList = f105049b) != null && copyOnWriteArrayList.size() > 0) {
                Iterator<onMessageSendListener> it = f105049b.iterator();
                while (it.hasNext()) {
                    it.next().onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeInterruptFlag() {
        try {
            f105050c--;
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeMessageSendListener(onMessageSendListener onmessagesendlistener) {
        try {
            CopyOnWriteArrayList<onMessageSendListener> copyOnWriteArrayList = f105049b;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(onmessagesendlistener);
            }
        } catch (Exception unused) {
        }
    }
}

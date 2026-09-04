package com.uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.taobao.aranger.constant.Constants;
import com.uc.crashsdk.export.ICrashClient;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ICrashClient f104249a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f104250b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f104251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f104252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f104253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f104254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f104255g = new Object();

    public static File a(File file) {
        ICrashClient iCrashClient = f104249a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
        }
        return file;
    }

    public static String a(String str, boolean z10) {
        ICrashClient iCrashClient = f104249a;
        return iCrashClient != null ? iCrashClient.onGetCallbackInfo(str, z10) : "";
    }

    public static void a(ICrashClient iCrashClient) {
        f104249a = iCrashClient;
    }

    public static void a(String str, int i10, int i11) {
        ICrashClient iCrashClient = f104249a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i10, i11);
        }
        if (f104254f != null) {
            synchronized (f104254f) {
                for (ValueCallback<Bundle> valueCallback : f104254f) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants.PARAM_PROCESS_NAME, str);
                        bundle.putInt("key", i10);
                        bundle.putInt("count", i11);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        com.uc.crashsdk.a.g.a(th2);
                    }
                }
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        if (com.uc.crashsdk.a.g.a(str)) {
            com.uc.crashsdk.a.a.a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean zEquals = e.h().equals(str2);
        if (f104249a != null) {
            File file = new File(str);
            try {
                if (zEquals) {
                    f104249a.onLogGenerated(file, str3);
                } else {
                    f104249a.onClientProcessLogGenerated(str2, file, str3);
                }
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
        }
        List<ValueCallback<Bundle>> list = f104251c;
        if (!zEquals) {
            list = f104252d;
        }
        if (list != null) {
            synchronized (list) {
                for (ValueCallback<Bundle> valueCallback : list) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("filePathName", str);
                        if (!zEquals) {
                            bundle.putString(Constants.PARAM_PROCESS_NAME, str2);
                        }
                        bundle.putString("logType", str3);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th3) {
                        com.uc.crashsdk.a.g.a(th3);
                    }
                }
            }
        }
    }

    public static void a(boolean z10) {
        ICrashClient iCrashClient = f104249a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z10);
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
        }
        if (f104253e != null) {
            synchronized (f104253e) {
                for (ValueCallback<Bundle> valueCallback : f104253e) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isJava", z10);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th3) {
                        com.uc.crashsdk.a.g.a(th3);
                    }
                }
            }
        }
    }

    public static boolean a(ValueCallback<Bundle> valueCallback) {
        if (f104251c == null) {
            synchronized (f104255g) {
                if (f104251c == null) {
                    f104251c = new ArrayList();
                }
            }
        }
        synchronized (f104251c) {
            if (f104251c.size() >= f104250b) {
                return false;
            }
            f104251c.add(valueCallback);
            return true;
        }
    }

    public static boolean b(ValueCallback<Bundle> valueCallback) {
        if (f104252d == null) {
            synchronized (f104255g) {
                if (f104252d == null) {
                    f104252d = new ArrayList();
                }
            }
        }
        synchronized (f104252d) {
            if (f104252d.size() >= f104250b) {
                return false;
            }
            f104252d.add(valueCallback);
            return true;
        }
    }

    public static boolean c(ValueCallback<Bundle> valueCallback) {
        if (f104253e == null) {
            synchronized (f104255g) {
                if (f104253e == null) {
                    f104253e = new ArrayList();
                }
            }
        }
        synchronized (f104253e) {
            if (f104253e.size() >= f104250b) {
                return false;
            }
            f104253e.add(valueCallback);
            return true;
        }
    }

    public static boolean d(ValueCallback<Bundle> valueCallback) {
        if (f104254f == null) {
            synchronized (f104255g) {
                if (f104254f == null) {
                    f104254f = new ArrayList();
                }
            }
        }
        synchronized (f104254f) {
            if (f104254f.size() >= f104250b) {
                return false;
            }
            f104254f.add(valueCallback);
            return true;
        }
    }
}

package com.uc.crashsdk.a;

import android.os.Build;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.hms.framework.common.ContainerUtils;
import com.igexin.sdk.PushConsts;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.taobao.accs.common.Constants;
import com.uc.crashsdk.JNIBridge;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f104192a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f104193b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f104194c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f104195d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, a> f104196e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f104197f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f104198g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseArray<String> f104199h = new SparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f104200i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f104201j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f104202k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f104203l = null;

    /* JADX INFO: compiled from: ProGuard */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f104204a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f104205b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Map<String, String> f104206c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f104207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f104208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f104209f;

        a(String str, boolean z10, boolean z11) {
            this.f104208e = false;
            this.f104209f = false;
            this.f104207d = str;
            this.f104208e = z10;
            this.f104209f = z11;
        }

        private long d(String str) {
            return g.c(a(str));
        }

        final String a(String str) {
            return this.f104206c.get(str);
        }

        final String a(boolean z10, boolean z11, boolean z12) {
            if (this.f104207d == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                h.b(sb2, "lt", "uc");
                h.b(sb2, "pre", com.uc.crashsdk.g.e());
                h.b(sb2, "pkg", com.uc.crashsdk.a.f104130a);
                h.b(sb2, "rom", Build.VERSION.RELEASE);
                h.b(sb2, "brd", Build.BRAND);
                h.b(sb2, Constants.KEY_MODEL, Build.MODEL);
                h.a(sb2, "sdk", Build.VERSION.SDK_INT);
                h.b(sb2, ak.f104463w, com.uc.crashsdk.e.e());
                h.b(sb2, "hdw", com.uc.crashsdk.e.f());
                long jO = h.o();
                h.a(sb2, "ram", jO);
                h.b(sb2, "aram", h.a(jO));
                h.b(sb2, "cver", "3.3.2.2");
                h.b(sb2, "cseq", "211215141717");
                h.b(sb2, "ctag", "release");
                h.b(sb2, "aver", com.uc.crashsdk.a.a());
                h.b(sb2, "ver", com.uc.crashsdk.g.T());
                h.b(sb2, "sver", com.uc.crashsdk.g.U());
                h.b(sb2, "seq", com.uc.crashsdk.g.V());
                h.b(sb2, "grd", com.uc.crashsdk.b.A() ? "fg" : WebviewFragment.f94370q4);
                h.b(sb2, "os", "android");
                h.b(sb2, "dn", com.uc.crashsdk.e.q());
                String strAb = com.uc.crashsdk.g.ab();
                if (TextUtils.isEmpty(strAb)) {
                    strAb = com.uc.crashsdk.e.q();
                }
                h.b(sb2, "k_uid", strAb);
                String strAc = com.uc.crashsdk.g.ac();
                if (!TextUtils.isEmpty(strAc)) {
                    h.b(sb2, "k_channel", strAc);
                }
                sb2.append("\n");
            }
            h.b(sb2, "lt", this.f104207d);
            h.a(sb2, this.f104206c);
            if (this.f104208e && !z11) {
                long j10 = this.f104204a;
                if (j10 != 0) {
                    h.b(sb2, CommonNetImpl.UP, String.valueOf(j10));
                }
                if (z12) {
                    h.b(sb2, PushConsts.KEY_SERVICE_PIT, String.format(Locale.US, TimeModel.f55754j, Integer.valueOf(Process.myPid())));
                } else {
                    int i10 = this.f104205b;
                    if (i10 != 0) {
                        h.b(sb2, PushConsts.KEY_SERVICE_PIT, String.format(Locale.US, TimeModel.f55754j, Integer.valueOf(i10)));
                    }
                }
            }
            sb2.append("\n");
            return sb2.toString();
        }

        final void a(String str, long j10) {
            long jD = d(str) + j10;
            if (jD <= 100) {
                j10 = jD < 0 ? 0L : jD;
            }
            a(str, String.valueOf(j10));
        }

        final void a(String str, String str2) {
            this.f104206c.put(str, str2);
        }

        final boolean a(a aVar) {
            if (!this.f104209f) {
                com.uc.crashsdk.a.a.a("crashsdk", String.format(Locale.US, "WaItem '%s' is not mergable!", this.f104207d), null);
                return false;
            }
            for (String str : aVar.f104206c.keySet()) {
                if (str.startsWith("c_")) {
                    a(str, aVar.a(str));
                } else {
                    long jD = aVar.d(str);
                    if (jD == 0) {
                        a(str, aVar.a(str));
                    } else if (jD < 100) {
                        a(str, jD);
                    }
                }
            }
            return true;
        }

        final String b(String str) {
            String strA = a(str);
            return strA == null ? "" : strA;
        }

        final boolean c(String str) {
            if (g.a(str)) {
                return false;
            }
            String str2 = null;
            long jC = 0;
            HashMap map = new HashMap();
            Map mapC = h.c(str);
            int iC = 0;
            for (String str3 : mapC.keySet()) {
                String str4 = (String) mapC.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.f104208e && str3.equals(CommonNetImpl.UP)) {
                    jC = g.c(str4);
                } else if (this.f104208e && str3.equals(PushConsts.KEY_SERVICE_PIT)) {
                    iC = (int) g.c(str4);
                } else {
                    map.put(str3, str4);
                }
            }
            String str5 = this.f104207d;
            if (str5 != null && !str5.equals(str2)) {
                return false;
            }
            this.f104204a = jC;
            this.f104205b = iC;
            this.f104207d = str2;
            this.f104206c = map;
            return true;
        }
    }

    static /* synthetic */ String a(long j10) {
        return j10 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? "512M" : String.format(Locale.US, "%dG", Long.valueOf(((j10 / 1024) + 512) / 1024));
    }

    private static StringBuilder a(Iterable<a> iterable, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = true;
        for (a aVar : iterable) {
            if (z12) {
                sb2.append(aVar.a(z10, z10, z11));
                z12 = false;
            } else {
                sb2.append(aVar.a(false, z10, z11));
            }
        }
        return sb2;
    }

    private static ArrayList<a> a(File file, String str, int i10) {
        ArrayList<String> arrayListA = g.a(file, i10);
        ArrayList<a> arrayList = new ArrayList<>();
        for (String str2 : arrayListA) {
            a aVar = new a(str, false, false);
            if (aVar.c(str2)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static void a() {
        a(0, com.uc.crashsdk.b.H() ? 700000L : 70000L);
    }

    private static void a(int i10, long j10) {
        if (com.uc.crashsdk.b.F()) {
            f.a(0, new e(302, new Object[]{Integer.valueOf(i10)}), j10);
        }
    }

    private static void a(int i10, String str) {
        f104199h.put(i10, str);
    }

    private static void a(int i10, boolean z10) {
        if (a(z10, "crash rate")) {
            return;
        }
        String str = com.uc.crashsdk.g.W() + "cr.wa";
        com.uc.crashsdk.b.a(f104193b, str, new e(bb.c.b.N3, new Object[]{str, Integer.valueOf(i10)}));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00cd, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005b, B:30:0x0060, B:37:0x0071, B:38:0x0079, B:44:0x008f, B:46:0x009b, B:51:0x00b3, B:52:0x00c6, B:49:0x00a9, B:43:0x0085), top: B:68:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x005b A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00cd, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005b, B:30:0x0060, B:37:0x0071, B:38:0x0079, B:44:0x008f, B:46:0x009b, B:51:0x00b3, B:52:0x00c6, B:49:0x00a9, B:43:0x0085), top: B:68:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00cd, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005b, B:30:0x0060, B:37:0x0071, B:38:0x0079, B:44:0x008f, B:46:0x009b, B:51:0x00b3, B:52:0x00c6, B:49:0x00a9, B:43:0x0085), top: B:68:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00cd, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005b, B:30:0x0060, B:37:0x0071, B:38:0x0079, B:44:0x008f, B:46:0x009b, B:51:0x00b3, B:52:0x00c6, B:49:0x00a9, B:43:0x0085), top: B:68:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00cd, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005b, B:30:0x0060, B:37:0x0071, B:38:0x0079, B:44:0x008f, B:46:0x009b, B:51:0x00b3, B:52:0x00c6, B:49:0x00a9, B:43:0x0085), top: B:68:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x009b A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00cd, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005b, B:30:0x0060, B:37:0x0071, B:38:0x0079, B:44:0x008f, B:46:0x009b, B:51:0x00b3, B:52:0x00c6, B:49:0x00a9, B:43:0x0085), top: B:68:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00cd, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005b, B:30:0x0060, B:37:0x0071, B:38:0x0079, B:44:0x008f, B:46:0x009b, B:51:0x00b3, B:52:0x00c6, B:49:0x00a9, B:43:0x0085), top: B:68:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3 A[Catch: all -> 0x00cf, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00cd, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005b, B:30:0x0060, B:37:0x0071, B:38:0x0079, B:44:0x008f, B:46:0x009b, B:51:0x00b3, B:52:0x00c6, B:49:0x00a9, B:43:0x0085), top: B:68:0x001d }] */
    static void a(int i10, Object[] objArr) {
        File file;
        String strC;
        a aVar;
        String str;
        String strQ;
        long j10;
        boolean zC;
        boolean z10;
        switch (i10) {
            case 301:
                if (!f104192a && objArr == null) {
                    throw new AssertionError();
                }
                a(((Integer) objArr[0]).intValue(), false);
                return;
            case 302:
                if (!f104192a && objArr == null) {
                    throw new AssertionError();
                }
                synchronized (f104193b) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    if (iIntValue != 0) {
                        if (com.uc.crashsdk.a.f104131b.equals(org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d) || !com.uc.crashsdk.b.c(268435456)) {
                            file = new File(m());
                            strC = g.c(file);
                            aVar = new a(SocializeProtocolConstants.PROTOCOL_KEY_PV, true, true);
                            if (!g.a(strC)) {
                                aVar.c(strC);
                            }
                            if (iIntValue != 0) {
                                if (iIntValue == 0) {
                                    aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                    str = "fjv";
                                } else if (iIntValue == 1) {
                                    str = "hpv";
                                } else {
                                    if (iIntValue == 2) {
                                        aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                        str = "npv";
                                    }
                                    strQ = com.uc.crashsdk.e.q();
                                    j10 = aVar.f104204a;
                                    if (j10 != 0 || System.currentTimeMillis() - j10 >= 28800000) {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    } else {
                                        zC = false;
                                    }
                                    if (zC) {
                                        aVar.f104206c = new HashMap();
                                        aVar.f104204a = System.currentTimeMillis();
                                        aVar.f104205b = Process.myPid();
                                    }
                                    g.a(file, aVar.a(false, false, true));
                                }
                                aVar.a(str, 1L);
                                strQ = com.uc.crashsdk.e.q();
                                j10 = aVar.f104204a;
                                if (j10 != 0) {
                                    zC = c(strQ, aVar.a(true, true, false));
                                } else {
                                    zC = c(strQ, aVar.a(true, true, false));
                                }
                                if (zC) {
                                    aVar.f104206c = new HashMap();
                                    aVar.f104204a = System.currentTimeMillis();
                                    aVar.f104205b = Process.myPid();
                                }
                                g.a(file, aVar.a(false, false, true));
                            } else {
                                if (aVar.f104205b == Process.myPid()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    if (iIntValue == 0) {
                                        aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                        str = "fjv";
                                    } else if (iIntValue == 1) {
                                        str = "hpv";
                                    } else {
                                        if (iIntValue == 2) {
                                            aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                            str = "npv";
                                        }
                                        strQ = com.uc.crashsdk.e.q();
                                        j10 = aVar.f104204a;
                                        if (j10 != 0) {
                                            zC = c(strQ, aVar.a(true, true, false));
                                        } else {
                                            zC = c(strQ, aVar.a(true, true, false));
                                        }
                                        if (zC) {
                                            aVar.f104206c = new HashMap();
                                            aVar.f104204a = System.currentTimeMillis();
                                            aVar.f104205b = Process.myPid();
                                        }
                                        g.a(file, aVar.a(false, false, true));
                                    }
                                    aVar.a(str, 1L);
                                    strQ = com.uc.crashsdk.e.q();
                                    j10 = aVar.f104204a;
                                    if (j10 != 0) {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    } else {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    }
                                    if (zC) {
                                        aVar.f104206c = new HashMap();
                                        aVar.f104204a = System.currentTimeMillis();
                                        aVar.f104205b = Process.myPid();
                                    }
                                    g.a(file, aVar.a(false, false, true));
                                }
                            }
                        }
                    } else if (!f104200i) {
                        f104200i = true;
                        if (com.uc.crashsdk.a.f104131b.equals(org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d)) {
                            file = new File(m());
                            strC = g.c(file);
                            aVar = new a(SocializeProtocolConstants.PROTOCOL_KEY_PV, true, true);
                            if (!g.a(strC)) {
                                aVar.c(strC);
                            }
                            if (iIntValue != 0) {
                                if (iIntValue == 0) {
                                    aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                    str = "fjv";
                                } else if (iIntValue == 1) {
                                    str = "hpv";
                                } else {
                                    if (iIntValue == 2) {
                                        aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                        str = "npv";
                                    }
                                    strQ = com.uc.crashsdk.e.q();
                                    j10 = aVar.f104204a;
                                    if (j10 != 0) {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    } else {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    }
                                    if (zC) {
                                        aVar.f104206c = new HashMap();
                                        aVar.f104204a = System.currentTimeMillis();
                                        aVar.f104205b = Process.myPid();
                                    }
                                    g.a(file, aVar.a(false, false, true));
                                }
                                aVar.a(str, 1L);
                                strQ = com.uc.crashsdk.e.q();
                                j10 = aVar.f104204a;
                                if (j10 != 0) {
                                    zC = c(strQ, aVar.a(true, true, false));
                                } else {
                                    zC = c(strQ, aVar.a(true, true, false));
                                }
                                if (zC) {
                                    aVar.f104206c = new HashMap();
                                    aVar.f104204a = System.currentTimeMillis();
                                    aVar.f104205b = Process.myPid();
                                }
                                g.a(file, aVar.a(false, false, true));
                            } else {
                                if (aVar.f104205b == Process.myPid()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    if (iIntValue == 0) {
                                        aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                        str = "fjv";
                                    } else if (iIntValue == 1) {
                                        str = "hpv";
                                    } else {
                                        if (iIntValue == 2) {
                                            aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                            str = "npv";
                                        }
                                        strQ = com.uc.crashsdk.e.q();
                                        j10 = aVar.f104204a;
                                        if (j10 != 0) {
                                            zC = c(strQ, aVar.a(true, true, false));
                                        } else {
                                            zC = c(strQ, aVar.a(true, true, false));
                                        }
                                        if (zC) {
                                            aVar.f104206c = new HashMap();
                                            aVar.f104204a = System.currentTimeMillis();
                                            aVar.f104205b = Process.myPid();
                                        }
                                        g.a(file, aVar.a(false, false, true));
                                    }
                                    aVar.a(str, 1L);
                                    strQ = com.uc.crashsdk.e.q();
                                    j10 = aVar.f104204a;
                                    if (j10 != 0) {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    } else {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    }
                                    if (zC) {
                                        aVar.f104206c = new HashMap();
                                        aVar.f104204a = System.currentTimeMillis();
                                        aVar.f104205b = Process.myPid();
                                    }
                                    g.a(file, aVar.a(false, false, true));
                                }
                            }
                        } else {
                            file = new File(m());
                            strC = g.c(file);
                            aVar = new a(SocializeProtocolConstants.PROTOCOL_KEY_PV, true, true);
                            if (!g.a(strC)) {
                                aVar.c(strC);
                            }
                            if (iIntValue != 0) {
                                if (iIntValue == 0) {
                                    aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                    str = "fjv";
                                } else if (iIntValue == 1) {
                                    str = "hpv";
                                } else {
                                    if (iIntValue == 2) {
                                        aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                        str = "npv";
                                    }
                                    strQ = com.uc.crashsdk.e.q();
                                    j10 = aVar.f104204a;
                                    if (j10 != 0) {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    } else {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    }
                                    if (zC) {
                                        aVar.f104206c = new HashMap();
                                        aVar.f104204a = System.currentTimeMillis();
                                        aVar.f104205b = Process.myPid();
                                    }
                                    g.a(file, aVar.a(false, false, true));
                                }
                                aVar.a(str, 1L);
                                strQ = com.uc.crashsdk.e.q();
                                j10 = aVar.f104204a;
                                if (j10 != 0) {
                                    zC = c(strQ, aVar.a(true, true, false));
                                } else {
                                    zC = c(strQ, aVar.a(true, true, false));
                                }
                                if (zC) {
                                    aVar.f104206c = new HashMap();
                                    aVar.f104204a = System.currentTimeMillis();
                                    aVar.f104205b = Process.myPid();
                                }
                                g.a(file, aVar.a(false, false, true));
                            } else {
                                if (aVar.f104205b == Process.myPid()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    if (iIntValue == 0) {
                                        aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                        str = "fjv";
                                    } else if (iIntValue == 1) {
                                        str = "hpv";
                                    } else {
                                        if (iIntValue == 2) {
                                            aVar.a(SocializeProtocolConstants.PROTOCOL_KEY_PV, 1L);
                                            str = "npv";
                                        }
                                        strQ = com.uc.crashsdk.e.q();
                                        j10 = aVar.f104204a;
                                        if (j10 != 0) {
                                            zC = c(strQ, aVar.a(true, true, false));
                                        } else {
                                            zC = c(strQ, aVar.a(true, true, false));
                                        }
                                        if (zC) {
                                            aVar.f104206c = new HashMap();
                                            aVar.f104204a = System.currentTimeMillis();
                                            aVar.f104205b = Process.myPid();
                                        }
                                        g.a(file, aVar.a(false, false, true));
                                    }
                                    aVar.a(str, 1L);
                                    strQ = com.uc.crashsdk.e.q();
                                    j10 = aVar.f104204a;
                                    if (j10 != 0) {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    } else {
                                        zC = c(strQ, aVar.a(true, true, false));
                                    }
                                    if (zC) {
                                        aVar.f104206c = new HashMap();
                                        aVar.f104204a = System.currentTimeMillis();
                                        aVar.f104205b = Process.myPid();
                                    }
                                    g.a(file, aVar.a(false, false, true));
                                }
                            }
                        }
                    }
                    break;
                }
                return;
            case 303:
                b(false);
                return;
            default:
                if (!f104192a) {
                    throw new AssertionError();
                }
                return;
        }
    }

    private static void a(a aVar) {
        Map<String, String> map = f104194c;
        synchronized (map) {
            for (String str : map.keySet()) {
                aVar.a(str, f104194c.get(str));
            }
        }
    }

    static void a(String str) {
        synchronized (f104193b) {
            File file = new File(m());
            a aVar = new a(SocializeProtocolConstants.PROTOCOL_KEY_PV, true, true);
            String strC = g.c(file);
            if (!g.a(strC)) {
                aVar.c(strC);
            }
            aVar.a(str, 1L);
            aVar.a("aujv", 1L);
            g.a(file, aVar.a(false, false, false));
        }
    }

    public static void a(String str, int i10, int i11) {
        if (com.uc.crashsdk.g.Q()) {
            synchronized (f104197f) {
                Map<String, a> map = f104196e;
                a aVar = map.get(str);
                if (aVar == null) {
                    aVar = new a("cst", false, true);
                    map.put(str, aVar);
                    a(aVar);
                }
                SparseArray<String> sparseArray = f104199h;
                synchronized (sparseArray) {
                    if (sparseArray.size() == 0) {
                        a(100, SocializeProtocolConstants.PROTOCOL_KEY_PV);
                        a(102, "hpv");
                        a(1, "all");
                        a(2, "afg");
                        a(101, "abg");
                        a(3, "jfg");
                        a(4, "jbg");
                        a(7, "nfg");
                        a(8, "nbg");
                        a(27, "nafg");
                        a(28, "nabg");
                        a(9, "nho");
                        a(10, "uar");
                        a(29, "ulm");
                        a(30, "ukt");
                        a(31, "uet");
                        a(32, "urs");
                        a(11, "ufg");
                        a(12, "ubg");
                        a(40, "anf");
                        a(41, "anb");
                        a(42, "ancf");
                        a(43, "ancb");
                        a(13, "lup");
                        a(14, "luf");
                        a(15, "lef");
                        a(200, "ltf");
                        a(16, "laf");
                        a(22, "lac");
                        a(23, "lau");
                        a(17, "llf");
                        a(18, "lul");
                        a(19, "lub");
                        a(20, "luc");
                        a(21, "luu");
                        a(24, "lzc");
                        a(201, "lec");
                        a(25, "lrc");
                        a(26, "lss");
                    }
                }
                String str2 = sparseArray.get(i10);
                if (str2 == null) {
                    com.uc.crashsdk.a.a.a("crashsdk", "map key is not set with: " + i10, null);
                }
                aVar.a("prc", str);
                if (str2 != null) {
                    aVar.a(str2, String.valueOf(i11));
                }
            }
        }
    }

    static /* synthetic */ void a(StringBuilder sb2, String str, long j10) {
        b(sb2, str, String.valueOf(j10));
    }

    static /* synthetic */ void a(StringBuilder sb2, Map map) {
        for (String str : map.keySet()) {
            b(sb2, str, (String) map.get(str));
        }
    }

    public static void a(boolean z10) {
        a(1, z10);
    }

    public static boolean a(String str, String str2) {
        try {
            String str3 = "c_" + str.replaceAll("[^0-9a-zA-Z-_]", com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            String strReplaceAll = g.a(str2) ? "" : str2.replaceAll("[`=]", com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            Map<String, String> map = f104194c;
            synchronized (map) {
                if (map.get(str3) == null) {
                    int i10 = f104195d;
                    if (i10 >= 20) {
                        return false;
                    }
                    f104195d = i10 + 1;
                }
                map.put(str3, strReplaceAll);
                return true;
            }
        } catch (Throwable th2) {
            g.a(th2);
            return false;
        }
    }

    public static boolean a(String str, String str2, boolean z10, boolean z11) {
        if (!com.uc.crashsdk.g.Q()) {
            return false;
        }
        return com.uc.crashsdk.b.a(f104198g, n(), new e(bb.c.b.P3, new Object[]{str, str2, Boolean.valueOf(z10), Boolean.valueOf(z11)}));
    }

    public static boolean a(boolean z10, String str) {
        if (!com.uc.crashsdk.b.f104224d || z10 || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        com.uc.crashsdk.a.a.b("crashsdk", "Native is crashing, skip stat for " + str);
        return true;
    }

    public static void b() {
        a(2, 0L);
    }

    private static void b(int i10, long j10) {
        if (com.uc.crashsdk.g.Q()) {
            f.a(1, new e(301, new Object[]{Integer.valueOf(i10)}), j10);
        }
    }

    static void b(String str) {
        synchronized (f104202k) {
            f104203l = str;
            b.a(com.uc.crashsdk.b.k(), str + "\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(str2);
        sb2.append("`");
    }

    public static void b(boolean z10) {
        if (a(z10, "crash detail upload")) {
            return;
        }
        String str = com.uc.crashsdk.g.W() + "dt.wa";
        com.uc.crashsdk.b.a(f104197f, str, new e(bb.c.b.O3, new Object[]{str}));
        String strN = n();
        com.uc.crashsdk.b.a(f104198g, strN, new e(bb.c.b.Q3, new Object[]{strN}));
    }

    static boolean b(int i10, Object[] objArr) {
        switch (i10) {
            case bb.c.b.N3 /* 351 */:
                if (!f104192a && objArr == null) {
                    throw new AssertionError();
                }
                String str = (String) objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                if (iIntValue == 1) {
                    if (f104201j) {
                        return false;
                    }
                    f104201j = true;
                }
                if (!com.uc.crashsdk.g.Z()) {
                    return false;
                }
                File file = new File(str);
                ArrayList<a> arrayListA = a(file, "crp", 100);
                if (iIntValue != 4) {
                    a aVar = new a("crp", false, false);
                    if (iIntValue == 1) {
                        aVar.a("et", String.valueOf(com.uc.crashsdk.b.I()));
                        aVar.a("ete", String.valueOf(com.uc.crashsdk.b.J()));
                    } else if (iIntValue == 3) {
                        aVar.a("et", "1");
                        aVar.a("ete", "1");
                    } else if (iIntValue == 2) {
                        aVar.a("hpv", "1");
                    }
                    aVar.a("prc", com.uc.crashsdk.e.h());
                    aVar.a("imp", com.uc.crashsdk.b.F() ? "1" : "0");
                    a(aVar);
                    arrayListA.add(0, aVar);
                }
                if (!arrayListA.isEmpty()) {
                    boolean zC = c(com.uc.crashsdk.e.q(), a((Iterable<a>) arrayListA, true, false).toString());
                    g.b(file);
                    if (!zC) {
                        g.a(file, a((Iterable<a>) arrayListA, false, true).toString());
                    }
                }
                return true;
            case bb.c.b.O3 /* 352 */:
                if (f104192a || objArr != null) {
                    return d((String) objArr[0]);
                }
                throw new AssertionError();
            case bb.c.b.P3 /* 353 */:
                if (f104192a || objArr != null) {
                    return b((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                }
                throw new AssertionError();
            case bb.c.b.Q3 /* 354 */:
                if (!f104192a && objArr == null) {
                    throw new AssertionError();
                }
                File file2 = new File((String) objArr[0]);
                boolean zC2 = c(com.uc.crashsdk.e.q(), a((Iterable<a>) a(file2, "cst", 30), true, false).toString());
                if (zC2) {
                    g.b(file2);
                }
                return zC2;
            default:
                return false;
        }
    }

    private static boolean b(String str, String str2) {
        boolean z10;
        byte[] bArrA;
        if (g.a(str2)) {
            return true;
        }
        byte[] bytes = str2.getBytes();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = g.d(com.uc.crashsdk.g.e() + str + jCurrentTimeMillis + "AppChk#2014");
        try {
            byte[] bArrA2 = c.a(bytes, strD.substring(strD.length() - 16, strD.length()).getBytes());
            if (bArrA2 != null) {
                bytes = bArrA2;
                z10 = true;
            } else {
                z10 = false;
            }
        } catch (Throwable th2) {
            g.a(th2);
        }
        String strSubstring = strD.substring(strD.length() - 8, strD.length());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.uc.crashsdk.g.z());
        sb2.append("/api/v1/crashtrack/upload?chk=");
        sb2.append(strSubstring);
        sb2.append("&vno=");
        sb2.append(jCurrentTimeMillis);
        sb2.append("&uuid=");
        sb2.append(str);
        sb2.append("&app=");
        sb2.append(com.uc.crashsdk.g.e());
        if (z10) {
            sb2.append("&enc=aes");
        }
        String string = sb2.toString();
        return (string == null || (bArrA = c.a(string, bytes)) == null || !new String(bArrA).contains("retcode=0")) ? false : true;
    }

    private static boolean b(String str, String str2, boolean z10, boolean z11) {
        a aVar;
        File file = new File(n());
        ArrayList<a> arrayListA = a(file, "cst", 30);
        String str3 = str + str2;
        Iterator<a> it = arrayListA.iterator();
        do {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
        } while (!str3.equals(aVar.b("prc") + aVar.b("typ")));
        if (aVar == null) {
            aVar = new a("cst", false, true);
            aVar.a("prc", str);
            aVar.a("typ", str2);
            a(aVar);
            arrayListA.add(aVar);
        }
        aVar.a("cnt", 1L);
        if (z10) {
            aVar.a("lim", 1L);
        }
        if (z11) {
            aVar.a("syu", 1L);
        }
        return g.a(file, a((Iterable<a>) arrayListA, false, false).toString());
    }

    static /* synthetic */ Map c(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("`")) {
            if (str2.length() > 1) {
                String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER, 3);
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    public static void c() {
        a(3, 0L);
    }

    private static boolean c(String str, String str2) {
        boolean z10;
        String string;
        byte[] bArrA;
        if (g.a(str2)) {
            return true;
        }
        byte[] bytes = str2.getBytes();
        try {
            byte[] bArr = new byte[16];
            c.a(bArr, 0, c.a());
            c.a(bArr, 4, j());
            c.a(bArr, 8, com.uc.crashsdk.a.f());
            c.a(bArr, 12, d.d());
            byte[] bArrA2 = c.a(bytes, bArr);
            if (bArrA2 != null) {
                bytes = bArrA2;
                z10 = true;
            } else {
                z10 = false;
            }
        } catch (Throwable th2) {
            g.a(th2);
        }
        if (str == null) {
            str = "unknown";
        }
        String str3 = com.uc.crashsdk.g.R() ? "4ea4e41a3993" : "28ef1713347d";
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strD = g.d(str3 + str + strValueOf + "AppChk#2014");
        if (strD == null) {
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.uc.crashsdk.g.z());
            sb2.append("?chk=");
            sb2.append(strD.substring(strD.length() - 8, strD.length()));
            sb2.append("&vno=");
            sb2.append(strValueOf);
            sb2.append("&uuid=");
            sb2.append(str);
            sb2.append("&app=");
            sb2.append(str3);
            if (z10) {
                sb2.append("&enc=aes");
            }
            string = sb2.toString();
        }
        return (string == null || (bArrA = c.a(string, bytes)) == null || !new String(bArrA).contains("retcode=0")) ? false : true;
    }

    public static void d() {
        b(2, 2000L);
        a(1, 70000L);
    }

    private static boolean d(String str) {
        File file = new File(str);
        for (a aVar : a(file, "cst", 30)) {
            String strA = aVar.a("prc");
            if (!g.a(strA)) {
                Map<String, a> map = f104196e;
                a aVar2 = map.get(strA);
                if (aVar2 != null) {
                    aVar2.a(aVar);
                } else {
                    map.put(strA, aVar);
                }
            }
        }
        Map<String, a> map2 = f104196e;
        StringBuilder sbA = a((Iterable<a>) map2.values(), true, false);
        boolean zB = com.uc.crashsdk.g.aa() ? b(com.uc.crashsdk.e.q(), sbA.toString()) : c(com.uc.crashsdk.e.q(), sbA.toString());
        g.b(file);
        if (zB || g.a(file, a((Iterable<a>) map2.values(), false, true).toString())) {
            map2.clear();
        }
        return true;
    }

    public static boolean e() {
        return f104201j;
    }

    public static void f() {
        b(1, 2000L);
    }

    public static void g() {
        b(3, 0L);
    }

    public static void h() {
        b(4, 0L);
    }

    public static void i() {
        if (com.uc.crashsdk.g.Q()) {
            f.a(1, new e(303));
        }
    }

    static byte[] j() {
        return new byte[]{127, 100, 110, 31};
    }

    public static void k() {
        synchronized (f104202k) {
            f104203l = null;
        }
    }

    private static String m() {
        return com.uc.crashsdk.g.W() + "pv.wa";
    }

    private static String n() {
        return com.uc.crashsdk.g.W() + "cdt.wa";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o() {
        for (String str : g.a(new File("/proc/meminfo"), 2)) {
            if (str.contains("MemTotal:")) {
                try {
                    return Long.parseLong(str.replaceAll("\\D+", ""));
                } catch (NumberFormatException e10) {
                    g.a(e10);
                }
            }
        }
        return 0L;
    }
}

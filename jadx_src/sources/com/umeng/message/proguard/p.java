package com.umeng.message.proguard;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.common.UPLog;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Boolean f105832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f105833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f105834c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f105835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f105836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f105837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f105838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f105839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f105840f;

        public a(long j10, int i10, long j11, int i11, String str, String str2) {
            this.f105838d = i11;
            this.f105835a = str;
            this.f105836b = str2;
            this.f105837c = j10;
            this.f105839e = i10;
            this.f105840f = j11;
        }
    }

    public static final class b {
        static JSONObject a(String str, String str2, String str3) {
            String zid;
            try {
                Application applicationA = x.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("appkey", str);
                jSONObject.put(RemoteMessageConst.DEVICE_TOKEN, str2);
                jSONObject.put(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, str3);
                jSONObject.put("utdid", d.o(applicationA));
                jSONObject.put("umid", d.k(applicationA));
                try {
                    zid = UMUtils.getZid(applicationA);
                    try {
                        jSONObject.put("oaid", DeviceConfig.getOaid(applicationA));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    zid = null;
                }
                jSONObject.put(com.umeng.analytics.pro.ak.f104429al, zid);
                jSONObject.put("sdk_v", MsgConstant.SDK_VERSION);
                return g.a(jSONObject, "https://offmsg.umeng.com/log/switch", str, true);
            } catch (Throwable th2) {
                UPLog.d("Log", UPLog.getStackTrace(th2));
                return null;
            }
        }

        private static void a(File file, ZipOutputStream zipOutputStream) {
            if (!file.exists() || file.length() < 256) {
                return;
            }
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = fileInputStream2.read(bArr);
                        if (i10 == -1) {
                            zipOutputStream.closeEntry();
                            f.a(fileInputStream2);
                            return;
                        }
                        zipOutputStream.write(bArr, 0, i10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    try {
                        UPLog.d("Log", UPLog.getStackTrace(th));
                    } finally {
                        f.a(fileInputStream);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        final void a(File file, File file2) {
            File[] fileArrListFiles;
            if (!file.exists() || (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.umeng.message.proguard.p.b.2
                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    if (file3.isDirectory() || file3.length() > 5242880) {
                        return false;
                    }
                    String name = file3.getName();
                    return name.endsWith(".log") || name.endsWith(".bak");
                }
            })) == null || fileArrListFiles.length == 0) {
                return;
            }
            if (fileArrListFiles.length > 8) {
                File[] fileArr = new File[8];
                System.arraycopy(fileArrListFiles, 0, fileArr, 0, 8);
                fileArrListFiles = fileArr;
            }
            ZipOutputStream zipOutputStream = null;
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file2));
                try {
                    for (File file3 : fileArrListFiles) {
                        a(file3, zipOutputStream2);
                        file3.delete();
                    }
                    zipOutputStream2.finish();
                    f.a(zipOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    zipOutputStream = zipOutputStream2;
                    try {
                        UPLog.d("Log", UPLog.getStackTrace(th));
                    } finally {
                        f.a(zipOutputStream);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final class c implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f105846b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private PrintWriter f105847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final DateFormat f105848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final DateFormat f105849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final File f105850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f105851g;

        c() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            this.f105848d = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(com.max.hbutils.utils.w.f73602i, Locale.getDefault());
            this.f105849e = simpleDateFormat2;
            simpleDateFormat2.setTimeZone(TimeZone.getDefault());
            Application applicationA = x.a();
            this.f105850f = new File(applicationA.getFilesDir(), ".upush_log");
            String strA = f.a(applicationA);
            this.f105851g = strA;
            int iLastIndexOf = strA.lastIndexOf(":");
            if (iLastIndexOf < 0) {
                this.f105851g = "";
                return;
            }
            this.f105851g = this.f105851g.substring(iLastIndexOf + 1) + lg.a.f131412e;
        }

        private void a() {
            PrintWriter printWriter = this.f105847c;
            if (printWriter != null) {
                try {
                    printWriter.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            this.f105847c = null;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            String str;
            try {
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    a();
                    long jCurrentTimeMillis = (System.currentTimeMillis() / 86400000) * 86400000;
                    if (Math.abs(jCurrentTimeMillis - this.f105846b) > 86400000) {
                        this.f105846b = jCurrentTimeMillis;
                        File[] fileArrListFiles = this.f105850f.listFiles();
                        if (fileArrListFiles != null) {
                            for (File file : fileArrListFiles) {
                                long jLastModified = file.lastModified() / 86400000;
                                Long.signum(jLastModified);
                                if (Math.abs(jCurrentTimeMillis - (jLastModified * 86400000)) > 86400000) {
                                    file.delete();
                                }
                            }
                        }
                    }
                    return true;
                }
                try {
                    if (!this.f105850f.exists()) {
                        this.f105850f.mkdirs();
                    }
                    a aVar = (a) message.obj;
                    String str2 = String.format("%s%s", this.f105851g, this.f105848d.format(Long.valueOf(aVar.f105837c)));
                    int i11 = aVar.f105838d;
                    if (i11 == 3) {
                        str = "D";
                    } else if (i11 == 4) {
                        str = "I";
                    } else if (i11 == 5) {
                        str = androidx.exifinterface.media.a.T4;
                    } else {
                        str = i11 == 6 ? androidx.exifinterface.media.a.S4 : "U";
                    }
                    String str3 = String.format("%s %s-%s %s %s %s", this.f105849e.format(Long.valueOf(aVar.f105837c)), Integer.valueOf(aVar.f105839e), Long.valueOf(aVar.f105840f), str, aVar.f105835a, aVar.f105836b);
                    File file2 = new File(this.f105850f, str2 + ".log");
                    if (file2.exists() && file2.length() + ((long) str3.length()) > 5242880) {
                        File file3 = new File(this.f105850f, str2 + ".bak");
                        if (file3.exists()) {
                            file3.delete();
                        }
                        file2.renameTo(file3);
                        file2.delete();
                    }
                    if (!file2.exists()) {
                        a();
                    }
                    if (this.f105847c == null) {
                        this.f105847c = new PrintWriter(new FileWriter(file2, true));
                    }
                    this.f105847c.println(str3);
                    this.f105847c.flush();
                    p.this.b().removeMessages(2);
                    p.this.b().sendEmptyMessageDelayed(2, 5000L);
                } catch (Throwable th2) {
                    UPLog.d("Log", UPLog.getStackTrace(th2));
                    a();
                }
                return true;
            } catch (Throwable th3) {
                UPLog.d("Log", UPLog.getStackTrace(th3));
            }
        }
    }

    private void b(int i10, String str, String str2) {
        Handler handlerB = b();
        if (handlerB != null) {
            handlerB.obtainMessage(1, new a(System.currentTimeMillis(), Process.myPid(), Thread.currentThread().getId(), i10, str, str2)).sendToTarget();
        }
    }

    public final void a(int i10, String str, String str2) {
        if (i10 >= 4 && str2 != null) {
            b(i10, str, str2);
        }
    }

    public final boolean a() {
        if (!f.f105796b) {
            return false;
        }
        if (this.f105832a == null) {
            this.f105832a = Boolean.valueOf(MessageSharedPrefs.getInstance(x.a()).l());
        }
        return this.f105832a.booleanValue();
    }

    final Handler b() {
        Handler handler;
        Handler handler2 = this.f105834c;
        if (handler2 != null) {
            return handler2;
        }
        synchronized (this) {
            if (this.f105834c == null) {
                try {
                    HandlerThread handlerThread = new HandlerThread("upush_log", 10);
                    handlerThread.start();
                    this.f105834c = new Handler(handlerThread.getLooper(), new c());
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                handler = this.f105834c;
            } else {
                handler = this.f105834c;
            }
            throw th;
        }
        return handler;
    }
}

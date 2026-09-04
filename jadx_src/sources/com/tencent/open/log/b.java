package com.tencent.open.log;

import android.text.TextUtils;
import com.tencent.open.utils.m;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SimpleDateFormat f101113a = d.C0978d.a("yy.MM.dd.HH");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f101119g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f101114b = "Tracer.File";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f101115c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f101116d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f101117e = 4096;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f101118f = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f101120h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f101121i = ".log";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f101122j = Long.MAX_VALUE;

    public b(File file, int i10, int i11, int i12, String str, long j10, int i13, String str2, long j11) {
        a(file);
        b(i10);
        a(i11);
        c(i12);
        a(str);
        b(j10);
        d(i13);
        b(str2);
        c(j11);
    }

    public static String a(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        return new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime());
    }

    private String c(String str) {
        return "com.tencent.mobileqq_connectSdk." + str + ".log";
    }

    private File d(long j10) {
        String strC = c(a(j10));
        String strB = m.b();
        if (!TextUtils.isEmpty(strB) || strB != null) {
            try {
                File file = new File(strB, c.f101137o);
                if (!file.exists()) {
                    file.mkdirs();
                }
                return new File(file, strC);
            } catch (Exception e10) {
                SLog.e(SLog.TAG, "getWorkFile,get app specific file exception:", e10);
            }
        }
        return null;
    }

    public File a() {
        return d(System.currentTimeMillis());
    }

    public void a(int i10) {
        this.f101115c = i10;
    }

    public void a(File file) {
        this.f101119g = file;
    }

    public void a(String str) {
        this.f101114b = str;
    }

    public String b() {
        return this.f101114b;
    }

    public void b(int i10) {
        this.f101116d = i10;
    }

    public void b(long j10) {
        this.f101118f = j10;
    }

    public void b(String str) {
        this.f101121i = str;
    }

    public int c() {
        return this.f101117e;
    }

    public void c(int i10) {
        this.f101117e = i10;
    }

    public void c(long j10) {
        this.f101122j = j10;
    }

    public int d() {
        return this.f101120h;
    }

    public void d(int i10) {
        this.f101120h = i10;
    }
}

package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f107022a = "/MiPushLog";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f310a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f313a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String f314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f107024c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    @SuppressLint({"SimpleDateFormat"})
    private final SimpleDateFormat f311a = new SimpleDateFormat(com.max.hbutils.utils.w.f73604k);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107023b = 2097152;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ArrayList<File> f312a = new ArrayList<>();

    ee() {
    }

    private void a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) throws IOException {
        char[] cArr = new char[4096];
        int i10 = bufferedReader.read(cArr);
        boolean z10 = false;
        while (i10 != -1 && !z10) {
            String str = new String(cArr, 0, i10);
            Matcher matcher = pattern.matcher(str);
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && matcher.find(i11)) {
                int iStart = matcher.start();
                String strSubstring = str.substring(iStart, this.f314b.length() + iStart);
                if (this.f313a) {
                    if (strSubstring.compareTo(this.f107024c) > 0) {
                        z10 = true;
                        i10 = iStart;
                        break;
                    }
                } else if (strSubstring.compareTo(this.f314b) >= 0) {
                    this.f313a = true;
                    i12 = iStart;
                }
                int iIndexOf = str.indexOf(10, iStart);
                if (iIndexOf == -1) {
                    iIndexOf = this.f314b.length();
                }
                i11 = iStart + iIndexOf;
            }
            if (this.f313a) {
                int i13 = i10 - i12;
                this.f310a += i13;
                if (z10) {
                    bufferedWriter.write(cArr, i12, i13);
                    return;
                } else {
                    bufferedWriter.write(cArr, i12, i13);
                    if (this.f310a > this.f107023b) {
                        return;
                    }
                }
            }
            i10 = bufferedReader.read(cArr);
        }
    }

    private void a(File file) throws Throwable {
        BufferedReader bufferedReader;
        Pattern patternCompile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedWriter bufferedWriter = null;
        bufferedReader = null;
        bufferedReader = null;
        bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        bufferedWriter = null;
        bufferedWriter = null;
        bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write("model :" + Build.MODEL + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + com.xiaomi.push.service.bw.m738a() + "; lng :" + Locale.getDefault().toString() + "; sdk :48; andver :" + Build.VERSION.SDK_INT + "\n");
                    this.f310a = 0;
                    Iterator<File> it = this.f312a.iterator();
                    while (it.hasNext()) {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                        try {
                            a(bufferedReader, bufferedWriter2, patternCompile);
                            bufferedReader.close();
                            bufferedReader2 = bufferedReader;
                        } catch (FileNotFoundException e10) {
                            e = e10;
                            bufferedWriter = bufferedWriter2;
                            com.xiaomi.channel.commonutils.logger.b.c("LOG: filter error = " + e.getMessage());
                            x.a(bufferedWriter);
                            x.a(bufferedReader);
                            return;
                        } catch (IOException e11) {
                            e = e11;
                            bufferedWriter = bufferedWriter2;
                            com.xiaomi.channel.commonutils.logger.b.c("LOG: filter error = " + e.getMessage());
                            x.a(bufferedWriter);
                            x.a(bufferedReader);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter = bufferedWriter2;
                            x.a(bufferedWriter);
                            x.a(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedWriter2.write(dd.a().c());
                    x.a(bufferedWriter2);
                    x.a(bufferedReader2);
                } catch (FileNotFoundException e12) {
                    e = e12;
                    bufferedReader = bufferedReader2;
                } catch (IOException e13) {
                    e = e13;
                    bufferedReader = bufferedReader2;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (FileNotFoundException e14) {
            e = e14;
            bufferedReader = null;
        } catch (IOException e15) {
            e = e15;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    ee m275a(File file) {
        if (file.exists()) {
            this.f312a.add(file);
        }
        return this;
    }

    ee a(Date date, Date date2) {
        if (date.after(date2)) {
            this.f314b = this.f311a.format(date2);
            this.f107024c = this.f311a.format(date);
        } else {
            this.f314b = this.f311a.format(date);
            this.f107024c = this.f311a.format(date2);
        }
        return this;
    }

    File a(Context context, Date date, Date date2, File file) throws Throwable {
        File file2;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            file2 = new File(context.getExternalFilesDir(null), com.xiaomi.push.service.bj.R);
            if (!file2.exists()) {
                file2 = new File(context.getFilesDir(), com.xiaomi.push.service.bj.R);
            }
            if (!file2.exists()) {
                file2 = context.getFilesDir();
            }
            m275a(new File(file2, "xmsf.log.1"));
            m275a(new File(file2, "xmsf.log"));
        } else {
            file2 = new File(context.getExternalFilesDir(null) + f107022a);
            m275a(new File(file2, "log0.txt"));
            m275a(new File(file2, "log1.txt"));
        }
        if (!file2.isDirectory()) {
            return null;
        }
        File file3 = new File(file, date.getTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + date2.getTime() + DynamicSoManager.f77249d);
        if (file3.exists()) {
            return null;
        }
        a(date, date2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file4 = new File(file, "log.txt");
        a(file4);
        com.xiaomi.channel.commonutils.logger.b.c("LOG: filter cost = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (file4.exists()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            x.a(file3, file4);
            com.xiaomi.channel.commonutils.logger.b.c("LOG: zip cost = " + (System.currentTimeMillis() - jCurrentTimeMillis2));
            file4.delete();
            if (file3.exists()) {
                return file3;
            }
        }
        return null;
    }

    void a(int i10) {
        if (i10 != 0) {
            this.f107023b = i10;
        }
    }
}

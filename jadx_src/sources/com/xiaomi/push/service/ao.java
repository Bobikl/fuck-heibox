package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.push.db;
import com.xiaomi.push.ew;
import com.xiaomi.push.gm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class ao {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Pattern f1015a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f107879a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f1014a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private static String a(String str) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String string = sb2.toString();
                        com.xiaomi.push.x.a(bufferedReader);
                        return string;
                    }
                    sb2.append("\n");
                    sb2.append(line);
                }
            } catch (Exception unused) {
                com.xiaomi.push.x.a(bufferedReader);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                com.xiaomi.push.x.a(bufferedReader);
                throw th2;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th2 = th4;
        }
    }

    public static void a() {
        ew.a aVarM742a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((f1014a.getActiveCount() <= 0 || jCurrentTimeMillis - f107879a >= 1800000) && gm.m407a().m412a() && (aVarM742a = bw.a().m742a()) != null && aVarM742a.e() > 0) {
            f107879a = jCurrentTimeMillis;
            a(aVarM742a.m289a(), true);
        }
    }

    public static void a(List<String> list, boolean z10) {
        f1014a.execute(new ap(list, z10));
    }

    public static void b() throws Throwable {
        String strA = a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(strA)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("dump tcp for uid = " + Process.myUid());
            com.xiaomi.channel.commonutils.logger.b.m62a(strA);
        }
        String strA2 = a("/proc/self/net/tcp6");
        if (TextUtils.isEmpty(strA2)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("dump tcp6 for uid = " + Process.myUid());
        com.xiaomi.channel.commonutils.logger.b.m62a(strA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            com.xiaomi.channel.commonutils.logger.b.m62a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(db.m237a(str, bb.c.f.We), 5000);
            socket.setTcpNoDelay(true);
            com.xiaomi.channel.commonutils.logger.b.m62a("ConnectivityTest: connect to " + str + " in " + (System.currentTimeMillis() - jCurrentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.d("ConnectivityTest: could not connect to:" + str + " exception: " + th2.getClass().getSimpleName() + " description: " + th2.getMessage());
            return false;
        }
    }
}

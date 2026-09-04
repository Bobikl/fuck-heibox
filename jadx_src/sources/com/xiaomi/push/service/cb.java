package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ir;
import com.xiaomi.push.jx;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f107985a = new Object();

    public static void a(Context context, ir irVar) {
        if (ca.a(irVar.e())) {
            com.xiaomi.push.ah.a(context).a(new cc(context, irVar));
        }
    }

    public static byte[] a(Context context) {
        String strA = com.xiaomi.push.n.a(context).a("mipush", "td_key", "");
        if (TextUtils.isEmpty(strA)) {
            strA = com.xiaomi.push.bp.a(20);
            com.xiaomi.push.n.a(context).m654a("mipush", "td_key", strA);
        }
        return a(strA);
    }

    private static byte[] a(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(com.xiaomi.push.bm.m189a(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    public static void c(Context context, ir irVar) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        ?? A = a(context);
        try {
            try {
                byte[] bArrB = com.xiaomi.push.h.b(A, jx.a(irVar));
                if (bArrB == null || bArrB.length < 1) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("TinyData write to cache file failed case encryption fail item:" + irVar.d() + "  ts:" + System.currentTimeMillis());
                } else {
                    if (bArrB.length <= 30720) {
                        BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                        try {
                            bufferedOutputStream3.write(com.xiaomi.push.ab.a(bArrB.length));
                            bufferedOutputStream3.write(bArrB);
                            bufferedOutputStream3.flush();
                            com.xiaomi.push.x.a((Closeable) null);
                            com.xiaomi.push.x.a(bufferedOutputStream3);
                            return;
                        } catch (IOException e10) {
                            bufferedOutputStream2 = bufferedOutputStream3;
                            e = e10;
                            com.xiaomi.channel.commonutils.logger.b.a("TinyData write to cache file failed cause io exception item:" + irVar.d(), e);
                            A = bufferedOutputStream2;
                            com.xiaomi.push.x.a((Closeable) null);
                            com.xiaomi.push.x.a((Closeable) A);
                            return;
                        } catch (Exception e11) {
                            bufferedOutputStream = bufferedOutputStream3;
                            e = e11;
                            com.xiaomi.channel.commonutils.logger.b.a("TinyData write to cache file  failed item:" + irVar.d(), e);
                            A = bufferedOutputStream;
                            com.xiaomi.push.x.a((Closeable) null);
                            com.xiaomi.push.x.a((Closeable) A);
                            return;
                        } catch (Throwable th2) {
                            A = bufferedOutputStream3;
                            th = th2;
                            com.xiaomi.push.x.a((Closeable) null);
                            com.xiaomi.push.x.a((Closeable) A);
                            throw th;
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.b.m62a("TinyData write to cache file failed case too much data content item:" + irVar.d() + "  ts:" + System.currentTimeMillis());
                }
                com.xiaomi.push.x.a((Closeable) null);
                com.xiaomi.push.x.a((Closeable) null);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
            bufferedOutputStream2 = null;
        } catch (Exception e13) {
            e = e13;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            A = 0;
        }
    }
}

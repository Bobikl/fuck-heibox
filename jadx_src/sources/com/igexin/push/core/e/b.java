package com.igexin.push.core.e;

import android.content.Context;
import android.text.TextUtils;
import com.igexin.push.util.m;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f63734b = 0;

    b() {
    }

    private boolean a() {
        try {
            boolean z10 = true;
            if (!TextUtils.isEmpty(this.f63733a) && this.f63734b != 0 && this.f63733a.equals(com.igexin.push.core.d.f63685s) && this.f63734b == com.igexin.push.core.d.f63684r) {
                z10 = false;
            }
            return z10;
        } finally {
            this.f63733a = com.igexin.push.core.d.f63685s;
            this.f63734b = com.igexin.push.core.d.f63684r;
        }
    }

    @Override // com.igexin.push.core.e.c
    public String a(Context context) {
        String str = null;
        try {
            com.igexin.a.a.c.b.a("BasicSDStorage|get device id from file : " + com.igexin.push.core.d.U, new Object[0]);
            byte[] bArrA = com.igexin.push.util.d.a(com.igexin.push.core.d.U);
            if (bArrA == null) {
                com.igexin.a.a.c.b.a("BasicSDStorage|read file device id = null", new Object[0]);
                return null;
            }
            String str2 = new String(bArrA, "UTF-8");
            try {
                com.igexin.a.a.c.b.a("BasicSDStorage|read file device id = " + str2, new Object[0]);
                return str2;
            } catch (Exception e10) {
                e = e10;
                str = str2;
                com.igexin.a.a.c.b.a("BasicSDStorage|get device id from file : " + e.toString(), new Object[0]);
                return str;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // com.igexin.push.core.e.c
    public void a(Context context, long j10) {
        if (a()) {
            com.igexin.push.util.d.a();
        }
    }

    @Override // com.igexin.push.core.e.c
    public void a(Context context, String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.igexin.a.a.c.b.a("BasicSDStorage|save device id to file : " + com.igexin.push.core.d.U, new Object[0]);
        FileOutputStream fileOutputStream = null;
        ReentrantReadWriteLock.WriteLock writeLock = new ReentrantReadWriteLock().writeLock();
        try {
            try {
                if (writeLock.tryLock()) {
                    File file = new File(com.igexin.push.core.d.U);
                    if (!file.exists() && !file.createNewFile()) {
                        com.igexin.a.a.c.b.a("BasicSDStorage|create file : " + file.toString() + " failed !!!", new Object[0]);
                        m.a(null);
                        writeLock.unlock();
                        return;
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(com.igexin.push.core.d.U);
                    try {
                        fileOutputStream2.write(str.getBytes("UTF-8"));
                        fileOutputStream = fileOutputStream2;
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        com.igexin.a.a.c.b.a("BasicSDStorage|" + e.toString(), new Object[0]);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        m.a(fileOutputStream);
                        writeLock.unlock();
                        throw th;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
            m.a(fileOutputStream);
            writeLock.unlock();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    @Override // com.igexin.push.core.e.c
    public String b(Context context) {
        String str = null;
        try {
            byte[] bArrA = com.igexin.push.util.d.a(com.igexin.push.core.d.T);
            if (bArrA == null) {
                com.igexin.a.a.c.b.a("BasicSDStorage | read file cid id = null", new Object[0]);
                return null;
            }
            String[] strArrSplit = new String(com.igexin.a.a.a.a.c(bArrA, com.igexin.push.core.d.C)).split("\\|");
            if (strArrSplit.length > 2) {
                String str2 = strArrSplit[2];
                if (str2 != null) {
                    try {
                        if (!str2.equals("null")) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    str = str2;
                }
            }
            com.igexin.a.a.c.b.a("BasicSDStorage|get cid from file cid = " + str, new Object[0]);
            return str;
        } catch (Exception unused2) {
        }
    }

    @Override // com.igexin.push.core.e.c
    public void b(Context context, String str) {
        if (a()) {
            com.igexin.push.util.d.a();
        }
    }

    @Override // com.igexin.push.core.e.c
    public long c(Context context) {
        long j10 = 0;
        try {
            byte[] bArrA = com.igexin.push.util.d.a(com.igexin.push.core.d.T);
            if (bArrA == null) {
                com.igexin.a.a.c.b.a("BasicSDStorage|read session from file, not exist", new Object[0]);
                return 0L;
            }
            String str = new String(com.igexin.a.a.a.a.c(bArrA, com.igexin.push.core.d.C));
            String strSubstring = str.contains("null") ? str.substring(7) : str.substring(20);
            int iIndexOf = strSubstring.indexOf("|");
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long j11 = Long.parseLong(strSubstring);
            if (j11 != 0) {
                j10 = j11;
            }
            com.igexin.a.a.c.b.a("BasicSDStorage|session : " + j10, new Object[0]);
            return j10;
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("BasicSDStorage|" + e10.toString(), new Object[0]);
        }
    }
}

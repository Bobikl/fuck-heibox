package com.tencent.open.log;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: compiled from: ProGuard */
    public static final class a {
        public static final boolean a(int i10, int i11) {
            return i11 == (i10 & i11);
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public static final class b {
        public static boolean a() {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        }

        public static c b() {
            if (a()) {
                return c.b(Environment.getExternalStorageDirectory());
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f101138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f101139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f101140c;

        public static c b(File file) {
            c cVar = new c();
            cVar.a(file);
            StatFs statFs = new StatFs(file.getAbsolutePath());
            long blockSize = statFs.getBlockSize();
            long blockCount = statFs.getBlockCount();
            long availableBlocks = statFs.getAvailableBlocks();
            cVar.a(blockCount * blockSize);
            cVar.b(availableBlocks * blockSize);
            return cVar;
        }

        public File a() {
            return this.f101138a;
        }

        public void a(long j10) {
            this.f101139b = j10;
        }

        public void a(File file) {
            this.f101138a = file;
        }

        public long b() {
            return this.f101139b;
        }

        public void b(long j10) {
            this.f101140c = j10;
        }

        public long c() {
            return this.f101140c;
        }

        public String toString() {
            return String.format("[%s : %d / %d]", a().getAbsolutePath(), Long.valueOf(c()), Long.valueOf(b()));
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.log.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProGuard */
    public static final class C0978d {
        @SuppressLint({"SimpleDateFormat"})
        public static SimpleDateFormat a(String str) {
            return new SimpleDateFormat(str);
        }
    }

    public static boolean a(Bundle bundle) {
        return bundle.containsKey("access_token") || bundle.containsKey("pay_token") || bundle.containsKey("pfkey") || bundle.containsKey("expires_in") || bundle.containsKey("openid") || bundle.containsKey("proxy_code") || bundle.containsKey("proxy_expires_in");
    }

    public static boolean a(String str) {
        return str.contains("access_token") || str.contains("pay_token") || str.contains("pfkey") || str.contains("expires_in") || str.contains("openid") || str.contains("proxy_code") || str.contains("proxy_expires_in");
    }

    public static Bundle b(Bundle bundle) {
        if (!a(bundle)) {
            return bundle;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.remove("access_token");
        bundle2.remove("pay_token");
        bundle2.remove("pfkey");
        bundle2.remove("expires_in");
        bundle2.remove("openid");
        bundle2.remove("proxy_code");
        bundle2.remove("proxy_expires_in");
        return bundle2;
    }
}

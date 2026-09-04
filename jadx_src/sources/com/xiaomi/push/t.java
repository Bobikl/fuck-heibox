package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f108051a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f1121a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private RandomAccessFile f1122a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f1123a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private FileLock f1124a;

    private t(Context context) {
        this.f1121a = context;
    }

    public static t a(Context context, File file) throws IOException {
        com.xiaomi.channel.commonutils.logger.b.c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (!f108051a.add(str)) {
            throw new IOException("abtain lock failure");
        }
        t tVar = new t(context);
        tVar.f1123a = str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            tVar.f1122a = randomAccessFile;
            tVar.f1124a = randomAccessFile.getChannel().lock();
            com.xiaomi.channel.commonutils.logger.b.c("Locked: " + str + " :" + tVar.f1124a);
            if (tVar.f1124a == null) {
                RandomAccessFile randomAccessFile2 = tVar.f1122a;
                if (randomAccessFile2 != null) {
                    x.a(randomAccessFile2);
                }
            }
            return tVar;
        } finally {
            if (tVar.f1124a == null) {
                RandomAccessFile randomAccessFile3 = tVar.f1122a;
                if (randomAccessFile3 != null) {
                    x.a(randomAccessFile3);
                }
                f108051a.remove(tVar.f1123a);
            }
        }
    }

    public void a() {
        com.xiaomi.channel.commonutils.logger.b.c("unLock: " + this.f1124a);
        FileLock fileLock = this.f1124a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f1124a.release();
            } catch (IOException unused) {
            }
            this.f1124a = null;
        }
        RandomAccessFile randomAccessFile = this.f1122a;
        if (randomAccessFile != null) {
            x.a(randomAccessFile);
        }
        f108051a.remove(this.f1123a);
    }
}

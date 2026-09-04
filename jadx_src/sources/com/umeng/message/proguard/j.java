package com.umeng.message.proguard;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j f105812b = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vector<String> f105813a = new Vector<>();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UMessage f105814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f105815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f105816c;

        public a(UMessage uMessage) {
            this.f105814a = uMessage;
            ArrayList<String> arrayList = new ArrayList<>();
            this.f105815b = arrayList;
            if (uMessage.isLargeIconFromInternet()) {
                arrayList.add(uMessage.getLargeIconUrl());
            }
            if (uMessage.isSoundFromInternet()) {
                arrayList.add(uMessage.getSoundUri());
            }
            if (!TextUtils.isEmpty(uMessage.getBarImageUrl())) {
                arrayList.add(uMessage.getBarImageUrl());
            }
            if (uMessage.hasBackgroundImage()) {
                arrayList.add(uMessage.getBackgroundImageUrl());
            }
            if (!TextUtils.isEmpty(uMessage.getBigImage())) {
                arrayList.add(uMessage.getBigImage());
            }
            this.f105816c = 3;
        }

        private static boolean a(String str) throws Throwable {
            FileOutputStream fileOutputStream;
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            InputStream inputStream = null;
            try {
                Application applicationA = x.a();
                File file = new File(f.g(applicationA), UMUtils.MD5(str));
                File file2 = new File(f.g(applicationA), UMUtils.MD5(str) + ".tmp");
                if (file.exists()) {
                    f.a((Closeable) null);
                    f.a((Closeable) null);
                    return true;
                }
                if (file2.exists()) {
                    file2.delete();
                }
                InputStream inputStreamOpenStream = new URL(new URI(str).toASCIIString()).openStream();
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i10 = inputStreamOpenStream.read(bArr);
                            if (i10 <= 0) {
                                file2.renameTo(file);
                                f.a(inputStreamOpenStream);
                                f.a(fileOutputStream);
                                return true;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        inputStream = inputStreamOpenStream;
                        e = e;
                        UPLog.e("DownloadResource", e);
                        f.a(inputStream);
                        f.a(fileOutputStream);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamOpenStream;
                        th = th;
                        f.a(inputStream);
                        f.a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Exception e12) {
                e = e12;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
            try {
                UPLog.e("DownloadResource", e);
                f.a(inputStream);
                f.a(fileOutputStream);
                return false;
            } catch (Throwable th5) {
                th = th5;
                f.a(inputStream);
                f.a(fileOutputStream);
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                j.a(f.g(x.a()));
                int i10 = 0;
                boolean z10 = true;
                do {
                    i10++;
                    for (String str : this.f105815b) {
                        boolean zA = a(str);
                        if (!zA) {
                            UPLog.d("DownloadResource", "download fail:", str);
                        }
                        z10 &= zA;
                    }
                    if (z10) {
                        break;
                    }
                } while (i10 < this.f105816c);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            j.a().f105813a.remove(this.f105814a.getMsgId());
            Application applicationA = x.a();
            UPushMessageHandler messageHandler = PushAgent.getInstance(applicationA).getMessageHandler();
            if (messageHandler != null) {
                messageHandler.handleMessage(applicationA, this.f105814a);
            }
        }
    }

    public static j a() {
        return f105812b;
    }

    static /* synthetic */ void a(File file) {
        try {
            if (file.exists()) {
                long length = 0;
                if (file.exists()) {
                    if (file.isDirectory()) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.push(file);
                        while (!linkedList.isEmpty()) {
                            File[] fileArrListFiles = ((File) linkedList.pop()).listFiles();
                            if (fileArrListFiles != null) {
                                for (File file2 : fileArrListFiles) {
                                    if (file2.isDirectory()) {
                                        linkedList.push(file2);
                                    } else {
                                        length += file2.length();
                                    }
                                }
                            }
                        }
                    } else {
                        length = file.length();
                    }
                }
                if (length > 1048576) {
                    az.a(file.getPath(), new FileFilter() { // from class: com.umeng.message.proguard.j.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file3) {
                            return System.currentTimeMillis() - file3.lastModified() > 86400000;
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            UPLog.e("DownloadResource", th2);
        }
    }

    public final boolean a(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra("body")) != null && stringExtra.length() != 0) {
            try {
                UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                if (this.f105813a.contains(uMessage.getMsgId())) {
                    return true;
                }
                this.f105813a.add(uMessage.getMsgId());
                b.c(new a(uMessage));
                return true;
            } catch (Throwable th2) {
                UPLog.e("DownloadResource", th2);
            }
        }
        return false;
    }
}

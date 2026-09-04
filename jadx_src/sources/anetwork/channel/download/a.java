package anetwork.channel.download;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.f;
import anetwork.channel.http.NetworkSdkSetting;
import com.lzy.okgo.model.Progress;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f30178e = "anet.DownloadManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30179f = -100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f30180g = -101;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30181h = -102;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f30182i = -103;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f30183j = -104;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f30184k = -105;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f30185l = -106;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray<c> f30186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AtomicInteger f30187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ThreadPoolExecutor f30188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Context f30189d;

    /* JADX INFO: renamed from: anetwork.channel.download.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public interface InterfaceC0255a {
        void a(int i10, String str);

        void b(int i10, int i11, String str);

        void c(int i10, long j10, long j11);
    }

    /* JADX INFO: compiled from: Taobao */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f30190a = new a();

        private b() {
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f30191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final URL f30192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f30193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final CopyOnWriteArrayList<InterfaceC0255a> f30194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f30195f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AtomicBoolean f30196g = new AtomicBoolean(false);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile anetwork.channel.aidl.a f30197h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f30198i;

        c(URL url, String str, String str2, InterfaceC0255a interfaceC0255a) {
            this.f30198i = true;
            this.f30191b = a.this.f30187b.getAndIncrement();
            this.f30192c = url;
            str2 = TextUtils.isEmpty(str2) ? b(url) : str2;
            if (TextUtils.isEmpty(str)) {
                this.f30193d = a.this.f(str2);
            } else {
                if (str.endsWith("/")) {
                    this.f30193d = str + str2;
                } else {
                    this.f30193d = str + IOUtils.DIR_SEPARATOR_UNIX + str2;
                }
                if (str.startsWith("/data/user") || str.startsWith("/data/data")) {
                    this.f30198i = false;
                }
            }
            CopyOnWriteArrayList<InterfaceC0255a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f30194e = copyOnWriteArrayList;
            copyOnWriteArrayList.add(interfaceC0255a);
        }

        private long a(int i10, Map<String, List<String>> map, long j10) {
            int iLastIndexOf;
            try {
                if (i10 == 200) {
                    return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length"));
                }
                if (i10 != 206) {
                    return 0L;
                }
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Range");
                long j11 = (singleHeaderFieldByKey == null || (iLastIndexOf = singleHeaderFieldByKey.lastIndexOf(47)) == -1) ? 0L : Long.parseLong(singleHeaderFieldByKey.substring(iLastIndexOf + 1));
                if (j11 == 0) {
                    try {
                        return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length")) + j10;
                    } catch (Exception unused) {
                    }
                }
                return j11;
            } catch (Exception unused2) {
                return 0L;
            }
        }

        private String b(URL url) {
            String path = url.getPath();
            int iLastIndexOf = path.lastIndexOf(47);
            String strSubstring = iLastIndexOf != -1 ? path.substring(iLastIndexOf + 1, path.length()) : null;
            if (!TextUtils.isEmpty(strSubstring)) {
                return strSubstring;
            }
            String strMd5ToHex = StringUtils.md5ToHex(url.toString());
            return strMd5ToHex == null ? url.getFile() : strMd5ToHex;
        }

        private void d(int i10, String str) {
            if (this.f30196g.compareAndSet(false, true)) {
                Iterator<InterfaceC0255a> it = this.f30194e.iterator();
                while (it.hasNext()) {
                    it.next().b(this.f30191b, i10, str);
                }
            }
        }

        private void e(long j10, long j11) {
            if (this.f30196g.get()) {
                return;
            }
            Iterator<InterfaceC0255a> it = this.f30194e.iterator();
            while (it.hasNext()) {
                it.next().c(this.f30191b, j10, j11);
            }
        }

        private void f(String str) {
            if (this.f30196g.compareAndSet(false, true)) {
                Iterator<InterfaceC0255a> it = this.f30194e.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f30191b, str);
                }
            }
        }

        private void g(List<s3.a> list) {
            if (list != null) {
                ListIterator<s3.a> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if ("Range".equalsIgnoreCase(listIterator.next().getName())) {
                        listIterator.remove();
                        return;
                    }
                }
            }
        }

        public void c() {
            this.f30195f.set(true);
            d(-105, "download canceled.");
            if (this.f30197h != null) {
                try {
                    this.f30197h.cancel();
                } catch (RemoteException unused) {
                }
            }
        }

        public boolean h(InterfaceC0255a interfaceC0255a) {
            if (this.f30196g.get()) {
                return false;
            }
            this.f30194e.add(interfaceC0255a);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:191:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:196:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:198:0x026e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:202:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:218:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:224:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:226:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:237:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            RandomAccessFile randomAccessFile;
            f fVar;
            BufferedOutputStream bufferedOutputStream;
            f inputStream;
            long j10;
            if (this.f30195f.get()) {
                return;
            }
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    File fileB = a.this.b(this.f30192c.toString(), this.f30198i);
                    boolean zExists = fileB.exists();
                    anetwork.channel.entity.c cVar = new anetwork.channel.entity.c(this.f30192c);
                    cVar.D(0);
                    cVar.u(true);
                    if (zExists) {
                        cVar.addHeader("Range", "bytes=" + fileB.length() + Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    }
                    u3.a aVar = new u3.a(a.this.f30189d);
                    this.f30197h = aVar.b(cVar, null);
                    int statusCode = this.f30197h.getStatusCode();
                    if (statusCode > 0 && (statusCode == 200 || statusCode == 206 || statusCode == 416)) {
                        if (zExists) {
                            if (statusCode == 416) {
                                g(cVar.b());
                                if (this.f30195f.get()) {
                                    synchronized (a.this.f30186a) {
                                        a.this.f30186a.remove(this.f30191b);
                                    }
                                    return;
                                }
                                this.f30197h = aVar.b(cVar, null);
                                zExists = false;
                            }
                            if (statusCode == 200) {
                                zExists = false;
                            }
                        }
                        if (this.f30195f.get()) {
                            synchronized (a.this.f30186a) {
                                a.this.f30186a.remove(this.f30191b);
                            }
                            return;
                        }
                        if (zExists) {
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileB, "rw");
                            try {
                                long length = randomAccessFile2.length();
                                randomAccessFile2.seek(length);
                                randomAccessFile = randomAccessFile2;
                                bufferedOutputStream = new BufferedOutputStream(Channels.newOutputStream(randomAccessFile2.getChannel()));
                                j10 = length;
                            } catch (Exception e10) {
                                e = e10;
                                inputStream = null;
                                randomAccessFile = randomAccessFile2;
                                bufferedOutputStream = null;
                                ALog.e(a.f30178e, "file download failed!", null, e, new Object[0]);
                                d(-104, e.toString());
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                }
                                synchronized (a.this.f30186a) {
                                    a.this.f30186a.remove(this.f30191b);
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fVar = null;
                                randomAccessFile = randomAccessFile2;
                                if (bufferedOutputStream2 != null) {
                                    try {
                                        bufferedOutputStream2.close();
                                    } catch (Exception unused4) {
                                    }
                                }
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (Exception unused5) {
                                    }
                                }
                                if (fVar != null) {
                                    try {
                                        fVar.close();
                                    } catch (Exception unused6) {
                                    }
                                }
                                synchronized (a.this.f30186a) {
                                    a.this.f30186a.remove(this.f30191b);
                                }
                                throw th;
                            }
                        } else {
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileB));
                            j10 = 0;
                            randomAccessFile = null;
                        }
                        try {
                            long jA = a(statusCode, this.f30197h.C(), j10);
                            inputStream = this.f30197h.getInputStream();
                            try {
                                if (inputStream == null) {
                                    d(-103, "input stream is null.");
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (Exception unused7) {
                                    }
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                        } catch (Exception unused8) {
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception unused9) {
                                        }
                                    }
                                    synchronized (a.this.f30186a) {
                                        a.this.f30186a.remove(this.f30191b);
                                    }
                                    return;
                                }
                                byte[] bArr = new byte[2048];
                                int i10 = 0;
                                while (true) {
                                    int i11 = inputStream.read(bArr);
                                    if (i11 == -1) {
                                        bufferedOutputStream.flush();
                                        if (this.f30195f.get()) {
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (Exception unused10) {
                                            }
                                            if (randomAccessFile != null) {
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Exception unused11) {
                                                }
                                            }
                                            try {
                                                inputStream.close();
                                            } catch (Exception unused12) {
                                            }
                                            synchronized (a.this.f30186a) {
                                                a.this.f30186a.remove(this.f30191b);
                                            }
                                            return;
                                        }
                                        if (fileB.renameTo(new File(this.f30193d))) {
                                            f(this.f30193d);
                                        } else {
                                            d(-106, "file rename to " + this.f30193d + " failed");
                                        }
                                        try {
                                            bufferedOutputStream.close();
                                        } catch (Exception unused13) {
                                        }
                                        if (randomAccessFile != null) {
                                            try {
                                                randomAccessFile.close();
                                            } catch (Exception unused14) {
                                            }
                                        }
                                        try {
                                            inputStream.close();
                                        } catch (Exception unused15) {
                                        }
                                        synchronized (a.this.f30186a) {
                                            a.this.f30186a.remove(this.f30191b);
                                        }
                                        return;
                                    }
                                    if (this.f30195f.get()) {
                                        this.f30197h.cancel();
                                        try {
                                            bufferedOutputStream.close();
                                        } catch (Exception unused16) {
                                        }
                                        if (randomAccessFile != null) {
                                            try {
                                                randomAccessFile.close();
                                            } catch (Exception unused17) {
                                            }
                                        }
                                        try {
                                            inputStream.close();
                                        } catch (Exception unused18) {
                                        }
                                        synchronized (a.this.f30186a) {
                                            a.this.f30186a.remove(this.f30191b);
                                        }
                                        return;
                                    }
                                    i10 += i11;
                                    bufferedOutputStream.write(bArr, 0, i11);
                                    e(((long) i10) + j10, jA);
                                }
                            } catch (Exception e11) {
                                e = e11;
                                ALog.e(a.f30178e, "file download failed!", null, e, new Object[0]);
                                d(-104, e.toString());
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                synchronized (a.this.f30186a) {
                                    a.this.f30186a.remove(this.f30191b);
                                }
                                return;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            inputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fVar = null;
                            bufferedOutputStream2 = bufferedOutputStream;
                            if (bufferedOutputStream2 != null) {
                                bufferedOutputStream2.close();
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            if (fVar != null) {
                                fVar.close();
                            }
                            synchronized (a.this.f30186a) {
                                a.this.f30186a.remove(this.f30191b);
                                throw th;
                            }
                        }
                    }
                    d(-102, "ResponseCode:" + statusCode);
                    synchronized (a.this.f30186a) {
                        a.this.f30186a.remove(this.f30191b);
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception e13) {
                e = e13;
                bufferedOutputStream = null;
                randomAccessFile = null;
                inputStream = null;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
                fVar = null;
            }
        }
    }

    private a() {
        this.f30186a = new SparseArray<>(6);
        this.f30187b = new AtomicInteger(0);
        this.f30188c = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f30189d = null;
        this.f30189d = NetworkSdkSetting.a();
        this.f30188c.allowCoreThreadTimeOut(true);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File b(String str, boolean z10) {
        String strMd5ToHex = StringUtils.md5ToHex(str);
        if (strMd5ToHex != null) {
            str = strMd5ToHex;
        }
        return z10 ? new File(this.f30189d.getExternalCacheDir(), str) : new File(this.f30189d.getCacheDir(), str);
    }

    private void d() {
        if (this.f30189d != null) {
            File file = new File(this.f30189d.getExternalFilesDir(null), "downloads");
            if (file.exists()) {
                return;
            }
            file.mkdir();
        }
    }

    private boolean e(String str) {
        if (this.f30189d != null) {
            try {
                File file = new File(str);
                if (file.exists()) {
                    return true;
                }
                return file.mkdir();
            } catch (Exception unused) {
                ALog.e(f30178e, "create folder failed", null, Progress.D, str);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f(String str) {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f30189d.getExternalFilesDir(null));
        sb2.append("/");
        sb2.append("downloads");
        sb2.append("/");
        sb2.append(str);
        return sb2.toString();
    }

    public static a j() {
        return b.f30190a;
    }

    public void g(int i10) {
        synchronized (this.f30186a) {
            c cVar = this.f30186a.get(i10);
            if (cVar != null) {
                if (ALog.isPrintLog(2)) {
                    ALog.i(f30178e, "try cancel task" + i10 + " url=" + cVar.f30192c.toString(), null, new Object[0]);
                }
                this.f30186a.remove(i10);
                cVar.c();
            }
        }
    }

    public int h(String str, String str2, InterfaceC0255a interfaceC0255a) {
        return i(str, null, str2, interfaceC0255a);
    }

    public int i(String str, String str2, String str3, InterfaceC0255a interfaceC0255a) {
        if (ALog.isPrintLog(2)) {
            ALog.i(f30178e, "enqueue", null, Progress.D, str2, "filename", str3, "url", str);
        }
        if (this.f30189d == null) {
            ALog.e(f30178e, "network sdk not initialized.", null, new Object[0]);
            return -1;
        }
        try {
            URL url = new URL(str);
            if (!TextUtils.isEmpty(str2) && !e(str2)) {
                ALog.e(f30178e, "file folder invalid.", null, new Object[0]);
                if (interfaceC0255a != null) {
                    interfaceC0255a.b(-1, -101, "file folder path invalid");
                }
                return -1;
            }
            synchronized (this.f30186a) {
                int size = this.f30186a.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c cVarValueAt = this.f30186a.valueAt(i10);
                    if (url.equals(cVarValueAt.f30192c)) {
                        if (!cVarValueAt.h(interfaceC0255a)) {
                            break;
                        }
                        return cVarValueAt.f30191b;
                    }
                }
                c cVar = new c(url, str2, str3, interfaceC0255a);
                this.f30186a.put(cVar.f30191b, cVar);
                this.f30188c.submit(cVar);
                return cVar.f30191b;
            }
        } catch (MalformedURLException e10) {
            ALog.e(f30178e, "url invalid.", null, e10, new Object[0]);
            if (interfaceC0255a != null) {
                interfaceC0255a.b(-1, -100, "url invalid");
            }
            return -1;
        }
    }
}

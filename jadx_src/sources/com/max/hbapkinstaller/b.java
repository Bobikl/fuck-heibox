package com.max.hbapkinstaller;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.RemoteException;
import android.util.Log;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ApksInstall.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f65789b = "ApksInstall";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PackageInstaller f65790a = BaseApplication.a().getPackageManager().getPackageInstaller();

    /* JADX INFO: renamed from: com.max.hbapkinstaller.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApksInstall.java */
    public static class C0531b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        PackageInstaller.SessionParams f65791a;

        private C0531b() {
        }
    }

    private int a(int i10, boolean z10) throws RemoteException {
        Object[] objArr = {new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.dn, new Class[]{cls, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        PackageInstaller.Session sessionOpenSession = null;
        try {
            try {
                sessionOpenSession = this.f65790a.openSession(i10);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            sessionOpenSession.commit(PendingIntent.getService(BaseApplication.a(), 0, new Intent(BaseApplication.a(), (Class<?>) APKInstallService.class), 33554432).getIntentSender());
            sessionOpenSession.close();
            System.out.println("install request sent");
            Log.d(f65789b, "doCommitSession: " + this.f65790a.getMySessions());
            Log.d(f65789b, "doCommitSession: after session commit ");
            return 1;
        } finally {
            sessionOpenSession.close();
        }
    }

    private int b(PackageInstaller.SessionParams sessionParams) throws RemoteException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sessionParams}, this, changeQuickRedirect, false, bb.c.b.an, new Class[]{PackageInstaller.SessionParams.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (sessionParams == null) {
            try {
                Log.d(f65789b, "doCreateSession: !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!param is null");
            } catch (IOException e10) {
                e10.printStackTrace();
                return 0;
            }
        }
        return this.f65790a.createSession(sessionParams);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7 A[Catch: IOException -> 0x00db, all -> 0x010e, LOOP:0: B:26:0x00a0->B:28:0x00a7, LOOP_END, TryCatch #7 {all -> 0x010e, blocks: (B:25:0x0097, B:26:0x00a0, B:28:0x00a7, B:29:0x00ac, B:31:0x00b1, B:43:0x00e5), top: B:62:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[Catch: IOException -> 0x00db, all -> 0x010e, TRY_LEAVE, TryCatch #7 {all -> 0x010e, blocks: (B:25:0x0097, B:26:0x00a0, B:28:0x00a7, B:29:0x00ac, B:31:0x00b1, B:43:0x00e5), top: B:62:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ac A[EDGE_INSN: B:68:0x00ac->B:29:0x00ac BREAK  A[LOOP:0: B:26:0x00a0->B:28:0x00a7], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00b1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.pm.PackageInstaller$Session] */
    private int c(int i10, String str, long j10, String str2, boolean z10) throws Throwable {
        long j11;
        ?? r10;
        String str3;
        Throwable th2;
        ?? r11;
        ?? r12;
        FileInputStream fileInputStream;
        PackageInstaller.Session sessionOpenSession;
        byte[] bArr;
        int i11;
        int i12;
        ?? r13;
        String str4;
        String str5 = str;
        Object[] objArr = {new Integer(i10), str5, new Long(j10), str2, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.f30573cn, new Class[]{cls, String.class, Long.TYPE, String.class, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        OutputStream outputStreamOpenWrite = null;
        try {
            try {
                try {
                    try {
                        if (!Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(str5)) {
                            if (str5 != null) {
                                File file = new File(str5);
                                boolean zIsFile = file.isFile();
                                str4 = str5;
                                r13 = zIsFile;
                                if (zIsFile) {
                                    long length = file.length();
                                    j11 = length;
                                    str3 = str5;
                                    r10 = length;
                                }
                            }
                            sessionOpenSession = this.f65790a.openSession(i10);
                            if (str3 != null) {
                                try {
                                    fileInputStream = new FileInputStream(str3);
                                } catch (IOException e10) {
                                    e = e10;
                                    fileInputStream = null;
                                    System.err.println("Error: failed to write; " + e.getMessage());
                                    try {
                                        outputStreamOpenWrite.close();
                                        fileInputStream.close();
                                        sessionOpenSession.close();
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                    }
                                    return 1;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    r11 = 0;
                                    r12 = sessionOpenSession;
                                    try {
                                        outputStreamOpenWrite.close();
                                        r11.close();
                                        r12.close();
                                        throw th2;
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                        throw th2;
                                    }
                                }
                            } else {
                                fileInputStream = null;
                            }
                            outputStreamOpenWrite = sessionOpenSession.openWrite(str2, 0L, j11);
                            bArr = new byte[65536];
                            i11 = 0;
                            while (true) {
                                i12 = fileInputStream.read(bArr);
                                if (i12 != -1) {
                                    break;
                                }
                                i11 += i12;
                                outputStreamOpenWrite.write(bArr, 0, i12);
                            }
                            sessionOpenSession.fsync(outputStreamOpenWrite);
                            if (z10) {
                                System.out.println("Success: streamed " + i11 + " bytes");
                            }
                            outputStreamOpenWrite.close();
                            fileInputStream.close();
                            sessionOpenSession.close();
                            return 0;
                        }
                        str4 = str5;
                        r13 = objArr;
                        str4 = null;
                        r13 = objArr;
                        outputStreamOpenWrite.close();
                        fileInputStream.close();
                        sessionOpenSession.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    outputStreamOpenWrite = sessionOpenSession.openWrite(str2, 0L, j11);
                    bArr = new byte[65536];
                    i11 = 0;
                    while (true) {
                        i12 = fileInputStream.read(bArr);
                        if (i12 != -1) {
                            break;
                            break;
                        }
                        i11 += i12;
                        outputStreamOpenWrite.write(bArr, 0, i12);
                    }
                    sessionOpenSession.fsync(outputStreamOpenWrite);
                    if (z10) {
                        System.out.println("Success: streamed " + i11 + " bytes");
                    }
                    return 0;
                } catch (IOException e14) {
                    e = e14;
                    System.err.println("Error: failed to write; " + e.getMessage());
                    outputStreamOpenWrite.close();
                    fileInputStream.close();
                    sessionOpenSession.close();
                    return 1;
                }
                sessionOpenSession = this.f65790a.openSession(i10);
                if (str3 != null) {
                    fileInputStream = new FileInputStream(str3);
                } else {
                    fileInputStream = null;
                }
            } catch (Throwable th4) {
                th2 = th4;
                r11 = str3;
                r12 = r10;
            }
        } catch (IOException e15) {
            e = e15;
            fileInputStream = null;
            sessionOpenSession = null;
        } catch (Throwable th5) {
            th2 = th5;
            r11 = 0;
            r12 = 0;
        }
        j11 = j10;
        str3 = str4;
        r10 = r13;
    }

    private C0531b g(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.b.en, new Class[]{Long.TYPE}, C0531b.class);
        if (patchProxyResultProxy.isSupported) {
            return (C0531b) patchProxyResultProxy.result;
        }
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        C0531b c0531b = new C0531b();
        c0531b.f65791a = sessionParams;
        sessionParams.setSize(j10);
        return c0531b;
    }

    private int h(C0531b c0531b) throws RemoteException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0531b}, this, changeQuickRedirect, false, bb.c.b.Zm, new Class[]{C0531b.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iB = b(c0531b.f65791a);
        System.out.println("Success: created install session [" + iB + "]");
        return iB;
    }

    private int i(long j10, int i10, String str, String str2) throws RemoteException {
        Object[] objArr = {new Long(j10), new Integer(i10), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.bn, new Class[]{Long.TYPE, cls, String.class, String.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : c(i10, str2, j10, str, true);
    }

    public List<String> d(File[] fileArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fileArr}, this, changeQuickRedirect, false, bb.c.b.Xm, new Class[]{File[].class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fileArr.length; i10++) {
            File file = fileArr[i10];
            if (file != null) {
                if (file.isDirectory()) {
                    arrayList.addAll(d(fileArr[i10].listFiles()));
                } else if (fileArr[i10].getName().contains(".apk")) {
                    arrayList.add(fileArr[i10].getAbsolutePath());
                }
            }
        }
        return arrayList;
    }

    public int e(List<String> list) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.Ym, new Class[]{List.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        long length = 0;
        try {
            for (String str : list) {
                File file = new File(str);
                if (file.isFile()) {
                    map.put(file.getName(), Long.valueOf(file.length()));
                    map2.put(file.getName(), str);
                    length += file.length();
                }
            }
            try {
                int iH = h(g(length));
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        i(((Long) entry.getValue()).longValue(), iH, (String) entry.getKey(), (String) map2.get(entry.getKey()));
                    }
                    if (a(iH, false) != 0) {
                        return iH;
                    }
                    System.out.println("Success");
                    return iH;
                } catch (RemoteException e10) {
                    e = e10;
                    i10 = iH;
                    e.printStackTrace();
                    return i10;
                }
            } catch (RemoteException e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            return -1;
        }
    }

    public void f(File file) {
        if (!PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.b.Wm, new Class[]{File.class}, Void.TYPE).isSupported && file.isDirectory()) {
            e(d(file.listFiles()));
        }
    }
}

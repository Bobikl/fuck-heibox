package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.x;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    private static PerfClientReport a(PerfClientReport perfClientReport, String str) {
        long[] jArrM78a;
        if (perfClientReport == null || (jArrM78a = m78a(str)) == null) {
            return null;
        }
        perfClientReport.perfCounts = jArrM78a[0];
        perfClientReport.perfLatencies = jArrM78a[1];
        return perfClientReport;
    }

    private static PerfClientReport a(String str) {
        PerfClientReport blankInstance = null;
        try {
            String[] strArrM79a = m79a(str);
            if (strArrM79a == null || strArrM79a.length < 4 || TextUtils.isEmpty(strArrM79a[0]) || TextUtils.isEmpty(strArrM79a[1]) || TextUtils.isEmpty(strArrM79a[2]) || TextUtils.isEmpty(strArrM79a[3])) {
                return null;
            }
            blankInstance = PerfClientReport.getBlankInstance();
            blankInstance.production = Integer.parseInt(strArrM79a[0]);
            blankInstance.clientInterfaceId = strArrM79a[1];
            blankInstance.reportType = Integer.parseInt(strArrM79a[2]);
            blankInstance.code = Integer.parseInt(strArrM79a[3]);
            return blankInstance;
        } catch (Exception unused) {
            com.xiaomi.channel.commonutils.logger.b.c("parse per key error");
            return blankInstance;
        }
    }

    public static String a(PerfClientReport perfClientReport) {
        return perfClientReport.production + "#" + perfClientReport.clientInterfaceId + "#" + perfClientReport.reportType + "#" + perfClientReport.code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static HashMap<String, String> m77a(String str) throws Throwable {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return map;
        }
        ?? r10 = 0;
        ?? length = 0;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        ?? Split = line.split("%%%");
                        length = Split.length;
                        if (length >= 2) {
                            length = 0;
                            length = 0;
                            if (!TextUtils.isEmpty(Split[0]) && !TextUtils.isEmpty(Split[1])) {
                                length = Split[0];
                                map.put(length, Split[1]);
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        bufferedReader = bufferedReader2;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        x.a(bufferedReader);
                        r10 = bufferedReader;
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = bufferedReader2;
                        x.a((Closeable) r10);
                        throw th;
                    }
                }
                x.a(bufferedReader2);
                r10 = length;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static List<String> a(Context context, String str) throws Throwable {
        File file;
        RandomAccessFile randomAccessFile;
        ?? bufferedReader;
        PerfClientReport perfClientReportA;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return arrayList;
        }
        FileLock fileLock = null;
        try {
            file = new File(str + ".lock");
            try {
                x.m780a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    FileLock fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                String[] strArrSplit = line.split("%%%");
                                if (strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1]) && (perfClientReportA = a(a(strArrSplit[0]), strArrSplit[1])) != null) {
                                    arrayList.add(perfClientReportA.toJsonString());
                                }
                            } catch (Exception e10) {
                                e = e10;
                                fileLock = fileLockLock;
                                bufferedReader = bufferedReader;
                                try {
                                    com.xiaomi.channel.commonutils.logger.b.a(e);
                                    if (fileLock != null) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e11) {
                                            com.xiaomi.channel.commonutils.logger.b.a(e11);
                                        }
                                    }
                                    x.a(randomAccessFile);
                                    x.a((Closeable) bufferedReader);
                                    if (file != null) {
                                    }
                                    return arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e12) {
                                            com.xiaomi.channel.commonutils.logger.b.a(e12);
                                        }
                                    }
                                    x.a(randomAccessFile);
                                    x.a((Closeable) bufferedReader);
                                    if (file == null) {
                                        throw th;
                                    }
                                    file.delete();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileLock = fileLockLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                x.a(randomAccessFile);
                                x.a((Closeable) bufferedReader);
                                if (file == null) {
                                    throw th;
                                }
                                file.delete();
                                throw th;
                            }
                        }
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e13) {
                                com.xiaomi.channel.commonutils.logger.b.a(e13);
                            }
                        }
                        x.a(randomAccessFile);
                        x.a((Closeable) bufferedReader);
                    } catch (Exception e14) {
                        e = e14;
                        bufferedReader = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = 0;
                    }
                } catch (Exception e15) {
                    e = e15;
                    bufferedReader = 0;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = 0;
                }
            } catch (Exception e16) {
                e = e16;
                randomAccessFile = null;
                bufferedReader = randomAccessFile;
                com.xiaomi.channel.commonutils.logger.b.a(e);
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                x.a(randomAccessFile);
                x.a((Closeable) bufferedReader);
                if (file != null) {
                    file.delete();
                }
                return arrayList;
            } catch (Throwable th6) {
                th = th6;
                randomAccessFile = null;
                bufferedReader = randomAccessFile;
                if (fileLock != null) {
                    fileLock.release();
                }
                x.a(randomAccessFile);
                x.a((Closeable) bufferedReader);
                if (file == null) {
                    throw th;
                }
                file.delete();
                throw th;
            }
        } catch (Exception e17) {
            e = e17;
            file = null;
            randomAccessFile = null;
        } catch (Throwable th7) {
            th = th7;
            file = null;
            randomAccessFile = null;
        }
        file.delete();
        return arrayList;
    }

    private static void a(String str, HashMap<String, String> map) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th2;
        Exception e10;
        if (TextUtils.isEmpty(str) || map == null || map.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                try {
                    for (String str2 : map.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + map.get(str2));
                        bufferedWriter.newLine();
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                }
            } catch (Throwable th3) {
                th2 = th3;
                x.a(bufferedWriter);
                throw th2;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th4) {
            bufferedWriter = null;
            th2 = th4;
            x.a(bufferedWriter);
            throw th2;
        }
        x.a(bufferedWriter);
    }

    public static void a(String str, com.xiaomi.clientreport.data.a[] aVarArr) {
        RandomAccessFile randomAccessFile;
        boolean zIsValid;
        if (aVarArr == null || aVarArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLockLock = null;
        try {
            File file = new File(str + ".lock");
            x.m780a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                HashMap<String, String> mapM77a = m77a(str);
                for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                    if (aVar != null) {
                        String strA = a((PerfClientReport) aVar);
                        long j10 = ((PerfClientReport) aVar).perfCounts;
                        long j11 = ((PerfClientReport) aVar).perfLatencies;
                        if (!TextUtils.isEmpty(strA) && j10 > 0 && j11 >= 0) {
                            a(mapM77a, strA, j10, j11);
                        }
                    }
                }
                a(str, mapM77a);
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e10) {
                        e = e10;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                    }
                }
            } catch (Throwable unused) {
                try {
                    com.xiaomi.channel.commonutils.logger.b.c("failed to write perf to file ");
                    if (fileLockLock != null) {
                        if (zIsValid) {
                            try {
                            } catch (IOException e11) {
                                e = e11;
                                com.xiaomi.channel.commonutils.logger.b.a(e);
                            }
                        }
                    }
                } finally {
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e12) {
                            com.xiaomi.channel.commonutils.logger.b.a(e12);
                        }
                    }
                    x.a(randomAccessFile);
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0050, please report this as an issue */
    private static void a(HashMap<String, String> map, String str, long j10, long j11) {
        String str2;
        String str3 = map.get(str);
        if (TextUtils.isEmpty(str3)) {
            map.put(str, j10 + "#" + j11);
            return;
        }
        long[] jArrM78a = m78a(str3);
        if (jArrM78a != null) {
            long j12 = jArrM78a[0];
            if (j12 > 0) {
                long j13 = jArrM78a[1];
                if (j13 < 0) {
                    str2 = j10 + "#" + j11;
                } else {
                    str2 = (j10 + j12) + "#" + (j11 + j13);
                }
            } else {
                str2 = j10 + "#" + j11;
            }
        } else {
            str2 = j10 + "#" + j11;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected static long[] m78a(String str) {
        long[] jArr = new long[2];
        try {
            String[] strArrSplit = str.split("#");
            if (strArrSplit.length >= 2) {
                jArr[0] = Long.parseLong(strArrSplit[0].trim());
                jArr[1] = Long.parseLong(strArrSplit[1].trim());
            }
            return jArr;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static String[] m79a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }
}

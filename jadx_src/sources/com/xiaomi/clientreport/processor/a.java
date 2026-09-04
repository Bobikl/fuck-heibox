package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import androidx.core.app.o0;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.ab;
import com.xiaomi.push.bp;
import com.xiaomi.push.cb;
import com.xiaomi.push.h;
import com.xiaomi.push.x;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IEventProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f106727a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> f99a;

    public a(Context context) {
        a(context);
    }

    public static String a(com.xiaomi.clientreport.data.a aVar) {
        return String.valueOf(aVar.production);
    }

    private List<String> a(String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(str));
                while (true) {
                    try {
                        int i10 = fileInputStream2.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        if (i10 == 4) {
                            if (ab.a(bArr) == -573785174) {
                                int i11 = fileInputStream2.read(bArr2);
                                if (i11 == -1) {
                                    break;
                                }
                                if (i11 != 4) {
                                    com.xiaomi.channel.commonutils.logger.b.d("eventData read from cache file failed cause lengthBuffer error");
                                    break;
                                }
                                int iA = ab.a(bArr2);
                                if (iA < 1 || iA > 4096) {
                                    com.xiaomi.channel.commonutils.logger.b.d("eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K");
                                    break;
                                }
                                byte[] bArr3 = new byte[iA];
                                if (fileInputStream2.read(bArr3) != iA) {
                                    com.xiaomi.channel.commonutils.logger.b.d("eventData read from cache file failed cause buffer size not equal length");
                                    break;
                                }
                                String strBytesToString = bytesToString(bArr3);
                                if (!TextUtils.isEmpty(strBytesToString)) {
                                    arrayList.add(strBytesToString);
                                }
                            } else {
                                com.xiaomi.channel.commonutils.logger.b.d("eventData read from cache file failed because magicNumber error");
                                break;
                            }
                        } else {
                            com.xiaomi.channel.commonutils.logger.b.d("eventData read from cache file failed because magicNumber error");
                            break;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        x.a((Closeable) fileInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        x.a((Closeable) fileInputStream);
                        throw th;
                    }
                }
                x.a((Closeable) fileInputStream2);
            } catch (Exception e11) {
                e = e11;
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void a(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
            }
        }
        x.a(randomAccessFile);
    }

    private void a(String str, String str2) {
        EventClientReport eventClientReportA = com.xiaomi.clientreport.manager.a.a(this.f106727a).a(5001, "24:" + str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(eventClientReportA.toJsonString());
        a(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00c1: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:47:0x00c1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v7 */
    private com.xiaomi.clientreport.data.a[] a(com.xiaomi.clientreport.data.a[] aVarArr) throws Throwable {
        Closeable closeable;
        RandomAccessFile randomAccessFile;
        BufferedOutputStream bufferedOutputStream;
        String strB = b(aVarArr[0]);
        FileLock fileLockIsEmpty = TextUtils.isEmpty(strB);
        Closeable closeable2 = null;
        try {
            if (fileLockIsEmpty != 0) {
                return null;
            }
            try {
                File file = new File(strB + ".lock");
                x.m780a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    fileLockIsEmpty = randomAccessFile.getChannel().lock();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(strB), true));
                        try {
                            int i10 = 0;
                            for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                                if (aVar != null) {
                                    byte[] bArrStringToBytes = stringToBytes(aVar.toJsonString());
                                    if (bArrStringToBytes == null || bArrStringToBytes.length < 1 || bArrStringToBytes.length > 4096) {
                                        com.xiaomi.channel.commonutils.logger.b.d("event data throw a invalid item ");
                                    } else {
                                        if (!cb.m218a(this.f106727a, strB)) {
                                            int length = aVarArr.length - i10;
                                            com.xiaomi.clientreport.data.a[] aVarArr2 = new com.xiaomi.clientreport.data.a[length];
                                            System.arraycopy(aVarArr, i10, aVarArr2, 0, length);
                                            x.a(bufferedOutputStream);
                                            a(randomAccessFile, (FileLock) fileLockIsEmpty);
                                            return aVarArr2;
                                        }
                                        bufferedOutputStream.write(ab.a(-573785174));
                                        bufferedOutputStream.write(ab.a(bArrStringToBytes.length));
                                        bufferedOutputStream.write(bArrStringToBytes);
                                        bufferedOutputStream.flush();
                                        i10++;
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            com.xiaomi.channel.commonutils.logger.b.a("event data write to cache file failed cause exception", e);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        x.a(closeable2);
                        a(randomAccessFile, fileLockIsEmpty);
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileLockIsEmpty = 0;
                    bufferedOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLockIsEmpty = 0;
                }
            } catch (Exception e13) {
                e = e13;
                fileLockIsEmpty = 0;
                randomAccessFile = null;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileLockIsEmpty = 0;
                randomAccessFile = null;
            }
            x.a(bufferedOutputStream);
            a(randomAccessFile, fileLockIsEmpty);
            return null;
        } catch (Throwable th5) {
            th = th5;
            closeable2 = closeable;
        }
    }

    private String b(com.xiaomi.clientreport.data.a aVar) {
        File externalFilesDir = this.f106727a.getExternalFilesDir(o0.I0);
        String strA = a(aVar);
        if (externalFilesDir == null) {
            return null;
        }
        String str = externalFilesDir.getAbsolutePath() + File.separator + strA;
        for (int i10 = 0; i10 < 100; i10++) {
            String str2 = str + i10;
            if (cb.m218a(this.f106727a, str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[PHI: r3 r4 r5
  0x0036: PHI (r3v10 java.nio.channels.FileLock) = (r3v3 java.nio.channels.FileLock), (r3v1 java.nio.channels.FileLock), (r3v1 java.nio.channels.FileLock) binds: [B:65:0x0109, B:32:0x0091, B:19:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r4v14 java.io.RandomAccessFile) = (r4v3 java.io.RandomAccessFile), (r4v1 java.io.RandomAccessFile), (r4v1 java.io.RandomAccessFile) binds: [B:65:0x0109, B:32:0x0091, B:19:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r5v9 java.io.File) = (r5v3 java.io.File), (r5v1 java.io.File), (r5v1 java.io.File) binds: [B:65:0x0109, B:32:0x0091, B:19:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.xiaomi.clientreport.processor.c
    public void a() throws Throwable {
        cb.a(this.f106727a, o0.I0, "eventUploading");
        File[] fileArrM219a = cb.m219a(this.f106727a, "eventUploading");
        if (fileArrM219a == null || fileArrM219a.length <= 0) {
            return;
        }
        FileLock fileLockLock = null;
        RandomAccessFile randomAccessFile = null;
        File file = null;
        for (File file2 : fileArrM219a) {
            if (file2 == null) {
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e10) {
                        com.xiaomi.channel.commonutils.logger.b.a(e10);
                    }
                }
                x.a(randomAccessFile);
                if (file != null) {
                    file.delete();
                }
            } else {
                try {
                    try {
                        if (file2.length() > 5242880) {
                            com.xiaomi.channel.commonutils.logger.b.d("eventData read from cache file failed because " + file2.getName() + " is too big, length " + file2.length());
                            a(file2.getName(), Formatter.formatFileSize(this.f106727a, file2.length()));
                            file2.delete();
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e11) {
                                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                                }
                            }
                            x.a(randomAccessFile);
                            if (file != null) {
                                file.delete();
                            }
                        } else {
                            String absolutePath = file2.getAbsolutePath();
                            File file3 = new File(absolutePath + ".lock");
                            try {
                                x.m780a(file3);
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rw");
                                try {
                                    fileLockLock = randomAccessFile2.getChannel().lock();
                                    a(a(absolutePath));
                                    file2.delete();
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e12) {
                                            com.xiaomi.channel.commonutils.logger.b.a(e12);
                                        }
                                    }
                                    x.a(randomAccessFile2);
                                    file3.delete();
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                } catch (Exception e13) {
                                    e = e13;
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                    com.xiaomi.channel.commonutils.logger.b.a(e);
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e14) {
                                            com.xiaomi.channel.commonutils.logger.b.a(e14);
                                        }
                                    }
                                    x.a(randomAccessFile);
                                    if (file != null) {
                                        file.delete();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    randomAccessFile = randomAccessFile2;
                                    file = file3;
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e15) {
                                            com.xiaomi.channel.commonutils.logger.b.a(e15);
                                        }
                                    }
                                    x.a(randomAccessFile);
                                    if (file == null) {
                                        throw th;
                                    }
                                    file.delete();
                                    throw th;
                                }
                            } catch (Exception e16) {
                                e = e16;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e17) {
                    e = e17;
                }
            }
        }
    }

    public void a(Context context) {
        this.f106727a = context;
    }

    @Override // com.xiaomi.clientreport.processor.d
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo75a(com.xiaomi.clientreport.data.a aVar) {
        if ((aVar instanceof EventClientReport) && this.f99a != null) {
            EventClientReport eventClientReport = (EventClientReport) aVar;
            String strA = a((com.xiaomi.clientreport.data.a) eventClientReport);
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f99a.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(eventClientReport);
            this.f99a.put(strA, arrayList);
        }
    }

    public void a(List<String> list) {
        cb.a(this.f106727a, list);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m76a(com.xiaomi.clientreport.data.a[] aVarArr) throws Throwable {
        if (aVarArr == null || aVarArr.length == 0 || aVarArr[0] == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("event data write to cache file failed because data null");
            return;
        }
        do {
            aVarArr = a(aVarArr);
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
        } while (aVarArr[0] != null);
    }

    @Override // com.xiaomi.clientreport.processor.d
    public void b() throws Throwable {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> map = this.f99a;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f99a.keySet().iterator();
            while (it.hasNext()) {
                ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f99a.get(it.next());
                if (arrayList != null && arrayList.size() > 0) {
                    com.xiaomi.clientreport.data.a[] aVarArr = new com.xiaomi.clientreport.data.a[arrayList.size()];
                    arrayList.toArray(aVarArr);
                    m76a(aVarArr);
                }
            }
        }
        this.f99a.clear();
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public String bytesToString(byte[] bArr) {
        byte[] bArrA;
        if (bArr != null && bArr.length >= 1) {
            if (!com.xiaomi.clientreport.manager.a.a(this.f106727a).m72a().isEventEncrypted()) {
                return bp.b(bArr);
            }
            String strA = cb.a(this.f106727a);
            if (!TextUtils.isEmpty(strA) && (bArrA = cb.a(strA)) != null && bArrA.length > 0) {
                try {
                    return bp.b(Base64.decode(h.a(bArrA, bArr), 2));
                } catch (InvalidAlgorithmParameterException e10) {
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                } catch (InvalidKeyException e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                } catch (NoSuchAlgorithmException e12) {
                    com.xiaomi.channel.commonutils.logger.b.a(e12);
                } catch (BadPaddingException e13) {
                    com.xiaomi.channel.commonutils.logger.b.a(e13);
                } catch (IllegalBlockSizeException e14) {
                    com.xiaomi.channel.commonutils.logger.b.a(e14);
                } catch (NoSuchPaddingException e15) {
                    com.xiaomi.channel.commonutils.logger.b.a(e15);
                }
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public void setEventMap(HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> map) {
        this.f99a = map;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public byte[] stringToBytes(String str) {
        byte[] bArrA;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!com.xiaomi.clientreport.manager.a.a(this.f106727a).m72a().isEventEncrypted()) {
            return bp.m192a(str);
        }
        String strA = cb.a(this.f106727a);
        byte[] bArrM192a = bp.m192a(str);
        if (!TextUtils.isEmpty(strA) && bArrM192a != null && bArrM192a.length > 1 && (bArrA = cb.a(strA)) != null) {
            try {
                if (bArrA.length > 1) {
                    return h.b(bArrA, Base64.encode(bArrM192a, 2));
                }
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
            }
        }
        return null;
    }
}

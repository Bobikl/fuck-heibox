package com.tencent.vasdolly.common;

import com.tencent.vasdolly.common.apk.ApkSigningBlockUtils;
import com.tencent.vasdolly.common.apk.SignatureNotFoundException;
import com.tencent.vasdolly.common.apk.ZipUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class V2SchemeUtil {
    public static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;

    public static boolean containV2Signature(File file) {
        try {
            return getAllIdValue(getApkSigningBlock(file)).containsKey(1896449818);
        } catch (SignatureNotFoundException unused) {
            System.out.println("APK : " + file.getAbsolutePath() + " not have apk v2 signature block");
            return false;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static Pair<ByteBuffer, Long> findCentralDir(RandomAccessFile randomAccessFile, long j10, int i10) throws IOException {
        return Pair.create(getByteBuffer(randomAccessFile, j10, i10), Long.valueOf(j10));
    }

    public static Pair<ByteBuffer, Long> findContentEntry(RandomAccessFile randomAccessFile, int i10) throws IOException {
        return Pair.create(getByteBuffer(randomAccessFile, 0L, i10), 0L);
    }

    public static ByteBuffer generateApkSigningBlock(Map<Integer, ByteBuffer> map) {
        if (map == null || map.isEmpty()) {
            throw new RuntimeException("getNewApkV2SchemeBlock , id value pair is empty");
        }
        long jRemaining = 24;
        Iterator<Map.Entry<Integer, ByteBuffer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            jRemaining += (long) (it.next().getValue().remaining() + 12);
        }
        boolean zContainsKey = map.containsKey(1114793335);
        System.out.println("generateApkSigningBlock , needPadding = " + zContainsKey);
        if (zContainsKey) {
            jRemaining -= (long) (map.get(1114793335).remaining() + 12);
            map.remove(1114793335);
            int i10 = (int) ((jRemaining + 8) % 4096);
            if (i10 != 0) {
                int i11 = 4096 - i10;
                if (i11 < 12) {
                    i11 += 4096;
                }
                jRemaining += (long) i11;
                int i12 = (i11 - 8) - 4;
                map.put(1114793335, ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN));
                System.out.println("generateApkSigningBlock , final length = " + jRemaining + " padding = " + i11 + " bufferSize = " + i12);
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) (8 + jRemaining));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putLong(jRemaining);
        for (Map.Entry<Integer, ByteBuffer> entry : map.entrySet()) {
            ByteBuffer value = entry.getValue();
            byteBufferAllocate.putLong(value.remaining() + 4);
            byteBufferAllocate.putInt(entry.getKey().intValue());
            byteBufferAllocate.put(value.array(), value.arrayOffset() + value.position(), value.remaining());
        }
        byteBufferAllocate.putLong(jRemaining);
        byteBufferAllocate.putLong(2334950737559900225L);
        byteBufferAllocate.putLong(3617552046287187010L);
        if (byteBufferAllocate.remaining() > 0) {
            throw new RuntimeException("generateNewApkV2SchemeBlock error");
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static Map<Integer, ByteBuffer> getAllIdValue(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        ApkSigningBlockUtils.checkByteOrderLittleEndian(byteBuffer);
        ByteBuffer byteBufferSliceFromTo = ApkSigningBlockUtils.sliceFromTo(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        while (byteBufferSliceFromTo.hasRemaining()) {
            i10++;
            if (byteBufferSliceFromTo.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i10);
            }
            long j10 = byteBufferSliceFromTo.getLong();
            if (j10 < 4 || j10 > 2147483647L) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i10 + " size out of range: " + j10);
            }
            int i11 = (int) j10;
            int iPosition = byteBufferSliceFromTo.position() + i11;
            if (i11 > byteBufferSliceFromTo.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i10 + " size out of range: " + i11 + ", available: " + byteBufferSliceFromTo.remaining());
            }
            linkedHashMap.put(Integer.valueOf(byteBufferSliceFromTo.getInt()), ApkSigningBlockUtils.getByteBuffer(byteBufferSliceFromTo, i11 - 4));
            byteBufferSliceFromTo.position(iPosition);
        }
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap;
        }
        throw new SignatureNotFoundException("not have Id-Value Pair in APK Signing Block entry #" + i10);
    }

    public static ApkSectionInfo getApkSectionInfo(File file, boolean z10) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair<ByteBuffer, Long> eocd = ApkSigningBlockUtils.getEocd(randomAccessFile2);
                ByteBuffer first = eocd.getFirst();
                long jLongValue = eocd.getSecond().longValue();
                if (ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile2, jLongValue)) {
                    throw new SignatureNotFoundException("ZIP64 APK not supported");
                }
                long centralDirOffset = ApkSigningBlockUtils.getCentralDirOffset(first, jLongValue);
                Pair<ByteBuffer, Long> pairFindApkSigningBlock = ApkSigningBlockUtils.findApkSigningBlock(randomAccessFile2, centralDirOffset);
                Pair<ByteBuffer, Long> pairFindCentralDir = findCentralDir(randomAccessFile2, centralDirOffset, (int) (jLongValue - centralDirOffset));
                ApkSectionInfo apkSectionInfo = new ApkSectionInfo();
                long length = file.length();
                apkSectionInfo.apkSize = length;
                apkSectionInfo.lowMemory = z10;
                if (length > ApkSectionInfo.COPY_CONTENT_MAX_SIZE) {
                    apkSectionInfo.lowMemory = true;
                }
                if (!apkSectionInfo.lowMemory) {
                    apkSectionInfo.contentEntry = findContentEntry(randomAccessFile2, (int) pairFindApkSigningBlock.getSecond().longValue());
                }
                apkSectionInfo.apkSigningBlock = pairFindApkSigningBlock;
                apkSectionInfo.centralDir = pairFindCentralDir;
                apkSectionInfo.eocd = eocd;
                apkSectionInfo.checkParamters();
                System.out.println("baseApk : " + file.getAbsolutePath() + "\nApkSectionInfo = " + apkSectionInfo);
                randomAccessFile2.close();
                return apkSectionInfo;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static ByteBuffer getApkSigningBlock(File file) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair<ByteBuffer, Long> eocd = ApkSigningBlockUtils.getEocd(randomAccessFile2);
                ByteBuffer first = eocd.getFirst();
                long jLongValue = eocd.getSecond().longValue();
                if (ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile2, jLongValue)) {
                    throw new SignatureNotFoundException("ZIP64 APK not supported");
                }
                ByteBuffer first2 = ApkSigningBlockUtils.findApkSigningBlock(randomAccessFile2, ApkSigningBlockUtils.getCentralDirOffset(first, jLongValue)).getFirst();
                randomAccessFile2.close();
                return first2;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static ByteBuffer getByteBuffer(RandomAccessFile randomAccessFile, long j10, int i10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j10);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        return byteBufferAllocate;
    }
}

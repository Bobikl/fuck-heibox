package com.tencent.vasdolly.common;

import com.tencent.vasdolly.common.apk.ApkSigningBlockUtils;
import com.tencent.vasdolly.common.apk.SignatureNotFoundException;
import com.tencent.vasdolly.common.apk.ZipUtils;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: loaded from: classes4.dex */
public class V1SchemeUtil {

    public static class ChannelExistException extends Exception {
        static final long serialVersionUID = -3387516993124229949L;

        public ChannelExistException() {
        }

        public ChannelExistException(String str) {
            super(str);
        }
    }

    public static boolean containV1Magic(File file) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length();
                byte[] bArr = ChannelConstants.V1_MAGIC;
                byte[] bArr2 = new byte[bArr.length];
                randomAccessFile2.seek(length - ((long) bArr.length));
                randomAccessFile2.readFully(bArr2);
                boolean zIsV1MagicMatch = isV1MagicMatch(bArr2);
                randomAccessFile2.close();
                return zIsV1MagicMatch;
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

    public static boolean containV1Signature(File file) {
        try {
            JarFile jarFile = new JarFile(file);
            try {
                JarEntry jarEntry = jarFile.getJarEntry("META-INF/MANIFEST.MF");
                JarEntry jarEntry2 = null;
                Enumeration<JarEntry> enumerationEntries = jarFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                    if (jarEntryNextElement.getName().matches("META-INF/\\w+\\.SF")) {
                        jarEntry2 = jarFile.getJarEntry(jarEntryNextElement.getName());
                        break;
                    }
                }
                jarFile.close();
                if (jarEntry == null || jarEntry2 == null) {
                    jarFile.close();
                    return false;
                }
                jarFile.close();
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void copyFile(File file, File file2) throws Throwable {
        FileChannel fileChannel;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel channel = null;
        try {
            FileChannel channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
                channel.transferFrom(channel2, 0L, channel2.size());
                channel2.close();
                channel.close();
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                if (channel != null) {
                    channel.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    public static Pair<ByteBuffer, Long> getEocd(File file) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair<ByteBuffer, Long> eocd = ApkSigningBlockUtils.getEocd(randomAccessFile2);
                if (ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile2, eocd.getSecond().longValue())) {
                    throw new SignatureNotFoundException("ZIP64 APK not supported");
                }
                randomAccessFile2.close();
                return eocd;
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

    private static boolean isV1MagicMatch(byte[] bArr) {
        if (bArr.length != ChannelConstants.V1_MAGIC.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr2 = ChannelConstants.V1_MAGIC;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static String readChannel(File file) throws Exception {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length();
                byte[] bArr = ChannelConstants.V1_MAGIC;
                byte[] bArr2 = new byte[bArr.length];
                long length2 = length - ((long) bArr.length);
                randomAccessFile2.seek(length2);
                randomAccessFile2.readFully(bArr2);
                if (!isV1MagicMatch(bArr2)) {
                    throw new Exception("zip v1 magic not found");
                }
                long j10 = length2 - 2;
                randomAccessFile2.seek(j10);
                int i10 = readShort(randomAccessFile2);
                if (i10 <= 0) {
                    throw new Exception("zip channel info not found");
                }
                randomAccessFile2.seek(j10 - ((long) i10));
                byte[] bArr3 = new byte[i10];
                randomAccessFile2.readFully(bArr3);
                String strTrim = new String(bArr3, "UTF-8").trim();
                randomAccessFile2.close();
                return strTrim;
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

    private static short readShort(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }

    public static void removeChannelByV1(File file) throws Exception {
        if (file == null || !file.exists() || !file.isFile()) {
            throw new Exception("param error , file : " + file);
        }
        RandomAccessFile randomAccessFile = null;
        Pair<ByteBuffer, Long> eocd = getEocd(file);
        if (eocd.getFirst().remaining() == 22) {
            System.out.println("file : " + file.getName() + " , has no comment");
            return;
        }
        System.out.println("file : " + file.getName() + " , has comment");
        int unsignedInt16 = ZipUtils.getUnsignedInt16(eocd.getFirst(), 20);
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile2.seek((eocd.getSecond().longValue() + 22) - 2);
                writeShort(0, randomAccessFile2);
                randomAccessFile2.setLength(file.length() - ((long) unsignedInt16));
                System.out.println("file : " + file.getName() + " , remove comment success");
                randomAccessFile2.close();
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

    public static void writeChannel(File file, String str) throws Exception {
        if (file == null || !file.exists() || !file.isFile() || str == null || str.isEmpty()) {
            throw new Exception("param error , file : " + file + " , channel : " + str);
        }
        RandomAccessFile randomAccessFile = null;
        byte[] bytes = str.getBytes("UTF-8");
        Pair<ByteBuffer, Long> eocd = getEocd(file);
        if (eocd.getFirst().remaining() == 22) {
            System.out.println("file : " + file.getAbsolutePath() + " , has no comment");
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile2.seek(file.length() - 2);
                    int length = bytes.length + 2;
                    byte[] bArr = ChannelConstants.V1_MAGIC;
                    writeShort(length + bArr.length, randomAccessFile2);
                    randomAccessFile2.write(bytes);
                    writeShort(bytes.length, randomAccessFile2);
                    randomAccessFile2.write(bArr);
                    randomAccessFile2.close();
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
        } else {
            System.out.println("file : " + file.getAbsolutePath() + " , has comment");
            if (containV1Magic(file)) {
                try {
                    String channel = readChannel(file);
                    if (channel != null) {
                        file.delete();
                        throw new ChannelExistException("file : " + file.getAbsolutePath() + " has a channel : " + channel + ", only ignore");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            int unsignedInt16 = ZipUtils.getUnsignedInt16(eocd.getFirst(), 20);
            int length2 = bytes.length + unsignedInt16 + 2;
            byte[] bArr2 = ChannelConstants.V1_MAGIC;
            int length3 = length2 + bArr2.length;
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile3.seek((eocd.getSecond().longValue() + 22) - 2);
                    writeShort(length3, randomAccessFile3);
                    randomAccessFile3.seek(eocd.getSecond().longValue() + 22 + ((long) unsignedInt16));
                    randomAccessFile3.write(bytes);
                    writeShort(bytes.length, randomAccessFile3);
                    randomAccessFile3.write(bArr2);
                    randomAccessFile3.close();
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = randomAccessFile3;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    private static void writeShort(int i10, DataOutput dataOutput) throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) i10);
        dataOutput.write(byteBufferOrder.array());
    }
}

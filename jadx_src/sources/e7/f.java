package e7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private f() {
    }

    private static Map<Integer, ByteBuffer> a(File file) {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        Map<Integer, ByteBuffer> mapE = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    try {
                        mapE = c.e(c.i(channel).b());
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException unused2) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                        }
                        return mapE;
                    } catch (Throwable th2) {
                        th = th2;
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                } catch (IOException unused6) {
                    channel = null;
                } catch (Throwable th3) {
                    th = th3;
                    channel = null;
                }
            } catch (com.bytedance.hume.readapk.e | IOException unused7) {
            }
        } catch (IOException unused8) {
            channel = null;
            randomAccessFile = null;
        } catch (Throwable th4) {
            th = th4;
            channel = null;
            randomAccessFile = null;
        }
        randomAccessFile.close();
        return mapE;
    }

    private static byte[] b(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, iArrayOffset + byteBuffer.limit());
    }

    public static String[] c(File file, int[] iArr) {
        byte[][] bArrD = d(file, iArr);
        if (bArrD == null) {
            return null;
        }
        String[] strArr = new String[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            try {
                byte[] bArr = bArrD[i10];
                if (bArr != null) {
                    strArr[i10] = new String(bArr, "UTF-8");
                } else {
                    strArr[i10] = "";
                }
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        return strArr;
    }

    public static byte[][] d(File file, int[] iArr) {
        Map<Integer, ByteBuffer> mapA = a(file);
        if (mapA == null || iArr.length <= 0) {
            return null;
        }
        byte[][] bArr = new byte[iArr.length][];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            ByteBuffer byteBuffer = mapA.get(Integer.valueOf(iArr[i10]));
            if (byteBuffer != null) {
                bArr[i10] = b(byteBuffer);
            }
        }
        return bArr;
    }
}

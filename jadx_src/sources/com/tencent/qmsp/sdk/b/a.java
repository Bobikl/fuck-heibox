package com.tencent.qmsp.sdk.b;

import com.tencent.qmsp.sdk.f.h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Utf8;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f101690a = {org.apache.tools.tar.c.G, 99, -3, 81, Utf8.REPLACEMENT_BYTE, 117, 116, -14, 40};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f101691b = {4, 85, -128};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f101692c = {4, 85, -128, 15, 13, com.google.common.base.a.C, 84, -78, com.google.common.base.a.f56672y, 91, -112, 115, 123, 11, 118, -7, 33, 121, -67, 71};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f101693d = {-58, -26, -51, -19};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f101694e = {-58, -26, -51, -19, com.google.common.base.a.H, -3, -21, -29, 87, 39, 40, 12, -119, -40, -84, 65};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f101695f = b.AES;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ThreadLocal<Integer> f101696g = new ThreadLocal<>();

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.b.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0990a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f101697a;

        static {
            int[] iArr = new int[b.values().length];
            f101697a = iArr;
            try {
                iArr[b.AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101697a[b.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        UNKNOWN(0, ""),
        AES(1, ""),
        NONE(2, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private short f101702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f101703b;

        b(short s10, String str) {
            this.f101702a = s10;
            this.f101703b = str;
        }

        public static b a(int i10) {
            if (i10 != 1) {
                return i10 != 2 ? UNKNOWN : NONE;
            }
            return AES;
        }

        public int a() {
            return this.f101702a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f101703b;
        }
    }

    public enum c {
        SUCCESS(0, ""),
        OVERLOAD(1, ""),
        FATAL(2, ""),
        CMD_UNKNOWN(3, ""),
        HOST_UNKNOWN(10, ""),
        CONN_ERR(11, ""),
        SEND_ERR(12, ""),
        RECV_ERR(13, ""),
        WRONG_FORMAT(14, ""),
        SYS_ERR(15, ""),
        DECIPHER_ERR(16, ""),
        DECODE_JSON(20, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f101717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f101718b;

        c(int i10, String str) {
            this.f101717a = i10;
            this.f101718b = str;
        }

        public int a() {
            return this.f101717a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f101718b;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f101719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101720b;

        public d(JSONObject jSONObject, int i10) {
            this.f101719a = jSONObject;
            this.f101720b = i10;
        }
    }

    public static d a(int i10, String str, int i11, JSONObject jSONObject) {
        DataInputStream dataInputStream;
        DataOutputStream dataOutputStream;
        f101696g.set(Integer.valueOf(c.SUCCESS.a()));
        InetSocketAddress inetSocketAddress = new InetSocketAddress(h.a(f101690a), 33445);
        int i12 = 0;
        while (true) {
            DataOutputStream dataOutputStream2 = null;
            if (i12 >= 1) {
                return new d(null, f101696g.get().intValue());
            }
            Socket socket = new Socket();
            try {
                try {
                    socket.connect(inetSocketAddress, com.tencent.qmsp.sdk.app.a.getAtomConnTimeOut().get());
                    try {
                        dataOutputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
                        try {
                            try {
                                a(i10, str, i11, jSONObject, dataOutputStream);
                                socket.setSoTimeout(com.tencent.qmsp.sdk.app.a.getAtomReadTimeOut().get());
                                dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                                try {
                                    d dVar = new d(a(dataInputStream), f101696g.get().intValue());
                                    a((Closeable) dataInputStream);
                                    a(dataOutputStream);
                                    try {
                                        socket.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                    return dVar;
                                } catch (Throwable unused) {
                                    dataOutputStream2 = dataOutputStream;
                                    try {
                                        f101696g.set(Integer.valueOf(c.SYS_ERR.a()));
                                        a((Closeable) dataInputStream);
                                        a(dataOutputStream2);
                                        try {
                                            socket.close();
                                        } catch (IOException e11) {
                                            e11.printStackTrace();
                                        }
                                        i12++;
                                    } catch (Throwable th2) {
                                        a((Closeable) dataInputStream);
                                        a(dataOutputStream2);
                                        try {
                                            socket.close();
                                        } catch (IOException e12) {
                                            e12.printStackTrace();
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (IOException unused2) {
                                d dVar2 = new d(null, c.SEND_ERR.a());
                                a((Closeable) null);
                                a(dataOutputStream);
                                try {
                                    socket.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                }
                                return dVar2;
                            }
                        } catch (Throwable unused3) {
                            dataInputStream = null;
                        }
                    } catch (IOException unused4) {
                        dataOutputStream = null;
                    }
                } catch (Throwable unused5) {
                    dataInputStream = null;
                }
            } catch (IOException unused6) {
                d dVar3 = new d(null, c.CONN_ERR.a());
                a((Closeable) null);
                a((Closeable) null);
                try {
                    socket.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                return dVar3;
            }
            i12++;
        }
    }

    private static JSONObject a(b bVar, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        int i10 = C0990a.f101697a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return new JSONObject(new String(bArr, Charset.forName("UTF-8")));
        }
        byte[] bArr2 = f101694e;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, h.a(f101691b));
        Cipher cipher = Cipher.getInstance(h.a(f101692c));
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        return new JSONObject(new String(cipher.doFinal(bArr), Charset.forName("UTF-8")));
    }

    private static JSONObject a(DataInputStream dataInputStream) {
        ThreadLocal<Integer> threadLocal;
        c cVar;
        byte[] bArr = new byte[28];
        try {
            dataInputStream.readFully(bArr);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 18, 10);
            f101696g.set(Integer.valueOf(byteBufferWrap.getShort()));
            b bVarA = b.a(byteBufferWrap.getShort());
            int i10 = byteBufferWrap.getShort();
            int i11 = byteBufferWrap.getInt();
            dataInputStream.readFully(new byte[i10]);
            byte[] bArr2 = new byte[i11];
            dataInputStream.readFully(bArr2);
            if (i11 == 0) {
                return null;
            }
            try {
                return a(bVarA, bArr2);
            } catch (Exception unused) {
                threadLocal = f101696g;
                cVar = c.DECIPHER_ERR;
                threadLocal.set(Integer.valueOf(cVar.a()));
                return null;
            }
        } catch (IOException unused2) {
            threadLocal = f101696g;
            cVar = c.RECV_ERR;
        }
    }

    private static void a(int i10, String str, int i11, JSONObject jSONObject, DataOutputStream dataOutputStream) throws IOException {
        byte[] bytes;
        dataOutputStream.write(f101693d);
        dataOutputStream.writeInt(i10);
        dataOutputStream.writeInt(i11);
        dataOutputStream.writeInt(0);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
        b bVar = f101695f;
        try {
            bytes = a(bVar, jSONObject);
        } catch (Exception unused) {
            bytes = jSONObject.toString().getBytes("UTF-8");
            bVar = b.NONE;
        }
        dataOutputStream.writeShort(bVar.a());
        byte[] bytes2 = str.getBytes("UTF-8");
        dataOutputStream.writeShort(bytes2.length + 3);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(1);
        dataOutputStream.writeShort(bytes2.length);
        dataOutputStream.write(bytes2);
        dataOutputStream.write(bytes);
        dataOutputStream.flush();
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static byte[] a(b bVar, JSONObject jSONObject) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bytes = jSONObject.toString().getBytes("UTF-8");
        int i10 = C0990a.f101697a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return bytes;
            }
            throw new IOException("unsupported");
        }
        byte[] bArr = f101694e;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, h.a(f101691b));
        Cipher cipher = Cipher.getInstance(h.a(f101692c));
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return cipher.doFinal(bytes);
    }
}

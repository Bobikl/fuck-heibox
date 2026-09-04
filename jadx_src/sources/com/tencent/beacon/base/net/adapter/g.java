package com.tencent.beacon.base.net.adapter;

import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import com.tencent.beacon.base.net.NetException;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.a.m;
import com.tencent.beacon.pack.SocketRequestPackage;
import com.tencent.beacon.pack.SocketResponsePackage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: SocketAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.tencent.beacon.base.net.b.c<byte[], SocketResponsePackage> f98906a = new com.tencent.beacon.base.net.b.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.beacon.base.net.b.c<m, SocketRequestPackage> f98907b = new com.tencent.beacon.base.net.b.d();

    private g() {
    }

    public static a a() {
        return new g();
    }

    private Socket a(String str, int i10) throws IOException {
        com.tencent.beacon.base.util.c.a("SocketAdapter", "create socket domain: %s, port: %d", str, Integer.valueOf(i10));
        Socket socket = new Socket(InetAddress.getByName(str).getHostAddress(), i10);
        socket.setSoTimeout(30000);
        return socket;
    }

    private void a(com.tencent.beacon.base.net.a.b<byte[]> bVar, String str, SocketResponsePackage socketResponsePackage) throws NetException {
        String str2 = socketResponsePackage.msg;
        if (str2 == null || !str2.equals("decrypt Data fail!")) {
            bVar.a(socketResponsePackage.body);
        } else {
            bVar.a(new com.tencent.beacon.base.net.e(str, AssistPushConsts.PUSHMESSAGE_ACTION_MULTI_BRAND_RECEIVE, socketResponsePackage.statusCode, "server encrypt-status error!"));
        }
    }

    private void a(Socket socket, SocketRequestPackage socketRequestPackage) throws IOException {
        com.tencent.beacon.pack.b bVar = new com.tencent.beacon.pack.b();
        socketRequestPackage.writeTo(bVar);
        OutputStream outputStream = socket.getOutputStream();
        byte[] bArrB = bVar.b();
        outputStream.write(a(bArrB, bArrB.length));
        outputStream.flush();
    }

    private byte[] a(Socket socket, boolean z10) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = socket.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i10 = inputStream2.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (!z10) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteArray.length - 4);
                        byteBufferAllocate.put(byteArray, 2, byteArray.length - 4);
                        byteArray = byteBufferAllocate.array();
                    }
                    byteArrayOutputStream.close();
                    inputStream2.close();
                    com.tencent.beacon.base.util.b.a(inputStream2, byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    try {
                        com.tencent.beacon.base.util.c.a(th);
                        com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
                        throw th;
                    } catch (Throwable th3) {
                        com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
    }

    private byte[] a(byte[] bArr, int i10) {
        int i11 = i10 + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i11);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.putShort((short) (i11 & 65535));
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.put((byte) 13);
        byteBufferAllocate.put((byte) 10);
        if (i10 >= 65532) {
            com.tencent.beacon.base.util.c.b("[Error] send bytes exceed 64kB will failure!", new Object[0]);
        }
        return byteBufferAllocate.array();
    }

    @Override // com.tencent.beacon.base.net.adapter.a
    public void request(com.tencent.beacon.base.net.a.f fVar, com.tencent.beacon.base.net.a.b<com.tencent.beacon.base.net.a> bVar) {
    }

    @Override // com.tencent.beacon.base.net.adapter.a
    public void request(m mVar, com.tencent.beacon.base.net.a.b<byte[]> bVar) {
        String strC = mVar.c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        String strName = mVar.g().name();
        try {
            Socket socketA = a(strC, mVar.e());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("send data size: ");
            sb2.append(mVar.b().length);
            com.tencent.beacon.base.util.c.a("SocketAdapter", 0, sb2.toString(), new Object[0]);
            a(socketA, this.f98907b.a(mVar));
            byte[] bArrA = a(socketA, mVar.g() == RequestType.EVENT);
            if (bArrA != null && bArrA.length > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("receivedData: ");
                sb3.append(bArrA.length);
                com.tencent.beacon.base.util.c.a("SocketAdapter", 1, sb3.toString(), new Object[0]);
                SocketResponsePackage socketResponsePackageA = this.f98906a.a(bArrA);
                if (socketResponsePackageA == null) {
                    bVar.a(new com.tencent.beacon.base.net.e(strName, "402", -1, "responsePackage == null"));
                    return;
                }
                com.tencent.beacon.base.util.c.a("SocketAdapter", 2, "socket response code: %s, header: %s, msg: %s", Integer.valueOf(socketResponsePackageA.statusCode), socketResponsePackageA.header, socketResponsePackageA.msg);
                int i10 = socketResponsePackageA.statusCode;
                if (i10 == 200) {
                    a(bVar, strName, socketResponsePackageA);
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("responsePackage msg: ");
                sb4.append(socketResponsePackageA.msg);
                bVar.a(new com.tencent.beacon.base.net.e(strName, "402", i10, sb4.toString()));
                return;
            }
            bVar.a(new com.tencent.beacon.base.net.e(strName, "402", -1, "receiveData == null"));
        } catch (ConnectException e10) {
            bVar.a(new com.tencent.beacon.base.net.e(strName, "401", -1, " connect time more than 30s", e10));
            com.tencent.beacon.base.net.d.c().b(this);
        } catch (SocketTimeoutException e11) {
            bVar.a(new com.tencent.beacon.base.net.e(strName, "401", -1, " request time more than 30s", e11));
            com.tencent.beacon.base.net.d.c().b(this);
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.b("SocketAdapter socket request error: %s", th2.getMessage());
            com.tencent.beacon.base.util.c.a(th2);
            bVar.a(new com.tencent.beacon.base.net.e(strName, "449", -1, " unknown request error!", th2));
            com.tencent.beacon.base.net.d.c().b(this);
        }
    }
}

package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il;

import ad.c;
import com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1l;
import com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1ll;
import com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111Il;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.apache.tools.ant.taskdefs.condition.p;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111lI1l {
    private static final int l1111l111111Il = 3000;

    public static final class l1111l111111Il {
        private final String l1111l111111Il;
        private final l11l1111I1ll l111l11111lIl;

        private l1111l111111Il(String str, l11l1111I1ll l11l1111i1ll) {
            this.l1111l111111Il = str;
            this.l111l11111lIl = l11l1111i1ll;
        }

        /* synthetic */ l1111l111111Il(String str, l11l1111I1ll l11l1111i1ll, byte b10) {
            this(str, l11l1111i1ll);
        }
    }

    private l111l1111lI1l() {
    }

    static l1111l111111Il l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l<?> l111l1111li1l, Exception exc) throws l11l1111I1ll {
        byte b10 = 0;
        if ((exc instanceof SocketTimeoutException) || (exc instanceof ConnectException)) {
            return new l1111l111111Il("socket", new l11l1111I1ll(-2), b10);
        }
        if (exc instanceof UnknownHostException) {
            throw new l11l1111I1ll(exc, -1);
        }
        if (exc instanceof MalformedURLException) {
            throw new RuntimeException(p.f133942p + l111l1111li1l.l111l1111lI1l(), exc);
        }
        if (exc instanceof l11l1111I1ll) {
            return new l1111l111111Il("VolleyError", (l11l1111I1ll) exc, b10);
        }
        return new l1111l111111Il(c.f1243w, new l11l1111I1ll(exc, -4), b10);
    }

    private static void l1111l111111Il(long j10, com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l<?> l111l1111li1l, byte[] bArr, int i10) {
        if (l11l1111Il.l1111l111111Il || j10 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = l111l1111li1l;
            objArr[1] = Long.valueOf(j10);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i10);
            objArr[4] = Integer.valueOf(l111l1111li1l.l11l1111Ill().l111l11111lIl());
            l11l1111Il.l111l11111lIl("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    static void l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l<?> l111l1111li1l, l1111l111111Il l1111l111111il) throws l11l1111I1ll {
        l11l1111I1l l11l1111i1lL11l1111Ill = l111l1111li1l.l11l1111Ill();
        int iL11l1111Il1l = l111l1111li1l.l11l1111Il1l();
        try {
            l11l1111i1lL11l1111Ill.l1111l111111Il(l1111l111111il.l111l11111lIl);
            l111l1111li1l.l1111l111111Il(String.format("%s-retry [timeout=%s]", l1111l111111il.l1111l111111Il, Integer.valueOf(iL11l1111Il1l)));
        } catch (l11l1111I1ll e10) {
            l111l1111li1l.l1111l111111Il(String.format("%s-timeout-giveup [timeout=%s]", l1111l111111il.l1111l111111Il, Integer.valueOf(iL11l1111Il1l)));
            throw e10;
        }
    }

    static byte[] l1111l111111Il(InputStream inputStream, int i10, l111l11111I1l l111l11111i1l) throws Throwable {
        byte[] bArrL1111l111111Il;
        l11l1111lIIl l11l1111liil = new l11l1111lIIl(l111l11111i1l, i10);
        try {
            bArrL1111l111111Il = l111l11111i1l.l1111l111111Il(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrL1111l111111Il);
                    if (i11 == -1) {
                        break;
                    }
                    l11l1111liil.write(bArrL1111l111111Il, 0, i11);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            l11l1111Il.l1111l111111Il("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    l111l11111i1l.l1111l111111Il(bArrL1111l111111Il);
                    l11l1111liil.close();
                    throw th;
                }
            }
            byte[] byteArray = l11l1111liil.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                l11l1111Il.l1111l111111Il("Error occurred when closing InputStream", new Object[0]);
            }
            l111l11111i1l.l1111l111111Il(bArrL1111l111111Il);
            l11l1111liil.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrL1111l111111Il = null;
        }
    }
}

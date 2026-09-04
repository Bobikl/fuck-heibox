package com.xiaomi.push;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public class hd {
    public static int a(Throwable th2) {
        boolean z10 = th2 instanceof hm;
        if (z10) {
            hm hmVar = (hm) th2;
            if (hmVar.a() != null) {
                th2 = hmVar.a();
            }
        }
        String message = th2.getMessage();
        if (th2.getCause() != null) {
            message = th2.getCause().getMessage();
        }
        if (th2 instanceof SocketTimeoutException) {
            return 105;
        }
        if (!(th2 instanceof SocketException)) {
            if (th2 instanceof UnknownHostException) {
                return 107;
            }
            if (z10) {
                return bb.c.b.J4;
            }
            return 0;
        }
        if (message.indexOf("Network is unreachable") != -1) {
            return 102;
        }
        if (message.indexOf("Connection refused") != -1) {
            return 103;
        }
        if (message.indexOf("Connection timed out") != -1) {
            return 105;
        }
        if (message.endsWith("EACCES (Permission denied)")) {
            return 101;
        }
        if (message.indexOf("Connection reset by peer") != -1) {
            return 109;
        }
        if (message.indexOf("Broken pipe") != -1) {
            return 110;
        }
        if (message.indexOf("No route to host") != -1) {
            return 104;
        }
        return message.endsWith("EINVAL (Invalid argument)") ? 106 : 199;
    }
}

package com.xiaomi.push;

import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public final class gk {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ge f107214a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        String f474a;

        a() {
        }
    }

    static a a(Exception exc) {
        m405a(exc);
        boolean z10 = exc instanceof hm;
        Throwable thA = exc;
        if (z10) {
            hm hmVar = (hm) exc;
            if (hmVar.a() != null) {
                thA = exc;
                thA = hmVar.a();
            }
        }
        thA = exc;
        a aVar = new a();
        String message = thA.getMessage();
        if (thA.getCause() != null) {
            message = thA.getCause().getMessage();
        }
        String str = thA.getClass().getSimpleName() + ":" + message;
        int iA = hd.a(thA);
        if (iA != 0) {
            aVar.f107214a = ge.a(ge.GSLB_REQUEST_SUCCESS.a() + iA);
        }
        if (aVar.f107214a == null) {
            aVar.f107214a = ge.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f107214a == ge.GSLB_TCP_ERR_OTHER) {
            aVar.f474a = str;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static void m405a(Exception exc) {
        exc.getClass();
    }

    static a b(Exception exc) {
        Throwable cause;
        m405a(exc);
        boolean z10 = exc instanceof hm;
        Throwable thA = exc;
        if (z10) {
            hm hmVar = (hm) exc;
            if (hmVar.a() != null) {
                thA = exc;
                thA = hmVar.a();
            }
        }
        thA = exc;
        a aVar = new a();
        String message = thA.getMessage();
        if (thA.getCause() != null) {
            message = thA.getCause().getMessage();
        }
        int iA = hd.a(thA);
        String str = thA.getClass().getSimpleName() + ":" + message;
        if (iA != 0) {
            ge geVarA = ge.a(ge.CONN_SUCCESS.a() + iA);
            aVar.f107214a = geVarA;
            if (geVarA == ge.CONN_BOSH_ERR && (cause = thA.getCause()) != null && (cause instanceof UnknownHostException)) {
                aVar.f107214a = ge.CONN_BOSH_UNKNOWNHOST;
            }
        } else {
            aVar.f107214a = ge.CONN_XMPP_ERR;
        }
        ge geVar = aVar.f107214a;
        if (geVar == ge.CONN_TCP_ERR_OTHER || geVar == ge.CONN_XMPP_ERR || geVar == ge.CONN_BOSH_ERR) {
            aVar.f474a = str;
        }
        return aVar;
    }

    static a c(Exception exc) {
        m405a(exc);
        boolean z10 = exc instanceof hm;
        Throwable thA = exc;
        if (z10) {
            hm hmVar = (hm) exc;
            if (hmVar.a() != null) {
                thA = exc;
                thA = hmVar.a();
            }
        }
        thA = exc;
        a aVar = new a();
        String message = thA.getMessage();
        if (thA.getCause() != null) {
            message = thA.getCause().getMessage();
        }
        int iA = hd.a(thA);
        String str = thA.getClass().getSimpleName() + ":" + message;
        if (iA == 105) {
            aVar.f107214a = ge.BIND_TCP_READ_TIMEOUT;
        } else if (iA == 199) {
            aVar.f107214a = ge.BIND_TCP_ERR;
        } else if (iA == 499) {
            aVar.f107214a = ge.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f107214a = ge.BIND_BOSH_ITEM_NOT_FOUND;
            }
        } else if (iA == 109) {
            aVar.f107214a = ge.BIND_TCP_CONNRESET;
        } else if (iA != 110) {
            aVar.f107214a = ge.BIND_XMPP_ERR;
        } else {
            aVar.f107214a = ge.BIND_TCP_BROKEN_PIPE;
        }
        ge geVar = aVar.f107214a;
        if (geVar == ge.BIND_TCP_ERR || geVar == ge.BIND_XMPP_ERR || geVar == ge.BIND_BOSH_ERR) {
            aVar.f474a = str;
        }
        return aVar;
    }

    static a d(Exception exc) {
        m405a(exc);
        boolean z10 = exc instanceof hm;
        Throwable thA = exc;
        if (z10) {
            hm hmVar = (hm) exc;
            if (hmVar.a() != null) {
                thA = exc;
                thA = hmVar.a();
            }
        }
        thA = exc;
        a aVar = new a();
        String message = thA.getMessage();
        int iA = hd.a(thA);
        String str = thA.getClass().getSimpleName() + ":" + message;
        if (iA == 105) {
            aVar.f107214a = ge.CHANNEL_TCP_READTIMEOUT;
        } else if (iA == 199) {
            aVar.f107214a = ge.CHANNEL_TCP_ERR;
        } else if (iA == 499) {
            aVar.f107214a = ge.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f107214a = ge.CHANNEL_BOSH_ITEMNOTFIND;
            }
        } else if (iA == 109) {
            aVar.f107214a = ge.CHANNEL_TCP_CONNRESET;
        } else if (iA != 110) {
            aVar.f107214a = ge.CHANNEL_XMPPEXCEPTION;
        } else {
            aVar.f107214a = ge.CHANNEL_TCP_BROKEN_PIPE;
        }
        ge geVar = aVar.f107214a;
        if (geVar == ge.CHANNEL_TCP_ERR || geVar == ge.CHANNEL_XMPPEXCEPTION || geVar == ge.CHANNEL_BOSH_EXCEPTION) {
            aVar.f474a = str;
        }
        return aVar;
    }
}

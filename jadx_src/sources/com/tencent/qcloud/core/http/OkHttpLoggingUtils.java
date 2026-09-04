package com.tencent.qcloud.core.http;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.s;
import okhttp3.v;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public class OkHttpLoggingUtils {
    private static final Charset UTF8 = Charset.forName("UTF-8");

    private static boolean bodyEncoded(s sVar) {
        String strE = sVar.e("Content-Encoding");
        return (strE == null || strE.equalsIgnoreCase("identity")) ? false : true;
    }

    private static boolean isContentLengthTooLarge(long j10) {
        return j10 > 2048;
    }

    private static boolean isPlaintext(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i10 = 0; i10 < 16 && !buffer2.exhausted(); i10++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static void logMessage(String str, HttpLoggingInterceptor.Logger logger) {
        logger.logRequest(str);
    }

    public static void logQuicRequestHeaders(Map<String, String> map, HttpLoggingInterceptor.Logger logger) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            logger.logRequest(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void logRequest(a0 a0Var, Protocol protocol, HttpLoggingInterceptor.Level level, HttpLoggingInterceptor.Logger logger) throws IOException {
        boolean z10 = level == HttpLoggingInterceptor.Level.BODY;
        boolean z11 = z10 || level == HttpLoggingInterceptor.Level.HEADERS;
        b0 b0VarF = a0Var.f();
        boolean z12 = b0VarF != null;
        String str = "--> " + a0Var.m() + ' ' + a0Var.q() + ' ' + protocol;
        if (!z11 && z12) {
            str = str + " (" + b0VarF.contentLength() + "-byte body)";
        }
        logger.logRequest(str);
        if (z11) {
            if (z12) {
                if (b0VarF.getContentType() != null) {
                    logger.logRequest("Content-Type: " + b0VarF.getContentType());
                }
                if (b0VarF.contentLength() != -1) {
                    logger.logRequest("Content-Length: " + b0VarF.contentLength());
                }
            }
            s sVarK = a0Var.k();
            int size = sVarK.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strI = sVarK.i(i10);
                if (!"Content-Type".equalsIgnoreCase(strI) && !"Content-Length".equalsIgnoreCase(strI)) {
                    logger.logRequest(strI + ": " + sVarK.v(i10));
                }
            }
            if (!z10 || !z12 || isContentLengthTooLarge(b0VarF.contentLength())) {
                logger.logRequest("--> END " + a0Var.m());
                return;
            }
            if (bodyEncoded(a0Var.k())) {
                logger.logRequest("--> END " + a0Var.m() + " (encoded body omitted)");
                return;
            }
            try {
                Buffer buffer = new Buffer();
                b0VarF.writeTo(buffer);
                Charset charsetF = UTF8;
                v contentType = b0VarF.getContentType();
                if (contentType != null) {
                    charsetF = contentType.f(charsetF);
                }
                logger.logRequest("");
                if (!isPlaintext(buffer)) {
                    logger.logRequest("--> END " + a0Var.m() + " (binary " + b0VarF.contentLength() + "-byte body omitted)");
                    return;
                }
                logger.logRequest(buffer.readString(charsetF));
                logger.logRequest("--> END " + a0Var.m() + " (" + b0VarF.contentLength() + "-byte body)");
            } catch (Exception unused) {
                logger.logRequest("--> END " + a0Var.m());
            }
        }
    }

    public static void logResponse(c0 c0Var, long j10, HttpLoggingInterceptor.Level level, HttpLoggingInterceptor.Logger logger) {
        boolean z10 = level == HttpLoggingInterceptor.Level.BODY;
        boolean z11 = z10 || level == HttpLoggingInterceptor.Level.HEADERS;
        d0 d0VarQ = c0Var.q();
        boolean z12 = d0VarQ != null;
        long contentLength = z12 ? d0VarQ.getContentLength() : 0L;
        String str = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<-- ");
        sb2.append(c0Var.x());
        sb2.append(' ');
        sb2.append(c0Var.getMessage());
        sb2.append(' ');
        sb2.append(c0Var.getRequest().q());
        sb2.append(" (");
        sb2.append(j10);
        sb2.append("ms");
        sb2.append(z11 ? "" : ", " + str + " body");
        sb2.append(')');
        logger.logResponse(c0Var, sb2.toString());
        if (z11) {
            s headers = c0Var.getHeaders();
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                logger.logResponse(c0Var, headers.i(i10) + ": " + headers.v(i10));
            }
            if (!z10 || !HttpHeaders.hasBody(c0Var) || !z12 || isContentLengthTooLarge(contentLength)) {
                logger.logResponse(c0Var, "<-- END HTTP");
                return;
            }
            if (bodyEncoded(c0Var.getHeaders())) {
                logger.logResponse(c0Var, "<-- END HTTP (encoded body omitted)");
                return;
            }
            try {
                BufferedSource source = d0VarQ.getSource();
                source.request(Long.MAX_VALUE);
                Buffer bufferField = source.getBufferField();
                Charset charsetF = UTF8;
                v f132480d = d0VarQ.getF132480d();
                if (f132480d != null) {
                    try {
                        charsetF = f132480d.f(charsetF);
                    } catch (UnsupportedCharsetException unused) {
                        logger.logResponse(c0Var, "");
                        logger.logResponse(c0Var, "Couldn't decode the response body; charset is likely malformed.");
                        logger.logResponse(c0Var, "<-- END HTTP");
                        return;
                    }
                }
                if (!isPlaintext(bufferField)) {
                    logger.logResponse(c0Var, "");
                    logger.logResponse(c0Var, "<-- END HTTP (binary " + bufferField.size() + "-byte body omitted)");
                    return;
                }
                if (contentLength != 0) {
                    logger.logResponse(c0Var, "");
                    logger.logResponse(c0Var, bufferField.clone().readString(charsetF));
                }
                logger.logResponse(c0Var, "<-- END HTTP (" + bufferField.size() + "-byte body)");
            } catch (Exception unused2) {
                logger.logResponse(c0Var, "<-- END HTTP");
            }
        }
    }
}

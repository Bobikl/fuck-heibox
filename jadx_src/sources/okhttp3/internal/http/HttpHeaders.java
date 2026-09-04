package okhttp3.internal.http;

import com.huawei.hms.framework.common.ContainerUtils;
import dl.d;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;
import kotlin.text.u;
import okhttp3.Cookie;
import okhttp3.c0;
import okhttp3.g;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okhttp3.l;
import okhttp3.s;
import okhttp3.t;
import okio.Buffer;
import okio.ByteString;
import xh.h;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "HttpHeaders")
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lokhttp3/s;", "", "headerName", "", "Lokhttp3/g;", "parseChallenges", "Lokio/Buffer;", "", "result", "Lkotlin/b2;", "readChallengeHeader", "", "skipCommasAndWhitespace", "", "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/l;", "Lokhttp3/t;", "url", "headers", "receiveHeaders", "Lokhttp3/c0;", "promisesBody", "response", "hasBody", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 4, 0})
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        QUOTED_STRING_DELIMITERS = companion.encodeUtf8("\"\\");
        TOKEN_DELIMITERS = companion.encodeUtf8("\t ,=");
    }

    @k(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @s0(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@d c0 response) {
        f0.p(response, "response");
        return promisesBody(response);
    }

    @d
    public static final List<g> parseChallenges(@d s parseChallenges, @d String headerName) {
        f0.p(parseChallenges, "$this$parseChallenges");
        f0.p(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (u.L1(headerName, parseChallenges.i(i10), true)) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(parseChallenges.v(i10)), arrayList);
                } catch (EOFException e10) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@d c0 promisesBody) {
        f0.p(promisesBody, "$this$promisesBody");
        if (f0.g(promisesBody.getRequest().m(), "HEAD")) {
            return false;
        }
        int iX = promisesBody.x();
        return (((iX >= 100 && iX < 200) || iX == 204 || iX == 304) && Util.headersContentLength(promisesBody) == -1 && !u.L1("chunked", c0.J(promisesBody, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0085 A[EDGE_INSN: B:59:0x0085->B:28:0x0085 BREAK  A[LOOP:2: B:22:0x0072->B:48:0x00c5], SYNTHETIC] */
    private static final void readChallengeHeader(Buffer buffer, List<g> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(buffer);
                    token2 = readToken(buffer);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(buffer);
                String token3 = readToken(buffer);
                if (token3 == null) {
                    if (buffer.exhausted()) {
                        list.add(new g(token2, (Map<String, String>) kotlin.collections.s0.z()));
                        return;
                    }
                    return;
                }
                byte b10 = (byte) 61;
                int iSkipAll = Util.skipAll(buffer, b10);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(buffer);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || buffer.exhausted())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = iSkipAll + Util.skipAll(buffer, b10);
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 == 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(buffer, (byte) 34)) {
                                token = readQuotedString(buffer);
                            } else {
                                token = readToken(buffer);
                            }
                            if (token != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        token3 = readToken(buffer);
                        if (skipCommasAndWhitespace(buffer)) {
                            break;
                        }
                        iSkipAll2 = Util.skipAll(buffer, b10);
                        if (iSkipAll2 == 0) {
                            break;
                        }
                        if (iSkipAll2 <= 1 || skipCommasAndWhitespace(buffer)) {
                            return;
                        }
                        if (startsWith(buffer, (byte) 34)) {
                            token = readQuotedString(buffer);
                        } else {
                            token = readToken(buffer);
                        }
                        if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                            return;
                        }
                        if (!skipCommasAndWhitespace(buffer) && !buffer.exhausted()) {
                            return;
                        } else {
                            token3 = null;
                        }
                    }
                    list.add(new g(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, token3 + u.h2(ContainerUtils.KEY_VALUE_DELIMITER, iSkipAll));
                    f0.o(mapSingletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
                    list.add(new g(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        byte b10 = (byte) 34;
        if (!(buffer.readByte() == b10)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == b10) {
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == jIndexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, jIndexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static final String readToken(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(@d l receiveHeaders, @d t url, @d s headers) {
        f0.p(receiveHeaders, "$this$receiveHeaders");
        f0.p(url, "url");
        f0.p(headers, "headers");
        if (receiveHeaders == l.f132606a) {
            return;
        }
        List<Cookie> listG = Cookie.INSTANCE.g(url, headers);
        if (listG.isEmpty()) {
            return;
        }
        receiveHeaders.b(url, listG);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) throws EOFException {
        boolean z10 = false;
        while (!buffer.exhausted()) {
            byte b10 = buffer.getByte(0L);
            if (b10 == 9 || b10 == 32) {
                buffer.readByte();
            } else {
                if (b10 != 44) {
                    break;
                }
                buffer.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean startsWith(Buffer buffer, byte b10) {
        return !buffer.exhausted() && buffer.getByte(0L) == b10;
    }
}

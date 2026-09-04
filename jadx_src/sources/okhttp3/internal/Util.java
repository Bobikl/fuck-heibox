package okhttp3.internal;

import androidx.constraintlayout.core.motion.utils.w;
import com.google.android.exoplayer2.text.ttml.d;
import com.max.xiaoheihe.module.mall.SteamStoreRedeemWalletCodeActivity;
import fi.u;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.s0;
import kotlin.io.b;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w0;
import kotlin.o;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import l5.a;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okhttp3.p;
import okhttp3.s;
import okhttp3.t;
import okhttp3.z;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import xh.e;
import xh.h;
import yh.l;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "Util")
@Metadata(bv = {}, d1 = {"\u0000´\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010&\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010'\u001a\u00020\b*\u00020\u0006\u001a)\u0010(\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0\f\"\u00020)¢\u0006\u0004\b(\u0010+\u001a\u0012\u0010/\u001a\u00020-*\u00020,2\u0006\u0010.\u001a\u00020-\u001a \u00103\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u000101\u001a\n\u00104\u001a\u00020\u0018*\u00020$\u001a\u0010\u00108\u001a\u000207*\b\u0012\u0004\u0012\u00020605\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020605*\u000207\u001a\u0012\u0010:\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010=\u001a\u00020<*\u00020;\u001a\u0015\u0010@\u001a\u00020\u0018*\u00020>2\u0006\u0010?\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010@\u001a\u00020\u0018*\u00020A2\u0006\u0010?\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010@\u001a\u00020\u0000*\u00020\u00182\u0006\u0010?\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010D\u001a\u00020\u0004*\u00020B2\u0006\u0010C\u001a\u00020\u0018\u001a\n\u0010E\u001a\u00020\u0018*\u00020,\u001a\u001a\u0010H\u001a\u00020\b*\u00020F2\u0006\u00100\u001a\u00020\u00182\u0006\u0010G\u001a\u000201\u001a\u001a\u0010J\u001a\u00020\b*\u00020F2\u0006\u0010I\u001a\u00020\u00182\u0006\u0010G\u001a\u000201\u001a\n\u0010L\u001a\u00020\u0006*\u00020K\u001a\u0012\u0010N\u001a\u00020\b*\u00020K2\u0006\u0010M\u001a\u00020,\u001a\u001a\u0010Q\u001a\u00020\u00042\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040OH\u0086\bø\u0001\u0000\u001a\"\u0010R\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040OH\u0086\bø\u0001\u0000\u001a\u0012\u0010H\u001a\u00020\u0018*\u00020S2\u0006\u0010T\u001a\u00020>\u001a\u0014\u0010U\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010W\u001a\u00020\u0000*\u00020V\u001a\u0012\u0010Y\u001a\u00020\u0000*\u00020\u00062\u0006\u0010X\u001a\u00020\u0000\u001a\u0014\u0010Z\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010X\u001a\u00020\u0018\u001a\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010[*\b\u0012\u0004\u0012\u00028\u000005\u001a/\u0010^\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010[2\u0012\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b^\u0010_\u001a.\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b\"\u0004\b\u0000\u0010`\"\u0004\b\u0001\u0010a*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010b\u001a\n\u0010e\u001a\u00020\u0004*\u00020d\u001a\n\u0010e\u001a\u00020\u0004*\u00020K\u001a\n\u0010e\u001a\u00020\u0004*\u00020f\u001a\u0012\u0010j\u001a\u00020\b*\u00020g2\u0006\u0010i\u001a\u00020h\u001a\n\u0010k\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010k\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010l\u001a\u00020\u0004*\u00020)H\u0086\b\u001a\r\u0010m\u001a\u00020\u0004*\u00020)H\u0086\b\u001a\r\u0010n\u001a\u00020\u0004*\u00020)H\u0086\b\u001a3\u0010s\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010[2\u0006\u0010o\u001a\u00020)2\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000p2\u0006\u0010r\u001a\u00020\u0006¢\u0006\u0004\bs\u0010t\u001a'\u0010x\u001a\u00020\u0004\"\u0004\b\u0000\u0010u*\b\u0012\u0004\u0012\u00028\u00000v2\u0006\u0010w\u001a\u00028\u0000H\u0000¢\u0006\u0004\bx\u0010y\u001a\r\u0010z\u001a\u00020\u0004*\u00020)H\u0080\b\u001a\r\u0010{\u001a\u00020\u0004*\u00020)H\u0080\b\u001a!\u0010\u0080\u0001\u001a\u00020\u007f*\u00060|j\u0002`}2\u0010\u0010~\u001a\f\u0012\b\u0012\u00060|j\u0002`}05\u001a@\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010[*\t\u0012\u0004\u0012\u00028\u00000\u0081\u00012\u001a\u0010\u0084\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0082\u0001¢\u0006\u0003\b\u0083\u0001H\u0086\bø\u0001\u0000\"\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0017\u0010\u0089\u0001\u001a\u0002078\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0017\u0010\u009a\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0017\u0010\u009c\u0001\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0017\u0010\u009e\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009d\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009f\u0001"}, d2 = {"", "arrayLength", w.c.R, "count", "Lkotlin/b2;", "checkOffsetAndCount", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/t;", "includeDefaultPort", "toHostHeader", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "trimSubstring", "delimiters", "delimiterOffset", "", d.f49783b0, "indexOfControlOrNonAscii", "canParseAsIpAddress", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "parseHexDigit", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/s;", "toHeaders", "toHeaderList", "canReuseConnectionFor", "Lokhttp3/p;", "Lokhttp3/p$c;", "asFactory", "", "mask", "and", "", "Lokio/BufferedSink;", "medium", "writeMedium", "readMedium", "Lokio/Source;", "timeUnit", "skipAll", a.f130839h0, "discard", "Ljava/net/Socket;", "peerName", "source", "isHealthy", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "threadName", "Lokio/Buffer;", "b", "indexOfNonWhitespace", "Lokhttp3/c0;", "headersContentLength", "defaultValue", "toLongOrDefault", "toNonNegativeInt", androidx.exifinterface.media.a.f23244d5, "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", androidx.exifinterface.media.a.X4, "", "toImmutableMap", "Ljava/io/Closeable;", "closeQuietly", "Ljava/net/ServerSocket;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "toHexString", SteamStoreRedeemWalletCodeActivity.N3, "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", androidx.exifinterface.media.a.S4, "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "", "Lkotlin/Function1;", "Lkotlin/t;", "predicate", "filterList", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/s;", "Lokhttp3/d0;", "EMPTY_RESPONSE", "Lokhttp3/d0;", "Lokhttp3/b0;", "EMPTY_REQUEST", "Lokhttp3/b0;", "Lokio/Options;", "UNICODE_BOMS", "Lokio/Options;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, k = 2, mv = {1, 4, 0})
public final class Util {

    @dl.d
    @e
    public static final byte[] EMPTY_BYTE_ARRAY;

    @dl.d
    @e
    public static final s EMPTY_HEADERS = s.INSTANCE.j(new String[0]);

    @dl.d
    @e
    public static final b0 EMPTY_REQUEST;

    @dl.d
    @e
    public static final d0 EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;

    @dl.d
    @e
    public static final TimeZone UTC;
    private static final Regex VERIFY_AS_IP_ADDRESS;

    @e
    public static final boolean assertionsEnabled;

    @dl.d
    @e
    public static final String okHttpName;

    @dl.d
    public static final String userAgent = "okhttp/4.9.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = d0.Companion.l(d0.INSTANCE, bArr, null, 1, null);
        EMPTY_REQUEST = b0.Companion.r(b0.INSTANCE, bArr, null, 0, 0, 7, null);
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        UNICODE_BOMS = companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        f0.m(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = z.class.getName();
        f0.o(name, "OkHttpClient::class.java.name");
        okHttpName = StringsKt__StringsKt.j4(StringsKt__StringsKt.d4(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(@dl.d List<E> addIfAbsent, E e10) {
        f0.p(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(e10)) {
            return;
        }
        addIfAbsent.add(e10);
    }

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int and(short s10, int i10) {
        return s10 & i10;
    }

    public static final long and(int i10, long j10) {
        return ((long) i10) & j10;
    }

    @dl.d
    public static final p.c asFactory(@dl.d final p asFactory) {
        f0.p(asFactory, "$this$asFactory");
        return new p.c() { // from class: okhttp3.internal.Util.asFactory.1
            @Override // okhttp3.p.c
            @dl.d
            public final p create(@dl.d okhttp3.e it) {
                f0.p(it, "it");
                return asFactory;
            }
        };
    }

    public static final void assertThreadDoesntHoldLock(@dl.d Object assertThreadDoesntHoldLock) {
        f0.p(assertThreadDoesntHoldLock, "$this$assertThreadDoesntHoldLock");
        if (assertionsEnabled && Thread.holdsLock(assertThreadDoesntHoldLock)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(assertThreadDoesntHoldLock);
            throw new AssertionError(sb2.toString());
        }
    }

    public static final void assertThreadHoldsLock(@dl.d Object assertThreadHoldsLock) {
        f0.p(assertThreadHoldsLock, "$this$assertThreadHoldsLock");
        if (!assertionsEnabled || Thread.holdsLock(assertThreadHoldsLock)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        f0.o(threadCurrentThread, "Thread.currentThread()");
        sb2.append(threadCurrentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(assertThreadHoldsLock);
        throw new AssertionError(sb2.toString());
    }

    public static final boolean canParseAsIpAddress(@dl.d String canParseAsIpAddress) {
        f0.p(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return VERIFY_AS_IP_ADDRESS.k(canParseAsIpAddress);
    }

    public static final boolean canReuseConnectionFor(@dl.d t canReuseConnectionFor, @dl.d t other) {
        f0.p(canReuseConnectionFor, "$this$canReuseConnectionFor");
        f0.p(other, "other");
        return f0.g(canReuseConnectionFor.getHost(), other.getHost()) && canReuseConnectionFor.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String() == other.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String() && f0.g(canReuseConnectionFor.getScheme(), other.getScheme());
    }

    public static final int checkDuration(@dl.d String name, long j10, @dl.e TimeUnit timeUnit) {
        f0.p(name, "name");
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis == 0 && j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@dl.d Closeable closeQuietly) {
        f0.p(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@dl.d ServerSocket closeQuietly) {
        f0.p(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@dl.d Socket closeQuietly) {
        f0.p(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    @dl.d
    public static final String[] concat(@dl.d String[] concat, @dl.d String value) {
        f0.p(concat, "$this$concat");
        f0.p(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(concat, concat.length + 1);
        f0.o(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) objArrCopyOf;
        strArr[ArraysKt___ArraysKt.Xe(strArr)] = value;
        return strArr;
    }

    public static final int delimiterOffset(@dl.d String delimiterOffset, char c10, int i10, int i11) {
        f0.p(delimiterOffset, "$this$delimiterOffset");
        while (i10 < i11) {
            if (delimiterOffset.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int delimiterOffset(@dl.d String delimiterOffset, @dl.d String delimiters, int i10, int i11) {
        f0.p(delimiterOffset, "$this$delimiterOffset");
        f0.p(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt__StringsKt.V2(delimiters, delimiterOffset.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, c10, i10, i11);
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, str2, i10, i11);
    }

    public static final boolean discard(@dl.d Source discard, int i10, @dl.d TimeUnit timeUnit) {
        f0.p(discard, "$this$discard");
        f0.p(timeUnit, "timeUnit");
        try {
            return skipAll(discard, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @dl.d
    public static final <T> List<T> filterList(@dl.d Iterable<? extends T> filterList, @dl.d l<? super T, Boolean> predicate) {
        f0.p(filterList, "$this$filterList");
        f0.p(predicate, "predicate");
        List<T> listE = CollectionsKt__CollectionsKt.E();
        for (T t10 : filterList) {
            if (predicate.invoke(t10).booleanValue()) {
                if (listE.isEmpty()) {
                    listE = new ArrayList<>();
                }
                w0.g(listE).add(t10);
            }
        }
        return listE;
    }

    @dl.d
    public static final String format(@dl.d String format, @dl.d Object... args) {
        f0.p(format, "format");
        f0.p(args, "args");
        v0 v0Var = v0.f124986a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        f0.o(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }

    public static final boolean hasIntersection(@dl.d String[] hasIntersection, @dl.e String[] strArr, @dl.d Comparator<? super String> comparator) {
        f0.p(hasIntersection, "$this$hasIntersection");
        f0.p(comparator, "comparator");
        if (!(hasIntersection.length == 0) && strArr != null) {
            if (!(strArr.length == 0)) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@dl.d c0 headersContentLength) {
        f0.p(headersContentLength, "$this$headersContentLength");
        String strE = headersContentLength.getHeaders().e("Content-Length");
        if (strE != null) {
            return toLongOrDefault(strE, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(@dl.d yh.a<b2> block) {
        f0.p(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @dl.d
    public static final <T> List<T> immutableListOf(@dl.d T... elements) {
        f0.p(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt__CollectionsKt.L(Arrays.copyOf(objArr, objArr.length)));
        f0.o(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int indexOf(@dl.d String[] indexOf, @dl.d String value, @dl.d Comparator<String> comparator) {
        f0.p(indexOf, "$this$indexOf");
        f0.p(value, "value");
        f0.p(comparator, "comparator");
        int length = indexOf.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(indexOf[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@dl.d String indexOfControlOrNonAscii) {
        f0.p(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = indexOfControlOrNonAscii.charAt(i10);
            if (f0.t(cCharAt, 31) <= 0 || f0.t(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@dl.d String indexOfFirstNonAsciiWhitespace, int i10, int i11) {
        f0.p(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char cCharAt = indexOfFirstNonAsciiWhitespace.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfLastNonAsciiWhitespace(@dl.d String indexOfLastNonAsciiWhitespace, int i10, int i11) {
        f0.p(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char cCharAt = indexOfLastNonAsciiWhitespace.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfNonWhitespace(@dl.d String indexOfNonWhitespace, int i10) {
        f0.p(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i10 < length) {
            char cCharAt = indexOfNonWhitespace.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return indexOfNonWhitespace.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return indexOfNonWhitespace(str, i10);
    }

    @dl.d
    public static final String[] intersect(@dl.d String[] intersect, @dl.d String[] other, @dl.d Comparator<? super String> comparator) {
        f0.p(intersect, "$this$intersect");
        f0.p(other, "other");
        f0.p(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean isCivilized(@dl.d FileSystem isCivilized, @dl.d File file) throws IOException {
        f0.p(isCivilized, "$this$isCivilized");
        f0.p(file, "file");
        Sink sink = isCivilized.sink(file);
        try {
            try {
                isCivilized.delete(file);
                b.a(sink, null);
                return true;
            } catch (IOException unused) {
                b2 b2Var = b2.f124493a;
                b.a(sink, null);
                isCivilized.delete(file);
                return false;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(sink, th2);
                throw th3;
            }
        }
    }

    public static final boolean isHealthy(@dl.d Socket isHealthy, @dl.d BufferedSource source) {
        f0.p(isHealthy, "$this$isHealthy");
        f0.p(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                isHealthy.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void notify(@dl.d Object notify) {
        f0.p(notify, "$this$notify");
        notify.notify();
    }

    public static final void notifyAll(@dl.d Object notifyAll) {
        f0.p(notifyAll, "$this$notifyAll");
        notifyAll.notifyAll();
    }

    public static final int parseHexDigit(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    @dl.d
    public static final String peerName(@dl.d Socket peerName) {
        f0.p(peerName, "$this$peerName");
        SocketAddress remoteSocketAddress = peerName.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        f0.o(hostName, "address.hostName");
        return hostName;
    }

    @dl.d
    public static final Charset readBomAsCharset(@dl.d BufferedSource readBomAsCharset, @dl.d Charset charset) throws IOException {
        f0.p(readBomAsCharset, "$this$readBomAsCharset");
        f0.p(charset, "default");
        int iSelect = readBomAsCharset.select(UNICODE_BOMS);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            f0.o(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            f0.o(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            f0.o(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return kotlin.text.d.f128565a.b();
        }
        if (iSelect == 4) {
            return kotlin.text.d.f128565a.c();
        }
        throw new AssertionError();
    }

    @dl.e
    public static final <T> T readFieldOrNull(@dl.d Object instance, @dl.d Class<T> fieldType, @dl.d String fieldName) throws IllegalAccessException {
        Object fieldOrNull;
        f0.p(instance, "instance");
        f0.p(fieldType, "fieldType");
        f0.p(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            T tCast = null;
            if (!(!f0.g(superclass, Object.class))) {
                if (!(!f0.g(fieldName, "delegate")) || (fieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, fieldType, fieldName);
            }
            try {
                Field field = superclass.getDeclaredField(fieldName);
                f0.o(field, "field");
                field.setAccessible(true);
                Object obj = field.get(instance);
                if (fieldType.isInstance(obj)) {
                    tCast = fieldType.cast(obj);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                f0.o(superclass, "c.superclass");
            }
        }
    }

    public static final int readMedium(@dl.d BufferedSource readMedium) throws IOException {
        f0.p(readMedium, "$this$readMedium");
        return and(readMedium.readByte(), 255) | (and(readMedium.readByte(), 255) << 16) | (and(readMedium.readByte(), 255) << 8);
    }

    public static final int skipAll(@dl.d Buffer skipAll, byte b10) throws EOFException {
        f0.p(skipAll, "$this$skipAll");
        int i10 = 0;
        while (!skipAll.exhausted() && skipAll.getByte(0L) == b10) {
            i10++;
            skipAll.readByte();
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b A[PHI: r12
  0x005b: PHI (r12v6 boolean) = (r12v5 boolean), (r12v10 boolean) binds: [B:23:0x007d, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public static final boolean skipAll(@dl.d Source skipAll, int i10, @dl.d TimeUnit timeUnit) throws IOException {
        boolean z10;
        f0.p(skipAll, "$this$skipAll");
        f0.p(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = skipAll.getThis$0().getHasDeadline() ? skipAll.getThis$0().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        skipAll.getThis$0().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (skipAll.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            z10 = true;
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.getThis$0().clearDeadline();
            } else {
                skipAll.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
        } catch (InterruptedIOException unused) {
            z10 = false;
            if (jDeadlineNanoTime != Long.MAX_VALUE) {
                skipAll.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
        } catch (Throwable th2) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.getThis$0().clearDeadline();
            } else {
                skipAll.getThis$0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th2;
        }
        return z10;
    }

    @dl.d
    public static final ThreadFactory threadFactory(@dl.d final String name, final boolean z10) {
        f0.p(name, "name");
        return new ThreadFactory() { // from class: okhttp3.internal.Util.threadFactory.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, name);
                thread.setDaemon(z10);
                return thread;
            }
        };
    }

    public static final void threadName(@dl.d String name, @dl.d yh.a<b2> block) {
        f0.p(name, "name");
        f0.p(block, "block");
        Thread currentThread = Thread.currentThread();
        f0.o(currentThread, "currentThread");
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            currentThread.setName(name2);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    @dl.d
    public static final List<Header> toHeaderList(@dl.d s toHeaderList) {
        f0.p(toHeaderList, "$this$toHeaderList");
        fi.l lVarW1 = u.W1(0, toHeaderList.size());
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(lVarW1, 10));
        Iterator<Integer> it = lVarW1.iterator();
        while (it.hasNext()) {
            int iNextInt = ((k0) it).nextInt();
            arrayList.add(new Header(toHeaderList.i(iNextInt), toHeaderList.v(iNextInt)));
        }
        return arrayList;
    }

    @dl.d
    public static final s toHeaders(@dl.d List<Header> toHeaders) {
        f0.p(toHeaders, "$this$toHeaders");
        s.a aVar = new s.a();
        for (Header header : toHeaders) {
            aVar.g(header.getName().utf8(), header.getValue().utf8());
        }
        return aVar.i();
    }

    @dl.d
    public static final String toHexString(int i10) {
        String hexString = Integer.toHexString(i10);
        f0.o(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    @dl.d
    public static final String toHexString(long j10) {
        String hexString = Long.toHexString(j10);
        f0.o(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    @dl.d
    public static final String toHostHeader(@dl.d t toHostHeader, boolean z10) {
        String host;
        f0.p(toHostHeader, "$this$toHostHeader");
        if (StringsKt__StringsKt.W2(toHostHeader.getHost(), ":", false, 2, null)) {
            host = '[' + toHostHeader.getHost() + ']';
        } else {
            host = toHostHeader.getHost();
        }
        if (!z10 && toHostHeader.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String() == t.INSTANCE.g(toHostHeader.getScheme())) {
            return host;
        }
        return host + ':' + toHostHeader.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String();
    }

    public static /* synthetic */ String toHostHeader$default(t tVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toHostHeader(tVar, z10);
    }

    @dl.d
    public static final <T> List<T> toImmutableList(@dl.d List<? extends T> toImmutableList) {
        f0.p(toImmutableList, "$this$toImmutableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.T5(toImmutableList));
        f0.o(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    @dl.d
    public static final <K, V> Map<K, V> toImmutableMap(@dl.d Map<K, ? extends V> toImmutableMap) {
        f0.p(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            return s0.z();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        f0.o(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(@dl.d String toLongOrDefault, long j10) {
        f0.p(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int toNonNegativeInt(@dl.e String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    @dl.d
    public static final String trimSubstring(@dl.d String trimSubstring, int i10, int i11) {
        f0.p(trimSubstring, "$this$trimSubstring");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(trimSubstring, i10, i11);
        String strSubstring = trimSubstring.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(trimSubstring, iIndexOfFirstNonAsciiWhitespace, i11));
        f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return trimSubstring(str, i10, i11);
    }

    public static final void wait(@dl.d Object wait) throws InterruptedException {
        f0.p(wait, "$this$wait");
        wait.wait();
    }

    @dl.d
    public static final Throwable withSuppressed(@dl.d Exception withSuppressed, @dl.d List<? extends Exception> suppressed) throws IllegalAccessException, InvocationTargetException {
        f0.p(withSuppressed, "$this$withSuppressed");
        f0.p(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            o.a(withSuppressed, it.next());
        }
        return withSuppressed;
    }

    public static final void writeMedium(@dl.d BufferedSink writeMedium, int i10) throws IOException {
        f0.p(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i10 >>> 16) & 255);
        writeMedium.writeByte((i10 >>> 8) & 255);
        writeMedium.writeByte(i10 & 255);
    }
}

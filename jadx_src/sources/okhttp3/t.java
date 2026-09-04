package okhttp3;

import anet.channel.util.HttpConstant;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.ak;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.s0;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import okio.Utf8;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b0\u0018\u0000 L2\u00020\u0001:\u00023#Bc\b\u0000\u0012\u0006\u0010:\u001a\u00020\b\u0012\u0006\u0010<\u001a\u00020\b\u0012\u0006\u0010>\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010B\u001a\u00020\r\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0010\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b\u0012\b\u0010H\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010I\u001a\u00020\b¢\u0006\u0004\b^\u0010_J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\bJ\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u0004\u0018\u00010\bJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\rH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0007¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\bH\u0007¢\u0006\u0004\b)\u0010 J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0007¢\u0006\u0004\b,\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b-\u0010 J\u0011\u0010.\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u00020\rH\u0007¢\u0006\u0004\b/\u0010'J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\b00H\u0007¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b3\u0010 J\u0011\u00104\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b4\u0010 R\u0017\u00107\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b5\u00106R\u0017\u0010:\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b9\u0010 R\u0017\u0010<\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b;\u0010 R\u0017\u0010>\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b=\u0010 R\u0017\u0010@\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b?\u0010 R\u0017\u0010B\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\bA\u0010'R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0007¢\u0006\f\n\u0004\b4\u0010C\u001a\u0004\bD\u0010+R\u001e\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010CR\u0019\u0010H\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b$\u00108\u001a\u0004\bG\u0010 R\u0014\u0010I\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00108R\u0011\u0010K\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\bJ\u0010 R\u0011\u0010M\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\bL\u0010 R\u0011\u0010O\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bN\u0010'R\u0011\u0010Q\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\bP\u0010 R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8G¢\u0006\u0006\u001a\u0004\bR\u0010+R\u0013\u0010U\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\bT\u0010 R\u0013\u0010W\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\bV\u0010 R\u0011\u0010Y\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bX\u0010'R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\b008G¢\u0006\u0006\u001a\u0004\bZ\u00102R\u0013\u0010]\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\\\u0010 ¨\u0006`"}, d2 = {"Lokhttp3/t;", "", "Ljava/net/URL;", "a0", "()Ljava/net/URL;", "Ljava/net/URI;", "Z", "()Ljava/net/URI;", "", "name", "P", "", androidx.exifinterface.media.a.f23244d5, "", UCropPlusActivity.ARG_INDEX, "Q", androidx.exifinterface.media.a.R4, androidx.exifinterface.media.a.X4, "link", androidx.exifinterface.media.a.T4, "Lokhttp3/t$a;", "H", "I", "other", "", "equals", "hashCode", "toString", "Y", "r", "q", "p", "()Ljava/lang/String;", "f", ak.aB, "b", "i", RXScreenCaptureService.KEY_HEIGHT, "l", "()I", "k", ak.aF, "d", "()Ljava/util/List;", "j", "e", "m", "o", "", "n", "()Ljava/util/Set;", ak.av, "g", "G", "()Z", "isHttps", "Ljava/lang/String;", "X", "scheme", "b0", g0.a.f118919c, "K", g0.a.f118920d, "F", "host", "N", HeyboxMicFragment.f93763y, "Ljava/util/List;", "L", "pathSegments", "queryNamesAndValues", "B", "fragment", "url", androidx.exifinterface.media.a.W4, "encodedUsername", RXScreenCaptureService.KEY_WIDTH, "encodedPassword", "M", "pathSize", "x", "encodedPath", "y", "encodedPathSegments", ak.aD, "encodedQuery", "O", "query", "U", "querySize", "R", "queryParameterNames", "v", "encodedFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f132640l = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final String f132641m = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final String f132642n = " \"<>^`{}|/\\?#";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f132643o = "[]";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f132644p = " \"'<>#";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f132645q = " \"'<>#&=";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f132646r = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f132647s = "\\^`{|}";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final String f132648t = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final String f132649u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f132650v = " \"#<>\\^`{|}";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isHttps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String scheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String username;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String password;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String host;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int port;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<String> pathSegments;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<String> queryNamesAndValues;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String fragment;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char[] f132639k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: compiled from: HttpUrl.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 B2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\bd\u0010eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J0\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0002J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u0016\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0004J\u0016\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0002J\u000e\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004J\u0010\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0010\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0004J\u0018\u00107\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004J\u0018\u0010:\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004J\u0018\u0010;\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004J\u0018\u0010<\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004J\u000e\u0010=\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u000e\u0010>\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0004J\u0010\u0010@\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010B\u001a\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010\u0004J\u000f\u0010C\u001a\u00020\u0000H\u0000¢\u0006\u0004\bC\u0010DJ\u0006\u0010F\u001a\u00020EJ\b\u0010G\u001a\u00020\u0004H\u0016J!\u0010I\u001a\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010E2\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\bI\u0010JR$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010K\u001a\u0004\bP\u0010M\"\u0004\bQ\u0010OR\"\u0010\u001e\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010K\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR\"\u0010\"\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010>\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\b\\\u0010]R,\u0010a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010[\u001a\u0004\b^\u0010]\"\u0004\b_\u0010`R$\u0010A\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010K\u001a\u0004\bb\u0010M\"\u0004\bc\u0010O¨\u0006f"}, d2 = {"Lokhttp3/t$a;", "", "", "i", "", "pathSegments", "", "alreadyEncoded", "f", "canonicalName", "Lkotlin/b2;", "H", "input", "startPos", "limit", "L", "pos", "addTrailingSlash", androidx.exifinterface.media.a.S4, "y", ak.aD, "C", "scheme", "M", g0.a.f118919c, "Y", "encodedUsername", "n", g0.a.f118920d, "B", "encodedPassword", "k", "host", "x", HeyboxMicFragment.f93763y, "D", "pathSegment", "d", "e", "encodedPathSegment", ak.av, "encodedPathSegments", "b", UCropPlusActivity.ARG_INDEX, "U", "P", "K", "encodedPath", "l", "query", "F", "encodedQuery", "m", "name", "value", "g", "encodedName", "encodedValue", ak.aF, androidx.exifinterface.media.a.T4, "R", "J", "I", "fragment", "o", "encodedFragment", "j", "G", "()Lokhttp3/t$a;", "Lokhttp3/t;", RXScreenCaptureService.KEY_HEIGHT, "toString", com.google.android.exoplayer2.text.ttml.d.X, androidx.exifinterface.media.a.W4, "(Lokhttp3/t;Ljava/lang/String;)Lokhttp3/t$a;", "Ljava/lang/String;", RXScreenCaptureService.KEY_WIDTH, "()Ljava/lang/String;", "X", "(Ljava/lang/String;)V", "t", androidx.exifinterface.media.a.R4, "q", "O", ak.aG, androidx.exifinterface.media.a.f23244d5, "v", "()I", androidx.exifinterface.media.a.X4, "(I)V", "", "Ljava/util/List;", "r", "()Ljava/util/List;", ak.aB, "Q", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "p", "N", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        public static final String f132662i = "Invalid URL host";

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private String scheme;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private String host;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<String> encodedPathSegments;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private List<String> encodedQueryNamesAndValues;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private String encodedFragment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private String encodedUsername = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private String encodedPassword = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int port = -1;

        /* JADX INFO: renamed from: okhttp3.t$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: HttpUrl.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/t$a$a;", "", "", "input", "", "pos", "limit", "g", RXScreenCaptureService.KEY_HEIGHT, "f", "e", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String input, int pos, int limit) {
                try {
                    int i10 = Integer.parseInt(Companion.f(t.INSTANCE, input, pos, limit, "", false, false, false, false, null, bb.c.b.O1, null));
                    if (1 <= i10 && 65535 >= i10) {
                        return i10;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == ':') {
                        return pos;
                    }
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos >= limit) {
                                break;
                            }
                        } while (input.charAt(pos) != ']');
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((kotlin.jvm.internal.f0.t(cCharAt, 97) < 0 || kotlin.jvm.internal.f0.t(cCharAt, 122) > 0) && (kotlin.jvm.internal.f0.t(cCharAt, 65) < 0 || kotlin.jvm.internal.f0.t(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char cCharAt2 = input.charAt(pos);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final void C() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void E(String str, int i10, int i11, boolean z10, boolean z11) {
            String strF = Companion.f(t.INSTANCE, str, i10, i11, t.f132642n, z11, false, false, false, null, 240, null);
            if (y(strF)) {
                return;
            }
            if (z(strF)) {
                C();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strF);
            } else {
                this.encodedPathSegments.add(strF);
            }
            if (z10) {
                this.encodedPathSegments.add("");
            }
        }

        private final void H(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.f0.m(list);
            fi.j jVarB1 = fi.u.B1(fi.u.k0(list.size() - 2, 0), 2);
            int iH = jVarB1.h();
            int i10 = jVarB1.i();
            int iJ = jVarB1.j();
            if (iJ >= 0) {
                if (iH > i10) {
                    return;
                }
            } else if (iH < i10) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                kotlin.jvm.internal.f0.m(list2);
                if (kotlin.jvm.internal.f0.g(str, list2.get(iH))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.f0.m(list3);
                    list3.remove(iH + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.f0.m(list4);
                    list4.remove(iH);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.f0.m(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (iH == i10) {
                    return;
                } else {
                    iH += iJ;
                }
            }
        }

        private final void L(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i10++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                if (i12 >= i11) {
                    return;
                }
                i10 = Util.delimiterOffset(str, "/\\", i12, i11);
                boolean z10 = i10 < i11;
                E(str, i12, i10, z10, true);
                if (z10) {
                    i10++;
                }
            }
        }

        private final a f(String pathSegments, boolean alreadyEncoded) {
            int i10 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(pathSegments, "/\\", i10, pathSegments.length());
                E(pathSegments, i10, iDelimiterOffset, iDelimiterOffset < pathSegments.length(), alreadyEncoded);
                i10 = iDelimiterOffset + 1;
            } while (i10 <= pathSegments.length());
            return this;
        }

        private final int i() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = t.INSTANCE;
            String str = this.scheme;
            kotlin.jvm.internal.f0.m(str);
            return companion.g(str);
        }

        private final boolean y(String input) {
            return kotlin.jvm.internal.f0.g(input, ".") || kotlin.text.u.L1(input, "%2e", true);
        }

        private final boolean z(String input) {
            return kotlin.jvm.internal.f0.g(input, "..") || kotlin.text.u.L1(input, "%2e.", true) || kotlin.text.u.L1(input, ".%2e", true) || kotlin.text.u.L1(input, "%2e%2e", true);
        }

        @dl.d
        public final a A(@dl.e t base, @dl.d String input) {
            int iDelimiterOffset;
            int i10;
            int i11;
            boolean z10;
            String str;
            int i12;
            boolean z11;
            boolean z12;
            kotlin.jvm.internal.f0.p(input, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int iG = companion.g(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            byte b10 = -1;
            boolean z13 = true;
            if (iG != -1) {
                if (kotlin.text.u.s2(input, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!kotlin.text.u.s2(input, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (base == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.scheme = base.getScheme();
            }
            int iH = companion.h(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b11 = Utf8.REPLACEMENT_BYTE;
            byte b12 = 35;
            if (iH >= 2 || base == null || (!kotlin.jvm.internal.f0.g(base.getScheme(), this.scheme))) {
                int i13 = iIndexOfFirstNonAsciiWhitespace$default + iH;
                boolean z14 = false;
                boolean z15 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(input, "@/\\?#", i13, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input.charAt(iDelimiterOffset) : b10;
                    if (bCharAt == b10 || bCharAt == b12 || bCharAt == 47 || bCharAt == 92 || bCharAt == b11) {
                        break;
                    }
                    if (bCharAt != 64) {
                        z10 = z13;
                        str = str2;
                        iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
                    } else {
                        if (z14) {
                            z10 = z13;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            str = str2;
                            i12 = iDelimiterOffset;
                            sb3.append(Companion.f(t.INSTANCE, input, i13, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb3.toString();
                            z11 = z15;
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(input, ':', i13, iDelimiterOffset);
                            Companion companion2 = t.INSTANCE;
                            z10 = z13;
                            String str3 = str2;
                            String strF = Companion.f(companion2, input, i13, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z15) {
                                strF = this.encodedUsername + "%40" + strF;
                            }
                            this.encodedUsername = strF;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                this.encodedPassword = Companion.f(companion2, input, iDelimiterOffset2 + 1, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = z10;
                            } else {
                                z12 = z14;
                            }
                            z14 = z12;
                            str = str3;
                            z11 = z10;
                            i12 = iDelimiterOffset;
                        }
                        i13 = i12 + 1;
                        z15 = z11;
                    }
                    str2 = str;
                    z13 = z10;
                    iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
                    b12 = 35;
                    b11 = Utf8.REPLACEMENT_BYTE;
                    b10 = -1;
                }
                boolean z16 = z13;
                String str4 = str2;
                i10 = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = INSTANCE;
                int iF = companion3.f(input, i13, iDelimiterOffset);
                int i14 = iF + 1;
                if (i14 < iDelimiterOffset) {
                    i11 = i13;
                    this.host = HostnamesKt.toCanonicalHost(Companion.n(t.INSTANCE, input, i13, iF, false, 4, null));
                    int iE = companion3.e(input, i14, iDelimiterOffset);
                    this.port = iE;
                    if (!(iE != -1 ? z16 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i14, iDelimiterOffset);
                        kotlin.jvm.internal.f0.o(strSubstring2, str4);
                        sb4.append(strSubstring2);
                        sb4.append(kotlin.text.y.f128593b);
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i11 = i13;
                    Companion companion4 = t.INSTANCE;
                    this.host = HostnamesKt.toCanonicalHost(Companion.n(companion4, input, i11, iF, false, 4, null));
                    String str5 = this.scheme;
                    kotlin.jvm.internal.f0.m(str5);
                    this.port = companion4.g(str5);
                }
                if (!(this.host != null ? z16 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i11, iF);
                    kotlin.jvm.internal.f0.o(strSubstring3, str4);
                    sb5.append(strSubstring3);
                    sb5.append(kotlin.text.y.f128593b);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = base.A();
                this.encodedPassword = base.w();
                this.host = base.getHost();
                this.port = base.getPort();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.y());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    m(base.z());
                }
                i10 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i15 = i10;
            int iDelimiterOffset3 = Util.delimiterOffset(input, "?#", iIndexOfFirstNonAsciiWhitespace$default, i15);
            L(input, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i15 && input.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(input, '#', iDelimiterOffset3, i15);
                Companion companion5 = t.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.p(Companion.f(companion5, input, iDelimiterOffset3 + 1, iDelimiterOffset4, t.f132644p, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i15 && input.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.f(t.INSTANCE, input, iDelimiterOffset3 + 1, i15, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @dl.d
        public final a B(@dl.d String password) {
            kotlin.jvm.internal.f0.p(password, "password");
            this.encodedPassword = Companion.f(t.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @dl.d
        public final a D(int port) {
            if (1 <= port && 65535 >= port) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + port).toString());
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        @dl.d
        public final a F(@dl.e String query) {
            List<String> listP;
            if (query != null) {
                Companion companion = t.INSTANCE;
                String strF = Companion.f(companion, query, 0, 0, t.f132644p, false, false, true, false, null, 219, null);
                if (strF != null) {
                    listP = companion.p(strF);
                } else {
                    listP = null;
                }
            } else {
                listP = null;
            }
            this.encodedQueryNamesAndValues = listP;
            return this;
        }

        @dl.d
        public final a G() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").m(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.encodedPathSegments;
                list.set(i10, Companion.f(t.INSTANCE, list.get(i10), 0, 0, t.f132643o, true, true, false, false, null, bb.c.b.f30941t1, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? Companion.f(t.INSTANCE, str2, 0, 0, t.f132647s, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.f(t.INSTANCE, str3, 0, 0, t.f132650v, true, true, false, true, null, 163, null) : null;
            return this;
        }

        @dl.d
        public final a I(@dl.d String encodedName) {
            kotlin.jvm.internal.f0.p(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            H(Companion.f(t.INSTANCE, encodedName, 0, 0, t.f132645q, true, false, true, false, null, 211, null));
            return this;
        }

        @dl.d
        public final a J(@dl.d String name) {
            kotlin.jvm.internal.f0.p(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            H(Companion.f(t.INSTANCE, name, 0, 0, t.f132646r, false, false, true, false, null, 219, null));
            return this;
        }

        @dl.d
        public final a K(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @dl.d
        public final a M(@dl.d String scheme) {
            kotlin.jvm.internal.f0.p(scheme, "scheme");
            if (kotlin.text.u.L1(scheme, "http", true)) {
                this.scheme = "http";
            } else {
                if (!kotlin.text.u.L1(scheme, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = "https";
            }
            return this;
        }

        public final void N(@dl.e String str) {
            this.encodedFragment = str;
        }

        public final void O(@dl.d String str) {
            kotlin.jvm.internal.f0.p(str, "<set-?>");
            this.encodedPassword = str;
        }

        @dl.d
        public final a P(int index, @dl.d String encodedPathSegment) {
            kotlin.jvm.internal.f0.p(encodedPathSegment, "encodedPathSegment");
            String strF = Companion.f(t.INSTANCE, encodedPathSegment, 0, 0, t.f132642n, true, false, false, false, null, bb.c.b.J1, null);
            this.encodedPathSegments.set(index, strF);
            if ((y(strF) || z(strF)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void Q(@dl.e List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @dl.d
        public final a R(@dl.d String encodedName, @dl.e String encodedValue) {
            kotlin.jvm.internal.f0.p(encodedName, "encodedName");
            I(encodedName);
            c(encodedName, encodedValue);
            return this;
        }

        public final void S(@dl.d String str) {
            kotlin.jvm.internal.f0.p(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void T(@dl.e String str) {
            this.host = str;
        }

        @dl.d
        public final a U(int index, @dl.d String pathSegment) {
            kotlin.jvm.internal.f0.p(pathSegment, "pathSegment");
            String strF = Companion.f(t.INSTANCE, pathSegment, 0, 0, t.f132642n, false, false, false, false, null, 251, null);
            if ((y(strF) || z(strF)) ? false : true) {
                this.encodedPathSegments.set(index, strF);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void V(int i10) {
            this.port = i10;
        }

        @dl.d
        public final a W(@dl.d String name, @dl.e String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            J(name);
            g(name, value);
            return this;
        }

        public final void X(@dl.e String str) {
            this.scheme = str;
        }

        @dl.d
        public final a Y(@dl.d String username) {
            kotlin.jvm.internal.f0.p(username, "username");
            this.encodedUsername = Companion.f(t.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @dl.d
        public final a a(@dl.d String encodedPathSegment) {
            kotlin.jvm.internal.f0.p(encodedPathSegment, "encodedPathSegment");
            E(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @dl.d
        public final a b(@dl.d String encodedPathSegments) {
            kotlin.jvm.internal.f0.p(encodedPathSegments, "encodedPathSegments");
            return f(encodedPathSegments, true);
        }

        @dl.d
        public final a c(@dl.d String encodedName, @dl.e String encodedValue) {
            kotlin.jvm.internal.f0.p(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.f0.m(list);
            Companion companion = t.INSTANCE;
            list.add(Companion.f(companion, encodedName, 0, 0, t.f132645q, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.f0.m(list2);
            list2.add(encodedValue != null ? Companion.f(companion, encodedValue, 0, 0, t.f132645q, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @dl.d
        public final a d(@dl.d String pathSegment) {
            kotlin.jvm.internal.f0.p(pathSegment, "pathSegment");
            E(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @dl.d
        public final a e(@dl.d String pathSegments) {
            kotlin.jvm.internal.f0.p(pathSegments, "pathSegments");
            return f(pathSegments, false);
        }

        @dl.d
        public final a g(@dl.d String name, @dl.e String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.f0.m(list);
            Companion companion = t.INSTANCE;
            list.add(Companion.f(companion, name, 0, 0, t.f132646r, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.f0.m(list2);
            list2.add(value != null ? Companion.f(companion, value, 0, 0, t.f132646r, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @dl.d
        public final t h() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = t.INSTANCE;
            String strN = Companion.n(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strN2 = Companion.n(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i10 = i();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.n(t.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                arrayList = new ArrayList(kotlin.collections.t.Y(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? Companion.n(t.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new t(str, strN, strN2, str2, i10, arrayList2, arrayList, str4 != null ? Companion.n(t.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        @dl.d
        public final a j(@dl.e String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? Companion.f(t.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, bb.c.b.f31028x0, null) : null;
            return this;
        }

        @dl.d
        public final a k(@dl.d String encodedPassword) {
            kotlin.jvm.internal.f0.p(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.f(t.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, bb.c.b.J1, null);
            return this;
        }

        @dl.d
        public final a l(@dl.d String encodedPath) {
            kotlin.jvm.internal.f0.p(encodedPath, "encodedPath");
            if (kotlin.text.u.v2(encodedPath, "/", false, 2, null)) {
                L(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        @dl.d
        public final a m(@dl.e String encodedQuery) {
            List<String> listP;
            if (encodedQuery != null) {
                Companion companion = t.INSTANCE;
                String strF = Companion.f(companion, encodedQuery, 0, 0, t.f132644p, true, false, true, false, null, 211, null);
                if (strF != null) {
                    listP = companion.p(strF);
                } else {
                    listP = null;
                }
            } else {
                listP = null;
            }
            this.encodedQueryNamesAndValues = listP;
            return this;
        }

        @dl.d
        public final a n(@dl.d String encodedUsername) {
            kotlin.jvm.internal.f0.p(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.f(t.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, bb.c.b.J1, null);
            return this;
        }

        @dl.d
        public final a o(@dl.e String fragment) {
            this.encodedFragment = fragment != null ? Companion.f(t.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @dl.e
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        @dl.d
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        @dl.d
        public final List<String> r() {
            return this.encodedPathSegments;
        }

        @dl.e
        public final List<String> s() {
            return this.encodedQueryNamesAndValues;
        }

        @dl.d
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0035  */
        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x0046  */
        /* JADX WARN: Code duplicated, block: B:38:0x0093  */
        @dl.d
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append(HttpConstant.SCHEME_SPLIT);
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            } else {
                if (this.encodedPassword.length() > 0) {
                    sb2.append(this.encodedUsername);
                    if (this.encodedPassword.length() > 0) {
                        sb2.append(':');
                        sb2.append(this.encodedPassword);
                    }
                    sb2.append('@');
                }
            }
            String str2 = this.host;
            if (str2 != null) {
                kotlin.jvm.internal.f0.m(str2);
                if (StringsKt__StringsKt.V2(str2, ':', false, 2, null)) {
                    sb2.append('[');
                    sb2.append(this.host);
                    sb2.append(']');
                } else {
                    sb2.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int i10 = i();
                String str3 = this.scheme;
                if (str3 != null) {
                    Companion companion = t.INSTANCE;
                    kotlin.jvm.internal.f0.m(str3);
                    if (i10 != companion.g(str3)) {
                        sb2.append(':');
                        sb2.append(i10);
                    }
                } else {
                    sb2.append(':');
                    sb2.append(i10);
                }
            }
            Companion companion2 = t.INSTANCE;
            companion2.o(this.encodedPathSegments, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                kotlin.jvm.internal.f0.m(list);
                companion2.q(list, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            String string = sb2.toString();
            kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        @dl.e
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        @dl.e
        /* JADX INFO: renamed from: w, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        @dl.d
        public final a x(@dl.d String host) {
            kotlin.jvm.internal.f0.p(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.n(t.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }
    }

    /* JADX INFO: renamed from: okhttp3.t$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: HttpUrl.kt */
    @Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EJ,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e*\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010#J\u0015\u0010&\u001a\u0004\u0018\u00010!*\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u0004\u0018\u00010!*\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b,\u0010#J\u0019\u0010-\u001a\u0004\u0018\u00010!2\u0006\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b-\u0010#J\u0019\u0010.\u001a\u0004\u0018\u00010!2\u0006\u0010+\u001a\u00020%H\u0007¢\u0006\u0004\b.\u0010'J\u0019\u00100\u001a\u0004\u0018\u00010!2\u0006\u0010/\u001a\u00020(H\u0007¢\u0006\u0004\b0\u0010*J1\u00101\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b1\u00102Jc\u00103\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u00106R\u0014\u0010=\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u00106R\u0014\u0010>\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u00106R\u0014\u0010?\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u00106R\u0014\u0010@\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u00106R\u0014\u0010A\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u00106R\u0014\u0010B\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u00106R\u0014\u0010C\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u00106¨\u0006F"}, d2 = {"Lokhttp3/t$b;", "", "Lokio/Buffer;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lkotlin/b2;", ak.aB, "k", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "r", "scheme", "g", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "o", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "q", "", "p", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/t;", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/String;)Lokhttp3/t;", "l", "Ljava/net/URL;", "j", "(Ljava/net/URL;)Lokhttp3/t;", "Ljava/net/URI;", "i", "(Ljava/net/URI;)Lokhttp3/t;", "url", ak.av, "d", ak.aF, "uri", "b", "m", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "e", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ String f(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return companion.e(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        private final boolean k(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Util.parseHexDigit(str.charAt(i10 + 1)) != -1 && Util.parseHexDigit(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String n(Companion companion, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return companion.m(str, i10, i11, z10);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0065  */
        /* JADX WARN: Code duplicated, block: B:41:0x006a  */
        /* JADX WARN: Code duplicated, block: B:44:0x0071  */
        /* JADX WARN: Code duplicated, block: B:50:0x008a  */
        /* JADX WARN: Code duplicated, block: B:53:0x0093 A[LOOP:1: B:51:0x008d->B:53:0x0093, LOOP_END] */
        private final void r(Buffer buffer, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            int iCharCount = i10;
            Buffer buffer2 = null;
            while (iCharCount < i11) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        buffer.writeUtf8(z10 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt__StringsKt.V2(str2, (char) iCodePointAt, false, 2, null))) {
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset != null || kotlin.jvm.internal.f0.g(charset, StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!buffer2.exhausted()) {
                            int i12 = buffer2.readByte() & 255;
                            buffer.writeByte(37);
                            buffer.writeByte((int) t.f132639k[(i12 >> 4) & 15]);
                            buffer.writeByte((int) t.f132639k[i12 & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z10) {
                                if (z11) {
                                    if (!k(str, iCharCount, i11)) {
                                    }
                                }
                            }
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            if (charset != null) {
                                buffer2.writeUtf8CodePoint(iCodePointAt);
                            } else {
                                buffer2.writeUtf8CodePoint(iCodePointAt);
                            }
                            while (!buffer2.exhausted()) {
                                int i13 = buffer2.readByte() & 255;
                                buffer.writeByte(37);
                                buffer.writeByte((int) t.f132639k[(i13 >> 4) & 15]);
                                buffer.writeByte((int) t.f132639k[i13 & 15]);
                            }
                        }
                        buffer.writeUtf8CodePoint(iCodePointAt);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void s(Buffer buffer, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i10 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i12));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    buffer.writeByte(32);
                    i10++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @xh.h(name = "-deprecated_get")
        public final t a(@dl.d String url) {
            kotlin.jvm.internal.f0.p(url, "url");
            return h(url);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @xh.h(name = "-deprecated_get")
        @dl.e
        public final t b(@dl.d URI uri) {
            kotlin.jvm.internal.f0.p(uri, "uri");
            return i(uri);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @xh.h(name = "-deprecated_get")
        @dl.e
        public final t c(@dl.d URL url) {
            kotlin.jvm.internal.f0.p(url, "url");
            return j(url);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @xh.h(name = "-deprecated_parse")
        @dl.e
        public final t d(@dl.d String url) {
            kotlin.jvm.internal.f0.p(url, "url");
            return l(url);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003e  */
        @dl.d
        public final String e(@dl.d String canonicalize, int i10, int i11, @dl.d String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, @dl.e Charset charset) {
            kotlin.jvm.internal.f0.p(canonicalize, "$this$canonicalize");
            kotlin.jvm.internal.f0.p(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (true) {
                if (iCharCount >= i11) {
                    String strSubstring = canonicalize.substring(i10, i11);
                    kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                int iCodePointAt = canonicalize.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt__StringsKt.V2(encodeSet, (char) iCodePointAt, false, 2, null))) {
                    break;
                }
                if (iCodePointAt == 37) {
                    if (!z10) {
                        break;
                    }
                    if (z11) {
                        if (k(canonicalize, iCharCount, i11)) {
                        }
                    }
                    if (iCodePointAt == 43) {
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                } else if (iCodePointAt == 43 || !z12) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
                Buffer buffer = new Buffer();
                buffer.writeUtf8(canonicalize, i10, iCharCount);
                r(buffer, canonicalize, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return buffer.readUtf8();
            }
            Buffer buffer2 = new Buffer();
            buffer2.writeUtf8(canonicalize, i10, iCharCount);
            r(buffer2, canonicalize, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
            return buffer2.readUtf8();
        }

        @xh.m
        public final int g(@dl.d String scheme) {
            kotlin.jvm.internal.f0.p(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        @dl.d
        @xh.h(name = "get")
        @xh.m
        public final t h(@dl.d String toHttpUrl) {
            kotlin.jvm.internal.f0.p(toHttpUrl, "$this$toHttpUrl");
            return new a().A(null, toHttpUrl).h();
        }

        @xh.h(name = "get")
        @dl.e
        @xh.m
        public final t i(@dl.d URI toHttpUrlOrNull) {
            kotlin.jvm.internal.f0.p(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String string = toHttpUrlOrNull.toString();
            kotlin.jvm.internal.f0.o(string, "toString()");
            return l(string);
        }

        @xh.h(name = "get")
        @dl.e
        @xh.m
        public final t j(@dl.d URL toHttpUrlOrNull) {
            kotlin.jvm.internal.f0.p(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String string = toHttpUrlOrNull.toString();
            kotlin.jvm.internal.f0.o(string, "toString()");
            return l(string);
        }

        @xh.h(name = "parse")
        @dl.e
        @xh.m
        public final t l(@dl.d String toHttpUrlOrNull) {
            kotlin.jvm.internal.f0.p(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return h(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @dl.d
        public final String m(@dl.d String percentDecode, int i10, int i11, boolean z10) {
            kotlin.jvm.internal.f0.p(percentDecode, "$this$percentDecode");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = percentDecode.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(percentDecode, i10, i12);
                    s(buffer, percentDecode, i12, i11, z10);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = percentDecode.substring(i10, i11);
            kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void o(@dl.d List<String> toPathString, @dl.d StringBuilder out) {
            kotlin.jvm.internal.f0.p(toPathString, "$this$toPathString");
            kotlin.jvm.internal.f0.p(out, "out");
            int size = toPathString.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append(IOUtils.DIR_SEPARATOR_UNIX);
                out.append(toPathString.get(i10));
            }
        }

        @dl.d
        public final List<String> p(@dl.d String toQueryNamesAndValues) {
            kotlin.jvm.internal.f0.p(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= toQueryNamesAndValues.length()) {
                int iR3 = StringsKt__StringsKt.r3(toQueryNamesAndValues, kotlin.text.y.f128595d, i10, false, 4, null);
                if (iR3 == -1) {
                    iR3 = toQueryNamesAndValues.length();
                }
                int i11 = iR3;
                int iR4 = StringsKt__StringsKt.r3(toQueryNamesAndValues, n5.a.f132013h, i10, false, 4, null);
                if (iR4 == -1 || iR4 > i11) {
                    String strSubstring = toQueryNamesAndValues.substring(i10, i11);
                    kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = toQueryNamesAndValues.substring(i10, iR4);
                    kotlin.jvm.internal.f0.o(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = toQueryNamesAndValues.substring(iR4 + 1, i11);
                    kotlin.jvm.internal.f0.o(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void q(@dl.d List<String> toQueryString, @dl.d StringBuilder out) {
            kotlin.jvm.internal.f0.p(toQueryString, "$this$toQueryString");
            kotlin.jvm.internal.f0.p(out, "out");
            fi.j jVarB1 = fi.u.B1(fi.u.W1(0, toQueryString.size()), 2);
            int iH = jVarB1.h();
            int i10 = jVarB1.i();
            int iJ = jVarB1.j();
            if (iJ >= 0) {
                if (iH > i10) {
                    return;
                }
            } else if (iH < i10) {
                return;
            }
            while (true) {
                String str = toQueryString.get(iH);
                String str2 = toQueryString.get(iH + 1);
                if (iH > 0) {
                    out.append(kotlin.text.y.f128595d);
                }
                out.append(str);
                if (str2 != null) {
                    out.append(n5.a.f132013h);
                    out.append(str2);
                }
                if (iH == i10) {
                    return;
                } else {
                    iH += iJ;
                }
            }
        }
    }

    public t(@dl.d String scheme, @dl.d String username, @dl.d String password, @dl.d String host, int i10, @dl.d List<String> pathSegments, @dl.e List<String> list, @dl.e String str, @dl.d String url) {
        kotlin.jvm.internal.f0.p(scheme, "scheme");
        kotlin.jvm.internal.f0.p(username, "username");
        kotlin.jvm.internal.f0.p(password, "password");
        kotlin.jvm.internal.f0.p(host, "host");
        kotlin.jvm.internal.f0.p(pathSegments, "pathSegments");
        kotlin.jvm.internal.f0.p(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i10;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = kotlin.jvm.internal.f0.g(scheme, "https");
    }

    @dl.d
    @xh.h(name = "get")
    @xh.m
    public static final t C(@dl.d String str) {
        return INSTANCE.h(str);
    }

    @xh.h(name = "get")
    @dl.e
    @xh.m
    public static final t D(@dl.d URI uri) {
        return INSTANCE.i(uri);
    }

    @xh.h(name = "get")
    @dl.e
    @xh.m
    public static final t E(@dl.d URL url) {
        return INSTANCE.j(url);
    }

    @xh.h(name = "parse")
    @dl.e
    @xh.m
    public static final t J(@dl.d String str) {
        return INSTANCE.l(str);
    }

    @xh.m
    public static final int u(@dl.d String str) {
        return INSTANCE.g(str);
    }

    @dl.d
    @xh.h(name = "encodedUsername")
    public final String A() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iDelimiterOffset);
        kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @xh.h(name = "fragment")
    @dl.e
    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @dl.d
    @xh.h(name = "host")
    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    @dl.d
    public final a H() {
        a aVar = new a();
        aVar.X(this.scheme);
        aVar.S(A());
        aVar.O(w());
        aVar.T(this.host);
        aVar.V(this.port != INSTANCE.g(this.scheme) ? this.port : -1);
        aVar.r().clear();
        aVar.r().addAll(y());
        aVar.m(z());
        aVar.N(v());
        return aVar;
    }

    @dl.e
    public final a I(@dl.d String link) {
        kotlin.jvm.internal.f0.p(link, "link");
        try {
            return new a().A(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @dl.d
    @xh.h(name = g0.a.f118920d)
    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @dl.d
    @xh.h(name = "pathSegments")
    public final List<String> L() {
        return this.pathSegments;
    }

    @xh.h(name = "pathSize")
    public final int M() {
        return this.pathSegments.size();
    }

    @xh.h(name = HeyboxMicFragment.f93763y)
    /* JADX INFO: renamed from: N, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @xh.h(name = "query")
    @dl.e
    public final String O() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.q(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    @dl.e
    public final String P(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, list.size()), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if (iJ < 0 ? iH >= i10 : iH <= i10) {
            while (!kotlin.jvm.internal.f0.g(name, this.queryNamesAndValues.get(iH))) {
                if (iH != i10) {
                    iH += iJ;
                }
            }
            return this.queryNamesAndValues.get(iH + 1);
        }
        return null;
    }

    @dl.d
    public final String Q(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        kotlin.jvm.internal.f0.m(str);
        return str;
    }

    @dl.d
    @xh.h(name = "queryParameterNames")
    public final Set<String> R() {
        if (this.queryNamesAndValues == null) {
            return d1.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.queryNamesAndValues.size()), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if (iJ < 0 ? iH >= i10 : iH <= i10) {
            while (true) {
                String str = this.queryNamesAndValues.get(iH);
                kotlin.jvm.internal.f0.m(str);
                linkedHashSet.add(str);
                if (iH == i10) {
                    break;
                }
                iH += iJ;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        kotlin.jvm.internal.f0.o(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @dl.e
    public final String S(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @dl.d
    public final List<String> T(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        if (this.queryNamesAndValues == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList();
        fi.j jVarB1 = fi.u.B1(fi.u.W1(0, this.queryNamesAndValues.size()), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if (iJ < 0 ? iH >= i10 : iH <= i10) {
            while (true) {
                if (kotlin.jvm.internal.f0.g(name, this.queryNamesAndValues.get(iH))) {
                    arrayList.add(this.queryNamesAndValues.get(iH + 1));
                }
                if (iH == i10) {
                    break;
                }
                iH += iJ;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.f0.o(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    @xh.h(name = "querySize")
    public final int U() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @dl.d
    public final String V() {
        a aVarI = I("/...");
        kotlin.jvm.internal.f0.m(aVarI);
        return aVarI.Y("").B("").h().getUrl();
    }

    @dl.e
    public final t W(@dl.d String link) {
        kotlin.jvm.internal.f0.p(link, "link");
        a aVarI = I(link);
        if (aVarI != null) {
            return aVarI.h();
        }
        return null;
    }

    @dl.d
    @xh.h(name = "scheme")
    /* JADX INFO: renamed from: X, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @dl.e
    public final String Y() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @dl.d
    @xh.h(name = "uri")
    public final URI Z() {
        String string = H().G().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m(string, ""));
                kotlin.jvm.internal.f0.o(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "encodedFragment", imports = {}))
    @xh.h(name = "-deprecated_encodedFragment")
    @dl.e
    public final String a() {
        return v();
    }

    @dl.d
    @xh.h(name = "url")
    public final URL a0() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "encodedPassword", imports = {}))
    @xh.h(name = "-deprecated_encodedPassword")
    public final String b() {
        return w();
    }

    @dl.d
    @xh.h(name = g0.a.f118919c)
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "encodedPath", imports = {}))
    @xh.h(name = "-deprecated_encodedPath")
    public final String c() {
        return x();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "encodedPathSegments", imports = {}))
    @xh.h(name = "-deprecated_encodedPathSegments")
    public final List<String> d() {
        return y();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "encodedQuery", imports = {}))
    @xh.h(name = "-deprecated_encodedQuery")
    @dl.e
    public final String e() {
        return z();
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof t) && kotlin.jvm.internal.f0.g(((t) other).url, this.url);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "encodedUsername", imports = {}))
    @xh.h(name = "-deprecated_encodedUsername")
    public final String f() {
        return A();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "fragment", imports = {}))
    @xh.h(name = "-deprecated_fragment")
    @dl.e
    public final String g() {
        return this.fragment;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "host", imports = {}))
    @xh.h(name = "-deprecated_host")
    public final String h() {
        return this.host;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = g0.a.f118920d, imports = {}))
    @xh.h(name = "-deprecated_password")
    public final String i() {
        return this.password;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "pathSegments", imports = {}))
    @xh.h(name = "-deprecated_pathSegments")
    public final List<String> j() {
        return this.pathSegments;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "pathSize", imports = {}))
    @xh.h(name = "-deprecated_pathSize")
    public final int k() {
        return M();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = HeyboxMicFragment.f93763y, imports = {}))
    @xh.h(name = "-deprecated_port")
    public final int l() {
        return this.port;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "query", imports = {}))
    @xh.h(name = "-deprecated_query")
    @dl.e
    public final String m() {
        return O();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "queryParameterNames", imports = {}))
    @xh.h(name = "-deprecated_queryParameterNames")
    public final Set<String> n() {
        return R();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "querySize", imports = {}))
    @xh.h(name = "-deprecated_querySize")
    public final int o() {
        return U();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "scheme", imports = {}))
    @xh.h(name = "-deprecated_scheme")
    public final String p() {
        return this.scheme;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @s0(expression = "toUri()", imports = {}))
    @xh.h(name = "-deprecated_uri")
    public final URI q() {
        return Z();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @s0(expression = "toUrl()", imports = {}))
    @xh.h(name = "-deprecated_url")
    public final URL r() {
        return a0();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = g0.a.f118919c, imports = {}))
    @xh.h(name = "-deprecated_username")
    public final String s() {
        return this.username;
    }

    @dl.d
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @xh.h(name = "encodedFragment")
    @dl.e
    public final String v() {
        if (this.fragment == null) {
            return null;
        }
        int iR3 = StringsKt__StringsKt.r3(this.url, '#', 0, false, 6, null) + 1;
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iR3);
        kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @dl.d
    @xh.h(name = "encodedPassword")
    public final String w() {
        if (this.password.length() == 0) {
            return "";
        }
        int iR3 = StringsKt__StringsKt.r3(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1;
        int iR4 = StringsKt__StringsKt.r3(this.url, '@', 0, false, 6, null);
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iR3, iR4);
        kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @dl.d
    @xh.h(name = "encodedPath")
    public final String x() {
        int iR3 = StringsKt__StringsKt.r3(this.url, IOUtils.DIR_SEPARATOR_UNIX, this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iR3, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iR3, iDelimiterOffset);
        kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @dl.d
    @xh.h(name = "encodedPathSegments")
    public final List<String> y() {
        int iR3 = StringsKt__StringsKt.r3(this.url, IOUtils.DIR_SEPARATOR_UNIX, this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iR3, str.length());
        ArrayList arrayList = new ArrayList();
        while (iR3 < iDelimiterOffset) {
            int i10 = iR3 + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, IOUtils.DIR_SEPARATOR_UNIX, i10, iDelimiterOffset);
            String str2 = this.url;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i10, iDelimiterOffset2);
            kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iR3 = iDelimiterOffset2;
        }
        return arrayList;
    }

    @xh.h(name = "encodedQuery")
    @dl.e
    public final String z() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iR3 = StringsKt__StringsKt.r3(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, '#', iR3, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iR3, iDelimiterOffset);
        kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }
}

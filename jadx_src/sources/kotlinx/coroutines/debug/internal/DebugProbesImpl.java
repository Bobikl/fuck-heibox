package kotlinx.coroutines.debug.internal;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r0;
import kotlin.collections.t;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.t0;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.u;
import kotlin.text.y;
import kotlin.w;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.internal.n0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0093\u0001B\n\b\u0002¢\u0006\u0005\b\u0092\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010)\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010>J\u0016\u0010?\u001a\u0004\u0018\u00010=*\u00020=H\u0082\u0010¢\u0006\u0004\b?\u0010@J/\u0010B\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020=H\u0082\u0010¢\u0006\u0004\bF\u0010GJ\u001b\u0010I\u001a\u0004\u0018\u00010H*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\bI\u0010JJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u0000092\b\u0010:\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010R\u001a\b\u0012\u0004\u0012\u00020%0\u001a\"\b\b\u0000\u0010B*\u00020P2\u0006\u0010Q\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\bJ\r\u0010U\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\bJ\u0015\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00020[0\u001a¢\u0006\u0004\b_\u0010`J\u0013\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001a¢\u0006\u0004\bb\u0010`J\u0015\u0010c\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bc\u0010$J)\u0010d\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010\\\u001a\u00020[2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bh\u0010gJ)\u0010i\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0000¢\u0006\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010rR$\u0010v\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010uR\u0016\u0010w\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010?R\u0014\u0010z\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010yR#\u0010\u0080\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0083\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010{\u001a\u0005\b\u0081\u0001\u0010}\"\u0005\b\u0082\u0001\u0010\u007fR!\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010uR\"\u0010\u0088\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0085\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\"\u0010\u008c\u0001\u001a\u00020\u0011*\u00020\n8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u0089\u0001\u0010XR\u001b\u0010\u008f\u0001\u001a\u00020\u0003*\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0091\u0001\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010}¨\u0006\u0094\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "Lkotlin/Function1;", "", "Lkotlin/b2;", "t", "()Lyh/l;", "M", "()V", "N", "Lkotlinx/coroutines/d2;", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "d", "(Lkotlinx/coroutines/d2;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "Lkotlin/coroutines/CoroutineContext;", TopicHashtagWrapper.TYPE_CREATE, "", "i", "(Lyh/p;)Ljava/util/List;", "P", "(Ljava/lang/Object;)Ljava/lang/String;", "y", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)Z", "Ljava/io/PrintStream;", "out", "j", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "D", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "n", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/Pair;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "p", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/c;", "frame", androidx.exifinterface.media.a.R4, "(Lkotlin/coroutines/c;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/c;", "(Lkotlin/coroutines/jvm/internal/c;Ljava/lang/String;)V", "I", "(Lkotlin/coroutines/jvm/internal/c;)Lkotlin/coroutines/jvm/internal/c;", "owner", androidx.exifinterface.media.a.f23244d5, "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;Lkotlin/coroutines/c;Ljava/lang/String;)V", "B", "(Lkotlin/coroutines/c;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "C", "(Lkotlin/coroutines/jvm/internal/c;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "Lkotlinx/coroutines/debug/internal/i;", "O", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/i;", "completion", "e", "(Lkotlin/coroutines/c;Lkotlinx/coroutines/debug/internal/i;)Lkotlin/coroutines/c;", androidx.exifinterface.media.a.S4, "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)Ljava/util/List;", "x", "Q", "job", RXScreenCaptureService.KEY_WIDTH, "(Lkotlinx/coroutines/d2;)Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/c;", "info", "m", "(Lkotlinx/coroutines/debug/internal/c;)Ljava/lang/String;", "g", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "k", "f", "l", "(Lkotlinx/coroutines/debug/internal/c;Ljava/util/List;)Ljava/util/List;", "G", "(Lkotlin/coroutines/c;)V", "H", "F", "(Lkotlin/coroutines/c;)Lkotlin/coroutines/c;", "b", "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/text/SimpleDateFormat;", ak.aF, "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "capturedCoroutinesMap", "installations", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Z", "v", "()Z", "L", "(Z)V", "sanitizeStackTraces", ak.aG, "K", "enableCreationStackTraces", "callerInfoCache", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "r", "getDebugString$annotations", "(Lkotlinx/coroutines/d2;)V", "debugString", androidx.exifinterface.media.a.W4, "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", ak.aD, "isInstalled", "<init>", ak.av, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class DebugProbesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final DebugProbesImpl f129128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final String ARTIFICIAL_FRAME_MESSAGE = "Coroutine creation stacktrace";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private static Thread weakRefCleanerThread;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final ConcurrentWeakMap<a<?>, Boolean> capturedCoroutinesMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final /* synthetic */ e f129133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f129134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final ReentrantReadWriteLock coroutineStateLock;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static boolean sanitizeStackTraces;
    private static volatile int installations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static boolean enableCreationStackTraces;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private static final l<Boolean, b2> f129138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final ConcurrentWeakMap<kotlin.coroutines.jvm.internal.c, DebugCoroutineInfo> callerInfoCache;

    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/c;", "Lkotlin/coroutines/jvm/internal/c;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/Result;", "result", "Lkotlin/b2;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "b", "Lkotlin/coroutines/c;", "delegate", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", ak.aF, "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "info", "d", "Lkotlin/coroutines/jvm/internal/c;", "frame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "<init>", "(Lkotlin/coroutines/c;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/jvm/internal/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements kotlin.coroutines.c<T>, kotlin.coroutines.jvm.internal.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final kotlin.coroutines.c<T> delegate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final DebugCoroutineInfo info;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final kotlin.coroutines.jvm.internal.c frame;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d kotlin.coroutines.c<? super T> cVar, @dl.d DebugCoroutineInfo debugCoroutineInfo, @dl.e kotlin.coroutines.jvm.internal.c cVar2) {
            this.delegate = cVar;
            this.info = debugCoroutineInfo;
            this.frame = cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.c
        @dl.e
        public kotlin.coroutines.jvm.internal.c getCallerFrame() {
            kotlin.coroutines.jvm.internal.c cVar = this.frame;
            if (cVar != null) {
                return cVar.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.c
        @dl.d
        public CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.c
        @dl.e
        public StackTraceElement getStackTraceElement() {
            kotlin.coroutines.jvm.internal.c cVar = this.frame;
            if (cVar != null) {
                return cVar.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.c
        public void resumeWith(@dl.d Object result) {
            DebugProbesImpl.f129128a.E(this);
            this.delegate.resumeWith(result);
        }

        @dl.d
        public String toString() {
            return this.delegate.toString();
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "kotlin.jvm.PlatformType", ak.av, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.g.l(Long.valueOf(((a) t10).info.sequenceNumber), Long.valueOf(((a) t11).info.sequenceNumber));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "kotlin.jvm.PlatformType", ak.av, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.g.l(Long.valueOf(((a) t10).info.sequenceNumber), Long.valueOf(((a) t11).info.sequenceNumber));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.debug.internal.e] */
    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        f129128a = debugProbesImpl;
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        final long j10 = 0;
        f129133f = new Object(j10) { // from class: kotlinx.coroutines.debug.internal.e
            volatile long sequenceNumber;

            {
                this.sequenceNumber = j10;
            }
        };
        coroutineStateLock = new ReentrantReadWriteLock();
        sanitizeStackTraces = true;
        enableCreationStackTraces = true;
        f129138k = debugProbesImpl.t();
        callerInfoCache = new ConcurrentWeakMap<>(true);
        f129134g = AtomicLongFieldUpdater.newUpdater(e.class, "sequenceNumber");
    }

    private DebugProbesImpl() {
    }

    private final boolean A(StackTraceElement stackTraceElement) {
        return u.v2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final a<?> B(kotlin.coroutines.c<?> cVar) {
        kotlin.coroutines.jvm.internal.c cVar2 = cVar instanceof kotlin.coroutines.jvm.internal.c ? (kotlin.coroutines.jvm.internal.c) cVar : null;
        if (cVar2 != null) {
            return C(cVar2);
        }
        return null;
    }

    private final a<?> C(kotlin.coroutines.jvm.internal.c cVar) {
        while (!(cVar instanceof a)) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        }
        return (a) cVar;
    }

    private final void D(PrintStream out, List<StackTraceElement> frames) {
        Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(a<?> owner) {
        kotlin.coroutines.jvm.internal.c cVarI;
        capturedCoroutinesMap.remove(owner);
        kotlin.coroutines.jvm.internal.c cVarF = owner.info.f();
        if (cVarF == null || (cVarI = I(cVarF)) == null) {
            return;
        }
        callerInfoCache.remove(cVarI);
    }

    private final kotlin.coroutines.jvm.internal.c I(kotlin.coroutines.jvm.internal.c cVar) {
        do {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        } while (cVar.getStackTraceElement() == null);
        return cVar;
    }

    private final <T extends Throwable> List<StackTraceElement> J(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (f0.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i10 = length2;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length2 = i11;
            }
        }
        if (!sanitizeStackTraces) {
            int i12 = length - i10;
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            while (i13 < i12) {
                arrayList.add(i13 == 0 ? n0.d(ARTIFICIAL_FRAME_MESSAGE) : stackTrace[i13 + i10]);
                i13++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i10) + 1);
        arrayList2.add(n0.d(ARTIFICIAL_FRAME_MESSAGE));
        while (true) {
            i10++;
            while (i10 < length) {
                if (A(stackTrace[i10])) {
                    arrayList2.add(stackTrace[i10]);
                    int i14 = i10 + 1;
                    while (i14 < length && A(stackTrace[i14])) {
                        i14++;
                    }
                    int i15 = i14 - 1;
                    int i16 = i15;
                    while (i16 > i10 && stackTrace[i16].getFileName() == null) {
                        i16--;
                    }
                    if (i16 > i10 && i16 < i15) {
                        arrayList2.add(stackTrace[i16]);
                    }
                    arrayList2.add(stackTrace[i15]);
                    i10 = i14;
                } else {
                    arrayList2.add(stackTrace[i10]);
                }
            }
            return arrayList2;
        }
    }

    private final void M() {
        weakRefCleanerThread = kotlin.concurrent.b.c(false, true, null, "Coroutines Debugger Cleaner", 0, new yh.a<b2>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$startWeakRefCleanerThread$1
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DebugProbesImpl.callerInfoCache.l();
            }
        }, 21, null);
    }

    private final void N() throws InterruptedException {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final i O(List<StackTraceElement> list) {
        i iVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                iVar = new i(iVar, listIterator.previous());
            }
        }
        return iVar;
    }

    private final String P(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y.f128593b);
        sb2.append(obj);
        sb2.append(y.f128593b);
        return sb2.toString();
    }

    private final void R(kotlin.coroutines.jvm.internal.c frame, String state) {
        ReentrantReadWriteLock.ReadLock lock = coroutineStateLock.readLock();
        lock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f129128a;
            if (debugProbesImpl.z()) {
                ConcurrentWeakMap<kotlin.coroutines.jvm.internal.c, DebugCoroutineInfo> concurrentWeakMap = callerInfoCache;
                DebugCoroutineInfo debugCoroutineInfoRemove = concurrentWeakMap.remove(frame);
                if (debugCoroutineInfoRemove == null) {
                    a<?> aVarC = debugProbesImpl.C(frame);
                    if (aVarC != null && (debugCoroutineInfoRemove = aVarC.info) != null) {
                        kotlin.coroutines.jvm.internal.c cVarF = debugCoroutineInfoRemove.f();
                        kotlin.coroutines.jvm.internal.c cVarI = cVarF != null ? debugProbesImpl.I(cVarF) : null;
                        if (cVarI != null) {
                            concurrentWeakMap.remove(cVarI);
                        }
                    }
                    return;
                }
                debugCoroutineInfoRemove.j(state, (kotlin.coroutines.c) frame);
                kotlin.coroutines.jvm.internal.c cVarI2 = debugProbesImpl.I(frame);
                if (cVarI2 == null) {
                    return;
                }
                concurrentWeakMap.put(cVarI2, debugCoroutineInfoRemove);
                b2 b2Var = b2.f124493a;
            }
        } finally {
            lock.unlock();
        }
    }

    private final void S(kotlin.coroutines.c<?> frame, String state) {
        if (z()) {
            if (f0.g(state, d.f129170b) && w.f128653h.f(1, 3, 30)) {
                kotlin.coroutines.jvm.internal.c cVar = frame instanceof kotlin.coroutines.jvm.internal.c ? (kotlin.coroutines.jvm.internal.c) frame : null;
                if (cVar == null) {
                    return;
                }
                R(cVar, state);
                return;
            }
            a<?> aVarB = B(frame);
            if (aVarB == null) {
                return;
            }
            T(aVarB, frame, state);
        }
    }

    private final void T(a<?> owner, kotlin.coroutines.c<?> frame, String state) {
        ReentrantReadWriteLock.ReadLock lock = coroutineStateLock.readLock();
        lock.lock();
        try {
            if (f129128a.z()) {
                owner.info.j(state, frame);
                b2 b2Var = b2.f124493a;
            }
        } finally {
            lock.unlock();
        }
    }

    private final void d(d2 d2Var, Map<d2, DebugCoroutineInfo> map, StringBuilder sb2, String str) {
        DebugCoroutineInfo debugCoroutineInfo = map.get(d2Var);
        if (debugCoroutineInfo != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) CollectionsKt___CollectionsKt.B2(debugCoroutineInfo.h());
            sb2.append(str + r(d2Var) + ", continuation is " + debugCoroutineInfo.get_state() + " at line " + stackTraceElement + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        } else if (!(d2Var instanceof k0)) {
            sb2.append(str + r(d2Var) + '\n');
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append('\t');
            str = sb4.toString();
        }
        Iterator<d2> it = d2Var.S().iterator();
        while (it.hasNext()) {
            d(it.next(), map, sb2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> kotlin.coroutines.c<T> e(kotlin.coroutines.c<? super T> completion, i frame) {
        if (!z()) {
            return completion;
        }
        a<?> aVar = new a<>(completion, new DebugCoroutineInfo(completion.getContext(), frame, f129134g.incrementAndGet(f129133f)), frame);
        ConcurrentWeakMap<a<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(aVar, Boolean.TRUE);
        if (!z()) {
            concurrentWeakMap.clear();
        }
        return aVar;
    }

    private final <R> List<R> i(final p<? super a<?>, ? super CoroutineContext, ? extends R> create) {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f129128a;
            if (!debugProbesImpl.z()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            List<R> listC3 = SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.p1(SequencesKt___SequencesKt.K2(CollectionsKt___CollectionsKt.v1(debugProbesImpl.q()), new b()), new l<a<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final R invoke(@dl.d DebugProbesImpl.a<?> aVar) {
                    CoroutineContext coroutineContextC;
                    if (DebugProbesImpl.f129128a.y(aVar) || (coroutineContextC = aVar.info.c()) == null) {
                        return null;
                    }
                    return create.invoke(aVar, coroutineContextC);
                }
            }));
            c0.d(1);
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            c0.c(1);
            return listC3;
        } catch (Throwable th2) {
            c0.d(1);
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            c0.c(1);
            throw th2;
        }
    }

    private final void j(PrintStream out) {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f129128a;
            if (!debugProbesImpl.z()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            out.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
            for (a aVar : SequencesKt___SequencesKt.K2(SequencesKt___SequencesKt.p0(CollectionsKt___CollectionsKt.v1(debugProbesImpl.q()), new l<a<?>, Boolean>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$1$2
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d DebugProbesImpl.a<?> aVar2) {
                    return Boolean.valueOf(!DebugProbesImpl.f129128a.y(aVar2));
                }
            }), new c())) {
                DebugCoroutineInfo debugCoroutineInfo = aVar.info;
                List<StackTraceElement> listH = debugCoroutineInfo.h();
                DebugProbesImpl debugProbesImpl2 = f129128a;
                List<StackTraceElement> listN = debugProbesImpl2.n(debugCoroutineInfo.get_state(), debugCoroutineInfo.lastObservedThread, listH);
                out.print("\n\nCoroutine " + aVar.delegate + ", state: " + ((f0.g(debugCoroutineInfo.get_state(), d.f129170b) && listN == listH) ? debugCoroutineInfo.get_state() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfo.get_state()));
                if (listH.isEmpty()) {
                    out.print("\n\tat " + n0.d(ARTIFICIAL_FRAME_MESSAGE));
                    debugProbesImpl2.D(out, debugCoroutineInfo.e());
                } else {
                    debugProbesImpl2.D(out, listN);
                }
            }
            b2 b2Var = b2.f124493a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    private final List<StackTraceElement> n(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object objB;
        if (!f0.g(state, d.f129170b) || thread == null) {
            return coroutineTrace;
        }
        try {
            Result.a aVar = Result.f124476c;
            objB = Result.b(thread.getStackTrace());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objB;
        if (stackTraceElementArr == null) {
            return coroutineTrace;
        }
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            if (f0.g(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && f0.g(stackTraceElement.getMethodName(), "resumeWith") && f0.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i10++;
        }
        Pair<Integer, Integer> pairO = o(i10, stackTraceElementArr, coroutineTrace);
        int iIntValue = pairO.a().intValue();
        int iIntValue2 = pairO.b().intValue();
        if (iIntValue == -1) {
            return coroutineTrace;
        }
        ArrayList arrayList = new ArrayList((((coroutineTrace.size() + i10) - iIntValue) - 1) - iIntValue2);
        int i11 = i10 - iIntValue2;
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(stackTraceElementArr[i12]);
        }
        int size = coroutineTrace.size();
        for (int i13 = iIntValue + 1; i13 < size; i13++) {
            arrayList.add(coroutineTrace.get(i13));
        }
        return arrayList;
    }

    private final Pair<Integer, Integer> o(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i10 = 0; i10 < 3; i10++) {
            int iP = f129128a.p((indexOfResumeWith - 1) - i10, actualTrace, coroutineTrace);
            if (iP != -1) {
                return c1.a(Integer.valueOf(iP), Integer.valueOf(i10));
            }
        }
        return c1.a(-1, 0);
    }

    private final int p(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.qf(actualTrace, frameIndex);
        if (stackTraceElement == null) {
            return -1;
        }
        int i10 = 0;
        for (StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (f0.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && f0.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && f0.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private final Set<a<?>> q() {
        return capturedCoroutinesMap.keySet();
    }

    private final String r(d2 d2Var) {
        return d2Var instanceof JobSupport ? ((JobSupport) d2Var).z1() : d2Var.toString();
    }

    private static /* synthetic */ void s(d2 d2Var) {
    }

    private final l<Boolean, b2> t() {
        Object objB;
        try {
            Result.a aVar = Result.f124476c;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            }
            objB = Result.b((l) w0.q(objNewInstance, 1));
            if (Result.i(objB)) {
                objB = null;
            }
            return (l) objB;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(a<?> aVar) {
        d2 d2Var;
        CoroutineContext coroutineContextC = aVar.info.c();
        if (coroutineContextC == null || (d2Var = (d2) coroutineContextC.f(d2.INSTANCE)) == null || !d2Var.x()) {
            return false;
        }
        capturedCoroutinesMap.remove(aVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final <T> kotlin.coroutines.c<T> F(@dl.d kotlin.coroutines.c<? super T> completion) {
        if (z() && B(completion) == null) {
            return e(completion, enableCreationStackTraces ? O(J(new Exception())) : null);
        }
        return completion;
    }

    public final void G(@dl.d kotlin.coroutines.c<?> frame) {
        S(frame, d.f129170b);
    }

    public final void H(@dl.d kotlin.coroutines.c<?> frame) {
        S(frame, d.f129171c);
    }

    public final void K(boolean z10) {
        enableCreationStackTraces = z10;
    }

    public final void L(boolean z10) {
        sanitizeStackTraces = z10;
    }

    public final void Q() {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f129128a;
            if (!debugProbesImpl.z()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            installations--;
            if (installations != 0) {
                while (i10 < readHoldCount) {
                    lock.lock();
                    i10++;
                }
                writeLock.unlock();
                return;
            }
            debugProbesImpl.N();
            capturedCoroutinesMap.clear();
            callerInfoCache.clear();
            if (kotlinx.coroutines.debug.internal.a.f129154a.a()) {
                while (i10 < readHoldCount) {
                    lock.lock();
                    i10++;
                }
                writeLock.unlock();
                return;
            }
            l<Boolean, b2> lVar = f129138k;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            b2 b2Var = b2.f124493a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void f(@dl.d PrintStream out) {
        synchronized (out) {
            f129128a.j(out);
            b2 b2Var = b2.f124493a;
        }
    }

    @dl.d
    public final List<kotlinx.coroutines.debug.internal.c> g() {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f129128a;
            if (!debugProbesImpl.z()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            List<kotlinx.coroutines.debug.internal.c> listC3 = SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.p1(SequencesKt___SequencesKt.K2(CollectionsKt___CollectionsKt.v1(debugProbesImpl.q()), new b()), new l<a<?>, kotlinx.coroutines.debug.internal.c>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c invoke(@dl.d DebugProbesImpl.a<?> aVar) {
                    CoroutineContext coroutineContextC;
                    if (DebugProbesImpl.f129128a.y(aVar) || (coroutineContextC = aVar.info.c()) == null) {
                        return null;
                    }
                    return new c(aVar.info, coroutineContextC);
                }
            }));
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            return listC3;
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    @dl.d
    public final Object[] h() {
        String strC0;
        List<kotlinx.coroutines.debug.internal.c> listG = g();
        int size = listG.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (kotlinx.coroutines.debug.internal.c cVar : listG) {
            CoroutineContext context = cVar.getContext();
            CoroutineName coroutineName = (CoroutineName) context.f(CoroutineName.INSTANCE);
            Long lValueOf = null;
            String strP = (coroutineName == null || (strC0 = coroutineName.c0()) == null) ? null : P(strC0);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.f(CoroutineDispatcher.INSTANCE);
            String strP2 = coroutineDispatcher != null ? P(coroutineDispatcher) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"name\": ");
            sb2.append(strP);
            sb2.append(",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.f(CoroutineId.INSTANCE);
            if (coroutineId != null) {
                lValueOf = Long.valueOf(coroutineId.c0());
            }
            sb2.append(lValueOf);
            sb2.append(",\n                    \"dispatcher\": ");
            sb2.append(strP2);
            sb2.append(",\n                    \"sequenceNumber\": ");
            sb2.append(cVar.getSequenceNumber());
            sb2.append(",\n                    \"state\": \"");
            sb2.append(cVar.getState());
            sb2.append("\"\n                } \n                ");
            arrayList3.add(StringsKt__IndentKt.p(sb2.toString()));
            arrayList2.add(cVar.getLastObservedFrame());
            arrayList.add(cVar.getLastObservedThread());
        }
        Object[] objArr = new Object[4];
        objArr[0] = '[' + CollectionsKt___CollectionsKt.h3(arrayList3, null, null, null, 0, null, null, 63, null) + ']';
        Object[] array = arrayList.toArray(new Thread[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        objArr[1] = array;
        Object[] array2 = arrayList2.toArray(new kotlin.coroutines.jvm.internal.c[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        objArr[2] = array2;
        Object[] array3 = listG.toArray(new kotlinx.coroutines.debug.internal.c[0]);
        if (array3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        objArr[3] = array3;
        return objArr;
    }

    @dl.d
    public final List<DebuggerInfo> k() {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f129128a;
            if (!debugProbesImpl.z()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            List<DebuggerInfo> listC3 = SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.p1(SequencesKt___SequencesKt.K2(CollectionsKt___CollectionsKt.v1(debugProbesImpl.q()), new b()), new l<a<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DebuggerInfo invoke(@dl.d DebugProbesImpl.a<?> aVar) {
                    CoroutineContext coroutineContextC;
                    if (DebugProbesImpl.f129128a.y(aVar) || (coroutineContextC = aVar.info.c()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(aVar.info, coroutineContextC);
                }
            }));
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            return listC3;
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    @dl.d
    public final List<StackTraceElement> l(@dl.d kotlinx.coroutines.debug.internal.c info, @dl.d List<StackTraceElement> coroutineTrace) {
        return n(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    @dl.d
    public final String m(@dl.d kotlinx.coroutines.debug.internal.c info) {
        List<StackTraceElement> listL = l(info, info.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"declaringClass\": \"");
            sb2.append(stackTraceElement.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb2.append(fileName != null ? P(fileName) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(StringsKt__IndentKt.p(sb2.toString()));
        }
        return '[' + CollectionsKt___CollectionsKt.h3(arrayList, null, null, null, 0, null, null, 63, null) + ']';
    }

    public final boolean u() {
        return enableCreationStackTraces;
    }

    public final boolean v() {
        return sanitizeStackTraces;
    }

    @dl.d
    public final String w(@dl.d d2 job) {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = f129128a;
            if (!debugProbesImpl.z()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            Set<a<?>> setQ = debugProbesImpl.q();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setQ) {
                if (((a) obj).delegate.getContext().f(d2.INSTANCE) != null) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(t.Y(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(g2.B(((a) obj2).delegate.getContext()), ((a) obj2).info);
            }
            StringBuilder sb2 = new StringBuilder();
            f129128a.d(job, linkedHashMap, sb2, "");
            String string = sb2.toString();
            f0.o(string, "StringBuilder().apply(builderAction).toString()");
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            return string;
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void x() {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                while (i10 < readHoldCount) {
                    lock.lock();
                    i10++;
                }
                writeLock.unlock();
                return;
            }
            f129128a.M();
            if (kotlinx.coroutines.debug.internal.a.f129154a.a()) {
                while (i10 < readHoldCount) {
                    lock.lock();
                    i10++;
                }
                writeLock.unlock();
                return;
            }
            l<Boolean, b2> lVar = f129138k;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            b2 b2Var = b2.f124493a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final boolean z() {
        return installations > 0;
    }
}

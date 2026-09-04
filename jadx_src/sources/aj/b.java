package aj;

import android.annotation.SuppressLint;
import com.umeng.analytics.pro.ak;
import com.vivo.push.PushClientConstants;
import dl.d;
import dl.e;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;
import sun.misc.SignalHandler;
import xh.m;

/* JADX INFO: compiled from: AgentPremain.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Laj/b;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lkotlin/b2;", "d", "b", "<init>", "()V", ak.av, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"all"})
@IgnoreJRERequirement
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f1300a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f1301b;

    /* JADX INFO: compiled from: AgentPremain.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Laj/b$a;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", PushClientConstants.TAG_CLASS_NAME, "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", ak.av, "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements ClassFileTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        public static final a f1302a = new a();

        private a() {
        }

        @e
        public byte[] a(@d ClassLoader loader, @d String className, @e Class<?> classBeingRedefined, @d ProtectionDomain protectionDomain, @e byte[] classfileBuffer) {
            if (!f0.g(className, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            kotlinx.coroutines.debug.internal.a.f129154a.b(true);
            return kotlin.io.a.p(loader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object objB;
        try {
            Result.a aVar = Result.f124476c;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objB = Result.b(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Boolean bool = (Boolean) (Result.i(objB) ? null : objB);
        f1301b = bool != null ? bool.booleanValue() : DebugProbesImpl.f129128a.u();
    }

    private b() {
    }

    private final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: aj.a
                public final void a(Signal signal) {
                    b.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Signal signal) {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f129128a;
        if (debugProbesImpl.z()) {
            debugProbesImpl.f(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @m
    public static final void d(@e String str, @d Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f129154a.b(true);
        instrumentation.addTransformer(a.f1302a);
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f129128a;
        debugProbesImpl.K(f1301b);
        debugProbesImpl.x();
        f1300a.b();
    }
}

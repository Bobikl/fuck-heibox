package kotlinx.coroutines.channels;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.r0;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087@\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013 \u001fB\u0016\b\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlinx/coroutines/channels/n;", androidx.exifinterface.media.a.f23244d5, "", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "n", "(Ljava/lang/Object;)Ljava/lang/String;", "", "j", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", ak.av, "Ljava/lang/Object;", "getHolder$annotations", "()V", "holder", "m", "(Ljava/lang/Object;)Z", "isSuccess", "l", "isFailure", "k", "isClosed", ak.aF, "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@xh.f
public final class n<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final c f129066c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object holder;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.n$a, reason: from toString */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/n$a;", "Lkotlinx/coroutines/channels/n$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "", ak.av, "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Closed extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final Throwable cause;

        public Closed(@dl.e Throwable th2) {
            this.cause = th2;
        }

        public boolean equals(@dl.e Object other) {
            return (other instanceof Closed) && f0.g(this.cause, ((Closed) other).cause);
        }

        public int hashCode() {
            Throwable th2 = this.cause;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.n.c
        @dl.d
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.n$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Channel.kt */
    @z1
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/n$b;", "", androidx.exifinterface.media.a.S4, "value", "Lkotlinx/coroutines/channels/n;", ak.aF, "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "cause", ak.av, "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/n$c;", z5.f.f141859j, "Lkotlinx/coroutines/channels/n$c;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @z1
        public final <E> Object a(@dl.e Throwable cause) {
            return n.c(new Closed(cause));
        }

        @dl.d
        @z1
        public final <E> Object b() {
            return n.c(n.f129066c);
        }

        @dl.d
        @z1
        public final <E> Object c(E value) {
            return n.c(value);
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/n$c;", "", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static class c {
        @dl.d
        public String toString() {
            return "Failed";
        }
    }

    @r0
    private /* synthetic */ n(Object obj) {
        this.holder = obj;
    }

    public static final /* synthetic */ n b(Object obj) {
        return new n(obj);
    }

    @dl.d
    @r0
    public static <T> Object c(@dl.e Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof n) && f0.g(obj, ((n) obj2).getHolder());
    }

    public static final boolean e(Object obj, Object obj2) {
        return f0.g(obj, obj2);
    }

    @dl.e
    public static final Throwable f(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    @r0
    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public static final T h(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) throws Throwable {
        Throwable th2;
        if (!(obj instanceof c)) {
            return obj;
        }
        if ((obj instanceof Closed) && (th2 = ((Closed) obj).cause) != null) {
            throw th2;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof Closed;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @dl.d
    public static String n(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.holder, obj);
    }

    public int hashCode() {
        return j(this.holder);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final /* synthetic */ Object getHolder() {
        return this.holder;
    }

    @dl.d
    public String toString() {
        return n(this.holder);
    }
}

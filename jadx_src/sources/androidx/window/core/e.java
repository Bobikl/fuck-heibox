package androidx.window.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J/\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016J\u0011\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b\u0015\u0010#¨\u0006'"}, d2 = {"Landroidx/window/core/e;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/window/core/SpecificationComputer;", "", "message", "Lkotlin/Function1;", "", "Lkotlin/t;", "condition", ak.aF, ak.av, "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "value", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "tag", "d", "f", "Landroidx/window/core/f;", "e", "Landroidx/window/core/f;", "()Landroidx/window/core/f;", "logger", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "i", "()Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "Landroidx/window/core/WindowStrictModeException;", "Landroidx/window/core/WindowStrictModeException;", "()Landroidx/window/core/WindowStrictModeException;", "exception", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroidx/window/core/f;Landroidx/window/core/SpecificationComputer$VerificationMode;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class e<T> extends SpecificationComputer<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final T value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String tag;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SpecificationComputer.VerificationMode verificationMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WindowStrictModeException exception;

    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28498a;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            f28498a = iArr;
        }
    }

    public e(@dl.d T value, @dl.d String tag, @dl.d String message, @dl.d f logger, @dl.d SpecificationComputer.VerificationMode verificationMode) {
        f0.p(value, "value");
        f0.p(tag, "tag");
        f0.p(message, "message");
        f0.p(logger, "logger");
        f0.p(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(b(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        f0.o(stackTrace, "stackTrace");
        Object[] array = ArraysKt___ArraysKt.M9(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.exception = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    @dl.e
    public T a() throws WindowStrictModeException {
        int i10 = a.f28498a[this.verificationMode.ordinal()];
        if (i10 == 1) {
            throw this.exception;
        }
        if (i10 == 2) {
            this.logger.debug(this.tag, b(this.value, this.message));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.window.core.SpecificationComputer
    @dl.d
    public SpecificationComputer<T> c(@dl.d String message, @dl.d l<? super T, Boolean> condition) {
        f0.p(message, "message");
        f0.p(condition, "condition");
        return this;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final WindowStrictModeException getException() {
        return this.exception;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getLogger() {
        return this.logger;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @dl.d
    public final T h() {
        return this.value;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }
}

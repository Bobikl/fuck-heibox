package androidx.window.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J/\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016J\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/window/core/g;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/window/core/SpecificationComputer;", "", "message", "Lkotlin/Function1;", "", "Lkotlin/t;", "condition", ak.aF, ak.av, "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "f", "value", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "tag", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "d", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "g", "()Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "Landroidx/window/core/f;", "Landroidx/window/core/f;", "()Landroidx/window/core/f;", "logger", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/SpecificationComputer$VerificationMode;Landroidx/window/core/f;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class g<T> extends SpecificationComputer<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final T value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String tag;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SpecificationComputer.VerificationMode verificationMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f logger;

    public g(@dl.d T value, @dl.d String tag, @dl.d SpecificationComputer.VerificationMode verificationMode, @dl.d f logger) {
        f0.p(value, "value");
        f0.p(tag, "tag");
        f0.p(verificationMode, "verificationMode");
        f0.p(logger, "logger");
        this.value = value;
        this.tag = tag;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    @dl.d
    public T a() {
        return this.value;
    }

    @Override // androidx.window.core.SpecificationComputer
    @dl.d
    public SpecificationComputer<T> c(@dl.d String message, @dl.d l<? super T, Boolean> condition) {
        f0.p(message, "message");
        f0.p(condition, "condition");
        return condition.invoke(this.value).booleanValue() ? this : new e(this.value, this.tag, message, this.logger, this.verificationMode);
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getLogger() {
        return this.logger;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @dl.d
    public final T f() {
        return this.value;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }
}

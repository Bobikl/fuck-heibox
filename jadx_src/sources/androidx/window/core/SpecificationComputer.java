package androidx.window.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 \n*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\n\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H&J\u0011\u0010\n\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¨\u0006\u0011"}, d2 = {"Landroidx/window/core/SpecificationComputer;", "", androidx.exifinterface.media.a.f23244d5, "", "message", "Lkotlin/Function1;", "", "Lkotlin/t;", "condition", ak.aF, ak.av, "()Ljava/lang/Object;", "value", "b", "<init>", "()V", "VerificationMode", "window_release"}, k = 1, mv = {1, 6, 0})
public abstract class SpecificationComputer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/window/core/SpecificationComputer$VerificationMode;", "", "(Ljava/lang/String;I)V", "STRICT", "LOG", "QUIET", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    /* JADX INFO: renamed from: androidx.window.core.SpecificationComputer$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/window/core/SpecificationComputer$a;", "", androidx.exifinterface.media.a.f23244d5, "", "tag", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "Landroidx/window/core/f;", "logger", "Landroidx/window/core/SpecificationComputer;", ak.av, "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/SpecificationComputer$VerificationMode;Landroidx/window/core/f;)Landroidx/window/core/SpecificationComputer;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ SpecificationComputer b(Companion companion, Object obj, String str, VerificationMode verificationMode, f fVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                verificationMode = c.f28490a.a();
            }
            if ((i10 & 4) != 0) {
                fVar = a.f28485a;
            }
            return companion.a(obj, str, verificationMode, fVar);
        }

        @dl.d
        public final <T> SpecificationComputer<T> a(@dl.d T t10, @dl.d String tag, @dl.d VerificationMode verificationMode, @dl.d f logger) {
            f0.p(t10, "<this>");
            f0.p(tag, "tag");
            f0.p(verificationMode, "verificationMode");
            f0.p(logger, "logger");
            return new g(t10, tag, verificationMode, logger);
        }
    }

    @dl.e
    public abstract T a();

    @dl.d
    protected final String b(@dl.d Object value, @dl.d String message) {
        f0.p(value, "value");
        f0.p(message, "message");
        return message + " value: " + value;
    }

    @dl.d
    public abstract SpecificationComputer<T> c(@dl.d String str, @dl.d l<? super T, Boolean> lVar);
}

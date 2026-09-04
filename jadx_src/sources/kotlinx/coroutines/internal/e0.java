package kotlinx.coroutines.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.n2;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001b\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016J\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/e0;", "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/y0;", "", "u0", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", androidx.exifinterface.media.a.X4, "", "parallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "c0", "", "time", "N", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/h1;", "r", "t0", "Lkotlinx/coroutines/p;", "Lkotlin/b2;", "continuation", "v0", "", "toString", "", "d", "Ljava/lang/Throwable;", "cause", "e", "Ljava/lang/String;", "errorHint", "p0", "()Lkotlinx/coroutines/n2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e0 extends n2 implements kotlinx.coroutines.y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Throwable cause;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String errorHint;

    public e0(@dl.e Throwable th2, @dl.e String str) {
        this.cause = th2;
        this.errorHint = str;
    }

    public /* synthetic */ e0(Throwable th2, String str, int i10, kotlin.jvm.internal.u uVar) {
        this(th2, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    private final Void u0() {
        String str;
        if (this.cause == null) {
            d0.e();
            throw new KotlinNothingValueException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.errorHint;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString(), this.cause);
    }

    @Override // kotlinx.coroutines.y0
    @dl.e
    public Object N(long j10, @dl.d kotlin.coroutines.c<?> cVar) {
        u0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean V(@dl.d CoroutineContext context) {
        u0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.n2, kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public CoroutineDispatcher c0(int parallelism) {
        u0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.n2
    @dl.d
    public n2 p0() {
        return this;
    }

    @Override // kotlinx.coroutines.y0
    @dl.d
    public h1 r(long timeMillis, @dl.d Runnable block, @dl.d CoroutineContext context) {
        u0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public Void O(@dl.d CoroutineContext context, @dl.d Runnable block) {
        u0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.n2, kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.cause != null) {
            str = ", cause=" + this.cause;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.y0
    @dl.d
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public Void o(long timeMillis, @dl.d kotlinx.coroutines.p<? super b2> continuation) {
        u0();
        throw new KotlinNothingValueException();
    }
}

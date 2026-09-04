package kotlinx.coroutines;

import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00102\u001a\u00020&\u0012\u0006\u00103\u001a\u00020\f\u0012\u0006\u00104\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010$\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!¢\u0006\u0002\b\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001d\u0010-\u001a\u00020&8\u0006¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00100\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lkotlinx/coroutines/a;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/d2;", "Lkotlin/coroutines/c;", "Lkotlinx/coroutines/q0;", "value", "Lkotlin/b2;", "I1", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "H1", "", "z0", "", "state", "n1", "Lkotlin/Result;", "result", "resumeWith", "F1", "exception", "V0", "(Ljava/lang/Throwable;)V", "h1", "()Ljava/lang/String;", "R", "Lkotlinx/coroutines/CoroutineStart;", com.google.android.exoplayer2.text.ttml.d.f49798o0, SocialConstants.PARAM_RECEIVER, "Lkotlin/Function2;", "Lkotlin/t;", "block", "J1", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lyh/p;)V", "Lkotlin/coroutines/CoroutineContext;", ak.aF, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", com.umeng.analytics.pro.d.R, "j0", "coroutineContext", "isActive", "()Z", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class a<T> extends JobSupport implements d2, kotlin.coroutines.c<T>, q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext context;

    public a(@dl.d CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            W0((d2) coroutineContext.f(d2.INSTANCE));
        }
        this.context = coroutineContext.I(this);
    }

    public static /* synthetic */ void G1() {
    }

    protected void F1(@dl.e Object obj) {
        q0(obj);
    }

    protected void H1(@dl.d Throwable th2, boolean z10) {
    }

    protected void I1(T value) {
    }

    public final <R> void J1(@dl.d CoroutineStart start, R receiver, @dl.d yh.p<? super R, ? super kotlin.coroutines.c<? super T>, ? extends Object> block) {
        start.invoke(block, receiver, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void V0(@dl.d Throwable exception) {
        n0.b(this.context, exception);
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport
    @dl.d
    public String h1() {
        String strB = CoroutineContextKt.b(this.context);
        if (strB == null) {
            return super.h1();
        }
        return kotlin.text.y.f128593b + strB + "\":" + super.h1();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.d2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.q0
    @dl.d
    /* JADX INFO: renamed from: j0 */
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    protected final void n1(@dl.e Object obj) {
        if (!(obj instanceof d0)) {
            I1(obj);
        } else {
            d0 d0Var = (d0) obj;
            H1(d0Var.cause, d0Var.a());
        }
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(@dl.d Object result) {
        Object objF1 = f1(i0.d(result, null, 1, null));
        if (objF1 == k2.f130251b) {
            return;
        }
        F1(objF1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    @dl.d
    public String z0() {
        return t0.a(this) + " was cancelled";
    }
}

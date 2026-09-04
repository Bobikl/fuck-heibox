package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/m3;", "U", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/k0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/b2;", "run", "", "h1", "()Ljava/lang/String;", "", "e", "J", "time", "Lkotlin/coroutines/c;", "uCont", "<init>", "(JLkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class m3<U, T extends U> extends kotlinx.coroutines.internal.k0<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final long time;

    public m3(long j10, @dl.d kotlin.coroutines.c<? super U> cVar) {
        super(cVar.getCom.umeng.analytics.pro.d.R java.lang.String(), cVar);
        this.time = j10;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport
    @dl.d
    public String h1() {
        return super.h1() + "(timeMillis=" + this.time + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        u0(TimeoutKt.a(this.time, this));
    }
}

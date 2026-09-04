package kotlinx.coroutines.flow.internal;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.internal.c;
import kotlinx.coroutines.flow.u;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b*\u0010\u001aJ\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\u0084\bR>\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070'8F¢\u0006\u0006\u001a\u0004\b$\u0010(¨\u0006+"}, d2 = {"Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/internal/c;", androidx.exifinterface.media.a.R4, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "j", "()Lkotlinx/coroutines/flow/internal/c;", "", UiKitSpanObj.TYPE_SIZE, "", "k", "(I)[Lkotlinx/coroutines/flow/internal/c;", "i", "slot", "Lkotlin/b2;", "m", "(Lkotlinx/coroutines/flow/internal/c;)V", "Lkotlin/Function1;", "block", "l", "<set-?>", "b", "[Lkotlinx/coroutines/flow/internal/c;", "o", "()[Lkotlinx/coroutines/flow/internal/c;", "getSlots$annotations", "()V", "slots", ak.aF, "I", "n", "()I", "nCollectors", "d", "nextIndex", "Lkotlinx/coroutines/flow/internal/o;", "e", "Lkotlinx/coroutines/flow/internal/o;", "_subscriptionCount", "Lkotlinx/coroutines/flow/u;", "()Lkotlinx/coroutines/flow/u;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class a<S extends c<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private S[] slots;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nCollectors;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int nextIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private o _subscriptionCount;

    protected static /* synthetic */ void p() {
    }

    @dl.d
    public final u<Integer> e() {
        o oVar;
        synchronized (this) {
            oVar = this._subscriptionCount;
            if (oVar == null) {
                oVar = new o(this.nCollectors);
                this._subscriptionCount = oVar;
            }
        }
        return oVar;
    }

    @dl.d
    protected final S i() {
        S s10;
        o oVar;
        synchronized (this) {
            S[] sArr = this.slots;
            if (sArr == null) {
                sArr = (S[]) k(2);
                this.slots = sArr;
            } else if (this.nCollectors >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                f0.o(objArrCopyOf, "copyOf(this, newSize)");
                this.slots = (S[]) ((c[]) objArrCopyOf);
                sArr = (S[]) ((c[]) objArrCopyOf);
            }
            int i10 = this.nextIndex;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = (S) j();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
            } while (!s10.a(this));
            this.nextIndex = i10;
            this.nCollectors++;
            oVar = this._subscriptionCount;
        }
        if (oVar != null) {
            oVar.f0(1);
        }
        return s10;
    }

    @dl.d
    protected abstract S j();

    @dl.d
    protected abstract S[] k(int size);

    protected final void l(@dl.d yh.l<? super S, b2> lVar) {
        c[] cVarArr;
        if (this.nCollectors == 0 || (cVarArr = this.slots) == null) {
            return;
        }
        for (c cVar : cVarArr) {
            if (cVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    protected final void m(@dl.d S slot) {
        o oVar;
        int i10;
        kotlin.coroutines.c<b2>[] cVarArrB;
        synchronized (this) {
            int i11 = this.nCollectors - 1;
            this.nCollectors = i11;
            oVar = this._subscriptionCount;
            if (i11 == 0) {
                this.nextIndex = 0;
            }
            cVarArrB = slot.b(this);
        }
        for (kotlin.coroutines.c<b2> cVar : cVarArrB) {
            if (cVar != null) {
                Result.a aVar = Result.f124476c;
                cVar.resumeWith(Result.b(b2.f124493a));
            }
        }
        if (oVar != null) {
            oVar.f0(-1);
        }
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    protected final int getNCollectors() {
        return this.nCollectors;
    }

    @dl.e
    protected final S[] o() {
        return this.slots;
    }
}

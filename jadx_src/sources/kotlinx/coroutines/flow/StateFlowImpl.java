package kotlinx.coroutines.flow;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00107\u001a\u00020\u0007¢\u0006\u0004\b8\u00101J!\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010,R*\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b2\u0010\u0017\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/w;", "Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/internal/i;", "", "expectedState", "newState", "", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "compareAndSet", "value", "d", "(Ljava/lang/Object;)Z", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "()V", "Lkotlinx/coroutines/flow/f;", "collector", "", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "q", "()Lkotlinx/coroutines/flow/w;", "", UiKitSpanObj.TYPE_SIZE, "", "r", "(I)[Lkotlinx/coroutines/flow/w;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e;", "f", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "", "b", "()Ljava/util/List;", "replayCache", "initialState", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.a<w> implements j<T>, a<T>, kotlinx.coroutines.flow.internal.i<T> {

    @dl.d
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int sequence;

    public StateFlowImpl(@dl.d Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void s() {
    }

    private final boolean t(Object expectedState, Object newState) {
        int i10;
        w[] wVarArrO;
        o();
        synchronized (this) {
            Object obj = this._state;
            if (expectedState != null && !f0.g(obj, expectedState)) {
                return false;
            }
            if (f0.g(obj, newState)) {
                return true;
            }
            this._state = newState;
            int i11 = this.sequence;
            if ((i11 & 1) != 0) {
                this.sequence = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.sequence = i12;
            w[] wVarArrO2 = o();
            b2 b2Var = b2.f124493a;
            while (true) {
                w[] wVarArr = wVarArrO2;
                if (wVarArr != null) {
                    for (w wVar : wVarArr) {
                        if (wVar != null) {
                            wVar.f();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.sequence;
                    if (i10 == i12) {
                        this.sequence = i12 + 1;
                        return true;
                    }
                    wVarArrO = o();
                    b2 b2Var2 = b2.f124493a;
                }
                wVarArrO2 = wVarArrO;
                i12 = i10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00af A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlinx.coroutines.flow.w] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d4 -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e6 -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:38:0x00af
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @dl.e
    public java.lang.Object a(@dl.d kotlinx.coroutines.flow.f<? super T> r11, @dl.d kotlin.coroutines.c<?> r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.a(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.n
    @dl.d
    public List<T> b() {
        return kotlin.collections.s.k(getValue());
    }

    @Override // kotlinx.coroutines.flow.i
    public void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.j
    public boolean compareAndSet(T expect, T update) {
        if (expect == null) {
            expect = (T) kotlinx.coroutines.flow.internal.l.f130082a;
        }
        if (update == null) {
            update = (T) kotlinx.coroutines.flow.internal.l.f130082a;
        }
        return t(expect, update);
    }

    @Override // kotlinx.coroutines.flow.i
    public boolean d(T value) {
        setValue(value);
        return true;
    }

    @Override // kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        setValue(t10);
        return b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @dl.d
    public e<T> f(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return v.d(this, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.u
    public T getValue() {
        o0 o0Var = kotlinx.coroutines.flow.internal.l.f130082a;
        T t10 = (T) this._state;
        if (t10 == o0Var) {
            return null;
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @dl.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public w j() {
        return new w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @dl.d
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public w[] k(int size) {
        return new w[size];
    }

    @Override // kotlinx.coroutines.flow.j
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) kotlinx.coroutines.flow.internal.l.f130082a;
        }
        t(null, t10);
    }
}

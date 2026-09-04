package kotlinx.coroutines.flow;

import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00014B\u001f\u0012\u0006\u0010I\u001a\u00020\u0016\u0012\u0006\u0010K\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bl\u0010mJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010I\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010?R\u0014\u0010K\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010?R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\rR\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\rR\u0016\u0010V\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010?R\u0016\u0010X\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010?R\u0014\u0010Z\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u00109R\u0014\u0010]\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0014\u0010a\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u00109R\u0014\u0010b\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u00109R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010k\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bi\u0010j\u001a\u0004\bg\u0010h\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006n"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/p;", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/internal/i;", "value", "", "X", "(Ljava/lang/Object;)Z", "Y", "Lkotlin/b2;", "J", "", "newHead", "G", "", ChannelListActivity.q.f79586f, "M", "", "curBuffer", "", "curSize", "newSize", androidx.exifinterface.media.a.T4, "([Ljava/lang/Object;II)[Ljava/lang/Object;", "L", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "emitter", "D", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "b0", androidx.exifinterface.media.a.S4, "slot", "a0", "Z", UCropPlusActivity.ARG_INDEX, androidx.exifinterface.media.a.R4, "C", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/c;", "resumesIn", "N", "([Lkotlin/coroutines/c;)[Lkotlin/coroutines/c;", "Lkotlinx/coroutines/flow/f;", "collector", "", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "d", "emit", "d0", "()J", "oldIndex", "c0", "(J)[Lkotlin/coroutines/c;", "H", UiKitSpanObj.TYPE_SIZE, "I", "(I)[Lkotlinx/coroutines/flow/p;", ak.aF, "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e;", "f", "replay", "g", "bufferCapacity", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/channels/BufferOverflow;", "i", "[Ljava/lang/Object;", "buffer", "j", "replayIndex", "k", "minCollectorIndex", "l", "bufferSize", "m", "queueSize", "P", "head", "U", "()I", "replaySize", androidx.exifinterface.media.a.X4, Progress.H, "O", "bufferEndIndex", "queueEndIndex", "", "b", "()Ljava/util/List;", "replayCache", "Q", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.a<p> implements i<T>, kotlinx.coroutines.flow.a<T>, kotlinx.coroutines.flow.internal.i<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int replay;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int bufferCapacity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object[] buffer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long replayIndex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long minCollectorIndex;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int bufferSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int queueSize;

    /* JADX INFO: compiled from: SharedFlow.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "Lkotlinx/coroutines/h1;", "Lkotlin/b2;", "dispose", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "b", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "flow", "", ak.aF, "J", UCropPlusActivity.ARG_INDEX, "", "d", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/c;", "e", "Lkotlin/coroutines/c;", "cont", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements h1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final SharedFlowImpl<?> flow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public long index;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        @xh.e
        public final Object value;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final kotlin.coroutines.c<b2> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d SharedFlowImpl<?> sharedFlowImpl, long j10, @dl.e Object obj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.flow = sharedFlowImpl;
            this.index = j10;
            this.value = obj;
            this.cont = cVar;
        }

        @Override // kotlinx.coroutines.h1
        public void dispose() {
            this.flow.D(this);
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129885a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f129885a = iArr;
        }
    }

    public SharedFlowImpl(int i10, int i11, @dl.d BufferOverflow bufferOverflow) {
        this.replay = i10;
        this.bufferCapacity = i11;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(p pVar, kotlin.coroutines.c<? super b2> cVar) {
        b2 b2Var;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        synchronized (this) {
            if (Z(pVar) < 0) {
                pVar.cont = qVar;
            } else {
                Result.a aVar = Result.f124476c;
                qVar.resumeWith(Result.b(b2.f124493a));
            }
            b2Var = b2.f124493a;
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(a aVar) {
        synchronized (this) {
            if (aVar.index < P()) {
                return;
            }
            Object[] objArr = this.buffer;
            f0.m(objArr);
            if (o.f(objArr, aVar.index) != aVar) {
                return;
            }
            o.h(objArr, aVar.index, o.f130093a);
            E();
            b2 b2Var = b2.f124493a;
        }
    }

    private final void E() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            f0.m(objArr);
            while (this.queueSize > 0 && o.f(objArr, (P() + ((long) V())) - 1) == o.f130093a) {
                this.queueSize--;
                o.h(objArr, P() + ((long) V()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object F(SharedFlowImpl sharedFlowImpl, f fVar, kotlin.coroutines.c cVar) throws Throwable {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        SharedFlowImpl sharedFlowImpl2;
        Throwable th2;
        p pVar;
        f fVar2;
        d2 d2Var;
        f fVar3;
        if (cVar instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) cVar;
            int i10 = sharedFlowImpl$collect$1.f129892h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.f129892h = i10 - Integer.MIN_VALUE;
            } else {
                sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(sharedFlowImpl, cVar);
            }
        } else {
            sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(sharedFlowImpl, cVar);
        }
        Object obj = sharedFlowImpl$collect$1.f129890f;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = sharedFlowImpl$collect$1.f129892h;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar = (p) sharedFlowImpl$collect$1.f129888d;
                f fVar4 = (f) sharedFlowImpl$collect$1.f129887c;
                SharedFlowImpl sharedFlowImpl3 = (SharedFlowImpl) sharedFlowImpl$collect$1.f129886b;
                try {
                    t0.n(obj);
                    fVar2 = fVar4;
                    sharedFlowImpl = sharedFlowImpl3;
                    try {
                        d2Var = (d2) sharedFlowImpl$collect$1.getContext().f(d2.INSTANCE);
                        fVar3 = fVar2;
                    } catch (Throwable th3) {
                        sharedFlowImpl2 = sharedFlowImpl;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    sharedFlowImpl2 = sharedFlowImpl3;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d2 d2Var2 = (d2) sharedFlowImpl$collect$1.f129889e;
                pVar = (p) sharedFlowImpl$collect$1.f129888d;
                f fVar5 = (f) sharedFlowImpl$collect$1.f129887c;
                sharedFlowImpl2 = (SharedFlowImpl) sharedFlowImpl$collect$1.f129886b;
                try {
                    t0.n(obj);
                    fVar3 = fVar5;
                    d2Var = d2Var2;
                    sharedFlowImpl = sharedFlowImpl2;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            sharedFlowImpl2.m(pVar);
            throw th2;
        }
        t0.n(obj);
        p pVarI = sharedFlowImpl.i();
        try {
            if (fVar instanceof SubscribedFlowCollector) {
                sharedFlowImpl$collect$1.f129886b = sharedFlowImpl;
                sharedFlowImpl$collect$1.f129887c = fVar;
                sharedFlowImpl$collect$1.f129888d = pVarI;
                sharedFlowImpl$collect$1.f129892h = 1;
                if (((SubscribedFlowCollector) fVar).a(sharedFlowImpl$collect$1) == objH) {
                    return objH;
                }
            }
            fVar2 = fVar;
            pVar = pVarI;
            d2Var = (d2) sharedFlowImpl$collect$1.getContext().f(d2.INSTANCE);
            fVar3 = fVar2;
        } catch (Throwable th6) {
            sharedFlowImpl2 = sharedFlowImpl;
            th2 = th6;
            pVar = pVarI;
        }
        while (true) {
            Object objA0 = sharedFlowImpl.a0(pVar);
            if (objA0 == o.f130093a) {
                sharedFlowImpl$collect$1.f129886b = sharedFlowImpl;
                sharedFlowImpl$collect$1.f129887c = fVar3;
                sharedFlowImpl$collect$1.f129888d = pVar;
                sharedFlowImpl$collect$1.f129889e = d2Var;
                sharedFlowImpl$collect$1.f129892h = 2;
                if (sharedFlowImpl.C(pVar, sharedFlowImpl$collect$1) == objH) {
                    return objH;
                }
            } else {
                if (d2Var != null) {
                    g2.A(d2Var);
                }
                sharedFlowImpl$collect$1.f129886b = sharedFlowImpl;
                sharedFlowImpl$collect$1.f129887c = fVar3;
                sharedFlowImpl$collect$1.f129888d = pVar;
                sharedFlowImpl$collect$1.f129889e = d2Var;
                sharedFlowImpl$collect$1.f129892h = 3;
                if (fVar3.emit(objA0, sharedFlowImpl$collect$1) == objH) {
                    return objH;
                }
            }
        }
    }

    private final void G(long j10) {
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        if (((kotlinx.coroutines.flow.internal.a) this).nCollectors != 0 && (cVarArr = ((kotlinx.coroutines.flow.internal.a) this).slots) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : cVarArr) {
                if (cVar != null) {
                    p pVar = (p) cVar;
                    long j11 = pVar.index;
                    if (j11 >= 0 && j11 < j10) {
                        pVar.index = j10;
                    }
                }
            }
        }
        this.minCollectorIndex = j10;
    }

    private final void J() {
        Object[] objArr = this.buffer;
        f0.m(objArr);
        o.h(objArr, P(), null);
        this.bufferSize--;
        long jP = P() + 1;
        if (this.replayIndex < jP) {
            this.replayIndex = jP;
        }
        if (this.minCollectorIndex < jP) {
            G(jP);
        }
    }

    static /* synthetic */ Object K(SharedFlowImpl sharedFlowImpl, Object obj, kotlin.coroutines.c cVar) {
        Object objL;
        return (!sharedFlowImpl.d(obj) && (objL = sharedFlowImpl.L(obj, cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objL : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(T t10, kotlin.coroutines.c<? super b2> cVar) {
        kotlin.coroutines.c<b2>[] cVarArrN;
        a aVar;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        kotlin.coroutines.c<b2>[] cVarArrN2 = kotlinx.coroutines.flow.internal.b.f130076a;
        synchronized (this) {
            if (X(t10)) {
                Result.a aVar2 = Result.f124476c;
                qVar.resumeWith(Result.b(b2.f124493a));
                cVarArrN = N(cVarArrN2);
                aVar = null;
            } else {
                a aVar3 = new a(this, ((long) V()) + P(), t10, qVar);
                M(aVar3);
                this.queueSize++;
                if (this.bufferCapacity == 0) {
                    cVarArrN2 = N(cVarArrN2);
                }
                cVarArrN = cVarArrN2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            kotlinx.coroutines.s.a(qVar, aVar);
        }
        for (kotlin.coroutines.c<b2> cVar2 : cVarArrN) {
            if (cVar2 != null) {
                Result.a aVar4 = Result.f124476c;
                cVar2.resumeWith(Result.b(b2.f124493a));
            }
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Object obj) {
        int iV = V();
        Object[] objArrW = this.buffer;
        if (objArrW == null) {
            objArrW = W(null, 0, 2);
        } else if (iV >= objArrW.length) {
            objArrW = W(objArrW, iV, objArrW.length * 2);
        }
        o.h(objArrW, P() + ((long) iV), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.c<kotlin.b2>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final kotlin.coroutines.c<b2>[] N(kotlin.coroutines.c<b2>[] resumesIn) {
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        p pVar;
        kotlin.coroutines.c<? super b2> cVar;
        int length = resumesIn.length;
        if (((kotlinx.coroutines.flow.internal.a) this).nCollectors != 0 && (cVarArr = ((kotlinx.coroutines.flow.internal.a) this).slots) != null) {
            int i10 = 0;
            int length2 = cVarArr.length;
            while (i10 < length2) {
                kotlinx.coroutines.flow.internal.c cVar2 = cVarArr[i10];
                if (cVar2 == null || (cVar = (pVar = (p) cVar2).cont) == null || Z(pVar) < 0) {
                    resumesIn = resumesIn;
                } else {
                    if (length >= resumesIn.length) {
                        resumesIn = resumesIn;
                        resumesIn = resumesIn;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) resumesIn, Math.max(2, resumesIn.length * 2));
                        f0.o(objArrCopyOf, "copyOf(this, newSize)");
                        resumesIn = objArrCopyOf;
                    }
                    resumesIn = resumesIn;
                    resumesIn = resumesIn;
                    ((kotlin.coroutines.c[]) resumesIn)[length] = cVar;
                    pVar.cont = null;
                    length++;
                }
                i10++;
                resumesIn = resumesIn;
            }
            resumesIn = resumesIn;
        }
        return (kotlin.coroutines.c[]) resumesIn;
    }

    private final long O() {
        return P() + ((long) this.bufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long P() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    protected static /* synthetic */ void R() {
    }

    private final Object S(long index) {
        Object[] objArr = this.buffer;
        f0.m(objArr);
        Object objF = o.f(objArr, index);
        return objF instanceof a ? ((a) objF).value : objF;
    }

    private final long T() {
        return P() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    private final int U() {
        return (int) ((P() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int V() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] W(Object[] curBuffer, int curSize, int newSize) {
        if (!(newSize > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer == null) {
            return objArr;
        }
        long jP = P();
        for (int i10 = 0; i10 < curSize; i10++) {
            long j10 = ((long) i10) + jP;
            o.h(objArr, j10, o.f(curBuffer, j10));
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X(T value) {
        if (getNCollectors() == 0) {
            return Y(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i10 = b.f129885a[this.onBufferOverflow.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        M(value);
        int i11 = this.bufferSize + 1;
        this.bufferSize = i11;
        if (i11 > this.bufferCapacity) {
            J();
        }
        if (U() > this.replay) {
            b0(this.replayIndex + 1, this.minCollectorIndex, O(), T());
        }
        return true;
    }

    private final boolean Y(T value) {
        if (this.replay == 0) {
            return true;
        }
        M(value);
        int i10 = this.bufferSize + 1;
        this.bufferSize = i10;
        if (i10 > this.replay) {
            J();
        }
        this.minCollectorIndex = P() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Z(p slot) {
        long j10 = slot.index;
        if (j10 < O()) {
            return j10;
        }
        if (this.bufferCapacity <= 0 && j10 <= P() && this.queueSize != 0) {
            return j10;
        }
        return -1L;
    }

    private final Object a0(p slot) {
        Object obj;
        kotlin.coroutines.c<b2>[] cVarArrC0 = kotlinx.coroutines.flow.internal.b.f130076a;
        synchronized (this) {
            long jZ = Z(slot);
            if (jZ < 0) {
                obj = o.f130093a;
            } else {
                long j10 = slot.index;
                Object objS = S(jZ);
                slot.index = jZ + 1;
                cVarArrC0 = c0(j10);
                obj = objS;
            }
        }
        for (kotlin.coroutines.c<b2> cVar : cVarArrC0) {
            if (cVar != null) {
                Result.a aVar = Result.f124476c;
                cVar.resumeWith(Result.b(b2.f124493a));
            }
        }
        return obj;
    }

    private final void b0(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jP = P(); jP < jMin; jP++) {
            Object[] objArr = this.buffer;
            f0.m(objArr);
            o.h(objArr, jP, null);
        }
        this.replayIndex = j10;
        this.minCollectorIndex = j11;
        this.bufferSize = (int) (j12 - jMin);
        this.queueSize = (int) (j13 - j12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @dl.d
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public p j() {
        return new p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @dl.d
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public p[] k(int size) {
        return new p[size];
    }

    protected final T Q() {
        Object[] objArr = this.buffer;
        f0.m(objArr);
        return (T) o.f(objArr, (this.replayIndex + ((long) U())) - 1);
    }

    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<?> cVar) {
        return F(this, fVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.n
    @dl.d
    public List<T> b() {
        synchronized (this) {
            int iU = U();
            if (iU == 0) {
                return CollectionsKt__CollectionsKt.E();
            }
            ArrayList arrayList = new ArrayList(iU);
            Object[] objArr = this.buffer;
            f0.m(objArr);
            for (int i10 = 0; i10 < iU; i10++) {
                arrayList.add(o.f(objArr, this.replayIndex + ((long) i10)));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.i
    public void c() {
        synchronized (this) {
            b0(O(), this.minCollectorIndex, O(), T());
            b2 b2Var = b2.f124493a;
        }
    }

    @dl.d
    public final kotlin.coroutines.c<b2>[] c0(long oldIndex) {
        long j10;
        long j11;
        long j12;
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        if (oldIndex > this.minCollectorIndex) {
            return kotlinx.coroutines.flow.internal.b.f130076a;
        }
        long jP = P();
        long j13 = ((long) this.bufferSize) + jP;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j13++;
        }
        if (((kotlinx.coroutines.flow.internal.a) this).nCollectors != 0 && (cVarArr = ((kotlinx.coroutines.flow.internal.a) this).slots) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : cVarArr) {
                if (cVar != null) {
                    long j14 = ((p) cVar).index;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.minCollectorIndex) {
            return kotlinx.coroutines.flow.internal.b.f130076a;
        }
        long jO = O();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (jO - j13))) : this.queueSize;
        kotlin.coroutines.c<b2>[] cVarArr2 = kotlinx.coroutines.flow.internal.b.f130076a;
        long j15 = ((long) this.queueSize) + jO;
        if (iMin > 0) {
            cVarArr2 = new kotlin.coroutines.c[iMin];
            Object[] objArr = this.buffer;
            f0.m(objArr);
            long j16 = jO;
            int i10 = 0;
            while (true) {
                if (jO >= j15) {
                    j10 = j13;
                    j11 = j15;
                    break;
                }
                Object objF = o.f(objArr, jO);
                j10 = j13;
                o0 o0Var = o.f130093a;
                if (objF == o0Var) {
                    j11 = j15;
                    j12 = 1;
                } else {
                    if (objF == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    }
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j11 = j15;
                    cVarArr2[i10] = aVar.cont;
                    o.h(objArr, jO, o0Var);
                    o.h(objArr, j16, aVar.value);
                    j12 = 1;
                    j16++;
                    if (i11 >= iMin) {
                        break;
                    }
                    i10 = i11;
                }
                jO += j12;
                j13 = j10;
                j15 = j11;
            }
            jO = j16;
        } else {
            j10 = j13;
            j11 = j15;
        }
        int i12 = (int) (jO - jP);
        long j17 = getNCollectors() == 0 ? jO : j10;
        long jMax = Math.max(this.replayIndex, jO - ((long) Math.min(this.replay, i12)));
        if (this.bufferCapacity == 0 && jMax < j11) {
            Object[] objArr2 = this.buffer;
            f0.m(objArr2);
            if (f0.g(o.f(objArr2, jMax), o.f130093a)) {
                jO++;
                jMax++;
            }
        }
        b0(jMax, j17, jO, j11);
        E();
        return (cVarArr2.length == 0) ^ true ? N(cVarArr2) : cVarArr2;
    }

    @Override // kotlinx.coroutines.flow.i
    public boolean d(T value) {
        int i10;
        boolean z10;
        kotlin.coroutines.c<b2>[] cVarArrN = kotlinx.coroutines.flow.internal.b.f130076a;
        synchronized (this) {
            if (X(value)) {
                cVarArrN = N(cVarArrN);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (kotlin.coroutines.c<b2> cVar : cVarArrN) {
            if (cVar != null) {
                Result.a aVar = Result.f124476c;
                cVar.resumeWith(Result.b(b2.f124493a));
            }
        }
        return z10;
    }

    public final long d0() {
        long j10 = this.replayIndex;
        if (j10 < this.minCollectorIndex) {
            this.minCollectorIndex = j10;
        }
        return j10;
    }

    @Override // kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return K(this, t10, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @dl.d
    public e<T> f(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return o.e(this, context, capacity, onBufferOverflow);
    }
}

package kotlinx.coroutines;

import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "block", "completion", "Lkotlin/b2;", "invoke", "(Lyh/l;Lkotlin/coroutines/c;)V", "R", "Lkotlin/Function2;", "Lkotlin/t;", SocialConstants.PARAM_RECEIVER, "(Lyh/p;Ljava/lang/Object;Lkotlin/coroutines/c;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX INFO: compiled from: CoroutineStart.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128683a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
            f128683a = iArr;
        }
    }

    @z1
    public static /* synthetic */ void isLazy$annotations() {
    }

    @z1
    public final <T> void invoke(@dl.d yh.l<? super kotlin.coroutines.c<? super T>, ? extends Object> block, @dl.d kotlin.coroutines.c<? super T> completion) throws Throwable {
        int i10 = a.f128683a[ordinal()];
        if (i10 == 1) {
            bj.a.d(block, completion);
            return;
        }
        if (i10 == 2) {
            kotlin.coroutines.e.h(block, completion);
        } else if (i10 == 3) {
            bj.b.a(block, completion);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @z1
    public final <R, T> void invoke(@dl.d yh.p<? super R, ? super kotlin.coroutines.c<? super T>, ? extends Object> block, R receiver, @dl.d kotlin.coroutines.c<? super T> completion) throws Throwable {
        int i10 = a.f128683a[ordinal()];
        if (i10 == 1) {
            bj.a.f(block, receiver, completion, null, 4, null);
            return;
        }
        if (i10 == 2) {
            kotlin.coroutines.e.i(block, receiver, completion);
        } else if (i10 == 3) {
            bj.b.b(block, receiver, completion);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}

package kotlinx.coroutines.selects;

import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&R\u0014\u0010\u0015\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/selects/f;", "R", "", "", "q", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "otherOp", "i", "Lkotlinx/coroutines/internal/b;", SocialConstants.PARAM_APP_DESC, "m", "", "exception", "Lkotlin/b2;", ak.aB, "Lkotlinx/coroutines/h1;", "handle", "p", "o", "()Z", "isSelected", "Lkotlin/coroutines/c;", "r", "()Lkotlin/coroutines/c;", "completion", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface f<R> {
    @dl.e
    Object i(@dl.e LockFreeLinkedListNode.PrepareOp otherOp);

    @dl.e
    Object m(@dl.d kotlinx.coroutines.internal.b desc);

    boolean o();

    void p(@dl.d h1 h1Var);

    boolean q();

    @dl.d
    kotlin.coroutines.c<R> r();

    void s(@dl.d Throwable th2);
}

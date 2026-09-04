package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "command", "b", "(Lyh/a;)V"}, k = 3, mv = {1, 7, 1})
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements yh.l<yh.a<? extends kotlin.b2>, kotlin.b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f15472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f15472b = androidComposeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(yh.a tmp0) {
        kotlin.jvm.internal.f0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void b(@dl.d final yh.a<kotlin.b2> command) {
        kotlin.jvm.internal.f0.p(command, "command");
        Handler handler = this.f15472b.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            command.invoke();
            return;
        }
        Handler handler2 = this.f15472b.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.m
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidComposeView$snapshotObserver$1.c(command);
                }
            });
        }
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.a<? extends kotlin.b2> aVar) {
        b(aVar);
        return kotlin.b2.f124493a;
    }
}

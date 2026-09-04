package androidx.compose.ui.viewinterop;

import android.os.Looper;
import dl.d;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "command", "b", "(Lyh/a;)V"}, k = 3, mv = {1, 7, 1})
public final class AndroidViewHolder$snapshotObserver$1 extends Lambda implements l<yh.a<? extends b2>, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f17058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$snapshotObserver$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f17058b = androidViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(yh.a tmp0) {
        f0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void b(@d final yh.a<b2> command) {
        f0.p(command, "command");
        if (this.f17058b.getHandler().getLooper() == Looper.myLooper()) {
            command.invoke();
        } else {
            this.f17058b.getHandler().post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder$snapshotObserver$1.c(command);
                }
            });
        }
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(yh.a<? extends b2> aVar) {
        b(aVar);
        return b2.f124493a;
    }
}

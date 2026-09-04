package androidx.compose.ui.viewinterop;

import android.os.Handler;
import dl.d;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "Lkotlin/b2;", "b", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V"}, k = 3, mv = {1, 7, 1})
public final class AndroidViewHolder$onCommitAffectingUpdate$1 extends Lambda implements l<AndroidViewHolder, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f17049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onCommitAffectingUpdate$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f17049b = androidViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(yh.a tmp0) {
        f0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void b(@d AndroidViewHolder it) {
        f0.p(it, "it");
        Handler handler = this.f17049b.getHandler();
        final yh.a aVar = this.f17049b.f17026n;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder$onCommitAffectingUpdate$1.c(aVar);
            }
        });
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(AndroidViewHolder androidViewHolder) {
        b(androidViewHolder);
        return b2.f124493a;
    }
}

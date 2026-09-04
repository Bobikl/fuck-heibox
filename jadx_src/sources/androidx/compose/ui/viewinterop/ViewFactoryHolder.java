package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.r;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.j2;
import androidx.compose.ui.platform.k2;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R$\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bRF\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016RB\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\""}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/k2;", ak.aG, "Landroid/view/View;", "getTypedView$ui_release", "()Landroid/view/View;", "setTypedView$ui_release", "(Landroid/view/View;)V", "typedView", "getViewRoot", "viewRoot", "Lkotlin/Function1;", "Landroid/content/Context;", "value", "factory", "Lyh/l;", "getFactory", "()Lyh/l;", "setFactory", "(Lyh/l;)V", "Lkotlin/b2;", "updateBlock", "getUpdateBlock", "setUpdateBlock", d.R, "Landroidx/compose/runtime/r;", "parentContext", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/r;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements k2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @e
    private T typedView;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @e
    private l<? super Context, ? extends T> f17089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private l<? super T, b2> f17090w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(@dl.d Context context, @e r rVar, @dl.d NestedScrollDispatcher dispatcher) {
        super(context, rVar, dispatcher);
        f0.p(context, "context");
        f0.p(dispatcher, "dispatcher");
        setClipChildren(false);
        this.f17090w = AndroidView_androidKt.b();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, r rVar, NestedScrollDispatcher nestedScrollDispatcher, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : rVar, (i10 & 4) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher);
    }

    @e
    public final l<Context, T> getFactory() {
        return this.f17089v;
    }

    @Override // androidx.compose.ui.platform.k2
    public /* synthetic */ AbstractComposeView getSubCompositionView() {
        return j2.a(this);
    }

    @e
    public final T getTypedView$ui_release() {
        return this.typedView;
    }

    @dl.d
    public final l<T, b2> getUpdateBlock() {
        return this.f17090w;
    }

    @Override // androidx.compose.ui.platform.k2
    @dl.d
    public View getViewRoot() {
        return this;
    }

    public final void setFactory(@e l<? super Context, ? extends T> lVar) {
        this.f17089v = lVar;
        if (lVar != null) {
            Context context = getContext();
            f0.o(context, "context");
            T tInvoke = lVar.invoke(context);
            this.typedView = tInvoke;
            setView$ui_release(tInvoke);
        }
    }

    public final void setTypedView$ui_release(@e T t10) {
        this.typedView = t10;
    }

    public final void setUpdateBlock(@dl.d l<? super T, b2> value) {
        f0.p(value, "value");
        this.f17090w = value;
        setUpdate(new yh.a<b2>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewFactoryHolder<T> f17091b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f17091b = this;
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View typedView$ui_release = this.f17091b.getTypedView$ui_release();
                if (typedView$ui_release != null) {
                    this.f17091b.getUpdateBlock().invoke(typedView$ui_release);
                }
            }
        });
    }
}

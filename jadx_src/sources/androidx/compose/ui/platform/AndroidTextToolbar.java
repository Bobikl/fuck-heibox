package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidTextToolbar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJP\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\r\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/w1;", "Lb1/i;", "rect", "Lkotlin/Function0;", "Lkotlin/b2;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "b", "hide", "Landroid/view/View;", ak.av, "Landroid/view/View;", sd.b.f139384b, "Landroid/view/ActionMode;", "Landroid/view/ActionMode;", "actionMode", "Landroidx/compose/ui/platform/TextToolbarStatus;", "<set-?>", "d", "Landroidx/compose/ui/platform/TextToolbarStatus;", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidTextToolbar implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private ActionMode actionMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final i1.c f15557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private TextToolbarStatus status;

    public AndroidTextToolbar(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        this.view = view;
        this.f15557c = new i1.c(new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                invoke2();
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f15559b.actionMode = null;
            }
        }, null, null, null, null, null, 62, null);
        this.status = TextToolbarStatus.Hidden;
    }

    @Override // androidx.compose.ui.platform.w1
    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.w1
    public void b(@dl.d b1.i rect, @dl.e yh.a<kotlin.b2> aVar, @dl.e yh.a<kotlin.b2> aVar2, @dl.e yh.a<kotlin.b2> aVar3, @dl.e yh.a<kotlin.b2> aVar4) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        this.f15557c.q(rect);
        this.f15557c.m(aVar);
        this.f15557c.n(aVar3);
        this.f15557c.o(aVar2);
        this.f15557c.p(aVar4);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = x1.f15997a.b(this.view, new i1.a(this.f15557c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.w1
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }
}

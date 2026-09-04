package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidTextToolbar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(23)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/x1;", "", "Landroid/view/View;", sd.b.f139384b, "Landroid/view/ActionMode$Callback;", "actionModeCallback", "", "type", "Landroid/view/ActionMode;", "b", "actionMode", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final x1 f15997a = new x1();

    private x1() {
    }

    @androidx.annotation.u
    @androidx.annotation.w0(23)
    public final void a(@dl.d ActionMode actionMode) {
        kotlin.jvm.internal.f0.p(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    @androidx.annotation.u
    @androidx.annotation.w0(23)
    @dl.e
    public final ActionMode b(@dl.d View view, @dl.d ActionMode.Callback actionModeCallback, int type) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(actionModeCallback, "actionModeCallback");
        return view.startActionMode(actionModeCallback, type);
    }
}

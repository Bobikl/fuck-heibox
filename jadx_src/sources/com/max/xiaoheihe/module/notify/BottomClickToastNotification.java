package com.max.xiaoheihe.module.notify;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.inappnotification.Direction;
import com.max.hbcommon.component.inappnotification.a;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kb.c;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: BottomClickToastNotification.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class BottomClickToastNotification extends a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f91522m = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private final String f91523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private final String f91524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f91525l;

    public BottomClickToastNotification(@e Context context, @e String str, @e String str2, long j10) {
        super(context, true, j10, false, Direction.DOWN, 0, 0, true, false, 256, null);
        this.f91523j = str;
        this.f91524k = str2;
        this.f91525l = j10;
    }

    public /* synthetic */ BottomClickToastNotification(Context context, String str, String str2, long j10, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : context, str, str2, (i10 & 8) != 0 ? 3000L : j10);
    }

    @Override // com.max.hbcommon.component.inappnotification.a
    @e
    public View g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42816, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        Context contextF = f();
        if (contextF == null) {
            return null;
        }
        View viewInflate = c.d(contextF).inflate(R.layout.layout_toast_click_bottom_hint, (ViewGroup) new FrameLayout(contextF), false);
        k.f(r0.a(e1.e()), null, null, new BottomClickToastNotification$getView$1$1$1(viewInflate, this, contextF, null), 3, null);
        return viewInflate;
    }
}

package com.max.xiaoheihe.module.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.video.impl.StatusInfoTopPanel;
import com.max.xiaoheihe.module.video.action.VideoFollowAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: VideoPostTopPanel.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nVideoPostTopPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPostTopPanel.kt\ncom/max/xiaoheihe/module/video/VideoPostTopPanel\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,62:1\n36#2:63\n36#2:64\n*S KotlinDebug\n*F\n+ 1 VideoPostTopPanel.kt\ncom/max/xiaoheihe/module/video/VideoPostTopPanel\n*L\n35#1:63\n54#1:64\n*E\n"})
@o(parameters = 0)
public final class VideoPostTopPanel extends StatusInfoTopPanel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f93546e = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private VideoFollowAction f93547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPostTopPanel(@d Context context) {
        super(context);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPostTopPanel(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPostTopPanel(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPostTopPanel(@d Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
    }

    public final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46226, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoFollowAction videoFollowAction = this.f93547d;
        View viewC = videoFollowAction != null ? videoFollowAction.c() : null;
        if (this.f93547d != null && viewC != null) {
            LinearLayout linearLayout = getBinding().f141286g;
            f0.o(linearLayout, "binding.vgTopPanelRoot");
            if (linearLayout.indexOfChild(viewC) != -1) {
                getBinding().f141286g.removeView(viewC);
            }
        }
        this.f93547d = null;
    }

    public final void l(@d VideoFollowAction followAction) {
        if (PatchProxy.proxy(new Object[]{followAction}, this, changeQuickRedirect, false, 46225, new Class[]{VideoFollowAction.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followAction, "followAction");
        VideoFollowAction videoFollowAction = this.f93547d;
        View viewC = videoFollowAction != null ? videoFollowAction.c() : null;
        if (this.f93547d != null && viewC != null) {
            LinearLayout linearLayout = getBinding().f141286g;
            f0.o(linearLayout, "binding.vgTopPanelRoot");
            if (linearLayout.indexOfChild(viewC) != -1) {
                getBinding().f141286g.removeView(viewC);
            }
        }
        this.f93547d = followAction;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ye.b bVar = ye.b.f141790a;
        Context context = getContext();
        f0.o(context, "context");
        layoutParams.leftMargin = bVar.a(context, 12.0f);
        Context context2 = getContext();
        f0.o(context2, "context");
        layoutParams.topMargin = bVar.a(context2, 12.0f);
        getBinding().f141286g.addView(followAction.c(), layoutParams);
        requestLayout();
    }
}

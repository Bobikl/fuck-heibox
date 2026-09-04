package com.max.xiaoheihe.module.bbs.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.core.view.j3;
import androidx.core.view.n3;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: PicPostEditImeAnimationCallback.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPicPostEditImeAnimationCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicPostEditImeAnimationCallback.kt\ncom/max/xiaoheihe/module/bbs/utils/PicPostEditImeAnimationCallback\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,44:1\n260#2:45\n262#2,2:46\n*S KotlinDebug\n*F\n+ 1 PicPostEditImeAnimationCallback.kt\ncom/max/xiaoheihe/module/bbs/utils/PicPostEditImeAnimationCallback\n*L\n16#1:45\n41#1:46,2\n*E\n"})
@o(parameters = 0)
public final class e extends bf.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f83494l = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final View f83495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final View f83496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f83497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f83498k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d View rvImgPreview, @dl.d View rlEtContainer) {
        super(n3.m.d(), 0, 2, null);
        f0.p(rvImgPreview, "rvImgPreview");
        f0.p(rlEtContainer, "rlEtContainer");
        this.f83495h = rvImgPreview;
        this.f83496i = rlEtContainer;
    }

    private final boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31329, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !(this.f83495h.getVisibility() == 0);
    }

    @Override // androidx.core.view.j3.b
    public void c(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 31332, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        if (i()) {
            this.f83495h.setVisibility(0);
            this.f83496i.setTranslationY(0.0f);
        }
    }

    @Override // androidx.core.view.j3.b
    public void d(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 31330, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        if (i()) {
            ViewGroup.LayoutParams layoutParams = this.f83495h.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                this.f83498k = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + marginLayoutParams.height;
            }
        }
    }

    @Override // bf.a
    public void h(float f10) {
        if (!PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 31331, new Class[]{Float.TYPE}, Void.TYPE).isSupported && i()) {
            this.f83496i.setTranslationY(com.max.hbcommon.component.ezcalendarview.utils.a.o(this.f83497j, this.f83498k, f10));
        }
    }
}

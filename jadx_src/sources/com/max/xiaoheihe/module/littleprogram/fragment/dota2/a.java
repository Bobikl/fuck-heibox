package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import com.airbnb.lottie.LottieAnimationView;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Dota2BaseFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nDota2BaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2BaseFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2BaseFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,31:1\n262#2,2:32\n262#2,2:34\n262#2,2:36\n*S KotlinDebug\n*F\n+ 1 Dota2BaseFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2BaseFragment\n*L\n15#1:32,2\n19#1:34,2\n26#1:36,2\n*E\n"})
@o(parameters = 0)
public abstract class a extends d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f89089t = 0;

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    public void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38978, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.S4();
        ImageView imageView = J4().f111330b;
        f0.o(imageView, "baseBinding.ivBg");
        imageView.setVisibility(8);
        J4().f111336h.setBackgroundResource(R.color.dota2_bg_main_color);
        LottieAnimationView updateBackgroundRes$lambda$0 = J4().f111333e;
        try {
            f0.o(updateBackgroundRes$lambda$0, "updateBackgroundRes$lambda$0");
            updateBackgroundRes$lambda$0.setVisibility(0);
            if (new File(r.r(r.f95730g)).exists()) {
                AccelWorldLottieKt.a(updateBackgroundRes$lambda$0, r.f95730g);
            }
            updateBackgroundRes$lambda$0.E();
        } catch (Exception e10) {
            f0.o(updateBackgroundRes$lambda$0, "updateBackgroundRes$lambda$0");
            updateBackgroundRes$lambda$0.setVisibility(8);
            g.f74531b.v("TYPE_DOTA2_BACKGROUNG setLottieAnim fail, cause: " + e10);
        }
    }
}

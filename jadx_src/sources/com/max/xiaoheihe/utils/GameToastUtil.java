package com.max.xiaoheihe.utils;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: GameToastUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameToastUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final GameToastUtil f95249a = new GameToastUtil();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95250b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GameToastUtil.kt */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShineButton f95251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f95252c;

        a(ShineButton shineButton, Context context) {
            this.f95251b = shineButton;
            this.f95252c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48730, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f95251b.D(ViewUtils.f(this.f95252c, 175.0f), ViewUtils.f(this.f95252c, 104.0f), ViewUtils.f(this.f95252c, 87.5f), ViewUtils.f(this.f95252c, 35.0f));
        }
    }

    private GameToastUtil() {
    }

    @xh.m
    public static final void a(@dl.d Toast toast) {
        if (PatchProxy.proxy(new Object[]{toast}, null, changeQuickRedirect, true, 48729, new Class[]{Toast.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(toast, "toast");
        try {
            Field declaredField = toast.getClass().getDeclaredField("mTN");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            Field declaredField2 = obj.getClass().getDeclaredField("mParams");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            kotlin.jvm.internal.f0.n(obj2, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            ((WindowManager.LayoutParams) obj2).windowAnimations = R.style.HeyboxToastStyle;
        } catch (Throwable th2) {
            Log.e("makeToastSelfAnimation", String.valueOf(th2.getMessage()));
        }
    }

    @xh.m
    public static final void b() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BaseApplication baseApplicationA = BaseApplication.a();
        kotlin.jvm.internal.f0.o(baseApplicationA, "getInstance()");
        Toast toast = new Toast(baseApplicationA);
        a(toast);
        Object systemService = baseApplicationA.getSystemService("layout_inflater");
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.layout_success_toast, (ViewGroup) null);
        kotlin.jvm.internal.f0.o(viewInflate, "inflate.inflate(R.layout…yout_success_toast, null)");
        ShineButton shineButton = (ShineButton) viewInflate.findViewById(R.id.shine_button);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_toast_text);
        if (shineButton != null) {
            shineButton.setChecked(false, false);
        }
        if (textView != null) {
            textView.setText("关注成功");
        }
        toast.setView(viewInflate);
        toast.setGravity(17, 0, 0);
        toast.setDuration(0);
        toast.show();
        if (ad.a.c() <= 0) {
            kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new GameToastUtil$showSuccessToast$2(shineButton, baseApplicationA, null), 3, null);
        } else if (shineButton != null) {
            shineButton.postDelayed(new a(shineButton, baseApplicationA), 300L);
        }
    }
}

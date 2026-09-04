package com.max.mediaselector.lib.utils;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: AnimUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f75522a = 250;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(ImageView imageView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{imageView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.f35149y7, new Class[]{ImageView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = 0.0f;
        float f11 = 180.0f;
        if (!z10) {
            f11 = 0.0f;
            f10 = 180.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, androidx.constraintlayout.motion.widget.f.f18721i, f10, f11);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
    }
}

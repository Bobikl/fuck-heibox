package com.max.commentimagepainter;

import androidx.constraintlayout.core.motion.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: AccelWorld.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.max.commentimagepainter.AccelWorldKt", f = "AccelWorld.kt", i = {0, 0, 0, 0}, l = {31, 34}, m = "fastGetBlurBitmap", n = {com.umeng.analytics.pro.d.R, "colorOrigin", "heightOrigin", w.c.R}, s = {"L$0", "I$0", "I$1", "F$0"})
public final class AccelWorldKt$fastGetBlurBitmap$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f65088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f65089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f65090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f65091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f65092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f65093g;

    AccelWorldKt$fastGetBlurBitmap$1(c<? super AccelWorldKt$fastGetBlurBitmap$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1013, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f65092f = obj;
        this.f65093g |= Integer.MIN_VALUE;
        return AccelWorldKt.e(null, null, 0, 0, 0.0f, 0, 0, this);
    }
}

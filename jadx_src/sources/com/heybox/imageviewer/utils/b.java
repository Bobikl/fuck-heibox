package com.heybox.imageviewer.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/heybox/imageviewer/utils/ExtensionsKt\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,30:1\n54#2,4:31\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/heybox/imageviewer/utils/ExtensionsKt\n*L\n11#1:31,4\n*E\n"})
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    public static final View a(@dl.d ViewGroup viewGroup, int i10, @dl.d Object tag) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10), tag}, null, changeQuickRedirect, true, bb.c.b.J0, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(viewGroup, "<this>");
        f0.p(tag, "tag");
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            f0.o(childAt, "getChildAt(index)");
            if (f0.g(childAt.getTag(i10), tag)) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewA = a((ViewGroup) childAt, i10, tag)) != null) {
                return viewA;
            }
        }
        return null;
    }

    private static final Activity b(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 193, new Class[]{Context.class}, Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @dl.e
    public static final Activity c(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 192, new Class[]{View.class}, Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        f0.p(view, "<this>");
        return b(view.getContext());
    }
}

package com.heybox.imageviewer.utils;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.heybox.imageviewer.ImageViewerDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ViewModelUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/heybox/imageviewer/utils/ViewModelUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h f59803a = new h();
    public static ChangeQuickRedirect changeQuickRedirect;

    private h() {
    }

    @dl.e
    public final <T extends w0> T a(@dl.d View view, @dl.d Class<T> modelClass) {
        FragmentManager supportFragmentManager;
        List<Fragment> listJ0;
        Object next;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, modelClass}, this, changeQuickRedirect, false, bb.c.b.f31029x1, new Class[]{View.class, Class.class}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        f0.p(view, "view");
        f0.p(modelClass, "modelClass");
        Activity activityC = b.c(view);
        FragmentActivity fragmentActivity = activityC instanceof FragmentActivity ? (FragmentActivity) activityC : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (listJ0 = supportFragmentManager.J0()) == null) {
            return null;
        }
        Iterator<T> it = listJ0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Fragment) next) instanceof ImageViewerDialogFragment));
        Fragment fragment = (Fragment) next;
        if (fragment != null) {
            return (T) new y0(fragment).a(modelClass);
        }
        return null;
    }
}

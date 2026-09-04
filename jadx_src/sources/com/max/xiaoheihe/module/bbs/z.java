package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;

/* JADX INFO: compiled from: PostNativeRouterDialogFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class z extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f83506g = "link_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f83508f;

    /* JADX INFO: compiled from: PostNativeRouterDialogFragment.java */
    public class a extends com.max.hbcommon.network.d<Result<BBSLinkTreeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26748, new Class[]{Throwable.class}, Void.TYPE).isSupported && z.this.isActive()) {
                super.onError(th2);
                if (z.this.f83508f != null) {
                    z.this.f83508f.a();
                }
                z.this.dismiss();
            }
        }

        public void onNext(Result<BBSLinkTreeObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26749, new Class[]{Result.class}, Void.TYPE).isSupported && z.this.isActive()) {
                super.onNext(result);
                Context context = z.this.getContext();
                if (result.getResult() != null && result.getResult().getLink() != null && context != null) {
                    com.max.xiaoheihe.module.bbs.utils.b.E(context, result.getResult().getLink().toBBSLink());
                }
                if (z.this.f83508f != null) {
                    z.this.f83508f.onSuccess();
                }
                z.this.dismiss();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26750, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkTreeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PostNativeRouterDialogFragment.java */
    public interface b {
        void a();

        void onSuccess();
    }

    @SuppressLint({"AutoDispose"})
    private void O3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26746, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s(null, this.f83507e, "1", BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, "1", null, "0", "0", null, new HashMap()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    public static z P3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 26742, new Class[]{String.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        z zVar = new z();
        Bundle bundle = new Bundle();
        bundle.putString("link_id", str);
        zVar.setArguments(bundle);
        return zVar;
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public void Q3(b bVar) {
        this.f83508f = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 26743, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f83507e = getArguments().getString("link_id");
        }
        return layoutInflater.inflate(R.layout.hbcustomview_layout_loading_fragment, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26745, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        O3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 26744, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.tv_loading_description)).setText(c6.a.f35595i);
        int iF = ViewUtils.f(getContext(), 20.0f);
        view.setPadding(iF, ViewUtils.f(getContext(), 16.5f), iF, iF);
        ((CircularProgressIndicator) view.findViewById(R.id.progress_loading)).p();
    }

    @Override // androidx.fragment.app.j
    public void show(FragmentManager fragmentManager, String str) {
        if (PatchProxy.proxy(new Object[]{fragmentManager, str}, this, changeQuickRedirect, false, 26747, new Class[]{FragmentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception unused) {
        }
    }
}

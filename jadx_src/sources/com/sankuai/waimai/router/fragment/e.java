package com.sankuai.waimai.router.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.sankuai.waimai.router.core.i;

/* JADX INFO: compiled from: FragmentTransactionUriRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public class e extends com.sankuai.waimai.router.fragment.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final FragmentManager f96524o;

    /* JADX INFO: compiled from: FragmentTransactionUriRequest.java */
    public static class a implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FragmentManager f96525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f96526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f96527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f96528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f96529f;

        a(@n0 FragmentManager fragmentManager, @d0 int i10, int i11, boolean z10, String str) {
            this.f96525b = fragmentManager;
            this.f96526c = i10;
            this.f96527d = i11;
            this.f96528e = z10;
            this.f96529f = str;
        }

        @Override // com.sankuai.waimai.router.fragment.f
        public boolean a(@n0 i iVar, @n0 Bundle bundle) throws ActivityNotFoundException, SecurityException {
            String strK = iVar.k(d.f96522c);
            if (TextUtils.isEmpty(strK)) {
                com.sankuai.waimai.router.core.c.d("FragmentTransactionHandler.handleInternal()应返回的带有ClassName", new Object[0]);
                return false;
            }
            if (this.f96526c == 0) {
                com.sankuai.waimai.router.core.c.d("FragmentTransactionHandler.handleInternal()mContainerViewId", new Object[0]);
                return false;
            }
            try {
                Fragment fragmentInstantiate = Fragment.instantiate(iVar.b(), strK, bundle);
                if (fragmentInstantiate == null) {
                    return false;
                }
                FragmentTransaction fragmentTransactionBeginTransaction = this.f96525b.beginTransaction();
                int i10 = this.f96527d;
                if (i10 == 1) {
                    fragmentTransactionBeginTransaction.add(this.f96526c, fragmentInstantiate, this.f96529f);
                } else if (i10 == 2) {
                    fragmentTransactionBeginTransaction.replace(this.f96526c, fragmentInstantiate, this.f96529f);
                }
                if (this.f96528e) {
                    fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                } else {
                    fragmentTransactionBeginTransaction.commit();
                }
                return true;
            } catch (Exception e10) {
                com.sankuai.waimai.router.core.c.c(e10);
                return false;
            }
        }
    }

    public e(@n0 Activity activity, String str) {
        super(activity, str);
        this.f96524o = activity.getFragmentManager();
    }

    @w0(17)
    public e(@n0 Fragment fragment, String str) {
        super(fragment.getActivity(), str);
        this.f96524o = fragment.getChildFragmentManager();
    }

    public e(@n0 Context context, @n0 FragmentManager fragmentManager, String str) {
        super(context, str);
        this.f96524o = fragmentManager;
    }

    @Override // com.sankuai.waimai.router.fragment.b
    protected f D() {
        return new a(this.f96524o, this.f96517j, this.f96516i, this.f96518k, this.f96519l);
    }
}

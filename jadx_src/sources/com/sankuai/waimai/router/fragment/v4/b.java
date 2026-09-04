package com.sankuai.waimai.router.fragment.v4;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import com.sankuai.waimai.router.core.c;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.fragment.d;
import com.sankuai.waimai.router.fragment.f;

/* JADX INFO: compiled from: FragmentTransactionUriRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public class b extends com.sankuai.waimai.router.fragment.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final FragmentManager f96533o;

    /* JADX INFO: compiled from: FragmentTransactionUriRequest.java */
    public static class a implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FragmentManager f96534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f96535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f96536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f96537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f96538f;

        a(@n0 FragmentManager fragmentManager, @d0 int i10, int i11, boolean z10, String str) {
            this.f96534b = fragmentManager;
            this.f96535c = i10;
            this.f96536d = i11;
            this.f96537e = z10;
            this.f96538f = str;
        }

        @Override // com.sankuai.waimai.router.fragment.f
        public boolean a(@n0 i iVar, @n0 Bundle bundle) throws ActivityNotFoundException, SecurityException {
            String strK = iVar.k(d.f96522c);
            if (TextUtils.isEmpty(strK)) {
                c.d("FragmentTransactionHandler.handleInternal()应返回的带有ClassName", new Object[0]);
                return false;
            }
            if (this.f96535c == 0) {
                c.d("FragmentTransactionHandler.handleInternal()mContainerViewId", new Object[0]);
                return false;
            }
            try {
                Fragment fragmentInstantiate = Fragment.instantiate(iVar.b(), strK, bundle);
                if (fragmentInstantiate == null) {
                    return false;
                }
                p0 p0VarU = this.f96534b.u();
                int i10 = this.f96536d;
                if (i10 == 1) {
                    p0VarU.c(this.f96535c, fragmentInstantiate, this.f96538f);
                } else if (i10 == 2) {
                    p0VarU.z(this.f96535c, fragmentInstantiate, this.f96538f);
                }
                if (this.f96537e) {
                    p0VarU.n();
                } else {
                    p0VarU.m();
                }
                return true;
            } catch (Exception e10) {
                c.b("FragmentTransactionUriRequest", e10);
                return false;
            }
        }
    }

    public b(@n0 Context context, FragmentManager fragmentManager, String str) {
        super(context, str);
        this.f96533o = fragmentManager;
    }

    public b(@n0 Fragment fragment, String str) {
        super(fragment.getContext(), str);
        this.f96533o = fragment.getChildFragmentManager();
    }

    public b(@n0 FragmentActivity fragmentActivity, String str) {
        super(fragmentActivity, str);
        this.f96533o = fragmentActivity.getSupportFragmentManager();
    }

    @Override // com.sankuai.waimai.router.fragment.b
    protected f D() {
        return new a(this.f96533o, this.f96517j, this.f96516i, this.f96518k, this.f96519l);
    }
}

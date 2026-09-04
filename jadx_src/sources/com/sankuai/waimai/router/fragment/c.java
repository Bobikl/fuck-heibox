package com.sankuai.waimai.router.fragment;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.sankuai.waimai.router.core.i;

/* JADX INFO: compiled from: FragmentBuildUriRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f96520i = "CUSTOM_FRAGMENT_OBJ";

    /* JADX INFO: compiled from: FragmentBuildUriRequest.java */
    public class a implements f {
        a() {
        }

        @Override // com.sankuai.waimai.router.fragment.f
        public boolean a(@n0 i iVar, @n0 Bundle bundle) throws ActivityNotFoundException, SecurityException {
            String strK = iVar.k(d.f96522c);
            if (TextUtils.isEmpty(strK)) {
                com.sankuai.waimai.router.core.c.d("FragmentBuildUriRequest.handleInternal()应返回的带有ClassName", new Object[0]);
                return false;
            }
            try {
                Fragment fragmentInstantiate = Fragment.instantiate(iVar.b(), strK, bundle);
                if (fragmentInstantiate == null) {
                    return false;
                }
                iVar.s("CUSTOM_FRAGMENT_OBJ", fragmentInstantiate);
                return true;
            } catch (Exception e10) {
                com.sankuai.waimai.router.core.c.c(e10);
                return false;
            }
        }
    }

    public c(@n0 Context context, String str) {
        super(context, str);
    }

    @Override // com.sankuai.waimai.router.fragment.b
    protected f D() {
        return new a();
    }
}

package com.sankuai.waimai.router.common;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.fragment.app.Fragment;
import java.util.HashMap;

/* JADX INFO: compiled from: FragmentUriRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public class d extends c {

    /* JADX INFO: compiled from: FragmentUriRequest.java */
    public class a implements com.sankuai.waimai.router.activity.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Fragment f96426a;

        public a(Fragment fragment) {
            this.f96426a = fragment;
        }

        @Override // com.sankuai.waimai.router.activity.d
        public boolean a(@n0 com.sankuai.waimai.router.core.i iVar, @n0 Intent intent) throws ActivityNotFoundException, SecurityException {
            try {
                Bundle bundle = (Bundle) iVar.d(Bundle.class, com.sankuai.waimai.router.components.a.f96455e);
                Integer num = (Integer) iVar.d(Integer.class, com.sankuai.waimai.router.components.a.f96453c);
                if (num != null) {
                    this.f96426a.startActivityForResult(intent, num.intValue(), bundle);
                    return true;
                }
                this.f96426a.startActivity(intent, bundle);
                return true;
            } catch (ActivityNotFoundException e10) {
                com.sankuai.waimai.router.core.c.n(e10);
                return false;
            } catch (SecurityException e11) {
                com.sankuai.waimai.router.core.c.n(e11);
                return false;
            }
        }
    }

    public d(@n0 Fragment fragment, @n0 Uri uri) {
        super(fragment.getContext(), uri);
        u0(fragment);
    }

    public d(@n0 Fragment fragment, @n0 String str) {
        super(fragment.getContext(), str);
        u0(fragment);
    }

    public d(@n0 Fragment fragment, @n0 String str, HashMap<String, Object> map) {
        super(fragment.getContext(), str, map);
        u0(fragment);
    }

    private void u0(@n0 Fragment fragment) {
        s(com.sankuai.waimai.router.components.a.f96458h, new a(fragment));
    }
}

package com.sankuai.waimai.router.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;

/* JADX INFO: compiled from: FragmentTransactionHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f96522c = "FRAGMENT_CLASS_NAME";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final String f96523b;

    public d(@n0 String str) {
        this.f96523b = str;
    }

    @Override // com.sankuai.waimai.router.core.g
    protected void d(@n0 i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        if (TextUtils.isEmpty(this.f96523b)) {
            com.sankuai.waimai.router.core.c.d("FragmentTransactionHandler.handleInternal()应返回的带有ClassName", new Object[0]);
            fVar.onComplete(400);
            return;
        }
        f fVar2 = (f) iVar.d(f.class, f.f96530a);
        if (fVar2 == null) {
            com.sankuai.waimai.router.core.c.d("FragmentTransactionHandler.handleInternal()应返回的带有StartFragmentAction", new Object[0]);
            fVar.onComplete(400);
        } else {
            if (!iVar.n(f96522c)) {
                iVar.s(f96522c, this.f96523b);
            }
            fVar.onComplete(fVar2.a(iVar, (Bundle) iVar.d(Bundle.class, com.sankuai.waimai.router.components.a.f96452b)) ? 200 : 400);
        }
    }

    @Override // com.sankuai.waimai.router.core.g
    protected boolean e(@n0 i iVar) {
        return true;
    }

    @n0
    public String f() {
        return this.f96523b;
    }
}

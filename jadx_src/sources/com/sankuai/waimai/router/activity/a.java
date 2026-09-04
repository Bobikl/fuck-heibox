package com.sankuai.waimai.router.activity;

import android.content.Intent;
import androidx.annotation.n0;
import com.sankuai.waimai.router.components.h;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;

/* JADX INFO: compiled from: AbsActivityHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends g {
    @Override // com.sankuai.waimai.router.core.g
    protected void d(@n0 i iVar, @n0 f fVar) {
        Intent intentF = f(iVar);
        if (intentF == null || intentF.getComponent() == null) {
            com.sankuai.waimai.router.core.c.d("AbsActivityHandler.createIntent()应返回的带有ClassName的显式跳转Intent", new Object[0]);
            fVar.onComplete(500);
            return;
        }
        intentF.setData(iVar.m());
        com.sankuai.waimai.router.components.i.g(intentF, iVar);
        iVar.t(com.sankuai.waimai.router.components.a.f96457g, Boolean.valueOf(g()));
        int iF = h.f(iVar, intentF);
        h(iVar, iF);
        fVar.onComplete(iF);
    }

    @Override // com.sankuai.waimai.router.core.g
    protected boolean e(@n0 i iVar) {
        return true;
    }

    @n0
    protected abstract Intent f(@n0 i iVar);

    protected boolean g() {
        return true;
    }

    protected void h(@n0 i iVar, int i10) {
    }

    @Override // com.sankuai.waimai.router.core.g
    public String toString() {
        return "ActivityHandler";
    }
}

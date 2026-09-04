package com.sankuai.waimai.router.components;

import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.n0;

/* JADX INFO: compiled from: DefaultOnCompleteListener.java */
/* JADX INFO: loaded from: classes8.dex */
public class g implements com.sankuai.waimai.router.core.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f96466g = new g();

    @Override // com.sankuai.waimai.router.core.d
    public void onError(@n0 com.sankuai.waimai.router.core.i iVar, int i10) {
        String strL = iVar.l(com.sankuai.waimai.router.core.i.f96502h, null);
        if (TextUtils.isEmpty(strL)) {
            if (i10 != 403) {
                strL = i10 != 404 ? "跳转失败" : "找不到该页面";
            } else {
                strL = "没有权限";
            }
        }
        String str = strL + "(" + i10 + ")";
        if (com.sankuai.waimai.router.core.c.g()) {
            str = str + "\n" + iVar.m().toString();
        }
        Toast.makeText(iVar.b(), str, 1).show();
    }

    @Override // com.sankuai.waimai.router.core.d
    public void onSuccess(@n0 com.sankuai.waimai.router.core.i iVar) {
    }
}

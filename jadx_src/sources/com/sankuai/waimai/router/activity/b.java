package com.sankuai.waimai.router.activity;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.sankuai.waimai.router.core.i;

/* JADX INFO: compiled from: ActivityClassNameHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final String f96421b;

    public b(@n0 String str) {
        if (TextUtils.isEmpty(str)) {
            com.sankuai.waimai.router.core.c.e(new NullPointerException("className不应该为空"));
        }
        this.f96421b = str;
    }

    @Override // com.sankuai.waimai.router.activity.a
    @n0
    protected Intent f(@n0 i iVar) {
        return new Intent().setClassName(iVar.b(), this.f96421b);
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.g
    public String toString() {
        return "ActivityHandler (" + this.f96421b + ")";
    }
}

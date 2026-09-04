package com.sankuai.waimai.router.activity;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.n0;
import com.sankuai.waimai.router.core.i;

/* JADX INFO: compiled from: ActivityHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    protected final Class<? extends Activity> f96422b;

    public c(@n0 Class<? extends Activity> cls) {
        this.f96422b = cls;
    }

    @Override // com.sankuai.waimai.router.activity.a
    @n0
    protected Intent f(@n0 i iVar) {
        return new Intent(iVar.b(), this.f96422b);
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.g
    public String toString() {
        return "ActivityHandler (" + this.f96422b.getSimpleName() + ")";
    }
}

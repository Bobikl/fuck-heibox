package com.sankuai.waimai.router.regex;

import androidx.annotation.n0;
import com.sankuai.waimai.router.common.q;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RegexWrapperHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class d extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pattern f96541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f96542d;

    public d(@n0 Pattern pattern, int i10, @n0 g gVar) {
        super(gVar);
        this.f96541c = pattern;
        this.f96542d = i10;
    }

    @Override // com.sankuai.waimai.router.common.q, com.sankuai.waimai.router.core.g
    protected boolean e(@n0 i iVar) {
        return this.f96541c.matcher(iVar.m().toString()).matches();
    }

    public int g() {
        return this.f96542d;
    }

    @Override // com.sankuai.waimai.router.common.q, com.sankuai.waimai.router.core.g
    public String toString() {
        return "RegexWrapperHandler(" + this.f96541c + ")";
    }
}

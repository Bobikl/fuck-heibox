package com.sankuai.waimai.router.regex;

import androidx.annotation.n0;
import com.sankuai.waimai.router.components.h;
import com.sankuai.waimai.router.components.j;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: RegexAnnotationHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends com.sankuai.waimai.router.core.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.sankuai.waimai.router.utils.b f96539c = new a("RegexAnnotationHandler");

    /* JADX INFO: compiled from: RegexAnnotationHandler.java */
    public class a extends com.sankuai.waimai.router.utils.b {
        a(String str) {
            super(str);
        }

        @Override // com.sankuai.waimai.router.utils.b
        protected void a() {
            c.this.l();
        }
    }

    private Pattern k(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Pattern.compile(str);
        } catch (PatternSyntaxException e10) {
            com.sankuai.waimai.router.core.c.e(e10);
            return null;
        }
    }

    @Override // com.sankuai.waimai.router.core.g
    public void c(@n0 i iVar, @n0 f fVar) {
        this.f96539c.b();
        super.c(iVar, fVar);
    }

    protected void l() {
        h.b(this, b.class);
    }

    public void m() {
        this.f96539c.c();
    }

    public void n(String str, Object obj, boolean z10, int i10, com.sankuai.waimai.router.core.h... hVarArr) {
        g gVarB;
        Pattern patternK = k(str);
        if (patternK == null || (gVarB = j.b(obj, z10, hVarArr)) == null) {
            return;
        }
        h(new d(patternK, i10, gVarB), i10);
    }

    @Override // com.sankuai.waimai.router.core.g
    public String toString() {
        return "RegexAnnotationHandler";
    }
}

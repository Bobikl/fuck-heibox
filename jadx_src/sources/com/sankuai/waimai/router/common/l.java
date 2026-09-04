package com.sankuai.waimai.router.common;

import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Map;

/* JADX INFO: compiled from: PathHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class l extends com.sankuai.waimai.router.core.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private String f96436c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final com.sankuai.waimai.router.utils.a<com.sankuai.waimai.router.core.g> f96435b = new com.sankuai.waimai.router.utils.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private com.sankuai.waimai.router.core.g f96437d = null;

    /* JADX INFO: compiled from: PathHandler.java */
    public class a implements com.sankuai.waimai.router.core.f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.i f96438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.f f96439h;

        a(com.sankuai.waimai.router.core.i iVar, com.sankuai.waimai.router.core.f fVar) {
            this.f96438g = iVar;
            this.f96439h = fVar;
        }

        @Override // com.sankuai.waimai.router.core.f
        public void a() {
            l.this.h(this.f96438g, this.f96439h);
        }

        @Override // com.sankuai.waimai.router.core.f
        public void onComplete(int i10) {
            this.f96439h.onComplete(i10);
        }
    }

    private com.sankuai.waimai.router.core.g g(@n0 com.sankuai.waimai.router.core.i iVar) {
        String path = iVar.m().getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        String strB = com.sankuai.waimai.router.utils.f.b(path);
        if (TextUtils.isEmpty(this.f96436c)) {
            return this.f96435b.b(strB);
        }
        if (strB.startsWith(this.f96436c)) {
            return this.f96435b.b(strB.substring(this.f96436c.length()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        com.sankuai.waimai.router.core.g gVar = this.f96437d;
        if (gVar != null) {
            gVar.c(iVar, fVar);
        } else {
            fVar.a();
        }
    }

    @Override // com.sankuai.waimai.router.core.g
    protected void d(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        com.sankuai.waimai.router.core.g gVarG = g(iVar);
        if (gVarG != null) {
            gVarG.c(iVar, new a(iVar, fVar));
        } else {
            h(iVar, fVar);
        }
    }

    @Override // com.sankuai.waimai.router.core.g
    protected boolean e(@n0 com.sankuai.waimai.router.core.i iVar) {
        return (this.f96437d == null && g(iVar) == null) ? false : true;
    }

    public void i(String str, Object obj, boolean z10, com.sankuai.waimai.router.core.h... hVarArr) {
        String strB;
        com.sankuai.waimai.router.core.g gVarB;
        com.sankuai.waimai.router.core.g gVarC;
        if (TextUtils.isEmpty(str) || (gVarC = this.f96435b.c((strB = com.sankuai.waimai.router.utils.f.b(str)), (gVarB = com.sankuai.waimai.router.components.j.b(obj, z10, hVarArr)))) == null) {
            return;
        }
        com.sankuai.waimai.router.core.c.d("[%s] 重复注册path='%s'的UriHandler: %s, %s", this, strB, gVarC, gVarB);
    }

    public void j(String str, Object obj, com.sankuai.waimai.router.core.h... hVarArr) {
        i(str, obj, false, hVarArr);
    }

    public void k(Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                j(entry.getKey(), entry.getValue(), new com.sankuai.waimai.router.core.h[0]);
            }
        }
    }

    public l l(@n0 com.sankuai.waimai.router.core.g gVar) {
        this.f96437d = gVar;
        return this;
    }

    public void m(@p0 String str) {
        this.f96436c = str;
    }
}

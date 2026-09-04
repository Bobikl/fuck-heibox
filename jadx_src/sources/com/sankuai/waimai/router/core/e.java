package com.sankuai.waimai.router.core;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.n0;
import java.util.Iterator;

/* JADX INFO: compiled from: RootUriHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class e extends com.sankuai.waimai.router.core.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f96492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f96493d;

    /* JADX INFO: compiled from: RootUriHandler.java */
    public class a implements f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final i f96494g;

        public a(i iVar) {
            this.f96494g = iVar;
        }

        @Override // com.sankuai.waimai.router.core.f
        public void a() {
            onComplete(404);
        }

        @Override // com.sankuai.waimai.router.core.f
        public void onComplete(int i10) {
            if (i10 == 200) {
                this.f96494g.s(i.f96501g, Integer.valueOf(i10));
                e.this.t(this.f96494g);
                c.f("<--- success, result code = %s", Integer.valueOf(i10));
            } else if (i10 == 301) {
                c.f("<--- redirect, result code = %s", Integer.valueOf(i10));
                e.this.v(this.f96494g);
            } else {
                this.f96494g.s(i.f96501g, Integer.valueOf(i10));
                e.this.s(this.f96494g, i10);
                c.f("<--- error, result code = %s", Integer.valueOf(i10));
            }
        }
    }

    public e(Context context) {
        this.f96492c = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(@n0 i iVar, int i10) {
        d dVar = this.f96493d;
        if (dVar != null) {
            dVar.onError(iVar, i10);
        }
        d dVarI = iVar.i();
        if (dVarI != null) {
            dVarI.onError(iVar, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(@n0 i iVar) {
        d dVar = this.f96493d;
        if (dVar != null) {
            dVar.onSuccess(iVar);
        }
        d dVarI = iVar.i();
        if (dVarI != null) {
            dVarI.onSuccess(iVar);
        }
    }

    @Override // com.sankuai.waimai.router.core.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e g(@n0 g gVar) {
        return h(gVar, 0);
    }

    @Override // com.sankuai.waimai.router.core.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e h(@n0 g gVar, int i10) {
        return (e) super.h(gVar, i10);
    }

    public <T extends g> T o(Class<T> cls) {
        Iterator<g> it = i().iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (cls.isInstance(t10)) {
                return t10;
            }
        }
        return null;
    }

    public Context p() {
        return this.f96492c;
    }

    public d q() {
        return this.f96493d;
    }

    public void r() {
    }

    public void u(d dVar) {
        this.f96493d = dVar;
    }

    public void v(@n0 i iVar) {
        if (iVar == null) {
            c.d("UriRequest为空", new Object[0]);
            s(new i(this.f96492c, Uri.EMPTY).w("UriRequest为空"), 400);
            return;
        }
        if (iVar.b() == null) {
            c.d("UriRequest.Context为空", new Object[0]);
            s(new i(this.f96492c, iVar.m(), iVar.f()).w("UriRequest.Context为空"), 400);
        } else if (iVar.p()) {
            c.b("跳转链接为空", new Object[0]);
            iVar.w("跳转链接为空");
            s(iVar, 400);
        } else {
            if (c.h()) {
                c.f("", new Object[0]);
                c.f("---> receive request: %s", iVar.B());
            }
            c(iVar, new a(iVar));
        }
    }
}

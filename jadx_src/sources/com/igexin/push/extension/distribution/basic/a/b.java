package com.igexin.push.extension.distribution.basic.a;

import com.igexin.push.core.bean.BaseAction;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.igexin.push.extension.distribution.basic.f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BaseAction f63898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f63899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f63900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f63901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f63902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ a f63903f;

    b(a aVar, BaseAction baseAction, String str, String str2, String str3, int i10) {
        this.f63903f = aVar;
        this.f63898a = baseAction;
        this.f63899b = str;
        this.f63900c = str2;
        this.f63901d = str3;
        this.f63902e = i10;
    }

    @Override // com.igexin.push.extension.distribution.basic.f.e
    public void a(BaseAction baseAction) {
        int i10 = this.f63902e;
        if (i10 == 2) {
            ((com.igexin.push.extension.distribution.basic.b.a) this.f63898a).d(true);
        } else if (i10 == 8) {
            ((com.igexin.push.extension.distribution.basic.b.a) this.f63898a).c(true);
        }
        com.igexin.push.extension.distribution.basic.b.a aVar = (com.igexin.push.extension.distribution.basic.b.a) baseAction;
        if (aVar.v() && aVar.n() && com.igexin.push.core.d.a(this.f63899b, true) == 0) {
            com.igexin.push.core.a.e.a().a(this.f63899b, this.f63900c, "1");
        }
    }

    @Override // com.igexin.push.extension.distribution.basic.f.e
    public void a(Exception exc) {
        if (((com.igexin.push.extension.distribution.basic.b.a) this.f63898a).w() >= 3) {
            ((com.igexin.push.extension.distribution.basic.b.a) this.f63898a).d(true);
        }
        if (((com.igexin.push.extension.distribution.basic.b.a) this.f63898a).o() >= 3) {
            ((com.igexin.push.extension.distribution.basic.b.a) this.f63898a).c(true);
        }
        if (!((com.igexin.push.extension.distribution.basic.b.a) this.f63898a).v() || !((com.igexin.push.extension.distribution.basic.b.a) this.f63898a).n()) {
            this.f63903f.a(this.f63901d, this.f63899b, this.f63900c, this.f63898a, this.f63902e);
        } else if (com.igexin.push.core.d.a(this.f63899b, true) == 0) {
            com.igexin.push.core.a.e.a().a(this.f63899b, this.f63900c, "1");
        }
    }
}

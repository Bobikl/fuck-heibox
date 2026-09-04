package cn.fly.verify;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public class bz extends cg {
    public bz(Context context) {
        super(context);
    }

    @Override // cn.fly.verify.cg
    protected Intent a() {
        Intent intent = new Intent(eh.b("030b-cjceckXc9ehcfehckceehGc ck]cbh'chcj3d3ckecdcdcfhdkdkcgekddek"));
        intent.setComponent(new ComponentName(eh.b("029bMcjceckFc:ehcfehckceeh[c:ckdkcf7iife9ce6edhcBcidbekddek"), eh.b("053bGcjceck0cZehcfehckceehDc(ckdkcf'iife5ce3edhc^cidbekddekckdkcf2iife*ce0edhcGcidbekddekdk1e9ciccch.be")));
        return intent;
    }

    @Override // cn.fly.verify.cg
    public cg.b a(IBinder iBinder) {
        cg.b bVar = new cg.b();
        bVar.f36026a = a(eh.b("004JcjZc8chcb"), iBinder, eh.b("047b^cjceckOc1ehcfehckceehAc:ckdkcfHiife-ceHedhc5cidbekddekckddekchcbecchcbXf!dd0dhe.cide7cbe"), 3, new String[0]);
        return bVar;
    }
}

package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public class ci extends cg {
    public ci(Context context) {
        super(context);
    }

    @Override // cn.fly.verify.cg
    protected Intent a() {
        Intent intent = new Intent();
        intent.setClassName(ec.a("023a,bibdbjebbebgbjba-dSbbbg_adJbgbadg*d'bhbbbg+ad"), ec.a("039aObibdbjebbebgbjbaIdJbbbg>ad^bgbadgWdJbhbbbg$adBbjdj4d7bbbgCadHbgbacjWdTbhbbbg;ad"));
        return intent;
    }

    @Override // cn.fly.verify.cg
    public cg.b a(IBinder iBinder) {
        String strA = ec.a("042aJbibdbjebbebgbjba8dNbbbg5ad$bgbadgEd?bhbbbgVadIbjccdj]dYbbbg.adTbgbaccBcgd6bhcdWbad");
        cg.b bVar = new cg.b();
        bVar.f36026a = a(ec.a("004)biLb]bgba"), iBinder, strA, 1, new String[0]);
        return bVar;
    }

    @Override // cn.fly.verify.cg
    protected long c() {
        return 3000L;
    }
}

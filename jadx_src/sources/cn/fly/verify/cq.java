package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public class cq extends cg {
    public cq(Context context) {
        super(context);
    }

    private void e() {
        try {
            Intent intent = new Intent();
            intent.setClassName(bq.a("012d9elegemegedejedemeggjIe"), bq.a("033dCelegemegedejedemeggj eYemgj>g(ekeeejIdgXemidgjIeYjd;hUfmWgSekeeej*dg"));
            intent.setAction(bq.a("032d.elegemggeh+fUemeggj?e<em(edj]ejel!fPemgj=je*ekGjRemgj<gGekeeej-dg"));
            intent.putExtra(bq.a("025d-elegemggeh4fCemeggjIe!emFke5ek4e_egem<kBfifkBfe6egIg"), this.f36019b);
            intent.putExtra(bq.a("026d9elegemggeh7fZemeggjVe(emCke[ekSeYegemekeh2f-ejXfDgj]gj"), true);
            this.f36018a.startService(intent);
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    @Override // cn.fly.verify.cg
    protected Intent a() {
        e();
        Intent intent = new Intent();
        intent.setClassName(bq.a("012d$elegemegedejedemeggjZe"), bq.a("033dCelegemegedejedemeggjLe;emgj0g+ekeeej<dg3emidgj2eXffedfmAgVekeeejYdg"));
        intent.setAction(bq.a("033dIelegemggehIf.emeggj<eGemSedj9ejel]f=emggej(fXedWj6elemgjEg>ekeeej,dg"));
        intent.putExtra(bq.a("025dGelegemggeh4fMemeggj:e]emWke3ek.e,egem=k4fifkNfeAeg+g"), this.f36019b);
        return intent;
    }

    @Override // cn.fly.verify.cg
    protected cg.b a(IBinder iBinder) {
        cg.b bVar = new cg.b();
        bVar.f36026a = a(bq.a("0044elJeHejed"), iBinder, bq.a("026d elegemggeh$f7em7hLejggemidgj[eVffedffQfjg^ekfg4edg"), 3, new String[0]);
        return bVar;
    }
}

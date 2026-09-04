package cn.fly.verify;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public class ca extends cg {
    public ca(Context context) {
        super(context);
    }

    @Override // cn.fly.verify.cg
    protected Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(ec.a("027aFbibdbjZa6bibi9ehb7babjbaEd>bbbgWadYbgbadgbe*hhGbibhHg"), ec.a("043a^bibdbjPa<bibi.ehbXbabjba.dCbbbgZad bgbadgbe6hhDbibh:g^bjdjZd5bbbg2ad_ccbacjBdHbhbbbg.ad")));
        return intent;
    }

    @Override // cn.fly.verify.cg
    public cg.b a(IBinder iBinder) {
        cg.b bVar = new cg.b();
        bVar.f36026a = a(ec.a("004+bi<bJbgba"), iBinder, ec.a("044a1bibdbjUaXbibiIehb babjbaPdWbbbg^adWbgbadgbeThhTbibh,gMbjccdjOd+bbbgFadBccbafaObcb)ch8d=bh"), 2, this.f36019b);
        return bVar;
    }
}

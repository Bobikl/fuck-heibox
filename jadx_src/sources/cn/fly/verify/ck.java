package cn.fly.verify;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class ck extends cl {
    public ck(Context context) {
        super(context);
        ((cl) this).f36033c = eh.b("022bCcjceckcj2ifZcfehckehKhZcbchcbckdddk*h,cbddek");
    }

    @Override // cn.fly.verify.cl, cn.fly.verify.cg
    protected Intent a() {
        Intent intent = new Intent(eh.b("033cbhRchcjVdJckMbWcjceckcjCifNcfehckehKh1cbchcbckddekcgdkfhfifjdddcfh"));
        intent.setComponent(new ComponentName(eh.b("015bVcjceckTb>cj4fUcjcicjehckce;b<eh"), eh.b("031bTcjceckcjEif(cfehckeh*h:cbchcbckddcb1edh!chdedbdk]eKciccch4be")));
        return intent;
    }
}

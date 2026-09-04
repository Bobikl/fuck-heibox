package anet.channel.e;

import android.content.SharedPreferences;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.l;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements IStrategyListener {
    c() {
    }

    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(l.d dVar) {
        if (dVar == null || dVar.f29967b == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            l.b[] bVarArr = dVar.f29967b;
            if (i10 >= bVarArr.length) {
                return;
            }
            l.b bVar = bVarArr[i10];
            String str = bVar.f29952a;
            l.a[] aVarArr = bVar.f29959h;
            if (aVarArr != null && aVarArr.length > 0) {
                for (l.a aVar : aVarArr) {
                    String str2 = aVar.f29945b;
                    if (ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) {
                        if (!str.equals(a.f29675b)) {
                            String unused = a.f29675b = str;
                            SharedPreferences.Editor editorEdit = a.f29679f.edit();
                            editorEdit.putString("http3_detector_host", a.f29675b);
                            editorEdit.apply();
                        }
                        a.a(NetworkStatusHelper.getStatus());
                        return;
                    }
                }
            }
            i10++;
        }
    }
}

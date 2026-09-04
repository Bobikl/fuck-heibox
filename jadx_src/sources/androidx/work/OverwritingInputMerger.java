package androidx.work;

import androidx.annotation.n0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class OverwritingInputMerger extends k {
    @Override // androidx.work.k
    @n0
    public e b(@n0 List<e> list) {
        e.a aVar = new e.a();
        HashMap map = new HashMap();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(it.next().x());
        }
        aVar.d(map);
        return aVar.a();
    }
}

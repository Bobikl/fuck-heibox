package n;

import android.util.Pair;
import java.util.Comparator;

/* JADX INFO: compiled from: IpRankTask.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements Comparator<Pair<String, Integer>> {
    public d(e eVar) {
    }

    @Override // java.util.Comparator
    public int compare(Pair<String, Integer> pair, Pair<String, Integer> pair2) {
        return ((Integer) pair.second).intValue() - ((Integer) pair2.second).intValue();
    }
}

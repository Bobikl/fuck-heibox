package anet.channel.strategy;

import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class StrategyList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<IPConnStrategy> f29892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, ConnHistoryItem> f29893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Comparator<IPConnStrategy> f29895d;

    /* JADX INFO: compiled from: Taobao */
    public interface Predicate<T> {
        boolean apply(T t10);
    }

    public StrategyList() {
        this.f29892a = new ArrayList();
        this.f29893b = new SerialLruCache(40);
        this.f29894c = false;
        this.f29895d = null;
    }

    StrategyList(List<IPConnStrategy> list) {
        this.f29892a = new ArrayList();
        this.f29893b = new SerialLruCache(40);
        this.f29894c = false;
        this.f29895d = null;
        this.f29892a = list;
    }

    private static <T> int a(Collection<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            return -1;
        }
        int i10 = 0;
        Iterator<T> it = collection.iterator();
        while (it.hasNext() && !predicate.apply(it.next())) {
            i10++;
        }
        if (i10 == collection.size()) {
            return -1;
        }
        return i10;
    }

    private Comparator a() {
        if (this.f29895d == null) {
            this.f29895d = new k(this);
        }
        return this.f29895d;
    }

    private void a(String str, int i10, l.a aVar) {
        int iA = a(this.f29892a, new j(this, aVar, str, ConnProtocol.valueOf(aVar)));
        if (iA != -1) {
            IPConnStrategy iPConnStrategy = this.f29892a.get(iA);
            iPConnStrategy.cto = aVar.f29946c;
            iPConnStrategy.rto = aVar.f29947d;
            iPConnStrategy.heartbeat = aVar.f29949f;
            iPConnStrategy.f29872a = i10;
            iPConnStrategy.f29873b = 0;
            iPConnStrategy.f29874c = false;
            return;
        }
        IPConnStrategy iPConnStrategyA = IPConnStrategy.a(str, aVar);
        if (iPConnStrategyA != null) {
            iPConnStrategyA.f29872a = i10;
            iPConnStrategyA.f29873b = 0;
            if (!this.f29893b.containsKey(Integer.valueOf(iPConnStrategyA.getUniqueId()))) {
                this.f29893b.put(Integer.valueOf(iPConnStrategyA.getUniqueId()), new ConnHistoryItem());
            }
            this.f29892a.add(iPConnStrategyA);
        }
    }

    public void checkInit() {
        if (this.f29892a == null) {
            this.f29892a = new ArrayList();
        }
        if (this.f29893b == null) {
            this.f29893b = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it = this.f29893b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().d()) {
                it.remove();
            }
        }
        for (IPConnStrategy iPConnStrategy : this.f29892a) {
            if (!this.f29893b.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.f29893b.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.f29892a, a());
    }

    public List<IConnStrategy> getStrategyList() {
        if (this.f29892a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = null;
        for (IPConnStrategy iPConnStrategy : this.f29892a) {
            ConnHistoryItem connHistoryItem = this.f29893b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
            if (connHistoryItem == null || !connHistoryItem.c()) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(iPConnStrategy);
            } else {
                ALog.i("awcn.StrategyList", "strategy ban!", null, Constants.KEY_STRATEGY, iPConnStrategy);
            }
        }
        return linkedList == null ? Collections.EMPTY_LIST : linkedList;
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (!(iConnStrategy instanceof IPConnStrategy) || this.f29892a.indexOf(iConnStrategy) == -1) {
            return;
        }
        this.f29893b.get(Integer.valueOf(((IPConnStrategy) iConnStrategy).getUniqueId())).a(connEvent.isSuccess);
        Collections.sort(this.f29892a, this.f29895d);
    }

    public boolean shouldRefresh() {
        boolean z10;
        Iterator<IPConnStrategy> it = this.f29892a.iterator();
        boolean z11 = true;
        loop0: while (true) {
            z10 = z11;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                IPConnStrategy next = it.next();
                if (!this.f29893b.get(Integer.valueOf(next.getUniqueId())).b()) {
                    if (next.f29872a == 0) {
                        break;
                    }
                    z10 = false;
                }
            }
            z11 = false;
        }
        return (this.f29894c && z11) || z10;
    }

    public String toString() {
        return new ArrayList(this.f29892a).toString();
    }

    public void update(l.b bVar) {
        Iterator<IPConnStrategy> it = this.f29892a.iterator();
        while (it.hasNext()) {
            it.next().f29874c = true;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bVar.f29959h.length; i11++) {
            int i12 = 0;
            while (true) {
                String[] strArr = bVar.f29957f;
                if (i12 >= strArr.length) {
                    break;
                }
                a(strArr[i12], 1, bVar.f29959h[i11]);
                i12++;
            }
            if (bVar.f29958g != null) {
                this.f29894c = true;
                int i13 = 0;
                while (true) {
                    String[] strArr2 = bVar.f29958g;
                    if (i13 < strArr2.length) {
                        a(strArr2[i13], 0, bVar.f29959h[i11]);
                        i13++;
                    }
                }
            } else {
                this.f29894c = false;
            }
        }
        if (bVar.f29960i != null) {
            while (true) {
                l.e[] eVarArr = bVar.f29960i;
                if (i10 >= eVarArr.length) {
                    break;
                }
                l.e eVar = eVarArr[i10];
                String str = eVar.f29974a;
                a(str, anet.channel.strategy.utils.c.c(str) ? -1 : 1, eVar.f29975b);
                i10++;
            }
        }
        ListIterator<IPConnStrategy> listIterator = this.f29892a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f29874c) {
                listIterator.remove();
            }
        }
        Collections.sort(this.f29892a, a());
    }
}

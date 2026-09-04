package c6;

import com.alipay.sdk.m.x.e;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Stack<e> f35611a = new Stack<>();

    public void a() {
        if (c()) {
            return;
        }
        Iterator<e> it = this.f35611a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f35611a.clear();
    }

    public void b(e eVar) {
        this.f35611a.push(eVar);
    }

    public boolean c() {
        return this.f35611a.isEmpty();
    }

    public e d() {
        return this.f35611a.pop();
    }
}

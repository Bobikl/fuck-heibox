package cn.fly.verify;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f36098a;

    public interface a {
        Object a(String str, ArrayList<Object> arrayList);
    }

    public df(a aVar) {
        this.f36098a = aVar;
    }

    public Object a(String str, ArrayList<Object> arrayList) {
        a aVar = this.f36098a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(str, arrayList);
    }
}

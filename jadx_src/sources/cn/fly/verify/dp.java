package cn.fly.verify;

import com.meituan.robust.Constants;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final HashMap<String, Class<?>> f36114a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<dr> f36115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<Object> f36116c;

    public dp(ArrayList<dr> arrayList, ArrayList<Object> arrayList2) {
        this.f36115b = arrayList;
        this.f36116c = arrayList2;
    }

    private void a(dl dlVar) {
        dlVar.a("Object", Object.class);
        dlVar.a("Class", Class.class);
        dlVar.a("Method", Method.class);
        dlVar.a("String", String.class);
        dlVar.a("Thread", Thread.class);
        dlVar.a(ec.a("008Gehbe1ccb;dd6ed"), Runnable.class);
        dlVar.a(ec.a("006@cjcadgLgd+bd"), System.class);
        dlVar.a("File", File.class);
        dlVar.a("URL", URL.class);
        dlVar.a("Double", Double.class);
        dlVar.a("Float", Float.class);
        dlVar.a("Long", Long.class);
        dlVar.a("Integer", Integer.class);
        dlVar.a(ec.a("005Wcj>f9bibhPg"), Short.class);
        dlVar.a("Byte", Byte.class);
        dlVar.a("Number", Number.class);
        dlVar.a(ec.a("009DcbHfbEbhTbagd?bh"), Character.class);
        dlVar.a("Boolean", Boolean.class);
        dlVar.a(ec.a("006 babibedd!ed"), Double.TYPE);
        dlVar.a(ec.a("005$cdWe7bi6bg"), Float.TYPE);
        dlVar.a(Constants.LONG, Long.TYPE);
        dlVar.a(ec.a("003-bgEcg"), Integer.TYPE);
        dlVar.a(Constants.SHORT, Short.TYPE);
        dlVar.a(Constants.BYTE, Byte.TYPE);
        dlVar.a(ec.a("004afbHbh"), Character.TYPE);
        dlVar.a("boolean", Boolean.TYPE);
        dlVar.a("bigInt", BigInteger.class);
        dlVar.a("BigInteger", BigInteger.class);
        dlVar.a("bigDec", BigDecimal.class);
        dlVar.a("BigDecimal", BigDecimal.class);
        dlVar.a("List", List.class);
        dlVar.a("Map", Map.class);
        dlVar.a("Function", ds.class);
        dlVar.a("fun", ds.class);
        dlVar.a("Range", ct.class);
        dlVar.a("Array", Array.class);
        dlVar.a("Suba", dq.class);
        dlVar.a("VM", dq.class);
        for (Map.Entry<String, Class<?>> entry : f36114a.entrySet()) {
            dlVar.a(entry.getKey(), entry.getValue());
        }
    }

    public ArrayList<dr> a() {
        return this.f36115b;
    }

    public void a(int i10, int i11, dl dlVar, List<Object> list) throws Throwable {
        String string;
        dr.a aVar = new dr.a();
        aVar.f36146a = i10;
        aVar.f36147b = dlVar;
        aVar.f36148c = list;
        aVar.f36151f = this.f36115b;
        aVar.f36152g = this.f36116c;
        while (aVar.f36146a < i11) {
            try {
                if (dlVar.f()) {
                    aVar.f36149d = true;
                    break;
                }
                this.f36115b.get(aVar.f36146a).a(aVar);
                if (aVar.f36150e) {
                    break;
                } else {
                    aVar.f36146a++;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof Cdo) {
                    string = th.getMessage() == null ? th.getClass().getSimpleName() : th.getMessage();
                    th = th.getCause();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Suba Runtime Error: ");
                    sb2.append(th.getMessage() == null ? th.getClass().getSimpleName() : th.getMessage());
                    string = sb2.toString();
                }
                throw new Cdo(string + "\r\n\tat " + this.f36115b.get(aVar.f36146a).f36128b + " (" + this.f36115b.get(aVar.f36146a).f36129c + ")", th);
            }
        }
        if (aVar.f36149d || dlVar.d() <= 0 || list == null) {
            return;
        }
        try {
            list.add(dlVar.a());
        } catch (Throwable unused) {
        }
    }

    public void a(HashMap<String, Object> map, dn dnVar) throws Throwable {
        dl dlVar = new dl(map, dnVar);
        a(dlVar);
        a(0, this.f36115b.size(), dlVar, null);
    }
}

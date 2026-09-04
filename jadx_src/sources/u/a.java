package u;

import com.taobao.accs.utl.BaseMonitor;
import com.tencent.msdk.dns.core.IpSet;
import f.b;
import j.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k.g;
import k.j;

/* JADX INFO: compiled from: Sorter.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f140731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f140732b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f140733c = Collections.emptyList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f140734d = Collections.emptyList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f140735e = Collections.emptyList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f140736f = Collections.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f140737g = Collections.emptyList();

    /* JADX INFO: renamed from: u.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Sorter.java */
    public static class C1269a implements j.a {
    }

    public a(int i10) {
        this.f140731a = i10;
    }

    public IpSet a() {
        String[] strArrD = k.a.f124360a;
        String[] strArrD2 = (this.f140731a & 1) != 0 ? d("ipv4") : strArrD;
        if ((this.f140731a & 2) != 0) {
            strArrD = d("ipv6");
        }
        return new IpSet(strArrD2, strArrD);
    }

    public final List<String> b(List<String> list, String str) {
        if (Collections.emptyList() == list) {
            list = new ArrayList<>();
        }
        list.add(str);
        return list;
    }

    public synchronized void c(g gVar, String[] strArr) {
        try {
            if (gVar == null) {
                throw new IllegalArgumentException(BaseMonitor.COUNT_POINT_DNS.concat(" can not be null"));
            }
            if (strArr == null) {
                throw new IllegalArgumentException("ips".concat(" can not be null"));
            }
            if (b.a.q(strArr)) {
                return;
            }
            int i10 = 0;
            if ("Local".equals(gVar.a().f124366a)) {
                b.b("sorter put lookup from local: %s", Arrays.toString(strArr));
                int length = strArr.length;
                while (i10 < length) {
                    String str = strArr[i10];
                    if (c.a(str)) {
                        this.f140732b = b(this.f140732b, str);
                    } else if (c.b(str)) {
                        this.f140733c = b(this.f140733c, str);
                    }
                    i10++;
                }
            } else {
                b.b("sorter put lookup from rest(%d): %s", Integer.valueOf(gVar.a().f124367b), Arrays.toString(strArr));
                int length2 = strArr.length;
                while (i10 < length2) {
                    String str2 = strArr[i10];
                    if (c.a(str2)) {
                        this.f140734d = b(this.f140734d, str2);
                    } else if (c.b(str2)) {
                        this.f140735e = b(this.f140735e, str2);
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String[] d(String str) {
        List<String> list = Objects.equals(str, "ipv6") ? this.f140737g : this.f140736f;
        List<String> list2 = Objects.equals(str, "ipv6") ? this.f140733c : this.f140732b;
        List<String> list3 = Objects.equals(str, "ipv6") ? this.f140735e : this.f140734d;
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (!list3.isEmpty()) {
            arrayList.addAll(list3);
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : list3) {
                    if (str2.contains(":")) {
                        String str3 = str2.split(":")[0];
                        if (!arrayList2.contains(str3)) {
                            arrayList2.add(str3);
                        }
                    }
                }
                for (String str4 : list2) {
                    if (str4.contains(":")) {
                        String str5 = str4.split(":")[0];
                        if (!arrayList2.contains(str5)) {
                            b.b("%s's %s result is from localDns", str5, str);
                            arrayList.add(str4);
                        }
                    }
                }
            }
        } else if (!list2.isEmpty()) {
            b.b("%s result all from localDns", str);
            arrayList.addAll(list2);
        }
        return (String[]) arrayList.toArray(k.a.f124360a);
    }
}

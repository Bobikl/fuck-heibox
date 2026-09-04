package cn.fly.verify;

import android.content.Context;
import android.net.Network;
import cn.fly.verify.common.exception.VerifyErr;
import cn.fly.verify.common.exception.VerifyException;
import cn.fly.verify.pure.entity.PreVerifyResult;
import cn.fly.verify.pure.entity.VerifyResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f36984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36985e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f36986f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f36987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f36988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f36991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f36992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f36993m;

    static /* synthetic */ int e(s sVar) {
        int i10 = sVar.f36989i;
        sVar.f36989i = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g() {
        String strJ = al.j();
        if (this.f36988h && "wifi".equalsIgnoreCase(strJ)) {
            return 0;
        }
        if (this.f36988h) {
            return 1;
        }
        if ("wifi".equalsIgnoreCase(strJ)) {
            return 2;
        }
        return "none".equalsIgnoreCase(strJ) ? 4 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        e eVar = this.f36987g;
        return eVar != null && eVar.d();
    }

    public abstract Object a(boolean z10);

    public HashMap<String, Object> a() {
        f fVarA;
        String str;
        String strA = ah.a(this.f36981a + "_cache");
        if (strA != null) {
            HashMap<String, Object> mapA = ge.a(strA);
            long jLongValue = mapA.containsKey("expired") ? ((Long) mapA.get("expired")).longValue() : 0L;
            int iIntValue = mapA.containsKey("subId") ? ((Integer) mapA.get("subId")).intValue() : -1;
            String str2 = mapA.containsKey("clientId") ? (String) mapA.get("clientId") : "";
            if (iIntValue == as.d()) {
                boolean z10 = str2 == null || str2.equals(this.f36982b);
                boolean z11 = jLongValue < System.currentTimeMillis();
                if (z10 && !z11) {
                    return mapA;
                }
                fVarA = f.a();
                str = "cache invalid, expired = " + z11;
            } else {
                fVarA = f.a();
                str = "subid changed, cache invalid";
            }
            fVarA.a(str);
            ah.b(this.f36981a + "_cache", null);
        }
        return null;
    }

    public void a(final cn.fly.verify.common.callback.b<PreVerifyResult> bVar) {
        as.a(new ar() { // from class: cn.fly.verify.s.1
            @Override // cn.fly.verify.ar
            public void a() {
                s.this.a(true, (cn.fly.verify.common.callback.b) new cn.fly.verify.common.callback.b<PreVerifyResult>() { // from class: cn.fly.verify.s.1.1
                    @Override // cn.fly.verify.common.callback.b
                    public void a(VerifyException verifyException) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (bVar != null) {
                            s sVar = s.this;
                            if (sVar.f36986f <= 0 || sVar.h() || s.this.f36990j) {
                                s sVar2 = s.this;
                                e eVar = sVar2.f36987g;
                                if (eVar != null) {
                                    eVar.a(sVar2.f36981a, sVar2.f36982b, "failure_retry_count", String.valueOf(sVar2.f36989i));
                                    s sVar3 = s.this;
                                    sVar3.f36987g.a(sVar3.f36981a, sVar3.f36982b, "cell_wifi", String.valueOf(sVar3.g()));
                                }
                                bVar.a(verifyException);
                                return;
                            }
                            s sVar4 = s.this;
                            sVar4.f36986f--;
                            s.e(sVar4);
                            f.a().a("retry count = " + s.this.f36989i);
                            s sVar5 = s.this;
                            e eVar2 = sVar5.f36987g;
                            if (eVar2 != null) {
                                eVar2.a(sVar5.f36981a, sVar5.f36982b, "retry", String.valueOf(sVar5.f36989i));
                                s sVar6 = s.this;
                                sVar6.f36987g.a(sVar6.f36981a, sVar6.f36982b, "cell_wifi", String.valueOf(sVar6.g()));
                            }
                            AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                            s.this.a(bVar);
                        }
                    }

                    @Override // cn.fly.verify.common.callback.b
                    public void a(PreVerifyResult preVerifyResult) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (bVar != null) {
                            s sVar = s.this;
                            e eVar = sVar.f36987g;
                            if (eVar != null) {
                                eVar.a(sVar.f36981a, sVar.f36982b, "success_retry_count", String.valueOf(sVar.f36989i));
                                s sVar2 = s.this;
                                sVar2.f36987g.a(sVar2.f36981a, sVar2.f36982b, "cell_wifi", String.valueOf(sVar2.g()));
                            }
                            bVar.a(preVerifyResult);
                        }
                    }
                });
            }

            @Override // cn.fly.verify.ar
            public void a(Throwable th2) {
                cn.fly.verify.common.callback.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(new VerifyException(VerifyErr.INNER_OTHER_EXCEPTION_ERR.getCode(), as.a(th2)));
                }
            }
        });
    }

    public void a(Integer num) {
        this.f36992l = num;
    }

    public void a(String str) {
        this.f36993m = str;
    }

    public void a(String str, String str2, String str3, e eVar) {
        this.f36981a = str3;
        this.f36984d = ax.g();
        this.f36982b = str.trim();
        this.f36983c = str2.trim();
        this.f36987g = eVar;
        if ("CTCC".equals(str3)) {
            this.f36986f = 2;
        }
    }

    public abstract void a(boolean z10, Network network, Object obj, cn.fly.verify.common.callback.b bVar, e eVar);

    public void a(boolean z10, cn.fly.verify.common.callback.b bVar) {
        cn.fly.verify.pure.entity.a verifyResult;
        this.f36988h = as.b(this.f36984d);
        HashMap<String, Object> mapA = a();
        if (mapA == null) {
            e eVar = this.f36987g;
            if (eVar != null) {
                eVar.a(eVar.b("no_upc"));
            }
            b(z10, bVar);
            return;
        }
        String str = mapA.containsKey(g0.a.f118921e) ? (String) mapA.get(g0.a.f118921e) : null;
        long jLongValue = mapA.containsKey("expired") ? ((Long) mapA.get("expired")).longValue() : 0L;
        e eVar2 = this.f36987g;
        if (eVar2 != null) {
            eVar2.c(str);
            e eVar3 = this.f36987g;
            eVar3.a(eVar3.b("upc"));
        }
        if (!z10) {
            ah.b(this.f36981a + "_cache", null);
            ai.a().b(2);
            ai.a().a(jLongValue);
        }
        if (bVar != null) {
            if (z10) {
                String str2 = this.f36981a;
                verifyResult = new PreVerifyResult(str, str2, jLongValue, str2);
            } else {
                verifyResult = new VerifyResult(str, mapA.containsKey("optoken") ? (String) mapA.get("optoken") : null, this.f36981a);
            }
            bVar.a(verifyResult);
        }
    }

    public boolean a(int i10) {
        return false;
    }

    protected boolean a(VerifyException verifyException, cn.fly.verify.common.callback.b bVar) {
        return false;
    }

    public s b(boolean z10) {
        this.f36990j = z10;
        return this;
    }

    public String b() {
        return this.f36985e ? "CUCC" : this.f36981a;
    }

    public void b(int i10) {
        this.f36991k = i10;
    }

    public void b(final cn.fly.verify.common.callback.b<VerifyResult> bVar) {
        as.a(new ar() { // from class: cn.fly.verify.s.2
            @Override // cn.fly.verify.ar
            public void a() {
                s.this.a(false, (cn.fly.verify.common.callback.b) new cn.fly.verify.common.callback.b<VerifyResult>() { // from class: cn.fly.verify.s.2.1
                    @Override // cn.fly.verify.common.callback.b
                    public void a(VerifyException verifyException) {
                        ah.b(s.this.f36981a + "_cache", null);
                        s sVar = s.this;
                        e eVar = sVar.f36987g;
                        if (eVar != null) {
                            eVar.a(sVar.f36981a, sVar.f36982b, "cell_wifi", String.valueOf(sVar.g()));
                        }
                        cn.fly.verify.common.callback.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a(verifyException);
                        }
                    }

                    @Override // cn.fly.verify.common.callback.b
                    public void a(VerifyResult verifyResult) {
                        ah.b(s.this.f36981a + "_cache", null);
                        s sVar = s.this;
                        e eVar = sVar.f36987g;
                        if (eVar != null) {
                            eVar.a(sVar.f36981a, sVar.f36982b, "cell_wifi", String.valueOf(sVar.g()));
                        }
                        cn.fly.verify.common.callback.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a(verifyResult);
                        }
                    }
                });
            }

            @Override // cn.fly.verify.ar
            public void a(Throwable th2) {
                ah.b(s.this.f36981a + "_cache", null);
                cn.fly.verify.common.callback.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(new VerifyException(VerifyErr.INNER_OTHER_EXCEPTION_ERR.getCode(), as.a(th2)));
                }
            }
        });
    }

    protected void b(final boolean z10, final cn.fly.verify.common.callback.b bVar) {
        Network networkC = null;
        try {
            if ("wifi".equalsIgnoreCase(al.j())) {
                e eVar = this.f36987g;
                if (eVar != null) {
                    eVar.a(this.f36981a, this.f36982b, "switch_s");
                }
                networkC = new aj().c();
                e eVar2 = this.f36987g;
                if (eVar2 != null) {
                    eVar2.a(this.f36981a, this.f36982b, "switch_e");
                }
            }
        } catch (VerifyException e10) {
            if (a(e10, bVar)) {
                return;
            }
            if (ai.a().u() == 0) {
                if (bVar != null) {
                    bVar.a(e10);
                    return;
                }
                return;
            }
            e eVar3 = this.f36987g;
            if (eVar3 != null) {
                c cVarB = eVar3.b("switch_e");
                cVarB.f(this.f36981a);
                cVarB.e(this.f36982b);
                cVarB.b(e10.getCode());
                cVarB.d(e10.getMessage());
                this.f36987g.a(cVarB);
            }
        }
        Network network = networkC;
        Object objA = a(z10);
        e eVar4 = this.f36987g;
        if (eVar4 != null) {
            eVar4.a(eVar4.b("request_start"));
        }
        a(z10, network, objA, new cn.fly.verify.common.callback.b() { // from class: cn.fly.verify.s.3
            @Override // cn.fly.verify.common.callback.b
            public void a(VerifyException verifyException) {
                cn.fly.verify.common.callback.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(verifyException);
                }
            }

            @Override // cn.fly.verify.common.callback.b
            public void a(Object obj) {
                e eVar5 = s.this.f36987g;
                if (eVar5 != null) {
                    eVar5.a(eVar5.b("request_end"));
                }
                if (obj == null || !(obj instanceof HashMap)) {
                    return;
                }
                HashMap map = (HashMap) obj;
                String str = map.containsKey(g0.a.f118921e) ? (String) map.get(g0.a.f118921e) : "";
                long jLongValue = map.containsKey("expired") ? ((Long) map.get("expired")).longValue() : 0L;
                e eVar6 = s.this.f36987g;
                if (eVar6 != null) {
                    eVar6.c(str);
                }
                if (z10) {
                    map.put("subId", Integer.valueOf(as.d()));
                    map.put("clientId", s.this.f36982b);
                    ah.b(s.this.f36981a + "_cache", ge.a(map));
                } else {
                    ai.a().b(0);
                    ai.a().a(jLongValue);
                }
                cn.fly.verify.common.callback.b bVar2 = bVar;
                if (bVar2 != null) {
                    if (!z10) {
                        bVar.a(new VerifyResult(str, map.containsKey("optoken") ? (String) map.get("optoken") : "", s.this.f36981a));
                    } else {
                        String str2 = s.this.f36981a;
                        bVar2.a(new PreVerifyResult(str, str2, jLongValue, str2));
                    }
                }
            }
        }, this.f36987g);
    }

    public e c() {
        return this.f36987g;
    }

    public int d() {
        return this.f36991k;
    }

    public Integer e() {
        return this.f36992l;
    }

    public String f() {
        return this.f36993m;
    }
}

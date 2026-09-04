package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class fz {

    public interface a {
        void a(b bVar) throws Throwable;
    }

    public static class b {
        private String A;
        private Object C;
        private ArrayList<HashMap<String, Object>> D;
        private String E;
        private HashMap<String, Object> F;
        private HashMap<String, Object> H;
        private ArrayList<ArrayList<String>> I;
        private String J;
        private HashMap<String, HashMap<String, Long>> K;
        private HashMap<String, Long> L;
        private String M;
        private boolean N;
        private boolean O;
        private boolean P;
        private boolean Q;
        private boolean R;
        private boolean S;
        private boolean T;
        private boolean U;
        private String V;
        private String W;
        private String X;
        private String Y;
        private int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f36636a;
        private String aA;
        private int aB;
        private HashMap<String, Object> aD;
        private ArrayList<HashMap<String, Object>> aF;
        private String aG;
        private String aI;
        private boolean aK;
        private ArrayList<HashMap<String, Object>> aL;
        private boolean aP;
        private ArrayList<HashMap<String, Object>> aQ;
        private String aR;

        /* JADX INFO: renamed from: af, reason: collision with root package name */
        private String f36642af;

        /* JADX INFO: renamed from: ag, reason: collision with root package name */
        private String f36643ag;

        /* JADX INFO: renamed from: ah, reason: collision with root package name */
        private String f36644ah;

        /* JADX INFO: renamed from: ai, reason: collision with root package name */
        private long f36645ai;

        /* JADX INFO: renamed from: aj, reason: collision with root package name */
        private String f36646aj;

        /* JADX INFO: renamed from: ak, reason: collision with root package name */
        private String f36647ak;

        /* JADX INFO: renamed from: al, reason: collision with root package name */
        private String f36648al;
        private String am;
        private String an;
        private HashMap<String, Object> ao;
        private ApplicationInfo ap;
        private long as;
        private double at;
        private int au;
        private boolean av;
        private String aw;
        private String ax;
        private int ay;
        private int az;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36649b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f36651d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f36654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f36655h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f36657j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f36659l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f36661n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f36662o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f36664q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f36665r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private String f36666s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f36667t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private String f36669v;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ArrayList<HashMap<String, String>> f36673z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LinkedList<String> f36650c = new LinkedList<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private LinkedList<String> f36652e = new LinkedList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private LinkedList<String> f36653f = new LinkedList<>();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private LinkedList<String> f36656i = new LinkedList<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private LinkedList<String> f36658k = new LinkedList<>();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private LinkedList<String> f36660m = new LinkedList<>();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private LinkedList<String> f36663p = new LinkedList<>();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private LinkedList<String> f36668u = new LinkedList<>();

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private LinkedList<String> f36670w = new LinkedList<>();

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private LinkedList<ArrayList<HashMap<String, String>>> f36671x = new LinkedList<>();

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private LinkedList<ArrayList<HashMap<String, String>>> f36672y = new LinkedList<>();
        private LinkedList<Location> B = new LinkedList<>();
        private LinkedList<Boolean> G = new LinkedList<>();

        /* JADX INFO: renamed from: aa, reason: collision with root package name */
        private LinkedList<List<ResolveInfo>> f36637aa = new LinkedList<>();

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        private LinkedList<ResolveInfo> f36638ab = new LinkedList<>();

        /* JADX INFO: renamed from: ac, reason: collision with root package name */
        private LinkedList<PackageInfo> f36639ac = new LinkedList<>();

        /* JADX INFO: renamed from: ad, reason: collision with root package name */
        private LinkedList<PackageInfo> f36640ad = new LinkedList<>();

        /* JADX INFO: renamed from: ae, reason: collision with root package name */
        private LinkedList<PackageInfo> f36641ae = new LinkedList<>();
        private LinkedList<ApplicationInfo> aq = new LinkedList<>();
        private LinkedList<ApplicationInfo> ar = new LinkedList<>();
        private LinkedList<List> aC = new LinkedList<>();
        private LinkedList<HashMap<String, Object>> aE = new LinkedList<>();
        private LinkedList<String> aH = new LinkedList<>();
        private LinkedList<String> aJ = new LinkedList<>();
        private LinkedList<Object> aM = new LinkedList<>();
        private LinkedList<Object> aN = new LinkedList<>();
        private LinkedList<Object> aO = new LinkedList<>();
        private LinkedList<Long> aS = new LinkedList<>();

        private static <T> T a(LinkedList<T> linkedList, T t10, int... iArr) {
            if (linkedList != null) {
                try {
                    if (iArr.length == 0) {
                        return linkedList.get(0);
                    }
                    if (iArr[0] < linkedList.size()) {
                        return linkedList.get(iArr[0]);
                    }
                    es.a().b("WARNING: " + iArr[0] + " out of bound, size: " + linkedList.size());
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
            }
            return t10;
        }

        public String A() {
            return this.am;
        }

        public String B() {
            return this.an;
        }

        public String C() {
            return this.ax;
        }

        public String D() {
            return this.aA;
        }

        public int E() {
            return this.aB;
        }

        public HashMap<String, Object> F() {
            return this.aD;
        }

        public ArrayList<HashMap<String, Object>> G() {
            return this.aF;
        }

        public String H() {
            return this.aG;
        }

        public String I() {
            return this.aI;
        }

        public boolean J() {
            return this.aK;
        }

        public ArrayList<HashMap<String, Object>> K() {
            return this.aL;
        }

        public ArrayList<HashMap<String, Object>> L() {
            return this.aQ;
        }

        public String M() {
            return this.aR;
        }

        public String a(int... iArr) {
            return (String) a(this.f36656i, "-1", iArr);
        }

        void a(String str, Object obj) throws Throwable {
            a(str, obj, false);
        }

        /* JADX WARN: Code duplicated, block: B:154:0x01c0 A[PHI: r6
  0x01c0: PHI (r6v25 java.util.LinkedList) = (r6v24 java.util.LinkedList), (r6v26 java.util.LinkedList) binds: [B:158:0x01cf, B:152:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:327:0x03e7 A[PHI: r6
  0x03e7: PHI (r6v20 java.util.LinkedList) = (r6v8 java.util.LinkedList), (r6v21 java.util.LinkedList) binds: [B:490:0x05f0, B:325:0x03e3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:339:0x040d A[PHI: r6
  0x040d: PHI (r6v17 java.util.LinkedList) = (r6v15 java.util.LinkedList), (r6v16 java.util.LinkedList), (r6v18 java.util.LinkedList) binds: [B:348:0x042a, B:343:0x041c, B:337:0x0409] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x0062 A[PHI: r6
  0x0062: PHI (r6v36 java.util.LinkedList) = 
  (r6v5 java.util.LinkedList)
  (r6v6 java.util.LinkedList)
  (r6v27 java.util.LinkedList)
  (r6v28 java.util.LinkedList)
  (r6v29 java.util.LinkedList)
  (r6v30 java.util.LinkedList)
  (r6v31 java.util.LinkedList)
  (r6v32 java.util.LinkedList)
  (r6v33 java.util.LinkedList)
  (r6v34 java.util.LinkedList)
  (r6v37 java.util.LinkedList)
 binds: [B:530:0x0667, B:519:0x0647, B:147:0x01ae, B:136:0x018e, B:107:0x0135, B:90:0x0103, B:79:0x00e3, B:68:0x00c4, B:51:0x0093, B:46:0x0086, B:33:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:421:0x0507 A[PHI: r6
  0x0507: PHI (r6v13 java.util.LinkedList) = (r6v12 java.util.LinkedList), (r6v14 java.util.LinkedList) binds: [B:425:0x0516, B:419:0x0503] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000d A[PHI: r6
  0x000d: PHI (r6v41 java.util.LinkedList) = (r6v38 java.util.LinkedList), (r6v39 java.util.LinkedList), (r6v42 java.util.LinkedList) binds: [B:16:0x002a, B:11:0x001d, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
        void a(String str, Object obj, boolean z10) throws Throwable {
            LinkedList linkedList;
            LinkedList linkedList2;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            obj = null;
            Object obj2 = null;
            if ("gmpfo".equals(str)) {
                linkedList = this.aM;
                if (z10) {
                    obj = null;
                }
            } else if ("gmpfofce".equals(str)) {
                linkedList = this.aN;
                if (z10) {
                    obj = null;
                }
            } else {
                if (!"getMpfos".equals(str)) {
                    boolean z11 = false;
                    z11 = false;
                    if ("cird".equals(str)) {
                        this.f36636a = z10 ? false : ((Boolean) obj).booleanValue();
                        return;
                    }
                    if ("gsimt".equals(str)) {
                        this.f36649b = z10 ? null : (String) obj;
                        return;
                    }
                    if ("gsimtfce".equals(str)) {
                        linkedList2 = this.f36650c;
                        if (!z10) {
                            obj2 = (String) obj;
                        }
                    } else {
                        if ("gbsi".equals(str)) {
                            this.f36651d = z10 ? null : (String) obj;
                            return;
                        }
                        if ("gbsifce".equals(str)) {
                            linkedList2 = this.f36652e;
                            if (!z10) {
                                obj2 = (String) obj;
                            }
                        } else if ("gstmpts".equals(str)) {
                            linkedList2 = this.f36653f;
                            if (!z10) {
                                obj2 = (String) obj;
                            }
                        } else {
                            if ("gscsz".equals(str)) {
                                this.f36654g = z10 ? null : (String) obj;
                                return;
                            }
                            if ("gcrie".equals(str)) {
                                this.f36655h = z10 ? null : (String) obj;
                                return;
                            }
                            if ("gcriefce".equals(str)) {
                                linkedList2 = this.f36656i;
                                if (!z10) {
                                    obj2 = (String) obj;
                                }
                            } else {
                                if ("gcrnm".equals(str)) {
                                    this.f36657j = z10 ? null : (String) obj;
                                    return;
                                }
                                if ("gcrnmfce".equals(str)) {
                                    linkedList2 = this.f36658k;
                                    if (!z10) {
                                        obj2 = (String) obj;
                                    }
                                } else {
                                    if ("gsnmd".equals(str)) {
                                        this.f36659l = z10 ? null : (String) obj;
                                        return;
                                    }
                                    if ("gsnmdfp".equals(str)) {
                                        linkedList2 = this.f36660m;
                                        if (!z10) {
                                            obj2 = (String) obj;
                                        }
                                    } else {
                                        if ("gneyp".equals(str)) {
                                            this.f36661n = z10 ? null : (String) obj;
                                            return;
                                        }
                                        if ("gneypnw".equals(str)) {
                                            this.f36662o = z10 ? null : (String) obj;
                                            return;
                                        }
                                        if ("gneypfce".equals(str)) {
                                            linkedList2 = this.f36663p;
                                            if (!z10) {
                                                obj2 = (String) obj;
                                            }
                                        } else {
                                            if ("cknavbl".equals(str)) {
                                                this.f36664q = z10 ? false : ((Boolean) obj).booleanValue();
                                                return;
                                            }
                                            if ("gnktpfs".equals(str)) {
                                                this.f36665r = z10 ? null : (String) obj;
                                                return;
                                            }
                                            if ("gdtlnktpfs".equals(str)) {
                                                this.f36666s = z10 ? null : (String) obj;
                                                return;
                                            }
                                            if ("gdvk".equals(str)) {
                                                this.f36667t = z10 ? null : (String) obj;
                                                return;
                                            }
                                            if ("gdvkfc".equals(str)) {
                                                linkedList2 = this.f36668u;
                                                if (!z10) {
                                                    obj2 = (String) obj;
                                                }
                                            } else {
                                                if ("gpnmmt".equals(str)) {
                                                    this.f36669v = z10 ? null : (String) obj;
                                                    return;
                                                }
                                                if ("gpnmfp".equals(str)) {
                                                    linkedList2 = this.f36670w;
                                                    if (!z10) {
                                                        obj2 = (String) obj;
                                                    }
                                                } else if ("gia".equals(str)) {
                                                    linkedList2 = this.f36671x;
                                                    if (!z10) {
                                                        obj2 = (ArrayList) obj;
                                                    }
                                                } else if ("giafce".equals(str)) {
                                                    linkedList2 = this.f36672y;
                                                    if (!z10) {
                                                        obj2 = (ArrayList) obj;
                                                    }
                                                } else {
                                                    if ("gsl".equals(str)) {
                                                        this.f36673z = z10 ? null : (ArrayList) obj;
                                                        return;
                                                    }
                                                    if ("gavti".equals(str)) {
                                                        this.A = z10 ? null : (String) obj;
                                                        return;
                                                    }
                                                    if ("glctn".equals(str)) {
                                                        linkedList2 = this.B;
                                                        if (!z10) {
                                                            obj2 = (Location) obj;
                                                        }
                                                    } else {
                                                        if ("gtecloc".equals(str)) {
                                                            if (z10) {
                                                                obj = null;
                                                            }
                                                            this.C = obj;
                                                            return;
                                                        }
                                                        if ("gnbclin".equals(str)) {
                                                            this.D = z10 ? null : (ArrayList) obj;
                                                            return;
                                                        }
                                                        if ("gdvtp".equals(str)) {
                                                            this.E = z10 ? null : (String) obj;
                                                            return;
                                                        }
                                                        if ("wmcwi".equals(str)) {
                                                            this.F = z10 ? null : (HashMap) obj;
                                                            return;
                                                        }
                                                        if ("ipgist".equals(str)) {
                                                            linkedList = this.G;
                                                            obj = Boolean.valueOf(z10 ? false : ((Boolean) obj).booleanValue());
                                                        } else {
                                                            if ("gcuin".equals(str)) {
                                                                this.H = z10 ? null : (HashMap) obj;
                                                                return;
                                                            }
                                                            if ("gtydvin".equals(str)) {
                                                                this.I = z10 ? null : (ArrayList) obj;
                                                                return;
                                                            }
                                                            if ("gqmkn".equals(str)) {
                                                                this.J = z10 ? null : (String) obj;
                                                                return;
                                                            }
                                                            if ("gszin".equals(str)) {
                                                                this.K = z10 ? null : (HashMap) obj;
                                                                return;
                                                            }
                                                            if ("gmrin".equals(str)) {
                                                                this.L = z10 ? null : (HashMap) obj;
                                                                return;
                                                            }
                                                            if ("gmivsn".equals(str)) {
                                                                this.M = z10 ? null : (String) obj;
                                                                return;
                                                            }
                                                            if ("cx".equals(str)) {
                                                                this.N = z10 ? false : ((Boolean) obj).booleanValue();
                                                                return;
                                                            }
                                                            if ("ckpd".equals(str)) {
                                                                this.O = z10 ? false : ((Boolean) obj).booleanValue();
                                                                return;
                                                            }
                                                            if ("ubenbl".equals(str)) {
                                                                this.P = z10 ? false : ((Boolean) obj).booleanValue();
                                                                return;
                                                            }
                                                            if ("dvenbl".equals(str)) {
                                                                this.Q = z10 ? false : ((Boolean) obj).booleanValue();
                                                                return;
                                                            }
                                                            if ("ckua".equals(str)) {
                                                                this.R = z10 ? false : ((Boolean) obj).booleanValue();
                                                                return;
                                                            }
                                                            if ("vnmt".equals(str)) {
                                                                this.S = z10 ? false : ((Boolean) obj).booleanValue();
                                                                return;
                                                            }
                                                            if ("degb".equals(str)) {
                                                                this.T = z10 ? false : ((Boolean) obj).booleanValue();
                                                                return;
                                                            }
                                                            if ("iwpxy".equals(str)) {
                                                                this.U = z10 ? false : ((Boolean) obj).booleanValue();
                                                                return;
                                                            }
                                                            if ("gflv".equals(str)) {
                                                                this.V = z10 ? null : (String) obj;
                                                                return;
                                                            }
                                                            if ("gbsbd".equals(str)) {
                                                                this.W = z10 ? null : (String) obj;
                                                                return;
                                                            }
                                                            if ("gbfspy".equals(str)) {
                                                                this.X = z10 ? null : (String) obj;
                                                                return;
                                                            }
                                                            if ("gbplfo".equals(str)) {
                                                                this.Y = z10 ? null : (String) obj;
                                                                return;
                                                            }
                                                            if ("gdntp".equals(str)) {
                                                                this.Z = z10 ? 0 : ((Integer) obj).intValue();
                                                                return;
                                                            }
                                                            if ("qritsvc".equals(str)) {
                                                                linkedList2 = this.f36637aa;
                                                                if (!z10) {
                                                                    obj2 = (List) obj;
                                                                }
                                                            } else if ("rsaciy".equals(str)) {
                                                                linkedList2 = this.f36638ab;
                                                                if (!z10) {
                                                                    obj2 = (ResolveInfo) obj;
                                                                }
                                                            } else if ("gpgif".equals(str)) {
                                                                linkedList2 = this.f36639ac;
                                                                if (!z10) {
                                                                    obj2 = (PackageInfo) obj;
                                                                }
                                                            } else if ("gpgiffcin".equals(str)) {
                                                                linkedList2 = this.f36640ad;
                                                                if (!z10) {
                                                                    obj2 = (PackageInfo) obj;
                                                                }
                                                            } else if ("gpgifstrg".equals(str)) {
                                                                linkedList2 = this.f36641ae;
                                                                if (!z10) {
                                                                    obj2 = (PackageInfo) obj;
                                                                }
                                                            } else {
                                                                if ("giads".equals(str)) {
                                                                    this.f36642af = z10 ? null : (String) obj;
                                                                    return;
                                                                }
                                                                if ("gdvda".equals(str)) {
                                                                    this.f36643ag = z10 ? null : (String) obj;
                                                                    return;
                                                                }
                                                                if ("gdvdtnas".equals(str)) {
                                                                    this.f36644ah = z10 ? null : (String) obj;
                                                                    return;
                                                                }
                                                                if ("galtut".equals(str)) {
                                                                    this.f36645ai = z10 ? 0L : ((Long) obj).longValue();
                                                                    return;
                                                                }
                                                                if ("gdvme".equals(str)) {
                                                                    this.f36646aj = z10 ? null : (String) obj;
                                                                    return;
                                                                }
                                                                if ("gcrup".equals(str)) {
                                                                    this.f36647ak = z10 ? null : (String) obj;
                                                                    return;
                                                                }
                                                                if ("gcifm".equals(str)) {
                                                                    this.f36648al = z10 ? null : (String) obj;
                                                                    return;
                                                                }
                                                                if ("godm".equals(str)) {
                                                                    this.am = z10 ? null : (String) obj;
                                                                    return;
                                                                }
                                                                if ("godhm".equals(str)) {
                                                                    this.an = z10 ? null : (String) obj;
                                                                    return;
                                                                }
                                                                if ("galdm".equals(str)) {
                                                                    this.ao = z10 ? null : (HashMap) obj;
                                                                    return;
                                                                }
                                                                if ("gtaif".equals(str)) {
                                                                    this.ap = z10 ? null : (ApplicationInfo) obj;
                                                                    return;
                                                                }
                                                                if ("gtaifprm".equals(str)) {
                                                                    linkedList2 = this.aq;
                                                                    if (!z10) {
                                                                        obj2 = (ApplicationInfo) obj;
                                                                    }
                                                                } else if ("gtaifprmfce".equals(str)) {
                                                                    linkedList2 = this.ar;
                                                                    if (!z10) {
                                                                        obj2 = (ApplicationInfo) obj;
                                                                    }
                                                                } else {
                                                                    if ("gtbdt".equals(str)) {
                                                                        this.as = z10 ? 0L : ((Long) obj).longValue();
                                                                        return;
                                                                    }
                                                                    if ("gtscnin".equals(str)) {
                                                                        this.at = z10 ? 0.0d : ((Double) obj).doubleValue();
                                                                        return;
                                                                    }
                                                                    if ("gtscnppi".equals(str)) {
                                                                        this.au = z10 ? 0 : ((Integer) obj).intValue();
                                                                        return;
                                                                    }
                                                                    if ("ishmos".equals(str)) {
                                                                        this.av = z10 ? false : ((Boolean) obj).booleanValue();
                                                                        return;
                                                                    }
                                                                    if ("gthmosv".equals(str)) {
                                                                        this.aw = z10 ? null : (String) obj;
                                                                        return;
                                                                    }
                                                                    if ("gthmosdtlv".equals(str)) {
                                                                        this.ax = z10 ? null : (String) obj;
                                                                        return;
                                                                    }
                                                                    if ("gthmpmst".equals(str)) {
                                                                        this.ay = z10 ? -1 : ((Integer) obj).intValue();
                                                                        return;
                                                                    }
                                                                    if ("gthmepmst".equals(str)) {
                                                                        this.az = z10 ? -1 : ((Integer) obj).intValue();
                                                                        return;
                                                                    }
                                                                    if ("gtinnerlangmt".equals(str)) {
                                                                        this.aA = z10 ? null : (String) obj;
                                                                        return;
                                                                    }
                                                                    if ("gtgramgendt".equals(str)) {
                                                                        this.aB = z10 ? 0 : ((Integer) obj).intValue();
                                                                        return;
                                                                    }
                                                                    if ("gtelcmefce".equals(str)) {
                                                                        linkedList2 = this.aC;
                                                                        if (!z10) {
                                                                            obj2 = (List) obj;
                                                                        }
                                                                    } else {
                                                                        if ("gtmwfo".equals(str)) {
                                                                            this.aD = z10 ? null : (HashMap) obj;
                                                                            return;
                                                                        }
                                                                        if ("wmcwifce".equals(str)) {
                                                                            linkedList2 = this.aE;
                                                                            if (!z10) {
                                                                                obj2 = (HashMap) obj;
                                                                            }
                                                                        } else {
                                                                            if ("gtaifok".equals(str)) {
                                                                                this.aF = z10 ? null : (ArrayList) obj;
                                                                                return;
                                                                            }
                                                                            if ("gtmcdi".equals(str)) {
                                                                                this.aG = z10 ? null : (String) obj;
                                                                                return;
                                                                            }
                                                                            if ("gtmcdifce".equals(str)) {
                                                                                linkedList2 = this.aH;
                                                                                if (!z10) {
                                                                                    obj2 = (String) obj;
                                                                                }
                                                                            } else {
                                                                                if ("gtmbcdi".equals(str)) {
                                                                                    this.aI = z10 ? null : (String) obj;
                                                                                    return;
                                                                                }
                                                                                if ("gtmbcdifce".equals(str)) {
                                                                                    linkedList2 = this.aJ;
                                                                                    if (!z10) {
                                                                                        obj2 = (String) obj;
                                                                                    }
                                                                                } else {
                                                                                    if ("miwpy".equals(str)) {
                                                                                        this.aK = z10 ? false : ((Boolean) obj).booleanValue();
                                                                                        return;
                                                                                    }
                                                                                    if ("gtmnbclfo".equals(str)) {
                                                                                        this.aL = z10 ? null : (ArrayList) obj;
                                                                                        return;
                                                                                    }
                                                                                    if ("ctedebbing".equals(str)) {
                                                                                        if (!z10 && ((Boolean) obj).booleanValue()) {
                                                                                            z11 = true;
                                                                                        }
                                                                                        this.aP = z11;
                                                                                        return;
                                                                                    }
                                                                                    if ("gteacifo".equals(str)) {
                                                                                        this.aQ = z10 ? null : (ArrayList) obj;
                                                                                        return;
                                                                                    }
                                                                                    if ("gtdm".equals(str)) {
                                                                                        this.aR = z10 ? null : (String) obj;
                                                                                        return;
                                                                                    }
                                                                                    if (!"gtlstactme".equals(str)) {
                                                                                        throw new Throwable("Unknown name to set: " + str + ", value: " + obj);
                                                                                    }
                                                                                    linkedList = this.aS;
                                                                                    obj = Long.valueOf(z10 ? -1L : ((Long) obj).longValue());
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    linkedList2.add(obj2);
                    return;
                }
                linkedList = this.aO;
                if (z10) {
                    obj = null;
                }
            }
            linkedList.add(obj);
        }

        public boolean a() {
            return this.f36636a;
        }

        public String b() {
            return null;
        }

        public String b(int... iArr) {
            return (String) a(this.f36663p, bq.a("004fVelWfg"), iArr);
        }

        public String c() {
            return this.f36654g;
        }

        public String c(int... iArr) {
            return (String) a(this.f36668u, (Object) null, iArr);
        }

        public String d() {
            return this.f36655h;
        }

        public ArrayList<HashMap<String, String>> d(int... iArr) {
            return (ArrayList) a(this.f36672y, new ArrayList(), iArr);
        }

        public String e() {
            return this.f36657j;
        }

        public boolean e(int... iArr) {
            return ((Boolean) a(this.G, Boolean.FALSE, iArr)).booleanValue();
        }

        public String f() {
            return null;
        }

        public List<ResolveInfo> f(int... iArr) {
            return (List) a(this.f36637aa, (Object) null, iArr);
        }

        public PackageInfo g(int... iArr) {
            return (PackageInfo) a(this.f36639ac, (Object) null, iArr);
        }

        public String g() {
            return this.f36659l;
        }

        public ApplicationInfo h(int... iArr) {
            return (ApplicationInfo) a(this.aq, (Object) null, iArr);
        }

        public String h() {
            return this.f36666s;
        }

        public String i() {
            return this.f36667t;
        }

        public List i(int... iArr) {
            return (List) a(this.aC, (Object) null, iArr);
        }

        public String j() {
            return this.f36669v;
        }

        public HashMap<String, Object> j(int... iArr) {
            return (HashMap) a(this.aE, (Object) null, iArr);
        }

        public Object k(int... iArr) {
            return a(this.aM, (Object) null, iArr);
        }

        public ArrayList<HashMap<String, String>> k() {
            return this.f36673z;
        }

        public Object l(int... iArr) {
            return a(this.aN, (Object) null, iArr);
        }

        public String l() {
            return this.A;
        }

        public Object m(int... iArr) {
            return a(this.aO, (Object) null, iArr);
        }

        public String m() {
            return null;
        }

        public long n(int... iArr) {
            return ((Long) a((LinkedList<long>) this.aS, -1L, iArr)).longValue();
        }

        public Object n() {
            return this.C;
        }

        public String o() {
            return this.E;
        }

        public HashMap<String, HashMap<String, Long>> p() {
            return this.K;
        }

        public HashMap<String, Long> q() {
            return this.L;
        }

        public String r() {
            return this.M;
        }

        public boolean s() {
            return this.N;
        }

        public boolean t() {
            return this.O;
        }

        public boolean u() {
            return this.P;
        }

        public boolean v() {
            return this.R;
        }

        public boolean w() {
            return this.S;
        }

        public int x() {
            return this.Z;
        }

        public String y() {
            return this.f36642af;
        }

        public String z() {
            return this.f36646aj;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f36674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedList<a> f36675b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f36683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object[] f36684b;

            private a(String str, Object... objArr) {
                this.f36683a = str;
                this.f36684b = objArr;
            }
        }

        private c(Context context) {
            this.f36675b = new LinkedList<>();
            this.f36674a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b N() {
            b bVar = new b();
            for (int i10 = 0; i10 < this.f36675b.size(); i10++) {
                a aVar = this.f36675b.get(i10);
                try {
                    String str = aVar.f36683a;
                    bVar.a(str, a(str, aVar.f36684b));
                } catch (Throwable th2) {
                    try {
                        es.a().a(th2);
                        bVar.a(aVar.f36683a, (Object) null, true);
                    } catch (Throwable th3) {
                        es.a().a(th3);
                    }
                }
            }
            return bVar;
        }

        private Object a(String str, Object[] objArr) throws Throwable {
            if ("gmpfo".equals(str)) {
                if (objArr != null && objArr.length == 2) {
                    return fc.a(this.f36674a).d().b(false, 0, (String) objArr[0], ((Integer) objArr[1]).intValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gmpfofce".equals(str)) {
                if (objArr == null || objArr.length != 3) {
                    throw new Throwable("params illegal: " + objArr);
                }
                return fc.a(this.f36674a).d().b(((Boolean) objArr[0]).booleanValue(), 0, (String) objArr[1], ((Integer) objArr[2]).intValue());
            }
            if ("getMpfos".equals(str)) {
                if (objArr == null || objArr.length != 3) {
                    throw new Throwable("params illegal: " + objArr);
                }
                return fc.a(this.f36674a).d().b(false, ((Integer) objArr[0]).intValue(), (String) objArr[1], ((Integer) objArr[2]).intValue());
            }
            if ("cird".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().a());
            }
            if ("gsimt".equals(str)) {
                return fc.a(this.f36674a).d().a(false);
            }
            if ("gsimtfce".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().a(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gbsi".equals(str)) {
                return fc.a(this.f36674a).d().b(false);
            }
            if ("gbsifce".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().b(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gstmpts".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().a((String) objArr[0]);
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gscsz".equals(str)) {
                return fc.a(this.f36674a).d().C();
            }
            if ("gcrie".equals(str)) {
                return fc.a(this.f36674a).d().c(false);
            }
            if ("gcriefce".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().c(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gcrnm".equals(str)) {
                return fc.a(this.f36674a).d().d(false);
            }
            if ("gcrnmfce".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().d(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gsnmd".equals(str)) {
                return fc.a(this.f36674a).d().S();
            }
            if ("gsnmdfp".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().c((String) objArr[0]);
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gneyp".equals(str)) {
                return fc.a(this.f36674a).d().f(false);
            }
            if ("gneypnw".equals(str)) {
                return fc.a(this.f36674a).d().D();
            }
            if ("gneypfce".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().f(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("cknavbl".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().G());
            }
            if ("gnktpfs".equals(str)) {
                return fc.a(this.f36674a).d().E();
            }
            if ("gdtlnktpfs".equals(str)) {
                return fc.a(this.f36674a).d().F();
            }
            if ("gdvk".equals(str)) {
                return fc.a(this.f36674a).d().Q();
            }
            if ("gdvkfc".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().g(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gpnmmt".equals(str)) {
                return fc.a(this.f36674a).d().U();
            }
            if ("gpnmfp".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().d((String) objArr[0]);
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gia".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().a(((Boolean) objArr[0]).booleanValue(), false);
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("giafce".equals(str)) {
                if (objArr != null && objArr.length == 2) {
                    return fc.a(this.f36674a).d().a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gsl".equals(str)) {
                return fc.a(this.f36674a).d().P();
            }
            if ("gscpt".equals(str)) {
                return fc.a(this.f36674a).d().R();
            }
            if ("gavti".equals(str)) {
                return fc.a(this.f36674a).d().j();
            }
            if ("glctn".equals(str)) {
                if (objArr == null || objArr.length != 3) {
                    throw new Throwable("params illegal: " + objArr);
                }
                return fc.a(this.f36674a).d().a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
            }
            if ("gtecloc".equals(str)) {
                return fc.a(this.f36674a).d().p();
            }
            if ("gnbclin".equals(str)) {
                return fc.a(this.f36674a).d().q();
            }
            if ("gdvtp".equals(str)) {
                return fc.a(this.f36674a).d().o();
            }
            if ("wmcwi".equals(str)) {
                return fc.a(this.f36674a).d().r();
            }
            if ("ipgist".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return Boolean.valueOf(fc.a(this.f36674a).d().b((String) objArr[0]));
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gcuin".equals(str)) {
                return fc.a(this.f36674a).d().w();
            }
            if ("gtydvin".equals(str)) {
                return fc.a(this.f36674a).d().x();
            }
            if ("gqmkn".equals(str)) {
                return fc.a(this.f36674a).d().y();
            }
            if ("gszin".equals(str)) {
                return fc.a(this.f36674a).d().z();
            }
            if ("gmrin".equals(str)) {
                return fc.a(this.f36674a).d().A();
            }
            if ("gmivsn".equals(str)) {
                return fc.a(this.f36674a).d().k();
            }
            if ("cx".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().b());
            }
            if ("ckpd".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().c());
            }
            if ("ubenbl".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().h());
            }
            if ("dvenbl".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().g());
            }
            if ("ckua".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().f());
            }
            if ("vnmt".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().e());
            }
            if ("degb".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().d());
            }
            if ("iwpxy".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().i());
            }
            if ("gflv".equals(str)) {
                return fc.a(this.f36674a).d().J();
            }
            if ("gbsbd".equals(str)) {
                return fc.a(this.f36674a).d().K();
            }
            if ("gbfspy".equals(str)) {
                return fc.a(this.f36674a).d().L();
            }
            if ("gbplfo".equals(str)) {
                return fc.a(this.f36674a).d().M();
            }
            if ("gdntp".equals(str)) {
                return Integer.valueOf(fc.a(this.f36674a).d().H());
            }
            if ("qritsvc".equals(str)) {
                if (objArr != null && objArr.length == 2) {
                    return fc.a(this.f36674a).d().a((Intent) objArr[0], ((Integer) objArr[1]).intValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("rsaciy".equals(str)) {
                if (objArr != null && objArr.length == 2) {
                    return fc.a(this.f36674a).d().b((Intent) objArr[0], ((Integer) objArr[1]).intValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gpgif".equals(str)) {
                if (objArr != null && objArr.length == 2) {
                    return fc.a(this.f36674a).d().a(false, 0, (String) objArr[0], ((Integer) objArr[1]).intValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gpgiffcin".equals(str)) {
                if (objArr == null || objArr.length != 3) {
                    throw new Throwable("params illegal: " + objArr);
                }
                return fc.a(this.f36674a).d().a(((Boolean) objArr[0]).booleanValue(), 0, (String) objArr[1], ((Integer) objArr[2]).intValue());
            }
            if ("gpgifstrg".equals(str)) {
                if (objArr == null || objArr.length != 3) {
                    throw new Throwable("params illegal: " + objArr);
                }
                return fc.a(this.f36674a).d().a(false, ((Integer) objArr[0]).intValue(), (String) objArr[1], ((Integer) objArr[2]).intValue());
            }
            if ("giads".equals(str)) {
                return fc.a(this.f36674a).d().N();
            }
            if ("gdvda".equals(str)) {
                return fc.a(this.f36674a).d().ab();
            }
            if ("gdvdtnas".equals(str)) {
                return fc.a(this.f36674a).d().ac();
            }
            if ("galtut".equals(str)) {
                return Long.valueOf(fc.a(this.f36674a).d().ad());
            }
            if ("gdvme".equals(str)) {
                return fc.a(this.f36674a).d().ae();
            }
            if ("gcrup".equals(str)) {
                return fc.a(this.f36674a).d().af();
            }
            if ("gcifm".equals(str)) {
                return fc.a(this.f36674a).d().ag();
            }
            if ("godm".equals(str)) {
                return fc.a(this.f36674a).d().ah();
            }
            if ("godhm".equals(str)) {
                return fc.a(this.f36674a).d().ai();
            }
            if ("galdm".equals(str)) {
                return fc.a(this.f36674a).d().aj();
            }
            if ("gtaif".equals(str)) {
                return fc.a(this.f36674a).d().ak();
            }
            if ("gtaifprm".equals(str)) {
                if (objArr != null && objArr.length == 2) {
                    return fc.a(this.f36674a).d().a((String) objArr[0], ((Integer) objArr[1]).intValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gtaifprmfce".equals(str)) {
                if (objArr == null || objArr.length != 3) {
                    throw new Throwable("params illegal: " + objArr);
                }
                return fc.a(this.f36674a).d().a(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], ((Integer) objArr[2]).intValue());
            }
            if ("gtbdt".equals(str)) {
                return Long.valueOf(fc.a(this.f36674a).d().am());
            }
            if ("gtscnin".equals(str)) {
                return Double.valueOf(fc.a(this.f36674a).d().an());
            }
            if ("gtscnppi".equals(str)) {
                return Integer.valueOf(fc.a(this.f36674a).d().ao());
            }
            if ("ishmos".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().ap());
            }
            if ("gthmosv".equals(str)) {
                return fc.a(this.f36674a).d().aq();
            }
            if ("gthmosdtlv".equals(str)) {
                return fc.a(this.f36674a).d().ar();
            }
            if ("gthmpmst".equals(str)) {
                return Integer.valueOf(fc.a(this.f36674a).d().as());
            }
            if ("gthmepmst".equals(str)) {
                return Integer.valueOf(fc.a(this.f36674a).d().at());
            }
            if ("gtinnerlangmt".equals(str)) {
                return fc.a(this.f36674a).d().au();
            }
            if ("gtgramgendt".equals(str)) {
                return Integer.valueOf(fc.a(this.f36674a).d().av());
            }
            if ("gtelcmefce".equals(str)) {
                return fc.a(this.f36674a).d().a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
            }
            if ("gtmwfo".equals(str)) {
                return fc.a(this.f36674a).d().e(false);
            }
            if ("wmcwifce".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().e(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gtaifok".equals(str)) {
                return fc.a(this.f36674a).d().al();
            }
            if ("gtmcdi".equals(str)) {
                return fc.a(this.f36674a).d().a(false);
            }
            if ("gtmcdifce".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().a(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("gtmbcdi".equals(str)) {
                return fc.a(this.f36674a).d().b(false);
            }
            if ("gtmbcdifce".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().b(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if ("miwpy".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().i());
            }
            if ("gtmnbclfo".equals(str)) {
                return fc.a(this.f36674a).d().q();
            }
            if ("ctedebbing".equals(str)) {
                return Boolean.valueOf(fc.a(this.f36674a).d().aw());
            }
            if ("gteacifo".equals(str)) {
                return fc.a(this.f36674a).d().ax();
            }
            if ("gtdm".equals(str)) {
                if (objArr != null && objArr.length == 1) {
                    return fc.a(this.f36674a).d().h(((Boolean) objArr[0]).booleanValue());
                }
                throw new Throwable("params illegal: " + objArr);
            }
            if (!"gtlstactme".equals(str)) {
                return null;
            }
            if (objArr != null && objArr.length == 1) {
                return Long.valueOf(fc.a(this.f36674a).d().f((String) objArr[0]));
            }
            throw new Throwable("params illegal: " + objArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(a aVar) {
            if (aVar != null) {
                try {
                    aVar.a(new b());
                } catch (Throwable th2) {
                    es.a().a(th2, "Error from caller", new Object[0]);
                }
            }
        }

        public c A() {
            this.f36675b.add(new a("gdvme", new Object[0]));
            return this;
        }

        public c B() {
            this.f36675b.add(new a("godm", new Object[0]));
            return this;
        }

        public c C() {
            this.f36675b.add(new a("godhm", new Object[0]));
            return this;
        }

        public c D() {
            this.f36675b.add(new a("gthmosdtlv", new Object[0]));
            return this;
        }

        public c E() {
            this.f36675b.add(new a("gtinnerlangmt", new Object[0]));
            return this;
        }

        public c F() {
            this.f36675b.add(new a("gtgramgendt", new Object[0]));
            return this;
        }

        public c G() {
            this.f36675b.add(new a("gtmwfo", new Object[0]));
            return this;
        }

        public c H() {
            this.f36675b.add(new a("gtaifok", new Object[0]));
            return this;
        }

        public c I() {
            this.f36675b.add(new a("gtmcdi", new Object[0]));
            return this;
        }

        public c J() {
            this.f36675b.add(new a("gtmbcdi", new Object[0]));
            return this;
        }

        public c K() {
            this.f36675b.add(new a("miwpy", new Object[0]));
            return this;
        }

        public c L() {
            this.f36675b.add(new a("gtmnbclfo", new Object[0]));
            return this;
        }

        public c M() {
            this.f36675b.add(new a("gteacifo", new Object[0]));
            return this;
        }

        public c a() {
            this.f36675b.add(new a("cird", new Object[0]));
            return this;
        }

        public c a(int i10, int i11, boolean z10, boolean z11) {
            this.f36675b.add(new a("gtelcmefce", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11)}));
            return this;
        }

        public c a(int i10, String str, int i11) {
            this.f36675b.add(new a("getMpfos", new Object[]{Integer.valueOf(i10), str, Integer.valueOf(i11)}));
            return this;
        }

        public c a(Intent intent, int i10) {
            this.f36675b.add(new a("qritsvc", new Object[]{intent, Integer.valueOf(i10)}));
            return this;
        }

        public c a(String str) {
            this.f36675b.add(new a("ipgist", new Object[]{str}));
            return this;
        }

        public c a(String str, int i10) {
            this.f36675b.add(new a("gpgif", new Object[]{str, Integer.valueOf(i10)}));
            return this;
        }

        public c a(boolean z10) {
            this.f36675b.add(new a("gcriefce", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public c a(boolean z10, String str, int i10) {
            this.f36675b.add(new a("gmpfofce", new Object[]{Boolean.valueOf(z10), str, Integer.valueOf(i10)}));
            return this;
        }

        public c a(boolean z10, boolean z11) {
            this.f36675b.add(new a("giafce", new Object[]{Boolean.valueOf(z10), Boolean.valueOf(z11)}));
            return this;
        }

        public void a(final a aVar) {
            try {
                boolean z10 = Looper.getMainLooper() == Looper.myLooper();
                final Boolean bool = fl.f36580b.get();
                final Boolean bool2 = fl.f36581c.get();
                final boolean z11 = z10;
                Runnable runnable = new Runnable() { // from class: cn.fly.verify.fz.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            fl.f36579a.set(Boolean.TRUE);
                            fl.f36580b.set(bool);
                            fl.f36581c.set(bool2);
                            final b bVarN = c.this.N();
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                if (z11) {
                                    gm.a(0, new Handler.Callback() { // from class: cn.fly.verify.fz.c.1.1
                                        @Override // android.os.Handler.Callback
                                        public boolean handleMessage(Message message) {
                                            try {
                                                aVar.a(bVarN);
                                            } catch (Throwable th2) {
                                                es.a().a(th2, "Error from caller", new Object[0]);
                                            }
                                            return false;
                                        }
                                    });
                                } else {
                                    try {
                                        aVar2.a(bVarN);
                                    } catch (Throwable th2) {
                                        es.a().a(th2, "Error from caller", new Object[0]);
                                    }
                                }
                            }
                            ThreadLocal<Boolean> threadLocal = fl.f36579a;
                            Boolean bool3 = Boolean.FALSE;
                            threadLocal.set(bool3);
                            fl.f36580b.set(bool3);
                            fl.f36581c.set(bool3);
                        } catch (Throwable th3) {
                            es.a().a(th3);
                            c.this.b(aVar);
                        }
                    }
                };
                if (z10) {
                    ep.f36344g.execute(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th2) {
                es.a().a(th2);
                if (aVar != null) {
                    b(aVar);
                }
            }
        }

        public c b() {
            return this;
        }

        public c b(String str) {
            this.f36675b.add(new a("gtlstactme", new Object[]{str}));
            return this;
        }

        public c b(String str, int i10) {
            this.f36675b.add(new a("gtaifprm", new Object[]{str, Integer.valueOf(i10)}));
            return this;
        }

        public c b(boolean z10) {
            this.f36675b.add(new a("gneypfce", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public c c() {
            this.f36675b.add(new a("gscsz", new Object[0]));
            return this;
        }

        public c c(String str, int i10) {
            this.f36675b.add(new a("gmpfo", new Object[]{str, Integer.valueOf(i10)}));
            return this;
        }

        public c c(boolean z10) {
            this.f36675b.add(new a("gdvkfc", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public c d() {
            this.f36675b.add(new a("gcrie", new Object[0]));
            return this;
        }

        public c d(boolean z10) {
            this.f36675b.add(new a("wmcwifce", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public c e() {
            this.f36675b.add(new a("gcrnm", new Object[0]));
            return this;
        }

        public c e(boolean z10) {
            this.f36675b.add(new a("gtdm", new Object[]{Boolean.valueOf(z10)}));
            return this;
        }

        public c f() {
            return this;
        }

        public c g() {
            this.f36675b.add(new a("gsnmd", new Object[0]));
            return this;
        }

        public c h() {
            this.f36675b.add(new a("gdtlnktpfs", new Object[0]));
            return this;
        }

        public c i() {
            this.f36675b.add(new a("gdvk", new Object[0]));
            return this;
        }

        public c j() {
            this.f36675b.add(new a("gpnmmt", new Object[0]));
            return this;
        }

        public c k() {
            this.f36675b.add(new a("gsl", new Object[0]));
            return this;
        }

        public c l() {
            this.f36675b.add(new a("gavti", new Object[0]));
            return this;
        }

        public c m() {
            return this;
        }

        public c n() {
            this.f36675b.add(new a("gtecloc", new Object[0]));
            return this;
        }

        public c o() {
            this.f36675b.add(new a("gdvtp", new Object[0]));
            return this;
        }

        public c p() {
            this.f36675b.add(new a("gszin", new Object[0]));
            return this;
        }

        public c q() {
            this.f36675b.add(new a("gmrin", new Object[0]));
            return this;
        }

        public c r() {
            this.f36675b.add(new a("gmivsn", new Object[0]));
            return this;
        }

        public c s() {
            this.f36675b.add(new a("cx", new Object[0]));
            return this;
        }

        public c t() {
            this.f36675b.add(new a("ckpd", new Object[0]));
            return this;
        }

        public c u() {
            this.f36675b.add(new a("ubenbl", new Object[0]));
            return this;
        }

        public c v() {
            this.f36675b.add(new a("ckua", new Object[0]));
            return this;
        }

        public c w() {
            this.f36675b.add(new a("vnmt", new Object[0]));
            return this;
        }

        public c x() {
            this.f36675b.add(new a("gdntp", new Object[0]));
            return this;
        }

        public c y() {
            this.f36675b.add(new a("giads", new Object[0]));
            return this;
        }

        public c z() {
            this.f36675b.add(new a("galtut", new Object[0]));
            return this;
        }
    }

    public static final class d {
        public static <T> T a(Object obj, String str, Object... objArr) {
            return (T) gi.a(obj, str, (Object) null, objArr);
        }

        public static <T> T a(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
            try {
                return (T) gi.a(obj, str, objArr, clsArr);
            } catch (Throwable th2) {
                if (!(th2 instanceof InvocationTargetException)) {
                    if (!(th2 instanceof PackageManager.NameNotFoundException)) {
                        es.a().a(th2);
                        return null;
                    }
                    es.a().a("Exception: " + th2.getClass().getName() + ": " + th2.getMessage(), new Object[0]);
                    return null;
                }
                String name = th2.getClass().getName();
                String message = th2.getMessage();
                Throwable cause = th2.getCause();
                if (cause != null) {
                    name = cause.getClass().getName();
                    message = cause.getMessage();
                }
                es.a().a("Exception: " + name + ": " + message, new Object[0]);
                return null;
            }
        }

        public static Object a(String str) {
            return el.d(str);
        }

        public static String a() {
            return fc.a(ax.g()).d().R();
        }

        public static boolean b() {
            return fc.a(ax.g()).d().X();
        }

        public static boolean b(String str) {
            return fc.a(ax.g()).d().e(str);
        }

        public static String c() {
            return fc.a(ax.g()).d().T();
        }

        public static String c(String str) {
            return fc.a(ax.g()).d().a(str);
        }

        public static String d() {
            return fc.a(ax.g()).d().Y();
        }

        public static int e() {
            return 1;
        }

        public static String f() {
            return fc.a(ax.g()).d().W();
        }

        public static int g() {
            return fc.a(ax.g()).d().s();
        }

        public static String h() {
            return fc.a(ax.g()).d().t();
        }

        public static String i() {
            return fc.a(ax.g()).d().I();
        }

        public static String j() {
            return fc.a(ax.g()).d().l();
        }

        public static String k() {
            return fc.a(ax.g()).d().m();
        }

        public static String l() {
            return fc.a(ax.g()).d().n();
        }

        public static int m() {
            return fc.a(ax.g()).d().V();
        }
    }

    public static c a(Context context) {
        return new c(context);
    }
}

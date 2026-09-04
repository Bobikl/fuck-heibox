package eg;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: InvisibleFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\u0006J\b\u0010\u001c\u001a\u00020\u0006H\u0016¨\u0006\u001f"}, d2 = {"Leg/l;", "Landroidx/fragment/app/Fragment;", "", "", "", "grantResults", "Lkotlin/b2;", "Y3", "granted", "V3", "Z3", "a4", "X3", "W3", "S3", "Leg/r;", "permissionBuilder", "", "permissions", "Leg/b;", "chainTask", "i4", "b4", "k4", "m4", "g4", "e4", "T3", "onDestroy", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class l extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f118632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f118633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final androidx.activity.result.g<String[]> f118634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final androidx.activity.result.g<String> f118635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final androidx.activity.result.g<Intent> f118636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final androidx.activity.result.g<Intent> f118637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final androidx.activity.result.g<Intent> f118638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final androidx.activity.result.g<Intent> f118639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final androidx.activity.result.g<Intent> f118640j;

    public l() {
        androidx.activity.result.g<String[]> gVarRegisterForActivityResult = registerForActivityResult(new z.b.k(), new androidx.activity.result.a() { // from class: eg.e
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                l.h4(this.f118625a, (Map) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult, "registerForActivityResul…esult(grantResults)\n    }");
        this.f118634d = gVarRegisterForActivityResult;
        androidx.activity.result.g<String> gVarRegisterForActivityResult2 = registerForActivityResult(new z.b.l(), new androidx.activity.result.a() { // from class: eg.f
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                l.c4(this.f118626a, (Boolean) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult2, "registerForActivityResul…sionResult(granted)\n    }");
        this.f118635e = gVarRegisterForActivityResult2;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult3 = registerForActivityResult(new z.b.m(), new androidx.activity.result.a() { // from class: eg.g
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                l.j4(this.f118627a, (ActivityResult) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult3, "registerForActivityResul…wPermissionResult()\n    }");
        this.f118636f = gVarRegisterForActivityResult3;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult4 = registerForActivityResult(new z.b.m(), new androidx.activity.result.a() { // from class: eg.h
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                l.l4(this.f118628a, (ActivityResult) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult4, "registerForActivityResul…sPermissionResult()\n    }");
        this.f118637g = gVarRegisterForActivityResult4;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult5 = registerForActivityResult(new z.b.m(), new androidx.activity.result.a() { // from class: eg.i
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                l.f4(this.f118629a, (ActivityResult) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult5, "registerForActivityResul…ePermissionResult()\n    }");
        this.f118638h = gVarRegisterForActivityResult5;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult6 = registerForActivityResult(new z.b.m(), new androidx.activity.result.a() { // from class: eg.j
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                l.d4(this.f118630a, (ActivityResult) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult6, "registerForActivityResul…sPermissionResult()\n    }");
        this.f118639i = gVarRegisterForActivityResult6;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult7 = registerForActivityResult(new z.b.m(), new androidx.activity.result.a() { // from class: eg.k
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                l.U3(this.f118631a, (ActivityResult) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult7, "registerForActivityResul…issions))\n        }\n    }");
        this.f118640j = gVarRegisterForActivityResult7;
    }

    private final boolean S3() {
        if (this.f118632b != null && this.f118633c != null) {
            return true;
        }
        Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(l this$0, ActivityResult activityResult) {
        f0.p(this$0, "this$0");
        if (this$0.S3()) {
            b bVar = this$0.f118633c;
            r rVar = null;
            if (bVar == null) {
                f0.S("task");
                bVar = null;
            }
            r rVar2 = this$0.f118632b;
            if (rVar2 == null) {
                f0.S("pb");
            } else {
                rVar = rVar2;
            }
            bVar.b(new ArrayList(rVar.f118673p));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    private final void V3(boolean z10) {
        ArrayList arrayList;
        r rVar;
        r rVar2;
        b bVar;
        r rVar3;
        b bVar2;
        b bVar3;
        r rVar4;
        r rVar5;
        r rVar6;
        b bVar4;
        if (S3()) {
            b bVar5 = null;
            if (z10) {
                r rVar7 = this.f118632b;
                if (rVar7 == null) {
                    f0.S("pb");
                    rVar7 = null;
                }
                rVar7.f118669l.add(s.f118679f);
                r rVar8 = this.f118632b;
                if (rVar8 == null) {
                    f0.S("pb");
                    rVar8 = null;
                }
                rVar8.f118670m.remove(s.f118679f);
                r rVar9 = this.f118632b;
                if (rVar9 == null) {
                    f0.S("pb");
                    rVar9 = null;
                }
                rVar9.f118671n.remove(s.f118679f);
                b bVar6 = this.f118633c;
                if (bVar6 == null) {
                    f0.S("task");
                } else {
                    bVar5 = bVar6;
                }
                bVar5.finish();
                return;
            }
            boolean z11 = true;
            boolean zShouldShowRequestPermissionRationale = shouldShowRequestPermissionRationale(s.f118679f);
            r rVar10 = this.f118632b;
            if (rVar10 == null) {
                f0.S("pb");
                rVar10 = null;
            }
            if (rVar10.f118675r == null) {
                r rVar11 = this.f118632b;
                if (rVar11 == null) {
                    f0.S("pb");
                    rVar11 = null;
                }
                if (rVar11.f118676s == null) {
                    rVar5 = this.f118632b;
                    if (rVar5 == null) {
                        f0.S("pb");
                        rVar5 = null;
                    }
                    if (rVar5.f118677t != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(s.f118679f);
                        rVar6 = this.f118632b;
                        if (rVar6 == null) {
                            f0.S("pb");
                            rVar6 = null;
                        }
                        cg.c cVar = rVar6.f118677t;
                        f0.m(cVar);
                        bVar4 = this.f118633c;
                        if (bVar4 == null) {
                            f0.S("task");
                            bVar4 = null;
                        }
                        cVar.a(bVar4.getF118620d(), arrayList2);
                    }
                } else if (!zShouldShowRequestPermissionRationale) {
                    arrayList = new ArrayList();
                    arrayList.add(s.f118679f);
                    rVar = this.f118632b;
                    if (rVar == null) {
                        f0.S("pb");
                        rVar = null;
                    }
                    if (rVar.f118676s != null) {
                        rVar3 = this.f118632b;
                        if (rVar3 == null) {
                            f0.S("pb");
                            rVar3 = null;
                        }
                        cg.b bVar7 = rVar3.f118676s;
                        f0.m(bVar7);
                        bVar2 = this.f118633c;
                        if (bVar2 == null) {
                            f0.S("task");
                            bVar2 = null;
                        }
                        bVar7.a(bVar2.getF118619c(), arrayList, false);
                    } else {
                        rVar2 = this.f118632b;
                        if (rVar2 == null) {
                            f0.S("pb");
                            rVar2 = null;
                        }
                        cg.a aVar = rVar2.f118675r;
                        f0.m(aVar);
                        bVar = this.f118633c;
                        if (bVar == null) {
                            f0.S("task");
                            bVar = null;
                        }
                        aVar.a(bVar.getF118619c(), arrayList);
                    }
                } else {
                    rVar5 = this.f118632b;
                    if (rVar5 == null) {
                        f0.S("pb");
                        rVar5 = null;
                    }
                    if (rVar5.f118677t != null) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(s.f118679f);
                        rVar6 = this.f118632b;
                        if (rVar6 == null) {
                            f0.S("pb");
                            rVar6 = null;
                        }
                        cg.c cVar2 = rVar6.f118677t;
                        f0.m(cVar2);
                        bVar4 = this.f118633c;
                        if (bVar4 == null) {
                            f0.S("task");
                            bVar4 = null;
                        }
                        cVar2.a(bVar4.getF118620d(), arrayList3);
                    }
                }
                if (!z11) {
                    rVar4 = this.f118632b;
                    if (rVar4 == null) {
                        f0.S("pb");
                        rVar4 = null;
                    }
                    if (rVar4.f118667j) {
                        return;
                    }
                }
                bVar3 = this.f118633c;
                if (bVar3 == null) {
                    f0.S("task");
                } else {
                    bVar5 = bVar3;
                }
                bVar5.finish();
            }
            if (!zShouldShowRequestPermissionRationale) {
                rVar5 = this.f118632b;
                if (rVar5 == null) {
                    f0.S("pb");
                    rVar5 = null;
                }
                if (rVar5.f118677t != null && !zShouldShowRequestPermissionRationale) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(s.f118679f);
                    rVar6 = this.f118632b;
                    if (rVar6 == null) {
                        f0.S("pb");
                        rVar6 = null;
                    }
                    cg.c cVar3 = rVar6.f118677t;
                    f0.m(cVar3);
                    bVar4 = this.f118633c;
                    if (bVar4 == null) {
                        f0.S("task");
                        bVar4 = null;
                    }
                    cVar3.a(bVar4.getF118620d(), arrayList4);
                }
                if (!z11) {
                    rVar4 = this.f118632b;
                    if (rVar4 == null) {
                        f0.S("pb");
                        rVar4 = null;
                    }
                    if (rVar4.f118667j) {
                        return;
                    }
                }
                bVar3 = this.f118633c;
                if (bVar3 == null) {
                    f0.S("task");
                } else {
                    bVar5 = bVar3;
                }
                bVar5.finish();
            }
            arrayList = new ArrayList();
            arrayList.add(s.f118679f);
            rVar = this.f118632b;
            if (rVar == null) {
                f0.S("pb");
                rVar = null;
            }
            if (rVar.f118676s != null) {
                rVar3 = this.f118632b;
                if (rVar3 == null) {
                    f0.S("pb");
                    rVar3 = null;
                }
                cg.b bVar8 = rVar3.f118676s;
                f0.m(bVar8);
                bVar2 = this.f118633c;
                if (bVar2 == null) {
                    f0.S("task");
                    bVar2 = null;
                }
                bVar8.a(bVar2.getF118619c(), arrayList, false);
            } else {
                rVar2 = this.f118632b;
                if (rVar2 == null) {
                    f0.S("pb");
                    rVar2 = null;
                }
                cg.a aVar2 = rVar2.f118675r;
                f0.m(aVar2);
                bVar = this.f118633c;
                if (bVar == null) {
                    f0.S("task");
                    bVar = null;
                }
                aVar2.a(bVar.getF118619c(), arrayList);
            }
            z11 = false;
            if (!z11) {
                rVar4 = this.f118632b;
                if (rVar4 == null) {
                    f0.S("pb");
                    rVar4 = null;
                }
                if (rVar4.f118667j) {
                    return;
                }
            }
            bVar3 = this.f118633c;
            if (bVar3 == null) {
                f0.S("task");
            } else {
                bVar5 = bVar3;
            }
            bVar5.finish();
        }
    }

    private final void W3() {
        if (S3()) {
            b bVar = null;
            if (Build.VERSION.SDK_INT < 26) {
                b bVar2 = this.f118633c;
                if (bVar2 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar2;
                }
                bVar.finish();
                return;
            }
            if (requireActivity().getPackageManager().canRequestPackageInstalls()) {
                b bVar3 = this.f118633c;
                if (bVar3 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar3;
                }
                bVar.finish();
                return;
            }
            r rVar = this.f118632b;
            if (rVar == null) {
                f0.S("pb");
                rVar = null;
            }
            if (rVar.f118675r == null) {
                r rVar2 = this.f118632b;
                if (rVar2 == null) {
                    f0.S("pb");
                    rVar2 = null;
                }
                if (rVar2.f118676s == null) {
                    return;
                }
            }
            r rVar3 = this.f118632b;
            if (rVar3 == null) {
                f0.S("pb");
                rVar3 = null;
            }
            if (rVar3.f118676s != null) {
                r rVar4 = this.f118632b;
                if (rVar4 == null) {
                    f0.S("pb");
                    rVar4 = null;
                }
                cg.b bVar4 = rVar4.f118676s;
                f0.m(bVar4);
                b bVar5 = this.f118633c;
                if (bVar5 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar5;
                }
                bVar4.a(bVar.getF118619c(), kotlin.collections.s.k(u.f118683f), false);
                return;
            }
            r rVar5 = this.f118632b;
            if (rVar5 == null) {
                f0.S("pb");
                rVar5 = null;
            }
            cg.a aVar = rVar5.f118675r;
            f0.m(aVar);
            b bVar6 = this.f118633c;
            if (bVar6 == null) {
                f0.S("task");
            } else {
                bVar = bVar6;
            }
            aVar.a(bVar.getF118619c(), kotlin.collections.s.k(u.f118683f));
        }
    }

    private final void X3() {
        if (S3()) {
            b bVar = null;
            if (Build.VERSION.SDK_INT < 30) {
                b bVar2 = this.f118633c;
                if (bVar2 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar2;
                }
                bVar.finish();
                return;
            }
            if (Environment.isExternalStorageManager()) {
                b bVar3 = this.f118633c;
                if (bVar3 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar3;
                }
                bVar.finish();
                return;
            }
            r rVar = this.f118632b;
            if (rVar == null) {
                f0.S("pb");
                rVar = null;
            }
            if (rVar.f118675r == null) {
                r rVar2 = this.f118632b;
                if (rVar2 == null) {
                    f0.S("pb");
                    rVar2 = null;
                }
                if (rVar2.f118676s == null) {
                    return;
                }
            }
            r rVar3 = this.f118632b;
            if (rVar3 == null) {
                f0.S("pb");
                rVar3 = null;
            }
            if (rVar3.f118676s != null) {
                r rVar4 = this.f118632b;
                if (rVar4 == null) {
                    f0.S("pb");
                    rVar4 = null;
                }
                cg.b bVar4 = rVar4.f118676s;
                f0.m(bVar4);
                b bVar5 = this.f118633c;
                if (bVar5 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar5;
                }
                bVar4.a(bVar.getF118619c(), kotlin.collections.s.k(v.f118685f), false);
                return;
            }
            r rVar5 = this.f118632b;
            if (rVar5 == null) {
                f0.S("pb");
                rVar5 = null;
            }
            cg.a aVar = rVar5.f118675r;
            f0.m(aVar);
            b bVar6 = this.f118633c;
            if (bVar6 == null) {
                f0.S("task");
            } else {
                bVar = bVar6;
            }
            aVar.a(bVar.getF118619c(), kotlin.collections.s.k(v.f118685f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:135:0x020d  */
    /* JADX WARN: Code duplicated, block: B:138:0x021c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0220  */
    /* JADX WARN: Code duplicated, block: B:143:0x0228  */
    /* JADX WARN: Code duplicated, block: B:145:0x022c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0237  */
    /* JADX WARN: Code duplicated, block: B:150:0x023b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:0x014b  */
    /* JADX WARN: Code duplicated, block: B:84:0x014f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0157  */
    /* JADX WARN: Code duplicated, block: B:89:0x015b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0168  */
    /* JADX WARN: Code duplicated, block: B:95:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x0187  */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01df, code lost:
    
        if ((!r9.f118672o.isEmpty()) != false) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Y3(java.util.Map<java.lang.String, java.lang.Boolean> r9) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.l.Y3(java.util.Map):void");
    }

    private final void Z3() {
        if (S3()) {
            b bVar = null;
            if (Settings.canDrawOverlays(getContext())) {
                b bVar2 = this.f118633c;
                if (bVar2 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar2;
                }
                bVar.finish();
                return;
            }
            r rVar = this.f118632b;
            if (rVar == null) {
                f0.S("pb");
                rVar = null;
            }
            if (rVar.f118675r == null) {
                r rVar2 = this.f118632b;
                if (rVar2 == null) {
                    f0.S("pb");
                    rVar2 = null;
                }
                if (rVar2.f118676s == null) {
                    return;
                }
            }
            r rVar3 = this.f118632b;
            if (rVar3 == null) {
                f0.S("pb");
                rVar3 = null;
            }
            if (rVar3.f118676s != null) {
                r rVar4 = this.f118632b;
                if (rVar4 == null) {
                    f0.S("pb");
                    rVar4 = null;
                }
                cg.b bVar3 = rVar4.f118676s;
                f0.m(bVar3);
                b bVar4 = this.f118633c;
                if (bVar4 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar4;
                }
                bVar3.a(bVar.getF118619c(), kotlin.collections.s.k("android.permission.SYSTEM_ALERT_WINDOW"), false);
                return;
            }
            r rVar5 = this.f118632b;
            if (rVar5 == null) {
                f0.S("pb");
                rVar5 = null;
            }
            cg.a aVar = rVar5.f118675r;
            f0.m(aVar);
            b bVar5 = this.f118633c;
            if (bVar5 == null) {
                f0.S("task");
            } else {
                bVar = bVar5;
            }
            aVar.a(bVar.getF118619c(), kotlin.collections.s.k("android.permission.SYSTEM_ALERT_WINDOW"));
        }
    }

    private final void a4() {
        if (S3()) {
            b bVar = null;
            if (Settings.System.canWrite(getContext())) {
                b bVar2 = this.f118633c;
                if (bVar2 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar2;
                }
                bVar.finish();
                return;
            }
            r rVar = this.f118632b;
            if (rVar == null) {
                f0.S("pb");
                rVar = null;
            }
            if (rVar.f118675r == null) {
                r rVar2 = this.f118632b;
                if (rVar2 == null) {
                    f0.S("pb");
                    rVar2 = null;
                }
                if (rVar2.f118676s == null) {
                    return;
                }
            }
            r rVar3 = this.f118632b;
            if (rVar3 == null) {
                f0.S("pb");
                rVar3 = null;
            }
            if (rVar3.f118676s != null) {
                r rVar4 = this.f118632b;
                if (rVar4 == null) {
                    f0.S("pb");
                    rVar4 = null;
                }
                cg.b bVar3 = rVar4.f118676s;
                f0.m(bVar3);
                b bVar4 = this.f118633c;
                if (bVar4 == null) {
                    f0.S("task");
                } else {
                    bVar = bVar4;
                }
                bVar3.a(bVar.getF118619c(), kotlin.collections.s.k("android.permission.WRITE_SETTINGS"), false);
                return;
            }
            r rVar5 = this.f118632b;
            if (rVar5 == null) {
                f0.S("pb");
                rVar5 = null;
            }
            cg.a aVar = rVar5.f118675r;
            f0.m(aVar);
            b bVar5 = this.f118633c;
            if (bVar5 == null) {
                f0.S("task");
            } else {
                bVar = bVar5;
            }
            aVar.a(bVar.getF118619c(), kotlin.collections.s.k("android.permission.WRITE_SETTINGS"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(l this$0, Boolean granted) {
        f0.p(this$0, "this$0");
        f0.o(granted, "granted");
        this$0.V3(granted.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(l this$0, ActivityResult activityResult) {
        f0.p(this$0, "this$0");
        this$0.W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(l this$0, ActivityResult activityResult) {
        f0.p(this$0, "this$0");
        this$0.X3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(l this$0, Map grantResults) {
        f0.p(this$0, "this$0");
        f0.o(grantResults, "grantResults");
        this$0.Y3(grantResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(l this$0, ActivityResult activityResult) {
        f0.p(this$0, "this$0");
        this$0.Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l4(l this$0, ActivityResult activityResult) {
        f0.p(this$0, "this$0");
        this$0.a4();
    }

    public final void T3() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", requireActivity().getPackageName(), null));
        this.f118640j.b(intent);
    }

    public final void b4(@dl.d r permissionBuilder, @dl.d b chainTask) {
        f0.p(permissionBuilder, "permissionBuilder");
        f0.p(chainTask, "chainTask");
        this.f118632b = permissionBuilder;
        this.f118633c = chainTask;
        this.f118635e.b(s.f118679f);
    }

    public final void e4(@dl.d r permissionBuilder, @dl.d b chainTask) {
        f0.p(permissionBuilder, "permissionBuilder");
        f0.p(chainTask, "chainTask");
        this.f118632b = permissionBuilder;
        this.f118633c = chainTask;
        if (Build.VERSION.SDK_INT < 26) {
            W3();
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(Uri.parse(f0.C("package:", requireActivity().getPackageName())));
        this.f118639i.b(intent);
    }

    public final void g4(@dl.d r permissionBuilder, @dl.d b chainTask) {
        f0.p(permissionBuilder, "permissionBuilder");
        f0.p(chainTask, "chainTask");
        this.f118632b = permissionBuilder;
        this.f118633c = chainTask;
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
            X3();
        } else {
            this.f118638h.b(new Intent(re.d.f138893a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i4(@dl.d r permissionBuilder, @dl.d Set<String> permissions, @dl.d b chainTask) {
        f0.p(permissionBuilder, "permissionBuilder");
        f0.p(permissions, "permissions");
        f0.p(chainTask, "chainTask");
        this.f118632b = permissionBuilder;
        this.f118633c = chainTask;
        androidx.activity.result.g<String[]> gVar = this.f118634d;
        Object[] array = permissions.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        gVar.b(array);
    }

    public final void k4(@dl.d r permissionBuilder, @dl.d b chainTask) {
        f0.p(permissionBuilder, "permissionBuilder");
        f0.p(chainTask, "chainTask");
        this.f118632b = permissionBuilder;
        this.f118633c = chainTask;
        if (Settings.canDrawOverlays(getContext())) {
            Z3();
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse(f0.C("package:", requireActivity().getPackageName())));
        this.f118636f.b(intent);
    }

    public final void m4(@dl.d r permissionBuilder, @dl.d b chainTask) {
        f0.p(permissionBuilder, "permissionBuilder");
        f0.p(chainTask, "chainTask");
        this.f118632b = permissionBuilder;
        this.f118633c = chainTask;
        if (Settings.System.canWrite(getContext())) {
            a4();
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse(f0.C("package:", requireActivity().getPackageName())));
        this.f118637g.b(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (S3()) {
            r rVar = this.f118632b;
            if (rVar == null) {
                f0.S("pb");
                rVar = null;
            }
            Dialog dialog = rVar.f118663f;
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
    }
}

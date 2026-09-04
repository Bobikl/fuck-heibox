package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: NavAction.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n*L\n58#1:87,3\n67#1:90,2\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.d0
    private final int f25178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private j0 f25179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Bundle f25180c;

    @xh.i
    public k(@androidx.annotation.d0 int i10) {
        this(i10, null, null, 6, null);
    }

    @xh.i
    public k(@androidx.annotation.d0 int i10, @dl.e j0 j0Var) {
        this(i10, j0Var, null, 4, null);
    }

    @xh.i
    public k(@androidx.annotation.d0 int i10, @dl.e j0 j0Var, @dl.e Bundle bundle) {
        this.f25178a = i10;
        this.f25179b = j0Var;
        this.f25180c = bundle;
    }

    public /* synthetic */ k(int i10, j0 j0Var, Bundle bundle, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, (i11 & 2) != 0 ? null : j0Var, (i11 & 4) != 0 ? null : bundle);
    }

    @dl.e
    public final Bundle a() {
        return this.f25180c;
    }

    public final int b() {
        return this.f25178a;
    }

    @dl.e
    public final j0 c() {
        return this.f25179b;
    }

    public final void d(@dl.e Bundle bundle) {
        this.f25180c = bundle;
    }

    public final void e(@dl.e j0 j0Var) {
        this.f25179b = j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    public boolean equals(@dl.e Object obj) {
        boolean z10;
        Set<String> setKeySet;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f25178a == kVar.f25178a && kotlin.jvm.internal.f0.g(this.f25179b, kVar.f25179b)) {
            if (kotlin.jvm.internal.f0.g(this.f25180c, kVar.f25180c)) {
                return true;
            }
            Bundle bundle = this.f25180c;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                z10 = false;
            } else {
                if (!setKeySet.isEmpty()) {
                    Iterator<T> it = setKeySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = true;
                            break;
                        }
                        String str = (String) it.next();
                        Bundle bundle2 = this.f25180c;
                        Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                        Bundle bundle3 = kVar.f25180c;
                        if (!kotlin.jvm.internal.f0.g(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                            z11 = false;
                            break;
                        }
                    }
                } else {
                    z11 = true;
                    break;
                }
                if (z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i10 = this.f25178a * 31;
        j0 j0Var = this.f25179b;
        int iHashCode = i10 + (j0Var != null ? j0Var.hashCode() : 0);
        Bundle bundle = this.f25180c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i11 = iHashCode * 31;
                Bundle bundle2 = this.f25180c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f25178a));
        sb2.append(")");
        if (this.f25179b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f25179b);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }
}

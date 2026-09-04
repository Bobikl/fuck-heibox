package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: TransitionValues.java */
/* JADX INFO: loaded from: classes6.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f27974b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f27973a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<Transition> f27975c = new ArrayList<>();

    @Deprecated
    public z() {
    }

    public z(@androidx.annotation.n0 View view) {
        this.f27974b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f27974b == zVar.f27974b && this.f27973a.equals(zVar.f27973a);
    }

    public int hashCode() {
        return (this.f27974b.hashCode() * 31) + this.f27973a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f27974b + "\n") + "    values:";
        for (String str2 : this.f27973a.keySet()) {
            str = str + "    " + str2 + ": " + this.f27973a.get(str2) + "\n";
        }
        return str;
    }
}

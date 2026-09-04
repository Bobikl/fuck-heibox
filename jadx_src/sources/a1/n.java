package a1;

import androidx.compose.runtime.internal.o;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AutofillTree.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"La1/n;", "", "La1/m;", "autofillNode", "Lkotlin/b2;", ak.aF, "", "id", "", "value", "b", "(ILjava/lang/String;)Lkotlin/b2;", "", "children", "Ljava/util/Map;", ak.av, "()Ljava/util/Map;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1164b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<Integer, m> f1165a = new LinkedHashMap();

    @dl.d
    public final Map<Integer, m> a() {
        return this.f1165a;
    }

    @dl.e
    public final b2 b(int id2, @dl.d String value) {
        yh.l<String, b2> lVarF;
        f0.p(value, "value");
        m mVar = this.f1165a.get(Integer.valueOf(id2));
        if (mVar == null || (lVarF = mVar.f()) == null) {
            return null;
        }
        lVarF.invoke(value);
        return b2.f124493a;
    }

    public final void c(@dl.d m autofillNode) {
        f0.p(autofillNode, "autofillNode");
        this.f1165a.put(Integer.valueOf(autofillNode.getF1163d()), autofillNode);
    }
}

package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/sequences/m;", "Landroidx/compose/ui/platform/z1;", "", "iterator", "", "name", "", "value", "Lkotlin/b2;", ak.aF, "", ak.av, "Ljava/util/List;", "elements", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a2 implements kotlin.sequences.m<ValueElement> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15811b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<ValueElement> elements = new ArrayList();

    public final void c(@dl.d String name, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(name, "name");
        this.elements.add(new ValueElement(name, obj));
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }
}

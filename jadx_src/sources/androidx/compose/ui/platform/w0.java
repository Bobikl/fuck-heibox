package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/w0;", "", "Lkotlin/sequences/m;", "Landroidx/compose/ui/platform/z1;", ak.aF, "()Lkotlin/sequences/m;", "inspectableElements", "", "d", "()Ljava/lang/String;", "nameFallback", ak.av, "()Ljava/lang/Object;", "valueOverride", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface w0 {

    /* JADX INFO: compiled from: InspectableValue.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @dl.d
        @Deprecated
        public static kotlin.sequences.m<ValueElement> a(@dl.d w0 w0Var) {
            return v0.a(w0Var);
        }

        @dl.e
        @Deprecated
        public static String b(@dl.d w0 w0Var) {
            return v0.b(w0Var);
        }

        @dl.e
        @Deprecated
        public static Object c(@dl.d w0 w0Var) {
            return v0.c(w0Var);
        }
    }

    @dl.e
    Object a();

    @dl.d
    kotlin.sequences.m<ValueElement> c();

    @dl.e
    String d();
}

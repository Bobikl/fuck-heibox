package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextToolbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JX\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&J\b\u0010\u000b\u001a\u00020\u0005H&R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/w1;", "", "Lb1/i;", "rect", "Lkotlin/Function0;", "Lkotlin/b2;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "b", "hide", "Landroidx/compose/ui/platform/TextToolbarStatus;", ak.av, "()Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface w1 {

    /* JADX INFO: compiled from: TextToolbar.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
    }

    @dl.d
    TextToolbarStatus a();

    void b(@dl.d b1.i iVar, @dl.e yh.a<kotlin.b2> aVar, @dl.e yh.a<kotlin.b2> aVar2, @dl.e yh.a<kotlin.b2> aVar3, @dl.e yh.a<kotlin.b2> aVar4);

    void hide();
}

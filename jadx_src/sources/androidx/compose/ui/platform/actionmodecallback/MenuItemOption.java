package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "order", "getOrder", "titleResource", "getTitleResource", "Copy", "Paste", "Cut", "SelectAll", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);

    private final int id;
    private final int order;

    /* JADX INFO: compiled from: TextActionModeCallback.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15816a;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            iArr[MenuItemOption.Copy.ordinal()] = 1;
            iArr[MenuItemOption.Paste.ordinal()] = 2;
            iArr[MenuItemOption.Cut.ordinal()] = 3;
            iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            f15816a = iArr;
        }
    }

    MenuItemOption(int i10) {
        this.id = i10;
        this.order = i10;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i10 = a.f15816a[ordinal()];
        if (i10 == 1) {
            return R.string.copy;
        }
        if (i10 == 2) {
            return R.string.paste;
        }
        if (i10 == 3) {
            return R.string.cut;
        }
        if (i10 == 4) {
            return R.string.selectAll;
        }
        throw new NoWhenBranchMatchedException();
    }
}

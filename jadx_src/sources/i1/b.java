package i1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PrimaryTextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0012"}, d2 = {"Li1/b;", "Landroid/view/ActionMode$Callback;", "Landroid/view/ActionMode;", "mode", "Landroid/view/MenuItem;", ChannelListActivity.q.f79586f, "", "onActionItemClicked", "Landroid/view/Menu;", GameRecommendAdapter.f85958h, "onCreateActionMode", "onPrepareActionMode", "Lkotlin/b2;", "onDestroyActionMode", "Li1/c;", "callback", "<init>", "(Li1/c;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final c f119211a;

    public b(@d c callback) {
        f0.p(callback, "callback");
        this.f119211a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@e ActionMode mode, @e MenuItem item) {
        return this.f119211a.i(mode, item);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@e ActionMode mode, @e Menu menu) {
        return this.f119211a.j(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@e ActionMode actionMode) {
        this.f119211a.k();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@e ActionMode mode, @e Menu menu) {
        return this.f119211a.l(mode, menu);
    }
}

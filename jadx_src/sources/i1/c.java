package i1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.j1;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import b1.i;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b.\u0010/J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0007J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010$R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010$R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010$R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010$¨\u00060"}, d2 = {"Li1/c;", "", "Landroid/view/Menu;", GameRecommendAdapter.f85958h, "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", ChannelListActivity.q.f79586f, "Lkotlin/Function0;", "Lkotlin/b2;", "callback", "b", "Landroid/view/ActionMode;", "mode", "", "j", "l", "Landroid/view/MenuItem;", "i", "k", "r", "(Landroid/view/Menu;)V", ak.av, "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;)V", "onActionModeDestroy", "Lyh/a;", ak.aF, "()Lyh/a;", "Lb1/i;", "rect", "Lb1/i;", RXScreenCaptureService.KEY_HEIGHT, "()Lb1/i;", "q", "(Lb1/i;)V", "onCopyRequested", "d", "m", "(Lyh/a;)V", "onPasteRequested", "f", "o", "onCutRequested", "e", "n", "onSelectAllRequested", "g", "p", "<init>", "(Lyh/a;Lb1/i;Lyh/a;Lyh/a;Lyh/a;Lyh/a;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private final yh.a<b2> f119212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private i f119213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private yh.a<b2> f119214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private yh.a<b2> f119215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private yh.a<b2> f119216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private yh.a<b2> f119217f;

    public c() {
        this(null, null, null, null, null, null, 63, null);
    }

    public c(@e yh.a<b2> aVar, @d i rect, @e yh.a<b2> aVar2, @e yh.a<b2> aVar3, @e yh.a<b2> aVar4, @e yh.a<b2> aVar5) {
        f0.p(rect, "rect");
        this.f119212a = aVar;
        this.f119213b = rect;
        this.f119214c = aVar2;
        this.f119215d = aVar3;
        this.f119216e = aVar4;
        this.f119217f = aVar5;
    }

    public /* synthetic */ c(yh.a aVar, i iVar, yh.a aVar2, yh.a aVar3, yh.a aVar4, yh.a aVar5, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? i.f30369e.a() : iVar, (i10 & 4) != 0 ? null : aVar2, (i10 & 8) != 0 ? null : aVar3, (i10 & 16) != 0 ? null : aVar4, (i10 & 32) != 0 ? null : aVar5);
    }

    private final void b(Menu menu, MenuItemOption menuItemOption, yh.a<b2> aVar) {
        if (aVar != null && menu.findItem(menuItemOption.getId()) == null) {
            a(menu, menuItemOption);
        } else {
            if (aVar != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void a(@d Menu menu, @d MenuItemOption item) {
        f0.p(menu, "menu");
        f0.p(item, "item");
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    @e
    public final yh.a<b2> c() {
        return this.f119212a;
    }

    @e
    public final yh.a<b2> d() {
        return this.f119214c;
    }

    @e
    public final yh.a<b2> e() {
        return this.f119216e;
    }

    @e
    public final yh.a<b2> f() {
        return this.f119215d;
    }

    @e
    public final yh.a<b2> g() {
        return this.f119217f;
    }

    @d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final i getF119213b() {
        return this.f119213b;
    }

    public final boolean i(@e ActionMode mode, @e MenuItem item) {
        f0.m(item);
        int itemId = item.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            yh.a<b2> aVar = this.f119214c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            yh.a<b2> aVar2 = this.f119215d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            yh.a<b2> aVar3 = this.f119216e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else {
            if (itemId != MenuItemOption.SelectAll.getId()) {
                return false;
            }
            yh.a<b2> aVar4 = this.f119217f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final boolean j(@e ActionMode mode, @e Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (mode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (this.f119214c != null) {
            a(menu, MenuItemOption.Copy);
        }
        if (this.f119215d != null) {
            a(menu, MenuItemOption.Paste);
        }
        if (this.f119216e != null) {
            a(menu, MenuItemOption.Cut);
        }
        if (this.f119217f == null) {
            return true;
        }
        a(menu, MenuItemOption.SelectAll);
        return true;
    }

    public final void k() {
        yh.a<b2> aVar = this.f119212a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean l(@e ActionMode mode, @e Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        r(menu);
        return true;
    }

    public final void m(@e yh.a<b2> aVar) {
        this.f119214c = aVar;
    }

    public final void n(@e yh.a<b2> aVar) {
        this.f119216e = aVar;
    }

    public final void o(@e yh.a<b2> aVar) {
        this.f119215d = aVar;
    }

    public final void p(@e yh.a<b2> aVar) {
        this.f119217f = aVar;
    }

    public final void q(@d i iVar) {
        f0.p(iVar, "<set-?>");
        this.f119213b = iVar;
    }

    @j1
    public final void r(@d Menu menu) {
        f0.p(menu, "menu");
        b(menu, MenuItemOption.Copy, this.f119214c);
        b(menu, MenuItemOption.Paste, this.f119215d);
        b(menu, MenuItemOption.Cut, this.f119216e);
        b(menu, MenuItemOption.SelectAll, this.f119217f);
    }
}

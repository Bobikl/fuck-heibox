package yf;

import androidx.compose.runtime.internal.o;
import com.max.hbsearch.h;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.collections.x;

/* JADX INFO: compiled from: TabModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class d implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f141803b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ArrayList<String> f141804a;

    public d() {
        ArrayList<String> arrayList = new ArrayList<>();
        x.p0(arrayList, new String[]{com.max.xiaoheihe.utils.d.n0(R.string.general), com.max.xiaoheihe.utils.d.n0(R.string.content), com.max.xiaoheihe.utils.d.n0(R.string.steam_id), com.max.xiaoheihe.utils.d.n0(R.string.dota2_match), com.max.xiaoheihe.utils.d.n0(R.string.user), com.max.xiaoheihe.utils.d.n0(R.string.game), com.max.xiaoheihe.utils.d.n0(R.string.mini_program), com.max.xiaoheihe.utils.d.n0(R.string.goods)});
        this.f141804a = arrayList;
    }

    @Override // com.max.hbsearch.h
    @dl.d
    public ArrayList<String> a() {
        return this.f141804a;
    }
}

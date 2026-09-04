package jf;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.z;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DataReportDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class c extends BaseFakeRemoteDataSource<Result<?>> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f124341h = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private String f124342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private z<Result<?>> f124343g;

    public c() {
        super(null);
        this.f124342f = "2";
        this.f124343g = g().x8(this.f124342f, new HashMap(16));
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    @dl.e
    public z<Result<?>> d() {
        return this.f124343g;
    }

    @Override // com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource
    public void j(@dl.e z<Result<?>> zVar) {
        this.f124343g = zVar;
    }

    public final void k(@dl.d String type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 28481, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        this.f124342f = type;
        j(g().x8(type, new HashMap(16)));
        h(false);
    }
}

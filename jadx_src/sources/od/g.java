package od;

import com.max.hbstory.config.StoryRootViewBuilder;
import com.max.hbstory.widget.IStoryLandscapeControlWidget;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: StoryConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private d f132283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private c f132284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private yh.a<? extends IStoryLandscapeControlWidget> f132285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private StoryRootViewBuilder f132286d;

    @dl.e
    public final yh.a<IStoryLandscapeControlWidget> a() {
        return this.f132285c;
    }

    @dl.e
    public final c b() {
        return this.f132284b;
    }

    @dl.e
    public final StoryRootViewBuilder c() {
        return this.f132286d;
    }

    @dl.e
    public final d d() {
        return this.f132283a;
    }

    public final void e(@dl.e yh.a<? extends IStoryLandscapeControlWidget> aVar) {
        this.f132285c = aVar;
    }

    public final void f(@dl.e c cVar) {
        this.f132284b = cVar;
    }

    public final void g(@dl.e StoryRootViewBuilder storyRootViewBuilder) {
        this.f132286d = storyRootViewBuilder;
    }

    public final void h(@dl.e d dVar) {
        this.f132283a = dVar;
    }
}

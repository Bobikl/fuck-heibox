package pd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import com.max.hbstory.R;
import com.max.hbstory.widget.StoryGestureCenterFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: StoryGestureCoreFrameLayoutBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final View f138265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final StoryGestureCenterFrameLayout f138266b;

    private a(@n0 View view, @n0 StoryGestureCenterFrameLayout storyGestureCenterFrameLayout) {
        this.f138265a = view;
        this.f138266b = storyGestureCenterFrameLayout;
    }

    @n0
    public static a a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.We, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.story_gesture_core_view;
        StoryGestureCenterFrameLayout storyGestureCenterFrameLayout = (StoryGestureCenterFrameLayout) l3.d.a(view, i10);
        if (storyGestureCenterFrameLayout != null) {
            return new a(view, storyGestureCenterFrameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static a b(@n0 LayoutInflater layoutInflater, @n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, bb.c.k.Ve, new Class[]{LayoutInflater.class, ViewGroup.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.story_gesture_core_frame_layout, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @n0
    public View getRoot() {
        return this.f138265a;
    }
}

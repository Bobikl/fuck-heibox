package com.max.hbstory.config;

import android.view.View;
import bb.c;
import com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.enums.EnumEntriesKt;
import yh.a;
import yh.l;

/* JADX INFO: compiled from: StoryConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryRootViewBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private a<? extends View> f72838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private l<? super OverlayTipsType, ? extends View> f72839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private a<? extends IStoryGestureUserHomeHolder> f72840c;

    /* JADX INFO: compiled from: StoryConfig.kt */
    public enum OverlayTipsType {
        TYPE_NONE_TIPS,
        TYPE_VIDEO_TUTORIAL_TIPS,
        TYPE_DOUBLE_CLICK_UPVOTE;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<OverlayTipsType> getEntries() {
            return $ENTRIES;
        }

        public static OverlayTipsType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.Ue, new Class[]{String.class}, OverlayTipsType.class);
            return (OverlayTipsType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(OverlayTipsType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static OverlayTipsType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.Te, new Class[0], OverlayTipsType[].class);
            return (OverlayTipsType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    @e
    public final a<IStoryGestureUserHomeHolder> a() {
        return this.f72840c;
    }

    @e
    public final l<OverlayTipsType, View> b() {
        return this.f72839b;
    }

    @e
    public final a<View> c() {
        return this.f72838a;
    }

    public final void d(@e a<? extends IStoryGestureUserHomeHolder> aVar) {
        this.f72840c = aVar;
    }

    public final void e(@e l<? super OverlayTipsType, ? extends View> lVar) {
        this.f72839b = lVar;
    }

    public final void f(@e a<? extends View> aVar) {
        this.f72838a = aVar;
    }
}

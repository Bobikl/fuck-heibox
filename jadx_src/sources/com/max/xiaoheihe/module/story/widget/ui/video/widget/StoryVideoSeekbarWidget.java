package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LiveData;
import com.max.hbstory.d;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: StoryVideoSeekbarWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryVideoSeekbarWidget extends AppCompatSeekBar implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f92355j = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private final c f92356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private d f92357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f92358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f92359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f92360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f92361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final a f92362i;

    /* JADX INFO: compiled from: StoryVideoSeekbarWidget.kt */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@e SeekBar seekBar, int i10, boolean z10) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@e SeekBar seekBar) {
            if (PatchProxy.proxy(new Object[]{seekBar}, this, changeQuickRedirect, false, 44270, new Class[]{SeekBar.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryVideoSeekbarWidget.this.f92360g = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@e SeekBar seekBar) {
            if (PatchProxy.proxy(new Object[]{seekBar}, this, changeQuickRedirect, false, 44271, new Class[]{SeekBar.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryVideoSeekbarWidget.this.f92360g = false;
            StoryVideoSeekbarWidget.b(StoryVideoSeekbarWidget.this, seekBar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryVideoSeekbarWidget(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryVideoSeekbarWidget(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryVideoSeekbarWidget(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f92362i = new a();
    }

    public /* synthetic */ StoryVideoSeekbarWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.seekBarStyle : i10);
    }

    public static final /* synthetic */ boolean b(StoryVideoSeekbarWidget storyVideoSeekbarWidget, SeekBar seekBar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyVideoSeekbarWidget, seekBar}, null, changeQuickRedirect, true, 44269, new Class[]{StoryVideoSeekbarWidget.class, SeekBar.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : storyVideoSeekbarWidget.h(seekBar);
    }

    private final void g() {
        g gVarQ;
        LiveData<g.e> liveDataP;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44266, new Class[0], Void.TYPE).isSupported || (gVarQ = StoryUtilsKt.q(this)) == null || (liveDataP = gVarQ.p()) == null) {
            return;
        }
        StoryUtilsKt.r(liveDataP, this, new l<g.e, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryVideoSeekbarWidget$observePosition$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d g.e it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44272, new Class[]{g.e.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                if (this.f92364b.f92360g || !StoryUtilsKt.h(this.f92364b)) {
                    return;
                }
                this.f92364b.setProgress(it.f());
                this.f92364b.setMax(it.e());
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(g.e eVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 44273, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(eVar);
                return b2.f124493a;
            }
        });
    }

    private final boolean h(SeekBar seekBar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{seekBar}, this, changeQuickRedirect, false, 44261, new Class[]{SeekBar.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (seekBar != null) {
            return StoryUtilsKt.t(this, seekBar.getProgress());
        }
        return false;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44264, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44265, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        setProgress(this.f92359f);
        if (this.f92361h) {
            return;
        }
        this.f92361h = true;
        g();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f92356c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92358e;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public d getMStoryContext() {
        return this.f92357d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44268, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44262, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        setOnSeekBarChangeListener(this.f92362i);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44263, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOnSeekBarChangeListener(null);
        super.onDetachedFromWindow();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92358e = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e d dVar) {
        this.f92357d = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44267, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}

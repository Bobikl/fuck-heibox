package com.max.video.ui.widget;

import af.k;
import af.m;
import af.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.max.hbvideo.R;
import com.max.video.player.info.PlaybackState;
import com.max.video.ui.BottomPanel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BasicBottomPanel.kt */
/* JADX INFO: loaded from: classes8.dex */
public class BasicBottomPanel extends BottomPanel implements m, af.f, k, n {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f76089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ImageView f76090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final TextView f76091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final SeekBar f76092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final TextView f76093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final ImageView f76094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f76095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f76096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f76097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private ze.a f76098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private ze.a f76099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f76100m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicBottomPanel(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.video_basic_bottom_panel, (ViewGroup) this, true);
        this.f76089b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.iv_play_button);
        f0.o(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f76090c = imageView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_position);
        f0.o(viewFindViewById2, "findViewById(...)");
        this.f76091d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.seek_bar);
        f0.o(viewFindViewById3, "findViewById(...)");
        this.f76092e = (SeekBar) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.tv_duration);
        f0.o(viewFindViewById4, "findViewById(...)");
        this.f76093f = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.iv_expand);
        f0.o(viewFindViewById5, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f76094g = imageView2;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicBottomPanel.l(this.f76126b, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicBottomPanel.m(this.f76127b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicBottomPanel(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.video_basic_bottom_panel, (ViewGroup) this, true);
        this.f76089b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.iv_play_button);
        f0.o(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f76090c = imageView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_position);
        f0.o(viewFindViewById2, "findViewById(...)");
        this.f76091d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.seek_bar);
        f0.o(viewFindViewById3, "findViewById(...)");
        this.f76092e = (SeekBar) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.tv_duration);
        f0.o(viewFindViewById4, "findViewById(...)");
        this.f76093f = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.iv_expand);
        f0.o(viewFindViewById5, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f76094g = imageView2;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicBottomPanel.l(this.f76126b, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicBottomPanel.m(this.f76127b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicBottomPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.video_basic_bottom_panel, (ViewGroup) this, true);
        this.f76089b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.iv_play_button);
        f0.o(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f76090c = imageView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_position);
        f0.o(viewFindViewById2, "findViewById(...)");
        this.f76091d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.seek_bar);
        f0.o(viewFindViewById3, "findViewById(...)");
        this.f76092e = (SeekBar) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.tv_duration);
        f0.o(viewFindViewById4, "findViewById(...)");
        this.f76093f = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.iv_expand);
        f0.o(viewFindViewById5, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f76094g = imageView2;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicBottomPanel.l(this.f76126b, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicBottomPanel.m(this.f76127b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicBottomPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.video_basic_bottom_panel, (ViewGroup) this, true);
        this.f76089b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.iv_play_button);
        f0.o(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f76090c = imageView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_position);
        f0.o(viewFindViewById2, "findViewById(...)");
        this.f76091d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.seek_bar);
        f0.o(viewFindViewById3, "findViewById(...)");
        this.f76092e = (SeekBar) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.tv_duration);
        f0.o(viewFindViewById4, "findViewById(...)");
        this.f76093f = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.iv_expand);
        f0.o(viewFindViewById5, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f76094g = imageView2;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicBottomPanel.l(this.f76126b, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicBottomPanel.m(this.f76127b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BasicBottomPanel this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.m.pq, new Class[]{BasicBottomPanel.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        ze.a playAction = this$0.getPlayAction();
        if (playAction != null) {
            playAction.a(!this$0.f76096i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BasicBottomPanel this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.m.qq, new Class[]{BasicBottomPanel.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        ze.a fullScreenAction = this$0.getFullScreenAction();
        if (fullScreenAction != null) {
            fullScreenAction.a(!this$0.f76097j);
        }
    }

    @Override // af.m
    public void a(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.hq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || b()) {
            return;
        }
        int i11 = this.f76095h;
        if (i10 > i11) {
            i10 = i11;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f76091d.setText(ye.c.f141793a.c(i10));
        this.f76092e.setProgress(i10);
    }

    @Override // af.n
    public boolean b() {
        return this.f76100m;
    }

    @Override // af.k
    public void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.eq, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76096i = z10;
        if (z10) {
            this.f76090c.setImageResource(R.drawable.video_icon_pause);
        } else {
            this.f76090c.setImageResource(R.drawable.video_icon_play);
        }
    }

    @Override // af.f
    public void d(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.nq, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        af.f.a.a(this, z10);
    }

    @Override // af.m
    public void e(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.iq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.f76095h;
        if (i10 > i11) {
            i10 = i11;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f76092e.setSecondaryProgress(i10);
    }

    @Override // af.f
    public void f(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.jq, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76097j = z10;
        if (z10) {
            this.f76094g.setVisibility(8);
        } else {
            this.f76094g.setVisibility(0);
        }
    }

    @Override // af.m
    public void g(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.gq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 > 0) {
            this.f76092e.setMax(i10);
        } else {
            this.f76092e.setMax(1);
        }
        this.f76095h = i10;
        this.f76093f.setText(ye.c.f141793a.c(i10));
    }

    @Override // af.f
    @dl.e
    public ze.a getFullScreenAction() {
        return this.f76098k;
    }

    @dl.d
    public final ImageView getFullScreenBtn() {
        return this.f76094g;
    }

    @Override // af.k
    @dl.e
    public ze.a getPlayAction() {
        return this.f76099l;
    }

    @Override // af.k
    public void i(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.oq, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        k.a.a(this, z10);
    }

    @Override // af.k
    public void j(@dl.d PlaybackState state) {
        if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, bb.c.m.fq, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(state, "state");
        if (state == PlaybackState.COMPLETE) {
            this.f76092e.setEnabled(false);
        } else if (state == PlaybackState.STARTED) {
            this.f76092e.setEnabled(true);
        }
    }

    public final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.mq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76094g.setVisibility(8);
    }

    @Override // af.n
    public void setDraggingSeek(boolean z10) {
        this.f76100m = z10;
    }

    @Override // af.f
    public void setFullScreenAction(@dl.e ze.a aVar) {
        this.f76098k = aVar;
    }

    @Override // af.n
    public void setOnSeekBarChangeListener(@dl.e SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (PatchProxy.proxy(new Object[]{onSeekBarChangeListener}, this, changeQuickRedirect, false, bb.c.m.lq, new Class[]{SeekBar.OnSeekBarChangeListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f76092e.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    @Override // af.k
    public void setPlayAction(@dl.e ze.a aVar) {
        this.f76099l = aVar;
    }

    @Override // af.n
    public void setSeekEnabled(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.kq, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76092e.setEnabled(z10);
    }
}

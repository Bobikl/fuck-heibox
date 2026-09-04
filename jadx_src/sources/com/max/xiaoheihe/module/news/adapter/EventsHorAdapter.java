package com.max.xiaoheihe.module.news.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.news.events.EventObj;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.ui;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: EventsHorAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nEventsHorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventsHorAdapter.kt\ncom/max/xiaoheihe/module/news/adapter/EventsHorAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,94:1\n262#2,2:95\n*S KotlinDebug\n*F\n+ 1 EventsHorAdapter.kt\ncom/max/xiaoheihe/module/news/adapter/EventsHorAdapter\n*L\n87#1:95,2\n*E\n"})
@o(parameters = 0)
public final class EventsHorAdapter extends s<EventObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91272c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f91273b;

    /* JADX INFO: compiled from: EventsHorAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f91274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EventObj f91275c;

        a(View view, EventObj eventObj) {
            this.f91274b = view;
            this.f91275c = eventObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42584, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f91274b.getContext();
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.j0(context, this.f91275c.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsHorAdapter(@dl.d Context context, @dl.d List<EventObj> list) {
        super(context, list, R.layout.item_event_card);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f91273b = context;
    }

    @dl.d
    public final Context m() {
        return this.f91273b;
    }

    public void n(@e s.e eVar, @e EventObj eventObj) {
        int iC;
        if (PatchProxy.proxy(new Object[]{eVar, eventObj}, this, changeQuickRedirect, false, 42582, new Class[]{s.e.class, EventObj.class}, Void.TYPE).isSupported || eVar == null || eventObj == null) {
            return;
        }
        View view = eVar.itemView;
        view.setTag(eventObj);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (getDataList().size() == 2) {
            int iL = ViewUtils.L(view.getContext());
            Context context = view.getContext();
            f0.o(context, "context");
            iC = (iL - l.c(30.0f, context)) / 2;
        } else if (f0.g("1", eventObj.getEvent_type())) {
            Context context2 = view.getContext();
            f0.o(context2, "context");
            iC = l.c(220.0f, context2);
        } else {
            Context context3 = view.getContext();
            f0.o(context3, "context");
            iC = l.c(154.0f, context3);
        }
        layoutParams.width = iC;
        view.setOnClickListener(new a(view, eventObj));
        ui uiVarA = ui.a(eVar.itemView);
        f0.o(uiVarA, "bind(viewHolder.itemView)");
        final WeakReference weakReference = new WeakReference(uiVarA.f116454c);
        final WeakReference weakReference2 = new WeakReference(uiVarA.f116453b);
        com.max.hbimage.b.Y(this.f91273b, eventObj.getImage(), new com.max.hbimage.b.q() { // from class: com.max.xiaoheihe.module.news.adapter.EventsHorAdapter$onBindViewHolder$1$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbimage.b.q
            public void a(@e Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 42585, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                    return;
                }
                QMUIRadiusImageView qMUIRadiusImageView = weakReference.get();
                if (qMUIRadiusImageView != null) {
                    qMUIRadiusImageView.setImageDrawable(drawable);
                }
                ImageView imageView = weakReference2.get();
                if (imageView != null) {
                    k.f(r0.a(e1.c()), null, null, new EventsHorAdapter$onBindViewHolder$1$1$2$onResourceReady$2$1(drawable, this, imageView, null), 3, null);
                }
            }

            @Override // com.max.hbimage.b.q
            public /* synthetic */ void b(Drawable drawable) {
                com.max.hbimage.d.a(this, drawable);
            }

            @Override // com.max.hbimage.b.q
            public void onLoadFailed(@e Drawable drawable) {
            }
        });
        String main_color = eventObj.getMain_color();
        int iD = main_color != null ? com.max.hbutils.utils.a.d(main_color) : -1;
        uiVarA.b().setCardBackgroundColor(iD);
        float[] fArr = {0.0f, 0.0f, 0.0f};
        Color.colorToHSV(iD, fArr);
        fArr[2] = Math.min(1.0f, fArr[2] + 0.4f);
        uiVarA.f116457f.setBackground(ViewUtils.P(0, 0, Color.HSVToColor(178, fArr)));
        uiVarA.f116456e.setText(eventObj.getTitle());
        uiVarA.f116455d.setText(eventObj.getDesc());
        HBUiKitView onBindViewHolder$lambda$4$lambda$3$lambda$2 = uiVarA.f116458g;
        f0.o(onBindViewHolder$lambda$4$lambda$3$lambda$2, "onBindViewHolder$lambda$4$lambda$3$lambda$2");
        onBindViewHolder$lambda$4$lambda$3$lambda$2.setVisibility(eventObj.getUikit() != null ? 0 : 8);
        onBindViewHolder$lambda$4$lambda$3$lambda$2.setDataToCreate(eventObj.getUikit());
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, EventObj eventObj) {
        if (PatchProxy.proxy(new Object[]{eVar, eventObj}, this, changeQuickRedirect, false, 42583, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, eventObj);
    }
}

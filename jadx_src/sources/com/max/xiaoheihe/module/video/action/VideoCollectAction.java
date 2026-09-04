package com.max.xiaoheihe.module.video.action;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ad0;
import df.bd0;
import df.ud0;
import dl.e;
import io.reactivex.disposables.b;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import yh.l;

/* JADX INFO: compiled from: VideoCollectAction.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class VideoCollectAction implements com.max.video.ui.widget.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f93617i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ud0 f93618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f93619b = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoCollectAction$showRootMenuAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46328, new Class[0], Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            invoke2();
            return b2.f124493a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private l<? super String, b2> f93620c = new l<String, b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoCollectAction$collectedAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46304, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            invoke2(str);
            return b2.f124493a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@e String str) {
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f93621d = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoCollectAction$uncollectedAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46329, new Class[0], Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            invoke2();
            return b2.f124493a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f93622e = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoCollectAction$collectClickAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46303, new Class[0], Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            invoke2();
            return b2.f124493a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private l<? super io.reactivex.disposables.b, b2> f93623f = new l<io.reactivex.disposables.b, b2>() { // from class: com.max.xiaoheihe.module.video.action.VideoCollectAction$registerDisposable$1
        public static ChangeQuickRedirect changeQuickRedirect;

        public final void a(@e b bVar) {
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 46325, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(bVar);
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<Boolean> f93624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f93625h;

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f93627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ af.l f93628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f93629e;

        a(Context context, af.l lVar, boolean z10) {
            this.f93627c = context;
            this.f93628d = lVar;
            this.f93629e = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46306, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46305, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            VideoCollectAction.this.j(this.f93627c, this.f93628d, this.f93629e);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46307, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<CollectionFolders>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ af.l f93630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoCollectAction f93631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f93632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f93633e;

        /* JADX INFO: compiled from: VideoCollectAction.kt */
        public static final class a implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f93634b = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
            }
        }

        b(af.l lVar, VideoCollectAction videoCollectAction, Context context, boolean z10) {
            this.f93630b = lVar;
            this.f93631c = videoCollectAction;
            this.f93632d = context;
            this.f93633e = z10;
        }

        public void onNext(@dl.d Result<CollectionFolders> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 46308, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            CollectionFolders result = t10.getResult();
            List<CollectionFolder> folders = result != null ? result.getFolders() : null;
            if (com.max.hbcommon.utils.c.w(folders)) {
                return;
            }
            PopupWindow popupMenuWindow = this.f93630b.getPopupMenuWindow();
            if (popupMenuWindow != null) {
                popupMenuWindow.setOnDismissListener(a.f93634b);
            }
            VideoCollectAction videoCollectAction = this.f93631c;
            Context context = this.f93632d;
            f0.m(folders);
            videoCollectAction.u(context, folders, this.f93630b, this.f93633e);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46309, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolders>) obj);
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ af.l f93635b;

        c(af.l lVar) {
            this.f93635b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PopupWindow popupMenuWindow;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46310, new Class[]{View.class}, Void.TYPE).isSupported || (popupMenuWindow = this.f93635b.getPopupMenuWindow()) == null) {
                return;
            }
            popupMenuWindow.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f93638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoCollectAction f93639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ af.l f93640d;

        /* JADX INFO: compiled from: VideoCollectAction.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EditText f93641b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ VideoCollectAction f93642c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f93643d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ af.l f93644e;

            a(EditText editText, VideoCollectAction videoCollectAction, Context context, af.l lVar) {
                this.f93641b = editText;
                this.f93642c = videoCollectAction;
                this.f93643d = context;
                this.f93644e = lVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46312, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                String string = this.f93641b.getText().toString();
                Charset charsetDefaultCharset = Charset.defaultCharset();
                f0.o(charsetDefaultCharset, "defaultCharset()");
                byte[] bytes = string.getBytes(charsetDefaultCharset);
                f0.o(bytes, "this as java.lang.String).getBytes(charset)");
                if (bytes.length > 24) {
                    com.max.hbutils.utils.c.f("最多输入8个字");
                } else {
                    dialogInterface.dismiss();
                    VideoCollectAction.b(this.f93642c, this.f93643d, this.f93644e, this.f93641b.getText().toString(), false);
                }
            }
        }

        /* JADX INFO: compiled from: VideoCollectAction.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f93645b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46313, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        d(Context context, VideoCollectAction videoCollectAction, af.l lVar) {
            this.f93638b = context;
            this.f93639c = videoCollectAction;
            this.f93640d = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46311, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EditText editTextI = com.max.xiaoheihe.module.bbs.utils.b.i(this.f93638b);
            com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(this.f93638b).t(R.string.create, new a(editTextI, this.f93639c, this.f93638b, this.f93640d)).n(R.string.cancel, b.f93645b).i(editTextI).y("创建收藏夹").d();
            f0.o(aVarD, "private fun initCollectM…smissClickListener)\n    }");
            aVarD.show();
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f93646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoCollectAction f93647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ af.l f93648d;

        /* JADX INFO: compiled from: VideoCollectAction.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EditText f93649b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ VideoCollectAction f93650c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f93651d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ af.l f93652e;

            a(EditText editText, VideoCollectAction videoCollectAction, Context context, af.l lVar) {
                this.f93649b = editText;
                this.f93650c = videoCollectAction;
                this.f93651d = context;
                this.f93652e = lVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46315, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                String string = this.f93649b.getText().toString();
                Charset charsetDefaultCharset = Charset.defaultCharset();
                f0.o(charsetDefaultCharset, "defaultCharset()");
                byte[] bytes = string.getBytes(charsetDefaultCharset);
                f0.o(bytes, "this as java.lang.String).getBytes(charset)");
                if (bytes.length > 24) {
                    com.max.hbutils.utils.c.f("最多输入8个字");
                } else {
                    dialogInterface.dismiss();
                    VideoCollectAction.b(this.f93650c, this.f93651d, this.f93652e, this.f93649b.getText().toString(), true);
                }
            }
        }

        /* JADX INFO: compiled from: VideoCollectAction.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f93653b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46316, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        e(Context context, VideoCollectAction videoCollectAction, af.l lVar) {
            this.f93646b = context;
            this.f93647c = videoCollectAction;
            this.f93648d = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46314, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EditText editTextI = com.max.xiaoheihe.module.bbs.utils.b.i(this.f93646b);
            com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(this.f93646b).t(R.string.create, new a(editTextI, this.f93647c, this.f93646b, this.f93648d)).n(R.string.cancel, b.f93653b).i(editTextI).y("创建收藏夹").d();
            f0.o(aVarD, "private fun initCollectM…smissClickListener)\n    }");
            aVarD.show();
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class f extends s<CollectionFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoCollectAction f93654b;

        /* JADX INFO: compiled from: VideoCollectAction.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VideoCollectAction f93655b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CollectionFolder f93656c;

            a(VideoCollectAction videoCollectAction, CollectionFolder collectionFolder) {
                this.f93655b = videoCollectAction;
                this.f93656c = collectionFolder;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(@dl.e View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46319, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f93655b.i().invoke(this.f93656c.getId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, List<CollectionFolder> list, VideoCollectAction videoCollectAction) {
            super(context, list, R.layout.item_collection_folder_menu);
            this.f93654b = videoCollectAction;
        }

        public void m(@dl.d s.e viewHolder, @dl.d CollectionFolder data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 46317, new Class[]{s.e.class, CollectionFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            TextView textView = (TextView) viewHolder.i(R.id.tv_folder_name);
            textView.setText(data.getName());
            textView.setOnClickListener(new a(this.f93654b, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, CollectionFolder collectionFolder) {
            if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 46318, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, collectionFolder);
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class g extends s<CollectionFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoCollectAction f93657b;

        /* JADX INFO: compiled from: VideoCollectAction.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ VideoCollectAction f93658b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CollectionFolder f93659c;

            a(VideoCollectAction videoCollectAction, CollectionFolder collectionFolder) {
                this.f93658b = videoCollectAction;
                this.f93659c = collectionFolder;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(@dl.e View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46322, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f93658b.i().invoke(this.f93659c.getId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, List<CollectionFolder> list, VideoCollectAction videoCollectAction) {
            super(context, list, R.layout.item_collection_folder_menu);
            this.f93657b = videoCollectAction;
        }

        public void m(@dl.d s.e viewHolder, @dl.d CollectionFolder data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 46320, new Class[]{s.e.class, CollectionFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            TextView textView = (TextView) viewHolder.i(R.id.tv_folder_name);
            textView.setText(data.getName());
            textView.setOnClickListener(new a(this.f93657b, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, CollectionFolder collectionFolder) {
            if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 46321, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, collectionFolder);
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ af.l f93660b;

        h(af.l lVar) {
            this.f93660b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46323, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f93660b.r();
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ af.l f93661b;

        i(af.l lVar) {
            this.f93661b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46324, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f93661b.r();
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class j implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46326, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            VideoCollectAction.this.l().invoke();
        }
    }

    /* JADX INFO: compiled from: VideoCollectAction.kt */
    public static final class k implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46327, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            VideoCollectAction.this.l().invoke();
        }
    }

    public VideoCollectAction() {
        kotlinx.coroutines.flow.j<Boolean> jVarA = v.a(Boolean.FALSE);
        this.f93624g = jVarA;
        this.f93625h = jVarA;
    }

    public static final /* synthetic */ void b(VideoCollectAction videoCollectAction, Context context, af.l lVar, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{videoCollectAction, context, lVar, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 46302, new Class[]{VideoCollectAction.class, Context.class, af.l.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        videoCollectAction.f(context, lVar, str, z10);
    }

    public static /* synthetic */ void d(VideoCollectAction videoCollectAction, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{videoCollectAction, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 46293, new Class[]{VideoCollectAction.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        videoCollectAction.c(z10);
    }

    private final void f(Context context, af.l lVar, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, lVar, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46301, new Class[]{Context.class, af.l.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f93623f.invoke(com.max.xiaoheihe.network.i.a().Ob(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(context, lVar, z10)));
    }

    private final void n(Context context, af.l lVar, ad0 ad0Var, List<CollectionFolder> list) {
        if (PatchProxy.proxy(new Object[]{context, lVar, ad0Var, list}, this, changeQuickRedirect, false, 46299, new Class[]{Context.class, af.l.class, ad0.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f fVar = new f(context, list, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        ad0Var.f108515c.setLayoutManager(linearLayoutManager);
        ad0Var.f108515c.setAdapter(fVar);
        ad0Var.f108518f.setOnClickListener(new c(lVar));
        h hVar = new h(lVar);
        ad0Var.f108520h.setOnClickListener(new d(context, this, lVar));
        ad0Var.f108516d.setOnClickListener(hVar);
        ad0Var.f108514b.setOnClickListener(hVar);
    }

    private final void o(Context context, af.l lVar, bd0 bd0Var, List<CollectionFolder> list) {
        if (PatchProxy.proxy(new Object[]{context, lVar, bd0Var, list}, this, changeQuickRedirect, false, 46300, new Class[]{Context.class, af.l.class, bd0.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        g gVar = new g(context, list, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        bd0Var.f108918c.setLayoutManager(linearLayoutManager);
        bd0Var.f108918c.setAdapter(gVar);
        i iVar = new i(lVar);
        bd0Var.f108921f.setOnClickListener(new e(context, this, lVar));
        bd0Var.f108919d.setOnClickListener(iVar);
        bd0Var.f108917b.setOnClickListener(iVar);
    }

    public static /* synthetic */ void w(VideoCollectAction videoCollectAction, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{videoCollectAction, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 46296, new Class[]{VideoCollectAction.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        videoCollectAction.v(z10);
    }

    @Override // com.max.video.ui.widget.d
    public void a(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 46291, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        ud0 ud0VarC = ud0.c(LayoutInflater.from(context));
        f0.o(ud0VarC, "inflate(LayoutInflater.from(context))");
        this.f93618a = ud0VarC;
    }

    public final void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46292, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f93622e.invoke();
        }
        this.f93624g.setValue(Boolean.TRUE);
    }

    @Override // com.max.video.ui.widget.d
    @dl.d
    public View e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46290, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ud0 ud0Var = this.f93618a;
        if (ud0Var == null) {
            f0.S("binding");
            ud0Var = null;
        }
        RelativeLayout relativeLayoutB = ud0Var.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @dl.d
    public final yh.a<b2> g() {
        return this.f93622e;
    }

    @dl.d
    public final u<Boolean> h() {
        return this.f93625h;
    }

    @dl.d
    public final l<String, b2> i() {
        return this.f93620c;
    }

    public final void j(@dl.d Context ctx, @dl.d af.l menu, boolean z10) {
        if (PatchProxy.proxy(new Object[]{ctx, menu, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46297, new Class[]{Context.class, af.l.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ctx, "ctx");
        f0.p(menu, "menu");
        this.f93623f.invoke(com.max.xiaoheihe.network.i.a().v(0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(menu, this, ctx, z10)));
    }

    @dl.d
    public final l<io.reactivex.disposables.b, b2> k() {
        return this.f93623f;
    }

    @dl.d
    public final yh.a<b2> l() {
        return this.f93619b;
    }

    @dl.d
    public final yh.a<b2> m() {
        return this.f93621d;
    }

    public final void p(@dl.d yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 46288, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f93622e = aVar;
    }

    public final void q(@dl.d l<? super String, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 46286, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.f93620c = lVar;
    }

    public final void r(@dl.d l<? super io.reactivex.disposables.b, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 46289, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lVar, "<set-?>");
        this.f93623f = lVar;
    }

    public final void s(@dl.d yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 46285, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f93619b = aVar;
    }

    public final void t(@dl.d yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 46287, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f93621d = aVar;
    }

    public final void u(@dl.d Context ctx, @dl.d List<CollectionFolder> folders, @dl.d af.l menu, boolean z10) {
        PopupWindow popupMenuWindow;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{ctx, folders, menu, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46298, new Class[]{Context.class, List.class, af.l.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ctx, "ctx");
        f0.p(folders, "folders");
        f0.p(menu, "menu");
        PopupWindow popupMenuWindow2 = menu.getPopupMenuWindow();
        if (popupMenuWindow2 != null && popupMenuWindow2.isShowing()) {
            z11 = true;
        }
        if (z11 && (popupMenuWindow = menu.getPopupMenuWindow()) != null) {
            popupMenuWindow.dismiss();
        }
        if (z10) {
            bd0 bd0VarC = bd0.c(LayoutInflater.from(ctx));
            f0.o(bd0VarC, "inflate(LayoutInflater.from(ctx))");
            o(ctx, menu, bd0VarC, folders);
            LinearLayout linearLayoutB = bd0VarC.b();
            f0.o(linearLayoutB, "contentBinding.root");
            menu.h(linearLayoutB);
            PopupWindow popupMenuWindow3 = menu.getPopupMenuWindow();
            if (popupMenuWindow3 != null) {
                popupMenuWindow3.setOnDismissListener(new j());
                return;
            }
            return;
        }
        ad0 ad0VarC = ad0.c(LayoutInflater.from(ctx));
        f0.o(ad0VarC, "inflate(LayoutInflater.from(ctx))");
        n(ctx, menu, ad0VarC, folders);
        LinearLayout linearLayoutB2 = ad0VarC.b();
        f0.o(linearLayoutB2, "contentBinding.root");
        menu.c(linearLayoutB2);
        PopupWindow popupMenuWindow4 = menu.getPopupMenuWindow();
        if (popupMenuWindow4 != null) {
            popupMenuWindow4.setOnDismissListener(new k());
        }
    }

    public final void v(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46295, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            kotlinx.coroutines.flow.j<Boolean> jVar = this.f93624g;
            jVar.setValue(Boolean.valueOf(true ^ jVar.getValue().booleanValue()));
        } else if (this.f93625h.getValue().booleanValue()) {
            x(true);
        } else {
            this.f93622e.invoke();
        }
    }

    public final void x(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46294, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f93621d.invoke();
        }
        this.f93624g.setValue(Boolean.FALSE);
    }
}

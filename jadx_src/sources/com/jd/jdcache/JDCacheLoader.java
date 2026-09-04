package com.jd.jdcache;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import androidx.annotation.i;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import com.jd.jdcache.match.ResourceMatcherManager;
import com.jd.jdcache.match.base.JDCacheResourceMatcher;
import com.jd.jdcache.service.JDCacheMaster;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: JDCacheLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheLoader.kt\ncom/jd/jdcache/JDCacheLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,144:1\n1855#2,2:145\n1855#2,2:147\n1855#2:149\n1856#2:154\n1855#2,2:155\n9#3,4:150\n*S KotlinDebug\n*F\n+ 1 JDCacheLoader.kt\ncom/jd/jdcache/JDCacheLoader\n*L\n69#1:145,2\n88#1:147,2\n112#1:149\n112#1:154\n140#1:155,2\n115#1:150,4\n*E\n"})
@Keep
public class JDCacheLoader {

    @d
    private final AtomicBoolean destroyed;
    private final boolean enable;

    @d
    private final String key;

    @d
    private final z lifecycleEventObserver$delegate;

    @e
    private y lifecycleOwner;

    @e
    private final List<JDCacheResourceMatcher> matcherList;

    @d
    private final z messageHandler$delegate;
    private boolean preloadHtml;

    @e
    private final String[] resKeys;

    @d
    private final String url;

    @e
    private JDCacheWebView view;
    private int viewId;

    /* JADX WARN: Multi-variable type inference failed */
    public JDCacheLoader(@d String url, @e String[] strArr, @d String key, @e List<? extends JDCacheResourceMatcher> list, boolean z10) {
        f0.p(url, "url");
        f0.p(key, "key");
        this.url = url;
        this.resKeys = strArr;
        this.key = key;
        this.matcherList = list;
        this.enable = z10;
        this.preloadHtml = true;
        this.viewId = -1;
        this.messageHandler$delegate = b0.c(new yh.a<JDCacheLoader$messageHandler$2.a>() { // from class: com.jd.jdcache.JDCacheLoader$messageHandler$2

            /* JADX INFO: compiled from: JDCacheLoader.kt */
            public static final class a extends Handler {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ JDCacheLoader f64133a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(JDCacheLoader jDCacheLoader, Looper looper) {
                    super(looper);
                    this.f64133a = jDCacheLoader;
                }

                @Override // android.os.Handler
                public void handleMessage(@d Message msg) {
                    f0.p(msg, "msg");
                    this.f64133a.handleMessageData(msg);
                }
            }

            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                return new a(this.f64132b, Looper.getMainLooper());
            }
        });
        this.destroyed = new AtomicBoolean(false);
        this.lifecycleEventObserver$delegate = b0.c(new JDCacheLoader$lifecycleEventObserver$2(this));
    }

    public /* synthetic */ JDCacheLoader(String str, String[] strArr, String str2, List list, boolean z10, int i10, u uVar) {
        this(str, strArr, (i10 & 4) != 0 ? String.valueOf(System.currentTimeMillis()) : str2, (i10 & 8) != 0 ? ResourceMatcherManager.f64144a.b(strArr) : list, (i10 & 16) != 0 ? c.f64138a.c() : z10);
    }

    public static /* synthetic */ void sendMessageData$default(JDCacheLoader jDCacheLoader, int i10, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageData");
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        jDCacheLoader.sendMessageData(i10, obj);
    }

    public final void destroy() {
        if (this.destroyed.compareAndSet(false, true)) {
            onDestroy();
        }
    }

    @d
    protected final AtomicBoolean getDestroyed() {
        return this.destroyed;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @d
    public final String getKey() {
        return this.key;
    }

    @d
    protected final v getLifecycleEventObserver() {
        return (v) this.lifecycleEventObserver$delegate.getValue();
    }

    @e
    public final y getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @e
    public final List<JDCacheResourceMatcher> getMatcherList() {
        return this.matcherList;
    }

    @d
    protected final Handler getMessageHandler() {
        return (Handler) this.messageHandler$delegate.getValue();
    }

    public final boolean getPreloadHtml() {
        return this.preloadHtml;
    }

    @e
    public final String[] getResKeys() {
        return this.resKeys;
    }

    @d
    public final String getUrl() {
        return this.url;
    }

    @e
    public final JDCacheWebView getView() {
        return this.view;
    }

    public final int getViewId() {
        return this.viewId;
    }

    protected void handleMessageData(@d Message msg) {
        f0.p(msg, "msg");
    }

    @d
    public JDCacheLoader init() {
        if (!this.enable) {
            return this;
        }
        JDCacheMaster.f64182b.a().c(this);
        prepareMatchers();
        return this;
    }

    @i
    protected void onDestroy() {
        JDCacheMaster.f64182b.a().h(this.key);
        List<JDCacheResourceMatcher> list = this.matcherList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((JDCacheResourceMatcher) it.next()).destroy();
            }
        }
        setView(null);
    }

    public void onLifecycleStateChanged(@d Lifecycle.Event event) {
        f0.p(event, "event");
        List<JDCacheResourceMatcher> list = this.matcherList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((JDCacheResourceMatcher) it.next()).onLifecycleStateChanged(event);
            }
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    public void onPageFinished(@d String url) {
        f0.p(url, "url");
    }

    public void onPageStarted(@d String url) {
        f0.p(url, "url");
    }

    @e
    public WebResourceResponse onRequest(@d WebResourceRequest request) {
        List<JDCacheResourceMatcher> list;
        f0.p(request, "request");
        if (this.enable && (list = this.matcherList) != null) {
            for (JDCacheResourceMatcher jDCacheResourceMatcher : list) {
                WebResourceResponse webResourceResponseMatch = jDCacheResourceMatcher.match(request);
                if (webResourceResponseMatch != null) {
                    JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
                    if (jDCacheLog.getCanLog()) {
                        jDCacheLog.d("JDCacheLoader", "Use local file to create response:[" + jDCacheResourceMatcher.getName() + "](" + request.getUrl() + ')');
                    }
                    return webResourceResponseMatch;
                }
            }
        }
        return null;
    }

    protected void prepareMatchers() {
        List<JDCacheResourceMatcher> list;
        if (this.enable && (list = this.matcherList) != null) {
            for (JDCacheResourceMatcher jDCacheResourceMatcher : list) {
                jDCacheResourceMatcher.setLoader(this);
                jDCacheResourceMatcher.prepare(this.url);
            }
        }
    }

    public void sendMessageData(int i10, @e Object obj) {
        getMessageHandler().sendMessage(getMessageHandler().obtainMessage(i10, obj));
    }

    public final void setLifecycleOwner(@e y yVar) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        y yVar2 = this.lifecycleOwner;
        if (yVar2 != null && (lifecycle2 = yVar2.getLifecycle()) != null) {
            lifecycle2.d(getLifecycleEventObserver());
        }
        this.lifecycleOwner = yVar;
        if (yVar == null || (lifecycle = yVar.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(getLifecycleEventObserver());
    }

    public final void setPreloadHtml(boolean z10) {
        this.preloadHtml = z10;
    }

    public final void setView(@e JDCacheWebView jDCacheWebView) {
        if (!f0.g(jDCacheWebView, this.view)) {
            this.viewId = jDCacheWebView != null ? jDCacheWebView.hashCode() : -1;
        }
        this.view = jDCacheWebView;
    }
}

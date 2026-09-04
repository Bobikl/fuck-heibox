package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: SplitRuleParser.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J'\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/window/embedding/y;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "splitResourceId", "", "Landroidx/window/embedding/m;", RXScreenCaptureService.KEY_HEIGHT, "Landroid/content/res/XmlResourceParser;", "parser", "Landroidx/window/embedding/v;", "e", "Landroidx/window/embedding/w;", "f", "Landroidx/window/embedding/u;", "d", "Landroidx/window/embedding/b;", ak.aF, "Landroidx/window/embedding/a;", "b", "", "pkg", "", "clsSeq", "Landroid/content/ComponentName;", ak.av, "staticRuleResourceId", "g", "(Landroid/content/Context;I)Ljava/util/Set;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class y {
    private final ComponentName a(String pkg, CharSequence clsSeq) {
        if (clsSeq != null) {
            if (!(clsSeq.length() == 0)) {
                String string = clsSeq.toString();
                if (string.charAt(0) == '.') {
                    return new ComponentName(pkg, f0.C(pkg, string));
                }
                int iR3 = StringsKt__StringsKt.r3(string, IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null);
                if (iR3 > 0) {
                    pkg = string.substring(0, iR3);
                    f0.o(pkg, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = string.substring(iR3 + 1);
                    f0.o(string, "this as java.lang.String).substring(startIndex)");
                }
                if (f0.g(string, androidx.webkit.b.f28327e) || StringsKt__StringsKt.r3(string, lg.a.f131414g, 0, false, 6, null) >= 0) {
                    return new ComponentName(pkg, string);
                }
                return new ComponentName(pkg, pkg + lg.a.f131414g + string);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final ActivityFilter b(Context context, XmlResourceParser parser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, R.styleable.f28467a, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.ActivityFilter_activityName);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        f0.o(packageName, "packageName");
        return new ActivityFilter(a(packageName, string), string2);
    }

    private final b c(Context context, XmlResourceParser parser) {
        return new b(d1.k(), context.getTheme().obtainStyledAttributes(parser, R.styleable.f28468b, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final u d(Context context, XmlResourceParser parser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, R.styleable.f28469c, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        f0.o(packageName, "packageName");
        return new u(a(packageName, string), a(packageName, string2), string3);
    }

    private final v e(Context context, XmlResourceParser parser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, R.styleable.f28470d, 0, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new v(d1.k(), typedArrayObtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), typedArrayObtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), typedArrayObtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f10, i10);
    }

    private final w f(Context context, XmlResourceParser parser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, R.styleable.f28471e, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f10 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        f0.o(packageName, "packageName");
        ComponentName componentNameA = a(packageName, string);
        Set setK = d1.k();
        Intent component = new Intent().setComponent(componentNameA);
        f0.o(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new w(setK, component, dimension, dimension2, f10, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Set<m> h(Context context, int splitResourceId) throws XmlPullParserException, IOException {
        w wVarH;
        b bVarC;
        v vVarE;
        try {
            XmlResourceParser xml = context.getResources().getXml(splitResourceId);
            f0.o(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            b bVar = null;
            v vVar = null;
            w wVar = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || f0.g("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (bVar == null && wVar == null) {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                    ActivityFilter activityFilterB = b(context, xml);
                                    if (bVar != null) {
                                        hashSet.remove(bVar);
                                        bVarC = bVar.c(activityFilterB);
                                        hashSet.add(bVarC);
                                        bVar = bVarC;
                                    } else if (wVar != null) {
                                        hashSet.remove(wVar);
                                        wVarH = wVar.h(activityFilterB);
                                        hashSet.add(wVarH);
                                        wVar = wVarH;
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    vVarE = e(context, xml);
                                    hashSet.add(vVarE);
                                    bVar = null;
                                    wVar = null;
                                    vVar = vVarE;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (vVar == null) {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    u uVarD = d(context, xml);
                                    hashSet.remove(vVar);
                                    vVarE = vVar.j(uVarD);
                                    hashSet.add(vVarE);
                                    vVar = vVarE;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    bVarC = c(context, xml);
                                    hashSet.add(bVarC);
                                    vVar = null;
                                    wVar = null;
                                    bVar = bVarC;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    wVarH = f(context, xml);
                                    hashSet.add(wVarH);
                                    bVar = null;
                                    vVar = null;
                                    wVar = wVarH;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @dl.e
    public final Set<m> g(@dl.d Context context, int staticRuleResourceId) {
        f0.p(context, "context");
        return h(context, staticRuleResourceId);
    }
}

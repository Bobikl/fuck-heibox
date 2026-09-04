package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import p1.LocaleList;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¤\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a \u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$\u001a \u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b&\u0010'\u001aÛ\u0001\u00103\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00102\u001a\u000201H\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a]\u0010>\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020+2\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a]\u0010F\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020+2\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a\u0086\u0001\u0010U\u001a\u00020\u0003*\u00020H2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020\u001b2\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010M\u001a\u0004\u0018\u00010K2\u0006\u0010N\u001a\u00020K2\b\u0010O\u001a\u0004\u0018\u00010K2\b\u0010P\u001a\u0004\u0018\u00010K2\u0006\u0010Q\u001a\u00020K2\b\u0010R\u001a\u0004\u0018\u00010K2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010=\u001a\u00020+2\u0006\u0010T\u001a\u00020S2\u0006\u00102\u001a\u000201H\u0002\u001a)\u0010W\u001a\u00020\u0005*\u00020\u00052\u0006\u0010V\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\"\u0017\u0010[\u001a\u00020Y8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010Z\"\u001d\u0010^\u001a\u00020Y8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010Z\u001a\u0004\b\\\u0010]\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/b2;", "onValueChange", "Landroidx/compose/ui/n;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/q0;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "placeholder", "leadingIcon", "trailingIcon", "supportingText", "isError", "Landroidx/compose/ui/text/input/m0;", "visualTransformation", "Landroidx/compose/foundation/text/k;", "keyboardOptions", "Landroidx/compose/foundation/text/i;", "keyboardActions", "singleLine", "", "maxLines", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Landroidx/compose/ui/graphics/g2;", "shape", "Landroidx/compose/material3/x1;", "colors", "b", "(Ljava/lang/String;Lyh/l;Landroidx/compose/ui/n;ZZLandroidx/compose/ui/text/q0;Lyh/p;Lyh/p;Lyh/p;Lyh/p;Lyh/p;ZLandroidx/compose/ui/text/input/m0;Landroidx/compose/foundation/text/k;Landroidx/compose/foundation/text/i;ZILandroidx/compose/foundation/interaction/g;Landroidx/compose/ui/graphics/g2;Landroidx/compose/material3/x1;Landroidx/compose/runtime/p;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", ak.av, "(Landroidx/compose/ui/text/input/TextFieldValue;Lyh/l;Landroidx/compose/ui/n;ZZLandroidx/compose/ui/text/q0;Lyh/p;Lyh/p;Lyh/p;Lyh/p;Lyh/p;ZLandroidx/compose/ui/text/input/m0;Landroidx/compose/foundation/text/k;Landroidx/compose/foundation/text/i;ZILandroidx/compose/foundation/interaction/g;Landroidx/compose/ui/graphics/g2;Landroidx/compose/material3/x1;Landroidx/compose/runtime/p;III)V", "textField", "leading", "trailing", "", "animationProgress", "Lb1/m;", "onLabelMeasured", com.google.android.exoplayer2.text.ttml.d.W, "supporting", "Landroidx/compose/foundation/layout/m0;", "paddingValues", ak.aF, "(Landroidx/compose/ui/n;Lyh/p;Lyh/q;Lyh/p;Lyh/p;Lyh/p;ZFLyh/l;Lyh/p;Lyh/p;Landroidx/compose/foundation/layout/m0;Landroidx/compose/runtime/p;II)V", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "isLabelInMiddleSection", "Ls1/b;", "constraints", "density", "i", "(IIIIIZJFLandroidx/compose/foundation/layout/m0;)I", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "supportingPlaceableHeight", RXScreenCaptureService.KEY_HEIGHT, "(IIIIIIJFLandroidx/compose/foundation/layout/m0;)I", "Landroidx/compose/ui/layout/e1$a;", "totalHeight", "width", "Landroidx/compose/ui/layout/e1;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "l", "labelSize", "k", "(Landroidx/compose/ui/n;JLandroidx/compose/foundation/layout/m0;)Landroidx/compose/ui/n;", "Ls1/h;", "F", "OutlinedTextFieldInnerPadding", "j", "()F", "OutlinedTextFieldTopPadding", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class OutlinedTextFieldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f10122a = s1.h.g(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f10123b = s1.h.g(8);

    /* JADX WARN: Code duplicated, block: B:100:0x0141  */
    /* JADX WARN: Code duplicated, block: B:102:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157  */
    /* JADX WARN: Code duplicated, block: B:110:0x015d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0166  */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0190  */
    /* JADX WARN: Code duplicated, block: B:131:0x0194  */
    /* JADX WARN: Code duplicated, block: B:133:0x019c  */
    /* JADX WARN: Code duplicated, block: B:134:0x019f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01be  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x01db  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:171:0x0204  */
    /* JADX WARN: Code duplicated, block: B:172:0x020b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0213  */
    /* JADX WARN: Code duplicated, block: B:176:0x0219  */
    /* JADX WARN: Code duplicated, block: B:177:0x021c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0224  */
    /* JADX WARN: Code duplicated, block: B:182:0x022b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0233  */
    /* JADX WARN: Code duplicated, block: B:186:0x0239  */
    /* JADX WARN: Code duplicated, block: B:187:0x023c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0248  */
    /* JADX WARN: Code duplicated, block: B:193:0x024e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0257  */
    /* JADX WARN: Code duplicated, block: B:198:0x025c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0264  */
    /* JADX WARN: Code duplicated, block: B:203:0x026a  */
    /* JADX WARN: Code duplicated, block: B:206:0x0273  */
    /* JADX WARN: Code duplicated, block: B:208:0x0278  */
    /* JADX WARN: Code duplicated, block: B:211:0x0284  */
    /* JADX WARN: Code duplicated, block: B:217:0x02be  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:239:0x0344 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x0346  */
    /* JADX WARN: Code duplicated, block: B:241:0x0349  */
    /* JADX WARN: Code duplicated, block: B:243:0x034d  */
    /* JADX WARN: Code duplicated, block: B:244:0x034f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0353  */
    /* JADX WARN: Code duplicated, block: B:247:0x0356  */
    /* JADX WARN: Code duplicated, block: B:250:0x035c  */
    /* JADX WARN: Code duplicated, block: B:251:0x036c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0372  */
    /* JADX WARN: Code duplicated, block: B:255:0x0375  */
    /* JADX WARN: Code duplicated, block: B:257:0x0379  */
    /* JADX WARN: Code duplicated, block: B:258:0x037c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0380  */
    /* JADX WARN: Code duplicated, block: B:261:0x0383  */
    /* JADX WARN: Code duplicated, block: B:263:0x0387  */
    /* JADX WARN: Code duplicated, block: B:264:0x038a  */
    /* JADX WARN: Code duplicated, block: B:266:0x038e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0391  */
    /* JADX WARN: Code duplicated, block: B:269:0x0395  */
    /* JADX WARN: Code duplicated, block: B:270:0x0397  */
    /* JADX WARN: Code duplicated, block: B:272:0x039b  */
    /* JADX WARN: Code duplicated, block: B:273:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:276:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:277:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:280:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:281:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:283:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:284:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:286:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:287:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:290:0x03de  */
    /* JADX WARN: Code duplicated, block: B:292:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:294:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:297:0x0407  */
    /* JADX WARN: Code duplicated, block: B:298:0x0415  */
    /* JADX WARN: Code duplicated, block: B:301:0x041d  */
    /* JADX WARN: Code duplicated, block: B:302:0x0487  */
    /* JADX WARN: Code duplicated, block: B:306:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:309:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:310:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:313:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:316:0x0589  */
    /* JADX WARN: Code duplicated, block: B:321:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x012a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0132  */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final TextFieldValue value, @dl.d final yh.l<? super TextFieldValue, kotlin.b2> onValueChange, @dl.e androidx.compose.ui.n nVar, boolean z10, boolean z11, @dl.e TextStyle textStyle, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5, boolean z12, @dl.e androidx.compose.ui.text.input.m0 m0Var, @dl.e KeyboardOptions keyboardOptions, @dl.e androidx.compose.foundation.text.i iVar, boolean z13, int i10, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e g2 g2Var, @dl.e x1 x1Var, @dl.e androidx.compose.runtime.p pVar6, final int i11, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z14;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7;
        KeyboardOptions keyboardOptionsA;
        androidx.compose.foundation.text.i iVarA;
        final int i41;
        Object objU;
        long jP;
        boolean z15;
        androidx.compose.runtime.p pVar8;
        final androidx.compose.ui.n nVar2;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12;
        final boolean z16;
        final androidx.compose.ui.text.input.m0 m0Var2;
        final KeyboardOptions keyboardOptions2;
        final androidx.compose.foundation.text.i iVar2;
        final androidx.compose.foundation.interaction.g gVar2;
        final g2 g2Var2;
        final x1 x1Var2;
        final TextStyle textStyle2;
        final boolean z17;
        final boolean z18;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13;
        final boolean z19;
        final int i42;
        androidx.compose.runtime.u1 u1VarH;
        int i43;
        int i44;
        int i45;
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(onValueChange, "onValueChange");
        androidx.compose.runtime.p pVarF = pVar6.F(1040237435);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (pVarF.s(value) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= pVarF.s(onValueChange) ? 32 : 16;
        }
        int i46 = i13 & 4;
        if (i46 == 0) {
            if ((i11 & bb.c.b.f30796me) == 0) {
                i14 |= pVarF.s(nVar) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    i14 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    if (pVarF.u(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                if ((i11 & 458752) != 0) {
                    if ((i13 & 32) == 0 || !pVarF.s(textStyle)) {
                        i45 = 65536;
                    } else {
                        i45 = 131072;
                    }
                    i14 |= i45;
                }
                i19 = i13 & 64;
                if (i19 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (pVarF.s(pVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 128;
                if (i21 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (pVarF.s(pVar2)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (pVarF.s(pVar3)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 512;
                if (i25 != 0) {
                    i14 |= com.google.android.exoplayer2.j.G;
                } else if ((i11 & 1879048192) == 0) {
                    if (pVarF.s(pVar4)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 1024;
                if (i27 != 0) {
                    i28 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (pVarF.s(pVar5)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i12 | i29;
                } else {
                    i28 = i12;
                }
                i30 = i13 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i12 & 112) == 0) {
                    if (pVarF.u(z12)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i13 & 4096;
                if (i33 != 0) {
                    if ((i12 & bb.c.b.f30796me) == 0) {
                        if (pVarF.s(m0Var)) {
                            i34 = 256;
                        } else {
                            i34 = 128;
                        }
                        i32 |= i34;
                    }
                    if ((i12 & bb.c.g.f32954lc) != 0) {
                        i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
                    }
                    if ((i12 & 57344) != 0) {
                        i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
                    }
                    i35 = i13 & 32768;
                    if (i35 != 0) {
                        i32 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i12 & 458752) == 0) {
                        if (pVarF.u(z13)) {
                            i36 = 131072;
                        } else {
                            i36 = 65536;
                        }
                        i32 |= i36;
                    }
                    i37 = i13 & 65536;
                    if (i37 != 0) {
                        i32 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i10)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i32 |= i38;
                    }
                    i39 = i13 & 131072;
                    if (i39 != 0) {
                        i32 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (pVarF.s(gVar)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i32 |= i40;
                    }
                    if ((i12 & 234881024) != 0) {
                        if ((i13 & 262144) == 0 || !pVarF.s(g2Var)) {
                            i44 = 33554432;
                        } else {
                            i44 = 67108864;
                        }
                        i32 |= i44;
                    }
                    if ((i12 & 1879048192) != 0) {
                        if ((i13 & 524288) == 0 || !pVarF.s(x1Var)) {
                            i43 = 268435456;
                        } else {
                            i43 = 536870912;
                        }
                        i32 |= i43;
                    }
                    if ((i14 & 1533916891) != 306783378 && (1533916891 & i32) == 306783378 && pVarF.b()) {
                        pVarF.l();
                        nVar2 = nVar;
                        z17 = z10;
                        z18 = z11;
                        textStyle2 = textStyle;
                        pVar13 = pVar;
                        pVar9 = pVar2;
                        pVar11 = pVar4;
                        pVar12 = pVar5;
                        z16 = z12;
                        m0Var2 = m0Var;
                        keyboardOptions2 = keyboardOptions;
                        iVar2 = iVar;
                        z19 = z13;
                        i42 = i10;
                        gVar2 = gVar;
                        g2Var2 = g2Var;
                        x1Var2 = x1Var;
                        pVar8 = pVarF;
                        pVar10 = pVar3;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0 || pVarF.o()) {
                            if (i46 != 0) {
                                nVar = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar = nVar;
                            }
                            if (i15 != 0) {
                                z14 = true;
                            } else {
                                z14 = z10;
                            }
                            if (i17 != 0) {
                                z11 = false;
                            } else {
                                z11 = z11;
                            }
                            if ((i13 & 32) != 0) {
                                textStyle = (TextStyle) pVarF.K(TextKt.d());
                                i14 &= -458753;
                            } else {
                                textStyle = textStyle;
                            }
                            if (i19 != 0) {
                                pVar = null;
                            } else {
                                pVar = pVar;
                            }
                            if (i21 != 0) {
                                pVar2 = null;
                            } else {
                                pVar2 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar4 = null;
                            } else {
                                pVar4 = pVar4;
                            }
                            if (i27 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar5;
                            }
                            if (i30 != 0) {
                                z12 = false;
                            } else {
                                z12 = z12;
                            }
                            if (i33 != 0) {
                                m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                            } else {
                                m0Var = m0Var;
                            }
                            pVar3 = pVar7;
                            if ((i13 & 8192) != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                i32 &= -7169;
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            keyboardOptions = keyboardOptionsA;
                            if ((i13 & 16384) != 0) {
                                iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                                i32 &= -57345;
                            } else {
                                iVarA = iVar;
                            }
                            if (i35 != 0) {
                                z13 = false;
                            } else {
                                z13 = z13;
                            }
                            if (i37 != 0) {
                                i10 = Integer.MAX_VALUE;
                            } else {
                                i10 = i10;
                            }
                            iVar = iVarA;
                            if (i39 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar = gVar;
                            }
                            if ((i13 & 262144) != 0) {
                                g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                                i32 &= -234881025;
                            } else {
                                g2Var = g2Var;
                            }
                            if ((i13 & 524288) != 0) {
                                i41 = i32 & (-1879048193);
                                x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                            } else {
                                i41 = i32;
                                x1Var = x1Var;
                            }
                            z10 = z14;
                        } else {
                            pVarF.l();
                            if ((i13 & 32) != 0) {
                                i14 &= -458753;
                            }
                            if ((i13 & 8192) != 0) {
                                i32 &= -7169;
                            }
                            if ((i13 & 16384) != 0) {
                                i32 &= -57345;
                            }
                            if ((i13 & 262144) != 0) {
                                i32 &= -234881025;
                            }
                            i41 = (i13 & 524288) != 0 ? (-1879048193) & i32 : i32;
                            i14 = i14;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                        }
                        pVarF.T(1663543409);
                        jP = textStyle.p();
                        if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                        }
                        pVarF.c0();
                        final TextStyle textStyleR = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                        androidx.compose.runtime.k1[] k1VarArr = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar;
                        final androidx.compose.ui.n nVar3 = nVar;
                        final x1 x1Var3 = x1Var;
                        final boolean z20 = z12;
                        final int i47 = i14;
                        x1 x1Var4 = x1Var;
                        TextStyle textStyle3 = textStyle;
                        final boolean z21 = z10;
                        final boolean z22 = z11;
                        final KeyboardOptions keyboardOptions3 = keyboardOptions;
                        boolean z23 = z10;
                        final androidx.compose.foundation.text.i iVar3 = iVar;
                        final boolean z24 = z13;
                        final int i48 = i10;
                        final androidx.compose.ui.text.input.m0 m0Var3 = m0Var;
                        final androidx.compose.foundation.interaction.g gVar3 = gVar;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar2;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar3;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar5;
                        final g2 g2Var3 = g2Var;
                        pVar8 = pVarF;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar19, int i49) {
                                if ((i49 & 11) == 2 && pVar19.b()) {
                                    pVar19.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-719341509, i49, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                                }
                                androidx.compose.ui.n nVarO = pVar14 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar3, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                                    public final void a(@dl.d r semantics) {
                                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar3;
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                                x1 x1Var5 = x1Var3;
                                boolean z25 = z20;
                                int i50 = i41;
                                SolidColor solidColor = new SolidColor(x1Var5.b(z25, pVar19, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                                final TextFieldValue textFieldValue = value;
                                yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                                final boolean z26 = z21;
                                boolean z27 = z22;
                                TextStyle textStyle4 = textStyleR;
                                KeyboardOptions keyboardOptions4 = keyboardOptions3;
                                androidx.compose.foundation.text.i iVar4 = iVar3;
                                final boolean z28 = z24;
                                int i51 = i48;
                                final androidx.compose.ui.text.input.m0 m0Var4 = m0Var3;
                                final androidx.compose.foundation.interaction.g gVar4 = gVar3;
                                final boolean z29 = z20;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar14;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar15;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar16;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar17;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar24 = pVar18;
                                final x1 x1Var6 = x1Var3;
                                final int i52 = i47;
                                final int i53 = i41;
                                final g2 g2Var4 = g2Var3;
                                androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar19, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                        int i55;
                                        kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                        if ((i54 & 14) == 0) {
                                            i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                        } else {
                                            i55 = i54;
                                        }
                                        if ((i55 & 91) == 18 && pVar25.b()) {
                                            pVar25.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                        }
                                        TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                        String strI = textFieldValue.i();
                                        final boolean z30 = z26;
                                        boolean z31 = z28;
                                        androidx.compose.ui.text.input.m0 m0Var5 = m0Var4;
                                        final androidx.compose.foundation.interaction.g gVar5 = gVar4;
                                        final boolean z32 = z29;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                        final x1 x1Var7 = x1Var6;
                                        final g2 g2Var5 = g2Var4;
                                        final int i56 = i52;
                                        final int i57 = i53;
                                        androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                                if ((i58 & 11) == 2 && pVar31.b()) {
                                                    pVar31.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                                }
                                                TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                                boolean z33 = z30;
                                                boolean z34 = z32;
                                                androidx.compose.foundation.interaction.g gVar6 = gVar5;
                                                x1 x1Var8 = x1Var7;
                                                g2 g2Var6 = g2Var5;
                                                int i59 = 12582912 | ((i56 >> 9) & 14);
                                                int i60 = i57;
                                                textFieldDefaults3.b(z33, z34, gVar6, x1Var8, g2Var6, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                                a(pVar31, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        });
                                        int i58 = i52;
                                        int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                        int i60 = i53;
                                        textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var5, gVar5, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var7, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                        a(pVar25, pVar26, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i54 = i47;
                                int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                                int i56 = i41;
                                BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z26, z27, textStyle4, keyboardOptions4, iVar4, z28, i51, m0Var4, null, gVar4, solidColor, aVarB, pVar19, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                                a(pVar19, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar8, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar2 = nVar;
                        pVar9 = pVar2;
                        pVar10 = pVar3;
                        pVar11 = pVar4;
                        pVar12 = pVar5;
                        z16 = z12;
                        m0Var2 = m0Var;
                        keyboardOptions2 = keyboardOptions;
                        iVar2 = iVar;
                        gVar2 = gVar;
                        g2Var2 = g2Var;
                        x1Var2 = x1Var4;
                        textStyle2 = textStyle3;
                        z17 = z23;
                        z18 = z11;
                        pVar13 = pVar;
                        z19 = z13;
                        i42 = i10;
                    }
                    u1VarH = pVar8.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar19, int i49) {
                            OutlinedTextFieldKt.a(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar19, i11 | 1, i12, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                            a(pVar19, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i32 |= bb.c.b.f30966u4;
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
                }
                if ((i12 & 57344) != 0) {
                    i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
                }
                i35 = i13 & 32768;
                if (i35 != 0) {
                    i32 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z13)) {
                        i36 = 131072;
                    } else {
                        i36 = 65536;
                    }
                    i32 |= i36;
                }
                i37 = i13 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i10)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i13 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (pVarF.s(gVar)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i12 & 234881024) != 0) {
                    if ((i13 & 262144) == 0) {
                        i44 = 33554432;
                    } else {
                        i44 = 33554432;
                    }
                    i32 |= i44;
                }
                if ((i12 & 1879048192) != 0) {
                    if ((i13 & 524288) == 0) {
                        i43 = 268435456;
                    } else {
                        i43 = 268435456;
                    }
                    i32 |= i43;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                    }
                    pVarF.T(1663543409);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR2 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr2 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar;
                    final androidx.compose.ui.n nVar4 = nVar;
                    final x1 x1Var5 = x1Var;
                    final boolean z25 = z12;
                    final int i49 = i14;
                    x1 x1Var6 = x1Var;
                    TextStyle textStyle4 = textStyle;
                    final boolean z26 = z10;
                    final boolean z27 = z11;
                    final KeyboardOptions keyboardOptions4 = keyboardOptions;
                    boolean z28 = z10;
                    final androidx.compose.foundation.text.i iVar4 = iVar;
                    final boolean z29 = z13;
                    final int i410 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var4 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar4 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar5;
                    final g2 g2Var4 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr2, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar114, int i411) {
                            if ((i411 & 11) == 2 && pVar114.b()) {
                                pVar114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-719341509, i411, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                            }
                            androidx.compose.ui.n nVarO = pVar19 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar4, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar4;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var7 = x1Var5;
                            boolean z210 = z25;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var7.b(z210, pVar114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final TextFieldValue textFieldValue = value;
                            yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                            final boolean z211 = z26;
                            boolean z212 = z27;
                            TextStyle textStyle5 = textStyleR2;
                            KeyboardOptions keyboardOptions5 = keyboardOptions4;
                            androidx.compose.foundation.text.i iVar5 = iVar4;
                            final boolean z213 = z29;
                            int i51 = i410;
                            final androidx.compose.ui.text.input.m0 m0Var5 = m0Var4;
                            final androidx.compose.foundation.interaction.g gVar5 = gVar4;
                            final boolean z214 = z25;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar19;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar112;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar113;
                            final x1 x1Var8 = x1Var5;
                            final int i52 = i49;
                            final int i53 = i41;
                            final g2 g2Var5 = g2Var4;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar114, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String strI = textFieldValue.i();
                                    final boolean z30 = z211;
                                    boolean z31 = z213;
                                    androidx.compose.ui.text.input.m0 m0Var6 = m0Var5;
                                    final androidx.compose.foundation.interaction.g gVar6 = gVar5;
                                    final boolean z32 = z214;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var9 = x1Var8;
                                    final g2 g2Var6 = g2Var5;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar7 = gVar6;
                                            x1 x1Var10 = x1Var9;
                                            g2 g2Var7 = g2Var6;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar7, x1Var10, g2Var7, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var6, gVar6, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var9, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i49;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z211, z212, textStyle5, keyboardOptions5, iVar5, z213, i51, m0Var5, null, gVar5, solidColor, aVarB, pVar114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                            a(pVar114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var6;
                    textStyle2 = textStyle4;
                    z17 = z28;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                    }
                    pVarF.T(1663543409);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR3 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr3 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = pVar;
                    final androidx.compose.ui.n nVar5 = nVar;
                    final x1 x1Var7 = x1Var;
                    final boolean z210 = z12;
                    final int i411 = i14;
                    x1 x1Var8 = x1Var;
                    TextStyle textStyle5 = textStyle;
                    final boolean z211 = z10;
                    final boolean z212 = z11;
                    final KeyboardOptions keyboardOptions5 = keyboardOptions;
                    boolean z213 = z10;
                    final androidx.compose.foundation.text.i iVar5 = iVar;
                    final boolean z214 = z13;
                    final int i412 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var5 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar5 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar118 = pVar5;
                    final g2 g2Var5 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr3, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar119, int i413) {
                            if ((i413 & 11) == 2 && pVar119.b()) {
                                pVar119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-719341509, i413, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                            }
                            androidx.compose.ui.n nVarO = pVar114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar5, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar5;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var9 = x1Var7;
                            boolean z215 = z210;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var9.b(z215, pVar119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final TextFieldValue textFieldValue = value;
                            yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                            final boolean z216 = z211;
                            boolean z217 = z212;
                            TextStyle textStyle6 = textStyleR3;
                            KeyboardOptions keyboardOptions6 = keyboardOptions5;
                            androidx.compose.foundation.text.i iVar6 = iVar5;
                            final boolean z218 = z214;
                            int i51 = i412;
                            final androidx.compose.ui.text.input.m0 m0Var6 = m0Var5;
                            final androidx.compose.foundation.interaction.g gVar6 = gVar5;
                            final boolean z219 = z210;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar114;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar116;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar117;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar118;
                            final x1 x1Var10 = x1Var7;
                            final int i52 = i411;
                            final int i53 = i41;
                            final g2 g2Var6 = g2Var5;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar119, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String strI = textFieldValue.i();
                                    final boolean z30 = z216;
                                    boolean z31 = z218;
                                    androidx.compose.ui.text.input.m0 m0Var7 = m0Var6;
                                    final androidx.compose.foundation.interaction.g gVar7 = gVar6;
                                    final boolean z32 = z219;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var11 = x1Var10;
                                    final g2 g2Var7 = g2Var6;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar8 = gVar7;
                                            x1 x1Var12 = x1Var11;
                                            g2 g2Var8 = g2Var7;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar8, x1Var12, g2Var8, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var7, gVar7, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var11, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i411;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z216, z217, textStyle6, keyboardOptions6, iVar6, z218, i51, m0Var6, null, gVar6, solidColor, aVarB, pVar119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar119, Integer num) {
                            a(pVar119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var8;
                    textStyle2 = textStyle5;
                    z17 = z213;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                }
                u1VarH = pVar8.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar119, int i413) {
                        OutlinedTextFieldKt.a(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar119, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar119, Integer num) {
                        a(pVar119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            if ((i11 & 458752) != 0) {
                if ((i13 & 32) == 0) {
                    i45 = 65536;
                } else {
                    i45 = 65536;
                }
                i14 |= i45;
            }
            i19 = i13 & 64;
            if (i19 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i14 |= i20;
            }
            i21 = i13 & 128;
            if (i21 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i14 |= i22;
            }
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i14 |= i24;
            }
            i25 = i13 & 512;
            if (i25 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.s(pVar4)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i14 |= i26;
            }
            i27 = i13 & 1024;
            if (i27 != 0) {
                i28 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i12 | i29;
            } else {
                i28 = i12;
            }
            i30 = i13 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i12 & 112) == 0) {
                if (pVarF.u(z12)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i13 & 4096;
            if (i33 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    if (pVarF.s(m0Var)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
                }
                if ((i12 & 57344) != 0) {
                    i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
                }
                i35 = i13 & 32768;
                if (i35 != 0) {
                    i32 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z13)) {
                        i36 = 131072;
                    } else {
                        i36 = 65536;
                    }
                    i32 |= i36;
                }
                i37 = i13 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i10)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i13 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (pVarF.s(gVar)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i12 & 234881024) != 0) {
                    if ((i13 & 262144) == 0) {
                        i44 = 33554432;
                    } else {
                        i44 = 33554432;
                    }
                    i32 |= i44;
                }
                if ((i12 & 1879048192) != 0) {
                    if ((i13 & 524288) == 0) {
                        i43 = 268435456;
                    } else {
                        i43 = 268435456;
                    }
                    i32 |= i43;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                    }
                    pVarF.T(1663543409);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR4 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr4 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVar;
                    final androidx.compose.ui.n nVar6 = nVar;
                    final x1 x1Var9 = x1Var;
                    final boolean z215 = z12;
                    final int i413 = i14;
                    x1 x1Var10 = x1Var;
                    TextStyle textStyle6 = textStyle;
                    final boolean z216 = z10;
                    final boolean z217 = z11;
                    final KeyboardOptions keyboardOptions6 = keyboardOptions;
                    boolean z218 = z10;
                    final androidx.compose.foundation.text.i iVar6 = iVar;
                    final boolean z219 = z13;
                    final int i414 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var6 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar6 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1110 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1112 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar5;
                    final g2 g2Var6 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr4, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i415) {
                            if ((i415 & 11) == 2 && pVar1114.b()) {
                                pVar1114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-719341509, i415, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                            }
                            androidx.compose.ui.n nVarO = pVar119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar6, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar6;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var11 = x1Var9;
                            boolean z2110 = z215;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var11.b(z2110, pVar1114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final TextFieldValue textFieldValue = value;
                            yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                            final boolean z2111 = z216;
                            boolean z2112 = z217;
                            TextStyle textStyle7 = textStyleR4;
                            KeyboardOptions keyboardOptions7 = keyboardOptions6;
                            androidx.compose.foundation.text.i iVar7 = iVar6;
                            final boolean z2113 = z219;
                            int i51 = i414;
                            final androidx.compose.ui.text.input.m0 m0Var7 = m0Var6;
                            final androidx.compose.foundation.interaction.g gVar7 = gVar6;
                            final boolean z2114 = z215;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar119;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar1110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar1111;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar1112;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar1113;
                            final x1 x1Var12 = x1Var9;
                            final int i52 = i413;
                            final int i53 = i41;
                            final g2 g2Var7 = g2Var6;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar1114, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String strI = textFieldValue.i();
                                    final boolean z30 = z2111;
                                    boolean z31 = z2113;
                                    androidx.compose.ui.text.input.m0 m0Var8 = m0Var7;
                                    final androidx.compose.foundation.interaction.g gVar8 = gVar7;
                                    final boolean z32 = z2114;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var13 = x1Var12;
                                    final g2 g2Var8 = g2Var7;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar9 = gVar8;
                                            x1 x1Var14 = x1Var13;
                                            g2 g2Var9 = g2Var8;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar9, x1Var14, g2Var9, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var8, gVar8, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var13, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i413;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z2111, z2112, textStyle7, keyboardOptions7, iVar7, z2113, i51, m0Var7, null, gVar7, solidColor, aVarB, pVar1114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                            a(pVar1114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var10;
                    textStyle2 = textStyle6;
                    z17 = z218;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                    }
                    pVarF.T(1663543409);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR5 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr5 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1114 = pVar;
                    final androidx.compose.ui.n nVar7 = nVar;
                    final x1 x1Var11 = x1Var;
                    final boolean z2110 = z12;
                    final int i415 = i14;
                    x1 x1Var12 = x1Var;
                    TextStyle textStyle7 = textStyle;
                    final boolean z2111 = z10;
                    final boolean z2112 = z11;
                    final KeyboardOptions keyboardOptions7 = keyboardOptions;
                    boolean z2113 = z10;
                    final androidx.compose.foundation.text.i iVar7 = iVar;
                    final boolean z2114 = z13;
                    final int i416 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var7 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar7 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1116 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1117 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1118 = pVar5;
                    final g2 g2Var7 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr5, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1119, int i417) {
                            if ((i417 & 11) == 2 && pVar1119.b()) {
                                pVar1119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-719341509, i417, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                            }
                            androidx.compose.ui.n nVarO = pVar1114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar7, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar7;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var13 = x1Var11;
                            boolean z2115 = z2110;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var13.b(z2115, pVar1119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final TextFieldValue textFieldValue = value;
                            yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                            final boolean z2116 = z2111;
                            boolean z2117 = z2112;
                            TextStyle textStyle8 = textStyleR5;
                            KeyboardOptions keyboardOptions8 = keyboardOptions7;
                            androidx.compose.foundation.text.i iVar8 = iVar7;
                            final boolean z2118 = z2114;
                            int i51 = i416;
                            final androidx.compose.ui.text.input.m0 m0Var8 = m0Var7;
                            final androidx.compose.foundation.interaction.g gVar8 = gVar7;
                            final boolean z2119 = z2110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar1114;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar1115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar1116;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar1117;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar1118;
                            final x1 x1Var14 = x1Var11;
                            final int i52 = i415;
                            final int i53 = i41;
                            final g2 g2Var8 = g2Var7;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar1119, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String strI = textFieldValue.i();
                                    final boolean z30 = z2116;
                                    boolean z31 = z2118;
                                    androidx.compose.ui.text.input.m0 m0Var9 = m0Var8;
                                    final androidx.compose.foundation.interaction.g gVar9 = gVar8;
                                    final boolean z32 = z2119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var15 = x1Var14;
                                    final g2 g2Var9 = g2Var8;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar10 = gVar9;
                                            x1 x1Var16 = x1Var15;
                                            g2 g2Var10 = g2Var9;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar10, x1Var16, g2Var10, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var9, gVar9, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var15, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i415;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z2116, z2117, textStyle8, keyboardOptions8, iVar8, z2118, i51, m0Var8, null, gVar8, solidColor, aVarB, pVar1119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1119, Integer num) {
                            a(pVar1119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var12;
                    textStyle2 = textStyle7;
                    z17 = z2113;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                }
                u1VarH = pVar8.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar1119, int i417) {
                        OutlinedTextFieldKt.a(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar1119, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1119, Integer num) {
                        a(pVar1119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i32 |= bb.c.b.f30966u4;
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
            }
            if ((i12 & 57344) != 0) {
                i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
            }
            i35 = i13 & 32768;
            if (i35 != 0) {
                i32 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z13)) {
                    i36 = 131072;
                } else {
                    i36 = 65536;
                }
                i32 |= i36;
            }
            i37 = i13 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i10)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i13 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (pVarF.s(gVar)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i12 & 234881024) != 0) {
                if ((i13 & 262144) == 0) {
                    i44 = 33554432;
                } else {
                    i44 = 33554432;
                }
                i32 |= i44;
            }
            if ((i12 & 1879048192) != 0) {
                if ((i13 & 524288) == 0) {
                    i43 = 268435456;
                } else {
                    i43 = 268435456;
                }
                i32 |= i43;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                }
                pVarF.T(1663543409);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR6 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr6 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1119 = pVar;
                final androidx.compose.ui.n nVar8 = nVar;
                final x1 x1Var13 = x1Var;
                final boolean z2115 = z12;
                final int i417 = i14;
                x1 x1Var14 = x1Var;
                TextStyle textStyle8 = textStyle;
                final boolean z2116 = z10;
                final boolean z2117 = z11;
                final KeyboardOptions keyboardOptions8 = keyboardOptions;
                boolean z2118 = z10;
                final androidx.compose.foundation.text.i iVar8 = iVar;
                final boolean z2119 = z13;
                final int i418 = i10;
                final androidx.compose.ui.text.input.m0 m0Var8 = m0Var;
                final androidx.compose.foundation.interaction.g gVar8 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11110 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11112 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11113 = pVar5;
                final g2 g2Var8 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr6, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11114, int i419) {
                        if ((i419 & 11) == 2 && pVar11114.b()) {
                            pVar11114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-719341509, i419, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                        }
                        androidx.compose.ui.n nVarO = pVar1119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar8, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar8;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var15 = x1Var13;
                        boolean z21110 = z2115;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var15.b(z21110, pVar11114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final TextFieldValue textFieldValue = value;
                        yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                        final boolean z21111 = z2116;
                        boolean z21112 = z2117;
                        TextStyle textStyle9 = textStyleR6;
                        KeyboardOptions keyboardOptions9 = keyboardOptions8;
                        androidx.compose.foundation.text.i iVar9 = iVar8;
                        final boolean z21113 = z2119;
                        int i51 = i418;
                        final androidx.compose.ui.text.input.m0 m0Var9 = m0Var8;
                        final androidx.compose.foundation.interaction.g gVar9 = gVar8;
                        final boolean z21114 = z2115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar1119;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar11110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar11111;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar11112;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar11113;
                        final x1 x1Var16 = x1Var13;
                        final int i52 = i417;
                        final int i53 = i41;
                        final g2 g2Var9 = g2Var8;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar11114, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String strI = textFieldValue.i();
                                final boolean z30 = z21111;
                                boolean z31 = z21113;
                                androidx.compose.ui.text.input.m0 m0Var10 = m0Var9;
                                final androidx.compose.foundation.interaction.g gVar10 = gVar9;
                                final boolean z32 = z21114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var17 = x1Var16;
                                final g2 g2Var10 = g2Var9;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar11 = gVar10;
                                        x1 x1Var18 = x1Var17;
                                        g2 g2Var11 = g2Var10;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar11, x1Var18, g2Var11, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var10, gVar10, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var17, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i417;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z21111, z21112, textStyle9, keyboardOptions9, iVar9, z21113, i51, m0Var9, null, gVar9, solidColor, aVarB, pVar11114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11114, Integer num) {
                        a(pVar11114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var14;
                textStyle2 = textStyle8;
                z17 = z2118;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                }
                pVarF.T(1663543409);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR7 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr7 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11114 = pVar;
                final androidx.compose.ui.n nVar9 = nVar;
                final x1 x1Var15 = x1Var;
                final boolean z21110 = z12;
                final int i419 = i14;
                x1 x1Var16 = x1Var;
                TextStyle textStyle9 = textStyle;
                final boolean z21111 = z10;
                final boolean z21112 = z11;
                final KeyboardOptions keyboardOptions9 = keyboardOptions;
                boolean z21113 = z10;
                final androidx.compose.foundation.text.i iVar9 = iVar;
                final boolean z21114 = z13;
                final int i4110 = i10;
                final androidx.compose.ui.text.input.m0 m0Var9 = m0Var;
                final androidx.compose.foundation.interaction.g gVar9 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11115 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11116 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11117 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11118 = pVar5;
                final g2 g2Var9 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr7, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11119, int i4111) {
                        if ((i4111 & 11) == 2 && pVar11119.b()) {
                            pVar11119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-719341509, i4111, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                        }
                        androidx.compose.ui.n nVarO = pVar11114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar9, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar9;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var17 = x1Var15;
                        boolean z21115 = z21110;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var17.b(z21115, pVar11119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final TextFieldValue textFieldValue = value;
                        yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                        final boolean z21116 = z21111;
                        boolean z21117 = z21112;
                        TextStyle textStyle10 = textStyleR7;
                        KeyboardOptions keyboardOptions10 = keyboardOptions9;
                        androidx.compose.foundation.text.i iVar10 = iVar9;
                        final boolean z21118 = z21114;
                        int i51 = i4110;
                        final androidx.compose.ui.text.input.m0 m0Var10 = m0Var9;
                        final androidx.compose.foundation.interaction.g gVar10 = gVar9;
                        final boolean z21119 = z21110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar11114;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar11115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar11116;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar11117;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar11118;
                        final x1 x1Var18 = x1Var15;
                        final int i52 = i419;
                        final int i53 = i41;
                        final g2 g2Var10 = g2Var9;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar11119, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String strI = textFieldValue.i();
                                final boolean z30 = z21116;
                                boolean z31 = z21118;
                                androidx.compose.ui.text.input.m0 m0Var11 = m0Var10;
                                final androidx.compose.foundation.interaction.g gVar11 = gVar10;
                                final boolean z32 = z21119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var19 = x1Var18;
                                final g2 g2Var11 = g2Var10;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar12 = gVar11;
                                        x1 x1Var110 = x1Var19;
                                        g2 g2Var12 = g2Var11;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar12, x1Var110, g2Var12, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var11, gVar11, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var19, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i419;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z21116, z21117, textStyle10, keyboardOptions10, iVar10, z21118, i51, m0Var10, null, gVar10, solidColor, aVarB, pVar11119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11119, Integer num) {
                        a(pVar11119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var16;
                textStyle2 = textStyle9;
                z17 = z21113;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            }
            u1VarH = pVar8.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11119, int i4111) {
                    OutlinedTextFieldKt.a(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar11119, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11119, Integer num) {
                    a(pVar11119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i14 |= bb.c.b.f30966u4;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            if ((i11 & 458752) != 0) {
                if ((i13 & 32) == 0) {
                    i45 = 65536;
                } else {
                    i45 = 65536;
                }
                i14 |= i45;
            }
            i19 = i13 & 64;
            if (i19 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i14 |= i20;
            }
            i21 = i13 & 128;
            if (i21 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i14 |= i22;
            }
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i14 |= i24;
            }
            i25 = i13 & 512;
            if (i25 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.s(pVar4)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i14 |= i26;
            }
            i27 = i13 & 1024;
            if (i27 != 0) {
                i28 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i12 | i29;
            } else {
                i28 = i12;
            }
            i30 = i13 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i12 & 112) == 0) {
                if (pVarF.u(z12)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i13 & 4096;
            if (i33 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    if (pVarF.s(m0Var)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
                }
                if ((i12 & 57344) != 0) {
                    i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
                }
                i35 = i13 & 32768;
                if (i35 != 0) {
                    i32 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z13)) {
                        i36 = 131072;
                    } else {
                        i36 = 65536;
                    }
                    i32 |= i36;
                }
                i37 = i13 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i10)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i13 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (pVarF.s(gVar)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i12 & 234881024) != 0) {
                    if ((i13 & 262144) == 0) {
                        i44 = 33554432;
                    } else {
                        i44 = 33554432;
                    }
                    i32 |= i44;
                }
                if ((i12 & 1879048192) != 0) {
                    if ((i13 & 524288) == 0) {
                        i43 = 268435456;
                    } else {
                        i43 = 268435456;
                    }
                    i32 |= i43;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                    }
                    pVarF.T(1663543409);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR8 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr8 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11119 = pVar;
                    final androidx.compose.ui.n nVar10 = nVar;
                    final x1 x1Var17 = x1Var;
                    final boolean z21115 = z12;
                    final int i4111 = i14;
                    x1 x1Var18 = x1Var;
                    TextStyle textStyle10 = textStyle;
                    final boolean z21116 = z10;
                    final boolean z21117 = z11;
                    final KeyboardOptions keyboardOptions10 = keyboardOptions;
                    boolean z21118 = z10;
                    final androidx.compose.foundation.text.i iVar10 = iVar;
                    final boolean z21119 = z13;
                    final int i4112 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var10 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar10 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111110 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111112 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111113 = pVar5;
                    final g2 g2Var10 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr8, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i4113) {
                            if ((i4113 & 11) == 2 && pVar111114.b()) {
                                pVar111114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-719341509, i4113, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                            }
                            androidx.compose.ui.n nVarO = pVar11119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar10, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar10;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var19 = x1Var17;
                            boolean z211110 = z21115;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var19.b(z211110, pVar111114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final TextFieldValue textFieldValue = value;
                            yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                            final boolean z211111 = z21116;
                            boolean z211112 = z21117;
                            TextStyle textStyle11 = textStyleR8;
                            KeyboardOptions keyboardOptions11 = keyboardOptions10;
                            androidx.compose.foundation.text.i iVar11 = iVar10;
                            final boolean z211113 = z21119;
                            int i51 = i4112;
                            final androidx.compose.ui.text.input.m0 m0Var11 = m0Var10;
                            final androidx.compose.foundation.interaction.g gVar11 = gVar10;
                            final boolean z211114 = z21115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar11119;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar111110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111111;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111112;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar111113;
                            final x1 x1Var110 = x1Var17;
                            final int i52 = i4111;
                            final int i53 = i41;
                            final g2 g2Var11 = g2Var10;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar111114, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String strI = textFieldValue.i();
                                    final boolean z30 = z211111;
                                    boolean z31 = z211113;
                                    androidx.compose.ui.text.input.m0 m0Var12 = m0Var11;
                                    final androidx.compose.foundation.interaction.g gVar12 = gVar11;
                                    final boolean z32 = z211114;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var111 = x1Var110;
                                    final g2 g2Var12 = g2Var11;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar13 = gVar12;
                                            x1 x1Var112 = x1Var111;
                                            g2 g2Var13 = g2Var12;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar13, x1Var112, g2Var13, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var12, gVar12, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var111, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i4111;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z211111, z211112, textStyle11, keyboardOptions11, iVar11, z211113, i51, m0Var11, null, gVar11, solidColor, aVarB, pVar111114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                            a(pVar111114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var18;
                    textStyle2 = textStyle10;
                    z17 = z21118;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                    }
                    pVarF.T(1663543409);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR9 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr9 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111114 = pVar;
                    final androidx.compose.ui.n nVar11 = nVar;
                    final x1 x1Var19 = x1Var;
                    final boolean z211110 = z12;
                    final int i4113 = i14;
                    x1 x1Var110 = x1Var;
                    TextStyle textStyle11 = textStyle;
                    final boolean z211111 = z10;
                    final boolean z211112 = z11;
                    final KeyboardOptions keyboardOptions11 = keyboardOptions;
                    boolean z211113 = z10;
                    final androidx.compose.foundation.text.i iVar11 = iVar;
                    final boolean z211114 = z13;
                    final int i4114 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var11 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar11 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111115 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111116 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111117 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111118 = pVar5;
                    final g2 g2Var11 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr9, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111119, int i4115) {
                            if ((i4115 & 11) == 2 && pVar111119.b()) {
                                pVar111119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-719341509, i4115, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                            }
                            androidx.compose.ui.n nVarO = pVar111114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar11, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar11;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var111 = x1Var19;
                            boolean z211115 = z211110;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var111.b(z211115, pVar111119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final TextFieldValue textFieldValue = value;
                            yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                            final boolean z211116 = z211111;
                            boolean z211117 = z211112;
                            TextStyle textStyle12 = textStyleR9;
                            KeyboardOptions keyboardOptions12 = keyboardOptions11;
                            androidx.compose.foundation.text.i iVar12 = iVar11;
                            final boolean z211118 = z211114;
                            int i51 = i4114;
                            final androidx.compose.ui.text.input.m0 m0Var12 = m0Var11;
                            final androidx.compose.foundation.interaction.g gVar12 = gVar11;
                            final boolean z211119 = z211110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar111114;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar111115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111116;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111117;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar111118;
                            final x1 x1Var112 = x1Var19;
                            final int i52 = i4113;
                            final int i53 = i41;
                            final g2 g2Var12 = g2Var11;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar111119, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String strI = textFieldValue.i();
                                    final boolean z30 = z211116;
                                    boolean z31 = z211118;
                                    androidx.compose.ui.text.input.m0 m0Var13 = m0Var12;
                                    final androidx.compose.foundation.interaction.g gVar13 = gVar12;
                                    final boolean z32 = z211119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var113 = x1Var112;
                                    final g2 g2Var13 = g2Var12;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar14 = gVar13;
                                            x1 x1Var114 = x1Var113;
                                            g2 g2Var14 = g2Var13;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar14, x1Var114, g2Var14, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var13, gVar13, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var113, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i4113;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z211116, z211117, textStyle12, keyboardOptions12, iVar12, z211118, i51, m0Var12, null, gVar12, solidColor, aVarB, pVar111119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111119, Integer num) {
                            a(pVar111119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var110;
                    textStyle2 = textStyle11;
                    z17 = z211113;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                }
                u1VarH = pVar8.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111119, int i4115) {
                        OutlinedTextFieldKt.a(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar111119, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111119, Integer num) {
                        a(pVar111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i32 |= bb.c.b.f30966u4;
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
            }
            if ((i12 & 57344) != 0) {
                i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
            }
            i35 = i13 & 32768;
            if (i35 != 0) {
                i32 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z13)) {
                    i36 = 131072;
                } else {
                    i36 = 65536;
                }
                i32 |= i36;
            }
            i37 = i13 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i10)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i13 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (pVarF.s(gVar)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i12 & 234881024) != 0) {
                if ((i13 & 262144) == 0) {
                    i44 = 33554432;
                } else {
                    i44 = 33554432;
                }
                i32 |= i44;
            }
            if ((i12 & 1879048192) != 0) {
                if ((i13 & 524288) == 0) {
                    i43 = 268435456;
                } else {
                    i43 = 268435456;
                }
                i32 |= i43;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                }
                pVarF.T(1663543409);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR10 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr10 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111119 = pVar;
                final androidx.compose.ui.n nVar12 = nVar;
                final x1 x1Var111 = x1Var;
                final boolean z211115 = z12;
                final int i4115 = i14;
                x1 x1Var112 = x1Var;
                TextStyle textStyle12 = textStyle;
                final boolean z211116 = z10;
                final boolean z211117 = z11;
                final KeyboardOptions keyboardOptions12 = keyboardOptions;
                boolean z211118 = z10;
                final androidx.compose.foundation.text.i iVar12 = iVar;
                final boolean z211119 = z13;
                final int i4116 = i10;
                final androidx.compose.ui.text.input.m0 m0Var12 = m0Var;
                final androidx.compose.foundation.interaction.g gVar12 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111110 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111112 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111113 = pVar5;
                final g2 g2Var12 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr10, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i4117) {
                        if ((i4117 & 11) == 2 && pVar1111114.b()) {
                            pVar1111114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-719341509, i4117, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                        }
                        androidx.compose.ui.n nVarO = pVar111119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar12, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar12;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var113 = x1Var111;
                        boolean z2111110 = z211115;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var113.b(z2111110, pVar1111114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final TextFieldValue textFieldValue = value;
                        yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                        final boolean z2111111 = z211116;
                        boolean z2111112 = z211117;
                        TextStyle textStyle13 = textStyleR10;
                        KeyboardOptions keyboardOptions13 = keyboardOptions12;
                        androidx.compose.foundation.text.i iVar13 = iVar12;
                        final boolean z2111113 = z211119;
                        int i51 = i4116;
                        final androidx.compose.ui.text.input.m0 m0Var13 = m0Var12;
                        final androidx.compose.foundation.interaction.g gVar13 = gVar12;
                        final boolean z2111114 = z211115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar111119;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar1111110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar1111111;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar1111112;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar1111113;
                        final x1 x1Var114 = x1Var111;
                        final int i52 = i4115;
                        final int i53 = i41;
                        final g2 g2Var13 = g2Var12;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar1111114, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String strI = textFieldValue.i();
                                final boolean z30 = z2111111;
                                boolean z31 = z2111113;
                                androidx.compose.ui.text.input.m0 m0Var14 = m0Var13;
                                final androidx.compose.foundation.interaction.g gVar14 = gVar13;
                                final boolean z32 = z2111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var115 = x1Var114;
                                final g2 g2Var14 = g2Var13;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar15 = gVar14;
                                        x1 x1Var116 = x1Var115;
                                        g2 g2Var15 = g2Var14;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar15, x1Var116, g2Var15, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var14, gVar14, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var115, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i4115;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z2111111, z2111112, textStyle13, keyboardOptions13, iVar13, z2111113, i51, m0Var13, null, gVar13, solidColor, aVarB, pVar1111114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                        a(pVar1111114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var112;
                textStyle2 = textStyle12;
                z17 = z211118;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                }
                pVarF.T(1663543409);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR11 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr11 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111114 = pVar;
                final androidx.compose.ui.n nVar13 = nVar;
                final x1 x1Var113 = x1Var;
                final boolean z2111110 = z12;
                final int i4117 = i14;
                x1 x1Var114 = x1Var;
                TextStyle textStyle13 = textStyle;
                final boolean z2111111 = z10;
                final boolean z2111112 = z11;
                final KeyboardOptions keyboardOptions13 = keyboardOptions;
                boolean z2111113 = z10;
                final androidx.compose.foundation.text.i iVar13 = iVar;
                final boolean z2111114 = z13;
                final int i4118 = i10;
                final androidx.compose.ui.text.input.m0 m0Var13 = m0Var;
                final androidx.compose.foundation.interaction.g gVar13 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111115 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111116 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111117 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111118 = pVar5;
                final g2 g2Var13 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr11, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111119, int i4119) {
                        if ((i4119 & 11) == 2 && pVar1111119.b()) {
                            pVar1111119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-719341509, i4119, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                        }
                        androidx.compose.ui.n nVarO = pVar1111114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar13, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar13;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var115 = x1Var113;
                        boolean z2111115 = z2111110;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var115.b(z2111115, pVar1111119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final TextFieldValue textFieldValue = value;
                        yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                        final boolean z2111116 = z2111111;
                        boolean z2111117 = z2111112;
                        TextStyle textStyle14 = textStyleR11;
                        KeyboardOptions keyboardOptions14 = keyboardOptions13;
                        androidx.compose.foundation.text.i iVar14 = iVar13;
                        final boolean z2111118 = z2111114;
                        int i51 = i4118;
                        final androidx.compose.ui.text.input.m0 m0Var14 = m0Var13;
                        final androidx.compose.foundation.interaction.g gVar14 = gVar13;
                        final boolean z2111119 = z2111110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar1111114;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar1111115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar1111116;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar1111117;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar1111118;
                        final x1 x1Var116 = x1Var113;
                        final int i52 = i4117;
                        final int i53 = i41;
                        final g2 g2Var14 = g2Var13;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar1111119, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String strI = textFieldValue.i();
                                final boolean z30 = z2111116;
                                boolean z31 = z2111118;
                                androidx.compose.ui.text.input.m0 m0Var15 = m0Var14;
                                final androidx.compose.foundation.interaction.g gVar15 = gVar14;
                                final boolean z32 = z2111119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var117 = x1Var116;
                                final g2 g2Var15 = g2Var14;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar16 = gVar15;
                                        x1 x1Var118 = x1Var117;
                                        g2 g2Var16 = g2Var15;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar16, x1Var118, g2Var16, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var15, gVar15, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var117, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i4117;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z2111116, z2111117, textStyle14, keyboardOptions14, iVar14, z2111118, i51, m0Var14, null, gVar14, solidColor, aVarB, pVar1111119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111119, Integer num) {
                        a(pVar1111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var114;
                textStyle2 = textStyle13;
                z17 = z2111113;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            }
            u1VarH = pVar8.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1111119, int i4119) {
                    OutlinedTextFieldKt.a(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar1111119, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111119, Integer num) {
                    a(pVar1111119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i14 |= bb.c.d.f31193dj;
        i17 = i13 & 16;
        if (i17 != 0) {
            i14 |= 24576;
        } else if ((i11 & 57344) == 0) {
            if (pVarF.u(z11)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i14 |= i18;
        }
        if ((i11 & 458752) != 0) {
            if ((i13 & 32) == 0) {
                i45 = 65536;
            } else {
                i45 = 65536;
            }
            i14 |= i45;
        }
        i19 = i13 & 64;
        if (i19 != 0) {
            i14 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (pVarF.s(pVar)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i14 |= i20;
        }
        i21 = i13 & 128;
        if (i21 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (pVarF.s(pVar2)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i14 |= i22;
        }
        i23 = i13 & 256;
        if (i23 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 234881024) == 0) {
            if (pVarF.s(pVar3)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i14 |= i24;
        }
        i25 = i13 & 512;
        if (i25 != 0) {
            i14 |= com.google.android.exoplayer2.j.G;
        } else if ((i11 & 1879048192) == 0) {
            if (pVarF.s(pVar4)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i14 |= i26;
        }
        i27 = i13 & 1024;
        if (i27 != 0) {
            i28 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (pVarF.s(pVar5)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i28 = i12 | i29;
        } else {
            i28 = i12;
        }
        i30 = i13 & 2048;
        if (i30 != 0) {
            i28 |= 48;
        } else if ((i12 & 112) == 0) {
            if (pVarF.u(z12)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i28 |= i31;
        }
        i32 = i28;
        i33 = i13 & 4096;
        if (i33 != 0) {
            if ((i12 & bb.c.b.f30796me) == 0) {
                if (pVarF.s(m0Var)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i32 |= i34;
            }
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
            }
            if ((i12 & 57344) != 0) {
                i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
            }
            i35 = i13 & 32768;
            if (i35 != 0) {
                i32 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z13)) {
                    i36 = 131072;
                } else {
                    i36 = 65536;
                }
                i32 |= i36;
            }
            i37 = i13 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i10)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i13 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (pVarF.s(gVar)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i12 & 234881024) != 0) {
                if ((i13 & 262144) == 0) {
                    i44 = 33554432;
                } else {
                    i44 = 33554432;
                }
                i32 |= i44;
            }
            if ((i12 & 1879048192) != 0) {
                if ((i13 & 524288) == 0) {
                    i43 = 268435456;
                } else {
                    i43 = 268435456;
                }
                i32 |= i43;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                }
                pVarF.T(1663543409);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR12 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr12 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111119 = pVar;
                final androidx.compose.ui.n nVar14 = nVar;
                final x1 x1Var115 = x1Var;
                final boolean z2111115 = z12;
                final int i4119 = i14;
                x1 x1Var116 = x1Var;
                TextStyle textStyle14 = textStyle;
                final boolean z2111116 = z10;
                final boolean z2111117 = z11;
                final KeyboardOptions keyboardOptions14 = keyboardOptions;
                boolean z2111118 = z10;
                final androidx.compose.foundation.text.i iVar14 = iVar;
                final boolean z2111119 = z13;
                final int i41110 = i10;
                final androidx.compose.ui.text.input.m0 m0Var14 = m0Var;
                final androidx.compose.foundation.interaction.g gVar14 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111110 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111112 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111113 = pVar5;
                final g2 g2Var14 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr12, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111114, int i41111) {
                        if ((i41111 & 11) == 2 && pVar11111114.b()) {
                            pVar11111114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-719341509, i41111, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                        }
                        androidx.compose.ui.n nVarO = pVar1111119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar14, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar14;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var117 = x1Var115;
                        boolean z21111110 = z2111115;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var117.b(z21111110, pVar11111114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final TextFieldValue textFieldValue = value;
                        yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                        final boolean z21111111 = z2111116;
                        boolean z21111112 = z2111117;
                        TextStyle textStyle15 = textStyleR12;
                        KeyboardOptions keyboardOptions15 = keyboardOptions14;
                        androidx.compose.foundation.text.i iVar15 = iVar14;
                        final boolean z21111113 = z2111119;
                        int i51 = i41110;
                        final androidx.compose.ui.text.input.m0 m0Var15 = m0Var14;
                        final androidx.compose.foundation.interaction.g gVar15 = gVar14;
                        final boolean z21111114 = z2111115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar1111119;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar11111110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar11111111;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar11111112;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar11111113;
                        final x1 x1Var118 = x1Var115;
                        final int i52 = i4119;
                        final int i53 = i41;
                        final g2 g2Var15 = g2Var14;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar11111114, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String strI = textFieldValue.i();
                                final boolean z30 = z21111111;
                                boolean z31 = z21111113;
                                androidx.compose.ui.text.input.m0 m0Var16 = m0Var15;
                                final androidx.compose.foundation.interaction.g gVar16 = gVar15;
                                final boolean z32 = z21111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var119 = x1Var118;
                                final g2 g2Var16 = g2Var15;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar17 = gVar16;
                                        x1 x1Var1110 = x1Var119;
                                        g2 g2Var17 = g2Var16;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar17, x1Var1110, g2Var17, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var16, gVar16, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var119, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i4119;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z21111111, z21111112, textStyle15, keyboardOptions15, iVar15, z21111113, i51, m0Var15, null, gVar15, solidColor, aVarB, pVar11111114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111114, Integer num) {
                        a(pVar11111114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var116;
                textStyle2 = textStyle14;
                z17 = z2111118;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                }
                pVarF.T(1663543409);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR13 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr13 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111114 = pVar;
                final androidx.compose.ui.n nVar15 = nVar;
                final x1 x1Var117 = x1Var;
                final boolean z21111110 = z12;
                final int i41111 = i14;
                x1 x1Var118 = x1Var;
                TextStyle textStyle15 = textStyle;
                final boolean z21111111 = z10;
                final boolean z21111112 = z11;
                final KeyboardOptions keyboardOptions15 = keyboardOptions;
                boolean z21111113 = z10;
                final androidx.compose.foundation.text.i iVar15 = iVar;
                final boolean z21111114 = z13;
                final int i41112 = i10;
                final androidx.compose.ui.text.input.m0 m0Var15 = m0Var;
                final androidx.compose.foundation.interaction.g gVar15 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111115 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111116 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111117 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111118 = pVar5;
                final g2 g2Var15 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr13, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111119, int i41113) {
                        if ((i41113 & 11) == 2 && pVar11111119.b()) {
                            pVar11111119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-719341509, i41113, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                        }
                        androidx.compose.ui.n nVarO = pVar11111114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar15, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar15;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var119 = x1Var117;
                        boolean z21111115 = z21111110;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var119.b(z21111115, pVar11111119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final TextFieldValue textFieldValue = value;
                        yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                        final boolean z21111116 = z21111111;
                        boolean z21111117 = z21111112;
                        TextStyle textStyle16 = textStyleR13;
                        KeyboardOptions keyboardOptions16 = keyboardOptions15;
                        androidx.compose.foundation.text.i iVar16 = iVar15;
                        final boolean z21111118 = z21111114;
                        int i51 = i41112;
                        final androidx.compose.ui.text.input.m0 m0Var16 = m0Var15;
                        final androidx.compose.foundation.interaction.g gVar16 = gVar15;
                        final boolean z21111119 = z21111110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar11111114;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar11111115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar11111116;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar11111117;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar11111118;
                        final x1 x1Var1110 = x1Var117;
                        final int i52 = i41111;
                        final int i53 = i41;
                        final g2 g2Var16 = g2Var15;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar11111119, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String strI = textFieldValue.i();
                                final boolean z30 = z21111116;
                                boolean z31 = z21111118;
                                androidx.compose.ui.text.input.m0 m0Var17 = m0Var16;
                                final androidx.compose.foundation.interaction.g gVar17 = gVar16;
                                final boolean z32 = z21111119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var1111 = x1Var1110;
                                final g2 g2Var17 = g2Var16;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar18 = gVar17;
                                        x1 x1Var1112 = x1Var1111;
                                        g2 g2Var18 = g2Var17;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar18, x1Var1112, g2Var18, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var17, gVar17, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var1111, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i41111;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z21111116, z21111117, textStyle16, keyboardOptions16, iVar16, z21111118, i51, m0Var16, null, gVar16, solidColor, aVarB, pVar11111119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111119, Integer num) {
                        a(pVar11111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var118;
                textStyle2 = textStyle15;
                z17 = z21111113;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            }
            u1VarH = pVar8.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11111119, int i41113) {
                    OutlinedTextFieldKt.a(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar11111119, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111119, Integer num) {
                    a(pVar11111119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i32 |= bb.c.b.f30966u4;
        if ((i12 & bb.c.g.f32954lc) != 0) {
            i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
        }
        if ((i12 & 57344) != 0) {
            i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
        }
        i35 = i13 & 32768;
        if (i35 != 0) {
            i32 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i12 & 458752) == 0) {
            if (pVarF.u(z13)) {
                i36 = 131072;
            } else {
                i36 = 65536;
            }
            i32 |= i36;
        }
        i37 = i13 & 65536;
        if (i37 != 0) {
            i32 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (pVarF.y(i10)) {
                i38 = 1048576;
            } else {
                i38 = 524288;
            }
            i32 |= i38;
        }
        i39 = i13 & 131072;
        if (i39 != 0) {
            i32 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (pVarF.s(gVar)) {
                i40 = 8388608;
            } else {
                i40 = 4194304;
            }
            i32 |= i40;
        }
        if ((i12 & 234881024) != 0) {
            if ((i13 & 262144) == 0) {
                i44 = 33554432;
            } else {
                i44 = 33554432;
            }
            i32 |= i44;
        }
        if ((i12 & 1879048192) != 0) {
            if ((i13 & 524288) == 0) {
                i43 = 268435456;
            } else {
                i43 = 268435456;
            }
            i32 |= i43;
        }
        if ((i14 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i46 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar = nVar;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i17 != 0) {
                    z11 = false;
                } else {
                    z11 = z11;
                }
                if ((i13 & 32) != 0) {
                    textStyle = (TextStyle) pVarF.K(TextKt.d());
                    i14 &= -458753;
                } else {
                    textStyle = textStyle;
                }
                if (i19 != 0) {
                    pVar = null;
                } else {
                    pVar = pVar;
                }
                if (i21 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar2;
                }
                if (i23 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar4;
                }
                if (i27 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar5;
                }
                if (i30 != 0) {
                    z12 = false;
                } else {
                    z12 = z12;
                }
                if (i33 != 0) {
                    m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                } else {
                    m0Var = m0Var;
                }
                pVar3 = pVar7;
                if ((i13 & 8192) != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    i32 &= -7169;
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                keyboardOptions = keyboardOptionsA;
                if ((i13 & 16384) != 0) {
                    iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                    i32 &= -57345;
                } else {
                    iVarA = iVar;
                }
                if (i35 != 0) {
                    z13 = false;
                } else {
                    z13 = z13;
                }
                if (i37 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                iVar = iVarA;
                if (i39 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar = gVar;
                }
                if ((i13 & 262144) != 0) {
                    g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                    i32 &= -234881025;
                } else {
                    g2Var = g2Var;
                }
                if ((i13 & 524288) != 0) {
                    i41 = i32 & (-1879048193);
                    x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                } else {
                    i41 = i32;
                    x1Var = x1Var;
                }
                z10 = z14;
            } else {
                if (i46 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar = nVar;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i17 != 0) {
                    z11 = false;
                } else {
                    z11 = z11;
                }
                if ((i13 & 32) != 0) {
                    textStyle = (TextStyle) pVarF.K(TextKt.d());
                    i14 &= -458753;
                } else {
                    textStyle = textStyle;
                }
                if (i19 != 0) {
                    pVar = null;
                } else {
                    pVar = pVar;
                }
                if (i21 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar2;
                }
                if (i23 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar4;
                }
                if (i27 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar5;
                }
                if (i30 != 0) {
                    z12 = false;
                } else {
                    z12 = z12;
                }
                if (i33 != 0) {
                    m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                } else {
                    m0Var = m0Var;
                }
                pVar3 = pVar7;
                if ((i13 & 8192) != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    i32 &= -7169;
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                keyboardOptions = keyboardOptionsA;
                if ((i13 & 16384) != 0) {
                    iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                    i32 &= -57345;
                } else {
                    iVarA = iVar;
                }
                if (i35 != 0) {
                    z13 = false;
                } else {
                    z13 = z13;
                }
                if (i37 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                iVar = iVarA;
                if (i39 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar = gVar;
                }
                if ((i13 & 262144) != 0) {
                    g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                    i32 &= -234881025;
                } else {
                    g2Var = g2Var;
                }
                if ((i13 & 524288) != 0) {
                    i41 = i32 & (-1879048193);
                    x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                } else {
                    i41 = i32;
                    x1Var = x1Var;
                }
                z10 = z14;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
            }
            pVarF.T(1663543409);
            jP = textStyle.p();
            if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
            }
            pVarF.c0();
            final TextStyle textStyleR14 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
            androidx.compose.runtime.k1[] k1VarArr14 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111119 = pVar;
            final androidx.compose.ui.n nVar16 = nVar;
            final x1 x1Var119 = x1Var;
            final boolean z21111115 = z12;
            final int i41113 = i14;
            x1 x1Var1110 = x1Var;
            TextStyle textStyle16 = textStyle;
            final boolean z21111116 = z10;
            final boolean z21111117 = z11;
            final KeyboardOptions keyboardOptions16 = keyboardOptions;
            boolean z21111118 = z10;
            final androidx.compose.foundation.text.i iVar16 = iVar;
            final boolean z21111119 = z13;
            final int i41114 = i10;
            final androidx.compose.ui.text.input.m0 m0Var16 = m0Var;
            final androidx.compose.foundation.interaction.g gVar16 = gVar;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111110 = pVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111 = pVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111112 = pVar4;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111113 = pVar5;
            final g2 g2Var16 = g2Var;
            pVar8 = pVarF;
            CompositionLocalKt.b(k1VarArr14, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar111111114, int i41115) {
                    if ((i41115 & 11) == 2 && pVar111111114.b()) {
                        pVar111111114.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-719341509, i41115, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                    }
                    androidx.compose.ui.n nVarO = pVar11111119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar16, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                        public final void a(@dl.d r semantics) {
                            kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                            a(rVar);
                            return kotlin.b2.f124493a;
                        }
                    }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar16;
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                    androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                    x1 x1Var1111 = x1Var119;
                    boolean z211111110 = z21111115;
                    int i50 = i41;
                    SolidColor solidColor = new SolidColor(x1Var1111.b(z211111110, pVar111111114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                    final TextFieldValue textFieldValue = value;
                    yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                    final boolean z211111111 = z21111116;
                    boolean z211111112 = z21111117;
                    TextStyle textStyle17 = textStyleR14;
                    KeyboardOptions keyboardOptions17 = keyboardOptions16;
                    androidx.compose.foundation.text.i iVar17 = iVar16;
                    final boolean z211111113 = z21111119;
                    int i51 = i41114;
                    final androidx.compose.ui.text.input.m0 m0Var17 = m0Var16;
                    final androidx.compose.foundation.interaction.g gVar17 = gVar16;
                    final boolean z211111114 = z21111115;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar11111119;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar111111110;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111111111;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111111112;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar111111113;
                    final x1 x1Var1112 = x1Var119;
                    final int i52 = i41113;
                    final int i53 = i41;
                    final g2 g2Var17 = g2Var16;
                    androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar111111114, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                            int i55;
                            kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                            if ((i54 & 14) == 0) {
                                i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                            } else {
                                i55 = i54;
                            }
                            if ((i55 & 91) == 18 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                            }
                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                            String strI = textFieldValue.i();
                            final boolean z30 = z211111111;
                            boolean z31 = z211111113;
                            androidx.compose.ui.text.input.m0 m0Var18 = m0Var17;
                            final androidx.compose.foundation.interaction.g gVar18 = gVar17;
                            final boolean z32 = z211111114;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                            final x1 x1Var1113 = x1Var1112;
                            final g2 g2Var18 = g2Var17;
                            final int i56 = i52;
                            final int i57 = i53;
                            androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                    if ((i58 & 11) == 2 && pVar31.b()) {
                                        pVar31.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                    }
                                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                    boolean z33 = z30;
                                    boolean z34 = z32;
                                    androidx.compose.foundation.interaction.g gVar19 = gVar18;
                                    x1 x1Var1114 = x1Var1113;
                                    g2 g2Var19 = g2Var18;
                                    int i59 = 12582912 | ((i56 >> 9) & 14);
                                    int i60 = i57;
                                    textFieldDefaults3.b(z33, z34, gVar19, x1Var1114, g2Var19, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                    a(pVar31, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i58 = i52;
                            int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                            int i60 = i53;
                            textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var18, gVar18, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var1113, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                            a(pVar25, pVar26, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i54 = i41113;
                    int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                    int i56 = i41;
                    BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z211111111, z211111112, textStyle17, keyboardOptions17, iVar17, z211111113, i51, m0Var17, null, gVar17, solidColor, aVarB, pVar111111114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111114, Integer num) {
                    a(pVar111111114, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVar8, 56);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar;
            pVar9 = pVar2;
            pVar10 = pVar3;
            pVar11 = pVar4;
            pVar12 = pVar5;
            z16 = z12;
            m0Var2 = m0Var;
            keyboardOptions2 = keyboardOptions;
            iVar2 = iVar;
            gVar2 = gVar;
            g2Var2 = g2Var;
            x1Var2 = x1Var1110;
            textStyle2 = textStyle16;
            z17 = z21111118;
            z18 = z11;
            pVar13 = pVar;
            z19 = z13;
            i42 = i10;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i46 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar = nVar;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i17 != 0) {
                    z11 = false;
                } else {
                    z11 = z11;
                }
                if ((i13 & 32) != 0) {
                    textStyle = (TextStyle) pVarF.K(TextKt.d());
                    i14 &= -458753;
                } else {
                    textStyle = textStyle;
                }
                if (i19 != 0) {
                    pVar = null;
                } else {
                    pVar = pVar;
                }
                if (i21 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar2;
                }
                if (i23 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar4;
                }
                if (i27 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar5;
                }
                if (i30 != 0) {
                    z12 = false;
                } else {
                    z12 = z12;
                }
                if (i33 != 0) {
                    m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                } else {
                    m0Var = m0Var;
                }
                pVar3 = pVar7;
                if ((i13 & 8192) != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    i32 &= -7169;
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                keyboardOptions = keyboardOptionsA;
                if ((i13 & 16384) != 0) {
                    iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                    i32 &= -57345;
                } else {
                    iVarA = iVar;
                }
                if (i35 != 0) {
                    z13 = false;
                } else {
                    z13 = z13;
                }
                if (i37 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                iVar = iVarA;
                if (i39 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar = gVar;
                }
                if ((i13 & 262144) != 0) {
                    g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                    i32 &= -234881025;
                } else {
                    g2Var = g2Var;
                }
                if ((i13 & 524288) != 0) {
                    i41 = i32 & (-1879048193);
                    x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                } else {
                    i41 = i32;
                    x1Var = x1Var;
                }
                z10 = z14;
            } else {
                if (i46 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar = nVar;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i17 != 0) {
                    z11 = false;
                } else {
                    z11 = z11;
                }
                if ((i13 & 32) != 0) {
                    textStyle = (TextStyle) pVarF.K(TextKt.d());
                    i14 &= -458753;
                } else {
                    textStyle = textStyle;
                }
                if (i19 != 0) {
                    pVar = null;
                } else {
                    pVar = pVar;
                }
                if (i21 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar2;
                }
                if (i23 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar4;
                }
                if (i27 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar5;
                }
                if (i30 != 0) {
                    z12 = false;
                } else {
                    z12 = z12;
                }
                if (i33 != 0) {
                    m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                } else {
                    m0Var = m0Var;
                }
                pVar3 = pVar7;
                if ((i13 & 8192) != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    i32 &= -7169;
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                keyboardOptions = keyboardOptionsA;
                if ((i13 & 16384) != 0) {
                    iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                    i32 &= -57345;
                } else {
                    iVarA = iVar;
                }
                if (i35 != 0) {
                    z13 = false;
                } else {
                    z13 = z13;
                }
                if (i37 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                iVar = iVarA;
                if (i39 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar = gVar;
                }
                if ((i13 & 262144) != 0) {
                    g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                    i32 &= -234881025;
                } else {
                    g2Var = g2Var;
                }
                if ((i13 & 524288) != 0) {
                    i41 = i32 & (-1879048193);
                    x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                } else {
                    i41 = i32;
                    x1Var = x1Var;
                }
                z10 = z14;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1040237435, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
            }
            pVarF.T(1663543409);
            jP = textStyle.p();
            if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
            }
            pVarF.c0();
            final TextStyle textStyleR15 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
            androidx.compose.runtime.k1[] k1VarArr15 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111114 = pVar;
            final androidx.compose.ui.n nVar17 = nVar;
            final x1 x1Var1111 = x1Var;
            final boolean z211111110 = z12;
            final int i41115 = i14;
            x1 x1Var1112 = x1Var;
            TextStyle textStyle17 = textStyle;
            final boolean z211111111 = z10;
            final boolean z211111112 = z11;
            final KeyboardOptions keyboardOptions17 = keyboardOptions;
            boolean z211111113 = z10;
            final androidx.compose.foundation.text.i iVar17 = iVar;
            final boolean z211111114 = z13;
            final int i41116 = i10;
            final androidx.compose.ui.text.input.m0 m0Var17 = m0Var;
            final androidx.compose.foundation.interaction.g gVar17 = gVar;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111115 = pVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111116 = pVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111117 = pVar4;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111118 = pVar5;
            final g2 g2Var17 = g2Var;
            pVar8 = pVarF;
            CompositionLocalKt.b(k1VarArr15, androidx.compose.runtime.internal.b.b(pVar8, -719341509, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar111111119, int i41117) {
                    if ((i41117 & 11) == 2 && pVar111111119.b()) {
                        pVar111111119.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-719341509, i41117, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                    }
                    androidx.compose.ui.n nVarO = pVar111111114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar17, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.1
                        public final void a(@dl.d r semantics) {
                            kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                            a(rVar);
                            return kotlin.b2.f124493a;
                        }
                    }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar17;
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                    androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                    x1 x1Var1113 = x1Var1111;
                    boolean z211111115 = z211111110;
                    int i50 = i41;
                    SolidColor solidColor = new SolidColor(x1Var1113.b(z211111115, pVar111111119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                    final TextFieldValue textFieldValue = value;
                    yh.l<TextFieldValue, kotlin.b2> lVar = onValueChange;
                    final boolean z211111116 = z211111111;
                    boolean z211111117 = z211111112;
                    TextStyle textStyle18 = textStyleR15;
                    KeyboardOptions keyboardOptions18 = keyboardOptions17;
                    androidx.compose.foundation.text.i iVar18 = iVar17;
                    final boolean z211111118 = z211111114;
                    int i51 = i41116;
                    final androidx.compose.ui.text.input.m0 m0Var18 = m0Var17;
                    final androidx.compose.foundation.interaction.g gVar18 = gVar17;
                    final boolean z211111119 = z211111110;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar111111114;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar111111115;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111111116;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111111117;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar111111118;
                    final x1 x1Var1114 = x1Var1111;
                    final int i52 = i41115;
                    final int i53 = i41;
                    final g2 g2Var18 = g2Var17;
                    androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar111111119, 342910148, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                            int i55;
                            kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                            if ((i54 & 14) == 0) {
                                i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                            } else {
                                i55 = i54;
                            }
                            if ((i55 & 91) == 18 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(342910148, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                            }
                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                            String strI = textFieldValue.i();
                            final boolean z30 = z211111116;
                            boolean z31 = z211111118;
                            androidx.compose.ui.text.input.m0 m0Var19 = m0Var18;
                            final androidx.compose.foundation.interaction.g gVar19 = gVar18;
                            final boolean z32 = z211111119;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                            final x1 x1Var1115 = x1Var1114;
                            final g2 g2Var19 = g2Var18;
                            final int i56 = i52;
                            final int i57 = i53;
                            androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, 119108444, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                    if ((i58 & 11) == 2 && pVar31.b()) {
                                        pVar31.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(119108444, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                    }
                                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                    boolean z33 = z30;
                                    boolean z34 = z32;
                                    androidx.compose.foundation.interaction.g gVar110 = gVar19;
                                    x1 x1Var1116 = x1Var1115;
                                    g2 g2Var110 = g2Var19;
                                    int i59 = 12582912 | ((i56 >> 9) & 14);
                                    int i60 = i57;
                                    textFieldDefaults3.b(z33, z34, gVar110, x1Var1116, g2Var110, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                    a(pVar31, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i58 = i52;
                            int i59 = ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                            int i60 = i53;
                            textFieldDefaults2.c(strI, innerTextField, z30, z31, m0Var19, gVar19, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var1115, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), 221184 | ((i58 >> 27) & 14) | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                            a(pVar25, pVar26, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i54 = i41115;
                    int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                    int i56 = i41;
                    BasicTextFieldKt.a(textFieldValue, lVar, nVarG, z211111116, z211111117, textStyle18, keyboardOptions18, iVar18, z211111118, i51, m0Var18, null, gVar18, solidColor, aVarB, pVar111111119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111119, Integer num) {
                    a(pVar111111119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVar8, 56);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar;
            pVar9 = pVar2;
            pVar10 = pVar3;
            pVar11 = pVar4;
            pVar12 = pVar5;
            z16 = z12;
            m0Var2 = m0Var;
            keyboardOptions2 = keyboardOptions;
            iVar2 = iVar;
            gVar2 = gVar;
            g2Var2 = g2Var;
            x1Var2 = x1Var1112;
            textStyle2 = textStyle17;
            z17 = z211111113;
            z18 = z11;
            pVar13 = pVar;
            z19 = z13;
            i42 = i10;
        }
        u1VarH = pVar8.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar111111119, int i41117) {
                OutlinedTextFieldKt.a(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar111111119, i11 | 1, i12, i13);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111119, Integer num) {
                a(pVar111111119, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0141  */
    /* JADX WARN: Code duplicated, block: B:102:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157  */
    /* JADX WARN: Code duplicated, block: B:110:0x015d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0166  */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0190  */
    /* JADX WARN: Code duplicated, block: B:131:0x0194  */
    /* JADX WARN: Code duplicated, block: B:133:0x019c  */
    /* JADX WARN: Code duplicated, block: B:134:0x019f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01be  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x01db  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:171:0x0204  */
    /* JADX WARN: Code duplicated, block: B:172:0x020b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0213  */
    /* JADX WARN: Code duplicated, block: B:176:0x0219  */
    /* JADX WARN: Code duplicated, block: B:177:0x021c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0224  */
    /* JADX WARN: Code duplicated, block: B:182:0x022b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0233  */
    /* JADX WARN: Code duplicated, block: B:186:0x0239  */
    /* JADX WARN: Code duplicated, block: B:187:0x023c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0248  */
    /* JADX WARN: Code duplicated, block: B:193:0x024e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0257  */
    /* JADX WARN: Code duplicated, block: B:198:0x025c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0264  */
    /* JADX WARN: Code duplicated, block: B:203:0x026a  */
    /* JADX WARN: Code duplicated, block: B:206:0x0273  */
    /* JADX WARN: Code duplicated, block: B:208:0x0278  */
    /* JADX WARN: Code duplicated, block: B:211:0x0284  */
    /* JADX WARN: Code duplicated, block: B:217:0x02be  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:239:0x0344 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x0346  */
    /* JADX WARN: Code duplicated, block: B:241:0x0349  */
    /* JADX WARN: Code duplicated, block: B:243:0x034d  */
    /* JADX WARN: Code duplicated, block: B:244:0x034f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0353  */
    /* JADX WARN: Code duplicated, block: B:247:0x0356  */
    /* JADX WARN: Code duplicated, block: B:250:0x035c  */
    /* JADX WARN: Code duplicated, block: B:251:0x036c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0372  */
    /* JADX WARN: Code duplicated, block: B:255:0x0375  */
    /* JADX WARN: Code duplicated, block: B:257:0x0379  */
    /* JADX WARN: Code duplicated, block: B:258:0x037c  */
    /* JADX WARN: Code duplicated, block: B:260:0x0380  */
    /* JADX WARN: Code duplicated, block: B:261:0x0383  */
    /* JADX WARN: Code duplicated, block: B:263:0x0387  */
    /* JADX WARN: Code duplicated, block: B:264:0x038a  */
    /* JADX WARN: Code duplicated, block: B:266:0x038e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0391  */
    /* JADX WARN: Code duplicated, block: B:269:0x0395  */
    /* JADX WARN: Code duplicated, block: B:270:0x0397  */
    /* JADX WARN: Code duplicated, block: B:272:0x039b  */
    /* JADX WARN: Code duplicated, block: B:273:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:276:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:277:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:280:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:281:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:283:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:284:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:286:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:287:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:290:0x03de  */
    /* JADX WARN: Code duplicated, block: B:292:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:294:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:297:0x0407  */
    /* JADX WARN: Code duplicated, block: B:298:0x0415  */
    /* JADX WARN: Code duplicated, block: B:301:0x041d  */
    /* JADX WARN: Code duplicated, block: B:302:0x0487  */
    /* JADX WARN: Code duplicated, block: B:306:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:309:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:310:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:313:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:316:0x0589  */
    /* JADX WARN: Code duplicated, block: B:321:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x012a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0132  */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final String value, @dl.d final yh.l<? super String, kotlin.b2> onValueChange, @dl.e androidx.compose.ui.n nVar, boolean z10, boolean z11, @dl.e TextStyle textStyle, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5, boolean z12, @dl.e androidx.compose.ui.text.input.m0 m0Var, @dl.e KeyboardOptions keyboardOptions, @dl.e androidx.compose.foundation.text.i iVar, boolean z13, int i10, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e g2 g2Var, @dl.e x1 x1Var, @dl.e androidx.compose.runtime.p pVar6, final int i11, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z14;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7;
        KeyboardOptions keyboardOptionsA;
        androidx.compose.foundation.text.i iVarA;
        final int i41;
        Object objU;
        long jP;
        boolean z15;
        androidx.compose.runtime.p pVar8;
        final androidx.compose.ui.n nVar2;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12;
        final boolean z16;
        final androidx.compose.ui.text.input.m0 m0Var2;
        final KeyboardOptions keyboardOptions2;
        final androidx.compose.foundation.text.i iVar2;
        final androidx.compose.foundation.interaction.g gVar2;
        final g2 g2Var2;
        final x1 x1Var2;
        final TextStyle textStyle2;
        final boolean z17;
        final boolean z18;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13;
        final boolean z19;
        final int i42;
        androidx.compose.runtime.u1 u1VarH;
        int i43;
        int i44;
        int i45;
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(onValueChange, "onValueChange");
        androidx.compose.runtime.p pVarF = pVar6.F(534493230);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (pVarF.s(value) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= pVarF.s(onValueChange) ? 32 : 16;
        }
        int i46 = i13 & 4;
        if (i46 == 0) {
            if ((i11 & bb.c.b.f30796me) == 0) {
                i14 |= pVarF.s(nVar) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z10)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    i14 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    if (pVarF.u(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                if ((i11 & 458752) != 0) {
                    if ((i13 & 32) == 0 || !pVarF.s(textStyle)) {
                        i45 = 65536;
                    } else {
                        i45 = 131072;
                    }
                    i14 |= i45;
                }
                i19 = i13 & 64;
                if (i19 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (pVarF.s(pVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 128;
                if (i21 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (pVarF.s(pVar2)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (pVarF.s(pVar3)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 512;
                if (i25 != 0) {
                    i14 |= com.google.android.exoplayer2.j.G;
                } else if ((i11 & 1879048192) == 0) {
                    if (pVarF.s(pVar4)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 1024;
                if (i27 != 0) {
                    i28 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (pVarF.s(pVar5)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i12 | i29;
                } else {
                    i28 = i12;
                }
                i30 = i13 & 2048;
                if (i30 != 0) {
                    i28 |= 48;
                } else if ((i12 & 112) == 0) {
                    if (pVarF.u(z12)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i28 |= i31;
                }
                i32 = i28;
                i33 = i13 & 4096;
                if (i33 != 0) {
                    if ((i12 & bb.c.b.f30796me) == 0) {
                        if (pVarF.s(m0Var)) {
                            i34 = 256;
                        } else {
                            i34 = 128;
                        }
                        i32 |= i34;
                    }
                    if ((i12 & bb.c.g.f32954lc) != 0) {
                        i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
                    }
                    if ((i12 & 57344) != 0) {
                        i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
                    }
                    i35 = i13 & 32768;
                    if (i35 != 0) {
                        i32 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i12 & 458752) == 0) {
                        if (pVarF.u(z13)) {
                            i36 = 131072;
                        } else {
                            i36 = 65536;
                        }
                        i32 |= i36;
                    }
                    i37 = i13 & 65536;
                    if (i37 != 0) {
                        i32 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i10)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i32 |= i38;
                    }
                    i39 = i13 & 131072;
                    if (i39 != 0) {
                        i32 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (pVarF.s(gVar)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i32 |= i40;
                    }
                    if ((i12 & 234881024) != 0) {
                        if ((i13 & 262144) == 0 || !pVarF.s(g2Var)) {
                            i44 = 33554432;
                        } else {
                            i44 = 67108864;
                        }
                        i32 |= i44;
                    }
                    if ((i12 & 1879048192) != 0) {
                        if ((i13 & 524288) == 0 || !pVarF.s(x1Var)) {
                            i43 = 268435456;
                        } else {
                            i43 = 536870912;
                        }
                        i32 |= i43;
                    }
                    if ((i14 & 1533916891) != 306783378 && (1533916891 & i32) == 306783378 && pVarF.b()) {
                        pVarF.l();
                        nVar2 = nVar;
                        z17 = z10;
                        z18 = z11;
                        textStyle2 = textStyle;
                        pVar13 = pVar;
                        pVar9 = pVar2;
                        pVar11 = pVar4;
                        pVar12 = pVar5;
                        z16 = z12;
                        m0Var2 = m0Var;
                        keyboardOptions2 = keyboardOptions;
                        iVar2 = iVar;
                        z19 = z13;
                        i42 = i10;
                        gVar2 = gVar;
                        g2Var2 = g2Var;
                        x1Var2 = x1Var;
                        pVar8 = pVarF;
                        pVar10 = pVar3;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0 || pVarF.o()) {
                            if (i46 != 0) {
                                nVar = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar = nVar;
                            }
                            if (i15 != 0) {
                                z14 = true;
                            } else {
                                z14 = z10;
                            }
                            if (i17 != 0) {
                                z11 = false;
                            } else {
                                z11 = z11;
                            }
                            if ((i13 & 32) != 0) {
                                textStyle = (TextStyle) pVarF.K(TextKt.d());
                                i14 &= -458753;
                            } else {
                                textStyle = textStyle;
                            }
                            if (i19 != 0) {
                                pVar = null;
                            } else {
                                pVar = pVar;
                            }
                            if (i21 != 0) {
                                pVar2 = null;
                            } else {
                                pVar2 = pVar2;
                            }
                            if (i23 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i25 != 0) {
                                pVar4 = null;
                            } else {
                                pVar4 = pVar4;
                            }
                            if (i27 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar5;
                            }
                            if (i30 != 0) {
                                z12 = false;
                            } else {
                                z12 = z12;
                            }
                            if (i33 != 0) {
                                m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                            } else {
                                m0Var = m0Var;
                            }
                            pVar3 = pVar7;
                            if ((i13 & 8192) != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                i32 &= -7169;
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            keyboardOptions = keyboardOptionsA;
                            if ((i13 & 16384) != 0) {
                                iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                                i32 &= -57345;
                            } else {
                                iVarA = iVar;
                            }
                            if (i35 != 0) {
                                z13 = false;
                            } else {
                                z13 = z13;
                            }
                            if (i37 != 0) {
                                i10 = Integer.MAX_VALUE;
                            } else {
                                i10 = i10;
                            }
                            iVar = iVarA;
                            if (i39 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar = gVar;
                            }
                            if ((i13 & 262144) != 0) {
                                g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                                i32 &= -234881025;
                            } else {
                                g2Var = g2Var;
                            }
                            if ((i13 & 524288) != 0) {
                                i41 = i32 & (-1879048193);
                                x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                            } else {
                                i41 = i32;
                                x1Var = x1Var;
                            }
                            z10 = z14;
                        } else {
                            pVarF.l();
                            if ((i13 & 32) != 0) {
                                i14 &= -458753;
                            }
                            if ((i13 & 8192) != 0) {
                                i32 &= -7169;
                            }
                            if ((i13 & 16384) != 0) {
                                i32 &= -57345;
                            }
                            if ((i13 & 262144) != 0) {
                                i32 &= -234881025;
                            }
                            i41 = (i13 & 524288) != 0 ? (-1879048193) & i32 : i32;
                            i14 = i14;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                        }
                        pVarF.T(1663535219);
                        jP = textStyle.p();
                        if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                        }
                        pVarF.c0();
                        final TextStyle textStyleR = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                        androidx.compose.runtime.k1[] k1VarArr = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar;
                        final androidx.compose.ui.n nVar3 = nVar;
                        final x1 x1Var3 = x1Var;
                        final boolean z20 = z12;
                        final int i47 = i14;
                        x1 x1Var4 = x1Var;
                        TextStyle textStyle3 = textStyle;
                        final boolean z21 = z10;
                        final boolean z22 = z11;
                        final KeyboardOptions keyboardOptions3 = keyboardOptions;
                        boolean z23 = z10;
                        final androidx.compose.foundation.text.i iVar3 = iVar;
                        final boolean z24 = z13;
                        final int i48 = i10;
                        final androidx.compose.ui.text.input.m0 m0Var3 = m0Var;
                        final androidx.compose.foundation.interaction.g gVar3 = gVar;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar2;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar3;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar4;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar5;
                        final g2 g2Var3 = g2Var;
                        pVar8 = pVarF;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar19, int i49) {
                                if ((i49 & 11) == 2 && pVar19.b()) {
                                    pVar19.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1801753362, i49, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                                }
                                androidx.compose.ui.n nVarO = pVar14 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar3, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                                    public final void a(@dl.d r semantics) {
                                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar3;
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                                androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                                x1 x1Var5 = x1Var3;
                                boolean z25 = z20;
                                int i50 = i41;
                                SolidColor solidColor = new SolidColor(x1Var5.b(z25, pVar19, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                                final String str = value;
                                yh.l<String, kotlin.b2> lVar = onValueChange;
                                final boolean z26 = z21;
                                boolean z27 = z22;
                                TextStyle textStyle4 = textStyleR;
                                KeyboardOptions keyboardOptions4 = keyboardOptions3;
                                androidx.compose.foundation.text.i iVar4 = iVar3;
                                final boolean z28 = z24;
                                int i51 = i48;
                                final androidx.compose.ui.text.input.m0 m0Var4 = m0Var3;
                                final androidx.compose.foundation.interaction.g gVar4 = gVar3;
                                final boolean z29 = z20;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar20 = pVar14;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar21 = pVar15;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar22 = pVar16;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar23 = pVar17;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar24 = pVar18;
                                final x1 x1Var6 = x1Var3;
                                final int i52 = i47;
                                final int i53 = i41;
                                final g2 g2Var4 = g2Var3;
                                androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar19, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                        int i55;
                                        kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                        if ((i54 & 14) == 0) {
                                            i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                        } else {
                                            i55 = i54;
                                        }
                                        if ((i55 & 91) == 18 && pVar25.b()) {
                                            pVar25.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                        }
                                        TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                        String str2 = str;
                                        final boolean z30 = z26;
                                        boolean z31 = z28;
                                        androidx.compose.ui.text.input.m0 m0Var5 = m0Var4;
                                        final androidx.compose.foundation.interaction.g gVar5 = gVar4;
                                        final boolean z32 = z29;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                        final x1 x1Var7 = x1Var6;
                                        final g2 g2Var5 = g2Var4;
                                        final int i56 = i52;
                                        final int i57 = i53;
                                        androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                                if ((i58 & 11) == 2 && pVar31.b()) {
                                                    pVar31.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                                }
                                                TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                                boolean z33 = z30;
                                                boolean z34 = z32;
                                                androidx.compose.foundation.interaction.g gVar6 = gVar5;
                                                x1 x1Var8 = x1Var7;
                                                g2 g2Var6 = g2Var5;
                                                int i59 = 12582912 | ((i56 >> 9) & 14);
                                                int i60 = i57;
                                                textFieldDefaults3.b(z33, z34, gVar6, x1Var8, g2Var6, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                                a(pVar31, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        });
                                        int i58 = i52;
                                        int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                        int i60 = i53;
                                        textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var5, gVar5, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var7, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                        a(pVar25, pVar26, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i54 = i47;
                                int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                                int i56 = i41;
                                BasicTextFieldKt.b(str, lVar, nVarG, z26, z27, textStyle4, keyboardOptions4, iVar4, z28, i51, m0Var4, null, gVar4, solidColor, aVarB, pVar19, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                                a(pVar19, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar8, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar2 = nVar;
                        pVar9 = pVar2;
                        pVar10 = pVar3;
                        pVar11 = pVar4;
                        pVar12 = pVar5;
                        z16 = z12;
                        m0Var2 = m0Var;
                        keyboardOptions2 = keyboardOptions;
                        iVar2 = iVar;
                        gVar2 = gVar;
                        g2Var2 = g2Var;
                        x1Var2 = x1Var4;
                        textStyle2 = textStyle3;
                        z17 = z23;
                        z18 = z11;
                        pVar13 = pVar;
                        z19 = z13;
                        i42 = i10;
                    }
                    u1VarH = pVar8.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar19, int i49) {
                            OutlinedTextFieldKt.b(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar19, i11 | 1, i12, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                            a(pVar19, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i32 |= bb.c.b.f30966u4;
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
                }
                if ((i12 & 57344) != 0) {
                    i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
                }
                i35 = i13 & 32768;
                if (i35 != 0) {
                    i32 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z13)) {
                        i36 = 131072;
                    } else {
                        i36 = 65536;
                    }
                    i32 |= i36;
                }
                i37 = i13 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i10)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i13 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (pVarF.s(gVar)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i12 & 234881024) != 0) {
                    if ((i13 & 262144) == 0) {
                        i44 = 33554432;
                    } else {
                        i44 = 33554432;
                    }
                    i32 |= i44;
                }
                if ((i12 & 1879048192) != 0) {
                    if ((i13 & 524288) == 0) {
                        i43 = 268435456;
                    } else {
                        i43 = 268435456;
                    }
                    i32 |= i43;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                    }
                    pVarF.T(1663535219);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR2 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr2 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar;
                    final androidx.compose.ui.n nVar4 = nVar;
                    final x1 x1Var5 = x1Var;
                    final boolean z25 = z12;
                    final int i49 = i14;
                    x1 x1Var6 = x1Var;
                    TextStyle textStyle4 = textStyle;
                    final boolean z26 = z10;
                    final boolean z27 = z11;
                    final KeyboardOptions keyboardOptions4 = keyboardOptions;
                    boolean z28 = z10;
                    final androidx.compose.foundation.text.i iVar4 = iVar;
                    final boolean z29 = z13;
                    final int i410 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var4 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar4 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar5;
                    final g2 g2Var4 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr2, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar114, int i411) {
                            if ((i411 & 11) == 2 && pVar114.b()) {
                                pVar114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1801753362, i411, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                            }
                            androidx.compose.ui.n nVarO = pVar19 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar4, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar4;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var7 = x1Var5;
                            boolean z210 = z25;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var7.b(z210, pVar114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final String str = value;
                            yh.l<String, kotlin.b2> lVar = onValueChange;
                            final boolean z211 = z26;
                            boolean z212 = z27;
                            TextStyle textStyle5 = textStyleR2;
                            KeyboardOptions keyboardOptions5 = keyboardOptions4;
                            androidx.compose.foundation.text.i iVar5 = iVar4;
                            final boolean z213 = z29;
                            int i51 = i410;
                            final androidx.compose.ui.text.input.m0 m0Var5 = m0Var4;
                            final androidx.compose.foundation.interaction.g gVar5 = gVar4;
                            final boolean z214 = z25;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar19;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar112;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar113;
                            final x1 x1Var8 = x1Var5;
                            final int i52 = i49;
                            final int i53 = i41;
                            final g2 g2Var5 = g2Var4;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar114, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String str2 = str;
                                    final boolean z30 = z211;
                                    boolean z31 = z213;
                                    androidx.compose.ui.text.input.m0 m0Var6 = m0Var5;
                                    final androidx.compose.foundation.interaction.g gVar6 = gVar5;
                                    final boolean z32 = z214;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var9 = x1Var8;
                                    final g2 g2Var6 = g2Var5;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar7 = gVar6;
                                            x1 x1Var10 = x1Var9;
                                            g2 g2Var7 = g2Var6;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar7, x1Var10, g2Var7, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var6, gVar6, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var9, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i49;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.b(str, lVar, nVarG, z211, z212, textStyle5, keyboardOptions5, iVar5, z213, i51, m0Var5, null, gVar5, solidColor, aVarB, pVar114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                            a(pVar114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var6;
                    textStyle2 = textStyle4;
                    z17 = z28;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                    }
                    pVarF.T(1663535219);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR3 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr3 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = pVar;
                    final androidx.compose.ui.n nVar5 = nVar;
                    final x1 x1Var7 = x1Var;
                    final boolean z210 = z12;
                    final int i411 = i14;
                    x1 x1Var8 = x1Var;
                    TextStyle textStyle5 = textStyle;
                    final boolean z211 = z10;
                    final boolean z212 = z11;
                    final KeyboardOptions keyboardOptions5 = keyboardOptions;
                    boolean z213 = z10;
                    final androidx.compose.foundation.text.i iVar5 = iVar;
                    final boolean z214 = z13;
                    final int i412 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var5 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar5 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar118 = pVar5;
                    final g2 g2Var5 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr3, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar119, int i413) {
                            if ((i413 & 11) == 2 && pVar119.b()) {
                                pVar119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1801753362, i413, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                            }
                            androidx.compose.ui.n nVarO = pVar114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar5, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar5;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var9 = x1Var7;
                            boolean z215 = z210;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var9.b(z215, pVar119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final String str = value;
                            yh.l<String, kotlin.b2> lVar = onValueChange;
                            final boolean z216 = z211;
                            boolean z217 = z212;
                            TextStyle textStyle6 = textStyleR3;
                            KeyboardOptions keyboardOptions6 = keyboardOptions5;
                            androidx.compose.foundation.text.i iVar6 = iVar5;
                            final boolean z218 = z214;
                            int i51 = i412;
                            final androidx.compose.ui.text.input.m0 m0Var6 = m0Var5;
                            final androidx.compose.foundation.interaction.g gVar6 = gVar5;
                            final boolean z219 = z210;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar114;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar116;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar117;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar118;
                            final x1 x1Var10 = x1Var7;
                            final int i52 = i411;
                            final int i53 = i41;
                            final g2 g2Var6 = g2Var5;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar119, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String str2 = str;
                                    final boolean z30 = z216;
                                    boolean z31 = z218;
                                    androidx.compose.ui.text.input.m0 m0Var7 = m0Var6;
                                    final androidx.compose.foundation.interaction.g gVar7 = gVar6;
                                    final boolean z32 = z219;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var11 = x1Var10;
                                    final g2 g2Var7 = g2Var6;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar8 = gVar7;
                                            x1 x1Var12 = x1Var11;
                                            g2 g2Var8 = g2Var7;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar8, x1Var12, g2Var8, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var7, gVar7, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var11, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i411;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.b(str, lVar, nVarG, z216, z217, textStyle6, keyboardOptions6, iVar6, z218, i51, m0Var6, null, gVar6, solidColor, aVarB, pVar119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar119, Integer num) {
                            a(pVar119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var8;
                    textStyle2 = textStyle5;
                    z17 = z213;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                }
                u1VarH = pVar8.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar119, int i413) {
                        OutlinedTextFieldKt.b(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar119, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar119, Integer num) {
                        a(pVar119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            if ((i11 & 458752) != 0) {
                if ((i13 & 32) == 0) {
                    i45 = 65536;
                } else {
                    i45 = 65536;
                }
                i14 |= i45;
            }
            i19 = i13 & 64;
            if (i19 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i14 |= i20;
            }
            i21 = i13 & 128;
            if (i21 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i14 |= i22;
            }
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i14 |= i24;
            }
            i25 = i13 & 512;
            if (i25 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.s(pVar4)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i14 |= i26;
            }
            i27 = i13 & 1024;
            if (i27 != 0) {
                i28 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i12 | i29;
            } else {
                i28 = i12;
            }
            i30 = i13 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i12 & 112) == 0) {
                if (pVarF.u(z12)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i13 & 4096;
            if (i33 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    if (pVarF.s(m0Var)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
                }
                if ((i12 & 57344) != 0) {
                    i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
                }
                i35 = i13 & 32768;
                if (i35 != 0) {
                    i32 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z13)) {
                        i36 = 131072;
                    } else {
                        i36 = 65536;
                    }
                    i32 |= i36;
                }
                i37 = i13 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i10)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i13 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (pVarF.s(gVar)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i12 & 234881024) != 0) {
                    if ((i13 & 262144) == 0) {
                        i44 = 33554432;
                    } else {
                        i44 = 33554432;
                    }
                    i32 |= i44;
                }
                if ((i12 & 1879048192) != 0) {
                    if ((i13 & 524288) == 0) {
                        i43 = 268435456;
                    } else {
                        i43 = 268435456;
                    }
                    i32 |= i43;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                    }
                    pVarF.T(1663535219);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR4 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr4 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVar;
                    final androidx.compose.ui.n nVar6 = nVar;
                    final x1 x1Var9 = x1Var;
                    final boolean z215 = z12;
                    final int i413 = i14;
                    x1 x1Var10 = x1Var;
                    TextStyle textStyle6 = textStyle;
                    final boolean z216 = z10;
                    final boolean z217 = z11;
                    final KeyboardOptions keyboardOptions6 = keyboardOptions;
                    boolean z218 = z10;
                    final androidx.compose.foundation.text.i iVar6 = iVar;
                    final boolean z219 = z13;
                    final int i414 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var6 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar6 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1110 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1112 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar5;
                    final g2 g2Var6 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr4, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i415) {
                            if ((i415 & 11) == 2 && pVar1114.b()) {
                                pVar1114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1801753362, i415, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                            }
                            androidx.compose.ui.n nVarO = pVar119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar6, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar6;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var11 = x1Var9;
                            boolean z2110 = z215;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var11.b(z2110, pVar1114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final String str = value;
                            yh.l<String, kotlin.b2> lVar = onValueChange;
                            final boolean z2111 = z216;
                            boolean z2112 = z217;
                            TextStyle textStyle7 = textStyleR4;
                            KeyboardOptions keyboardOptions7 = keyboardOptions6;
                            androidx.compose.foundation.text.i iVar7 = iVar6;
                            final boolean z2113 = z219;
                            int i51 = i414;
                            final androidx.compose.ui.text.input.m0 m0Var7 = m0Var6;
                            final androidx.compose.foundation.interaction.g gVar7 = gVar6;
                            final boolean z2114 = z215;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar119;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar1110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar1111;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar1112;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar1113;
                            final x1 x1Var12 = x1Var9;
                            final int i52 = i413;
                            final int i53 = i41;
                            final g2 g2Var7 = g2Var6;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar1114, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String str2 = str;
                                    final boolean z30 = z2111;
                                    boolean z31 = z2113;
                                    androidx.compose.ui.text.input.m0 m0Var8 = m0Var7;
                                    final androidx.compose.foundation.interaction.g gVar8 = gVar7;
                                    final boolean z32 = z2114;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var13 = x1Var12;
                                    final g2 g2Var8 = g2Var7;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar9 = gVar8;
                                            x1 x1Var14 = x1Var13;
                                            g2 g2Var9 = g2Var8;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar9, x1Var14, g2Var9, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var8, gVar8, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var13, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i413;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.b(str, lVar, nVarG, z2111, z2112, textStyle7, keyboardOptions7, iVar7, z2113, i51, m0Var7, null, gVar7, solidColor, aVarB, pVar1114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                            a(pVar1114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var10;
                    textStyle2 = textStyle6;
                    z17 = z218;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                    }
                    pVarF.T(1663535219);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR5 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr5 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1114 = pVar;
                    final androidx.compose.ui.n nVar7 = nVar;
                    final x1 x1Var11 = x1Var;
                    final boolean z2110 = z12;
                    final int i415 = i14;
                    x1 x1Var12 = x1Var;
                    TextStyle textStyle7 = textStyle;
                    final boolean z2111 = z10;
                    final boolean z2112 = z11;
                    final KeyboardOptions keyboardOptions7 = keyboardOptions;
                    boolean z2113 = z10;
                    final androidx.compose.foundation.text.i iVar7 = iVar;
                    final boolean z2114 = z13;
                    final int i416 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var7 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar7 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1116 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1117 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1118 = pVar5;
                    final g2 g2Var7 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr5, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1119, int i417) {
                            if ((i417 & 11) == 2 && pVar1119.b()) {
                                pVar1119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1801753362, i417, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                            }
                            androidx.compose.ui.n nVarO = pVar1114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar7, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar7;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var13 = x1Var11;
                            boolean z2115 = z2110;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var13.b(z2115, pVar1119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final String str = value;
                            yh.l<String, kotlin.b2> lVar = onValueChange;
                            final boolean z2116 = z2111;
                            boolean z2117 = z2112;
                            TextStyle textStyle8 = textStyleR5;
                            KeyboardOptions keyboardOptions8 = keyboardOptions7;
                            androidx.compose.foundation.text.i iVar8 = iVar7;
                            final boolean z2118 = z2114;
                            int i51 = i416;
                            final androidx.compose.ui.text.input.m0 m0Var8 = m0Var7;
                            final androidx.compose.foundation.interaction.g gVar8 = gVar7;
                            final boolean z2119 = z2110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar1114;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar1115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar1116;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar1117;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar1118;
                            final x1 x1Var14 = x1Var11;
                            final int i52 = i415;
                            final int i53 = i41;
                            final g2 g2Var8 = g2Var7;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar1119, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String str2 = str;
                                    final boolean z30 = z2116;
                                    boolean z31 = z2118;
                                    androidx.compose.ui.text.input.m0 m0Var9 = m0Var8;
                                    final androidx.compose.foundation.interaction.g gVar9 = gVar8;
                                    final boolean z32 = z2119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var15 = x1Var14;
                                    final g2 g2Var9 = g2Var8;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar10 = gVar9;
                                            x1 x1Var16 = x1Var15;
                                            g2 g2Var10 = g2Var9;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar10, x1Var16, g2Var10, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var9, gVar9, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var15, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i415;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.b(str, lVar, nVarG, z2116, z2117, textStyle8, keyboardOptions8, iVar8, z2118, i51, m0Var8, null, gVar8, solidColor, aVarB, pVar1119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1119, Integer num) {
                            a(pVar1119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var12;
                    textStyle2 = textStyle7;
                    z17 = z2113;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                }
                u1VarH = pVar8.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar1119, int i417) {
                        OutlinedTextFieldKt.b(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar1119, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1119, Integer num) {
                        a(pVar1119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i32 |= bb.c.b.f30966u4;
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
            }
            if ((i12 & 57344) != 0) {
                i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
            }
            i35 = i13 & 32768;
            if (i35 != 0) {
                i32 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z13)) {
                    i36 = 131072;
                } else {
                    i36 = 65536;
                }
                i32 |= i36;
            }
            i37 = i13 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i10)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i13 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (pVarF.s(gVar)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i12 & 234881024) != 0) {
                if ((i13 & 262144) == 0) {
                    i44 = 33554432;
                } else {
                    i44 = 33554432;
                }
                i32 |= i44;
            }
            if ((i12 & 1879048192) != 0) {
                if ((i13 & 524288) == 0) {
                    i43 = 268435456;
                } else {
                    i43 = 268435456;
                }
                i32 |= i43;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                }
                pVarF.T(1663535219);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR6 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr6 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1119 = pVar;
                final androidx.compose.ui.n nVar8 = nVar;
                final x1 x1Var13 = x1Var;
                final boolean z2115 = z12;
                final int i417 = i14;
                x1 x1Var14 = x1Var;
                TextStyle textStyle8 = textStyle;
                final boolean z2116 = z10;
                final boolean z2117 = z11;
                final KeyboardOptions keyboardOptions8 = keyboardOptions;
                boolean z2118 = z10;
                final androidx.compose.foundation.text.i iVar8 = iVar;
                final boolean z2119 = z13;
                final int i418 = i10;
                final androidx.compose.ui.text.input.m0 m0Var8 = m0Var;
                final androidx.compose.foundation.interaction.g gVar8 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11110 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11112 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11113 = pVar5;
                final g2 g2Var8 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr6, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11114, int i419) {
                        if ((i419 & 11) == 2 && pVar11114.b()) {
                            pVar11114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1801753362, i419, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                        }
                        androidx.compose.ui.n nVarO = pVar1119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar8, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar8;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var15 = x1Var13;
                        boolean z21110 = z2115;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var15.b(z21110, pVar11114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final String str = value;
                        yh.l<String, kotlin.b2> lVar = onValueChange;
                        final boolean z21111 = z2116;
                        boolean z21112 = z2117;
                        TextStyle textStyle9 = textStyleR6;
                        KeyboardOptions keyboardOptions9 = keyboardOptions8;
                        androidx.compose.foundation.text.i iVar9 = iVar8;
                        final boolean z21113 = z2119;
                        int i51 = i418;
                        final androidx.compose.ui.text.input.m0 m0Var9 = m0Var8;
                        final androidx.compose.foundation.interaction.g gVar9 = gVar8;
                        final boolean z21114 = z2115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar1119;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar11110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar11111;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar11112;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar11113;
                        final x1 x1Var16 = x1Var13;
                        final int i52 = i417;
                        final int i53 = i41;
                        final g2 g2Var9 = g2Var8;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar11114, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String str2 = str;
                                final boolean z30 = z21111;
                                boolean z31 = z21113;
                                androidx.compose.ui.text.input.m0 m0Var10 = m0Var9;
                                final androidx.compose.foundation.interaction.g gVar10 = gVar9;
                                final boolean z32 = z21114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var17 = x1Var16;
                                final g2 g2Var10 = g2Var9;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar11 = gVar10;
                                        x1 x1Var18 = x1Var17;
                                        g2 g2Var11 = g2Var10;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar11, x1Var18, g2Var11, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var10, gVar10, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var17, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i417;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.b(str, lVar, nVarG, z21111, z21112, textStyle9, keyboardOptions9, iVar9, z21113, i51, m0Var9, null, gVar9, solidColor, aVarB, pVar11114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11114, Integer num) {
                        a(pVar11114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var14;
                textStyle2 = textStyle8;
                z17 = z2118;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                }
                pVarF.T(1663535219);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR7 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr7 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11114 = pVar;
                final androidx.compose.ui.n nVar9 = nVar;
                final x1 x1Var15 = x1Var;
                final boolean z21110 = z12;
                final int i419 = i14;
                x1 x1Var16 = x1Var;
                TextStyle textStyle9 = textStyle;
                final boolean z21111 = z10;
                final boolean z21112 = z11;
                final KeyboardOptions keyboardOptions9 = keyboardOptions;
                boolean z21113 = z10;
                final androidx.compose.foundation.text.i iVar9 = iVar;
                final boolean z21114 = z13;
                final int i4110 = i10;
                final androidx.compose.ui.text.input.m0 m0Var9 = m0Var;
                final androidx.compose.foundation.interaction.g gVar9 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11115 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11116 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11117 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11118 = pVar5;
                final g2 g2Var9 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr7, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11119, int i4111) {
                        if ((i4111 & 11) == 2 && pVar11119.b()) {
                            pVar11119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1801753362, i4111, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                        }
                        androidx.compose.ui.n nVarO = pVar11114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar9, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar9;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var17 = x1Var15;
                        boolean z21115 = z21110;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var17.b(z21115, pVar11119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final String str = value;
                        yh.l<String, kotlin.b2> lVar = onValueChange;
                        final boolean z21116 = z21111;
                        boolean z21117 = z21112;
                        TextStyle textStyle10 = textStyleR7;
                        KeyboardOptions keyboardOptions10 = keyboardOptions9;
                        androidx.compose.foundation.text.i iVar10 = iVar9;
                        final boolean z21118 = z21114;
                        int i51 = i4110;
                        final androidx.compose.ui.text.input.m0 m0Var10 = m0Var9;
                        final androidx.compose.foundation.interaction.g gVar10 = gVar9;
                        final boolean z21119 = z21110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar11114;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar11115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar11116;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar11117;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar11118;
                        final x1 x1Var18 = x1Var15;
                        final int i52 = i419;
                        final int i53 = i41;
                        final g2 g2Var10 = g2Var9;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar11119, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String str2 = str;
                                final boolean z30 = z21116;
                                boolean z31 = z21118;
                                androidx.compose.ui.text.input.m0 m0Var11 = m0Var10;
                                final androidx.compose.foundation.interaction.g gVar11 = gVar10;
                                final boolean z32 = z21119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var19 = x1Var18;
                                final g2 g2Var11 = g2Var10;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar12 = gVar11;
                                        x1 x1Var110 = x1Var19;
                                        g2 g2Var12 = g2Var11;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar12, x1Var110, g2Var12, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var11, gVar11, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var19, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i419;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.b(str, lVar, nVarG, z21116, z21117, textStyle10, keyboardOptions10, iVar10, z21118, i51, m0Var10, null, gVar10, solidColor, aVarB, pVar11119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11119, Integer num) {
                        a(pVar11119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var16;
                textStyle2 = textStyle9;
                z17 = z21113;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            }
            u1VarH = pVar8.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11119, int i4111) {
                    OutlinedTextFieldKt.b(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar11119, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11119, Integer num) {
                    a(pVar11119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i14 |= bb.c.b.f30966u4;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z10)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                i14 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (pVarF.u(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            if ((i11 & 458752) != 0) {
                if ((i13 & 32) == 0) {
                    i45 = 65536;
                } else {
                    i45 = 65536;
                }
                i14 |= i45;
            }
            i19 = i13 & 64;
            if (i19 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(pVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i14 |= i20;
            }
            i21 = i13 & 128;
            if (i21 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(pVar2)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i14 |= i22;
            }
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(pVar3)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i14 |= i24;
            }
            i25 = i13 & 512;
            if (i25 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.s(pVar4)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i14 |= i26;
            }
            i27 = i13 & 1024;
            if (i27 != 0) {
                i28 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (pVarF.s(pVar5)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i12 | i29;
            } else {
                i28 = i12;
            }
            i30 = i13 & 2048;
            if (i30 != 0) {
                i28 |= 48;
            } else if ((i12 & 112) == 0) {
                if (pVarF.u(z12)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i28 |= i31;
            }
            i32 = i28;
            i33 = i13 & 4096;
            if (i33 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    if (pVarF.s(m0Var)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                if ((i12 & bb.c.g.f32954lc) != 0) {
                    i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
                }
                if ((i12 & 57344) != 0) {
                    i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
                }
                i35 = i13 & 32768;
                if (i35 != 0) {
                    i32 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z13)) {
                        i36 = 131072;
                    } else {
                        i36 = 65536;
                    }
                    i32 |= i36;
                }
                i37 = i13 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i10)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i13 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (pVarF.s(gVar)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i12 & 234881024) != 0) {
                    if ((i13 & 262144) == 0) {
                        i44 = 33554432;
                    } else {
                        i44 = 33554432;
                    }
                    i32 |= i44;
                }
                if ((i12 & 1879048192) != 0) {
                    if ((i13 & 524288) == 0) {
                        i43 = 268435456;
                    } else {
                        i43 = 268435456;
                    }
                    i32 |= i43;
                }
                if ((i14 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                    }
                    pVarF.T(1663535219);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR8 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr8 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11119 = pVar;
                    final androidx.compose.ui.n nVar10 = nVar;
                    final x1 x1Var17 = x1Var;
                    final boolean z21115 = z12;
                    final int i4111 = i14;
                    x1 x1Var18 = x1Var;
                    TextStyle textStyle10 = textStyle;
                    final boolean z21116 = z10;
                    final boolean z21117 = z11;
                    final KeyboardOptions keyboardOptions10 = keyboardOptions;
                    boolean z21118 = z10;
                    final androidx.compose.foundation.text.i iVar10 = iVar;
                    final boolean z21119 = z13;
                    final int i4112 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var10 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar10 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111110 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111112 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111113 = pVar5;
                    final g2 g2Var10 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr8, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i4113) {
                            if ((i4113 & 11) == 2 && pVar111114.b()) {
                                pVar111114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1801753362, i4113, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                            }
                            androidx.compose.ui.n nVarO = pVar11119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar10, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar10;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var19 = x1Var17;
                            boolean z211110 = z21115;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var19.b(z211110, pVar111114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final String str = value;
                            yh.l<String, kotlin.b2> lVar = onValueChange;
                            final boolean z211111 = z21116;
                            boolean z211112 = z21117;
                            TextStyle textStyle11 = textStyleR8;
                            KeyboardOptions keyboardOptions11 = keyboardOptions10;
                            androidx.compose.foundation.text.i iVar11 = iVar10;
                            final boolean z211113 = z21119;
                            int i51 = i4112;
                            final androidx.compose.ui.text.input.m0 m0Var11 = m0Var10;
                            final androidx.compose.foundation.interaction.g gVar11 = gVar10;
                            final boolean z211114 = z21115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar11119;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar111110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111111;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111112;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar111113;
                            final x1 x1Var110 = x1Var17;
                            final int i52 = i4111;
                            final int i53 = i41;
                            final g2 g2Var11 = g2Var10;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar111114, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String str2 = str;
                                    final boolean z30 = z211111;
                                    boolean z31 = z211113;
                                    androidx.compose.ui.text.input.m0 m0Var12 = m0Var11;
                                    final androidx.compose.foundation.interaction.g gVar12 = gVar11;
                                    final boolean z32 = z211114;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var111 = x1Var110;
                                    final g2 g2Var12 = g2Var11;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar13 = gVar12;
                                            x1 x1Var112 = x1Var111;
                                            g2 g2Var13 = g2Var12;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar13, x1Var112, g2Var13, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var12, gVar12, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var111, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i4111;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.b(str, lVar, nVarG, z211111, z211112, textStyle11, keyboardOptions11, iVar11, z211113, i51, m0Var11, null, gVar11, solidColor, aVarB, pVar111114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                            a(pVar111114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var18;
                    textStyle2 = textStyle10;
                    z17 = z21118;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    } else {
                        if (i46 != 0) {
                            nVar = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar = nVar;
                        }
                        if (i15 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i17 != 0) {
                            z11 = false;
                        } else {
                            z11 = z11;
                        }
                        if ((i13 & 32) != 0) {
                            textStyle = (TextStyle) pVarF.K(TextKt.d());
                            i14 &= -458753;
                        } else {
                            textStyle = textStyle;
                        }
                        if (i19 != 0) {
                            pVar = null;
                        } else {
                            pVar = pVar;
                        }
                        if (i21 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar2;
                        }
                        if (i23 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar4;
                        }
                        if (i27 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar5;
                        }
                        if (i30 != 0) {
                            z12 = false;
                        } else {
                            z12 = z12;
                        }
                        if (i33 != 0) {
                            m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                        } else {
                            m0Var = m0Var;
                        }
                        pVar3 = pVar7;
                        if ((i13 & 8192) != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            i32 &= -7169;
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        keyboardOptions = keyboardOptionsA;
                        if ((i13 & 16384) != 0) {
                            iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                            i32 &= -57345;
                        } else {
                            iVarA = iVar;
                        }
                        if (i35 != 0) {
                            z13 = false;
                        } else {
                            z13 = z13;
                        }
                        if (i37 != 0) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = i10;
                        }
                        iVar = iVarA;
                        if (i39 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar = gVar;
                        }
                        if ((i13 & 262144) != 0) {
                            g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                            i32 &= -234881025;
                        } else {
                            g2Var = g2Var;
                        }
                        if ((i13 & 524288) != 0) {
                            i41 = i32 & (-1879048193);
                            x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                        } else {
                            i41 = i32;
                            x1Var = x1Var;
                        }
                        z10 = z14;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                    }
                    pVarF.T(1663535219);
                    jP = textStyle.p();
                    if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                    }
                    pVarF.c0();
                    final TextStyle textStyleR9 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                    androidx.compose.runtime.k1[] k1VarArr9 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111114 = pVar;
                    final androidx.compose.ui.n nVar11 = nVar;
                    final x1 x1Var19 = x1Var;
                    final boolean z211110 = z12;
                    final int i4113 = i14;
                    x1 x1Var110 = x1Var;
                    TextStyle textStyle11 = textStyle;
                    final boolean z211111 = z10;
                    final boolean z211112 = z11;
                    final KeyboardOptions keyboardOptions11 = keyboardOptions;
                    boolean z211113 = z10;
                    final androidx.compose.foundation.text.i iVar11 = iVar;
                    final boolean z211114 = z13;
                    final int i4114 = i10;
                    final androidx.compose.ui.text.input.m0 m0Var11 = m0Var;
                    final androidx.compose.foundation.interaction.g gVar11 = gVar;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111115 = pVar2;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111116 = pVar3;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111117 = pVar4;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111118 = pVar5;
                    final g2 g2Var11 = g2Var;
                    pVar8 = pVarF;
                    CompositionLocalKt.b(k1VarArr9, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111119, int i4115) {
                            if ((i4115 & 11) == 2 && pVar111119.b()) {
                                pVar111119.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1801753362, i4115, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                            }
                            androidx.compose.ui.n nVarO = pVar111114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar11, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                                public final void a(@dl.d r semantics) {
                                    kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar11;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                            androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                            x1 x1Var111 = x1Var19;
                            boolean z211115 = z211110;
                            int i50 = i41;
                            SolidColor solidColor = new SolidColor(x1Var111.b(z211115, pVar111119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                            final String str = value;
                            yh.l<String, kotlin.b2> lVar = onValueChange;
                            final boolean z211116 = z211111;
                            boolean z211117 = z211112;
                            TextStyle textStyle12 = textStyleR9;
                            KeyboardOptions keyboardOptions12 = keyboardOptions11;
                            androidx.compose.foundation.text.i iVar12 = iVar11;
                            final boolean z211118 = z211114;
                            int i51 = i4114;
                            final androidx.compose.ui.text.input.m0 m0Var12 = m0Var11;
                            final androidx.compose.foundation.interaction.g gVar12 = gVar11;
                            final boolean z211119 = z211110;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar111114;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar111115;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111116;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111117;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar111118;
                            final x1 x1Var112 = x1Var19;
                            final int i52 = i4113;
                            final int i53 = i41;
                            final g2 g2Var12 = g2Var11;
                            androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar111119, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                    int i55;
                                    kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                    if ((i54 & 14) == 0) {
                                        i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                    } else {
                                        i55 = i54;
                                    }
                                    if ((i55 & 91) == 18 && pVar25.b()) {
                                        pVar25.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                    }
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                    String str2 = str;
                                    final boolean z30 = z211116;
                                    boolean z31 = z211118;
                                    androidx.compose.ui.text.input.m0 m0Var13 = m0Var12;
                                    final androidx.compose.foundation.interaction.g gVar13 = gVar12;
                                    final boolean z32 = z211119;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                    final x1 x1Var113 = x1Var112;
                                    final g2 g2Var13 = g2Var12;
                                    final int i56 = i52;
                                    final int i57 = i53;
                                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                            if ((i58 & 11) == 2 && pVar31.b()) {
                                                pVar31.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                            }
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                            boolean z33 = z30;
                                            boolean z34 = z32;
                                            androidx.compose.foundation.interaction.g gVar14 = gVar13;
                                            x1 x1Var114 = x1Var113;
                                            g2 g2Var14 = g2Var13;
                                            int i59 = 12582912 | ((i56 >> 9) & 14);
                                            int i60 = i57;
                                            textFieldDefaults3.b(z33, z34, gVar14, x1Var114, g2Var14, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                            a(pVar31, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                    int i58 = i52;
                                    int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                    int i60 = i53;
                                    textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var13, gVar13, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var113, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                    a(pVar25, pVar26, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i54 = i4113;
                            int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                            int i56 = i41;
                            BasicTextFieldKt.b(str, lVar, nVarG, z211116, z211117, textStyle12, keyboardOptions12, iVar12, z211118, i51, m0Var12, null, gVar12, solidColor, aVarB, pVar111119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111119, Integer num) {
                            a(pVar111119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVar8, 56);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar2 = nVar;
                    pVar9 = pVar2;
                    pVar10 = pVar3;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    z16 = z12;
                    m0Var2 = m0Var;
                    keyboardOptions2 = keyboardOptions;
                    iVar2 = iVar;
                    gVar2 = gVar;
                    g2Var2 = g2Var;
                    x1Var2 = x1Var110;
                    textStyle2 = textStyle11;
                    z17 = z211113;
                    z18 = z11;
                    pVar13 = pVar;
                    z19 = z13;
                    i42 = i10;
                }
                u1VarH = pVar8.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111119, int i4115) {
                        OutlinedTextFieldKt.b(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar111119, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111119, Integer num) {
                        a(pVar111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i32 |= bb.c.b.f30966u4;
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
            }
            if ((i12 & 57344) != 0) {
                i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
            }
            i35 = i13 & 32768;
            if (i35 != 0) {
                i32 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z13)) {
                    i36 = 131072;
                } else {
                    i36 = 65536;
                }
                i32 |= i36;
            }
            i37 = i13 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i10)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i13 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (pVarF.s(gVar)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i12 & 234881024) != 0) {
                if ((i13 & 262144) == 0) {
                    i44 = 33554432;
                } else {
                    i44 = 33554432;
                }
                i32 |= i44;
            }
            if ((i12 & 1879048192) != 0) {
                if ((i13 & 524288) == 0) {
                    i43 = 268435456;
                } else {
                    i43 = 268435456;
                }
                i32 |= i43;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                }
                pVarF.T(1663535219);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR10 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr10 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111119 = pVar;
                final androidx.compose.ui.n nVar12 = nVar;
                final x1 x1Var111 = x1Var;
                final boolean z211115 = z12;
                final int i4115 = i14;
                x1 x1Var112 = x1Var;
                TextStyle textStyle12 = textStyle;
                final boolean z211116 = z10;
                final boolean z211117 = z11;
                final KeyboardOptions keyboardOptions12 = keyboardOptions;
                boolean z211118 = z10;
                final androidx.compose.foundation.text.i iVar12 = iVar;
                final boolean z211119 = z13;
                final int i4116 = i10;
                final androidx.compose.ui.text.input.m0 m0Var12 = m0Var;
                final androidx.compose.foundation.interaction.g gVar12 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111110 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111112 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111113 = pVar5;
                final g2 g2Var12 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr10, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i4117) {
                        if ((i4117 & 11) == 2 && pVar1111114.b()) {
                            pVar1111114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1801753362, i4117, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                        }
                        androidx.compose.ui.n nVarO = pVar111119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar12, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar12;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var113 = x1Var111;
                        boolean z2111110 = z211115;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var113.b(z2111110, pVar1111114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final String str = value;
                        yh.l<String, kotlin.b2> lVar = onValueChange;
                        final boolean z2111111 = z211116;
                        boolean z2111112 = z211117;
                        TextStyle textStyle13 = textStyleR10;
                        KeyboardOptions keyboardOptions13 = keyboardOptions12;
                        androidx.compose.foundation.text.i iVar13 = iVar12;
                        final boolean z2111113 = z211119;
                        int i51 = i4116;
                        final androidx.compose.ui.text.input.m0 m0Var13 = m0Var12;
                        final androidx.compose.foundation.interaction.g gVar13 = gVar12;
                        final boolean z2111114 = z211115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar111119;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar1111110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar1111111;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar1111112;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar1111113;
                        final x1 x1Var114 = x1Var111;
                        final int i52 = i4115;
                        final int i53 = i41;
                        final g2 g2Var13 = g2Var12;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar1111114, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String str2 = str;
                                final boolean z30 = z2111111;
                                boolean z31 = z2111113;
                                androidx.compose.ui.text.input.m0 m0Var14 = m0Var13;
                                final androidx.compose.foundation.interaction.g gVar14 = gVar13;
                                final boolean z32 = z2111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var115 = x1Var114;
                                final g2 g2Var14 = g2Var13;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar15 = gVar14;
                                        x1 x1Var116 = x1Var115;
                                        g2 g2Var15 = g2Var14;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar15, x1Var116, g2Var15, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var14, gVar14, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var115, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i4115;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.b(str, lVar, nVarG, z2111111, z2111112, textStyle13, keyboardOptions13, iVar13, z2111113, i51, m0Var13, null, gVar13, solidColor, aVarB, pVar1111114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                        a(pVar1111114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var112;
                textStyle2 = textStyle12;
                z17 = z211118;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                }
                pVarF.T(1663535219);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR11 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr11 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111114 = pVar;
                final androidx.compose.ui.n nVar13 = nVar;
                final x1 x1Var113 = x1Var;
                final boolean z2111110 = z12;
                final int i4117 = i14;
                x1 x1Var114 = x1Var;
                TextStyle textStyle13 = textStyle;
                final boolean z2111111 = z10;
                final boolean z2111112 = z11;
                final KeyboardOptions keyboardOptions13 = keyboardOptions;
                boolean z2111113 = z10;
                final androidx.compose.foundation.text.i iVar13 = iVar;
                final boolean z2111114 = z13;
                final int i4118 = i10;
                final androidx.compose.ui.text.input.m0 m0Var13 = m0Var;
                final androidx.compose.foundation.interaction.g gVar13 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111115 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111116 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111117 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111118 = pVar5;
                final g2 g2Var13 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr11, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111119, int i4119) {
                        if ((i4119 & 11) == 2 && pVar1111119.b()) {
                            pVar1111119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1801753362, i4119, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                        }
                        androidx.compose.ui.n nVarO = pVar1111114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar13, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar13;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var115 = x1Var113;
                        boolean z2111115 = z2111110;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var115.b(z2111115, pVar1111119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final String str = value;
                        yh.l<String, kotlin.b2> lVar = onValueChange;
                        final boolean z2111116 = z2111111;
                        boolean z2111117 = z2111112;
                        TextStyle textStyle14 = textStyleR11;
                        KeyboardOptions keyboardOptions14 = keyboardOptions13;
                        androidx.compose.foundation.text.i iVar14 = iVar13;
                        final boolean z2111118 = z2111114;
                        int i51 = i4118;
                        final androidx.compose.ui.text.input.m0 m0Var14 = m0Var13;
                        final androidx.compose.foundation.interaction.g gVar14 = gVar13;
                        final boolean z2111119 = z2111110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar1111114;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar1111115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar1111116;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar1111117;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar1111118;
                        final x1 x1Var116 = x1Var113;
                        final int i52 = i4117;
                        final int i53 = i41;
                        final g2 g2Var14 = g2Var13;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar1111119, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String str2 = str;
                                final boolean z30 = z2111116;
                                boolean z31 = z2111118;
                                androidx.compose.ui.text.input.m0 m0Var15 = m0Var14;
                                final androidx.compose.foundation.interaction.g gVar15 = gVar14;
                                final boolean z32 = z2111119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var117 = x1Var116;
                                final g2 g2Var15 = g2Var14;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar16 = gVar15;
                                        x1 x1Var118 = x1Var117;
                                        g2 g2Var16 = g2Var15;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar16, x1Var118, g2Var16, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var15, gVar15, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var117, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i4117;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.b(str, lVar, nVarG, z2111116, z2111117, textStyle14, keyboardOptions14, iVar14, z2111118, i51, m0Var14, null, gVar14, solidColor, aVarB, pVar1111119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111119, Integer num) {
                        a(pVar1111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var114;
                textStyle2 = textStyle13;
                z17 = z2111113;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            }
            u1VarH = pVar8.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1111119, int i4119) {
                    OutlinedTextFieldKt.b(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar1111119, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111119, Integer num) {
                    a(pVar1111119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i14 |= bb.c.d.f31193dj;
        i17 = i13 & 16;
        if (i17 != 0) {
            i14 |= 24576;
        } else if ((i11 & 57344) == 0) {
            if (pVarF.u(z11)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i14 |= i18;
        }
        if ((i11 & 458752) != 0) {
            if ((i13 & 32) == 0) {
                i45 = 65536;
            } else {
                i45 = 65536;
            }
            i14 |= i45;
        }
        i19 = i13 & 64;
        if (i19 != 0) {
            i14 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (pVarF.s(pVar)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i14 |= i20;
        }
        i21 = i13 & 128;
        if (i21 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (pVarF.s(pVar2)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i14 |= i22;
        }
        i23 = i13 & 256;
        if (i23 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 234881024) == 0) {
            if (pVarF.s(pVar3)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i14 |= i24;
        }
        i25 = i13 & 512;
        if (i25 != 0) {
            i14 |= com.google.android.exoplayer2.j.G;
        } else if ((i11 & 1879048192) == 0) {
            if (pVarF.s(pVar4)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i14 |= i26;
        }
        i27 = i13 & 1024;
        if (i27 != 0) {
            i28 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (pVarF.s(pVar5)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i28 = i12 | i29;
        } else {
            i28 = i12;
        }
        i30 = i13 & 2048;
        if (i30 != 0) {
            i28 |= 48;
        } else if ((i12 & 112) == 0) {
            if (pVarF.u(z12)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i28 |= i31;
        }
        i32 = i28;
        i33 = i13 & 4096;
        if (i33 != 0) {
            if ((i12 & bb.c.b.f30796me) == 0) {
                if (pVarF.s(m0Var)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i32 |= i34;
            }
            if ((i12 & bb.c.g.f32954lc) != 0) {
                i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
            }
            if ((i12 & 57344) != 0) {
                i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
            }
            i35 = i13 & 32768;
            if (i35 != 0) {
                i32 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z13)) {
                    i36 = 131072;
                } else {
                    i36 = 65536;
                }
                i32 |= i36;
            }
            i37 = i13 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i10)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i13 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (pVarF.s(gVar)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i12 & 234881024) != 0) {
                if ((i13 & 262144) == 0) {
                    i44 = 33554432;
                } else {
                    i44 = 33554432;
                }
                i32 |= i44;
            }
            if ((i12 & 1879048192) != 0) {
                if ((i13 & 524288) == 0) {
                    i43 = 268435456;
                } else {
                    i43 = 268435456;
                }
                i32 |= i43;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                }
                pVarF.T(1663535219);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR12 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr12 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111119 = pVar;
                final androidx.compose.ui.n nVar14 = nVar;
                final x1 x1Var115 = x1Var;
                final boolean z2111115 = z12;
                final int i4119 = i14;
                x1 x1Var116 = x1Var;
                TextStyle textStyle14 = textStyle;
                final boolean z2111116 = z10;
                final boolean z2111117 = z11;
                final KeyboardOptions keyboardOptions14 = keyboardOptions;
                boolean z2111118 = z10;
                final androidx.compose.foundation.text.i iVar14 = iVar;
                final boolean z2111119 = z13;
                final int i41110 = i10;
                final androidx.compose.ui.text.input.m0 m0Var14 = m0Var;
                final androidx.compose.foundation.interaction.g gVar14 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111110 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111111 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111112 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111113 = pVar5;
                final g2 g2Var14 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr12, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111114, int i41111) {
                        if ((i41111 & 11) == 2 && pVar11111114.b()) {
                            pVar11111114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1801753362, i41111, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                        }
                        androidx.compose.ui.n nVarO = pVar1111119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar14, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar14;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var117 = x1Var115;
                        boolean z21111110 = z2111115;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var117.b(z21111110, pVar11111114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final String str = value;
                        yh.l<String, kotlin.b2> lVar = onValueChange;
                        final boolean z21111111 = z2111116;
                        boolean z21111112 = z2111117;
                        TextStyle textStyle15 = textStyleR12;
                        KeyboardOptions keyboardOptions15 = keyboardOptions14;
                        androidx.compose.foundation.text.i iVar15 = iVar14;
                        final boolean z21111113 = z2111119;
                        int i51 = i41110;
                        final androidx.compose.ui.text.input.m0 m0Var15 = m0Var14;
                        final androidx.compose.foundation.interaction.g gVar15 = gVar14;
                        final boolean z21111114 = z2111115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar1111119;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar11111110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar11111111;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar11111112;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar11111113;
                        final x1 x1Var118 = x1Var115;
                        final int i52 = i4119;
                        final int i53 = i41;
                        final g2 g2Var15 = g2Var14;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar11111114, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String str2 = str;
                                final boolean z30 = z21111111;
                                boolean z31 = z21111113;
                                androidx.compose.ui.text.input.m0 m0Var16 = m0Var15;
                                final androidx.compose.foundation.interaction.g gVar16 = gVar15;
                                final boolean z32 = z21111114;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var119 = x1Var118;
                                final g2 g2Var16 = g2Var15;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar17 = gVar16;
                                        x1 x1Var1110 = x1Var119;
                                        g2 g2Var17 = g2Var16;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar17, x1Var1110, g2Var17, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var16, gVar16, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var119, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i4119;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.b(str, lVar, nVarG, z21111111, z21111112, textStyle15, keyboardOptions15, iVar15, z21111113, i51, m0Var15, null, gVar15, solidColor, aVarB, pVar11111114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111114, Integer num) {
                        a(pVar11111114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var116;
                textStyle2 = textStyle14;
                z17 = z2111118;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                } else {
                    if (i46 != 0) {
                        nVar = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar = nVar;
                    }
                    if (i15 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i17 != 0) {
                        z11 = false;
                    } else {
                        z11 = z11;
                    }
                    if ((i13 & 32) != 0) {
                        textStyle = (TextStyle) pVarF.K(TextKt.d());
                        i14 &= -458753;
                    } else {
                        textStyle = textStyle;
                    }
                    if (i19 != 0) {
                        pVar = null;
                    } else {
                        pVar = pVar;
                    }
                    if (i21 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar2;
                    }
                    if (i23 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar4;
                    }
                    if (i27 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar5;
                    }
                    if (i30 != 0) {
                        z12 = false;
                    } else {
                        z12 = z12;
                    }
                    if (i33 != 0) {
                        m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                    } else {
                        m0Var = m0Var;
                    }
                    pVar3 = pVar7;
                    if ((i13 & 8192) != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        i32 &= -7169;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    keyboardOptions = keyboardOptionsA;
                    if ((i13 & 16384) != 0) {
                        iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                        i32 &= -57345;
                    } else {
                        iVarA = iVar;
                    }
                    if (i35 != 0) {
                        z13 = false;
                    } else {
                        z13 = z13;
                    }
                    if (i37 != 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i10;
                    }
                    iVar = iVarA;
                    if (i39 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar = gVar;
                    }
                    if ((i13 & 262144) != 0) {
                        g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                        i32 &= -234881025;
                    } else {
                        g2Var = g2Var;
                    }
                    if ((i13 & 524288) != 0) {
                        i41 = i32 & (-1879048193);
                        x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                    } else {
                        i41 = i32;
                        x1Var = x1Var;
                    }
                    z10 = z14;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                }
                pVarF.T(1663535219);
                jP = textStyle.p();
                if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
                }
                pVarF.c0();
                final TextStyle textStyleR13 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
                androidx.compose.runtime.k1[] k1VarArr13 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111114 = pVar;
                final androidx.compose.ui.n nVar15 = nVar;
                final x1 x1Var117 = x1Var;
                final boolean z21111110 = z12;
                final int i41111 = i14;
                x1 x1Var118 = x1Var;
                TextStyle textStyle15 = textStyle;
                final boolean z21111111 = z10;
                final boolean z21111112 = z11;
                final KeyboardOptions keyboardOptions15 = keyboardOptions;
                boolean z21111113 = z10;
                final androidx.compose.foundation.text.i iVar15 = iVar;
                final boolean z21111114 = z13;
                final int i41112 = i10;
                final androidx.compose.ui.text.input.m0 m0Var15 = m0Var;
                final androidx.compose.foundation.interaction.g gVar15 = gVar;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111115 = pVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111116 = pVar3;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111117 = pVar4;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111118 = pVar5;
                final g2 g2Var15 = g2Var;
                pVar8 = pVarF;
                CompositionLocalKt.b(k1VarArr13, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11111119, int i41113) {
                        if ((i41113 & 11) == 2 && pVar11111119.b()) {
                            pVar11111119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1801753362, i41113, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                        }
                        androidx.compose.ui.n nVarO = pVar11111114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar15, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                            public final void a(@dl.d r semantics) {
                                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar15;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                        androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                        x1 x1Var119 = x1Var117;
                        boolean z21111115 = z21111110;
                        int i50 = i41;
                        SolidColor solidColor = new SolidColor(x1Var119.b(z21111115, pVar11111119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                        final String str = value;
                        yh.l<String, kotlin.b2> lVar = onValueChange;
                        final boolean z21111116 = z21111111;
                        boolean z21111117 = z21111112;
                        TextStyle textStyle16 = textStyleR13;
                        KeyboardOptions keyboardOptions16 = keyboardOptions15;
                        androidx.compose.foundation.text.i iVar16 = iVar15;
                        final boolean z21111118 = z21111114;
                        int i51 = i41112;
                        final androidx.compose.ui.text.input.m0 m0Var16 = m0Var15;
                        final androidx.compose.foundation.interaction.g gVar16 = gVar15;
                        final boolean z21111119 = z21111110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar11111114;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar11111115;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar11111116;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar11111117;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar11111118;
                        final x1 x1Var1110 = x1Var117;
                        final int i52 = i41111;
                        final int i53 = i41;
                        final g2 g2Var16 = g2Var15;
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar11111119, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                                int i55;
                                kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                                if ((i54 & 14) == 0) {
                                    i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                                } else {
                                    i55 = i54;
                                }
                                if ((i55 & 91) == 18 && pVar25.b()) {
                                    pVar25.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                }
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                                String str2 = str;
                                final boolean z30 = z21111116;
                                boolean z31 = z21111118;
                                androidx.compose.ui.text.input.m0 m0Var17 = m0Var16;
                                final androidx.compose.foundation.interaction.g gVar17 = gVar16;
                                final boolean z32 = z21111119;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                                final x1 x1Var1111 = x1Var1110;
                                final g2 g2Var17 = g2Var16;
                                final int i56 = i52;
                                final int i57 = i53;
                                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                        if ((i58 & 11) == 2 && pVar31.b()) {
                                            pVar31.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                        }
                                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                        boolean z33 = z30;
                                        boolean z34 = z32;
                                        androidx.compose.foundation.interaction.g gVar18 = gVar17;
                                        x1 x1Var1112 = x1Var1111;
                                        g2 g2Var18 = g2Var17;
                                        int i59 = 12582912 | ((i56 >> 9) & 14);
                                        int i60 = i57;
                                        textFieldDefaults3.b(z33, z34, gVar18, x1Var1112, g2Var18, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                        a(pVar31, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                                int i58 = i52;
                                int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                                int i60 = i53;
                                textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var17, gVar17, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var1111, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                                a(pVar25, pVar26, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i54 = i41111;
                        int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                        int i56 = i41;
                        BasicTextFieldKt.b(str, lVar, nVarG, z21111116, z21111117, textStyle16, keyboardOptions16, iVar16, z21111118, i51, m0Var16, null, gVar16, solidColor, aVarB, pVar11111119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111119, Integer num) {
                        a(pVar11111119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVar8, 56);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar2 = nVar;
                pVar9 = pVar2;
                pVar10 = pVar3;
                pVar11 = pVar4;
                pVar12 = pVar5;
                z16 = z12;
                m0Var2 = m0Var;
                keyboardOptions2 = keyboardOptions;
                iVar2 = iVar;
                gVar2 = gVar;
                g2Var2 = g2Var;
                x1Var2 = x1Var118;
                textStyle2 = textStyle15;
                z17 = z21111113;
                z18 = z11;
                pVar13 = pVar;
                z19 = z13;
                i42 = i10;
            }
            u1VarH = pVar8.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar11111119, int i41113) {
                    OutlinedTextFieldKt.b(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar11111119, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11111119, Integer num) {
                    a(pVar11111119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i32 |= bb.c.b.f30966u4;
        if ((i12 & bb.c.g.f32954lc) != 0) {
            i32 |= ((i13 & 8192) == 0 || !pVarF.s(keyboardOptions)) ? 1024 : 2048;
        }
        if ((i12 & 57344) != 0) {
            i32 |= ((i13 & 16384) == 0 || !pVarF.s(iVar)) ? 8192 : 16384;
        }
        i35 = i13 & 32768;
        if (i35 != 0) {
            i32 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i12 & 458752) == 0) {
            if (pVarF.u(z13)) {
                i36 = 131072;
            } else {
                i36 = 65536;
            }
            i32 |= i36;
        }
        i37 = i13 & 65536;
        if (i37 != 0) {
            i32 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (pVarF.y(i10)) {
                i38 = 1048576;
            } else {
                i38 = 524288;
            }
            i32 |= i38;
        }
        i39 = i13 & 131072;
        if (i39 != 0) {
            i32 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (pVarF.s(gVar)) {
                i40 = 8388608;
            } else {
                i40 = 4194304;
            }
            i32 |= i40;
        }
        if ((i12 & 234881024) != 0) {
            if ((i13 & 262144) == 0) {
                i44 = 33554432;
            } else {
                i44 = 33554432;
            }
            i32 |= i44;
        }
        if ((i12 & 1879048192) != 0) {
            if ((i13 & 524288) == 0) {
                i43 = 268435456;
            } else {
                i43 = 268435456;
            }
            i32 |= i43;
        }
        if ((i14 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i46 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar = nVar;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i17 != 0) {
                    z11 = false;
                } else {
                    z11 = z11;
                }
                if ((i13 & 32) != 0) {
                    textStyle = (TextStyle) pVarF.K(TextKt.d());
                    i14 &= -458753;
                } else {
                    textStyle = textStyle;
                }
                if (i19 != 0) {
                    pVar = null;
                } else {
                    pVar = pVar;
                }
                if (i21 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar2;
                }
                if (i23 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar4;
                }
                if (i27 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar5;
                }
                if (i30 != 0) {
                    z12 = false;
                } else {
                    z12 = z12;
                }
                if (i33 != 0) {
                    m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                } else {
                    m0Var = m0Var;
                }
                pVar3 = pVar7;
                if ((i13 & 8192) != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    i32 &= -7169;
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                keyboardOptions = keyboardOptionsA;
                if ((i13 & 16384) != 0) {
                    iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                    i32 &= -57345;
                } else {
                    iVarA = iVar;
                }
                if (i35 != 0) {
                    z13 = false;
                } else {
                    z13 = z13;
                }
                if (i37 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                iVar = iVarA;
                if (i39 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar = gVar;
                }
                if ((i13 & 262144) != 0) {
                    g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                    i32 &= -234881025;
                } else {
                    g2Var = g2Var;
                }
                if ((i13 & 524288) != 0) {
                    i41 = i32 & (-1879048193);
                    x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                } else {
                    i41 = i32;
                    x1Var = x1Var;
                }
                z10 = z14;
            } else {
                if (i46 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar = nVar;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i17 != 0) {
                    z11 = false;
                } else {
                    z11 = z11;
                }
                if ((i13 & 32) != 0) {
                    textStyle = (TextStyle) pVarF.K(TextKt.d());
                    i14 &= -458753;
                } else {
                    textStyle = textStyle;
                }
                if (i19 != 0) {
                    pVar = null;
                } else {
                    pVar = pVar;
                }
                if (i21 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar2;
                }
                if (i23 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar4;
                }
                if (i27 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar5;
                }
                if (i30 != 0) {
                    z12 = false;
                } else {
                    z12 = z12;
                }
                if (i33 != 0) {
                    m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                } else {
                    m0Var = m0Var;
                }
                pVar3 = pVar7;
                if ((i13 & 8192) != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    i32 &= -7169;
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                keyboardOptions = keyboardOptionsA;
                if ((i13 & 16384) != 0) {
                    iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                    i32 &= -57345;
                } else {
                    iVarA = iVar;
                }
                if (i35 != 0) {
                    z13 = false;
                } else {
                    z13 = z13;
                }
                if (i37 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                iVar = iVarA;
                if (i39 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar = gVar;
                }
                if ((i13 & 262144) != 0) {
                    g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                    i32 &= -234881025;
                } else {
                    g2Var = g2Var;
                }
                if ((i13 & 524288) != 0) {
                    i41 = i32 & (-1879048193);
                    x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                } else {
                    i41 = i32;
                    x1Var = x1Var;
                }
                z10 = z14;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
            }
            pVarF.T(1663535219);
            jP = textStyle.p();
            if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
            }
            pVarF.c0();
            final TextStyle textStyleR14 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
            androidx.compose.runtime.k1[] k1VarArr14 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111119 = pVar;
            final androidx.compose.ui.n nVar16 = nVar;
            final x1 x1Var119 = x1Var;
            final boolean z21111115 = z12;
            final int i41113 = i14;
            x1 x1Var1110 = x1Var;
            TextStyle textStyle16 = textStyle;
            final boolean z21111116 = z10;
            final boolean z21111117 = z11;
            final KeyboardOptions keyboardOptions16 = keyboardOptions;
            boolean z21111118 = z10;
            final androidx.compose.foundation.text.i iVar16 = iVar;
            final boolean z21111119 = z13;
            final int i41114 = i10;
            final androidx.compose.ui.text.input.m0 m0Var16 = m0Var;
            final androidx.compose.foundation.interaction.g gVar16 = gVar;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111110 = pVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111111 = pVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111112 = pVar4;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111113 = pVar5;
            final g2 g2Var16 = g2Var;
            pVar8 = pVarF;
            CompositionLocalKt.b(k1VarArr14, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar111111114, int i41115) {
                    if ((i41115 & 11) == 2 && pVar111111114.b()) {
                        pVar111111114.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1801753362, i41115, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                    }
                    androidx.compose.ui.n nVarO = pVar11111119 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar16, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                        public final void a(@dl.d r semantics) {
                            kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                            a(rVar);
                            return kotlin.b2.f124493a;
                        }
                    }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar16;
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                    androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                    x1 x1Var1111 = x1Var119;
                    boolean z211111110 = z21111115;
                    int i50 = i41;
                    SolidColor solidColor = new SolidColor(x1Var1111.b(z211111110, pVar111111114, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                    final String str = value;
                    yh.l<String, kotlin.b2> lVar = onValueChange;
                    final boolean z211111111 = z21111116;
                    boolean z211111112 = z21111117;
                    TextStyle textStyle17 = textStyleR14;
                    KeyboardOptions keyboardOptions17 = keyboardOptions16;
                    androidx.compose.foundation.text.i iVar17 = iVar16;
                    final boolean z211111113 = z21111119;
                    int i51 = i41114;
                    final androidx.compose.ui.text.input.m0 m0Var17 = m0Var16;
                    final androidx.compose.foundation.interaction.g gVar17 = gVar16;
                    final boolean z211111114 = z21111115;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar11111119;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar111111110;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111111111;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111111112;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar111111113;
                    final x1 x1Var1112 = x1Var119;
                    final int i52 = i41113;
                    final int i53 = i41;
                    final g2 g2Var17 = g2Var16;
                    androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar111111114, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                            int i55;
                            kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                            if ((i54 & 14) == 0) {
                                i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                            } else {
                                i55 = i54;
                            }
                            if ((i55 & 91) == 18 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                            }
                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                            String str2 = str;
                            final boolean z30 = z211111111;
                            boolean z31 = z211111113;
                            androidx.compose.ui.text.input.m0 m0Var18 = m0Var17;
                            final androidx.compose.foundation.interaction.g gVar18 = gVar17;
                            final boolean z32 = z211111114;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                            final x1 x1Var1113 = x1Var1112;
                            final g2 g2Var18 = g2Var17;
                            final int i56 = i52;
                            final int i57 = i53;
                            androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                    if ((i58 & 11) == 2 && pVar31.b()) {
                                        pVar31.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                    }
                                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                    boolean z33 = z30;
                                    boolean z34 = z32;
                                    androidx.compose.foundation.interaction.g gVar19 = gVar18;
                                    x1 x1Var1114 = x1Var1113;
                                    g2 g2Var19 = g2Var18;
                                    int i59 = 12582912 | ((i56 >> 9) & 14);
                                    int i60 = i57;
                                    textFieldDefaults3.b(z33, z34, gVar19, x1Var1114, g2Var19, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                    a(pVar31, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i58 = i52;
                            int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                            int i60 = i53;
                            textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var18, gVar18, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var1113, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                            a(pVar25, pVar26, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i54 = i41113;
                    int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                    int i56 = i41;
                    BasicTextFieldKt.b(str, lVar, nVarG, z211111111, z211111112, textStyle17, keyboardOptions17, iVar17, z211111113, i51, m0Var17, null, gVar17, solidColor, aVarB, pVar111111114, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111114, Integer num) {
                    a(pVar111111114, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVar8, 56);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar;
            pVar9 = pVar2;
            pVar10 = pVar3;
            pVar11 = pVar4;
            pVar12 = pVar5;
            z16 = z12;
            m0Var2 = m0Var;
            keyboardOptions2 = keyboardOptions;
            iVar2 = iVar;
            gVar2 = gVar;
            g2Var2 = g2Var;
            x1Var2 = x1Var1110;
            textStyle2 = textStyle16;
            z17 = z21111118;
            z18 = z11;
            pVar13 = pVar;
            z19 = z13;
            i42 = i10;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i46 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar = nVar;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i17 != 0) {
                    z11 = false;
                } else {
                    z11 = z11;
                }
                if ((i13 & 32) != 0) {
                    textStyle = (TextStyle) pVarF.K(TextKt.d());
                    i14 &= -458753;
                } else {
                    textStyle = textStyle;
                }
                if (i19 != 0) {
                    pVar = null;
                } else {
                    pVar = pVar;
                }
                if (i21 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar2;
                }
                if (i23 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar4;
                }
                if (i27 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar5;
                }
                if (i30 != 0) {
                    z12 = false;
                } else {
                    z12 = z12;
                }
                if (i33 != 0) {
                    m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                } else {
                    m0Var = m0Var;
                }
                pVar3 = pVar7;
                if ((i13 & 8192) != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    i32 &= -7169;
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                keyboardOptions = keyboardOptionsA;
                if ((i13 & 16384) != 0) {
                    iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                    i32 &= -57345;
                } else {
                    iVarA = iVar;
                }
                if (i35 != 0) {
                    z13 = false;
                } else {
                    z13 = z13;
                }
                if (i37 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                iVar = iVarA;
                if (i39 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar = gVar;
                }
                if ((i13 & 262144) != 0) {
                    g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                    i32 &= -234881025;
                } else {
                    g2Var = g2Var;
                }
                if ((i13 & 524288) != 0) {
                    i41 = i32 & (-1879048193);
                    x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                } else {
                    i41 = i32;
                    x1Var = x1Var;
                }
                z10 = z14;
            } else {
                if (i46 != 0) {
                    nVar = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar = nVar;
                }
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i17 != 0) {
                    z11 = false;
                } else {
                    z11 = z11;
                }
                if ((i13 & 32) != 0) {
                    textStyle = (TextStyle) pVarF.K(TextKt.d());
                    i14 &= -458753;
                } else {
                    textStyle = textStyle;
                }
                if (i19 != 0) {
                    pVar = null;
                } else {
                    pVar = pVar;
                }
                if (i21 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar2;
                }
                if (i23 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar4;
                }
                if (i27 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar5;
                }
                if (i30 != 0) {
                    z12 = false;
                } else {
                    z12 = z12;
                }
                if (i33 != 0) {
                    m0Var = androidx.compose.ui.text.input.m0.INSTANCE.a();
                } else {
                    m0Var = m0Var;
                }
                pVar3 = pVar7;
                if ((i13 & 8192) != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    i32 &= -7169;
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                keyboardOptions = keyboardOptionsA;
                if ((i13 & 16384) != 0) {
                    iVarA = androidx.compose.foundation.text.i.INSTANCE.a();
                    i32 &= -57345;
                } else {
                    iVarA = iVar;
                }
                if (i35 != 0) {
                    z13 = false;
                } else {
                    z13 = z13;
                }
                if (i37 != 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i10;
                }
                iVar = iVarA;
                if (i39 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar = gVar;
                }
                if ((i13 & 262144) != 0) {
                    g2Var = TextFieldDefaults.f11327a.i(pVarF, 6);
                    i32 &= -234881025;
                } else {
                    g2Var = g2Var;
                }
                if ((i13 & 524288) != 0) {
                    i41 = i32 & (-1879048193);
                    x1Var = TextFieldDefaults.f11327a.m(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 0, 100663296, 268435455);
                } else {
                    i41 = i32;
                    x1Var = x1Var;
                }
                z10 = z14;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(534493230, i14, i41, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
            }
            pVarF.T(1663535219);
            jP = textStyle.p();
            if (jP != androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                jP = x1Var.m(z10, pVarF, ((i14 >> 9) & 14) | ((i41 >> 24) & 112)).getValue().M();
            }
            pVarF.c0();
            final TextStyle textStyleR15 = textStyle.R(new TextStyle(jP, 0L, (FontWeight) null, (androidx.compose.ui.text.font.g0) null, (androidx.compose.ui.text.font.h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (androidx.compose.ui.text.style.i) null, (Shadow) null, (androidx.compose.ui.text.style.h) null, (androidx.compose.ui.text.style.j) null, 0L, (TextIndent) null, 262142, (kotlin.jvm.internal.u) null));
            androidx.compose.runtime.k1[] k1VarArr15 = {TextSelectionColorsKt.c().f(x1Var.c(pVarF, (i41 >> 27) & 14))};
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111114 = pVar;
            final androidx.compose.ui.n nVar17 = nVar;
            final x1 x1Var1111 = x1Var;
            final boolean z211111110 = z12;
            final int i41115 = i14;
            x1 x1Var1112 = x1Var;
            TextStyle textStyle17 = textStyle;
            final boolean z211111111 = z10;
            final boolean z211111112 = z11;
            final KeyboardOptions keyboardOptions17 = keyboardOptions;
            boolean z211111113 = z10;
            final androidx.compose.foundation.text.i iVar17 = iVar;
            final boolean z211111114 = z13;
            final int i41116 = i10;
            final androidx.compose.ui.text.input.m0 m0Var17 = m0Var;
            final androidx.compose.foundation.interaction.g gVar17 = gVar;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111115 = pVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111116 = pVar3;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111117 = pVar4;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111118 = pVar5;
            final g2 g2Var17 = g2Var;
            pVar8 = pVarF;
            CompositionLocalKt.b(k1VarArr15, androidx.compose.runtime.internal.b.b(pVar8, -1801753362, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar111111119, int i41117) {
                    if ((i41117 & 11) == 2 && pVar111111119.b()) {
                        pVar111111119.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1801753362, i41117, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                    }
                    androidx.compose.ui.n nVarO = pVar111111114 != null ? PaddingKt.o(SemanticsModifierKt.b(nVar17, true, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.1
                        public final void a(@dl.d r semantics) {
                            kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                            a(rVar);
                            return kotlin.b2.f124493a;
                        }
                    }), 0.0f, OutlinedTextFieldKt.j(), 0.0f, 0.0f, 13, null) : nVar17;
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11327a;
                    androidx.compose.ui.n nVarG = SizeKt.g(nVarO, textFieldDefaults.h(), textFieldDefaults.g());
                    x1 x1Var1113 = x1Var1111;
                    boolean z211111115 = z211111110;
                    int i50 = i41;
                    SolidColor solidColor = new SolidColor(x1Var1113.b(z211111115, pVar111111119, ((i50 >> 24) & 112) | ((i50 >> 3) & 14)).getValue().M(), null);
                    final String str = value;
                    yh.l<String, kotlin.b2> lVar = onValueChange;
                    final boolean z211111116 = z211111111;
                    boolean z211111117 = z211111112;
                    TextStyle textStyle18 = textStyleR15;
                    KeyboardOptions keyboardOptions18 = keyboardOptions17;
                    androidx.compose.foundation.text.i iVar18 = iVar17;
                    final boolean z211111118 = z211111114;
                    int i51 = i41116;
                    final androidx.compose.ui.text.input.m0 m0Var18 = m0Var17;
                    final androidx.compose.foundation.interaction.g gVar18 = gVar17;
                    final boolean z211111119 = z211111110;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar20 = pVar111111114;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar21 = pVar111111115;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar22 = pVar111111116;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar23 = pVar111111117;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar24 = pVar111111118;
                    final x1 x1Var1114 = x1Var1111;
                    final int i52 = i41115;
                    final int i53 = i41;
                    final g2 g2Var18 = g2Var17;
                    androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVar111111119, 794931831, true, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> innerTextField, @dl.e androidx.compose.runtime.p pVar25, int i54) {
                            int i55;
                            kotlin.jvm.internal.f0.p(innerTextField, "innerTextField");
                            if ((i54 & 14) == 0) {
                                i55 = i54 | (pVar25.s(innerTextField) ? 4 : 2);
                            } else {
                                i55 = i54;
                            }
                            if ((i55 & 91) == 18 && pVar25.b()) {
                                pVar25.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(794931831, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                            }
                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11327a;
                            String str2 = str;
                            final boolean z30 = z211111116;
                            boolean z31 = z211111118;
                            androidx.compose.ui.text.input.m0 m0Var19 = m0Var18;
                            final androidx.compose.foundation.interaction.g gVar19 = gVar18;
                            final boolean z32 = z211111119;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar26 = pVar20;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar27 = pVar21;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar28 = pVar22;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar29 = pVar23;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar30 = pVar24;
                            final x1 x1Var1115 = x1Var1114;
                            final g2 g2Var19 = g2Var18;
                            final int i56 = i52;
                            final int i57 = i53;
                            androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVar25, -839984881, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar31, int i58) {
                                    if ((i58 & 11) == 2 && pVar31.b()) {
                                        pVar31.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-839984881, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                    }
                                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11327a;
                                    boolean z33 = z30;
                                    boolean z34 = z32;
                                    androidx.compose.foundation.interaction.g gVar110 = gVar19;
                                    x1 x1Var1116 = x1Var1115;
                                    g2 g2Var110 = g2Var19;
                                    int i59 = 12582912 | ((i56 >> 9) & 14);
                                    int i60 = i57;
                                    textFieldDefaults3.b(z33, z34, gVar110, x1Var1116, g2Var110, 0.0f, 0.0f, pVar31, i59 | (i60 & 112) | ((i60 >> 15) & bb.c.b.f30796me) | ((i60 >> 18) & bb.c.g.f32954lc) | ((i60 >> 12) & 57344), 96);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar31, Integer num) {
                                    a(pVar31, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            int i58 = i52;
                            int i59 = (i58 & 14) | ((i55 << 3) & 112) | ((i58 >> 3) & bb.c.b.f30796me);
                            int i60 = i53;
                            textFieldDefaults2.c(str2, innerTextField, z30, z31, m0Var19, gVar19, z32, pVar26, pVar27, pVar28, pVar29, pVar30, x1Var1115, null, aVarB2, pVar25, i59 | ((i60 >> 6) & bb.c.g.f32954lc) | (57344 & (i60 << 6)) | (458752 & (i60 >> 6)) | (3670016 & (i60 << 15)) | (29360128 & (i58 << 3)) | (234881024 & (i58 << 3)) | (1879048192 & (i58 << 3)), ((i58 >> 27) & 14) | 221184 | ((i60 << 3) & 112) | ((i60 >> 21) & bb.c.b.f30796me), 8192);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends kotlin.b2> pVar25, androidx.compose.runtime.p pVar26, Integer num) {
                            a(pVar25, pVar26, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i54 = i41115;
                    int i55 = (i54 & 14) | (i54 & 112) | (i54 & bb.c.g.f32954lc);
                    int i56 = i41;
                    BasicTextFieldKt.b(str, lVar, nVarG, z211111116, z211111117, textStyle18, keyboardOptions18, iVar18, z211111118, i51, m0Var18, null, gVar18, solidColor, aVarB, pVar111111119, (i54 & 57344) | i55 | (3670016 & (i56 << 9)) | (androidx.compose.foundation.text.i.f8073h << 21) | (29360128 & (i56 << 9)) | (234881024 & (i56 << 9)) | (1879048192 & (i56 << 9)), ((i56 >> 6) & 14) | 24576 | ((i56 >> 15) & bb.c.b.f30796me), 2048);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111119, Integer num) {
                    a(pVar111111119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVar8, 56);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar2 = nVar;
            pVar9 = pVar2;
            pVar10 = pVar3;
            pVar11 = pVar4;
            pVar12 = pVar5;
            z16 = z12;
            m0Var2 = m0Var;
            keyboardOptions2 = keyboardOptions;
            iVar2 = iVar;
            gVar2 = gVar;
            g2Var2 = g2Var;
            x1Var2 = x1Var1112;
            textStyle2 = textStyle17;
            z17 = z211111113;
            z18 = z11;
            pVar13 = pVar;
            z19 = z13;
            i42 = i10;
        }
        u1VarH = pVar8.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar111111119, int i41117) {
                OutlinedTextFieldKt.b(value, onValueChange, nVar2, z17, z18, textStyle2, pVar13, pVar9, pVar10, pVar11, pVar12, z16, m0Var2, keyboardOptions2, iVar2, z19, i42, gVar2, g2Var2, x1Var2, pVar111111119, i11 | 1, i12, i13);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111119, Integer num) {
                a(pVar111111119, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(@dl.d final androidx.compose.ui.n modifier, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> textField, @dl.e final yh.q<? super androidx.compose.ui.n, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, final boolean z10, final float f10, @dl.d final yh.l<? super b1.m, kotlin.b2> onLabelMeasured, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> container, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, @dl.d final androidx.compose.foundation.layout.m0 paddingValues, @dl.e androidx.compose.runtime.p pVar5, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        kotlin.jvm.internal.f0.p(textField, "textField");
        kotlin.jvm.internal.f0.p(onLabelMeasured, "onLabelMeasured");
        kotlin.jvm.internal.f0.p(container, "container");
        kotlin.jvm.internal.f0.p(paddingValues, "paddingValues");
        androidx.compose.runtime.p pVarF = pVar5.F(-222199799);
        int i13 = (i10 & 14) == 0 ? (pVarF.s(modifier) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i13 |= pVarF.s(textField) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i13 |= pVarF.s(qVar) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i13 |= pVarF.s(pVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i13 |= pVarF.s(pVar2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i13 |= pVarF.s(pVar3) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i13 |= pVarF.u(z10) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i13 |= pVarF.w(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i13 |= pVarF.s(onLabelMeasured) ? 67108864 : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i13 |= pVarF.s(container) ? 536870912 : 268435456;
        }
        int i14 = (i11 & 14) == 0 ? i11 | (pVarF.s(pVar4) ? 4 : 2) : i11;
        if ((i11 & 112) == 0) {
            i14 |= pVarF.s(paddingValues) ? 32 : 16;
        }
        if ((i13 & 1533916891) == 306783378 && (i14 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-222199799, i13, i14, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:377)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z10), Float.valueOf(f10), paddingValues};
            pVarF.T(-568225417);
            int i15 = i14;
            int i16 = 0;
            boolean zS = false;
            for (int i17 = 4; i16 < i17; i17 = 4) {
                zS |= pVarF.s(objArr[i16]);
                i16++;
            }
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z10, f10, paddingValues);
                pVarF.N(objU);
            }
            pVarF.c0();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objU;
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            pVarF.T(-1323940314);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(modifier);
            int i18 = ((((i13 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB = Updater.b(pVarF);
            Updater.j(pVarB, outlinedTextFieldMeasurePolicy, companion.d());
            Updater.j(pVarB, eVar, companion.b());
            Updater.j(pVarB, layoutDirection2, companion.c());
            Updater.j(pVarB, d2Var, companion.f());
            pVarF.x();
            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i18 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(-147819150);
            if (((i18 >> 9) & 14 & 11) == 2 && pVarF.b()) {
                pVarF.l();
            } else {
                container.invoke(pVarF, Integer.valueOf((i13 >> 27) & 14));
                pVarF.T(1116449790);
                if (pVar2 != null) {
                    androidx.compose.ui.n nVarS0 = LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, TextFieldImplKt.f11417d).s0(TextFieldImplKt.d());
                    androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    yh.a<ComposeUiNode> aVarA2 = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarS0);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA2);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
                    Updater.j(pVarB2, i0VarK, companion.d());
                    Updater.j(pVarB2, eVar2, companion.b());
                    Updater.j(pVarB2, layoutDirection3, companion.c());
                    Updater.j(pVarB2, d2Var2, companion.f());
                    pVarF.x();
                    qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                    pVarF.T(2127001777);
                    pVar2.invoke(pVarF, Integer.valueOf((i13 >> 12) & 14));
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                }
                pVarF.c0();
                pVarF.T(1116450075);
                if (pVar3 != null) {
                    androidx.compose.ui.n nVarS1 = LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, TextFieldImplKt.f11418e).s0(TextFieldImplKt.d());
                    androidx.compose.ui.c cVarI2 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(cVarI2, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    yh.a<ComposeUiNode> aVarA3 = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarS1);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA3);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
                    Updater.j(pVarB3, i0VarK2, companion.d());
                    Updater.j(pVarB3, eVar3, companion.b());
                    Updater.j(pVarB3, layoutDirection4, companion.c());
                    Updater.j(pVarB3, d2Var3, companion.f());
                    pVarF.x();
                    qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                    pVarF.T(-827051110);
                    pVar3.invoke(pVarF, Integer.valueOf((i13 >> 15) & 14));
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                }
                pVarF.c0();
                float fI = PaddingKt.i(paddingValues, layoutDirection);
                float fH = PaddingKt.h(paddingValues, layoutDirection);
                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                if (pVar2 != null) {
                    i12 = 0;
                    fI = s1.h.g(fi.u.t(s1.h.g(fI - TextFieldImplKt.c()), s1.h.g(0)));
                } else {
                    i12 = 0;
                }
                float f11 = fI;
                if (pVar3 != null) {
                    fH = s1.h.g(fi.u.t(s1.h.g(fH - TextFieldImplKt.c()), s1.h.g(i12)));
                }
                androidx.compose.ui.n nVarO = PaddingKt.o(companion2, f11, 0.0f, fH, 0.0f, 10, null);
                pVarF.T(1116451086);
                if (qVar != null) {
                    qVar.invoke(LayoutIdKt.b(companion2, TextFieldImplKt.f11415b).s0(nVarO), pVarF, Integer.valueOf((i13 >> 3) & 112));
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS2 = LayoutIdKt.b(companion2, TextFieldImplKt.f11414a).s0(nVarO);
                pVarF.T(733328855);
                androidx.compose.ui.c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
                androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(companion3.C(), true, pVarF, 48);
                pVarF.T(-1323940314);
                s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                yh.a<ComposeUiNode> aVarA4 = companion.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF4 = LayoutKt.f(nVarS2);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA4);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
                Updater.j(pVarB4, i0VarK3, companion.d());
                Updater.j(pVarB4, eVar4, companion.b());
                Updater.j(pVarB4, layoutDirection5, companion.c());
                Updater.j(pVarB4, d2Var4, companion.f());
                pVarF.x();
                qVarF4.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f5954a;
                pVarF.T(-475693524);
                textField.invoke(pVarF, Integer.valueOf((i13 >> 3) & 14));
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                pVarF.T(1116451412);
                if (pVar != null) {
                    androidx.compose.ui.n nVarB = LayoutIdKt.b(companion2, "Label");
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK4 = BoxKt.k(companion3.C(), false, pVarF, 0);
                    pVarF.T(-1323940314);
                    s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection6 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var5 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    yh.a<ComposeUiNode> aVarA5 = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF5 = LayoutKt.f(nVarB);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA5);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB5 = Updater.b(pVarF);
                    Updater.j(pVarB5, i0VarK4, companion.d());
                    Updater.j(pVarB5, eVar5, companion.b());
                    Updater.j(pVarB5, layoutDirection6, companion.c());
                    Updater.j(pVarB5, d2Var5, companion.f());
                    pVarF.x();
                    qVarF5.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    pVarF.T(-1527117480);
                    pVar.invoke(pVarF, Integer.valueOf((i13 >> 9) & 14));
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                }
                pVarF.c0();
                if (pVar4 != null) {
                    androidx.compose.ui.n nVarJ = PaddingKt.j(LayoutIdKt.b(companion2, TextFieldImplKt.f11419f), TextFieldDefaults.q(TextFieldDefaults.f11327a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK5 = BoxKt.k(companion3.C(), false, pVarF, 0);
                    pVarF.T(-1323940314);
                    s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection7 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var6 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    yh.a<ComposeUiNode> aVarA6 = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF6 = LayoutKt.f(nVarJ);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA6);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB6 = Updater.b(pVarF);
                    Updater.j(pVarB6, i0VarK5, companion.d());
                    Updater.j(pVarB6, eVar6, companion.b());
                    Updater.j(pVarB6, layoutDirection7, companion.c());
                    Updater.j(pVarB6, d2Var6, companion.f());
                    pVarF.x();
                    qVarF6.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    pVarF.T(270332983);
                    pVar4.invoke(pVarF, Integer.valueOf(i15 & 14));
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                }
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar6, int i19) {
                OutlinedTextFieldKt.c(modifier, textField, qVar, pVar, pVar2, pVar3, z10, f10, onLabelMeasured, container, pVar4, paddingValues, pVar6, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                a(pVar6, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, int i15, long j10, float f10, androidx.compose.foundation.layout.m0 m0Var) {
        return Math.max(s1.b.q(j10), Math.max(i10, Math.max(i11, di.d.L0(Math.max(i12, i14) + (m0Var.getBottom() * f10) + Math.max(m0Var.getTop() * f10, i13 / 2.0f)))) + i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i10, int i11, int i12, int i13, int i14, boolean z10, long j10, float f10, androidx.compose.foundation.layout.m0 m0Var) {
        int iL0 = 0;
        int iMax = i10 + Math.max(i12, Math.max(z10 ? i13 : 0, i14)) + i11;
        if (!z10) {
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            iL0 = i13 + di.d.L0(s1.h.g(m0Var.b(layoutDirection) + m0Var.c(layoutDirection)) * f10);
        }
        return Math.max(iMax, Math.max(iL0, s1.b.r(j10)));
    }

    public static final float j() {
        return f10123b;
    }

    @dl.d
    public static final androidx.compose.ui.n k(@dl.d androidx.compose.ui.n outlineCutout, final long j10, @dl.d final androidx.compose.foundation.layout.m0 paddingValues) {
        kotlin.jvm.internal.f0.p(outlineCutout, "$this$outlineCutout");
        kotlin.jvm.internal.f0.p(paddingValues, "paddingValues");
        return DrawModifierKt.c(outlineCutout, new yh.l<androidx.compose.ui.graphics.drawscope.d, kotlin.b2>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1

            /* JADX INFO: compiled from: OutlinedTextField.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f10276a;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    f10276a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d drawWithContent) {
                kotlin.jvm.internal.f0.p(drawWithContent, "$this$drawWithContent");
                float fT = b1.m.t(j10);
                if (fT <= 0.0f) {
                    drawWithContent.T0();
                    return;
                }
                float fE1 = drawWithContent.E1(OutlinedTextFieldKt.f10122a);
                float fE2 = drawWithContent.E1(paddingValues.b(drawWithContent.getLayoutDirection())) - fE1;
                float f10 = 2;
                float fT2 = fT + fE2 + (fE1 * f10);
                LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
                int[] iArr = a.f10276a;
                float fT3 = iArr[layoutDirection.ordinal()] == 1 ? b1.m.t(drawWithContent.c()) - fT2 : fi.u.t(fE2, 0.0f);
                if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                    fT2 = b1.m.t(drawWithContent.c()) - fi.u.t(fE2, 0.0f);
                }
                float f11 = fT2;
                float fM = b1.m.m(j10);
                float f12 = (-fM) / f10;
                float f13 = fM / f10;
                int iA = androidx.compose.ui.graphics.k0.INSTANCE.a();
                androidx.compose.ui.graphics.drawscope.e drawContext = drawWithContent.getDrawContext();
                long jC = drawContext.c();
                drawContext.a().f();
                drawContext.getTransform().a(fT3, f12, f11, f13, iA);
                drawWithContent.T0();
                drawContext.a().u();
                drawContext.b(jC);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                a(dVar);
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(androidx.compose.ui.layout.e1.a aVar, int i10, int i11, androidx.compose.ui.layout.e1 e1Var, androidx.compose.ui.layout.e1 e1Var2, androidx.compose.ui.layout.e1 e1Var3, androidx.compose.ui.layout.e1 e1Var4, androidx.compose.ui.layout.e1 e1Var5, androidx.compose.ui.layout.e1 e1Var6, androidx.compose.ui.layout.e1 e1Var7, float f10, boolean z10, float f11, LayoutDirection layoutDirection, androidx.compose.foundation.layout.m0 m0Var) {
        androidx.compose.ui.layout.e1.a.r(aVar, e1Var6, s1.n.f139237b.a(), 0.0f, 2, null);
        int i12 = i10 - TextFieldImplKt.i(e1Var7);
        int iL0 = di.d.L0(m0Var.getTop() * f11);
        int iL1 = di.d.L0(PaddingKt.i(m0Var, layoutDirection) * f11);
        float fC = TextFieldImplKt.c() * f11;
        if (e1Var != null) {
            androidx.compose.ui.layout.e1.a.v(aVar, e1Var, 0, androidx.compose.ui.c.INSTANCE.q().a(e1Var.getHeight(), i12), 0.0f, 4, null);
        }
        if (e1Var2 != null) {
            androidx.compose.ui.layout.e1.a.v(aVar, e1Var2, i11 - e1Var2.getWidth(), androidx.compose.ui.c.INSTANCE.q().a(e1Var2.getHeight(), i12), 0.0f, 4, null);
        }
        if (e1Var4 != null) {
            float f12 = 1 - f10;
            androidx.compose.ui.layout.e1.a.v(aVar, e1Var4, di.d.L0(e1Var == null ? 0.0f : f12 * (TextFieldImplKt.j(e1Var) - fC)) + iL1, di.d.L0(((z10 ? androidx.compose.ui.c.INSTANCE.q().a(e1Var4.getHeight(), i12) : iL0) * f12) - ((e1Var4.getHeight() / 2) * f10)), 0.0f, 4, null);
        }
        androidx.compose.ui.layout.e1.a.v(aVar, e1Var3, TextFieldImplKt.j(e1Var), Math.max(z10 ? androidx.compose.ui.c.INSTANCE.q().a(e1Var3.getHeight(), i12) : iL0, TextFieldImplKt.i(e1Var4) / 2), 0.0f, 4, null);
        if (e1Var5 != null) {
            if (z10) {
                iL0 = androidx.compose.ui.c.INSTANCE.q().a(e1Var5.getHeight(), i12);
            }
            androidx.compose.ui.layout.e1.a.v(aVar, e1Var5, TextFieldImplKt.j(e1Var), iL0, 0.0f, 4, null);
        }
        if (e1Var7 != null) {
            androidx.compose.ui.layout.e1.a.v(aVar, e1Var7, 0, i12, 0.0f, 4, null);
        }
    }
}

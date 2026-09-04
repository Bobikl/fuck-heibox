package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.accessibility.a0;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.util.Predicate;
import io.flutter.util.ViewUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class AccessibilityBridge extends AccessibilityNodeProvider {
    private static final int ACTION_SHOW_ON_SCREEN = 16908342;
    private static final int BOLD_TEXT_WEIGHT_ADJUSTMENT = 300;
    private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
    private static final int ROOT_NODE_ID = 0;
    private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
    private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
    private static final String TAG = "AccessibilityBridge";

    @n0
    private final AccessibilityChannel accessibilityChannel;
    private int accessibilityFeatureFlags;

    @p0
    private SemanticsNode accessibilityFocusedSemanticsNode;

    @n0
    private final AccessibilityManager accessibilityManager;
    private final AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler;
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;

    @n0
    private final AccessibilityViewEmbedder accessibilityViewEmbedder;
    private boolean accessibleNavigation;
    private final ContentObserver animationScaleObserver;

    @n0
    private final ContentResolver contentResolver;

    @n0
    private final Map<Integer, CustomAccessibilityAction> customAccessibilityActions;
    private Integer embeddedAccessibilityFocusedNodeId;
    private Integer embeddedInputFocusedNodeId;

    @n0
    private final List<Integer> flutterNavigationStack;

    @n0
    private final Map<Integer, SemanticsNode> flutterSemanticsTree;

    @p0
    private SemanticsNode hoveredObject;

    @p0
    private SemanticsNode inputFocusedSemanticsNode;
    private boolean isReleased;

    @p0
    private SemanticsNode lastInputFocusedSemanticsNode;

    @n0
    private Integer lastLeftFrameInset;

    @p0
    private OnAccessibilityChangeListener onAccessibilityChangeListener;

    @n0
    private final PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
    private int previousRouteId;

    @n0
    private final View rootAccessibilityView;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    private static final int SCROLLABLE_ACTIONS = ((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value;
    private static final int FOCUSABLE_FLAGS = ((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value;
    private static int FIRST_RESOURCE_ID = 267386881;
    static int systemAction = (Action.DID_GAIN_ACCESSIBILITY_FOCUS.value & Action.DID_LOSE_ACCESSIBILITY_FOCUS.value) & Action.SHOW_ON_SCREEN.value;

    /* JADX INFO: renamed from: io.flutter.view.AccessibilityBridge$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType;

        static {
            int[] iArr = new int[StringAttributeType.values().length];
            $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType = iArr;
            try {
                iArr[StringAttributeType.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[StringAttributeType.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);

        final int value;

        AccessibilityFeature(int i10) {
            this.value = i10;
        }
    }

    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);

        public final int value;

        Action(int i10) {
            this.value = i10;
        }
    }

    public static class CustomAccessibilityAction {
        private String hint;
        private String label;
        private int resourceId = -1;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private int f119491id = -1;
        private int overrideId = -1;

        CustomAccessibilityAction() {
        }
    }

    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);

        final int value;

        Flag(int i10) {
            this.value = i10;
        }
    }

    public static class LocaleStringAttribute extends StringAttribute {
        String locale;

        private LocaleStringAttribute() {
            super();
        }
    }

    public interface OnAccessibilityChangeListener {
        void onAccessibilityChanged(boolean z10, boolean z11);
    }

    public static class SemanticsNode {
        final AccessibilityBridge accessibilityBridge;
        private int actions;
        private float bottom;
        private int currentValueLength;
        private List<CustomAccessibilityAction> customAccessibilityActions;
        private String decreasedValue;
        private List<StringAttribute> decreasedValueAttributes;
        private int flags;
        private Rect globalRect;
        private float[] globalTransform;
        private String hint;
        private List<StringAttribute> hintAttributes;
        private String identifier;
        private String increasedValue;
        private List<StringAttribute> increasedValueAttributes;
        private float[] inverseTransform;
        private String label;
        private List<StringAttribute> labelAttributes;
        private float left;
        private int maxValueLength;
        private CustomAccessibilityAction onLongPressOverride;
        private CustomAccessibilityAction onTapOverride;
        private SemanticsNode parent;
        private int platformViewId;
        private int previousActions;
        private int previousFlags;
        private String previousLabel;
        private float previousScrollExtentMax;
        private float previousScrollExtentMin;
        private float previousScrollPosition;
        private int previousTextSelectionBase;
        private int previousTextSelectionExtent;
        private String previousValue;
        private float right;
        private int scrollChildren;
        private float scrollExtentMax;
        private float scrollExtentMin;
        private int scrollIndex;
        private float scrollPosition;
        private TextDirection textDirection;
        private int textSelectionBase;
        private int textSelectionExtent;

        @p0
        private String tooltip;
        private float top;
        private float[] transform;
        private String value;
        private List<StringAttribute> valueAttributes;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private int f119492id = -1;
        private int previousNodeId = -1;
        private boolean hadPreviousConfig = false;
        private List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
        private List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
        private boolean inverseTransformDirty = true;
        private boolean globalGeometryDirty = true;

        SemanticsNode(@n0 AccessibilityBridge accessibilityBridge) {
            this.accessibilityBridge = accessibilityBridge;
        }

        static /* synthetic */ int access$2212(SemanticsNode semanticsNode, int i10) {
            int i11 = semanticsNode.textSelectionExtent + i10;
            semanticsNode.textSelectionExtent = i11;
            return i11;
        }

        static /* synthetic */ int access$2220(SemanticsNode semanticsNode, int i10) {
            int i11 = semanticsNode.textSelectionExtent - i10;
            semanticsNode.textSelectionExtent = i11;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void collectRoutes(List<SemanticsNode> list) {
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<SemanticsNode> it = this.childrenInTraversalOrder.iterator();
            while (it.hasNext()) {
                it.next().collectRoutes(list);
            }
        }

        private SpannableString createSpannableString(String str, List<StringAttribute> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (StringAttribute stringAttribute : list) {
                    int i10 = AnonymousClass5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[stringAttribute.type.ordinal()];
                    if (i10 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), stringAttribute.start, stringAttribute.end, 0);
                    } else if (i10 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((LocaleStringAttribute) stringAttribute).locale)), stringAttribute.start, stringAttribute.end, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean didChangeLabel() {
            String str;
            String str2 = this.label;
            if (str2 == null && this.previousLabel == null) {
                return false;
            }
            return str2 == null || (str = this.previousLabel) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean didScroll() {
            return (Float.isNaN(this.scrollPosition) || Float.isNaN(this.previousScrollPosition) || this.previousScrollPosition == this.scrollPosition) ? false : true;
        }

        private void ensureInverseTransform() {
            if (this.inverseTransformDirty) {
                this.inverseTransformDirty = false;
                if (this.inverseTransform == null) {
                    this.inverseTransform = new float[16];
                }
                if (Matrix.invertM(this.inverseTransform, 0, this.transform, 0)) {
                    return;
                }
                Arrays.fill(this.inverseTransform, 0.0f);
            }
        }

        private SemanticsNode getAncestor(Predicate<SemanticsNode> predicate) {
            for (SemanticsNode semanticsNode = this.parent; semanticsNode != null; semanticsNode = semanticsNode.parent) {
                if (predicate.test(semanticsNode)) {
                    return semanticsNode;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect getGlobalRect() {
            return this.globalRect;
        }

        private CharSequence getHint() {
            return createSpannableString(this.hint, this.hintAttributes);
        }

        private CharSequence getLabel() {
            return createSpannableString(this.label, this.labelAttributes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getRouteName() {
            String str;
            if (hasFlag(Flag.NAMES_ROUTE) && (str = this.label) != null && !str.isEmpty()) {
                return this.label;
            }
            Iterator<SemanticsNode> it = this.childrenInTraversalOrder.iterator();
            while (it.hasNext()) {
                String routeName = it.next().getRouteName();
                if (routeName != null && !routeName.isEmpty()) {
                    return routeName;
                }
            }
            return null;
        }

        private List<StringAttribute> getStringAttributesFromBuffer(@n0 ByteBuffer byteBuffer, @n0 ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                StringAttributeType stringAttributeType = StringAttributeType.values()[byteBuffer.getInt()];
                int i14 = AnonymousClass5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[stringAttributeType.ordinal()];
                if (i14 == 1) {
                    byteBuffer.getInt();
                    SpellOutStringAttribute spellOutStringAttribute = new SpellOutStringAttribute();
                    spellOutStringAttribute.start = i12;
                    spellOutStringAttribute.end = i13;
                    spellOutStringAttribute.type = stringAttributeType;
                    arrayList.add(spellOutStringAttribute);
                } else if (i14 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    LocaleStringAttribute localeStringAttribute = new LocaleStringAttribute();
                    localeStringAttribute.start = i12;
                    localeStringAttribute.end = i13;
                    localeStringAttribute.type = stringAttributeType;
                    localeStringAttribute.locale = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(localeStringAttribute);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence getTextFieldHint() {
            CharSequence[] charSequenceArr = {getLabel(), getHint()};
            CharSequence charSequenceConcat = null;
            for (int i10 = 0; i10 < 2; i10++) {
                CharSequence charSequence = charSequenceArr[i10];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence getValue() {
            return createSpannableString(this.value, this.valueAttributes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence getValueLabelHint() {
            CharSequence[] charSequenceArr = {getValue(), getLabel(), getHint()};
            CharSequence charSequenceConcat = null;
            for (int i10 = 0; i10 < 3; i10++) {
                CharSequence charSequence = charSequenceArr[i10];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hadAction(@n0 Action action) {
            return (action.value & this.previousActions) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hadFlag(@n0 Flag flag) {
            return (flag.value & this.previousFlags) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasAction(@n0 Action action) {
            return (action.value & this.actions) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasFlag(@n0 Flag flag) {
            return (flag.value & this.flags) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SemanticsNode hitTest(float[] fArr, boolean z10) {
            float f10 = fArr[3];
            boolean z11 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 < this.left || f11 >= this.right || f12 < this.top || f12 >= this.bottom) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (SemanticsNode semanticsNode : this.childrenInHitTestOrder) {
                if (!semanticsNode.hasFlag(Flag.IS_HIDDEN)) {
                    semanticsNode.ensureInverseTransform();
                    Matrix.multiplyMV(fArr2, 0, semanticsNode.inverseTransform, 0, fArr, 0);
                    SemanticsNode semanticsNodeHitTest = semanticsNode.hitTest(fArr2, z10);
                    if (semanticsNodeHitTest != null) {
                        return semanticsNodeHitTest;
                    }
                }
            }
            if (z10 && this.platformViewId != -1) {
                z11 = true;
            }
            if (isFocusable() || z11) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isFocusable() {
            String str;
            String str2;
            String str3;
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                return false;
            }
            if (hasFlag(Flag.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.actions & (~AccessibilityBridge.SCROLLABLE_ACTIONS)) == 0 && (this.flags & AccessibilityBridge.FOCUSABLE_FLAGS) == 0 && ((str = this.label) == null || str.isEmpty()) && (((str2 = this.value) == null || str2.isEmpty()) && ((str3 = this.hint) == null || str3.isEmpty()))) ? false : true;
        }

        private void log(@n0 String str, boolean z10) {
        }

        private float max(float f10, float f11, float f12, float f13) {
            return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        }

        private float min(float f10, float f11, float f12, float f13) {
            return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean nullableHasAncestor(SemanticsNode semanticsNode, Predicate<SemanticsNode> predicate) {
            return (semanticsNode == null || semanticsNode.getAncestor(predicate) == null) ? false : true;
        }

        private void transformPoint(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateRecursively(float[] fArr, Set<SemanticsNode> set, boolean z10) {
            set.add(this);
            if (this.globalGeometryDirty) {
                z10 = true;
            }
            if (z10) {
                if (this.globalTransform == null) {
                    this.globalTransform = new float[16];
                }
                if (this.transform == null) {
                    this.transform = new float[16];
                }
                Matrix.multiplyMM(this.globalTransform, 0, fArr, 0, this.transform, 0);
                float[] fArr2 = {this.left, this.top, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                transformPoint(fArr3, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.top;
                transformPoint(fArr4, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.bottom;
                transformPoint(fArr5, this.globalTransform, fArr2);
                fArr2[0] = this.left;
                fArr2[1] = this.bottom;
                transformPoint(fArr6, this.globalTransform, fArr2);
                if (this.globalRect == null) {
                    this.globalRect = new Rect();
                }
                this.globalRect.set(Math.round(min(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(min(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(max(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(max(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.globalGeometryDirty = false;
            }
            int i10 = -1;
            for (SemanticsNode semanticsNode : this.childrenInTraversalOrder) {
                semanticsNode.previousNodeId = i10;
                i10 = semanticsNode.f119492id;
                semanticsNode.updateRecursively(this.globalTransform, set, z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateWith(@n0 ByteBuffer byteBuffer, @n0 String[] strArr, @n0 ByteBuffer[] byteBufferArr) {
            this.hadPreviousConfig = true;
            this.previousValue = this.value;
            this.previousLabel = this.label;
            this.previousFlags = this.flags;
            this.previousActions = this.actions;
            this.previousTextSelectionBase = this.textSelectionBase;
            this.previousTextSelectionExtent = this.textSelectionExtent;
            this.previousScrollPosition = this.scrollPosition;
            this.previousScrollExtentMax = this.scrollExtentMax;
            this.previousScrollExtentMin = this.scrollExtentMin;
            this.flags = byteBuffer.getInt();
            this.actions = byteBuffer.getInt();
            this.maxValueLength = byteBuffer.getInt();
            this.currentValueLength = byteBuffer.getInt();
            this.textSelectionBase = byteBuffer.getInt();
            this.textSelectionExtent = byteBuffer.getInt();
            this.platformViewId = byteBuffer.getInt();
            this.scrollChildren = byteBuffer.getInt();
            this.scrollIndex = byteBuffer.getInt();
            this.scrollPosition = byteBuffer.getFloat();
            this.scrollExtentMax = byteBuffer.getFloat();
            this.scrollExtentMin = byteBuffer.getFloat();
            int i10 = byteBuffer.getInt();
            this.identifier = i10 == -1 ? null : strArr[i10];
            int i11 = byteBuffer.getInt();
            this.label = i11 == -1 ? null : strArr[i11];
            this.labelAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.value = i12 == -1 ? null : strArr[i12];
            this.valueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.increasedValue = i13 == -1 ? null : strArr[i13];
            this.increasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            this.decreasedValue = i14 == -1 ? null : strArr[i14];
            this.decreasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            this.hint = i15 == -1 ? null : strArr[i15];
            this.hintAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i16 = byteBuffer.getInt();
            this.tooltip = i16 == -1 ? null : strArr[i16];
            this.textDirection = TextDirection.fromInt(byteBuffer.getInt());
            this.left = byteBuffer.getFloat();
            this.top = byteBuffer.getFloat();
            this.right = byteBuffer.getFloat();
            this.bottom = byteBuffer.getFloat();
            if (this.transform == null) {
                this.transform = new float[16];
            }
            for (int i17 = 0; i17 < 16; i17++) {
                this.transform[i17] = byteBuffer.getFloat();
            }
            this.inverseTransformDirty = true;
            this.globalGeometryDirty = true;
            int i18 = byteBuffer.getInt();
            this.childrenInTraversalOrder.clear();
            this.childrenInHitTestOrder.clear();
            for (int i19 = 0; i19 < i18; i19++) {
                SemanticsNode orCreateSemanticsNode = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode.parent = this;
                this.childrenInTraversalOrder.add(orCreateSemanticsNode);
            }
            for (int i20 = 0; i20 < i18; i20++) {
                SemanticsNode orCreateSemanticsNode2 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode2.parent = this;
                this.childrenInHitTestOrder.add(orCreateSemanticsNode2);
            }
            int i21 = byteBuffer.getInt();
            if (i21 == 0) {
                this.customAccessibilityActions = null;
                return;
            }
            List<CustomAccessibilityAction> list = this.customAccessibilityActions;
            if (list == null) {
                this.customAccessibilityActions = new ArrayList(i21);
            } else {
                list.clear();
            }
            for (int i22 = 0; i22 < i21; i22++) {
                CustomAccessibilityAction orCreateAccessibilityAction = this.accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
                if (orCreateAccessibilityAction.overrideId == Action.TAP.value) {
                    this.onTapOverride = orCreateAccessibilityAction;
                } else if (orCreateAccessibilityAction.overrideId == Action.LONG_PRESS.value) {
                    this.onLongPressOverride = orCreateAccessibilityAction;
                } else {
                    this.customAccessibilityActions.add(orCreateAccessibilityAction);
                }
                this.customAccessibilityActions.add(orCreateAccessibilityAction);
            }
        }
    }

    public static class SpellOutStringAttribute extends StringAttribute {
        private SpellOutStringAttribute() {
            super();
        }
    }

    public static class StringAttribute {
        int end;
        int start;
        StringAttributeType type;

        private StringAttribute() {
        }
    }

    public enum StringAttributeType {
        SPELLOUT,
        LOCALE
    }

    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static TextDirection fromInt(int i10) {
            if (i10 != 1) {
                return i10 != 2 ? UNKNOWN : LTR;
            }
            return RTL;
        }
    }

    public AccessibilityBridge(@n0 View view, @n0 AccessibilityChannel accessibilityChannel, @n0 AccessibilityManager accessibilityManager, @n0 ContentResolver contentResolver, @n0 PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this(view, accessibilityChannel, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), platformViewsAccessibilityDelegate);
    }

    @j1
    public AccessibilityBridge(@n0 View view, @n0 AccessibilityChannel accessibilityChannel, @n0 final AccessibilityManager accessibilityManager, @n0 ContentResolver contentResolver, @n0 AccessibilityViewEmbedder accessibilityViewEmbedder, @n0 PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this.flutterSemanticsTree = new HashMap();
        this.customAccessibilityActions = new HashMap();
        this.accessibilityFeatureFlags = 0;
        this.flutterNavigationStack = new ArrayList();
        this.previousRouteId = 0;
        this.lastLeftFrameInset = 0;
        this.accessibleNavigation = false;
        this.isReleased = false;
        this.accessibilityMessageHandler = new AccessibilityChannel.AccessibilityMessageHandler() { // from class: io.flutter.view.AccessibilityBridge.1
            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void announce(@n0 String str) {
                AccessibilityBridge.this.rootAccessibilityView.announceForAccessibility(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onFocus(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 8);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onLongPress(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 2);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onTap(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 1);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onTooltip(@n0 String str) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                AccessibilityEvent accessibilityEventObtainAccessibilityEvent = AccessibilityBridge.this.obtainAccessibilityEvent(0, 32);
                accessibilityEventObtainAccessibilityEvent.getText().add(str);
                AccessibilityBridge.this.sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                AccessibilityBridge.this.updateCustomAccessibilityActions(byteBuffer, strArr);
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                for (ByteBuffer byteBuffer2 : byteBufferArr) {
                    byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
                }
                AccessibilityBridge.this.updateSemantics(byteBuffer, strArr, byteBufferArr);
            }
        };
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.2
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public void onAccessibilityStateChanged(boolean z10) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (z10) {
                    AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(AccessibilityBridge.this.accessibilityMessageHandler);
                    AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
                } else {
                    AccessibilityBridge.this.setAccessibleNavigation(false);
                    AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(null);
                    AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
                }
                if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(z10, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
                }
            }
        };
        this.accessibilityStateChangeListener = accessibilityStateChangeListener;
        ContentObserver contentObserver = new ContentObserver(new Handler()) { // from class: io.flutter.view.AccessibilityBridge.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                onChange(z10, null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10, Uri uri) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                String string = Settings.Global.getString(AccessibilityBridge.this.contentResolver, "transition_animation_scale");
                if (string != null && string.equals("0")) {
                    AccessibilityBridge.access$1176(AccessibilityBridge.this, AccessibilityFeature.DISABLE_ANIMATIONS.value);
                } else {
                    AccessibilityBridge.access$1172(AccessibilityBridge.this, ~AccessibilityFeature.DISABLE_ANIMATIONS.value);
                }
                AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
            }
        };
        this.animationScaleObserver = contentObserver;
        this.rootAccessibilityView = view;
        this.accessibilityChannel = accessibilityChannel;
        this.accessibilityManager = accessibilityManager;
        this.contentResolver = contentResolver;
        this.accessibilityViewEmbedder = accessibilityViewEmbedder;
        this.platformViewsAccessibilityDelegate = platformViewsAccessibilityDelegate;
        accessibilityStateChangeListener.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.4
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public void onTouchExplorationStateChanged(boolean z10) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (!z10) {
                    AccessibilityBridge.this.setAccessibleNavigation(false);
                    AccessibilityBridge.this.onTouchExplorationExit();
                }
                if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(accessibilityManager.isEnabled(), z10);
                }
            }
        };
        this.touchExplorationStateChangeListener = touchExplorationStateChangeListener;
        touchExplorationStateChangeListener.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        contentObserver.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, contentObserver);
        if (Build.VERSION.SDK_INT >= 31) {
            setBoldTextFlag();
        }
        platformViewsAccessibilityDelegate.attachAccessibilityBridge(this);
    }

    static /* synthetic */ int access$1172(AccessibilityBridge accessibilityBridge, int i10) {
        int i11 = i10 & accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i11;
        return i11;
    }

    static /* synthetic */ int access$1176(AccessibilityBridge accessibilityBridge, int i10) {
        int i11 = i10 | accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i11;
        return i11;
    }

    private AccessibilityEvent createTextChangedEvent(int i10, String str, String str2) {
        AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(i10, 16);
        accessibilityEventObtainAccessibilityEvent.setBeforeText(str);
        accessibilityEventObtainAccessibilityEvent.getText().add(str2);
        int i11 = 0;
        while (i11 < str.length() && i11 < str2.length() && str.charAt(i11) == str2.charAt(i11)) {
            i11++;
        }
        if (i11 >= str.length() && i11 >= str2.length()) {
            return null;
        }
        accessibilityEventObtainAccessibilityEvent.setFromIndex(i11);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i11 && length2 >= i11 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        accessibilityEventObtainAccessibilityEvent.setRemovedCount((length - i11) + 1);
        accessibilityEventObtainAccessibilityEvent.setAddedCount((length2 - i11) + 1);
        return accessibilityEventObtainAccessibilityEvent;
    }

    @w0(28)
    @TargetApi(28)
    private boolean doesLayoutInDisplayCutoutModeRequireLeftInset() {
        Activity activity = ViewUtils.getActivity(this.rootAccessibilityView.getContext());
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        int i10 = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i10 == 2 || i10 == 0;
    }

    private Rect getBoundsInScreen(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.rootAccessibilityView.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CustomAccessibilityAction getOrCreateAccessibilityAction(int i10) {
        CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i10));
        if (customAccessibilityAction != null) {
            return customAccessibilityAction;
        }
        CustomAccessibilityAction customAccessibilityAction2 = new CustomAccessibilityAction();
        customAccessibilityAction2.f119491id = i10;
        customAccessibilityAction2.resourceId = FIRST_RESOURCE_ID + i10;
        this.customAccessibilityActions.put(Integer.valueOf(i10), customAccessibilityAction2);
        return customAccessibilityAction2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SemanticsNode getOrCreateSemanticsNode(int i10) {
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i10));
        if (semanticsNode != null) {
            return semanticsNode;
        }
        SemanticsNode semanticsNode2 = new SemanticsNode(this);
        semanticsNode2.f119492id = i10;
        this.flutterSemanticsTree.put(Integer.valueOf(i10), semanticsNode2);
        return semanticsNode2;
    }

    private SemanticsNode getRootSemanticsNode() {
        return this.flutterSemanticsTree.get(0);
    }

    private void handleTouchExploration(float f10, float f11, boolean z10) {
        SemanticsNode semanticsNodeHitTest;
        if (this.flutterSemanticsTree.isEmpty() || (semanticsNodeHitTest = getRootSemanticsNode().hitTest(new float[]{f10, f11, 0.0f, 1.0f}, z10)) == this.hoveredObject) {
            return;
        }
        if (semanticsNodeHitTest != null) {
            sendAccessibilityEvent(semanticsNodeHitTest.f119492id, 128);
        }
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f119492id, 256);
        }
        this.hoveredObject = semanticsNodeHitTest;
    }

    private boolean isImportant(SemanticsNode semanticsNode) {
        if (semanticsNode.hasFlag(Flag.SCOPES_ROUTE)) {
            return false;
        }
        return (semanticsNode.getValueLabelHint() == null && (semanticsNode.actions & (~systemAction)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$0(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        return semanticsNode2 == semanticsNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$1(SemanticsNode semanticsNode) {
        return semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent obtainAccessibilityEvent(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(i11);
        accessibilityEventObtainAccessibilityEvent.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityEventObtainAccessibilityEvent.setSource(this.rootAccessibilityView, i10);
        return accessibilityEventObtainAccessibilityEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchExplorationExit() {
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f119492id, 256);
            this.hoveredObject = null;
        }
    }

    private void onWindowNameChange(@n0 SemanticsNode semanticsNode) {
        String routeName = semanticsNode.getRouteName();
        if (routeName == null) {
            routeName = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            setAccessibilityPaneTitle(routeName);
            return;
        }
        AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f119492id, 32);
        accessibilityEventObtainAccessibilityEvent.getText().add(routeName);
        sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
    }

    private boolean performCursorMoveAction(@n0 SemanticsNode semanticsNode, int i10, @n0 Bundle bundle, boolean z10) {
        int i11 = bundle.getInt(a0.R);
        boolean z11 = bundle.getBoolean(a0.T);
        int i12 = semanticsNode.textSelectionBase;
        int i13 = semanticsNode.textSelectionExtent;
        predictCursorMovement(semanticsNode, i11, z10, z11);
        if (i12 != semanticsNode.textSelectionBase || i13 != semanticsNode.textSelectionExtent) {
            String str = semanticsNode.value != null ? semanticsNode.value : "";
            AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f119492id, 8192);
            accessibilityEventObtainAccessibilityEvent.getText().add(str);
            accessibilityEventObtainAccessibilityEvent.setFromIndex(semanticsNode.textSelectionBase);
            accessibilityEventObtainAccessibilityEvent.setToIndex(semanticsNode.textSelectionExtent);
            accessibilityEventObtainAccessibilityEvent.setItemCount(str.length());
            sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
        }
        if (i11 == 1) {
            if (z10) {
                Action action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i10, action, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!semanticsNode.hasAction(action2)) {
                return false;
            }
            this.accessibilityChannel.dispatchSemanticsAction(i10, action2, Boolean.valueOf(z11));
            return true;
        }
        if (i11 != 2) {
            return i11 == 4 || i11 == 8 || i11 == 16;
        }
        if (z10) {
            Action action3 = Action.MOVE_CURSOR_FORWARD_BY_WORD;
            if (semanticsNode.hasAction(action3)) {
                this.accessibilityChannel.dispatchSemanticsAction(i10, action3, Boolean.valueOf(z11));
                return true;
            }
        }
        if (z10) {
            return false;
        }
        Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!semanticsNode.hasAction(action4)) {
            return false;
        }
        this.accessibilityChannel.dispatchSemanticsAction(i10, action4, Boolean.valueOf(z11));
        return true;
    }

    private boolean performSetText(SemanticsNode semanticsNode, int i10, @n0 Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey(a0.W)) ? "" : bundle.getString(a0.W);
        this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SET_TEXT, string);
        semanticsNode.value = string;
        semanticsNode.valueAttributes = null;
        return true;
    }

    private void predictCursorMovement(@n0 SemanticsNode semanticsNode, int i10, boolean z10, boolean z11) {
        if (semanticsNode.textSelectionExtent < 0 || semanticsNode.textSelectionBase < 0) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8 || i10 == 16) {
                        if (z10) {
                            semanticsNode.textSelectionExtent = semanticsNode.value.length();
                        } else {
                            semanticsNode.textSelectionExtent = 0;
                        }
                    }
                } else if (z10 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                    Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                    if (matcher.find()) {
                        SemanticsNode.access$2212(semanticsNode, matcher.start(1));
                    } else {
                        semanticsNode.textSelectionExtent = semanticsNode.value.length();
                    }
                } else if (!z10 && semanticsNode.textSelectionExtent > 0) {
                    Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                    if (matcher2.find()) {
                        semanticsNode.textSelectionExtent = matcher2.start(1);
                    } else {
                        semanticsNode.textSelectionExtent = 0;
                    }
                }
            } else if (z10 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                matcher3.find();
                if (matcher3.find()) {
                    SemanticsNode.access$2212(semanticsNode, matcher3.start(1));
                } else {
                    semanticsNode.textSelectionExtent = semanticsNode.value.length();
                }
            } else if (!z10 && semanticsNode.textSelectionExtent > 0) {
                Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                if (matcher4.find()) {
                    semanticsNode.textSelectionExtent = matcher4.start(1);
                }
            }
        } else if (z10 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
            SemanticsNode.access$2212(semanticsNode, 1);
        } else if (!z10 && semanticsNode.textSelectionExtent > 0) {
            SemanticsNode.access$2220(semanticsNode, 1);
        }
        if (z11) {
            return;
        }
        semanticsNode.textSelectionBase = semanticsNode.textSelectionExtent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAccessibilityEvent(@n0 AccessibilityEvent accessibilityEvent) {
        if (this.accessibilityManager.isEnabled()) {
            this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLatestAccessibilityFlagsToFlutter() {
        this.accessibilityChannel.setAccessibilityFeatures(this.accessibilityFeatureFlags);
    }

    private void sendWindowContentChangeEvent(int i10) {
        AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(i10, 2048);
        accessibilityEventObtainAccessibilityEvent.setContentChangeTypes(1);
        sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
    }

    @w0(28)
    @TargetApi(28)
    private void setAccessibilityPaneTitle(String str) {
        this.rootAccessibilityView.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessibleNavigation(boolean z10) {
        if (this.accessibleNavigation == z10) {
            return;
        }
        this.accessibleNavigation = z10;
        if (z10) {
            this.accessibilityFeatureFlags |= AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
        } else {
            this.accessibilityFeatureFlags &= ~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
        }
        sendLatestAccessibilityFlagsToFlutter();
    }

    @w0(31)
    @TargetApi(31)
    private void setBoldTextFlag() {
        View view = this.rootAccessibilityView;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i10 = this.rootAccessibilityView.getResources().getConfiguration().fontWeightAdjustment;
        if (i10 != Integer.MAX_VALUE && i10 >= 300) {
            this.accessibilityFeatureFlags |= AccessibilityFeature.BOLD_TEXT.value;
        } else {
            this.accessibilityFeatureFlags &= AccessibilityFeature.BOLD_TEXT.value;
        }
        sendLatestAccessibilityFlagsToFlutter();
    }

    private boolean shouldSetCollectionInfo(final SemanticsNode semanticsNode) {
        return semanticsNode.scrollChildren > 0 && (SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new Predicate() { // from class: io.flutter.view.a
            @Override // io.flutter.util.Predicate
            public final boolean test(Object obj) {
                return AccessibilityBridge.lambda$shouldSetCollectionInfo$0(semanticsNode, (AccessibilityBridge.SemanticsNode) obj);
            }
        }) || !SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new Predicate() { // from class: io.flutter.view.b
            @Override // io.flutter.util.Predicate
            public final boolean test(Object obj) {
                return AccessibilityBridge.lambda$shouldSetCollectionInfo$1((AccessibilityBridge.SemanticsNode) obj);
            }
        }));
    }

    private void willRemoveSemanticsNode(SemanticsNode semanticsNode) {
        View platformViewById;
        Integer num;
        semanticsNode.parent = null;
        if (semanticsNode.platformViewId != -1 && (num = this.embeddedAccessibilityFocusedNodeId) != null && this.accessibilityViewEmbedder.platformViewOfNode(num.intValue()) == this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) {
            sendAccessibilityEvent(this.embeddedAccessibilityFocusedNodeId.intValue(), 65536);
            this.embeddedAccessibilityFocusedNodeId = null;
        }
        if (semanticsNode.platformViewId != -1 && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) != null) {
            platformViewById.setImportantForAccessibility(4);
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 == semanticsNode) {
            sendAccessibilityEvent(semanticsNode2.f119492id, 65536);
            this.accessibilityFocusedSemanticsNode = null;
        }
        if (this.inputFocusedSemanticsNode == semanticsNode) {
            this.inputFocusedSemanticsNode = null;
        }
        if (this.hoveredObject == semanticsNode) {
            this.hoveredObject = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    @SuppressLint({"NewApi"})
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        int i11;
        boolean z10 = true;
        setAccessibleNavigation(true);
        if (i10 >= 65536) {
            return this.accessibilityViewEmbedder.createAccessibilityNodeInfo(i10);
        }
        if (i10 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(this.rootAccessibilityView);
            this.rootAccessibilityView.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtainAccessibilityNodeInfo);
            if (this.flutterSemanticsTree.containsKey(0)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo.addChild(this.rootAccessibilityView, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo.setImportantForAccessibility(false);
            }
            return accessibilityNodeInfoObtainAccessibilityNodeInfo;
        }
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i10));
        if (semanticsNode == null) {
            return null;
        }
        if (semanticsNode.platformViewId != -1 && this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode.platformViewId)) {
            View platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId);
            if (platformViewById == null) {
                return null;
            }
            return this.accessibilityViewEmbedder.getRootNode(platformViewById, semanticsNode.f119492id, semanticsNode.getGlobalRect());
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtainAccessibilityNodeInfo2 = obtainAccessibilityNodeInfo(this.rootAccessibilityView, i10);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setImportantForAccessibility(isImportant(semanticsNode));
        }
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setViewIdResourceName("");
        if (semanticsNode.identifier != null) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setViewIdResourceName(semanticsNode.identifier);
        }
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName(AndroidComposeViewAccessibilityDelegateCompat.f15475z);
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setSource(this.rootAccessibilityView, i10);
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setFocusable(semanticsNode.isFocusable());
        SemanticsNode semanticsNode2 = this.inputFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setFocused(semanticsNode2.f119492id == i10);
        }
        SemanticsNode semanticsNode3 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode3 != null) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setAccessibilityFocused(semanticsNode3.f119492id == i10);
        }
        Flag flag = Flag.IS_TEXT_FIELD;
        if (semanticsNode.hasFlag(flag)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setPassword(semanticsNode.hasFlag(Flag.IS_OBSCURED));
            Flag flag2 = Flag.IS_READ_ONLY;
            if (!semanticsNode.hasFlag(flag2)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.EditText");
            }
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setEditable(!semanticsNode.hasFlag(flag2));
            if (semanticsNode.textSelectionBase != -1 && semanticsNode.textSelectionExtent != -1) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setTextSelection(semanticsNode.textSelectionBase, semanticsNode.textSelectionExtent);
            }
            SemanticsNode semanticsNode4 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode4 != null && semanticsNode4.f119492id == i10) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setLiveRegion(1);
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(256);
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(512);
                i11 |= 1;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(256);
                i11 |= 2;
            }
            if (semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(512);
                i11 |= 2;
            }
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setMovementGranularities(i11);
            if (semanticsNode.maxValueLength >= 0) {
                int length = semanticsNode.value == null ? 0 : semanticsNode.value.length();
                int unused = semanticsNode.currentValueLength;
                int unused2 = semanticsNode.maxValueLength;
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setMaxTextLength((length - semanticsNode.currentValueLength) + semanticsNode.maxValueLength);
            }
        }
        if (semanticsNode.hasAction(Action.SET_SELECTION)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(131072);
        }
        if (semanticsNode.hasAction(Action.COPY)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(16384);
        }
        if (semanticsNode.hasAction(Action.CUT)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(65536);
        }
        if (semanticsNode.hasAction(Action.PASTE)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(32768);
        }
        if (semanticsNode.hasAction(Action.SET_TEXT)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(2097152);
        }
        if (semanticsNode.hasFlag(Flag.IS_BUTTON) || semanticsNode.hasFlag(Flag.IS_LINK)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.Button");
        }
        if (semanticsNode.hasFlag(Flag.IS_IMAGE)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.ImageView");
        }
        if (semanticsNode.hasAction(Action.DISMISS)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setDismissable(true);
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(1048576);
        }
        if (semanticsNode.parent != null) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setParent(this.rootAccessibilityView, semanticsNode.parent.f119492id);
        } else {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setParent(this.rootAccessibilityView);
        }
        if (semanticsNode.previousNodeId != -1) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setTraversalAfter(this.rootAccessibilityView, semanticsNode.previousNodeId);
        }
        Rect globalRect = semanticsNode.getGlobalRect();
        if (semanticsNode.parent != null) {
            Rect globalRect2 = semanticsNode.parent.getGlobalRect();
            Rect rect = new Rect(globalRect);
            rect.offset(-globalRect2.left, -globalRect2.top);
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setBoundsInParent(rect);
        } else {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setBoundsInParent(globalRect);
        }
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setBoundsInScreen(getBoundsInScreen(globalRect));
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setVisibleToUser(true);
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setEnabled(!semanticsNode.hasFlag(Flag.HAS_ENABLED_STATE) || semanticsNode.hasFlag(Flag.IS_ENABLED));
        if (semanticsNode.hasAction(Action.TAP)) {
            if (semanticsNode.onTapOverride != null) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, semanticsNode.onTapOverride.hint));
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClickable(true);
            } else {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(16);
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClickable(true);
            }
        }
        if (semanticsNode.hasAction(Action.LONG_PRESS)) {
            if (semanticsNode.onLongPressOverride != null) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, semanticsNode.onLongPressOverride.hint));
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setLongClickable(true);
            } else {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(32);
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setLongClickable(true);
            }
        }
        Action action = Action.SCROLL_LEFT;
        if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_UP) || semanticsNode.hasAction(Action.SCROLL_RIGHT) || semanticsNode.hasAction(Action.SCROLL_DOWN)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setScrollable(true);
            if (semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING)) {
                if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_RIGHT)) {
                    if (shouldSetCollectionInfo(semanticsNode)) {
                        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, semanticsNode.scrollChildren, false));
                    } else {
                        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (shouldSetCollectionInfo(semanticsNode)) {
                    accessibilityNodeInfoObtainAccessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(semanticsNode.scrollChildren, 0, false));
                } else {
                    accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.ScrollView");
                }
            }
            if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_UP)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(4096);
            }
            if (semanticsNode.hasAction(Action.SCROLL_RIGHT) || semanticsNode.hasAction(Action.SCROLL_DOWN)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(8192);
            }
        }
        Action action2 = Action.INCREASE;
        if (semanticsNode.hasAction(action2) || semanticsNode.hasAction(Action.DECREASE)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.SeekBar");
            if (semanticsNode.hasAction(action2)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(4096);
            }
            if (semanticsNode.hasAction(Action.DECREASE)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(8192);
            }
        }
        if (semanticsNode.hasFlag(Flag.IS_LIVE_REGION)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setLiveRegion(1);
        }
        if (semanticsNode.hasFlag(flag)) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setText(semanticsNode.getValue());
            if (i12 >= 28) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setHintText(semanticsNode.getTextFieldHint());
            }
        } else if (!semanticsNode.hasFlag(Flag.SCOPES_ROUTE)) {
            CharSequence valueLabelHint = semanticsNode.getValueLabelHint();
            if (i12 < 28 && semanticsNode.tooltip != null) {
                valueLabelHint = ((Object) (valueLabelHint != null ? valueLabelHint : "")) + "\n" + semanticsNode.tooltip;
            }
            if (valueLabelHint != null) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setContentDescription(valueLabelHint);
            }
        }
        if (i12 >= 28 && semanticsNode.tooltip != null) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setTooltipText(semanticsNode.tooltip);
        }
        boolean zHasFlag = semanticsNode.hasFlag(Flag.HAS_CHECKED_STATE);
        boolean zHasFlag2 = semanticsNode.hasFlag(Flag.HAS_TOGGLED_STATE);
        if (!zHasFlag && !zHasFlag2) {
            z10 = false;
        }
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setCheckable(z10);
        if (zHasFlag) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(Flag.IS_CHECKED));
            if (semanticsNode.hasFlag(Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.RadioButton");
            } else {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.CheckBox");
            }
        } else if (zHasFlag2) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(Flag.IS_TOGGLED));
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.Switch");
        }
        accessibilityNodeInfoObtainAccessibilityNodeInfo2.setSelected(semanticsNode.hasFlag(Flag.IS_SELECTED));
        if (i12 >= 28) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.setHeading(semanticsNode.hasFlag(Flag.IS_HEADER));
        }
        SemanticsNode semanticsNode5 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode5 == null || semanticsNode5.f119492id != i10) {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(64);
        } else {
            accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(128);
        }
        if (semanticsNode.customAccessibilityActions != null) {
            for (CustomAccessibilityAction customAccessibilityAction : semanticsNode.customAccessibilityActions) {
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(customAccessibilityAction.resourceId, customAccessibilityAction.label));
            }
        }
        for (SemanticsNode semanticsNode6 : semanticsNode.childrenInTraversalOrder) {
            if (!semanticsNode6.hasFlag(Flag.IS_HIDDEN)) {
                if (semanticsNode6.platformViewId != -1) {
                    View platformViewById2 = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode6.platformViewId);
                    if (!this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode6.platformViewId)) {
                        accessibilityNodeInfoObtainAccessibilityNodeInfo2.addChild(platformViewById2);
                    }
                }
                accessibilityNodeInfoObtainAccessibilityNodeInfo2.addChild(this.rootAccessibilityView, semanticsNode6.f119492id);
            }
        }
        return accessibilityNodeInfoObtainAccessibilityNodeInfo2;
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean externalViewRequestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.embeddedInputFocusedNodeId = recordFlutterId;
            this.inputFocusedSemanticsNode = null;
            return true;
        }
        if (eventType == 128) {
            this.hoveredObject = null;
            return true;
        }
        if (eventType == 32768) {
            this.embeddedAccessibilityFocusedNodeId = recordFlutterId;
            this.accessibilityFocusedSemanticsNode = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.embeddedInputFocusedNodeId = null;
        this.embeddedAccessibilityFocusedNodeId = null;
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        if (i10 == 1) {
            SemanticsNode semanticsNode = this.inputFocusedSemanticsNode;
            if (semanticsNode != null) {
                return createAccessibilityNodeInfo(semanticsNode.f119492id);
            }
            Integer num = this.embeddedInputFocusedNodeId;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i10 != 2) {
            return null;
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            return createAccessibilityNodeInfo(semanticsNode2.f119492id);
        }
        Integer num2 = this.embeddedAccessibilityFocusedNodeId;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    @j1
    public boolean getAccessibleNavigation() {
        return this.accessibleNavigation;
    }

    @j1
    public int getHoveredObjectId() {
        return this.hoveredObject.f119492id;
    }

    public boolean isAccessibilityEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    public boolean isTouchExplorationEnabled() {
        return this.accessibilityManager.isTouchExplorationEnabled();
    }

    @j1
    public AccessibilityEvent obtainAccessibilityEvent(int i10) {
        return AccessibilityEvent.obtain(i10);
    }

    @j1
    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    @j1
    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view, int i10) {
        return AccessibilityNodeInfo.obtain(view, i10);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent) {
        return onAccessibilityHoverEvent(motionEvent, false);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z10) {
        if (!this.accessibilityManager.isTouchExplorationEnabled() || this.flutterSemanticsTree.isEmpty()) {
            return false;
        }
        SemanticsNode semanticsNodeHitTest = getRootSemanticsNode().hitTest(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
        if (semanticsNodeHitTest != null && semanticsNodeHitTest.platformViewId != -1) {
            if (z10) {
                return false;
            }
            return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(semanticsNodeHitTest.f119492id, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            handleTouchExploration(motionEvent.getX(), motionEvent.getY(), z10);
        } else {
            if (motionEvent.getAction() != 10) {
                Log.d("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            onTouchExplorationExit();
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i10, int i11, @p0 Bundle bundle) {
        if (i10 >= 65536) {
            boolean zPerformAction = this.accessibilityViewEmbedder.performAction(i10, i11, bundle);
            if (zPerformAction && i11 == 128) {
                this.embeddedAccessibilityFocusedNodeId = null;
            }
            return zPerformAction;
        }
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i10));
        boolean z10 = false;
        if (semanticsNode == null) {
            return false;
        }
        switch (i11) {
            case 16:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.TAP);
                return true;
            case 32:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.LONG_PRESS);
                return true;
            case 64:
                if (this.accessibilityFocusedSemanticsNode == null) {
                    this.rootAccessibilityView.invalidate();
                }
                this.accessibilityFocusedSemanticsNode = semanticsNode;
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap map = new HashMap();
                map.put("type", "didGainFocus");
                map.put("nodeId", Integer.valueOf(semanticsNode.f119492id));
                this.accessibilityChannel.channel.send(map);
                sendAccessibilityEvent(i10, 32768);
                if (semanticsNode.hasAction(Action.INCREASE) || semanticsNode.hasAction(Action.DECREASE)) {
                    sendAccessibilityEvent(i10, 4);
                }
                return true;
            case 128:
                SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
                if (semanticsNode2 != null && semanticsNode2.f119492id == i10) {
                    this.accessibilityFocusedSemanticsNode = null;
                }
                Integer num = this.embeddedAccessibilityFocusedNodeId;
                if (num != null && num.intValue() == i10) {
                    this.embeddedAccessibilityFocusedNodeId = null;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i10, 65536);
                return true;
            case 256:
                return performCursorMoveAction(semanticsNode, i10, bundle, true);
            case 512:
                return performCursorMoveAction(semanticsNode, i10, bundle, false);
            case 4096:
                Action action = Action.SCROLL_UP;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i10, action);
                } else {
                    Action action2 = Action.SCROLL_LEFT;
                    if (semanticsNode.hasAction(action2)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i10, action2);
                    } else {
                        Action action3 = Action.INCREASE;
                        if (!semanticsNode.hasAction(action3)) {
                            return false;
                        }
                        semanticsNode.value = semanticsNode.increasedValue;
                        semanticsNode.valueAttributes = semanticsNode.increasedValueAttributes;
                        sendAccessibilityEvent(i10, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i10, action3);
                    }
                }
                return true;
            case 8192:
                Action action4 = Action.SCROLL_DOWN;
                if (semanticsNode.hasAction(action4)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i10, action4);
                } else {
                    Action action5 = Action.SCROLL_RIGHT;
                    if (semanticsNode.hasAction(action5)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i10, action5);
                    } else {
                        Action action6 = Action.DECREASE;
                        if (!semanticsNode.hasAction(action6)) {
                            return false;
                        }
                        semanticsNode.value = semanticsNode.decreasedValue;
                        semanticsNode.valueAttributes = semanticsNode.decreasedValueAttributes;
                        sendAccessibilityEvent(i10, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i10, action6);
                    }
                }
                return true;
            case 16384:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.COPY);
                return true;
            case 32768:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.PASTE);
                return true;
            case 65536:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.CUT);
                return true;
            case 131072:
                HashMap map2 = new HashMap();
                if (bundle != null && bundle.containsKey(a0.U) && bundle.containsKey(a0.V)) {
                    z10 = true;
                }
                if (z10) {
                    map2.put(com.google.android.exoplayer2.text.ttml.d.X, Integer.valueOf(bundle.getInt(a0.U)));
                    map2.put(com.google.android.exoplayer2.text.ttml.d.F, Integer.valueOf(bundle.getInt(a0.V)));
                } else {
                    map2.put(com.google.android.exoplayer2.text.ttml.d.X, Integer.valueOf(semanticsNode.textSelectionExtent));
                    map2.put(com.google.android.exoplayer2.text.ttml.d.F, Integer.valueOf(semanticsNode.textSelectionExtent));
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SET_SELECTION, map2);
                SemanticsNode semanticsNode3 = this.flutterSemanticsTree.get(Integer.valueOf(i10));
                semanticsNode3.textSelectionBase = ((Integer) map2.get(com.google.android.exoplayer2.text.ttml.d.X)).intValue();
                semanticsNode3.textSelectionExtent = ((Integer) map2.get(com.google.android.exoplayer2.text.ttml.d.F)).intValue();
                return true;
            case 1048576:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DISMISS);
                return true;
            case 2097152:
                return performSetText(semanticsNode, i10, bundle);
            case 16908342:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SHOW_ON_SCREEN);
                return true;
            default:
                CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i11 - FIRST_RESOURCE_ID));
                if (customAccessibilityAction == null) {
                    return false;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.CUSTOM_ACTION, Integer.valueOf(customAccessibilityAction.f119491id));
                return true;
        }
    }

    public void release() {
        this.isReleased = true;
        this.platformViewsAccessibilityDelegate.detachAccessibilityBridge();
        setOnAccessibilityChangeListener(null);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.accessibilityChannel.setAccessibilityMessageHandler(null);
    }

    public void reset() {
        this.flutterSemanticsTree.clear();
        SemanticsNode semanticsNode = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f119492id, 65536);
        }
        this.accessibilityFocusedSemanticsNode = null;
        this.hoveredObject = null;
        sendWindowContentChangeEvent(0);
    }

    @j1
    public void sendAccessibilityEvent(int i10, int i11) {
        if (this.accessibilityManager.isEnabled()) {
            sendAccessibilityEvent(obtainAccessibilityEvent(i10, i11));
        }
    }

    public void setOnAccessibilityChangeListener(@p0 OnAccessibilityChangeListener onAccessibilityChangeListener) {
        this.onAccessibilityChangeListener = onAccessibilityChangeListener;
    }

    void updateCustomAccessibilityActions(@n0 ByteBuffer byteBuffer, @n0 String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            CustomAccessibilityAction orCreateAccessibilityAction = getOrCreateAccessibilityAction(byteBuffer.getInt());
            orCreateAccessibilityAction.overrideId = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            String str = null;
            orCreateAccessibilityAction.label = i10 == -1 ? null : strArr[i10];
            int i11 = byteBuffer.getInt();
            if (i11 != -1) {
                str = strArr[i11];
            }
            orCreateAccessibilityAction.hint = str;
        }
    }

    void updateSemantics(@n0 ByteBuffer byteBuffer, @n0 String[] strArr, @n0 ByteBuffer[] byteBufferArr) {
        SemanticsNode semanticsNode;
        SemanticsNode semanticsNode2;
        float f10;
        float f11;
        WindowInsets rootWindowInsets;
        View platformViewById;
        ArrayList<SemanticsNode> arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            SemanticsNode orCreateSemanticsNode = getOrCreateSemanticsNode(byteBuffer.getInt());
            orCreateSemanticsNode.updateWith(byteBuffer, strArr, byteBufferArr);
            if (!orCreateSemanticsNode.hasFlag(Flag.IS_HIDDEN)) {
                if (orCreateSemanticsNode.hasFlag(Flag.IS_FOCUSED)) {
                    this.inputFocusedSemanticsNode = orCreateSemanticsNode;
                }
                if (orCreateSemanticsNode.hadPreviousConfig) {
                    arrayList.add(orCreateSemanticsNode);
                }
                if (orCreateSemanticsNode.platformViewId != -1 && !this.platformViewsAccessibilityDelegate.usesVirtualDisplay(orCreateSemanticsNode.platformViewId) && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(orCreateSemanticsNode.platformViewId)) != null) {
                    platformViewById.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        SemanticsNode rootSemanticsNode = getRootSemanticsNode();
        ArrayList<SemanticsNode> arrayList2 = new ArrayList();
        if (rootSemanticsNode != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT >= 28 ? doesLayoutInDisplayCutoutModeRequireLeftInset() : true) && (rootWindowInsets = this.rootAccessibilityView.getRootWindowInsets()) != null) {
                if (!this.lastLeftFrameInset.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    rootSemanticsNode.globalGeometryDirty = true;
                    rootSemanticsNode.inverseTransformDirty = true;
                }
                Integer numValueOf = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                this.lastLeftFrameInset = numValueOf;
                Matrix.translateM(fArr, 0, numValueOf.intValue(), 0.0f, 0.0f);
            }
            rootSemanticsNode.updateRecursively(fArr, hashSet, false);
            rootSemanticsNode.collectRoutes(arrayList2);
        }
        SemanticsNode semanticsNode3 = null;
        for (SemanticsNode semanticsNode4 : arrayList2) {
            if (!this.flutterNavigationStack.contains(Integer.valueOf(semanticsNode4.f119492id))) {
                semanticsNode3 = semanticsNode4;
            }
        }
        if (semanticsNode3 == null && arrayList2.size() > 0) {
            semanticsNode3 = (SemanticsNode) arrayList2.get(arrayList2.size() - 1);
        }
        if (semanticsNode3 != null && (semanticsNode3.f119492id != this.previousRouteId || arrayList2.size() != this.flutterNavigationStack.size())) {
            this.previousRouteId = semanticsNode3.f119492id;
            onWindowNameChange(semanticsNode3);
        }
        this.flutterNavigationStack.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.flutterNavigationStack.add(Integer.valueOf(((SemanticsNode) it.next()).f119492id));
        }
        Iterator<Map.Entry<Integer, SemanticsNode>> it2 = this.flutterSemanticsTree.entrySet().iterator();
        while (it2.hasNext()) {
            SemanticsNode value = it2.next().getValue();
            if (!hashSet.contains(value)) {
                willRemoveSemanticsNode(value);
                it2.remove();
            }
        }
        sendWindowContentChangeEvent(0);
        for (SemanticsNode semanticsNode5 : arrayList) {
            if (semanticsNode5.didScroll()) {
                AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode5.f119492id, 4096);
                float f12 = semanticsNode5.scrollPosition;
                float f13 = semanticsNode5.scrollExtentMax;
                if (Float.isInfinite(semanticsNode5.scrollExtentMax)) {
                    if (f12 > SCROLL_POSITION_CAP_FOR_INFINITY) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(semanticsNode5.scrollExtentMin)) {
                    f10 = f13 + SCROLL_EXTENT_FOR_INFINITY;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + SCROLL_EXTENT_FOR_INFINITY;
                } else {
                    f10 = f13 - semanticsNode5.scrollExtentMin;
                    f11 = f12 - semanticsNode5.scrollExtentMin;
                }
                if (semanticsNode5.hadAction(Action.SCROLL_UP) || semanticsNode5.hadAction(Action.SCROLL_DOWN)) {
                    accessibilityEventObtainAccessibilityEvent.setScrollY((int) f11);
                    accessibilityEventObtainAccessibilityEvent.setMaxScrollY((int) f10);
                } else if (semanticsNode5.hadAction(Action.SCROLL_LEFT) || semanticsNode5.hadAction(Action.SCROLL_RIGHT)) {
                    accessibilityEventObtainAccessibilityEvent.setScrollX((int) f11);
                    accessibilityEventObtainAccessibilityEvent.setMaxScrollX((int) f10);
                }
                if (semanticsNode5.scrollChildren > 0) {
                    accessibilityEventObtainAccessibilityEvent.setItemCount(semanticsNode5.scrollChildren);
                    accessibilityEventObtainAccessibilityEvent.setFromIndex(semanticsNode5.scrollIndex);
                    Iterator it3 = semanticsNode5.childrenInHitTestOrder.iterator();
                    int i10 = 0;
                    while (it3.hasNext()) {
                        if (!((SemanticsNode) it3.next()).hasFlag(Flag.IS_HIDDEN)) {
                            i10++;
                        }
                    }
                    accessibilityEventObtainAccessibilityEvent.setToIndex((semanticsNode5.scrollIndex + i10) - 1);
                }
                sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
            }
            if (semanticsNode5.hasFlag(Flag.IS_LIVE_REGION) && semanticsNode5.didChangeLabel()) {
                sendWindowContentChangeEvent(semanticsNode5.f119492id);
            }
            SemanticsNode semanticsNode6 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode6 != null && semanticsNode6.f119492id == semanticsNode5.f119492id) {
                Flag flag = Flag.IS_SELECTED;
                if (!semanticsNode5.hadFlag(flag) && semanticsNode5.hasFlag(flag)) {
                    AccessibilityEvent accessibilityEventObtainAccessibilityEvent2 = obtainAccessibilityEvent(semanticsNode5.f119492id, 4);
                    accessibilityEventObtainAccessibilityEvent2.getText().add(semanticsNode5.label);
                    sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent2);
                }
            }
            SemanticsNode semanticsNode7 = this.inputFocusedSemanticsNode;
            if (semanticsNode7 != null && semanticsNode7.f119492id == semanticsNode5.f119492id && ((semanticsNode2 = this.lastInputFocusedSemanticsNode) == null || semanticsNode2.f119492id != this.inputFocusedSemanticsNode.f119492id)) {
                this.lastInputFocusedSemanticsNode = this.inputFocusedSemanticsNode;
                sendAccessibilityEvent(obtainAccessibilityEvent(semanticsNode5.f119492id, 8));
            } else if (this.inputFocusedSemanticsNode == null) {
                this.lastInputFocusedSemanticsNode = null;
            }
            SemanticsNode semanticsNode8 = this.inputFocusedSemanticsNode;
            if (semanticsNode8 != null && semanticsNode8.f119492id == semanticsNode5.f119492id) {
                Flag flag2 = Flag.IS_TEXT_FIELD;
                if (semanticsNode5.hadFlag(flag2) && semanticsNode5.hasFlag(flag2) && ((semanticsNode = this.accessibilityFocusedSemanticsNode) == null || semanticsNode.f119492id == this.inputFocusedSemanticsNode.f119492id)) {
                    String str = semanticsNode5.previousValue != null ? semanticsNode5.previousValue : "";
                    String str2 = semanticsNode5.value != null ? semanticsNode5.value : "";
                    AccessibilityEvent accessibilityEventCreateTextChangedEvent = createTextChangedEvent(semanticsNode5.f119492id, str, str2);
                    if (accessibilityEventCreateTextChangedEvent != null) {
                        sendAccessibilityEvent(accessibilityEventCreateTextChangedEvent);
                    }
                    if (semanticsNode5.previousTextSelectionBase != semanticsNode5.textSelectionBase || semanticsNode5.previousTextSelectionExtent != semanticsNode5.textSelectionExtent) {
                        AccessibilityEvent accessibilityEventObtainAccessibilityEvent3 = obtainAccessibilityEvent(semanticsNode5.f119492id, 8192);
                        accessibilityEventObtainAccessibilityEvent3.getText().add(str2);
                        accessibilityEventObtainAccessibilityEvent3.setFromIndex(semanticsNode5.textSelectionBase);
                        accessibilityEventObtainAccessibilityEvent3.setToIndex(semanticsNode5.textSelectionExtent);
                        accessibilityEventObtainAccessibilityEvent3.setItemCount(str2.length());
                        sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent3);
                    }
                }
            }
        }
    }
}

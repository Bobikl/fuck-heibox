package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.core.app.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KeyMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000ø\u0001\u0000\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/b;", "", "shortcutModifier", "Landroidx/compose/foundation/text/e;", ak.av, "Landroidx/compose/foundation/text/e;", "b", "()Landroidx/compose/foundation/text/e;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class KeyMappingKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final e f7843a = new b(a(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.p
        @dl.e
        public Object get(@dl.e Object obj) {
            return Boolean.valueOf(androidx.compose.ui.input.key.d.e(((androidx.compose.ui.input.key.b) obj).h()));
        }
    }));

    /* JADX INFO: compiled from: KeyMapping.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/KeyMappingKt$a", "Landroidx/compose/foundation/text/e;", "Landroidx/compose/ui/input/key/b;", o0.I0, "Landroidx/compose/foundation/text/KeyCommand;", ak.av, "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l<androidx.compose.ui.input.key.b, Boolean> f7844a;

        /* JADX WARN: Multi-variable type inference failed */
        a(yh.l<? super androidx.compose.ui.input.key.b, Boolean> lVar) {
            this.f7844a = lVar;
        }

        @Override // androidx.compose.foundation.text.e
        @dl.e
        public KeyCommand a(@dl.d KeyEvent event) {
            f0.p(event, "event");
            if (this.f7844a.invoke(androidx.compose.ui.input.key.b.a(event)).booleanValue() && androidx.compose.ui.input.key.d.g(event)) {
                if (androidx.compose.ui.input.key.a.E4(androidx.compose.ui.input.key.d.a(event), l.f8087a.v())) {
                    return KeyCommand.REDO;
                }
                return null;
            }
            if (this.f7844a.invoke(androidx.compose.ui.input.key.b.a(event)).booleanValue()) {
                long jA = androidx.compose.ui.input.key.d.a(event);
                l lVar = l.f8087a;
                if (androidx.compose.ui.input.key.a.E4(jA, lVar.d()) ? true : androidx.compose.ui.input.key.a.E4(jA, lVar.m())) {
                    return KeyCommand.COPY;
                }
                if (androidx.compose.ui.input.key.a.E4(jA, lVar.t())) {
                    return KeyCommand.PASTE;
                }
                if (androidx.compose.ui.input.key.a.E4(jA, lVar.u())) {
                    return KeyCommand.CUT;
                }
                if (androidx.compose.ui.input.key.a.E4(jA, lVar.a())) {
                    return KeyCommand.SELECT_ALL;
                }
                if (androidx.compose.ui.input.key.a.E4(jA, lVar.v())) {
                    return KeyCommand.UNDO;
                }
                return null;
            }
            if (androidx.compose.ui.input.key.d.e(event)) {
                return null;
            }
            if (androidx.compose.ui.input.key.d.g(event)) {
                long jA2 = androidx.compose.ui.input.key.d.a(event);
                l lVar2 = l.f8087a;
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.h())) {
                    return KeyCommand.SELECT_LEFT_CHAR;
                }
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.i())) {
                    return KeyCommand.SELECT_RIGHT_CHAR;
                }
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.j())) {
                    return KeyCommand.SELECT_UP;
                }
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.g())) {
                    return KeyCommand.SELECT_DOWN;
                }
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.q())) {
                    return KeyCommand.SELECT_PAGE_UP;
                }
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.p())) {
                    return KeyCommand.SELECT_PAGE_DOWN;
                }
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.o())) {
                    return KeyCommand.SELECT_LINE_START;
                }
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.n())) {
                    return KeyCommand.SELECT_LINE_END;
                }
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.m())) {
                    return KeyCommand.PASTE;
                }
                return null;
            }
            long jA3 = androidx.compose.ui.input.key.d.a(event);
            l lVar3 = l.f8087a;
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.h())) {
                return KeyCommand.LEFT_CHAR;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.i())) {
                return KeyCommand.RIGHT_CHAR;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.j())) {
                return KeyCommand.UP;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.g())) {
                return KeyCommand.DOWN;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.q())) {
                return KeyCommand.PAGE_UP;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.p())) {
                return KeyCommand.PAGE_DOWN;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.o())) {
                return KeyCommand.LINE_START;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.n())) {
                return KeyCommand.LINE_END;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.k())) {
                return KeyCommand.NEW_LINE;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.c())) {
                return KeyCommand.DELETE_PREV_CHAR;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.f())) {
                return KeyCommand.DELETE_NEXT_CHAR;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.r())) {
                return KeyCommand.PASTE;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.e())) {
                return KeyCommand.CUT;
            }
            if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.s())) {
                return KeyCommand.TAB;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: KeyMapping.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/KeyMappingKt$b", "Landroidx/compose/foundation/text/e;", "Landroidx/compose/ui/input/key/b;", o0.I0, "Landroidx/compose/foundation/text/KeyCommand;", ak.av, "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f7845a;

        b(e eVar) {
            this.f7845a = eVar;
        }

        @Override // androidx.compose.foundation.text.e
        @dl.e
        public KeyCommand a(@dl.d KeyEvent event) {
            f0.p(event, "event");
            KeyCommand keyCommand = null;
            if (androidx.compose.ui.input.key.d.g(event) && androidx.compose.ui.input.key.d.e(event)) {
                long jA = androidx.compose.ui.input.key.d.a(event);
                l lVar = l.f8087a;
                if (androidx.compose.ui.input.key.a.E4(jA, lVar.h())) {
                    keyCommand = KeyCommand.SELECT_LEFT_WORD;
                } else if (androidx.compose.ui.input.key.a.E4(jA, lVar.i())) {
                    keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                } else if (androidx.compose.ui.input.key.a.E4(jA, lVar.j())) {
                    keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.a.E4(jA, lVar.g())) {
                    keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                }
            } else if (androidx.compose.ui.input.key.d.e(event)) {
                long jA2 = androidx.compose.ui.input.key.d.a(event);
                l lVar2 = l.f8087a;
                if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.h())) {
                    keyCommand = KeyCommand.LEFT_WORD;
                } else if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.i())) {
                    keyCommand = KeyCommand.RIGHT_WORD;
                } else if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.j())) {
                    keyCommand = KeyCommand.PREV_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.g())) {
                    keyCommand = KeyCommand.NEXT_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.l())) {
                    keyCommand = KeyCommand.DELETE_PREV_CHAR;
                } else if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.f())) {
                    keyCommand = KeyCommand.DELETE_NEXT_WORD;
                } else if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.c())) {
                    keyCommand = KeyCommand.DELETE_PREV_WORD;
                } else if (androidx.compose.ui.input.key.a.E4(jA2, lVar2.b())) {
                    keyCommand = KeyCommand.DESELECT;
                }
            } else if (androidx.compose.ui.input.key.d.g(event)) {
                long jA3 = androidx.compose.ui.input.key.d.a(event);
                l lVar3 = l.f8087a;
                if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.o())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (androidx.compose.ui.input.key.a.E4(jA3, lVar3.n())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            }
            return keyCommand == null ? this.f7845a.a(event) : keyCommand;
        }
    }

    @dl.d
    public static final e a(@dl.d yh.l<? super androidx.compose.ui.input.key.b, Boolean> shortcutModifier) {
        f0.p(shortcutModifier, "shortcutModifier");
        return new a(shortcutModifier);
    }

    @dl.d
    public static final e b() {
        return f7843a;
    }
}

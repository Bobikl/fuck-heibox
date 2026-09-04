package com.google.auto.common;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.b3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleTypeVisitor8;
import javax.lang.model.util.Types;

/* JADX INFO: compiled from: Overrides.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class q0 {

    /* JADX INFO: compiled from: Overrides.java */
    public static class b extends q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Types f56559a;

        /* JADX INFO: compiled from: Overrides.java */
        public class a extends SimpleTypeVisitor8<TypeMirror, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Map<TypeParameterElement, TypeMirror> f56560a;

            private a() {
                this.f56560a = Maps.c0();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public TypeMirror a(TypeMirror typeMirror, Void r10) {
                return typeMirror;
            }

            ImmutableList<TypeMirror> c(ExecutableElement executableElement, TypeElement typeElement) {
                if (executableElement.getEnclosingElement().equals(typeElement)) {
                    ImmutableList.a aVarQ = ImmutableList.q();
                    Iterator it = executableElement.getParameters().iterator();
                    while (it.hasNext()) {
                        aVarQ.a(b.this.f56559a.erasure((TypeMirror) visit(((VariableElement) it.next()).asType())));
                    }
                    return aVarQ.e();
                }
                ArrayList arrayListQ = Lists.q();
                if (typeElement.getSuperclass().getKind() == TypeKind.DECLARED) {
                    arrayListQ.add(typeElement.getSuperclass());
                }
                arrayListQ.addAll(typeElement.getInterfaces());
                Iterator it2 = arrayListQ.iterator();
                while (it2.hasNext()) {
                    DeclaredType declaredTypeG = o0.g((TypeMirror) it2.next());
                    TypeElement typeElementC = n0.c(declaredTypeG.asElement());
                    List typeArguments = declaredTypeG.getTypeArguments();
                    List typeParameters = typeElementC.getTypeParameters();
                    com.google.common.base.g0.a(typeArguments.size() == typeParameters.size());
                    for (int i10 = 0; i10 < typeArguments.size(); i10++) {
                        this.f56560a.put((TypeParameterElement) typeParameters.get(i10), (TypeMirror) typeArguments.get(i10));
                    }
                    ImmutableList<TypeMirror> immutableListC = c(executableElement, typeElementC);
                    if (immutableListC != null) {
                        return immutableListC;
                    }
                }
                return null;
            }

            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public TypeMirror d(ArrayType arrayType, Void r10) {
                return b.this.f56559a.getArrayType((TypeMirror) visit(arrayType.getComponentType()));
            }

            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public TypeMirror f(DeclaredType declaredType, Void r10) {
                if (declaredType.getTypeArguments().isEmpty()) {
                    return declaredType;
                }
                ArrayList arrayListQ = Lists.q();
                Iterator it = declaredType.getTypeArguments().iterator();
                while (it.hasNext()) {
                    arrayListQ.add(visit((TypeMirror) it.next()));
                }
                return b.this.f56559a.getDeclaredType(b.this.d(declaredType), (TypeMirror[]) arrayListQ.toArray(new TypeMirror[0]));
            }

            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public TypeMirror h(TypeVariable typeVariable, Void r10) {
                TypeParameterElement typeParameterElementAsElement = b.this.f56559a.asElement(typeVariable);
                if (typeParameterElementAsElement instanceof TypeParameterElement) {
                    TypeParameterElement typeParameterElement = typeParameterElementAsElement;
                    if (this.f56560a.containsKey(typeParameterElement)) {
                        return (TypeMirror) visit(this.f56560a.get(typeParameterElement));
                    }
                }
                return (TypeMirror) visit(b.this.f56559a.erasure(typeVariable.getUpperBound()));
            }
        }

        b(Types types) {
            this.f56559a = types;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TypeElement d(TypeMirror typeMirror) {
            return n0.c(o0.g(typeMirror).asElement());
        }

        private boolean f(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement) {
            DeclaredType declaredTypeG = o0.g(typeElement.asType());
            try {
                return this.f56559a.isSubsignature(o0.j(this.f56559a.asMemberOf(declaredTypeG, executableElement)), o0.j(this.f56559a.asMemberOf(declaredTypeG, executableElement2)));
            } catch (IllegalArgumentException unused) {
                int size = executableElement.getParameters().size();
                if (executableElement2.getParameters().size() != size) {
                    return false;
                }
                ImmutableList<TypeMirror> immutableListE = e(executableElement, typeElement);
                ImmutableList<TypeMirror> immutableListE2 = e(executableElement2, typeElement);
                if (immutableListE == null || immutableListE2 == null) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (!this.f56559a.isSameType(immutableListE.get(i10), immutableListE2.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }

        private ExecutableElement i(TypeElement typeElement, ExecutableElement executableElement) {
            int size = executableElement.getParameters().size();
            ImmutableList<TypeMirror> immutableListE = e(executableElement, typeElement);
            if (immutableListE == null) {
                return null;
            }
            for (ExecutableElement executableElement2 : ElementFilter.methodsIn(typeElement.getEnclosedElements())) {
                if (executableElement2.getSimpleName().equals(executableElement.getSimpleName()) && executableElement2.getParameters().size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f56559a.isSameType(immutableListE.get(i10), this.f56559a.erasure(((VariableElement) executableElement2.getParameters().get(i10)).asType()))) {
                        }
                    }
                    return executableElement2;
                }
            }
            return null;
        }

        private TypeElement j(TypeElement typeElement) {
            TypeMirror superclass = typeElement.getSuperclass();
            if (superclass.getKind() == TypeKind.DECLARED) {
                return n0.c(this.f56559a.asElement(superclass));
            }
            return null;
        }

        private ImmutableList<TypeElement> k(TypeElement typeElement) {
            ImmutableList.a aVarQ = ImmutableList.q();
            Iterator it = typeElement.getInterfaces().iterator();
            while (it.hasNext()) {
                aVarQ.a(n0.c(this.f56559a.asElement((TypeMirror) it.next())));
            }
            return aVarQ.e();
        }

        @Override // com.google.auto.common.q0
        public boolean a(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement) {
            if (!executableElement.getSimpleName().equals(executableElement2.getSimpleName()) || executableElement.getEnclosingElement().equals(executableElement2.getEnclosingElement()) || executableElement2.getModifiers().contains(Modifier.STATIC)) {
                return false;
            }
            Visibility visibilityOfElement = Visibility.ofElement(executableElement2);
            Visibility visibilityOfElement2 = Visibility.ofElement(executableElement);
            if (visibilityOfElement.equals(Visibility.PRIVATE) || visibilityOfElement2.compareTo(visibilityOfElement) < 0 || !f(executableElement, executableElement2, typeElement) || !n0.r(executableElement2, n0.m(executableElement)) || !(executableElement2.getEnclosingElement() instanceof TypeElement)) {
                return false;
            }
            TypeElement typeElementC = n0.c(executableElement2.getEnclosingElement());
            Types types = this.f56559a;
            if (!types.isSubtype(types.erasure(typeElement.asType()), this.f56559a.erasure(typeElementC.asType()))) {
                return false;
            }
            if (!typeElement.getKind().isClass()) {
                return typeElement.getKind().isInterface();
            }
            if (typeElementC.getKind().isClass()) {
                return !executableElement2.getEnclosingElement().equals(g(typeElement, executableElement2).getEnclosingElement());
            }
            if (!typeElementC.getKind().isInterface()) {
                return false;
            }
            if (!executableElement.getModifiers().contains(Modifier.ABSTRACT)) {
                return true;
            }
            return !executableElement2.getEnclosingElement().equals(h(typeElement, executableElement2).getEnclosingElement());
        }

        ImmutableList<TypeMirror> e(ExecutableElement executableElement, TypeElement typeElement) {
            return executableElement.getParameters().isEmpty() ? ImmutableList.B() : new a().c(executableElement, typeElement);
        }

        ExecutableElement g(TypeElement typeElement, ExecutableElement executableElement) {
            while (typeElement != null) {
                ExecutableElement executableElementI = i(typeElement, executableElement);
                if (executableElementI != null) {
                    return executableElementI;
                }
                typeElement = j(typeElement);
            }
            return null;
        }

        ExecutableElement h(TypeElement typeElement, ExecutableElement executableElement) {
            TypeElement typeElementJ;
            TypeElement typeElementC = n0.c(executableElement.getEnclosingElement());
            com.google.common.base.w.d(typeElementC.getKind().isInterface());
            TypeMirror typeMirrorErasure = this.f56559a.erasure(typeElementC.asType());
            ImmutableList immutableListD = ImmutableList.D(typeElement);
            while (!immutableListD.isEmpty()) {
                ImmutableList.a aVarQ = ImmutableList.q();
                b3 it = immutableListD.iterator();
                while (it.hasNext()) {
                    TypeElement typeElement2 = (TypeElement) it.next();
                    if (this.f56559a.isAssignable(this.f56559a.erasure(typeElement2.asType()), typeMirrorErasure)) {
                        ExecutableElement executableElementI = i(typeElement2, executableElement);
                        if (executableElementI != null) {
                            return executableElementI;
                        }
                        aVarQ.c(k(typeElement2));
                    }
                    if (typeElement2.getKind().isClass() && (typeElementJ = j(typeElement2)) != null) {
                        aVarQ.a(typeElementJ);
                    }
                }
                immutableListD = aVarQ.e();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Overrides.java */
    public static class c extends q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Elements f56562a;

        c(Elements elements) {
            this.f56562a = elements;
        }

        @Override // com.google.auto.common.q0
        boolean a(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement) {
            return this.f56562a.overrides(executableElement, executableElement2, typeElement);
        }
    }

    q0() {
    }

    abstract boolean a(ExecutableElement executableElement, ExecutableElement executableElement2, TypeElement typeElement);
}

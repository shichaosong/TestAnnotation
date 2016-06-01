package com.example;

import com.google.auto.service.AutoService;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import javax.lang.model.util.Elements;
import javax.lang.model.SourceVersion;
import javax.tools.Diagnostic;

// 注解 @AutoService 自动生成 javax.annotation.processing.Processor 文件
@AutoService(Processor.class)
//@SupportedAnnotationTypes( {"com.example.MyAnnotation"} )
public class MyProcessor extends AbstractProcessor {
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        System.out.println("songshichao >>> enter processor");
        Messager messager = processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.NOTE, "songshichao >>> enter process method...");
        for (TypeElement te : annotations) {
            for (Element e : env.getElementsAnnotatedWith(te)) {
                messager.printMessage(Diagnostic.Kind.NOTE, "songshichao >>> Printing: " + e.toString());
            }
        }

        // add by me
        for (Element te : env.getElementsAnnotatedWith(MyAnnotation.class)) {
            if (te instanceof TypeElement) {
                TypeElement typeElement = (TypeElement) te;
                System.out.println(typeElement.toString());
                messager.printMessage(Diagnostic.Kind.WARNING, "songshichao >>> printing: " + typeElement.toString());
            }
        }
        return true;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Collections.singleton(MyAnnotation.class.getCanonicalName());
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
}

/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("fir-low-level-api")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testdata/lazyResolve")
public class FirLazyDeclarationResolveTestGenerated extends AbstractFirLazyDeclarationResolveTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("classMembers.kt")
    public void testClassMembers() throws Exception {
        runTest("testdata/lazyResolve/classMembers.kt");
    }

    @TestMetadata("delegates.kt")
    public void testDelegates() throws Exception {
        runTest("testdata/lazyResolve/delegates.kt");
    }

    @TestMetadata("propertyWithGetter.kt")
    public void testPropertyWithGetter() throws Exception {
        runTest("testdata/lazyResolve/propertyWithGetter.kt");
    }

    @TestMetadata("propertyWithGetterAndSetter.kt")
    public void testPropertyWithGetterAndSetter() throws Exception {
        runTest("testdata/lazyResolve/propertyWithGetterAndSetter.kt");
    }

    @TestMetadata("propertyWithInitializer.kt")
    public void testPropertyWithInitializer() throws Exception {
        runTest("testdata/lazyResolve/propertyWithInitializer.kt");
    }

    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("testdata/lazyResolve/secondaryConstructor.kt");
    }

    @TestMetadata("topLevelFunctions.kt")
    public void testTopLevelFunctions() throws Exception {
        runTest("testdata/lazyResolve/topLevelFunctions.kt");
    }

    @TestMetadata("topLevelFunctionsWithExpressionBodyAndExplicitType.kt")
    public void testTopLevelFunctionsWithExpressionBodyAndExplicitType() throws Exception {
        runTest("testdata/lazyResolve/topLevelFunctionsWithExpressionBodyAndExplicitType.kt");
    }

    @TestMetadata("topLevelFunctionsWithImplicitType.kt")
    public void testTopLevelFunctionsWithImplicitType() throws Exception {
        runTest("testdata/lazyResolve/topLevelFunctionsWithImplicitType.kt");
    }
}

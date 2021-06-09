/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.uast.test.kotlin;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/uast-kotlin-fir/testData/type")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FE1UastTypesTestGenerated extends AbstractFE1UastTypesTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("accessArrayOfInlineClass.kt")
    public void testAccessArrayOfInlineClass() throws Exception {
        runTest("plugins/uast-kotlin-fir/testData/type/accessArrayOfInlineClass.kt");
    }

    public void testAllFilesPresentInType() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/uast-kotlin-fir/testData/type"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("arrayConstructorsSimple.kt")
    public void testArrayConstructorsSimple() throws Exception {
        runTest("plugins/uast-kotlin-fir/testData/type/arrayConstructorsSimple.kt");
    }

    @TestMetadata("arrayGetAssignMultiIndex.kt")
    public void testArrayGetAssignMultiIndex() throws Exception {
        runTest("plugins/uast-kotlin-fir/testData/type/arrayGetAssignMultiIndex.kt");
    }

    @TestMetadata("classLiteral.kt")
    public void testClassLiteral() throws Exception {
        runTest("plugins/uast-kotlin-fir/testData/type/classLiteral.kt");
    }

    @TestMetadata("typeCast.kt")
    public void testTypeCast() throws Exception {
        runTest("plugins/uast-kotlin-fir/testData/type/typeCast.kt");
    }

    @TestMetadata("typeCheck.kt")
    public void testTypeCheck() throws Exception {
        runTest("plugins/uast-kotlin-fir/testData/type/typeCheck.kt");
    }

    @TestMetadata("unresolved.kt")
    public void testUnresolved() throws Exception {
        runTest("plugins/uast-kotlin-fir/testData/type/unresolved.kt");
    }

    @TestMetadata("withGeneric.kt")
    public void testWithGeneric() throws Exception {
        runTest("plugins/uast-kotlin-fir/testData/type/withGeneric.kt");
    }
}

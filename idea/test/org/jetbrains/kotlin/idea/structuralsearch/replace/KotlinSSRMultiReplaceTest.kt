package org.jetbrains.kotlin.idea.structuralsearch.replace

import org.jetbrains.kotlin.idea.structuralsearch.KotlinSSRReplaceTest

class KotlinSSRMultiReplaceTest : KotlinSSRReplaceTest() {
    fun testMultiReplaceRemoveFirst() {
        doTest(
            searchPattern = """
                val '_ID1 = '_VALUE1
                val '_ID2 = '_VALUE2
            """.trimIndent(),
            replacePattern = """
                val '_ID2 = '_VALUE2
            """.trimIndent(),
            match = """
                fun main() {
                    val foo = "foo"
                    val bar = "bar"
                }
            """.trimIndent(),
            result = """
                fun main() {
                    val bar = "bar"
                }
            """.trimIndent(),
        )
    }

    fun testMultiReplaceRemoveSecond() {
        doTest(
            searchPattern = """
                val '_ID1 = '_VALUE1
                val '_ID2 = '_VALUE2
            """.trimIndent(),
            replacePattern = """
                val '_ID1 = '_VALUE1
            """.trimIndent(),
            match = """
                fun main() {
                    val foo = "foo"
                    val bar = "bar"
                }
            """.trimIndent(),
            result = """
                fun main() {
                    val foo = "foo"
                }
            """.trimIndent(),
        )
    }

    fun testMultiReplaceDoubleSecond() {
        doTest(
            searchPattern = """
                val '_ID1 = '_VALUE1
                val '_ID2 = '_VALUE2
            """.trimIndent(),
            replacePattern = """
                val '_ID1 = '_VALUE1
                val '_ID2 = '_VALUE2
                val x = '_VALUE2
            """.trimIndent(),
            match = """
                fun main() {
                    val foo = "foo"
                    val bar = "bar"
                }
            """.trimIndent(),
            result = """
                fun main() {
                    val foo = "foo"
                    val bar = "bar"
                    val x = "bar"
                }
            """.trimIndent(),
        )
    }

    fun testMultiReplaceDoubleCopy() {
        doTest(
            searchPattern = """
                val '_ID1 = '_VALUE1
                val '_ID2 = '_VALUE2
            """.trimIndent(),
            replacePattern = """
                val '_ID1 = '_VALUE1
                val '_ID2 = '_VALUE2
                val x = '_VALUE1
                val y = '_VALUE2
            """.trimIndent(),
            match = """
                fun main() {
                    val foo = "foo"
                    val bar = "bar"
                }
            """.trimIndent(),
            result = """
                fun main() {
                    val foo = "foo"
                    val bar = "bar"
                    val x = "foo"
                    val y = "bar"
                }
            """.trimIndent(),
        )
    }

    fun testRemoveAll() {
        doTest(
            searchPattern = """
                val '_ID1 = '_VALUE1
            """.trimIndent(),
            replacePattern = "",
            match = """
                fun main() {
                    val foo = "foo"
                }
            """.trimIndent(),
            result = """
                fun main() {
                }
            """.trimIndent(),
        )
    }
}
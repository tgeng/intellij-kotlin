// "Remove 'public' modifier" "true"
class Foo {
    public<caret> private fun bar() { }
}
/* FIR_COMPARISON */
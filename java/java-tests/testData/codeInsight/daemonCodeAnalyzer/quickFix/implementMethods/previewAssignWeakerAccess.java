// "Implement methods" "true-preview"
class B {
    protected void f() {}
}
interface A {
    void f();
}
class D extends B implements A {
    @Override
    public void f() {
        
    }
}
public class ParentClass {
    int parentVar;

    ParentClass(int parentVar) {
        this.parentVar = parentVar;
    }
}
class ChildClass extends ParentClass {
    int childVar;

    ChildClass(int parentVar, int childVar) {
        super(parentVar);
        this.childVar = childVar;
    }
    ChildClass(int childVar) {
        super(0);
        this.childVar = childVar;
    }
}